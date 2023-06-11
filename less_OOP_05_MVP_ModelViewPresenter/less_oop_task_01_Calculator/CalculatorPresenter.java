package less_OOP_05_MVP_ModelViewPresenter.less_oop_task_01_Calculator;

public class CalculatorPresenter {
    private CalculatorView view;
    private MathModel model;

    public CalculatorPresenter(CalculatorView view, MathModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        Double number = view.getInputNumber();
        model.setResult (number);
        number = view.getInputNumber();
        boolean flag;
        do{
            char operator = view.getInputOperator();
            flag = true;
            switch (operator) {
                case '+':
                    model.add(number);
                    break;
                case '-':
                    model.subtract(number);
                    break;
                case '*':
                    model.multiply(number);
                    break;
                case '/':
                    model.divide(number);
                    break;
                default:
                    System.out.println("этот калькулятор не выполняет таких операций\nПовторите ввод");
                    flag = false;
            }
        } while (!flag);
        
        view.displayResult(model.getResult());
    }
}
