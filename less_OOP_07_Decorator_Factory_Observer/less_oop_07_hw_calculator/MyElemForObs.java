package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;

import java.util.Date;

public class MyElemForObs {
    private Double num1;
    private Double num2;
    private Character operator;
    private Double res;
    private Date date;
    private Integer index;

    public void setNum1 (Double n1){
        this.num1 = n1;
    }
    public Double getNum1 (){
        return this.num1;
    }

    public void setNum2 (Double n2){
        this.num2 = n2;
    }
    public Double getNum2 (){
        return this.num2;
    }

    public void setOperator (Character o){
        this.operator = o;
    }
    public Character getOperator (){
        return this.operator;
    }

    public void setRes (Double r){
        this.res = r;
    }
    public Double getRes(){
        return this.res;
    }

    public void setDate (Date d){
        this.date = d;
    }
    public Date getDate(){
        return this.date;
    }

    public void setIndx (Integer indx){
        this.index = indx;
    }
    public Integer getIndx (){
        return this.index;
    }


    public void printElem() {
        System.out.printf("%s: (%d) %.2f %s %.2f = %.2f\n", this.date, this.index, this.num1, this.operator, this.num2, this.res);
    }
}
