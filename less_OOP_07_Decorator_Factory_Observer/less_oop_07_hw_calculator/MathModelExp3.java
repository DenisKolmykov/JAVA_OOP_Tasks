package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;

public class MathModelExp3 extends MathModelExp2 {
    protected String availableOperations = super.availableOperations + ", 2-квадратный корень, 3-кубический корень";

    public void sqrtRoot() {
        result = Math.sqrt(result);
    }

    public void cbrtRoot() {
        result = Math.cbrt(result);
    }

    public String getAvailbleOper() {
        return this.availableOperations;
    }
}
