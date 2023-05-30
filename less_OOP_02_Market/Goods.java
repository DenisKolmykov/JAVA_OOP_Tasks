package less_OOP_02_Market;

import java.util.Random;

public class Goods {
    Random rd = new Random();
    private Integer goodID = setGoodsID();
    private String name;
    private Double price ;
    private Integer quantity = rd.nextInt(100);


    // static для счетчика ID при каждом новом товаре
    public static Integer countID;
    static{
        countID = 1;
    }
    public Goods(){
        countID++;
    }
    private Integer setGoodsID() {
        return this.goodID = countID;
    }
    //-----------

    public Integer getGoodsID() {
        return this.goodID;
    }

    public void setGoodsName(String n) {
        this.name = n;
    }
    public String getGoodsName() {
        return this.name;
    }

    public void setPrice(Double p) {
        this.price = p;
    }
    public Double getPrice() {
        return this.price;
    }

    public void setQuantity(Integer q) {
        this.quantity = q;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    private String getInfo() {
        return String.format("Товар #%3d %18s %8.2f руб./шт.  Количество = %3d ед.", goodID, name, price, quantity);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public void printGoods() {
        System.out.println(String.format("Покупка #%3d %18s %8.2f руб./шт.  Количество = %3d ед.", goodID, name, price, quantity));
    
    }
}
