package less_OOP_04_Generalization.less_oop_task_01_Print_Element_T;
/*
 * Урок 4. ООП: Обобщения. ч1
Задача 1 : Напишите обобщенный метод printElement, который принимает один параметр типа T и 
выводит его на консоль.

В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T. 
Мы просто выводим этот элемент на консоль с помощью метода System.out.println().

В методе main мы вызываем printElement с различными типами данных: целое число (Integer), 
строку (String) и число с плавающей запятой (Double). 
Компилятор автоматически выводит тип параметра T на основе переданных аргументов.

Таким образом, обобщенные методы позволяют нам писать код, 
который может работать с различными типами данных, обеспечивая простоту и гибкость использования.
 */


public class less_oop_task_01_main {

    static <T> void printElement (T el){
        System.out.println("Элемент '" + el + "' имеет тип: '" + el.getClass().getName() + "'");
    }

    
    public static void main(String[] args){
        Integer element1 = 5;
        Double element2 = 15.6;
        String element3 = "Hello World";

        printElement(element1);
        printElement(element2);
        printElement(element3);
    }
}
