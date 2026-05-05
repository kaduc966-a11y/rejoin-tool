/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class t
extends Enum {
    public static final /* enum */ t o00000 = new t("SUPERTYPE", 0);
    public static final /* enum */ t \u00d200000 = new t("COMMON", 1);
    private static final /* synthetic */ t[] String;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private t() {
        void var2_-1;
        void var1_-1;
    }

    public static t[] values() {
        return (t[])String.clone();
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    private static final /* synthetic */ t[] super() {
        t[] tArray = new t[2];
        t[] tArray2 = tArray;
        tArray[0] = o00000;
        tArray2[1] = \u00d200000;
        return tArray2;
    }

    static {
        String = t.super();
        \u00d300000 = d.o00000(String);
    }
}

