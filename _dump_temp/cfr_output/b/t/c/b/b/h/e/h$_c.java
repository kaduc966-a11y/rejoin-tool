/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.c.d;
import b.c.f;
import b.o.d.w;
import b.t.c.b.b.h.e.h$_c$_b;
import b.t.c.b.b.h.e.h$_c$_c;
import b.t.c.b.b.h.e.h$_c$_d;
import b.t.c.b.b.h.e.h$_c$_e;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.sb;
import b.t.c.b.b.h.vc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
abstract class h$_c
extends Enum {
    public static final /* enum */ h$_c return = new h$_c$_e("START", 0);
    public static final /* enum */ h$_c \u00d500000 = new h$_c$_c("ACCEPT_NULL", 1);
    public static final /* enum */ h$_c \u00d300000 = new h$_c$_b("UNKNOWN", 2);
    public static final /* enum */ h$_c \u00d400000 = new h$_c$_d("NOT_NULL", 3);
    private static final /* synthetic */ h$_c[] new;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h$_c() {
        void var2_-1;
        void var1_-1;
    }

    public abstract h$_c o00000(l var1);

    protected final h$_c new(l l2) {
        if (l2.\u00f5\u00d6\u00d2000()) {
            return \u00d500000;
        }
        if (l2 instanceof sb && ((sb)l2).\u00d3\u00f5\u00d2000() instanceof vc) {
            return \u00d400000;
        }
        if (!(l2 instanceof vc) && b.t.c.b.b.h.e.l.o00000.o00000(l2)) {
            return \u00d400000;
        }
        return \u00d300000;
    }

    public static h$_c[] values() {
        return (h$_c[])new.clone();
    }

    public static h$_c valueOf(String string) {
        return Enum.valueOf(h$_c.class, string);
    }

    private static final /* synthetic */ h$_c[] o00000() {
        h$_c[] h$_cArray = new h$_c[4];
        h$_c[] h$_cArray2 = h$_cArray;
        h$_cArray[0] = return;
        h$_cArray2[1] = \u00d500000;
        h$_cArray2[2] = \u00d300000;
        h$_cArray2[3] = \u00d400000;
        return h$_cArray2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ h$_c(w w2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        new = h$_c.o00000();
        o00000 = d.o00000(new);
    }
}

