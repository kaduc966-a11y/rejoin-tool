/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k$_b
extends Enum {
    public static final /* enum */ k$_b \u00d400000 = new k$_b("JAVA", 0);
    public static final /* enum */ k$_b super = new k$_b("KOTLIN", 1);
    private static final /* synthetic */ k$_b[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k$_b() {
        void var2_-1;
        void var1_-1;
    }

    public static k$_b[] values() {
        return (k$_b[])\u00d300000.clone();
    }

    public static k$_b valueOf(String string) {
        return Enum.valueOf(k$_b.class, string);
    }

    private static final /* synthetic */ k$_b[] o00000() {
        k$_b[] k$_bArray = new k$_b[2];
        k$_b[] k$_bArray2 = k$_bArray;
        k$_bArray[0] = \u00d400000;
        k$_bArray2[1] = super;
        return k$_bArray2;
    }

    static {
        \u00d300000 = k$_b.o00000();
        \u00d200000 = d.o00000(\u00d300000);
    }
}

