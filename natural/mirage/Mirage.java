package natural.mirage;

import enums.NaturalTypes;
import natural.NaturalObject;

public class Mirage extends NaturalObject{
    
    public Mirage(int size){
        super("Мираж", size, NaturalTypes.PHENOMEN);
    }
    
    @Override
    public String toString(){
        return "Мираж";
    }
}
