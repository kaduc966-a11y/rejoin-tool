/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.b;

import b.c.d;
import b.c.f;

public final class e
extends Enum {
    public static final /* enum */ e o00000 = new e("INFLEXIBLE", 0);
    public static final /* enum */ e \u00d500000 = new e("FLEXIBLE_UPPER_BOUND", 1);
    public static final /* enum */ e String = new e("FLEXIBLE_LOWER_BOUND", 2);
    private static final /* synthetic */ e[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private e() {
        void var2_-1;
        void var1_-1;
    }

    public static e[] values() {
        return (e[])\u00d300000.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static final /* synthetic */ e[] o00000() {
        e[] eArray = new e[3];
        e[] eArray2 = eArray;
        eArray[0] = o00000;
        eArray2[1] = \u00d500000;
        eArray2[2] = String;
        return eArray2;
    }

    static {
        \u00d300000 = e.o00000();
        \u00d200000 = d.o00000(\u00d300000);
    }
}

