package kotlin;

public class UninitializedPropertyAccessException extends RuntimeException {
    public UninitializedPropertyAccessException() {
        super();
    }

    public UninitializedPropertyAccessException(String message) {
        super(message);
    }

    public UninitializedPropertyAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public UninitializedPropertyAccessException(Throwable cause) {
        super(cause);
    }
}
