package lotto.exception;

public enum ExceptionMaker {
    ;

    private final String message;
    private final IllegalArgumentException exception;

    ExceptionMaker(String message) {
        this.message = message;
        this.exception = new IllegalArgumentException(this.message);
    }

    public IllegalArgumentException makeException() {
        return exception;
    }

    public String getMessage() {
        return message;
    }
}
