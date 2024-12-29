package natural.slope;

import enums.NaturalTypes;
import enums.Types;
import natural.NaturalObject;

public class Slope extends NaturalObject{
    private Types type;
    private String name;
    public Slope(String name, int size, Types type){
        super(name, size, NaturalTypes.SLOPE);
        this.type = type;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.type + " " + this.name;
    }
}
