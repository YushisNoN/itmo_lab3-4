package natural.cave;

import enums.NaturalTypes;
import enums.State;
import natural.NaturalObject;
import natural.gas.Gas;

public class Cave extends NaturalObject{
    private State state = null;
    public Cave(String name, int size){
        super(name, size, NaturalTypes.CAVES);
        this.state = State.SIGNING;
    }
    public void setState(State state){
        this.state = state;
    }
    public void exude(Gas gas){
        if(this.state.equals(null))
            System.out.println("Nстощает " + gas.toString());
       else{
            System.out.println(this.state.toString() + " " + "Nстощает " + gas.toString()); 
       }
    }
}
