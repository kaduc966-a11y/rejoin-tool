/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.dc;
import b.lb;
import b.o.e.h;
import b.r;
import b.s.ub;
import b.t.c.b.b.b.d;
import b.t.c.b.b.b.j$_b$0;
import b.t.c.b.b.b.j$_b$1;
import b.t.c.b.b.b.j$_c;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j
extends Enum {
    public static final j$_c do;
    private final f \u00f600000;
    private final f \u00f800000;
    private final dc int;
    private final dc \u00d300000;
    public static final Set \u00f400000;
    public static final /* enum */ j class;
    public static final /* enum */ j \u00d4O0000;
    public static final /* enum */ j OO0000;
    public static final /* enum */ j \u00d3O0000;
    public static final /* enum */ j super;
    public static final /* enum */ j \u00d2O0000;
    public static final /* enum */ j \u00d200000;
    public static final /* enum */ j \u00d800000;
    private static final /* synthetic */ j[] \u00d600000;
    private static final /* synthetic */ b.c.f \u00d400000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00f600000 = f.\u00d300000((String)var3_2);
        this.\u00f800000 = f.\u00d300000((String)var3_2 + "Array");
        j j2 = this;
        this.int = r.o00000(lb.\u00d400000, (h)new j$_b$0(j2));
        j2 = this;
        this.\u00d300000 = r.o00000(lb.\u00d400000, (h)new j$_b$1(j2));
    }

    public final f \u00d500000() {
        return this.\u00f600000;
    }

    public final f o00000() {
        return this.\u00f800000;
    }

    public final k \u00d300000() {
        return (k)this.int.\u00d200000();
    }

    public final k new() {
        return (k)this.\u00d300000.\u00d200000();
    }

    public static j[] values() {
        return (j[])\u00d600000.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    private static final k o00000(j j2) {
        return d.oO0000.\u00d200000(j2.\u00f600000);
    }

    private static final k new(j j2) {
        return d.oO0000.\u00d200000(j2.\u00f800000);
    }

    private static final /* synthetic */ j[] \u00d400000() {
        j[] jArray = new j[8];
        j[] jArray2 = jArray;
        jArray[0] = j.class;
        jArray2[1] = \u00d4O0000;
        jArray2[2] = OO0000;
        jArray2[3] = \u00d3O0000;
        jArray2[4] = super;
        jArray2[5] = \u00d2O0000;
        jArray2[6] = \u00d200000;
        jArray2[7] = \u00d800000;
        return jArray2;
    }

    static {
        j.class = new j("BOOLEAN", 0, "Boolean");
        \u00d4O0000 = new j("CHAR", 1, "Char");
        OO0000 = new j("BYTE", 2, "Byte");
        \u00d3O0000 = new j("SHORT", 3, "Short");
        super = new j("INT", 4, "Int");
        \u00d2O0000 = new j("FLOAT", 5, "Float");
        \u00d200000 = new j("LONG", 6, "Long");
        \u00d800000 = new j("DOUBLE", 7, "Double");
        \u00d600000 = j.\u00d400000();
        \u00d400000 = b.c.d.o00000(\u00d600000);
        do = new j$_c(null);
        j[] jArray = new j[7];
        j[] jArray2 = jArray;
        jArray[0] = \u00d4O0000;
        jArray2[1] = OO0000;
        jArray2[2] = \u00d3O0000;
        jArray2[3] = super;
        jArray2[4] = \u00d2O0000;
        jArray2[5] = \u00d200000;
        jArray2[6] = \u00d800000;
        \u00f400000 = ub.\u00d300000((Object[])jArray2);
    }

    static /* synthetic */ k \u00d300000(j j2) {
        return j.o00000(j2);
    }

    static /* synthetic */ k \u00d400000(j j2) {
        return j.new(j2);
    }
}

