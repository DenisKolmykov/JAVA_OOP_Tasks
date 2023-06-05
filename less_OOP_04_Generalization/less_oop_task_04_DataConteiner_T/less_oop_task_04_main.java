package less_OOP_04_Generalization.less_oop_task_04_DataConteiner_T;

import java.util.Comparator;

/*
 * Задача(по желанию. Режим - Героя): 
Напишите обобщенный класс DataContainer, 
который представляет собой контейнер для хранения и обработки данных. 
Класс должен иметь методы для добавления и получения элементов, 
а также методы для сортировки и вывода элементов.

В этом примере мы создаем обобщенный класс DataContainer, 
который использует массив для хранения элементов типа T. 
Класс имеет методы:
- add для добавления элементов, 
- get для получения элемента по индексу, 
- sort для сортировки элементов с помощью переданного компаратора, и 
- print для вывода элементов на консоль.

В методе main мы создаем объект DataContainer для хранения строк. 
Мы добавляем несколько строк, выводим их на консоль с помощью метода print, 
затем сортируем элементы в обратном порядке с помощью лямбда-выражения в методе sort и 
снова выводим отсортированные элементы на консоль.

Таким образом, обобщенные классы позволяют нам создавать универсальные контейнеры 
для хранения и обработки данных любого типа, обеспечивая безопасность типов и гибкость в использовании.
 */
public class less_oop_task_04_main {
    public static void main(String[] args){
        DataContainer <String> myDC = new DataContainer<String>();
        // заполняем String DataContainer
        myDC.addElem ("Hello");
        myDC.addElem ("World");
        myDC.addElem("!!!");
        myDC.addElem(",",1);
        
        // вывод всего String DataContainer
        myDC.printDC();

        // определяем String Comparator
        Comparator<String> lengthComparator = Comparator.comparing(String::length).reversed();
        // сортируем с учетом компаратора
        myDC.sortDC(lengthComparator);
        System.out.println("Сортированный DataContainer");
        myDC.printDC();

        System.out.println("-------------------------");

        // заполняем Integer DataContainer
        DataContainer <Integer> myDC2 = new DataContainer<Integer>();
        myDC2.addElem (5);
        myDC2.addElem (10);
        myDC2.addElem(3);
        myDC2.addElem(1,1);
        myDC2.printDC();
        
        // определяем Integer Comparator
        Comparator<Integer> intComparator = Integer::compare;
        myDC2.sortDC(intComparator);
        System.out.println("Сортированный DataContainer");
        myDC2.printDC();

        System.out.println("-------------------------");

        // выводим значение String DataContainer по индексу
        int index  = 2;
        System.out.printf("Элемент String DC по индексу %s = %s\n", index, myDC.getValue(2));

        // выводим значение Integer DataContainer по индексу
        index  = 3;
        System.out.printf("Элемент Integer DC по индексу %s = %s\n", index, myDC2.getValue(2));


    }
}
