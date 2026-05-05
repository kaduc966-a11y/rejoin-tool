/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.c.d;
import b.c.f;
import b.t.c.b.b.q.hc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class r$_g
extends Enum {
    public static final /* enum */ r$_g Object = new r$_g("DECLARED", 0);
    public static final /* enum */ r$_g \u00d400000 = new r$_g("INHERITED", 1);
    private static final /* synthetic */ r$_g[] \u00d200000;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private r$_g() {
        void var2_-1;
        void var1_-1;
    }

    public final boolean super(hc hc2) {
        return hc2.O\u00f5o000().o00000() == (this == Object);
    }

    public static r$_g[] values() {
        return (r$_g[])\u00d200000.clone();
    }

    public static r$_g valueOf(String string) {
        return Enum.valueOf(r$_g.class, string);
    }

    private static final /* synthetic */ r$_g[] super() {
        r$_g[] r$_gArray = new r$_g[2];
        r$_g[] r$_gArray2 = r$_gArray;
        r$_gArray[0] = Object;
        r$_gArray2[1] = \u00d400000;
        return r$_gArray2;
    }

    static {
        \u00d200000 = r$_g.super();
        o00000 = d.o00000(\u00d200000);
    }
}

