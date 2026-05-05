/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.c.d;
import b.c.f;

public final class m
extends Enum {
    public static final /* enum */ m \u00d400000 = new m("PRETTY", 0);
    public static final /* enum */ m o00000 = new m("DEBUG", 1);
    public static final /* enum */ m \u00d500000 = new m("NONE", 2);
    private static final /* synthetic */ m[] Object;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private m() {
        void var2_-1;
        void var1_-1;
    }

    public static m[] values() {
        return (m[])Object.clone();
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    private static final /* synthetic */ m[] o00000() {
        m[] mArray = new m[3];
        m[] mArray2 = mArray;
        mArray[0] = \u00d400000;
        mArray2[1] = o00000;
        mArray2[2] = \u00d500000;
        return mArray2;
    }

    static {
        Object = m.o00000();
        \u00d200000 = d.o00000(Object);
    }
}

