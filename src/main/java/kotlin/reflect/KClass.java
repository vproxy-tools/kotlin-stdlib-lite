package kotlin.reflect;

public interface KClass {
    String getQualifiedName();

    boolean isInstance(Object obj);
}
