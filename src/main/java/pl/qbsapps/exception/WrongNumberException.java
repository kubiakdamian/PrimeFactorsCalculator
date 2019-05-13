package pl.qbsapps.exception;

public class WrongNumberException extends AppException {
    public WrongNumberException(String message) {
        super(message);
    }

    public WrongNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongNumberException() {
        super("Number should be integer greater than 2");
    }
}
