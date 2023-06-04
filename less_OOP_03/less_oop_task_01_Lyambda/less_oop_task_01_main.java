package less_OOP_03.less_oop_task_01_Lyambda;
/*
 * Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
1 - В предыдущем ДЗ добавить реализацию собственного функционально интерфейса.

в задаче №2 к ДЗ №1 (класс прямоугольник) - добавлены (в сравнении с ранее реализованным решением):
 интерфейс I_GetNum и в пользовательском коде реализованы лямбда выражения для расчета 
 параметров прямоугольника
 */

import java.util.ArrayList;

public class less_oop_task_01_main implements I_Const {
    public static void main(String[] args){
        ArrayList <Rectangle> myRectanglesList = new ArrayList<>();
        Rectangle r1 = new Rectangle();
        r1.setWidth(5.5);
        r1.setHeigth(2.0);
        myRectanglesList.add(r1);

        Rectangle r2 = new Rectangle(3.0);
        myRectanglesList.add(r2);

        Rectangle r3 = new Rectangle(4.0, 6.0);
        myRectanglesList.add(r3);
        
        Rectangle r4 = new Rectangle();
        myRectanglesList.add(r4);
        
        Rectangle r5 = new Rectangle(MIN, MAX);
        myRectanglesList.add(r5);

        
        int i = 1; // счетчик
        for (Rectangle r : myRectanglesList){
            I_GetNum getNum1;
            System.out.printf("%d. Rectangle: ", i);
            r.printRectangle();
            getNum1 = (w, h) -> (w * h);
            System.out.printf("Square r%d = %.2f(from Class); %.2f(from Lyambda)\n", i, r.calculateArea(), getNum1.getNum(r.getWidth(),r.getHeigth()));
            
            getNum1 = (w, h) -> (2 * (w + h));
            System.out.printf("Perimetr r%d = %.2f(from Class); %.2f(from Lyambda)\n", i, r.calculatePerimeter(), getNum1.getNum(r.getWidth(),r.getHeigth()));
            
            getNum1 = (w, h) -> (Math.sqrt(Math.pow(w,2) + Math.pow(h,2)));
            System.out.printf("Main Diagonal r%d = %.2f(from Class); %.2f(from Lyambda)\n",i, r.calculateDiagonal(0), getNum1.getNum(r.getWidth(),r.getHeigth()));
            
            getNum1 = (w, h) -> Math.pow(Math.sqrt(Math.pow(w/2,2) + Math.pow(h/2,2)),2);
            System.out.printf("Inside ROMB Squre r%d = %.2f(from Class); %.2f(from Lyambda)\n",i, r.calculateAriaInsideRomb(), getNum1.getNum(r.getWidth(),r.getHeigth()));
            
            getNum1 = (w, h) -> 4*(Math.sqrt(Math.pow(w/2,2) + Math.pow(h/2,2)));
            System.out.printf("Inside ROMB Perimetr r%d = %.2f(from Class); %.2f(from Lyambda)\n",i, r.calculatePerimetrInsideRomb(), getNum1.getNum(r.getWidth(),r.getHeigth()));
            System.out.println();
            i++;
        }
        
    } 
}
