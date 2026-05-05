/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.e;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
extends Enum {
    public static final /* enum */ h \u00d200000 = new h("RUNTIME", 0);
    public static final /* enum */ h class = new h("BINARY", 1);
    public static final /* enum */ h \u00d400000 = new h("SOURCE", 2);
    private static final /* synthetic */ h[] \u00d300000;
    private static final /* synthetic */ f super;

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

    private static final /* synthetic */ h[] super() {
        h[] hArray = new h[3];
        h[] hArray2 = hArray;
        hArray[0] = \u00d200000;
        hArray2[1] = h.class;
        hArray2[2] = \u00d400000;
        return hArray2;
    }

    static {
        \u00d300000 = h.super();
        super = d.o00000(\u00d300000);
    }
}

