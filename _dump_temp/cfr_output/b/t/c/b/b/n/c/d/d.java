/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d;

import b.o.e.g;
import b.r;
import b.s.mc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.d.c.e;
import b.t.c.b.b.n.c.d.d$_b$0;
import b.t.c.b.b.n.c.d.f;
import b.t.c.b.b.n.c.d.g$_b;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.n.c.s$_c;
import b.t.c.b.b.q.db;
import java.util.Collection;
import java.util.List;

public final class d
implements db {
    private final i \u00d200000;
    private final b.t.c.b.b.i.g o00000;

    public d(f f2) {
        this.\u00d200000 = new i(f2, g$_b.o00000, r.o00000(null));
        this.o00000 = this.\u00d200000.return().\u00d200000();
    }

    private final e \u00d300000(k object) {
        b.t.c.b.b.n.c.b.f f2 = s$_c.o00000(this.\u00d200000.\u00d500000().o00000(), (k)object, false, 2, null);
        if (f2 == null) {
            return null;
        }
        Object object2 = f2;
        k k2 = object;
        object = object2;
        object2 = this;
        return (e)this.o00000.o00000(k2, new d$_b$0((d)object2, (b.t.c.b.b.n.c.b.f)object));
    }

    @Override
    public final List o00000(k k2) {
        return mc.new((Object)this.\u00d300000(k2));
    }

    @Override
    public final void o00000(k k2, Collection collection) {
        b.t.c.b.b.m.e.o00000(collection, this.\u00d300000(k2));
    }

    @Override
    public final boolean \u00d200000(k k2) {
        return s$_c.o00000(this.\u00d200000.\u00d500000().o00000(), k2, false, 2, null) == null;
    }

    public final List \u00d200000(k k2, g g2) {
        e e2 = this.\u00d300000(k2);
        List list = e2 != null ? e2.O\u00d5\u00d2000() : null;
        if (list == null) {
            list = mc.\u00d500000();
        }
        return list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.\u00d200000.\u00d500000().Object();
    }

    private static final e o00000(d d2, b.t.c.b.b.n.c.b.f f2) {
        return new e(d2.\u00d200000, f2);
    }

    static /* synthetic */ e \u00d200000(d d2, b.t.c.b.b.n.c.b.f f2) {
        return d.o00000(d2, f2);
    }
}

