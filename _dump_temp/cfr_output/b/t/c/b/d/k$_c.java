/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k$_c
extends Enum {
    public static final /* enum */ k$_c super = new k$_c("CALL_BY_NAME", 0);
    public static final /* enum */ k$_c \u00d400000 = new k$_c("POSITIONAL_CALL", 1);
    private static final /* synthetic */ k$_c[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k$_c() {
        void var2_-1;
        void var1_-1;
    }

    public static k$_c[] values() {
        return (k$_c[])\u00d300000.clone();
    }

    public static k$_c valueOf(String string) {
        return Enum.valueOf(k$_c.class, string);
    }

    private static final /* synthetic */ k$_c[] o00000() {
        k$_c[] k$_cArray = new k$_c[2];
        k$_c[] k$_cArray2 = k$_cArray;
        k$_cArray[0] = super;
        k$_cArray2[1] = \u00d400000;
        return k$_cArray2;
    }

    static {
        \u00d300000 = k$_c.o00000();
        \u00d200000 = d.o00000(\u00d300000);
    }
}

