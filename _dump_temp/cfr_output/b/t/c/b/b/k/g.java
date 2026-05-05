/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.c.d;
import b.c.f;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g
extends Enum {
    private final boolean o00000;
    private final boolean \u00d800000;
    public static final /* enum */ g \u00d600000 = new g("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final /* enum */ g \u00d500000 = new g("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final /* enum */ g String = new g("ALWAYS_PARENTHESIZED", 2, true, true);
    private static final /* synthetic */ g[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - void declaration
     */
    private g() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o00000 = var3_2;
        this.\u00d800000 = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ g(boolean bl, boolean bl2, int n2, w object) {
        void var1_-1;
        void var5_4;
        if ((var5_4 & 1) != 0) {
            n2 = 0;
        }
        if ((var5_4 & 2) != 0) {
            object = false;
        }
        this((String)var1_-1, bl2 ? 1 : 0, n2 != 0, (boolean)object);
    }

    public final boolean super() {
        return this.o00000;
    }

    public final boolean \u00d200000() {
        return this.\u00d800000;
    }

    public static g[] values() {
        return (g[])\u00d300000.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static final /* synthetic */ g[] \u00d300000() {
        g[] gArray = new g[3];
        g[] gArray2 = gArray;
        gArray[0] = \u00d600000;
        gArray2[1] = \u00d500000;
        gArray2[2] = String;
        return gArray2;
    }

    static {
        \u00d300000 = g.\u00d300000();
        \u00d200000 = d.o00000(\u00d300000);
    }
}

