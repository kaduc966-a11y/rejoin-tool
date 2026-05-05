/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e
extends Enum {
    public static final /* enum */ e new = new e("FLEXIBLE_LOWER", 0);
    public static final /* enum */ e \u00d400000 = new e("FLEXIBLE_UPPER", 1);
    public static final /* enum */ e o00000 = new e("INFLEXIBLE", 2);
    private static final /* synthetic */ e[] \u00d500000;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private e() {
        void var2_-1;
        void var1_-1;
    }

    public static e[] values() {
        return (e[])\u00d500000.clone();
    }

    public static e valueOf(String string) {
        return Enum.valueOf(e.class, string);
    }

    private static final /* synthetic */ e[] super() {
        e[] eArray = new e[3];
        e[] eArray2 = eArray;
        eArray[0] = new;
        eArray2[1] = \u00d400000;
        eArray2[2] = o00000;
        return eArray2;
    }

    static {
        \u00d500000 = e.super();
        \u00d300000 = d.o00000(\u00d500000);
    }
}

