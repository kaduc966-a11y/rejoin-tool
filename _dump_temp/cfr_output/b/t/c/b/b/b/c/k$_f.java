/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class k$_f
extends Enum {
    public static final /* enum */ k$_f \u00d500000 = new k$_f("HIDDEN", 0);
    public static final /* enum */ k$_f \u00d400000 = new k$_f("VISIBLE", 1);
    public static final /* enum */ k$_f return = new k$_f("DEPRECATED_LIST_METHODS", 2);
    public static final /* enum */ k$_f o00000 = new k$_f("NOT_CONSIDERED", 3);
    public static final /* enum */ k$_f \u00d800000 = new k$_f("DROP", 4);
    private static final /* synthetic */ k$_f[] \u00d300000;
    private static final /* synthetic */ f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k$_f() {
        void var2_-1;
        void var1_-1;
    }

    public static k$_f[] values() {
        return (k$_f[])\u00d300000.clone();
    }

    public static k$_f valueOf(String string) {
        return Enum.valueOf(k$_f.class, string);
    }

    private static final /* synthetic */ k$_f[] o00000() {
        k$_f[] k$_fArray = new k$_f[5];
        k$_f[] k$_fArray2 = k$_fArray;
        k$_fArray[0] = \u00d500000;
        k$_fArray2[1] = \u00d400000;
        k$_fArray2[2] = return;
        k$_fArray2[3] = o00000;
        k$_fArray2[4] = \u00d800000;
        return k$_fArray2;
    }

    static {
        \u00d300000 = k$_f.o00000();
        new = d.o00000(\u00d300000);
    }
}

