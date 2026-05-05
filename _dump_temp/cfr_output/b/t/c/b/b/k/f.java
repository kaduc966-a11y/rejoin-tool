/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.c.d;

public final class f
extends Enum {
    public static final /* enum */ f o00000 = new f("ALL", 0);
    public static final /* enum */ f \u00d300000 = new f("ONLY_NON_SYNTHESIZED", 1);
    public static final /* enum */ f \u00d500000 = new f("NONE", 2);
    private static final /* synthetic */ f[] String;
    private static final /* synthetic */ b.c.f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f() {
        void var2_-1;
        void var1_-1;
    }

    public static f[] values() {
        return (f[])String.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private static final /* synthetic */ f[] o00000() {
        f[] fArray = new f[3];
        f[] fArray2 = fArray;
        fArray[0] = o00000;
        fArray2[1] = \u00d300000;
        fArray2[2] = \u00d500000;
        return fArray2;
    }

    static {
        String = f.o00000();
        \u00d200000 = d.o00000(String);
    }
}

