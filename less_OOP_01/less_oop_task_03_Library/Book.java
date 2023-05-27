package less_OOP_01.less_oop_task_03_Library;
/*
 * Класс "Книга" (Book):

Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и 
автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге 
(название, автор, доступность).

 */
public class Book {
    private String title;
    private String author;
    private boolean available;
    private Integer id;

    public void setTitle(String t) {
        this.title = t;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAvalable(boolean av) {
        this.available  = av;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setID(Integer a) {
        this.id = a;
    }

    public Integer getID() {
        return this.id;
    }

    public String displayInfo() {
        String yn = "нет";
        if (this.available){
            yn = "да";
        }
        return String.format("#%d Название: `%s`; Автор: %s;  сейчас доступна: %s", this.id, this.title, this.author, yn);
    }
}
