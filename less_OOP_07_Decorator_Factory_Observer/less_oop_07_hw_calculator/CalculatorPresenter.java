package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;


public class CalculatorPresenter {
    private CalculatorViewConsoleInput view;
    //private MathModel model;
    //private MathModelExp1 model;
    //private MathModelExp2 model;
    private MathModelExp3 model;

    public CalculatorPresenter(CalculatorViewConsoleInput view, MathModelExp3 model) {
        this.view = view;
        this.model = model;
    }


    public MyElemForObs performCalculation(Double number) {
        MyElemForObs newElem = new MyElemForObs();
        newElem.setNum1(number);

        boolean p = true;
        model.setResult (number);
        Double num2 = null;
        boolean flag;
        do{
            char operator = view.getInputOperator(model.getAvailbleOper());
            newElem.setOperator(operator);
            flag = true;
            switch (operator) {
                case '+':
                    num2 = view.getInputNumber(p);
                    model.add(num2);
                    break;
                case '-':
                    num2 = view.getInputNumber(p);
                    model.subtract(num2);
                    break;
                case '*':
                    num2 = view.getInputNumber(p);
                    model.multiply(num2);
                    break;
                case '/':
                    num2 = view.getInputNumber(p);
                    model.divide(num2);
                    break;
                case '^':
                    p = false;
                    num2 = view.getInputNumber(p);
                    model.power(num2);
                    p = true;
                    break;
                case '2':
                    model.sqrtRoot();
                    break;
                case '3':
                    model.cbrtRoot();
                    break;                

                default:
                    System.out.println("этот калькулятор не выполняет таких операций\nПовторите ввод");
                    flag = false;
            }
        } while (!flag);
        Double res = model.getResult();
        newElem.setNum2(num2);
        newElem.setRes(res);
        view.displayResult(res);
        return newElem;
    }
}
