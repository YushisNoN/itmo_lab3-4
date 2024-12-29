package aliveEnities.author;

import aliveEnities.Human;
import enums.Emotion;
import interfaces.Think;
import record.Mind;

public class Author extends Human implements Think{
    private Mind opinion;
    public Author(String name, int age){
        super(name, age);
    }
    public void beHold(){
        System.out.println(this.toString() + " Созерцать");
    }
    public void setMind(String statement, Emotion emotion){
        this.opinion = new Mind(emotion, statement);
    }
    
    public void torture(Human human){
        System.out.println("Пытать " + human.toString());
    }

    public void think(){
        System.out.println("Думалл о " + this.opinion.statement() + " " + this.opinion.emotion().toString());
    }
    
    public void fly(){
        System.out.println(this.toString() + " " + "Летать");
    }
    public boolean equals(Human human){
        if(super.name.equals(human.toString())){
            if(super.age == human.getAge())
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        var a1 = new Author("1", 1);
        var a2 = new Author("1", 1);

        System.out.println(a1.equals(a2));
    }
}
