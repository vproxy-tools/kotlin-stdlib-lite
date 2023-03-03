package kotlin.jvm.functions;

@FunctionalInterface
public interface Function1<P1, R> {
    R invoke(P1 p1);
}
