package less_OOP_03.less_oop_task_02_Interface;

import java.util.ArrayList;

public class Customer {
    private Integer userID = setCustomerID();
    private String name;
    public ArrayList<Goods> purchase = new ArrayList<>();
    
    // static для счетчика ID при каждом новом пользователе
    public static Integer countID;
    static{
        countID = 1;
    }
    public Customer(){
        countID++;
    }
    private Integer setCustomerID() {
        return this.userID = countID;
    }
    //-----------

    public void setCustomerName(String name) {
        this.name = name;
    }
    public String getCustomerName() {
        return this.name;
    }

    public Integer getcustomerID() {
        return this.userID;
    }

    // формирование списка покупок
    public void purchaseGoods(Goods pursh, Integer quantity) {
        if (quantity != 0){
            Goods myGoods = new Goods();
            myGoods.setGoodsName(pursh.getGoodsName());
            myGoods.setPrice(pursh.getPrice());
            myGoods.setQuantity(quantity);
            this.purchase.add(myGoods);
        }
    }

    public void printPurchaseGoods() {
        System.out.printf("\n#%03d %s покупки:\n",this.userID, this.name);
        Double sum = 0.0;
        for (Goods myGoods : this.purchase){
            myGoods.printGoods();
            sum += myGoods.getPrice() * myGoods.getQuantity();
        }
        System.out.printf("Всего товаров на сумму: %.2f\n", sum);
        System.out.println("------------------");
    }

    private String getInfo() {
        return String.format("Покупатель #%03d Имя: %s", userID, name);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
