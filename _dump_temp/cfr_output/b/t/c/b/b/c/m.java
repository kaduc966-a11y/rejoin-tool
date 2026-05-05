/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;
import b.t.c.b.b.c.b.j;
import b.t.c.b.b.l.d.l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
extends Enum {
    private final j \u00d200000;
    public static final /* enum */ m \u00d600000 = new m("DECLARATION", 0, 0);
    public static final /* enum */ m super = new m("FAKE_OVERRIDE", 1, 1);
    public static final /* enum */ m \u00d800000 = new m("DELEGATION", 2, 2);
    public static final /* enum */ m \u00d300000 = new m("SYNTHESIZED", 3, 3);
    private static final /* synthetic */ m[] class;
    private static final /* synthetic */ f \u00d400000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private m() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d200000 = new j(l.\u00f5o0000, (int)var3_2);
    }

    public final j new() {
        return this.\u00d200000;
    }

    public static m[] values() {
        return (m[])m.class.clone();
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static f o00000() {
        return \u00d400000;
    }

    private static final /* synthetic */ m[] \u00d300000() {
        m[] mArray = new m[4];
        m[] mArray2 = mArray;
        mArray[0] = \u00d600000;
        mArray2[1] = super;
        mArray2[2] = \u00d800000;
        mArray2[3] = \u00d300000;
        return mArray2;
    }

    static {
        m.class = m.\u00d300000();
        \u00d400000 = d.o00000(m.class);
    }
}

