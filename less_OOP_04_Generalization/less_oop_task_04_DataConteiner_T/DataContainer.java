package less_OOP_04_Generalization.less_oop_task_04_DataConteiner_T;
/*
 * Напишите обобщенный класс DataContainer, 
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
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DataContainer <T>{

    public ArrayList <T> myArr = new ArrayList<T>();

    public DataContainer (ArrayList <T> arr){
        this.myArr = arr;
    }
    public DataContainer (){
    }

    public void addElem(T elem, int index ) {
        if (myArr.size() == 0){
            index = 0;
        }
        if (index < 0 || index > this.myArr.size()-1){
            index = this.myArr.size();
        }
        this.myArr.add(index, elem);
    }
    public void addElem(T elem){
        this.addElem (elem, this.myArr.size());
    }

    public T getValue(int index) {
        T res = null;
        if(index < 0 || index > this.myArr.size() - 1){
            return res;
        }
        
        return this.myArr.get(index);
    }

    public void printDC() {
        System.out.print("[ ");
        for (T el : this.myArr){
            System.out.print(el + " ");
        }
        System.out.println("]");
    }

    public ArrayList<T> sortDC (Comparator<T> comparator){
        I_Function<T> sortObjects = (arr, comp) -> {
            ArrayList<T> sortArr = new ArrayList<T>(arr);
            Collections.sort(arr, comp);
            return sortArr;
        };
        return (sortObjects.func(this.myArr, comparator));
    }
}
