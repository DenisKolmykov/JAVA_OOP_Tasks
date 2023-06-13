package less_OOP_06_SOLID;

public interface InnerCalcView<T,E> {
    T getInputNumber(); // метод ввода числа
    E getInputOperator(String availableOperations); //  метод ввода математического оператора из доступных
    void displayResult(T result); // метод вывода результата
}
