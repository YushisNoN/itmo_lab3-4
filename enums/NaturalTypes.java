package enums;

public enum NaturalTypes {
    
    MOUNTAIN("Горы"),
    CAVES("Пещеры"),
    PHENOMEN("Явление"),
    SLOPE("Скалы");

    private String type;
    NaturalTypes(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return this.type;
    }
}
