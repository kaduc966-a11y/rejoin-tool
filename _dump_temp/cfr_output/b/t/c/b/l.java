/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.t.b.d;
import b.t.c.b.b.h.c.q;
import b.t.c.b.c.j;
import b.t.c.b.c.n;
import b.t.c.b.gb;
import b.t.c.b.gc;
import b.t.u;
import b.xc;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class l
implements Comparator {
    public static final l super = new l();

    private l() {
    }

    public final int o00000(gb w2, gb w3) {
        boolean bl;
        j j2 = gc.o00000(((gb)w2).O\u00d4O000(), w3.O\u00d4O000());
        if (j2 == null) {
            throw new IllegalStateException(("Intersection overrides can't have different type parameters sizes. It must have been reported by the compiler. The following members appear to be violating intersection overrides: '" + w2 + "' '" + w3 + '\'').toString());
        }
        u u2 = j.o00000(j2, ((gb)w2).\u00d5\u00d5O000(), null, 2, null).o00000();
        if (u2 == null) {
            gc.o00000(w2.\u00f5\u00d5O000());
            throw new xc();
        }
        w2 = u2;
        w3 = w3.\u00d5\u00d5O000();
        boolean bl2 = d.super((u)w2, (u)w3);
        boolean bl3 = d.super((u)w3, (u)w2);
        if (bl2 && !bl3) {
            return -1;
        }
        if (bl3 && !bl2) {
            return 1;
        }
        b.t.c.b.c.l l2 = b.t.c.b.c.l.\u00d800000;
        n n2 = w2 instanceof n ? (n)w2 : null;
        boolean bl4 = n2 != null ? l2.oO0000((q)n2) : false;
        l2 = b.t.c.b.c.l.\u00d800000;
        n n3 = w3 instanceof n ? (n)w3 : null;
        boolean bl5 = n3 != null ? l2.oO0000((q)n3) : (bl = false);
        if (bl5 && !bl4) {
            return -1;
        }
        if (bl4 && !bl) {
            return 1;
        }
        return 0;
    }
}

