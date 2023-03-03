package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;

public class NotImplementedError extends Error {
    public NotImplementedError() {
        this(null, null);
    }

    public NotImplementedError(String message) {
        super(message);
    }

    public NotImplementedError(String message, DefaultConstructorMarker marker) {
        super(message == null ? "An operation is not implemented." : message);
    }
}
