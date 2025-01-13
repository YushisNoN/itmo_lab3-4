package aliveEnities.danfort;

import java.util.ArrayList;
import java.util.List;

import aliveEnities.Human;
import enums.Emotion;
import exception.WrongBookException;
import interfaces.Think;
import item.Book;
import record.Mind;

public class Danfort extends Human implements Think {
    private List<Book> books = new ArrayList<>();
    private Mind mind;

    public Danfort(String name, int age) {
        super(name, age);
    }

    public void setMind(String statement, Emotion emotion) {
        this.mind = new Mind(emotion, statement);
    }

    public void think() {
        System.out.println("Думали о " + this.mind.statement() + " " + this.mind.emotion().toString());
    }

    public void beHold() {
        System.out.println(this.toString() + " Созерцать");
    }

    public void fly() {
        System.out.println(this.toString() + " " + "Летать");
    }

    public void addBook(Book bookName) {
        this.books.add(bookName);
    }

    public void say(String statement) {
        System.out.println("Денфорт Сказал: " + statement);
    }

    public void lose(Emotion emotion) {
        System.out.println("Чувствует " + emotion);
    }

    public void lose(String think) {
        System.out.println(this.toString() + " Чувствует " + think);
    }

    public void read(Book bookName) throws WrongBookException {
        for (var book : books) {
            if (book.equals(bookName)) {
                System.out.println("Читает " + bookName);
            } else {
                throw new WrongBookException();
            }
        }
    }

    public void comeToSense() {
        System.out.println("Пришел в себя");
    }

    public void tieUp() {
        System.out.println("Связывать");
    }
}
