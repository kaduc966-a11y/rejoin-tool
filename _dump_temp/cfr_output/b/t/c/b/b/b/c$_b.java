/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.t.c.b.b.b.c$1;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class c$_b {
    public final Map Object;
    public final Map o00000;
    public final Map \u00d200000;

    private c$_b(Map map, Map map2, Map map3) {
        if (map == null) {
            c$_b.super(0);
        }
        if (map2 == null) {
            c$_b.super(1);
        }
        if (map3 == null) {
            c$_b.super(2);
        }
        this.Object = map;
        this.o00000 = map2;
        this.\u00d200000 = map3;
    }

    /* synthetic */ c$_b(Map map, Map map2, Map map3, c$1 c$1) {
        this(map, map2, map3);
    }

    private static /* synthetic */ void super(int n2) {
        Object[] objectArray;
        Object[] objectArray2 = new Object[3];
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[0] = "primitiveTypeToArrayKotlinType";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[0] = "primitiveKotlinTypeToKotlinArrayType";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
        }
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
        objectArray[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

