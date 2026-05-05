/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;

public final class c
extends Enum {
    public static final /* enum */ c String = new c("RETURNS_CONSTANT", 0);
    public static final /* enum */ c \u00d300000 = new c("CALLS", 1);
    public static final /* enum */ c \u00d500000 = new c("RETURNS_NOT_NULL", 2);
    private static final /* synthetic */ c[] \u00d200000;
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
        return (c[])\u00d200000.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static final /* synthetic */ c[] o00000() {
        c[] cArray = new c[3];
        c[] cArray2 = cArray;
        cArray[0] = String;
        cArray2[1] = \u00d300000;
        cArray2[2] = \u00d500000;
        return cArray2;
    }

    static {
        \u00d200000 = c.o00000();
        o00000 = d.o00000(\u00d200000);
    }
}

