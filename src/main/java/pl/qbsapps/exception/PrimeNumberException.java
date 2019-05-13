package pl.qbsapps.exception;

public class PrimeNumberException extends AppException {
    public PrimeNumberException(String message) {
        super(message);
    }

    public PrimeNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrimeNumberException() {
        super("Prime number can not be factored");
    }
}
