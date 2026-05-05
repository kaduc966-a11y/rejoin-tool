/*
 * Decompiled with CFR 0.152.
 */
package b.h;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b
extends Enum {
    public static final /* enum */ b \u00d400000 = new b("SOURCE", 0);
    public static final /* enum */ b \u00d500000 = new b("BINARY", 1);
    public static final /* enum */ b new = new b("RUNTIME", 2);
    private static final /* synthetic */ b[] \u00d300000;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b() {
        void var2_-1;
        void var1_-1;
    }

    public static b[] values() {
        return (b[])\u00d300000.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static f new() {
        return o00000;
    }

    private static final /* synthetic */ b[] o00000() {
        b[] bArray = new b[3];
        b[] bArray2 = bArray;
        bArray[0] = \u00d400000;
        bArray2[1] = \u00d500000;
        bArray2[2] = new;
        return bArray2;
    }

    static {
        \u00d300000 = b.o00000();
        o00000 = d.o00000(\u00d300000);
    }
}

