/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class w
extends Enum {
    private final String \u00d800000;
    private final boolean new;
    private final boolean \u00f500000;
    private final int \u00f400000;
    public static final /* enum */ w \u00d400000 = new w("INVARIANT", 0, "", true, true, 0);
    public static final /* enum */ w o00000 = new w("IN_VARIANCE", 1, "in", true, false, -1);
    public static final /* enum */ w return = new w("OUT_VARIANCE", 2, "out", false, true, 1);
    private static final /* synthetic */ w[] \u00d500000;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private w(boolean bl, int n2) {
        void var6_4;
        void var5_3;
        void var2_-1;
        void var1_-1;
        this.\u00d800000 = (String)bl;
        this.new = n2;
        this.\u00f500000 = var5_3;
        this.\u00f400000 = var6_4;
    }

    public final String \u00d200000() {
        return this.\u00d800000;
    }

    public final boolean super() {
        return this.\u00f500000;
    }

    public final String toString() {
        return this.\u00d800000;
    }

    public static w[] values() {
        return (w[])\u00d500000.clone();
    }

    public static w valueOf(String string) {
        return Enum.valueOf(w.class, string);
    }

    private static final /* synthetic */ w[] \u00d300000() {
        w[] wArray = new w[3];
        w[] wArray2 = wArray;
        wArray[0] = \u00d400000;
        wArray2[1] = o00000;
        wArray2[2] = return;
        return wArray2;
    }

    static {
        \u00d500000 = w.\u00d300000();
        \u00d300000 = d.o00000(\u00d500000);
    }
}

