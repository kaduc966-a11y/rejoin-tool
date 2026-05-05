/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bc
extends Enum {
    public static final /* enum */ bc o00000 = new bc("WARNING", 0);
    public static final /* enum */ bc \u00d300000 = new bc("ERROR", 1);
    public static final /* enum */ bc \u00d500000 = new bc("HIDDEN", 2);
    private static final /* synthetic */ bc[] String;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bc() {
        void var2_-1;
        void var1_-1;
    }

    public static bc[] values() {
        return (bc[])String.clone();
    }

    public static bc valueOf(String string) {
        return Enum.valueOf(bc.class, string);
    }

    public static f \u00d200000() {
        return \u00d200000;
    }

    private static final /* synthetic */ bc[] super() {
        bc[] bcArray = new bc[3];
        bc[] bcArray2 = bcArray;
        bcArray[0] = o00000;
        bcArray2[1] = \u00d300000;
        bcArray2[2] = \u00d500000;
        return bcArray2;
    }

    static {
        String = bc.super();
        \u00d200000 = d.o00000(String);
    }
}

