/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.c.d;
import b.c.f;

final class r$_c$_b
extends Enum {
    public static final /* enum */ r$_c$_b String = new r$_c$_b("COMMON_SUPER_TYPE", 0);
    public static final /* enum */ r$_c$_b o00000 = new r$_c$_b("INTERSECTION_TYPE", 1);
    private static final /* synthetic */ r$_c$_b[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private r$_c$_b() {
        void var2_-1;
        void var1_-1;
    }

    public static r$_c$_b[] values() {
        return (r$_c$_b[])\u00d300000.clone();
    }

    public static r$_c$_b valueOf(String string) {
        return Enum.valueOf(r$_c$_b.class, string);
    }

    private static final /* synthetic */ r$_c$_b[] o00000() {
        r$_c$_b[] r$_c$_bArray = new r$_c$_b[2];
        r$_c$_b[] r$_c$_bArray2 = r$_c$_bArray;
        r$_c$_bArray[0] = String;
        r$_c$_bArray2[1] = o00000;
        return r$_c$_bArray2;
    }

    static {
        \u00d300000 = r$_c$_b.o00000();
        \u00d200000 = d.o00000(\u00d300000);
    }
}

