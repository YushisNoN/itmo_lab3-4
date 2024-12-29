package exception;

public class EmptyStatementException extends Exception {
    public EmptyStatementException(){
        super();
    }

    @Override
    public String getMessage(){
        return "Не может быть пустого высказывания";
    }
}
