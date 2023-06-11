package less_OOP_05_MVP_ModelViewPresenter.less_oop_task_01_Calculator;

public class MathModel {
    private Double result;

    public void add(Double number) {
        result += number;
    }

    public void subtract(Double number) {
        result -= number;
    }

    public void multiply(Double number) {
        result *= number;
    }

    public void divide(Double number) {
        if (number != 0) {
            result /= number;
        } else {
            //flag = false;
            result = null;
            System.out.println("!Деление на ноль невозможно!");
            //throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}

