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
public final class o
extends Enum {
    private final d \u00d800000;
    private final f new;
    public static final /* enum */ o return = new o("UBYTEARRAY", 0, d$_b.o00000(d.String, "kotlin/UByteArray", false, 2, null));
    public static final /* enum */ o o00000 = new o("USHORTARRAY", 1, d$_b.o00000(d.String, "kotlin/UShortArray", false, 2, null));
    public static final /* enum */ o \u00f400000 = new o("UINTARRAY", 2, d$_b.o00000(d.String, "kotlin/UIntArray", false, 2, null));
    public static final /* enum */ o \u00d500000 = new o("ULONGARRAY", 3, d$_b.o00000(d.String, "kotlin/ULongArray", false, 2, null));
    private static final /* synthetic */ o[] \u00d400000;
    private static final /* synthetic */ b.c.f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private o() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d800000 = var3_2;
        this.new = this.\u00d800000.o00000();
    }

    public final f new() {
        return this.new;
    }

    public static o[] values() {
        return (o[])\u00d400000.clone();
    }

    public static o valueOf(String string) {
        return Enum.valueOf(o.class, string);
    }

    private static final /* synthetic */ o[] o00000() {
        o[] oArray = new o[4];
        o[] oArray2 = oArray;
        oArray[0] = return;
        oArray2[1] = o00000;
        oArray2[2] = \u00f400000;
        oArray2[3] = \u00d500000;
        return oArray2;
    }

    static {
        \u00d400000 = o.o00000();
        \u00d300000 = b.c.d.o00000(\u00d400000);
    }
}

