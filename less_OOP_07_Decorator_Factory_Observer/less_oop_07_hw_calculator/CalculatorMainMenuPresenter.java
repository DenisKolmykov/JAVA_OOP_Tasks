package less_OOP_07_Decorator_Factory_Observer.less_oop_07_hw_calculator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalculatorMainMenuPresenter {
    //private CalculatorViewConsoleInput view;
    private CalculatorViewConsoleInput view = new CalculatorViewConsoleInput();
    private MathModelExp3 model = new MathModelExp3();

    public CalculatorMainMenuPresenter(CalculatorViewConsoleInput view) {
        this.view = view;
    }

    public void mainMenu() {
        List <MyElemForObs> elementsForObserve = new ArrayList<>();

        CalculatorPresenter presenter = new CalculatorPresenter(view, model);
        boolean flag = true;
        boolean p = true;

        Double result = 0.0;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        while (flag){
            Integer choice = view.mainMenu();
            MyElemForObs myElem = new MyElemForObs();

            switch (choice) {
                case (1):
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Double number = view.getInputNumber(p);
                    myElem = presenter.performCalculation(number);
                    System.out.println();
                    result = myElem.getRes();
                    myElem.setDate(new Date());
                    myElem.setIndx(1);
                    elementsForObserve.add(myElem);
                    break;

                case (2):
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    if (result != null){
                        System.out.printf("\nпредыдущий результат = %.2f\n", result);
                    }
                    else {
                        System.out.println("\nпредыдущий результат = null");
                        System.out.println();
                        break;
                    }
                    myElem  = presenter.performCalculation(result);
                    System.out.println();
                    result = myElem.getRes();
                    myElem.setDate(new Date());
                    myElem.setIndx(2);
                    elementsForObserve.add(myElem);
                    break;
                
                case (3):
                    view.displayHistory(elementsForObserve);
                    break;

                case (0):
                    System.out.println("Сеанс завершен");
                    flag = false;
                    break;
                default:
                    System.out.println("! Некорретная команда\nПовторите ввод");

            }
        }
    }

}
