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

public class Rectangle {
    private Double width;
    private Double height;

    public Rectangle(Double w, Double h){
        width = w;
        height = h;
    }

    public Rectangle (Double n){
        this(n,n);
    }

    public Rectangle (){
        width = 10.0;
        height = 20.0;
    }

    public void setWidth(Double w) {
        this.width = w;
    }

    public void setHeigth(Double h) {
        this.height = h;
    }

    public Double getWidth() {
        return this.width;
    }

    public Double getHeigth() {
        return this.height;
    }

    public Double calculateArea() {
        return this.width * this.height;
    }

    public Double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public void printRectangle() {
        System.out.println("width= " + this.width + ", heigth= " + this.height);
    }

}
