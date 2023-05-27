package less_OOP_01.less_oop_task_03_Library;
/*
 * Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) 
со следующими свойствами и методами:

Класс "Книга" (Book):
Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и 
автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге 
(название, автор, доступность).

Класс "Библиотека" (Library):
Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и 
добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и 
удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль 
информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве 
параметра и выводит на консоль информацию о книгах данного автора, находящихся в каталоге библиотеки.
 */

import java.util.Random;
import java.util.Scanner;

public class less_oop_task_03_main {
    public static boolean getBoolean(int value)
    {
        return (value!=0);
    }
    public static void main(String[] args){
        String [] authorsArr = {"Лев Толстой", "Сергей Аксаков", "Александр Пушкин", "Николай Гоголь", 
        "Александр Герцен", "Михаил Лермонтов", "Иван Гончаров", "Пётр Ершов", "Иван Тургенев", "Фёдор Достоевский",
        "Михаил Салтыков-Щедрин", "Николай Лесков", "Дмитрий Мамин-Сибиряк", "Антон Чехов"};
        
        int x = 10; // количество книг в библиотеке
        // содаем массив названий книг
        String [] booksArr = new String [x];
        for (int i = 0; i < booksArr.length; i++){
            String name = "Книга "+(i+1);
            booksArr[i] = name;
        }
        
        Library newLibrary = new Library();

        // формируем (заполняем) каталог
        Random rd = new Random();
        int id = 1;
        for (String books : booksArr) {
            Book newBook = new Book();
            newBook.setID(id);
            
            newBook.setTitle(books);

            String ayth = authorsArr[rd.nextInt(authorsArr.length-1)];
            newBook.setAuthor(ayth);

            int availableRND = rd.nextInt(2); // случайно формируем доступность книги
            
            newBook.setAvalable(getBoolean(availableRND));

            newLibrary.addBook(newBook);
            id++;
        }
        System.out.println("---1-вывод всего каталога--");
        newLibrary.displayALLBooks();

        System.out.println("---2-вывод доступных книг--");
        newLibrary.displayAvailableBooks();

        System.out.println("---3-вывод книг конкретного автора--");
        newLibrary.searchByAuthor("Николай Гоголь");
        
        System.out.println("---4-удаление книги из каталога--");
        // удаление книги из каталога
        Scanner iScanner = new Scanner (System.in);
        System.out.println("РЕЖИМ УДАЛЕНИЯ КНИГИ ИЗ КАТАЛОГА");
        newLibrary.displayALLBooks();
        System.out.printf("Введите НОМЕР (#id) книги для удаления из каталога: \n");
        System.out.print("---> ");
        Integer delNum = iScanner.nextInt();
        newLibrary.removeBook(newLibrary.findBookByID(delNum));
        iScanner.close();
    } 
}
