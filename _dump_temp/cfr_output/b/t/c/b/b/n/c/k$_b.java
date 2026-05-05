/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.c.d;
import b.c.f;
import b.o.d.w;
import b.t.c.b.b.n.c.k$_b$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class k$_b
extends Enum {
    private final Object o00000;
    public static final /* enum */ k$_b \u00d800000 = new k$_b("NULL", 0, null);
    public static final /* enum */ k$_b \u00d400000 = new k$_b("INDEX", 1, (Object)-1);
    public static final /* enum */ k$_b return = new k$_b("FALSE", 2, (Object)Boolean.FALSE);
    public static final /* enum */ k$_b \u00d300000 = new k$_b$_b("MAP_GET_OR_DEFAULT", 3);
    private static final /* synthetic */ k$_b[] \u00d500000;
    private static final /* synthetic */ f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k$_b() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o00000 = var3_2;
    }

    public static k$_b[] values() {
        return (k$_b[])\u00d500000.clone();
    }

    public static k$_b valueOf(String string) {
        return Enum.valueOf(k$_b.class, string);
    }

    private static final /* synthetic */ k$_b[] o00000() {
        k$_b[] k$_bArray = new k$_b[4];
        k$_b[] k$_bArray2 = k$_bArray;
        k$_bArray[0] = \u00d800000;
        k$_bArray2[1] = \u00d400000;
        k$_bArray2[2] = return;
        k$_bArray2[3] = \u00d300000;
        return k$_bArray2;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ k$_b(Object object, w w2) {
        this((String)var1_-1, (int)w2, var3_2);
        void var3_2;
        void var1_-1;
    }

    static {
        \u00d500000 = k$_b.o00000();
        new = d.o00000(\u00d500000);
    }
}

