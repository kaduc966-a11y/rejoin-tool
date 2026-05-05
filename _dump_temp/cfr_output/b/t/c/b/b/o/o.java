/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.c.d;
import b.c.f;
import b.t.c.b.b.o.o$_b;

public final class o
extends Enum {
    public static final o$_b \u00d600000;
    public static final /* enum */ o o00000;
    public static final /* enum */ o \u00d300000;
    public static final /* enum */ o \u00d500000;
    private static final /* synthetic */ o[] String;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o() {
        void var2_-1;
        void var1_-1;
    }

    public static o[] values() {
        return (o[])String.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private static final /* synthetic */ o[] o00000() {
        o[] oArray = new o[3];
        o[] oArray2 = oArray;
        oArray[0] = o00000;
        oArray2[1] = \u00d300000;
        oArray2[2] = \u00d500000;
        return oArray2;
    }

    static {
        o00000 = new o("MustUse", 0);
        \u00d300000 = new o("ExplicitlyIgnorable", 1);
        \u00d500000 = new o("Unspecified", 2);
        String = o.o00000();
        \u00d200000 = d.o00000(String);
        \u00d600000 = new o$_b(null);
    }
}

