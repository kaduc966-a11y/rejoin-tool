/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p$_b
extends Enum {
    public static final /* enum */ p$_b \u00d400000 = new p$_b("INSTANCE", 0);
    public static final /* enum */ p$_b \u00d600000 = new p$_b("CONTEXT", 1);
    public static final /* enum */ p$_b class = new p$_b("EXTENSION_RECEIVER", 2);
    public static final /* enum */ p$_b \u00d300000 = new p$_b("VALUE", 3);
    private static final /* synthetic */ p$_b[] \u00d200000;
    private static final /* synthetic */ f super;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private p$_b() {
        void var2_-1;
        void var1_-1;
    }

    public static p$_b[] values() {
        return (p$_b[])\u00d200000.clone();
    }

    public static p$_b valueOf(String string) {
        return Enum.valueOf(p$_b.class, string);
    }

    public static f o00000() {
        return super;
    }

    private static final /* synthetic */ p$_b[] \u00d200000() {
        p$_b[] p$_bArray = new p$_b[4];
        p$_b[] p$_bArray2 = p$_bArray;
        p$_bArray[0] = \u00d400000;
        p$_bArray2[1] = \u00d600000;
        p$_bArray2[2] = p$_b.class;
        p$_bArray2[3] = \u00d300000;
        return p$_bArray2;
    }

    static {
        \u00d200000 = p$_b.\u00d200000();
        super = d.o00000(\u00d200000);
    }
}

