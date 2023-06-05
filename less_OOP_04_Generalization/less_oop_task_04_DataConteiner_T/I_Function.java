package less_OOP_04_Generalization.less_oop_task_04_DataConteiner_T;

import java.util.ArrayList;
import java.util.Comparator;


public interface I_Function<T> {
    ArrayList<T> func(ArrayList<T> arr, Comparator<T> comparator);
}
