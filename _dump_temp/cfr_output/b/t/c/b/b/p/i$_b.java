/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.i$1;
import b.t.c.b.b.p.i$_b$1;
import b.t.c.b.b.p.i$_b$2;
import b.t.c.b.b.p.i$_b$3;
import b.t.c.b.b.p.i$_b$4;
import b.t.c.b.b.p.i$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class i$_b
extends Enum {
    public static final /* enum */ i$_b \u00f5O0000 = new i$_b("DOUBLE", 0, i$_c.\u00f600000, 1);
    public static final /* enum */ i$_b \u00f500000 = new i$_b("FLOAT", 1, i$_c.float, 5);
    public static final /* enum */ i$_b Object = new i$_b("INT64", 2, i$_c.Object, 0);
    public static final /* enum */ i$_b OO0000 = new i$_b("UINT64", 3, i$_c.Object, 0);
    public static final /* enum */ i$_b \u00d400000 = new i$_b("INT32", 4, i$_c.\u00d200000, 0);
    public static final /* enum */ i$_b \u00d4O0000 = new i$_b("FIXED64", 5, i$_c.Object, 1);
    public static final /* enum */ i$_b \u00d5O0000 = new i$_b("FIXED32", 6, i$_c.\u00d200000, 5);
    public static final /* enum */ i$_b \u00d6O0000 = new i$_b("BOOL", 7, i$_c.\u00d600000, 0);
    public static final /* enum */ i$_b \u00f400000 = new i$_b$1(i$_c.\u00f500000, 2);
    public static final /* enum */ i$_b \u00f4O0000 = new i$_b$2(i$_c.\u00f400000, 3);
    public static final /* enum */ i$_b o00000 = new i$_b$3(i$_c.\u00f400000, 2);
    public static final /* enum */ i$_b \u00d200000 = new i$_b$4(i$_c.\u00d500000, 2);
    public static final /* enum */ i$_b oO0000 = new i$_b("UINT32", 12, i$_c.\u00d200000, 0);
    public static final /* enum */ i$_b \u00d2O0000 = new i$_b("ENUM", 13, i$_c.o00000, 0);
    public static final /* enum */ i$_b float = new i$_b("SFIXED32", 14, i$_c.\u00d200000, 5);
    public static final /* enum */ i$_b \u00f600000 = new i$_b("SFIXED64", 15, i$_c.Object, 1);
    public static final /* enum */ i$_b void = new i$_b("SINT32", 16, i$_c.\u00d200000, 0);
    public static final /* enum */ i$_b \u00d500000 = new i$_b("SINT64", 17, i$_c.Object, 0);
    private final i$_c \u00d600000;
    private final int supersuper;
    private static final /* synthetic */ i$_b[] public;

    public static i$_b[] values() {
        return (i$_b[])public.clone();
    }

    public static i$_b valueOf(String string) {
        return Enum.valueOf(i$_b.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private i$_b() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d600000 = var3_2;
        this.supersuper = var4_1;
    }

    public i$_c \u00d200000() {
        return this.\u00d600000;
    }

    public int \u00d300000() {
        return this.supersuper;
    }

    public boolean super() {
        return true;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ i$_b(i$_c i$_c, int n2, i$1 i$1) {
        this((String)var1_-1, n2, (i$_c)((Object)i$1), (int)var4_3);
        void var4_3;
        void var1_-1;
    }

    static {
        public = new i$_b[]{\u00f5O0000, \u00f500000, Object, OO0000, \u00d400000, \u00d4O0000, \u00d5O0000, \u00d6O0000, \u00f400000, \u00f4O0000, o00000, \u00d200000, oO0000, \u00d2O0000, float, \u00f600000, void, \u00d500000};
    }
}

