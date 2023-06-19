package less_OOP_07_Decorator_Factory_Observer;
/*Паттерн Декоратор (Decorator) является структурным паттерном проектирования в Java. 
Он позволяет добавлять новую функциональность объектам, не изменяя их основного класса и 
не используя наследование. 
Вместо этого, он использует композицию, где объекты оборачиваются в декораторы, 
которые добавляют дополнительное поведение.

Основная идея паттерна Декоратор состоит в создании класса-декоратора, 
который оборачивает исходный объект и расширяет его функциональность, 
добавляя новые методы или изменяя поведение существующих методов. 
При этом интерфейс декоратора должен быть совместим с интерфейсом декорируемого объекта, 
чтобы клиентский код мог работать с ними одинаково.
*/

// Интерфейс компонента
interface Component {
    void operation();
}

// Конкретный компонент
class ConcreteComponent implements Component {
    public void operation() {
        System.out.println("Выполнение операции в конкретном компоненте.");
    }
}

// Абстрактный класс декоратора
abstract class Decorator implements Component {
    protected Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }
    
    public void operation() {
        component.operation();
    }
}

// Конкретные декораторы
class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    
    public void operation() {
        super.operation();
        additionalOperationA();
    }
    
    private void additionalOperationA() {
        System.out.println("Выполнение дополнительной операции A.");
    }
}

class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    
    public void operation() {
        super.operation();
        additionalOperationB();
    }
    
    private void additionalOperationB() {
        System.out.println("Выполнение дополнительной операции B.");
    }
}

// Пример использования
public class less_oop_07_seminar_decorator {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        
        System.out.println();
        
        Component decoratedComponentA = new ConcreteDecoratorA(component);
        decoratedComponentA.operation();
        
        System.out.println();
        
        Component decoratedComponentB = new ConcreteDecoratorB(decoratedComponentA);
        decoratedComponentB.operation();
    }
}

