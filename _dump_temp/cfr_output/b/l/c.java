/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends Enum {
    public static final /* enum */ c \u00d300000 = new c("TOP_DOWN", 0);
    public static final /* enum */ c \u00d400000 = new c("BOTTOM_UP", 1);
    private static final /* synthetic */ c[] new;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c() {
        void var2_-1;
        void var1_-1;
    }

    public static c[] values() {
        return (c[])new.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static f \u00d200000() {
        return o00000;
    }

    private static final /* synthetic */ c[] super() {
        c[] cArray = new c[2];
        c[] cArray2 = cArray;
        cArray[0] = \u00d300000;
        cArray2[1] = \u00d400000;
        return cArray2;
    }

    static {
        new = c.super();
        o00000 = d.o00000(new);
    }
}

