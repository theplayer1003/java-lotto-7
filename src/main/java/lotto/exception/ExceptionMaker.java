package lotto.exception;

public enum ExceptionMaker {
    INVALID_LOTTO_NUMBER_RANGE("로또 번호는 1에서 45 사이의 정수 여야 합니다.");

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
