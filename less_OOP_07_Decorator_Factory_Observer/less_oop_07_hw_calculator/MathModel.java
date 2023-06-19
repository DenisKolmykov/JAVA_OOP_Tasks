package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;

public abstract class MathModel {
    protected Double result;
    protected String availableOperations = "+, -";

    public void add(Double number) {
        result += number;
    }

    public void subtract(Double number) {
        result -= number;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public String getAvailbleOper() {
        return availableOperations;
    }
}

