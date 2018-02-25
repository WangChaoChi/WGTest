package wg.com.shopping.entity;

import java.util.Date;

/**
 * @author wangcc
 * @decription: //优惠券实体
 * @date 2018/2/23 15:05
 */
public class Coupon {

    private Date endDate;//到期时间

    private double minCash;//最低消费金额

    private double returnCash;//返现金额

    public Coupon() {
    }

    public Coupon(Date endDate, double minCash, double returnCash) {
        this.endDate = endDate;
        this.minCash = minCash;
        this.returnCash = returnCash;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getMinCash() {
        return minCash;
    }

    public void setMinCash(double minCash) {
        this.minCash = minCash;
    }

    public double getReturnCash() {
        return returnCash;
    }

    public void setReturnCash(double returnCash) {
        this.returnCash = returnCash;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "endDate=" + endDate +
                ", minCash=" + minCash +
                ", returnCash=" + returnCash +
                '}';
    }
}
