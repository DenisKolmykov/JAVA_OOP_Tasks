package less_OOP_01.less_oop_task_02_Rectangle;
/*
 * Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). 
Класс должен обладать следующими методами:

Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), 
который возвращает периметр прямоугольника (2 * (ширина + высота)).
 */

public class less_oop_task_02_main {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.setWidth(5.5);
        r1.setHeigth(2.0);

        Rectangle r2 = new Rectangle(3.0);

        Rectangle r3 = new Rectangle(4.0, 6.0);
        
        Rectangle r4 = new Rectangle();

        System.out.print("1. Rectangle: ");
        r1.printRectangle();
        System.out.printf("Square r1 = %.2f\n", r1.calculateArea());
        System.out.printf("Perimetr r1 = %.2f\n\n", r1.calculatePerimeter());
        
        System.out.print("2. Rectangle: ");
        r2.printRectangle();
        System.out.printf("Square r2 = %.2f\n", r2.calculateArea());
        System.out.printf("Perimetr r2 = %.2f\n\n", r2.calculatePerimeter());
        
        System.out.print("3. Rectangle: ");
        r3.printRectangle();
        System.out.printf("Square r3 = %.2f\n", r3.calculateArea());
        System.out.printf("Perimetr r3 = %.2f\n\n", r3.calculatePerimeter());
        
        System.out.print("4. Rectangle: ");
        r4.printRectangle();
        System.out.printf("Square r4 = %.2f\n", r4.calculateArea());
        System.out.printf("Perimetr r4 = %.2f\n", r4.calculatePerimeter());
    } 
}
