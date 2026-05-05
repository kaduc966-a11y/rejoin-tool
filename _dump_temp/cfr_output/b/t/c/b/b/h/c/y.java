/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class y
extends Enum {
    private final String \u00d500000;
    public static final /* enum */ y new = new y("IN", 0, "in");
    public static final /* enum */ y o00000 = new y("OUT", 1, "out");
    public static final /* enum */ y return = new y("INV", 2, "");
    private static final /* synthetic */ y[] \u00d400000;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private y() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d500000 = var3_2;
    }

    public final String toString() {
        return this.\u00d500000;
    }

    public static y[] values() {
        return (y[])\u00d400000.clone();
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    private static final /* synthetic */ y[] o00000() {
        y[] yArray = new y[3];
        y[] yArray2 = yArray;
        yArray[0] = new;
        yArray2[1] = o00000;
        yArray2[2] = return;
        return yArray2;
    }

    static {
        \u00d400000 = y.o00000();
        \u00d300000 = d.o00000(\u00d400000);
    }
}

