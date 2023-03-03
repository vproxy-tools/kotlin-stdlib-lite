package kotlin.collections;

import kotlin.jvm.functions.Function1;

import java.util.*;

public class CollectionsKt {
    private CollectionsKt() {
    }

    public static int collectionSizeOrDefault(Iterable<?> self, int def) {
        return (self instanceof Collection) ? ((Collection<?>) self).size() : def;
    }

    public static <E> List<E> emptyList() {
        return Collections.emptyList();
    }

    public static <E> String joinToString$default(Iterable<E> self,
                                                  CharSequence separator,
                                                  CharSequence prefix,
                                                  CharSequence postfix,
                                                  int limit,
                                                  CharSequence truncated,
                                                  Function1<E, CharSequence> transform,
                                                  int mask,
                                                  @SuppressWarnings("unused") Object handler) {
        if ((mask & 1) == 1) {
            separator = null;
        }
        if ((mask & 2) == 2) {
            prefix = null;
        }
        if ((mask & 4) == 4) {
            postfix = null;
        }
        if ((mask & 8) == 8) {
            limit = -1;
        }
        if ((mask & 16) == 16) {
            truncated = null;
        }
        if ((mask & 32) == 32) {
            transform = null;
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        boolean notFinished = false;
        if (prefix != null) {
            sb.append(prefix);
        }
        for (E e : self) {
            if (count != 0) {
                if (separator != null) {
                    sb.append(separator);
                } else {
                    sb.append(", ");
                }
            }
            if (limit >= 0 && count >= limit) {
                notFinished = true;
                break;
            }
            if (transform != null) {
                sb.append(transform.invoke(e));
            } else {
                sb.append(e);
            }
            ++count;
        }
        if (notFinished) {
            if (truncated == null) {
                sb.append("...");
            } else {
                sb.append(truncated);
            }
        }
        if (postfix != null) {
            sb.append(postfix);
        }
        return sb.toString();
    }

    public static <E> E last(List<E> self) {
        if (self.isEmpty())
            throw new NoSuchElementException();
        if (self instanceof Deque) {
            //noinspection unchecked
            return ((Deque<E>) self).getLast();
        } else {
            return self.get(self.size() - 1);
        }
    }

    @SuppressWarnings("unchecked")
    public static <E> List<E> listOf(E... arr) {
        return Arrays.asList(arr);
    }

    public static <E> List<E> listOf(E e) {
        return Collections.singletonList(e);
    }

    public static <E> E removeLast(List<E> self) {
        if (self.isEmpty())
            throw new NoSuchElementException();
        if (self instanceof Deque) {
            //noinspection unchecked
            return ((Deque<E>) self).removeLast();
        } else {
            return self.remove(self.size() - 1);
        }
    }

    public static <E> List<E> reversed(Iterable<E> self) {
        ArrayList<E> ls = new ArrayList<>();
        for (E e : self) {
            ls.add(e);
        }
        if (ls.size() <= 1) {
            return ls;
        }
        for (int i = 0; i < ls.size() / 2; ++i) {
            E a = ls.get(i);
            E b = ls.get(ls.size() - i - 1);
            ls.set(i, b);
            ls.set(ls.size() - i - 1, a);
        }
        return ls;
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static boolean[] toBooleanArray(Collection<Boolean> self) {
        boolean[] arr = new boolean[self.size()];
        int i = 0;
        for (boolean e : self) {
            arr[i++] = e;
        }
        return arr;
    }

    public static double[] toDoubleArray(Collection<Double> self) {
        double[] arr = new double[self.size()];
        int i = 0;
        for (double e : self) {
            arr[i++] = e;
        }
        return arr;
    }

    public static float[] toFloatArray(Collection<Float> self) {
        float[] arr = new float[self.size()];
        int i = 0;
        for (float e : self) {
            arr[i++] = e;
        }
        return arr;
    }

    public static int[] toIntArray(Collection<Integer> self) {
        int[] arr = new int[self.size()];
        int i = 0;
        for (int e : self) {
            arr[i++] = e;
        }
        return arr;
    }

    public static long[] toLongArray(Collection<Long> self) {
        long[] arr = new long[self.size()];
        int i = 0;
        for (long e : self) {
            arr[i++] = e;
        }
        return arr;
    }
}
