package less_OOP_01.less_oop_task_03_Library;
/*
 * Класс "Библиотека" (Library):

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

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        this.catalog.add(book);
    }

    public void removeBook(Book book) {
        if (book != null){
            this.catalog.remove(book);
            //System.out.printf("УДАЛЕНА КНИГА: %s\n", book.displayInfo());
            System.out.printf("УДАЛЕНА КНИГА: #%d Название: `%s`; Автор: %s\n", book.getID(), book.getTitle(), book.getAuthor());
        }
        else {
            System.out.println("Удаление невозможно!\nКнига с зуказанным ID отсутствует в каталоге");
        }
        displayALLBooks();
        displayAvailableBooks();
    }

    public Book findBookByID (Integer searchId) {
        for (Book b : this.catalog) {
            if (b.getID() == searchId){
                return b;
            }
        }
        return null;
    }

    public void displayALLBooks() {
        System.out.printf("Полный список книг в библиотеке (%d шт.):\n", catalog.size());
        for (Book b : this.catalog) {
            System.out.println(b.displayInfo());
        }
        System.out.println();
    }

    public void displayAvailableBooks() {
        System.out.println("Книги, доступные сейчас:");
        int i = 0;
        for (Book b : this.catalog) {
            if (b.getAvailable()){
                i++;
                System.out.println(i + ". "  + b.displayInfo());
            }
        }
        if (i == 0){
            System.out.println("В данный момент ДОСТУПНЫЕ книги ОТСУТСТВУЮТ!");
        }
        System.out.println();
    }

    public void searchByAuthor(String author) {
        System.out.printf("Автор: %s. Список книг в нашей библиотеке:\n", author);
        int i = 0;
        for (Book b : this.catalog) {
            if (b.getAuthor().equals(author)){
                i++;
                System.out.println(i + ". "  + b.displayInfo());
            }
        }
        if (i == 0){
            System.out.printf("В данный момент ОТСУТСТВУЮТ книги автора %s\n", author);
        }
        System.out.println();
    }
}
