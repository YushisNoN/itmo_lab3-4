package enums;

public enum Emotion {

    FEAR("Страх"),
    PEACE("Спокойствие"),
    HORROR("Ужас");

    private String feeling;
    Emotion(String feeling){
        this.feeling = feeling;
    }

    @Override
    public String toString(){
        return "испытывает " + this.feeling;
    }
}
