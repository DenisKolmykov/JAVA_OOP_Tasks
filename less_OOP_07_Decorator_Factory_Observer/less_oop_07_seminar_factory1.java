package less_OOP_07_Decorator_Factory_Observer;
/*
Паттерн Фабричный метод (Factory Method) является порождающим паттерном проектирования в Java. 
Он позволяет динамически создавать объекты, реализующие общий интерфейс или абстрактный класс, 
из семейства классов без явного указания конкретного класса.

Основная идея паттерна Фабричный метод заключается в создании абстрактного метода, 
называемого фабричным методом, в абстрактном классе или интерфейсе. 
Этот метод оставляет решение о создании конкретных объектов наследникам. 
Каждый конкретный наследник реализует фабричный метод и возвращает экземпляр своего класса.
 */

// Абстрактный класс продукта
abstract class Product {
    public abstract void doSomething();
}

// Конкретный класс продукта A
class ConcreteProductA extends Product {
    public void doSomething() {
        System.out.println("Выполнение операции в конкретном продукте A.");
    }
}

// Конкретный класс продукта B
class ConcreteProductB extends Product {
    public void doSomething() {
        System.out.println("Выполнение операции в конкретном продукте B.");
    }
}

// Абстрактный класс создателя
abstract class Creator {
    public abstract Product createProduct();
    
    public void doSomethingWithProduct() {
        Product product = createProduct();
        product.doSomething();
    }
}

// Конкретный класс создателя A
class ConcreteCreatorA extends Creator {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

// Конкретный класс создателя B
class ConcreteCreatorB extends Creator {
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

// Пример использования
public class less_oop_07_seminar_factory1 {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.doSomethingWithProduct();
        
        System.out.println();
        
        Creator creatorB = new ConcreteCreatorB();
        creatorB.doSomethingWithProduct();
    }
}


