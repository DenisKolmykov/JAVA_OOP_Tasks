package less_OOP_06_SOLID;
/*
1 - Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), 
с возможностью выполнения базовых математических операций, таких как сложение, вычитание, 
умножение и деление, работающий с дробными числами.
Доп. Задача (*) Мы также обеспечим обработку возможных ошибок, чтобы предотвратить некорректные операции.
 */

 
public class MainProgram {
    public static void main(String[] args) {
        CalculatorViewConsoleInput view = new CalculatorViewConsoleInput();
        //MathModel model = new MathModel();
        //MathModelExp1 model = new MathModelExp1();
        MathModelExp2 model = new MathModelExp2();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);
        
            presenter.performCalculation();
        }
}
