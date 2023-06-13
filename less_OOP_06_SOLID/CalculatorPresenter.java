package less_OOP_06_SOLID;

public class CalculatorPresenter {
    private CalculatorViewConsoleInput view;
    //private MathModel model;
    //private MathModelExp1 model;
    private MathModelExp2 model;

    public CalculatorPresenter(CalculatorViewConsoleInput view, MathModelExp2 model) {
        this.view = view;
        this.model = model;
    }


    public void performCalculation() {
        Double number = view.getInputNumber();
        model.setResult (number);
        number = view.getInputNumber();
        boolean flag;
        do{
            char operator = view.getInputOperator(model.getAvailbleOper());
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
                case '^':
                    model.pow(number);
                    break;
                default:
                    System.out.println("этот калькулятор не выполняет таких операций\nПовторите ввод");
                    flag = false;
            }
        } while (!flag);
        
        view.displayResult(model.getResult());
    }
}
