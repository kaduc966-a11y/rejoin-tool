/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
extends Enum {
    public static final /* enum */ m \u00d500000 = new m("CONTINUE", 0);
    public static final /* enum */ m o00000 = new m("SKIP_SUBTREE", 1);
    public static final /* enum */ m \u00d400000 = new m("TERMINATE", 2);
    private static final /* synthetic */ m[] \u00d300000;
    private static final /* synthetic */ f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private m() {
        void var2_-1;
        void var1_-1;
    }

    public static m[] values() {
        return (m[])\u00d300000.clone();
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static f super() {
        return new;
    }

    private static final /* synthetic */ m[] \u00d200000() {
        m[] mArray = new m[3];
        m[] mArray2 = mArray;
        mArray[0] = \u00d500000;
        mArray2[1] = o00000;
        mArray2[2] = \u00d400000;
        return mArray2;
    }

    static {
        \u00d300000 = m.\u00d200000();
        new = d.o00000(\u00d300000);
    }
}

