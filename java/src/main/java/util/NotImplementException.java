package util;

public class NotImplementException extends RuntimeException {
    public NotImplementException() {
    }

    public NotImplementException(String message) {
        super(message);
    }

    public NotImplementException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
