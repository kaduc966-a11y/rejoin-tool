/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x
extends Enum {
    public static final /* enum */ x \u00d300000 = new x("FOR_SUBTYPING", 0);
    public static final /* enum */ x \u00d500000 = new x("FOR_INCORPORATION", 1);
    public static final /* enum */ x \u00d400000 = new x("FROM_EXPRESSION", 2);
    private static final /* synthetic */ x[] new;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private x() {
        void var2_-1;
        void var1_-1;
    }

    public static x[] values() {
        return (x[])new.clone();
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }

    private static final /* synthetic */ x[] super() {
        x[] xArray = new x[3];
        x[] xArray2 = xArray;
        xArray[0] = \u00d300000;
        xArray2[1] = \u00d500000;
        xArray2[2] = \u00d400000;
        return xArray2;
    }

    static {
        new = x.super();
        o00000 = d.o00000(new);
    }
}

