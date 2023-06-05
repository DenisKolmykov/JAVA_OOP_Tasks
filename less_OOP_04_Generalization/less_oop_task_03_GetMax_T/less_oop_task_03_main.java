package less_OOP_04_Generalization.less_oop_task_03_GetMax_T;
/*
 * Задача 3 (по желанию):
Напишите обобщенную функцию getMax, которая принимает два параметра типа T и 
возвращает максимальное значение из них.

В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, 
ограниченных интерфейсом Comparable. 
Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.

В методе main мы вызываем getMax с разными типами данных: целое число (Integer), 
число с плавающей запятой (Double) и строку (String). 
В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.

Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, 
сохраняя при этом безопасность типов.


 */
public class less_oop_task_03_main {

    static <T extends Comparable<T>> void getMax (T el1, T el2){
        int result = el1.compareTo(el2);
        //System.out.println(result);
        System.out.printf("В сравнении '%s' и '%s': ",el1, el2);
        if (result < 0){
            System.out.printf("MAX = '%s'",el2);
        }
        else if (result > 0) {
            System.out.printf("MAX = '%s'", el1);
        }
        else System.out.print("элементы равны друг другу");
        
        System.out.println();
    }

    public static void main(String[] args){
        Integer a = 9;
        Integer b = 10;
        getMax (a, b);
        getMax (b, a);
        getMax (b, b);
        System.out.println();

        Double x = 11.5;
        Double y = 11.6;
        getMax (x, y);
        getMax (y, x);
        getMax (y, y);
        System.out.println();

        String s1 = "Hi an everybody";
        String s2 = "Hi an everybody yo!";
        getMax (s1, s2);
        getMax (s2, s1);
        getMax (s1, s1);
    }
}
