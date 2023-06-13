package less_OOP_06_SOLID;

public class CalculatorViewDataInput implements InnerCalcView<Double, Character>{
    private String data = "5 + 2 - 3 * 4 + 5 ^ 2";
    String [] dataArr = data.split(" ");

    @Override
    public Double getInputNumber() {
        // логика "выделения" числа из строки
        throw new UnsupportedOperationException("Unimplemented method 'getInputNumber'");
    }

    @Override
    public Character getInputOperator(String availableOperations) {
        // логика "выделения" оператора из строки
        throw new UnsupportedOperationException("Unimplemented method 'getInputOperator'");
    }

    @Override
    public void displayResult(Double result) {
        System.out.println("Результат: " + result);
    }
    
}
