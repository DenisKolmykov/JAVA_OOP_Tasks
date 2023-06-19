package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;
/*
// 1 - Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), 
// с возможностью выполнения базовых математических операций, таких как сложение, вычитание, 
// умножение и деление, работающий с дробными числами.
// Доп. Задача (*) Мы также обеспечим обработку возможных ошибок, чтобы предотвратить некорректные операции.

Урок 7. ООП Дизайн и Solid ч.2
Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.
Можно выбрать другой язык программирования, например C# или Python.
Доп. задания
- новый метод get_history() в класс CalculatorModel, который возвращает список операций, 
сохраненных в истории. 
Представление (CalculatorView) теперь также имеет метод display_history(), 
который отображает историю ввода.
- добавить две новые функции в модель 
square_root - вычисление квадратного корня и 
power - возведение в степень). 
Представление (CalculatorView) теперь запрашивает второе число, 
если оператор является sqrt или pow. 
Презентер (CalculatorPresenter) обрабатывает эти новые операции и 
вызывает соответствующие методы модели.
 */

 
public class MainProgram {
    public static void main(String[] args) {
        CalculatorViewConsoleInput view = new CalculatorViewConsoleInput();
        //MathModel model = new MathModel();
        //MathModelExp1 model = new MathModelExp1();
        //MathModelExp2 model = new MathModelExp2();
        // MathModelExp3 model = new MathModelExp3();
        // CalculatorPresenter presenter = new CalculatorPresenter(view, model);
        // presenter.performCalculation();

        CalculatorMainMenuPresenter menuPresenter = new CalculatorMainMenuPresenter(view);
        menuPresenter.mainMenu();
        }
}
