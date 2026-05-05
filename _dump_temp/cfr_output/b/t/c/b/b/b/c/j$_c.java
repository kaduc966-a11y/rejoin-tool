/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j$_c
extends Enum {
    public static final /* enum */ j$_c \u00d200000 = new j$_c("FROM_DEPENDENCIES", 0);
    public static final /* enum */ j$_c super = new j$_c("FROM_CLASS_LOADER", 1);
    public static final /* enum */ j$_c class = new j$_c("FALLBACK", 2);
    private static final /* synthetic */ j$_c[] \u00d400000;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j$_c() {
        void var2_-1;
        void var1_-1;
    }

    public static j$_c[] values() {
        return (j$_c[])\u00d400000.clone();
    }

    public static j$_c valueOf(String string) {
        return Enum.valueOf(j$_c.class, string);
    }

    private static final /* synthetic */ j$_c[] o00000() {
        j$_c[] j$_cArray = new j$_c[3];
        j$_c[] j$_cArray2 = j$_cArray;
        j$_cArray[0] = \u00d200000;
        j$_cArray2[1] = super;
        j$_cArray2[2] = j$_c.class;
        return j$_cArray2;
    }

    static {
        \u00d400000 = j$_c.o00000();
        \u00d300000 = d.o00000(\u00d400000);
    }
}

