/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.c.d;
import b.c.f;

public final class lb
extends Enum {
    public static final /* enum */ lb Object = new lb("SYNCHRONIZED", 0);
    public static final /* enum */ lb \u00d400000 = new lb("PUBLICATION", 1);
    public static final /* enum */ lb \u00d500000 = new lb("NONE", 2);
    private static final /* synthetic */ lb[] \u00d200000;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lb() {
        void var2_-1;
        void var1_-1;
    }

    public static lb[] values() {
        return (lb[])\u00d200000.clone();
    }

    public static lb valueOf(String string) {
        return Enum.valueOf(lb.class, string);
    }

    public static f \u00d200000() {
        return o00000;
    }

    private static final /* synthetic */ lb[] o00000() {
        lb[] lbArray = new lb[3];
        lb[] lbArray2 = lbArray;
        lbArray[0] = Object;
        lbArray2[1] = \u00d400000;
        lbArray2[2] = \u00d500000;
        return lbArray2;
    }

    static {
        \u00d200000 = lb.o00000();
        o00000 = d.o00000(\u00d200000);
    }
}

