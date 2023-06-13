package less_OOP_06_SOLID;

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
