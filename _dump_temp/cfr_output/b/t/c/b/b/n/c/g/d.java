/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
extends Enum {
    public static final /* enum */ d \u00d300000 = new d("FORCE_FLEXIBILITY", 0);
    public static final /* enum */ d \u00d400000 = new d("NULLABLE", 1);
    public static final /* enum */ d class = new d("NOT_NULL", 2);
    private static final /* synthetic */ d[] \u00d200000;
    private static final /* synthetic */ f super;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var2_-1;
        void var1_-1;
    }

    public static d[] values() {
        return (d[])\u00d200000.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static final /* synthetic */ d[] o00000() {
        d[] dArray = new d[3];
        d[] dArray2 = dArray;
        dArray[0] = \u00d300000;
        dArray2[1] = \u00d400000;
        dArray2[2] = d.class;
        return dArray2;
    }

    static {
        \u00d200000 = d.o00000();
        super = b.c.d.o00000(\u00d200000);
    }
}

