package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;

public class MathModelExp2 extends MathModelExp1 {
    protected String availableOperations = super.availableOperations + ", ^";
    
    public void power(Double number) {
        Double res = result;
        for (int i = 1; i < number; i++)
        result = result * res;
    }

    public String getAvailbleOper() {
        return this.availableOperations;
    }
}
