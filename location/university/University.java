package location.university;

import enums.Volume;
import exception.EmptyContentException;
import interfaces.Readable;
import item.Item;
import location.Location;

public class University extends Location implements Readable {

    private Item item;

    public University(String name, Volume volume) {
        super(name, volume);
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getName() {
        return this.item.toString();
    }

    public String getContent() throws EmptyContentException {
        if (this.item.content.length() > 0)
            return this.item.content;
        throw new EmptyContentException();
    }

}
