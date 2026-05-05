/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.c.d;
import b.c.f;

public final class nd
extends Enum {
    public static final /* enum */ nd \u00d500000 = new nd("FUNCTION", 0);
    public static final /* enum */ nd Object = new nd("PROPERTY", 1);
    public static final /* enum */ nd o00000 = new nd("FIELD_IN_JAVA_CLASS", 2);
    private static final /* synthetic */ nd[] \u00d400000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nd() {
        void var2_-1;
        void var1_-1;
    }

    public static nd[] values() {
        return (nd[])\u00d400000.clone();
    }

    public static nd valueOf(String string) {
        return Enum.valueOf(nd.class, string);
    }

    private static final /* synthetic */ nd[] o00000() {
        nd[] ndArray = new nd[3];
        nd[] ndArray2 = ndArray;
        ndArray[0] = \u00d500000;
        ndArray2[1] = Object;
        ndArray2[2] = o00000;
        return ndArray2;
    }

    static {
        \u00d400000 = nd.o00000();
        \u00d200000 = d.o00000(\u00d400000);
    }
}

