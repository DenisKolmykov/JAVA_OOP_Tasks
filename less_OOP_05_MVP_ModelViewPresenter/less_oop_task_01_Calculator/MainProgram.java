package less_OOP_05_MVP_ModelViewPresenter.less_oop_task_01_Calculator;
/*
1 - Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), 
с возможностью выполнения базовых математических операций, таких как сложение, вычитание, 
умножение и деление, работающий с дробными числами.
Доп. Задача (*) Мы также обеспечим обработку возможных ошибок, чтобы предотвратить некорректные операции.
 */

 
public class MainProgram {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        MathModel model = new MathModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);
        
            presenter.performCalculation();
        }
}
