/*
 * Decompiled with CFR 0.152.
 */
package b.w;

import b.c.d;

public final class f
extends Enum {
    public static final /* enum */ f \u00d600000 = new f("AT_MOST_ONCE", 0);
    public static final /* enum */ f \u00d500000 = new f("AT_LEAST_ONCE", 1);
    public static final /* enum */ f String = new f("EXACTLY_ONCE", 2);
    public static final /* enum */ f \u00d300000 = new f("UNKNOWN", 3);
    private static final /* synthetic */ f[] \u00d200000;
    private static final /* synthetic */ b.c.f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f() {
        void var2_-1;
        void var1_-1;
    }

    public static f[] values() {
        return (f[])\u00d200000.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static b.c.f o00000() {
        return o00000;
    }

    private static final /* synthetic */ f[] \u00d200000() {
        f[] fArray = new f[4];
        f[] fArray2 = fArray;
        fArray[0] = \u00d600000;
        fArray2[1] = \u00d500000;
        fArray2[2] = String;
        fArray2[3] = \u00d300000;
        return fArray2;
    }

    static {
        \u00d200000 = f.\u00d200000();
        o00000 = d.o00000(\u00d200000);
    }
}

