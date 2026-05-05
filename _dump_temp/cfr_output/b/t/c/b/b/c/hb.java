/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;

public final class hb
extends Enum {
    public static final /* enum */ hb \u00d500000 = new hb("INVARIANT", 0);
    public static final /* enum */ hb \u00d200000 = new hb("IN", 1);
    public static final /* enum */ hb o00000 = new hb("OUT", 2);
    private static final /* synthetic */ hb[] String;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hb() {
        void var2_-1;
        void var1_-1;
    }

    public static hb[] values() {
        return (hb[])String.clone();
    }

    public static hb valueOf(String string) {
        return Enum.valueOf(hb.class, string);
    }

    private static final /* synthetic */ hb[] o00000() {
        hb[] hbArray = new hb[3];
        hb[] hbArray2 = hbArray;
        hbArray[0] = \u00d500000;
        hbArray2[1] = \u00d200000;
        hbArray2[2] = o00000;
        return hbArray2;
    }

    static {
        String = hb.o00000();
        \u00d300000 = d.o00000(String);
    }
}

