package kotlin.collections;

import java.util.Arrays;
import java.util.List;

public class ArraysKt {
    private ArraysKt() {
    }

    @SuppressWarnings("unchecked")
    public static <E> List<E> asList(E... arr) {
        return Arrays.asList(arr);
    }

    public static char[] copyInto(char[] src, char[] dst,
                                  int destinationOffset,
                                  int startIndex,
                                  int endIndex) {
        System.arraycopy(src, startIndex, dst, destinationOffset, endIndex - startIndex);
        return dst;
    }

    @SuppressWarnings("unchecked")
    public static <E> List<E> toList(E... arr) {
        return asList(arr);
    }
}
