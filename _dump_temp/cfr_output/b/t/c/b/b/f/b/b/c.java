/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.s.mc;
import b.t.c.b.b.f.b.b.c$_b$0;
import b.t.c.b.b.f.b.b.e;
import b.t.c.b.b.f.b.ib;
import b.t.c.b.b.f.b.p;
import b.t.c.b.b.f.b.q;
import b.t.c.b.b.f.b.y;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.d.k;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.b.u;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.r$_b;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends u {
    private final q \u00d5\u00f5\u00d5000;
    private final b$_b \u00d3\u00f5\u00d5000;
    private final e \u00d4\u00f5\u00d5000;

    public c(q object, b$_b b$_b, int n2) {
        super(((q)object).\u00d500000(), ((q)object).\u00d600000(), o.\u00d8o\u00f6000.o00000(), y.\u00d200000(((q)object).\u00f500000(), b$_b.\u00d6\u00d5\u00d4000()), ib.super.super(b$_b.\u00f6\u00d4\u00d4000()), b$_b.O\u00d5\u00d4000(), n2, g.o00000, r$_b.o00000);
        this.\u00d5\u00f5\u00d5000 = object;
        this.\u00d3\u00f5\u00d5000 = b$_b;
        object = this;
        this.\u00d4\u00f5\u00d5000 = new e(this.\u00d5\u00f5\u00d5000.\u00d500000(), new c$_b$0((c)object));
    }

    public final e \u00d5\u00d6o000() {
        return this.\u00d4\u00f5\u00d5000;
    }

    @Override
    public final List \u00f8\u00d5o000() {
        Iterable<rc> iterable = k.o00000(this.\u00d3\u00f5\u00d5000, this.\u00d5\u00f5\u00d5000.String());
        if (iterable.isEmpty()) {
            return mc.o00000(b.null(this).\u00f5O0000());
        }
        iterable = iterable;
        p p2 = this.\u00d5\u00f5\u00d5000.o00000();
        Object object = iterable;
        iterable = new ArrayList(mc.o00000((Iterable)iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (b$_nb)object2;
            Iterable<rc> iterable2 = iterable;
            iterable2.add(p2.\u00d300000((b$_nb)object2));
        }
        return iterable;
    }

    protected final Void \u00f800000(rc rc2) {
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: ".concat(String.valueOf(this)));
    }

    private static final List o00000(c c2) {
        return mc.\u00f5O0000((Iterable)c2.\u00d5\u00f5\u00d5000.null().\u00f500000().super(c2.\u00d3\u00f5\u00d5000, c2.\u00d5\u00f5\u00d5000.\u00f500000()));
    }

    static /* synthetic */ List new(c c2) {
        return c.o00000(c2);
    }
}

