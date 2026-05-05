/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.d$_b;
import b.t.c.b.b.d.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k
extends Enum {
    private final d return;
    private final f \u00f400000;
    private final d \u00d300000;
    public static final /* enum */ k \u00d500000 = new k("UBYTE", 0, d$_b.o00000(d.String, "kotlin/UByte", false, 2, null));
    public static final /* enum */ k o00000 = new k("USHORT", 1, d$_b.o00000(d.String, "kotlin/UShort", false, 2, null));
    public static final /* enum */ k \u00f500000 = new k("UINT", 2, d$_b.o00000(d.String, "kotlin/UInt", false, 2, null));
    public static final /* enum */ k \u00d800000 = new k("ULONG", 3, d$_b.o00000(d.String, "kotlin/ULong", false, 2, null));
    private static final /* synthetic */ k[] \u00d400000;
    private static final /* synthetic */ b.c.f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.return = var3_2;
        this.\u00f400000 = this.return.o00000();
        this.\u00d300000 = new d(this.return.\u00d800000(), f.\u00d300000(this.\u00f400000.\u00d400000() + "Array"));
    }

    public final d \u00d300000() {
        return this.return;
    }

    public final f super() {
        return this.\u00f400000;
    }

    public final d \u00d200000() {
        return this.\u00d300000;
    }

    public static k[] values() {
        return (k[])\u00d400000.clone();
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private static final /* synthetic */ k[] \u00d400000() {
        k[] kArray = new k[4];
        k[] kArray2 = kArray;
        kArray[0] = \u00d500000;
        kArray2[1] = o00000;
        kArray2[2] = \u00f500000;
        kArray2[3] = \u00d800000;
        return kArray2;
    }

    static {
        \u00d400000 = k.\u00d400000();
        new = b.c.d.o00000(\u00d400000);
    }
}

