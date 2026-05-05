/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.o.e.g;
import b.t.c.b.b.b.c;
import b.t.c.b.b.b.d;
import b.t.c.b.b.j.b.f;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class c$3
implements g {
    final /* synthetic */ c \u00d5\u00f6\u00d3000;

    c$3(c c2) {
        this.\u00d5\u00f6\u00d3000 = c2;
    }

    public ib return(b.t.c.b.b.d.f f2) {
        kb kb2 = this.\u00d5\u00f6\u00d3000.\u00d6o0000().\u00d200000(f2, f.\u00d3O0000);
        if (kb2 == null) {
            throw new AssertionError((Object)("Built-in class " + d.oO0000.\u00d200000(f2) + " is not found"));
        }
        if (!(kb2 instanceof ib)) {
            throw new AssertionError((Object)("Must be a class descriptor " + f2 + ", but was " + kb2));
        }
        return (ib)kb2;
    }
}

