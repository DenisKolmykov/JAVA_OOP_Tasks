package less_OOP_07_Decorator_Factory_Observer;
/*
 * адаптер преобразует интерфейс одного класса - в интефейс другого
 */


// Интерфейс, который необходимо адаптировать
interface Target {
    void request();
}

// Адаптируемый класс
class Adaptee {
    public void specificRequest() {
        System.out.println("Выполнение специфического запроса.");
    }
}

// Адаптер
class Adapter implements Target {
    private Adaptee adaptee;
    
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    public void request() {
        adaptee.specificRequest();
    }
}

// Пример использования
public class less_oop_07_seminar_adapter1 {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        
        adapter.request();
    }
}