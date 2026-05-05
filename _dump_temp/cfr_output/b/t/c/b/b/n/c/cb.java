/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.c.d;
import b.c.f;
import b.t.c.b.b.n.c.cb$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class cb
extends Enum {
    public static final cb$_b \u00d800000;
    private final String class;
    public static final /* enum */ cb \u00d600000;
    public static final /* enum */ cb \u00d400000;
    public static final /* enum */ cb super;
    private static final /* synthetic */ cb[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.class = var3_2;
    }

    public final String \u00d200000() {
        return this.class;
    }

    public final boolean super() {
        return this == \u00d400000;
    }

    public final boolean \u00d400000() {
        return this == \u00d600000;
    }

    public static cb[] values() {
        return (cb[])\u00d300000.clone();
    }

    public static cb valueOf(String string) {
        return Enum.valueOf(cb.class, string);
    }

    private static final /* synthetic */ cb[] \u00d300000() {
        cb[] cbArray = new cb[3];
        cb[] cbArray2 = cbArray;
        cbArray[0] = \u00d600000;
        cbArray2[1] = \u00d400000;
        cbArray2[2] = super;
        return cbArray2;
    }

    static {
        \u00d600000 = new cb("IGNORE", 0, "ignore");
        \u00d400000 = new cb("WARN", 1, "warn");
        super = new cb("STRICT", 2, "strict");
        \u00d300000 = cb.\u00d300000();
        \u00d200000 = d.o00000(\u00d300000);
        \u00d800000 = new cb$_b(null);
    }
}

