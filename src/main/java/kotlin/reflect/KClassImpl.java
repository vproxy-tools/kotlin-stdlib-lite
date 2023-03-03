package kotlin.reflect;

public class KClassImpl implements KClass {
    private final Class<?> javaClass;

    public KClassImpl(Class<?> javaClass) {
        this.javaClass = javaClass;
    }

    @Override
    public String getQualifiedName() {
        return formatQualifiedName(javaClass);
    }

    private static String formatQualifiedName(Class<?> javaClass) {
        if (javaClass == Integer.class || javaClass == int.class) {
            return "kotlin.Int";
        } else if (javaClass == Long.class || javaClass == long.class) {
            return "kotlin.Long";
        } else if (javaClass == Float.class || javaClass == float.class) {
            return "kotlin.Float";
        } else if (javaClass == Double.class || javaClass == double.class) {
            return "kotlin.Double";
        } else if (javaClass == Boolean.class || javaClass == boolean.class) {
            return "kotlin.Boolean";
        } else if (javaClass == Character.class || javaClass == char.class) {
            return "kotlin.Char";
        } else if (javaClass == Short.class || javaClass == short.class) {
            return "kotlin.Short";
        } else if (javaClass == Byte.class || javaClass == byte.class) {
            return "kotlin.Byte";
        } else if (javaClass == String.class) {
            return "kotlin.String";
        } else if (javaClass.isArray()) {
            Class<?> comp = javaClass.getComponentType();
            if (comp == int.class) {
                return "kotlin.IntArray";
            } else if (comp == long.class) {
                return "kotlin.LongArray";
            } else if (comp == float.class) {
                return "kotlin.FloatArray";
            } else if (comp == double.class) {
                return "kotlin.DoubleArray";
            } else if (comp == boolean.class) {
                return "kotlin.BooleanArray";
            } else if (comp == char.class) {
                return "kotlin.CharArray";
            } else if (comp == short.class) {
                return "kotlin.ShortArray";
            } else if (comp == byte.class) {
                return "kotlin.ByteArray";
            } else {
                return "kotlin.Array";
            }
        } else {
            return javaClass.getName();
        }
    }

    @Override
    public boolean isInstance(Object obj) {
        if ((javaClass == Integer.class || javaClass == int.class) && obj != null) {
            return obj instanceof Integer;
        } else if ((javaClass == Long.class || javaClass == long.class) && obj != null) {
            return obj instanceof Long;
        } else if ((javaClass == Float.class || javaClass == float.class) && obj != null) {
            return obj instanceof Float;
        } else if ((javaClass == Double.class || javaClass == double.class) && obj != null) {
            return obj instanceof Double;
        } else if ((javaClass == Boolean.class || javaClass == boolean.class) && obj != null) {
            return obj instanceof Boolean;
        } else if ((javaClass == Character.class || javaClass == char.class) && obj != null) {
            return obj instanceof Character;
        } else if ((javaClass == Short.class || javaClass == short.class) && obj != null) {
            return obj instanceof Short;
        } else if ((javaClass == Byte.class || javaClass == byte.class) && obj != null) {
            return obj instanceof Byte;
        } else {
            return javaClass.isInstance(obj);
        }
    }

    @Override
    public int hashCode() {
        return javaClass.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KClass kClass = (KClass) o;

        return getQualifiedName().equals(kClass.getQualifiedName());
    }
}
