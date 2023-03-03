package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KClassImpl;

public class Reflection {
    private Reflection() {
    }

    public static KClass getOrCreateKotlinClass(Class<?> javaClass) {
        return new KClassImpl(javaClass);
    }
}
