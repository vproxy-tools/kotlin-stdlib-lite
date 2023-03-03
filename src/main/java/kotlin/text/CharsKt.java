package kotlin.text;

public class CharsKt {
    private CharsKt() {
    }

    public static int checkRadix(int radix) {
        if (radix < Character.MIN_RADIX || radix > Character.MAX_RADIX) {
            throw new IllegalArgumentException("radix " + radix + " was not in valid range " + Character.MIN_RADIX + ".." + Character.MAX_RADIX + "}");
        }
        return radix;
    }
}
