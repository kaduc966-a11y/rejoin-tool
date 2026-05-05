/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.c.d;
import b.c.f;

public final class i
extends Enum {
    public static final /* enum */ i \u00d400000 = new i("RENDER_OVERRIDE", 0);
    public static final /* enum */ i \u00d500000 = new i("RENDER_OPEN", 1);
    public static final /* enum */ i Object = new i("RENDER_OPEN_OVERRIDE", 2);
    private static final /* synthetic */ i[] \u00d200000;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private i() {
        void var2_-1;
        void var1_-1;
    }

    public static i[] values() {
        return (i[])\u00d200000.clone();
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static final /* synthetic */ i[] o00000() {
        i[] iArray = new i[3];
        i[] iArray2 = iArray;
        iArray[0] = \u00d400000;
        iArray2[1] = \u00d500000;
        iArray2[2] = Object;
        return iArray2;
    }

    static {
        \u00d200000 = i.o00000();
        o00000 = d.o00000(\u00d200000);
    }
}

