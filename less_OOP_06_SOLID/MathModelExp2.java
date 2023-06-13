package less_OOP_06_SOLID;

public class MathModelExp2 extends MathModelExp1 {
    protected String availableOperations = super.availableOperations + ", ^";
    
    public void pow(Double number) {
        Double res = result;
        for (int i = 1; i < number; i++)
        result = result * res;
    }

    public String getAvailbleOper() {
        return this.availableOperations;
    }
}
