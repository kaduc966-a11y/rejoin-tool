/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.b;

import b.c.f;

public final class d
extends Enum {
    public static final /* enum */ d o00000 = new d("WARNING", 0);
    public static final /* enum */ d \u00d300000 = new d("ERROR", 1);
    public static final /* enum */ d \u00d500000 = new d("HIDDEN", 2);
    private static final /* synthetic */ d[] String;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var2_-1;
        void var1_-1;
    }

    public static d[] values() {
        return (d[])String.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static final /* synthetic */ d[] o00000() {
        d[] dArray = new d[3];
        d[] dArray2 = dArray;
        dArray[0] = o00000;
        dArray2[1] = \u00d300000;
        dArray2[2] = \u00d500000;
        return dArray2;
    }

    static {
        String = d.o00000();
        \u00d200000 = b.c.d.o00000(String);
    }
}

