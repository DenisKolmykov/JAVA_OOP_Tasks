package less_OOP_03.less_oop_task_03_Compare_Objects;
/*
3(* по желанию) - Задача: 
Написать функцию, которая принимает список объектов и компаратор для сортировки объектов 
по заданному критерию. 
Функция должна возвращать отсортированный список объектов.
В этом примере мы создаем функцию sortObjects, которая принимает список объектов objects 
и компаратор comparator для сортировки объектов. 
Внутри функции мы создаем новый список sortedObjects с копией исходного списка, чтобы не изменять его. 
Затем мы используем метод Collections.sort() для сортировки sortedObjects 
с использованием переданного компаратора.

В методе main мы создаем список строк strings и определяем компаратор lengthComparator, 
который сравнивает строки по их длине в порядке убывания. 
Затем мы вызываем функцию sortObjects с переданным списком строк и компаратором, 
и выводим отсортированный список строк.

Таким образом, использование компараторов позволяет нам определить специфическое условие 
сортировки объектов, и функция sortObjects позволяет сортировать список объектов 
с использованием этого компаратора. Это делает код более гибким и позволяет легко 
изменять условия сортировки
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class less_oop_task_03_main {

    public static ArrayList<String> createStringList(int x, int lenMax) {
        ArrayList<String> myStringList = new ArrayList<>();

        Random rd = new Random();
        for (int i = 0; i < x; i++) {
            int l = rd.nextInt(1, lenMax + 1); // рандомно определяем длину строки
            StringBuilder sb = new StringBuilder();
            char ch;
            for (int j = 0; j < l; j++) { // формируем строку из рандомных символов // 65-90, 97-122
                int diapazon = rd.nextInt(2);
                if (diapazon == 0) { // 0 - диапазон кодов ЗАГЛАВНЫХ англ. букв
                    ch = (char) rd.nextInt(65, 91);
                } else { // 1 - диапазон кодов строчных англ. букв
                    ch = (char) rd.nextInt(97, 123);
                }
                sb.append(ch); // собираем символы в строку
            }
            myStringList.add(sb.toString()); // собираем список строк
        }
        return myStringList;
    }

    public static void printList(ArrayList<String> list) {
        int lenMax = 25;
        System.out.println("-".repeat(lenMax + 12));
        int i = 1;
        for (String s : list) {
            System.out.printf("%3d. %-25s - %2d\n", i, s, s.length());
            i++;
        }
        System.out.println("-".repeat(lenMax + 12));
    }

    public static ArrayList<String> sortObjects(ArrayList<String> objects, Comparator<String> comparator) {
        ArrayList<String> sortMyObjects = new ArrayList<>(objects);
        Collections.sort(sortMyObjects, comparator);
        return sortMyObjects;
    }

    public static void main(String[] args) {

        Integer x = 10; // количество элементов в списке
        int lenMax = 25; // задаем мах возможную длину строки для рандомного формирования

        ArrayList<String> myStringList = createStringList(x, lenMax);
        System.out.println("Базовый список строк: ");
        printList(myStringList);

        Comparator<String> lengthComparator = Comparator.comparing(String::length).reversed();

        I_Function sortObjects2 = (objects, comparator) -> {
            ArrayList<String> sortMyObjects2 = new ArrayList<>(objects);
            Collections.sort(sortMyObjects2, comparator);
            return sortMyObjects2;
        };

        System.out.println();
        System.out.println("--реализация сортировки через метод--");
        printList(sortObjects(myStringList, lengthComparator));
        System.out.println("-реализация сортировки через функцию-");
        printList(sortObjects2.func(myStringList, lengthComparator));
    }
}
