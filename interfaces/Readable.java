package interfaces;

import exception.EmptyContentException;

public interface Readable {

    public String getName();
    public String getContent() throws EmptyContentException;
}
