/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
extends Enum {
    public static final /* enum */ h \u00d500000 = new h("UNSPECIFIED", 0);
    public static final /* enum */ h \u00d400000 = new h("MUST_USE", 1);
    public static final /* enum */ h \u00d300000 = new h("EXPLICITLY_IGNORABLE", 2);
    private static final /* synthetic */ h[] new;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h() {
        void var2_-1;
        void var1_-1;
    }

    public static h[] values() {
        return (h[])new.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static f o00000() {
        return o00000;
    }

    private static final /* synthetic */ h[] new() {
        h[] hArray = new h[3];
        h[] hArray2 = hArray;
        hArray[0] = \u00d500000;
        hArray2[1] = \u00d400000;
        hArray2[2] = \u00d300000;
        return hArray2;
    }

    static {
        new = h.new();
        o00000 = d.o00000(new);
    }
}

