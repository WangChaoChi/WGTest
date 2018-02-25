package wg.com.shopping.entity;

import java.util.Date;

/**
 * @author wangcc
 * @decription: 促销活动实体
 * @date 2018/2/23 14:50
 */
public class Promotion {

    //商品类型编码（1：电子 2：食品 3：日用品 4：酒类）
    private int type;

    private Date endDate;//促销活动结束日期

    private double discount;//折扣率

    public Promotion() {
    }

    public Promotion(int type, Date endDate, double discount) {
        this.type = type;
        this.endDate = endDate;
        this.discount = discount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "type=" + type +
                ", endDate=" + endDate +
                ", discount=" + discount +
                '}';
    }
}
