package natural.mountain;

import enums.Color;
import enums.NaturalTypes;
import natural.NaturalObject;

public class Mountain extends NaturalObject {
    private Color color = Color.VIOLET;
    public Mountain(int size){
        super("Горы", size, NaturalTypes.MOUNTAIN);
    }

    public void melt(){
        System.out.println("Таят " + color.toString() + " " + this.toString());
    }

    @Override
    public String toString(){
        return "Горы";
    }
}
