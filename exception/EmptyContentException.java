package exception;

public class EmptyContentException extends Exception {
    public EmptyContentException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Не может быть пустого содержания текста";
    }
}
