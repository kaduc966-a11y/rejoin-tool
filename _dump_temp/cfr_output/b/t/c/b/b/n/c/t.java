/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class t
extends Enum {
    private final String \u00d800000;
    public static final /* enum */ t new = new t("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final /* enum */ t \u00f500000 = new t("VALUE_PARAMETER", 1, "PARAMETER");
    public static final /* enum */ t \u00d500000 = new t("FIELD", 2, "FIELD");
    public static final /* enum */ t return = new t("TYPE_USE", 3, "TYPE_USE");
    public static final /* enum */ t \u00f400000 = new t("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final /* enum */ t o00000 = new t("TYPE_PARAMETER", 5, "TYPE_PARAMETER");
    private static final /* synthetic */ t[] \u00d400000;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private t() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d800000 = var3_2;
    }

    public final String o00000() {
        return this.\u00d800000;
    }

    public static t[] values() {
        return (t[])\u00d400000.clone();
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    private static final /* synthetic */ t[] \u00d200000() {
        t[] tArray = new t[6];
        t[] tArray2 = tArray;
        tArray[0] = new;
        tArray2[1] = \u00f500000;
        tArray2[2] = \u00d500000;
        tArray2[3] = return;
        tArray2[4] = \u00f400000;
        tArray2[5] = o00000;
        return tArray2;
    }

    static {
        \u00d400000 = t.\u00d200000();
        \u00d300000 = d.o00000(\u00d400000);
    }
}

