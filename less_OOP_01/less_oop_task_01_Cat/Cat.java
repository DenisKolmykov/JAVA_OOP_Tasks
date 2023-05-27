package less_OOP_01.less_oop_task_01_Cat;
/*
 * Создайте класс "Кот" (Cat) со следующими свойствами:

Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! 
Меня зовут <имя>. Мне <возраст> года(лет).".
 */

public class Cat {
    private String name;
    private Integer age;
    private String ownerName;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setOwnerName(String oName) {
        this.ownerName = oName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void greet() {
        System.out.printf("Мяу, Меня зовут %s. Мне %d года(лет).\n", this.name, this.age);
        System.out.printf("Мяу, Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n", this.name, this.age, this.ownerName);
    }
}
