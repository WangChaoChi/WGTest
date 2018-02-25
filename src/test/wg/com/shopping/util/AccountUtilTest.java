package wg.com.shopping.util;

import org.junit.Test;
import wg.com.shopping.entity.Commodity;
import wg.com.shopping.entity.Coupon;
import wg.com.shopping.entity.Promotion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author wangcc
 * @decription: 测试
 * @date 2018/2/23 21:28
 */
public class AccountUtilTest {

    /**====== Case A =======
     * @throws Exception
     */
    @Test
    public void caseA() throws Exception {
        List<Commodity> commodities = new ArrayList<>();
        commodities.add(new Commodity(1, "ipad", 2399.00, 1));
        commodities.add(new Commodity(1, "显⽰器", 1799.00, 1));
        commodities.add(new Commodity(12, "啤酒", 25.00, 2));
        commodities.add(new Commodity(5, " ⾯包", 9.00, 2));
        List<Promotion> promotions = new ArrayList<>();

        Calendar endTime = Calendar.getInstance();
        endTime.set(2018, 3, 8);
        ;
        promotions.add(new Promotion(1, endTime.getTime(), 0.7));

        Coupon coupon = new Coupon(endTime.getTime(), 1000, 200);

        String result = AccountUtil.account(commodities, promotions, coupon);
        System.out.println("结算价格为：" + result);
    }

    /**====== Case B =======
     * @throws Exception
     */
    @Test
    public void caseB() throws Exception {
        List<Commodity> commodities = new ArrayList<>();
        commodities.add(new Commodity(3, " 蔬菜", 5.98, 2));
        commodities.add(new Commodity(8, "餐⼱纸", 3.20, 3));
        String result = AccountUtil.account(commodities, null, null);
        System.out.println("结算价格为：" + result);
    }
}