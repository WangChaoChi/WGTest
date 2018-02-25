package wg.com.shopping.util;

import wg.com.shopping.entity.Commodity;
import wg.com.shopping.entity.Coupon;
import wg.com.shopping.entity.Promotion;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/**
 * @author wangcc
 * @decription: 结算工具实体类
 * @date 2018/2/23 15:32
 */
public class AccountUtil {

    /**
     * 计算结算金额
     *
     * @param commodities 购买的商品集合
     * @param promotions  促销活动集合
     * @param coupon      优惠券实体
     * @return 结算金额
     */
    public static String account(List<Commodity> commodities, List<Promotion> promotions, Coupon coupon) throws Exception {
        //此集合中放入各个类型商品的总价
            Map<Integer, Double> typeCount = new HashMap<>();
            if (commodities != null && commodities.size() > 0) {
                for (Commodity commodity : commodities) {
                    //计算每个商品的总价,
                    Double totalPrice = commodity.getNumber() * commodity.getPrice();
                    if (typeCount.containsKey(commodity.getType())) {
                        //若为同一类则总价相加
                        typeCount.put(commodity.getType(), typeCount.get(commodity.getType()) + totalPrice);
                    } else {
                        typeCount.put(commodity.getType(), totalPrice);
                    }
                }
            }

            if (promotions != null && promotions.size() > 0) {
                for (Promotion promotion : promotions) {
                    //判断促销活动是否过期
                    if (promotion.getEndDate().getTime() > new Date().getTime()) {
                        //通过类型匹配促销类型，把typeCount中的值改为促销后的价
                        if (typeCount.containsKey(promotion.getType())) {
                            //计算促销折扣后价
                            Double discountPrice = typeCount.get(promotion.getType()) * promotion.getDiscount();
                            typeCount.put(promotion.getType(), discountPrice);
                        }
                    }

                }
            }

            Collection<Double> accounts = typeCount.values();

            //得到总金额
            Double account = accounts.stream().mapToDouble(Double::valueOf).sum();
            //满足使用优惠券要求
            if (coupon != null && coupon.getEndDate().getTime() > new Date().getTime() && coupon.getMinCash() < account) {
                account -= coupon.getReturnCash();
            }
            //保留两位小数
            DecimalFormat df = new DecimalFormat("#.00");
            return df.format(account);
    }

}
