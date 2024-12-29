package item;

public class Item {
    public String content;
    private String name;
    public Item(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
