package enums;

public enum Types {
    CUBE("Кубические");

    private String type;
    Types(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return this.type;
    }
}
