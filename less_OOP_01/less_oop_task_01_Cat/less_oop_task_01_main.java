package less_OOP_01.less_oop_task_01_Cat;

/* Задача 1:
Создайте класс "Кот" (Cat) со следующими свойствами:
Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! 
Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. 
Добавьте соответствующее поле в классе "Кот" и методы доступа для него. 
Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! 
Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
 */

public class less_oop_task_01_main {
    public static void main(String[] args){
        Cat barsic = new Cat();
        barsic.setName("Barsic");
        barsic.setAge(3);
        
        Owner owner1  = new Owner();
        owner1.name = "Ivan";
    
        barsic.setOwnerName(owner1.name);
    
        Owner owner2 = new Owner();
        owner2.name = "Boris";
        
        Cat murzic = new Cat();
        murzic.setName("Murzic");
        murzic.setAge(5);
        murzic.setOwnerName(owner1.name);
    
        Cat murka = new Cat();
        murka.setName("Murka");
        murka.setAge(1);
        murka.setOwnerName(owner2.name);
    
        barsic.greet();
        System.out.println();
        murzic.greet();
        System.out.println();
        murka.greet();
        }
}
