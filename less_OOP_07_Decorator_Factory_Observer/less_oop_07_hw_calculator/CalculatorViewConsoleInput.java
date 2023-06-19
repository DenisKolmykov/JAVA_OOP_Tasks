package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;

import java.util.List;
import java.util.Scanner;

public class CalculatorViewConsoleInput implements InnerCalcView<Double,Character>{
    private Scanner scanner;

    public CalculatorViewConsoleInput() {
        this.scanner = new Scanner(System.in);
    }
    @Override
    public Double getInputNumber(boolean p) {
        boolean flag = true;
        Double doubleNum = null;
        while(flag){
            if (p) {
                System.out.print("Введите число: ");
            }
            else {
                System.out.print("Введите степень: ");
            }
            String inpNum = scanner.next();
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
        if (result != null){
            System.out.printf("Результат: %.2f\n",result);
        }
        else {
            System.out.printf("Результат: %f\n",result);
        }
    }

    public Integer mainMenu() {
        System.out.print("1-новое вычисление\n2-продолжить от предыдущего результата\n3-распечатать историю\n0-выход\n-->");
        boolean flag = true;
        Integer myChoice = null;
        while(flag){
            String inpCho = scanner.next();
                try {
                    myChoice = Integer.parseInt(inpCho);
                    flag = false;
                } 
                catch (NumberFormatException | NullPointerException nfe) {
                    System.out.println("Некорректный ввод! повторите");
                }
        }
        return myChoice;
    }

    public void displayHistory(List <MyElemForObs> arrHistory) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("История вычислений:\n");
        for (MyElemForObs el: arrHistory){
            el.printElem();
        }
        System.out.println();
    }
    
}
