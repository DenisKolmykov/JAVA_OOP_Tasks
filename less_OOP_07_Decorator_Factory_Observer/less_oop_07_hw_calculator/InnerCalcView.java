package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;

public interface InnerCalcView<T,E> {
    T getInputNumber(boolean p); // метод ввода числа
    E getInputOperator(String availableOperations); //  метод ввода математического оператора из доступных
    void displayResult(T result); // метод вывода результата
}
