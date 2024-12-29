package aliveEnities;

import java.util.ArrayList;

import enums.Emotion;

public abstract class Human {
    protected int age;
    protected String name;
    private ArrayList<Emotion> emotions = new ArrayList<>();
    public Human(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void addEmotion(Emotion emotion){
        emotions.add(emotion);
    }
    public ArrayList<Emotion> getEmotion(){
        return emotions;
    }
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Human human){
        if(this.name.equals(human.toString())){
            if(this.age == human.getAge())
                return true;
        }
        return false;
    }
}
