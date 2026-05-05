/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.o.d.w;
import b.o.e.g;
import b.qd;
import b.t.c.b.b.k.b;
import b.t.c.b.b.k.b$_d$_b;
import b.t.c.b.b.k.e;
import b.t.c.b.b.k.l;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.k;

public final class b$_d {
    private b$_d() {
    }

    public final b o00000(g g2) {
        e e2 = new e();
        g2.\u00f800000(e2);
        e2.O\u00d30000();
        return new l(e2);
    }

    public final String o00000(k k2) {
        k k3 = k2;
        if (k3 instanceof h) {
            return "typealias";
        }
        if (k3 instanceof ib) {
            if (((ib)k2).\u00d5o\u00d2000()) {
                return "companion object";
            }
            switch (b$_d$_b.o00000[((ib)k2).privateintsuper().ordinal()]) {
                case 1: {
                    return "class";
                }
                case 2: {
                    return "interface";
                }
                case 3: {
                    return "enum class";
                }
                case 4: {
                    return "object";
                }
                case 5: {
                    return "annotation class";
                }
                case 6: {
                    return "enum entry";
                }
            }
            throw new qd();
        }
        throw new AssertionError((Object)"Unexpected classifier: ".concat(String.valueOf(k2)));
    }

    public /* synthetic */ b$_d(w w2) {
        this();
    }
}

