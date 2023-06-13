package less_OOP_06_SOLID;

import java.util.Scanner;

public class CalculatorViewConsoleInput implements InnerCalcView<Double,Character>{
    private Scanner scanner;

    public CalculatorViewConsoleInput() {
        this.scanner = new Scanner(System.in);
    }
    @Override
    public Double getInputNumber() {
        boolean flag = true;
        Double doubleNum = null;
        while(flag){
            System.out.print("Введите число: ");
            String inpNum = scanner.nextLine();
            try {
                doubleNum = Double.parseDouble(inpNum);
                flag = false;
            } 
            catch (NumberFormatException | NullPointerException nfe) {
                System.out.println("Вы ввели не число! повторите ввод");
            }
        }
        return doubleNum;
    }

    @Override
    public Character getInputOperator(String availableOperations) {
        System.out.printf("Введите математическую операцию (%s): ", availableOperations);
        return scanner.next().charAt(0);
    }

    @Override
    public void displayResult(Double result) {
        System.out.println("Результат: " + result);
    }
    
}
