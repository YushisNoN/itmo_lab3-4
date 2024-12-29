package location.camp;

import enums.Population;
import enums.Volume;
import exception.EmptyContentException;
import interfaces.Readable;
import item.Item;
import location.Location;

public class Camp extends Location implements Readable {

    private Item item;
    private String name;
    public Camp(String name, Volume volume){
        super(name, volume);
        this.name = name;
        this.setPopulation(Population.NONE);
    }
    public void setItem(Item item){
        this.item = item;
    }

    public String getName() {
        return this.item.toString();
    }

    public String getContent() throws EmptyContentException {
        if(this.item.content.length() > 0)
            return this.item.content;
        throw new EmptyContentException();
    }
    @Override
    public String toString(){
        return "Лагерь " + this.name;
    }

}
