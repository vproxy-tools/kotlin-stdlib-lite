package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class TypeIntrinsics {
    private TypeIntrinsics() {
    }

    public static Collection asMutableCollection(Object obj) {
        return (Collection) obj;
    }

    public static List asMutableList(Object obj) {
        return (List) obj;
    }

    public static Set asMutableSet(Object obj) {
        return (Set) obj;
    }

    public static Map asMutableMap(Object obj) {
        return (Map) obj;
    }

    public static Object beforeCheckcastToFunctionOfArity(Object obj, int arity) {
        return obj;
    }
}
