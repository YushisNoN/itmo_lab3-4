package aliveEnities.elders;

import aliveEnities.Human;
import enums.Emotion;
import interfaces.Think;
import record.Mind;

public class Elders extends Human implements Think {
    private Mind mind;

    public Elders(String name, int age) {
        super(name, age);
    }

    public void setMind(String statement, Emotion emotion) {
        this.mind = new Mind(emotion, statement);
    }

    public void afraid() {
        System.out.println("Беспокояться");
    }

    public void comeUp() {
        System.out.println(this.getEmotion().get(0) + " " + "Приближаться");
    }

    public void think() {
        System.out.println("Думали о " + this.mind.statement() + " " + this.mind.emotion().toString());
    }
}
