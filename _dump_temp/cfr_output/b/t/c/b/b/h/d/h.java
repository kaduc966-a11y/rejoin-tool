/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.d;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
extends Enum {
    private final String \u00d600000;
    public static final /* enum */ h null = new h("ERROR_CLASS", 0, "<Error class: %s>");
    public static final /* enum */ h \u00d300000 = new h("ERROR_FUNCTION", 1, "<Error function>");
    public static final /* enum */ h o00000 = new h("ERROR_SCOPE", 2, "<Error scope>");
    public static final /* enum */ h String = new h("ERROR_MODULE", 3, "<Error module>");
    public static final /* enum */ h \u00f600000 = new h("ERROR_PROPERTY", 4, "<Error property>");
    public static final /* enum */ h \u00d800000 = new h("ERROR_TYPE", 5, "[Error type: %s]");
    public static final /* enum */ h \u00f500000 = new h("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");
    private static final /* synthetic */ h[] \u00d500000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d600000 = var3_2;
    }

    public final String \u00d200000() {
        return this.\u00d600000;
    }

    public static h[] values() {
        return (h[])\u00d500000.clone();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    private static final /* synthetic */ h[] o00000() {
        h[] hArray = new h[7];
        h[] hArray2 = hArray;
        hArray[0] = null;
        hArray2[1] = \u00d300000;
        hArray2[2] = o00000;
        hArray2[3] = String;
        hArray2[4] = \u00f600000;
        hArray2[5] = \u00d800000;
        hArray2[6] = \u00f500000;
        return hArray2;
    }

    static {
        \u00d500000 = h.o00000();
        \u00d200000 = d.o00000(\u00d500000);
    }
}

