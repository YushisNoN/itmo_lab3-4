package natural.vision;

import enums.NaturalTypes;
import enums.State;
import natural.NaturalObject;

public class Vision extends NaturalObject{
    public State state = State.DEMONIC;
    public Vision(){
        super("Виденье", 0, NaturalTypes.PHENOMEN);
    }
    
    public void open(){
        System.out.println(this.state + " " + this.toString() + " " + "Открывать");
    }
}
