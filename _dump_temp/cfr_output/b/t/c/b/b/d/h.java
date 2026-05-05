/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class h
extends Enum {
    public static final /* enum */ h \u00d400000 = new h("BEGINNING", 0);
    public static final /* enum */ h o00000 = new h("MIDDLE", 1);
    public static final /* enum */ h \u00d500000 = new h("AFTER_DOT", 2);
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
        h[] hArray = new h[3];
        h[] hArray2 = hArray;
        hArray[0] = \u00d400000;
        hArray2[1] = o00000;
        hArray2[2] = \u00d500000;
        return hArray2;
    }

    static {
        \u00d300000 = h.o00000();
        new = d.o00000(\u00d300000);
    }
}

