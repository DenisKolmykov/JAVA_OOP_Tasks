package less_OOP_06_SOLID;

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

