/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.f.b.b.b;
import b.t.c.b.b.f.b.b.i;
import b.t.c.b.b.f.b.b.p;
import b.t.c.b.b.f.b.s;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.g;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.q.yb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r
implements i {
    private final b.t.c.b.b.o.h.b \u00f800000;
    private final b.t.c.b.b.o.h.b for;
    private final b.t.c.b.b.o.h.b \u00d500000;
    private final s \u00d800000;
    private final p \u00d600000;
    private final b \u00f600000;
    private final j \u00f500000;
    private final String null;

    public r(b.t.c.b.b.o.h.b b2, b.t.c.b.b.o.h.b object, b.t.c.b.b.o.h.b b3, b$_i b$_i, e e2, s s2, p p2, b b4, j j2) {
        Object object2;
        block3: {
            block2: {
                this.\u00f800000 = b2;
                this.for = object;
                this.\u00d500000 = b3;
                this.\u00d800000 = s2;
                this.\u00d600000 = p2;
                this.\u00f600000 = b4;
                this.\u00f500000 = j2;
                Object object3 = this;
                object2 = (Integer)g.super(b$_i, b.t.c.b.b.l.c.b.String);
                if (object2 == null) break block2;
                int n2 = ((Number)object2).intValue();
                object = object3;
                String string = e2.new(n2);
                object3 = object;
                object2 = string;
                if (string != null) break block3;
            }
            object2 = "main";
        }
        ((r)object3).null = object2;
    }

    public final b.t.c.b.b.o.h.b \u00d600000() {
        return this.\u00f800000;
    }

    public final b.t.c.b.b.o.h.b \u00f400000() {
        return this.for;
    }

    public final j \u00f600000() {
        return this.\u00f500000;
    }

    public r(j j2, b$_i b$_i, e e2, s s2, boolean bl, b b2) {
        Object object;
        r r2 = this;
        b.t.c.b.b.o.h.b b3 = b.t.c.b.b.o.h.b.o00000(j2.Object());
        String string = j2.\u00d200000().\u00d300000();
        if (string != null) {
            Object object2 = string;
            b.t.c.b.b.o.h.b b4 = b3;
            r r3 = r2;
            object2 = ((CharSequence)object2).length() > 0 ? b.t.c.b.b.o.h.b.o00000((String)object2) : null;
            r2 = r3;
            b3 = b4;
            object = object2;
        } else {
            object = null;
        }
        r2(b3, (b.t.c.b.b.o.h.b)object, null, b$_i, e2, s2, new p(bl, null, 2, null), b2, j2);
    }

    @Override
    public final String class() {
        return "Class '" + this.int().\u00f400000().super() + '\'';
    }

    public final f \u00d800000() {
        return f.\u00d300000(b.q.f.\u00d400000(this.\u00d600000().\u00d200000(), '/', null, 2, null));
    }

    public final d int() {
        return new d(this.\u00d600000().Object(), this.\u00d800000());
    }

    public final String toString() {
        return this.getClass().getSimpleName() + ": " + this.\u00d600000();
    }

    @Override
    public final yb super() {
        return yb.o00000;
    }
}

