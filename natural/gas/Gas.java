package natural.gas;

public class Gas {
    private String name;
    public Gas(){
        this.name = "пар";
    }
    public Gas(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
