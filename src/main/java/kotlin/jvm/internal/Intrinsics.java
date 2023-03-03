package kotlin.jvm.internal;

import kotlin.UninitializedPropertyAccessException;

import java.util.Objects;

public class Intrinsics {
    private Intrinsics() {
    }

    public static void checkNotNull(Object value) {
        if (value == null) {
            throw new NullPointerException();
        }
    }

    public static void checkNotNullParameter(Object value, String paramName) {
        if (value == null) {
            throw new NullPointerException(paramName + " must not be null");
        }
    }

    public static boolean areEqual(Object first, Object second) {
        return Objects.equals(first, second);
    }

    public static void checkNotNullExpressionValue(Object value, String expression) {
        if (value == null) {
            throw new NullPointerException(expression + " must not be null");
        }
    }

    public static String stringPlus(String self, Object other) {
        return self + other;
    }

    public static void throwUninitializedPropertyAccessException(String propertyName) {
        throw new UninitializedPropertyAccessException("lateinit property " + propertyName + " has not been initialized");
    }
}
