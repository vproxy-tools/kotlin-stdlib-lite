package kotlin.jvm.internal;

public class LongCompanionObject {
    @SuppressWarnings("InstantiationOfUtilityClass")
    public static LongCompanionObject INSTANCE = new LongCompanionObject();

    private LongCompanionObject() {
    }
}
