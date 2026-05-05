/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
extends Enum {
    public static final /* enum */ h o00000 = new h("SKIP", 0);
    public static final /* enum */ h \u00d400000 = new h("TERMINATE", 1);
    private static final /* synthetic */ h[] Object;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h() {
        void var2_-1;
        void var1_-1;
    }

    public static h[] values() {
        return (h[])Object.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static f \u00d200000() {
        return \u00d200000;
    }

    private static final /* synthetic */ h[] super() {
        h[] hArray = new h[2];
        h[] hArray2 = hArray;
        hArray[0] = o00000;
        hArray2[1] = \u00d400000;
        return hArray2;
    }

    static {
        Object = h.super();
        \u00d200000 = d.o00000(Object);
    }
}

