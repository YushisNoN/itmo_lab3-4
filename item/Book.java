package item;

import exception.EmptyContentException;
import interfaces.Readable;

public class Book extends Item implements Readable{

    private String content;
    public Book(String name){
        super(name);
    }
    public void setContent(String content){
        this.content = content;
    }

    public String getName() {
        return this.toString();
    }

    public String getContent() throws EmptyContentException {
        if(this.content.length() > 0)
            return this.content;
        throw new EmptyContentException();
    }
}
