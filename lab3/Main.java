package lab3;
import aliveEnities.author.Author;
import aliveEnities.danfort.Danfort;
import aliveEnities.elders.Elders;
import enums.Emotion;
import enums.Types;
import enums.Volume;
import exception.WrongBookException;
import item.Book;
import location.camp.Camp;
import location.university.Library;
import location.university.University;
import natural.cave.Cave;
import natural.gas.Gas;
import natural.mirage.Mirage;
import natural.mountain.Mountain;
import natural.slope.Slope;
import natural.vision.Vision;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Автор", 18);
        Danfort danfort = new Danfort("Денфорт", 20);
        Book book = new Book("Некрономикон");
        danfort.addBook(book);
        Mirage mirage = new Mirage(10);
        Slope slope = new Slope("Скалы", 0, Types.CUBE);
        Cave cave = new Cave("Хребет Безумия", 100);
        Gas gas = new Gas();
        Vision vision = new Vision();
        Mountain mountain = new Mountain(1000);
        Elders elders = new Elders("Старцы", 80);
        Camp camp = new Camp("Лейка", Volume.SMALL);
        University university = new University("Университет", Volume.LARGE);
        Library library = new Library("Библиотека", null);
        author.torture(danfort);
        danfort.lose("Впечатление");
        System.out.println(mirage);
        danfort.say("Нет ничего общего с " + slope.toString());
        cave.exude(gas);
        System.out.println(cave.toString());
        vision.open();
        mountain.melt();
        elders.afraid();
        elders.addEmotion(Emotion.FEAR);
        elders.comeUp();
        System.out.println(elders.toString());
        System.out.println(mirage.toString());
        author.beHold();
        danfort.beHold();
        author.fly();
        danfort.fly();
        System.out.println(camp);
        danfort.say("черная бездна");
        danfort.say("резные края");
        danfort.say("протошогготы");
        danfort.say("пятимерные наглухо закрытые конструкции");
        danfort.say("мерзкий цилиндр");
        danfort.say("древний Фарос");
        danfort.say("Иог-Согот");
        danfort.say("исходная белая студнеобразная структура");
        danfort.say("космический оттенок");
        danfort.say("крылья");
        danfort.say("глаза в темноте");
        danfort.say("лунная дорожка");
        danfort.say("первозданный, вечный, нумирающий");
        danfort.comeToSense();
        try {
            danfort.read(book);
        } catch (WrongBookException e) {
            e.printStackTrace();
        }
        System.out.println("Хранившийся " + library.toString() + " в " + university.toString());
    }   
}