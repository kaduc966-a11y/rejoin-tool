/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.c.d;
import b.c.f;
import java.util.concurrent.TimeUnit;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
extends Enum {
    private final TimeUnit super;
    public static final /* enum */ m \u00d300000 = new m("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final /* enum */ m \u00d200000 = new m("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final /* enum */ m \u00f400000 = new m("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final /* enum */ m \u00d600000 = new m("SECONDS", 3, TimeUnit.SECONDS);
    public static final /* enum */ m int = new m("MINUTES", 4, TimeUnit.MINUTES);
    public static final /* enum */ m \u00d800000 = new m("HOURS", 5, TimeUnit.HOURS);
    public static final /* enum */ m \u00f600000 = new m("DAYS", 6, TimeUnit.DAYS);
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
        this.super = var3_2;
    }

    public final TimeUnit \u00d300000() {
        return this.super;
    }

    public static m[] values() {
        return (m[])m.class.clone();
    }

    public static m valueOf(String string) {
        return Enum.valueOf(m.class, string);
    }

    public static f \u00d200000() {
        return \u00d400000;
    }

    private static final /* synthetic */ m[] super() {
        m[] mArray = new m[7];
        m[] mArray2 = mArray;
        mArray[0] = \u00d300000;
        mArray2[1] = \u00d200000;
        mArray2[2] = \u00f400000;
        mArray2[3] = \u00d600000;
        mArray2[4] = int;
        mArray2[5] = \u00d800000;
        mArray2[6] = \u00f600000;
        return mArray2;
    }

    static {
        m.class = m.super();
        \u00d400000 = d.o00000(m.class);
    }
}

