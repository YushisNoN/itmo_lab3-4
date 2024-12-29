package enums;

public enum Color {
    
    VIOLET("Фиолетовый"),
    NONE("");

    private String color;
    Color(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color;
    }
}
