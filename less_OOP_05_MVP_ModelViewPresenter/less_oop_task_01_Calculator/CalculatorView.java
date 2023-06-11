package less_OOP_05_MVP_ModelViewPresenter.less_oop_task_01_Calculator;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

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

    public char getInputOperator() {
        System.out.print("Введите математическую операцию (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void displayResult(Double result) {
        System.out.println("Результат: " + result);
    }
}
