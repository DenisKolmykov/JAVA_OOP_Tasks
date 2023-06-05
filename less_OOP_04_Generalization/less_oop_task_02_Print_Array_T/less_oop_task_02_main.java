package less_OOP_04_Generalization.less_oop_task_02_Print_Array_T;
/*
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и 
выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. 
Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.

В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. 
В результате мы получаем вывод на консоль элементов каждого массива.

Таким образом, обобщенные методы позволяют нам создавать код, 
который может работать с разными типами данных, обеспечивая повторное использование и гибкость.

Полезные материалы
https://metanit.com/java/tutorial/3.11.php
 */


public class less_oop_task_02_main {
    
    static <T> void printArray(T [] arr) {
        System.out.print("[ ");
        for (T elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println("]");
    }


    public static void main(String[] args){
        Integer [] intArr = {3, 465, 23, 78, 22, 98, 3, 456, 7, 12, 578, 9};
        String [] strArr = {"привет", "Василий", "как дела", "алфавит", "программирование", "это", "интересно"};
    
        printArray (intArr);
        printArray (strArr);
    }
}
