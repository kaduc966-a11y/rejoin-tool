/*
 * Decompiled with CFR 0.152.
 */
package b.r.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends Enum {
    public static final /* enum */ c \u00d500000 = new c("COROUTINE_SUSPENDED", 0);
    public static final /* enum */ c \u00d400000 = new c("UNDECIDED", 1);
    public static final /* enum */ c o00000 = new c("RESUMED", 2);
    private static final /* synthetic */ c[] \u00d300000;
    private static final /* synthetic */ f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c() {
        void var2_-1;
        void var1_-1;
    }

    public static c[] values() {
        return (c[])\u00d300000.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static f \u00d200000() {
        return new;
    }

    private static final /* synthetic */ c[] o00000() {
        c[] cArray = new c[3];
        c[] cArray2 = cArray;
        cArray[0] = \u00d500000;
        cArray2[1] = \u00d400000;
        cArray2[2] = o00000;
        return cArray2;
    }

    static {
        \u00d300000 = c.o00000();
        new = d.o00000(\u00d300000);
    }
}

