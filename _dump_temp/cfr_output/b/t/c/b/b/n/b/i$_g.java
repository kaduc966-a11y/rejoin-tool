/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.c.d;
import b.c.f;

final class i$_g
extends Enum {
    public static final /* enum */ i$_g \u00d300000 = new i$_g("PROPERTY", 0);
    public static final /* enum */ i$_g \u00d500000 = new i$_g("BACKING_FIELD", 1);
    public static final /* enum */ i$_g o00000 = new i$_g("DELEGATE_FIELD", 2);
    private static final /* synthetic */ i$_g[] String;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private i$_g() {
        void var2_-1;
        void var1_-1;
    }

    public static i$_g[] values() {
        return (i$_g[])String.clone();
    }

    public static i$_g valueOf(String string) {
        return Enum.valueOf(i$_g.class, string);
    }

    private static final /* synthetic */ i$_g[] o00000() {
        i$_g[] i$_gArray = new i$_g[3];
        i$_g[] i$_gArray2 = i$_gArray;
        i$_gArray[0] = \u00d300000;
        i$_gArray2[1] = \u00d500000;
        i$_gArray2[2] = o00000;
        return i$_gArray2;
    }

    static {
        String = i$_g.o00000();
        \u00d200000 = d.o00000(String);
    }
}

