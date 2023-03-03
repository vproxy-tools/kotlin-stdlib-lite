package kotlin;

public class Unit {
    public static final Unit INSTANCE = new Unit();

    private Unit() {
    }

    @Override
    public String toString() {
        return "kotlin.Unit";
    }
}
