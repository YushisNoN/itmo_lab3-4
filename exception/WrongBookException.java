package exception;

public class WrongBookException extends Exception {
    public WrongBookException(){
        super();
    }

    @Override
    public String getMessage(){
        return "Ошибка, не может прочитать то, что не знает";
    }
}
