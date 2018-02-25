package wg.com.shopping.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import wg.com.shopping.dto.Result;
import wg.com.shopping.entity.Commodity;
import wg.com.shopping.entity.Coupon;
import wg.com.shopping.entity.Promotion;
import wg.com.shopping.util.AccountUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

/**
 * @author wangcc
 * @decription:
 * @date 2018/2/24 10:23
 */
public class AccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //针对post请求，设置允许接收中文
            req.setCharacterEncoding("UTF-8");
            //设置可以在页面中响应的内容类型及中文
            resp.setContentType("text/html;charset=UTF-8");
            String formData = getRequestPayload(req);
            if (formData == null || formData.trim().equals("")) {
                req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
            }
            JSONObject jsonObject = JSON.parseObject(formData);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


            List<Commodity> commodites = new ArrayList<>();
            JSONArray commoditeJA = jsonObject.getJSONArray("commodites");
            for (int i = 0; i <commoditeJA.size() ; i++) {
                JSONObject commoditeJson = commoditeJA.getJSONObject(i);
                Commodity commodity = new Commodity(commoditeJson.getInteger("number"),
                        commoditeJson.getString("name"),
                        commoditeJson.getDouble("price"),
                        commoditeJson.getInteger("type"));
                commodites.add(commodity);
            }
            commodites.stream().forEachOrdered(System.out::println);



            List<Promotion> promotions = new ArrayList<>();
            JSONArray promotionJA = jsonObject.getJSONArray("promotions");
            for (int i = 0; i <promotionJA.size() ; i++) {
                JSONObject promotionJson = promotionJA.getJSONObject(i);
                Promotion promotion = null;
                if (promotionJson.getString("endDate")!=null) {
                    promotion = new Promotion(promotionJson.getInteger("type"),
                            sdf.parse(promotionJson.getString("endDate")),
                            promotionJson.getDouble("discount"));
                }
                promotions.add(promotion);
            }
            promotions.stream().forEachOrdered(System.out::println);

            JSONObject couponJO = jsonObject.getJSONObject("coupon");
            Coupon coupon = null;
            if (couponJO.getString("endDate")!=null) {
                coupon = coupon = new Coupon(sdf.parse(couponJO.getString("endDate")),
                        couponJO.getDouble("minCash"),
                        couponJO.getDouble("returnCash"));
            }
            System.out.println(promotions);
            System.out.println(coupon);
            String result = AccountUtil.account(commodites, promotions, coupon);
            resp.getWriter().print(JSON.toJSONString(new Result(1,result)));
        } catch (ParseException e) {
            e.printStackTrace();
            resp.getWriter().print(JSON.toJSONString(new Result(0,"请输入正确的日期格式")));
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().print(JSON.toJSONString(new Result(0,"系统内部错误")));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private String getRequestPayload(HttpServletRequest req) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = req.getReader()) {
            char[] buff = new char[1024];
            int len;
            while ((len = reader.read(buff)) != -1) {
                sb.append(buff, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
