/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.c.d;
import b.c.f;

public final class cb$_b
extends Enum {
    public static final /* enum */ cb$_b \u00d500000 = new cb$_b("CHECK_ONLY_LOWER", 0);
    public static final /* enum */ cb$_b \u00d300000 = new cb$_b("CHECK_SUBTYPE_AND_LOWER", 1);
    public static final /* enum */ cb$_b \u00d200000 = new cb$_b("SKIP_LOWER", 2);
    private static final /* synthetic */ cb$_b[] String;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cb$_b() {
        void var2_-1;
        void var1_-1;
    }

    public static cb$_b[] values() {
        return (cb$_b[])String.clone();
    }

    public static cb$_b valueOf(String string) {
        return Enum.valueOf(cb$_b.class, string);
    }

    private static final /* synthetic */ cb$_b[] o00000() {
        cb$_b[] cb$_bArray = new cb$_b[3];
        cb$_b[] cb$_bArray2 = cb$_bArray;
        cb$_bArray[0] = \u00d500000;
        cb$_bArray2[1] = \u00d300000;
        cb$_bArray2[2] = \u00d200000;
        return cb$_bArray2;
    }

    static {
        String = cb$_b.o00000();
        o00000 = d.o00000(String);
    }
}

