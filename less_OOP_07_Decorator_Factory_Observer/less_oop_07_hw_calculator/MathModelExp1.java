package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;

public class MathModelExp1 extends MathModel {
    protected String availableOperations = super.availableOperations + ", *, /";
    
    public void multiply(Double number) {
        result *= number;
    }

    public void divide(Double number) {
        if (number != 0) {
            result /= number;
        } else {
            result = null;
            System.out.println("!Деление на ноль невозможно!");
        }
    }

    public String getAvailbleOper() {
        return this.availableOperations;
    }

}
