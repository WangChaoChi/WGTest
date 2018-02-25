package wg.com.shopping.entity;

/**
 * @author wangcc
 * @decription: 购买商品实体
 * @date 2018/2/23 15:00
 */
public class Commodity {

    private int number;//购买数量

    private String name;//名称

    private double price;//价格

    //商品类型编码（1：电子 2：食品 3：日用品 4：酒类）
    private int type;

    public Commodity() {
    }

    public Commodity(int number, String name, double price, int type) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
