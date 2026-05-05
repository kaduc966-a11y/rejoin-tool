/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.c;

import b.o.d.w;
import b.qb;
import b.t.c.b.b.d.k;
import b.t.c.b.b.f.b.c.d;
import b.t.c.b.b.i.l;
import b.t.c.b.b.l.b$_e;
import b.t.c.b.b.l.e.b;
import b.t.c.b.b.q.bc;
import java.io.InputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d$_b {
    private d$_b() {
    }

    public final d super(k k2, l l2, bc bc2, InputStream object, boolean bl) {
        object = b.o00000((InputStream)object);
        b$_e b$_e = (b$_e)((qb)object).\u00d400000();
        object = (b.t.c.b.b.l.e.d)((qb)object).\u00d300000();
        if (b$_e == null) {
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + b.t.c.b.b.l.e.d.\u00f400000 + ", actual " + object + ". Please update Kotlin");
        }
        return new d(k2, l2, bc2, b$_e, (b.t.c.b.b.l.e.d)object, bl, null);
    }

    public /* synthetic */ d$_b(w w2) {
        this();
    }
}

