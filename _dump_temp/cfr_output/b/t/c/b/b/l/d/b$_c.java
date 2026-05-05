/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.bc;
import b.o.d.w;
import b.qd;
import b.t.c.b.b.l.b$_m;
import b.t.c.b.b.l.d.b;
import b.t.c.b.b.l.d.b$_b;
import b.t.c.b.b.l.d.b$_c$_b;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_c {
    private b$_c() {
    }

    public final b super(int n2, e e2, h object) {
        bc bc2;
        b$_m b$_m = ((h)object).o00000(n2);
        if (b$_m == null) {
            return null;
        }
        b$_m b$_m2 = b$_m;
        object = b$_b.\u00d500000.o00000(b$_m2.O\u00f50000() ? Integer.valueOf(b$_m2.doreturn()) : null, b$_m2.\u00d6\u00f40000() ? Integer.valueOf(b$_m2.intreturn()) : null);
        switch (b$_c$_b.o00000[b$_m2.\u00d6\u00f50000().ordinal()]) {
            case 1: {
                bc2 = bc.o00000;
                break;
            }
            case 2: {
                bc2 = bc.\u00d300000;
                break;
            }
            case 3: {
                bc2 = bc.\u00d500000;
                break;
            }
            default: {
                throw new qd();
            }
        }
        bc bc3 = bc2;
        Integer n3 = b$_m2.\u00f4\u00f40000() ? Integer.valueOf(b$_m2.\u00f6\u00f40000()) : null;
        e2 = b$_m2.Objectvoid() ? e2.new(b$_m2.\u00d2\u00f50000()) : null;
        return new b((b$_b)object, b$_m2.\u00d8\u00f40000(), bc3, n3, (String)((Object)e2));
    }

    public /* synthetic */ b$_c(w w2) {
        this();
    }
}

