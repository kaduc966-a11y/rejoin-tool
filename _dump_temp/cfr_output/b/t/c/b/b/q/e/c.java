/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.e;

import b.c.d;
import b.c.f;
import b.o.d.w;
import b.t.c.b.b.g.c.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends Enum {
    private final String \u00f800000;
    public static final /* enum */ c \u00f500000 = new c("ALL", 0, null, 1, null);
    public static final /* enum */ c if = new c("FIELD", 1, null, 1, null);
    public static final /* enum */ c new = new c("FILE", 2, null, 1, null);
    public static final /* enum */ c oO0000 = new c("PROPERTY", 3, null, 1, null);
    public static final /* enum */ c OO0000 = new c("PROPERTY_GETTER", 4, "get");
    public static final /* enum */ c \u00d400000 = new c("PROPERTY_SETTER", 5, "set");
    public static final /* enum */ c \u00d300000 = new c("RECEIVER", 6, null, 1, null);
    public static final /* enum */ c return = new c("CONSTRUCTOR_PARAMETER", 7, "param");
    public static final /* enum */ c o00000 = new c("SETTER_PARAMETER", 8, "setparam");
    public static final /* enum */ c \u00d500000 = new c("PROPERTY_DELEGATE_FIELD", 9, "delegate");
    private static final /* synthetic */ c[] \u00f400000;
    private static final /* synthetic */ f \u00d800000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        String string2 = var3_2;
        if (string2 == null) {
            string2 = b.\u00d200000(this.name());
        }
        this.\u00f800000 = string2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ c(String string, int n2, w w2) {
        void var3_4;
        void var1_-1;
        void var4_5;
        if ((var4_5 & 1) != 0) {
            Object var3_3 = null;
        }
        this((String)var1_-1, n2, (String)var3_4);
    }

    public final String new() {
        return this.\u00f800000;
    }

    public static c[] values() {
        return (c[])\u00f400000.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private static final /* synthetic */ c[] o00000() {
        c[] cArray = new c[10];
        c[] cArray2 = cArray;
        cArray[0] = \u00f500000;
        cArray2[1] = if;
        cArray2[2] = new;
        cArray2[3] = oO0000;
        cArray2[4] = OO0000;
        cArray2[5] = \u00d400000;
        cArray2[6] = \u00d300000;
        cArray2[7] = return;
        cArray2[8] = o00000;
        cArray2[9] = \u00d500000;
        return cArray2;
    }

    static {
        \u00f400000 = c.o00000();
        \u00d800000 = d.o00000(\u00f400000);
    }
}

