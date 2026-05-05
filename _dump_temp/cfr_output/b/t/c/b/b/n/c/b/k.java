/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.b;

import b.c.d;
import b.c.f;

public final class k
extends Enum {
    public static final /* enum */ k \u00d300000 = new k("SOURCE", 0);
    public static final /* enum */ k String = new k("BINARY", 1);
    private static final /* synthetic */ k[] \u00d200000;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k() {
        void var2_-1;
        void var1_-1;
    }

    public static k[] values() {
        return (k[])\u00d200000.clone();
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private static final /* synthetic */ k[] o00000() {
        k[] kArray = new k[2];
        k[] kArray2 = kArray;
        kArray[0] = \u00d300000;
        kArray2[1] = String;
        return kArray2;
    }

    static {
        \u00d200000 = k.o00000();
        o00000 = d.o00000(\u00d200000);
    }
}

