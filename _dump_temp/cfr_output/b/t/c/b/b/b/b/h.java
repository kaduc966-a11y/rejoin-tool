/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.b;

import b.c.d;
import b.c.f;
import b.t.c.b.b.b.b.h$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
extends Enum {
    public static final h$_b \u00f400000;
    public static final /* enum */ h o00000;
    public static final /* enum */ h \u00d800000;
    public static final /* enum */ h \u00d500000;
    public static final /* enum */ h return;
    public static final /* enum */ h \u00d400000;
    private static final /* synthetic */ h[] \u00d300000;
    private static final /* synthetic */ f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h() {
        void var2_-1;
        void var1_-1;
    }

    public static h[] values() {
        return (h[])\u00d300000.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static final /* synthetic */ h[] o00000() {
        h[] hArray = new h[5];
        h[] hArray2 = hArray;
        hArray[0] = o00000;
        hArray2[1] = \u00d800000;
        hArray2[2] = \u00d500000;
        hArray2[3] = return;
        hArray2[4] = \u00d400000;
        return hArray2;
    }

    static {
        o00000 = new h("Function", 0);
        \u00d800000 = new h("SuspendFunction", 1);
        \u00d500000 = new h("KFunction", 2);
        return = new h("KSuspendFunction", 3);
        \u00d400000 = new h("UNKNOWN", 4);
        \u00d300000 = h.o00000();
        new = d.o00000(\u00d300000);
        \u00f400000 = new h$_b(null);
    }
}

