/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b
extends Enum {
    public static final /* enum */ b o00000 = new b("STABLE", 0);
    public static final /* enum */ b \u00d300000 = new b("UNSTABLE", 1);
    private static final /* synthetic */ b[] \u00d400000;
    private static final /* synthetic */ f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b() {
        void var2_-1;
        void var1_-1;
    }

    public static b[] values() {
        return (b[])\u00d400000.clone();
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    private static final /* synthetic */ b[] o00000() {
        b[] bArray = new b[2];
        b[] bArray2 = bArray;
        bArray[0] = o00000;
        bArray2[1] = \u00d300000;
        return bArray2;
    }

    static {
        \u00d400000 = b.o00000();
        new = d.o00000(\u00d400000);
    }
}

