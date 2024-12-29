package enums;

public enum Volume {
    
    SMALL("Маленький"),
    MEDIUM("Средний"),
    LARGE("Огромный");

    private String size;
    Volume(String size){
        this.size = size;
    }

    @Override
    public String toString(){
        return this.size;
    }
}
