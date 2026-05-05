/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.h;

import b.t.c.b.b.b.j;
import b.t.c.b.b.d.k;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum e {
    int(j.class, "boolean", "Z", "java.lang.Boolean"),
    class(j.\u00d4O0000, "char", "C", "java.lang.Character"),
    \u00d600000(j.OO0000, "byte", "B", "java.lang.Byte"),
    do(j.\u00d3O0000, "short", "S", "java.lang.Short"),
    \u00d300000(j.super, "int", "I", "java.lang.Integer"),
    \u00f600000(j.\u00d2O0000, "float", "F", "java.lang.Float"),
    super(j.\u00d200000, "long", "J", "java.lang.Long"),
    interface(j.\u00d800000, "double", "D", "java.lang.Double");

    private static final Map \u00d400000;
    private static final Map \u00d800000;
    private static final Map \u00d4O0000;
    private static final Set \u00d3O0000;
    private static final Map \u00f400000;
    private final j \u00d200000;
    private final String \u00d6O0000;
    private final String \u00d2O0000;
    private final k \u00f800000;

    public static e o00000(String string) {
        e e2;
        if (string == null) {
            e.o00000(3);
        }
        if ((e2 = (e)((Object)\u00d400000.get(string))) == null) {
            throw new AssertionError((Object)"Non-primitive type name passed: ".concat(String.valueOf(string)));
        }
        e e3 = e2;
        if (e3 == null) {
            e.o00000(4);
        }
        return e3;
    }

    public static e o00000(j j2) {
        if (j2 == null) {
            e.o00000(5);
        }
        e e2 = (e)((Object)\u00d800000.get((Object)j2));
        if (e2 == null) {
            e.o00000(6);
        }
        return e2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private e(String string, String string2) {
        void var6_4;
        void var5_3;
        if (string == null) {
            e.o00000(8);
        }
        if (string2 == null) {
            e.o00000(9);
        }
        if (var5_3 == null) {
            e.o00000(10);
        }
        if (var6_4 == null) {
            e.o00000(11);
        }
        this.\u00d200000 = string;
        this.\u00d6O0000 = string2;
        this.\u00d2O0000 = var5_3;
        this.\u00f800000 = new k((String)var6_4);
    }

    public final j new() {
        j j2 = this.\u00d200000;
        if (j2 == null) {
            e.o00000(12);
        }
        return j2;
    }

    public final String \u00d300000() {
        String string = this.\u00d6O0000;
        if (string == null) {
            e.o00000(13);
        }
        return string;
    }

    public final String \u00d400000() {
        String string = this.\u00d2O0000;
        if (string == null) {
            e.o00000(14);
        }
        return string;
    }

    public final k o00000() {
        k k2 = this.\u00f800000;
        if (k2 == null) {
            e.o00000(15);
        }
        return k2;
    }

    static {
        \u00d400000 = new HashMap();
        \u00d800000 = new EnumMap(j.class);
        \u00d4O0000 = new HashMap();
        \u00d3O0000 = new HashSet();
        \u00f400000 = new HashMap();
        for (e e2 : e.values()) {
            \u00d400000.put(e2.\u00d300000(), e2);
            \u00d800000.put(e2.new(), e2);
            \u00d4O0000.put(e2.\u00d400000(), e2);
            String string = e2.\u00f800000.super().replace('.', '/');
            \u00d3O0000.add(string);
            \u00f400000.put(string, "(" + e2.\u00d2O0000 + ")L" + string + ";");
        }
    }

    private static /* synthetic */ void o00000(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4: 
            case 6: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 6: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "internalName";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "owner";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "methodDescriptor";
                break;
            }
            case 3: 
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 4: 
            case 6: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 7: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "desc";
                break;
            }
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "primitiveType";
                break;
            }
            case 11: {
                objectArray2 = objectArray3;
                objectArray3[0] = "wrapperClassName";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            }
            case 4: 
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "get";
                break;
            }
            case 12: {
                objectArray = objectArray2;
                objectArray2[1] = "getPrimitiveType";
                break;
            }
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "getJavaKeywordName";
                break;
            }
            case 14: {
                objectArray = objectArray2;
                objectArray2[1] = "getDesc";
                break;
            }
            case 15: {
                objectArray = objectArray2;
                objectArray2[1] = "getWrapperFqName";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "isWrapperClassInternalName";
                break;
            }
            case 1: 
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "isBoxingMethodDescriptor";
                break;
            }
            case 3: 
            case 5: {
                objectArray = objectArray;
                objectArray[2] = "get";
                break;
            }
            case 4: 
            case 6: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                break;
            }
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "getByDesc";
                break;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 6: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

