/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p
extends Enum {
    public static final /* enum */ p \u00d400000 = new p("READ_ONLY", 0);
    public static final /* enum */ p Object = new p("MUTABLE", 1);
    private static final /* synthetic */ p[] \u00d200000;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private p() {
        void var2_-1;
        void var1_-1;
    }

    public static p[] values() {
        return (p[])\u00d200000.clone();
    }

    public static p valueOf(String string) {
        return Enum.valueOf(p.class, string);
    }

    private static final /* synthetic */ p[] super() {
        p[] pArray = new p[2];
        p[] pArray2 = pArray;
        pArray[0] = \u00d400000;
        pArray2[1] = Object;
        return pArray2;
    }

    static {
        \u00d200000 = p.super();
        o00000 = d.o00000(\u00d200000);
    }
}

