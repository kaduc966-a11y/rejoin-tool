/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.j.b;

import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
extends Enum {
    public static final /* enum */ d \u00d400000 = new d("PACKAGE", 0);
    public static final /* enum */ d o00000 = new d("CLASSIFIER", 1);
    private static final /* synthetic */ d[] \u00d300000;
    private static final /* synthetic */ f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var2_-1;
        void var1_-1;
    }

    public static d[] values() {
        return (d[])\u00d300000.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static final /* synthetic */ d[] o00000() {
        d[] dArray = new d[2];
        d[] dArray2 = dArray;
        dArray[0] = \u00d400000;
        dArray2[1] = o00000;
        return dArray2;
    }

    static {
        \u00d300000 = d.o00000();
        new = b.c.d.o00000(\u00d300000);
    }
}

