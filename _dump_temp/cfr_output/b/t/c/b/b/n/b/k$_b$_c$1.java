/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_f;
import b.t.c.b.b.n.b.k;
import b.t.c.b.b.n.b.k$_b;
import b.t.c.b.b.n.b.k$_b$_c$1$_b$1;
import b.t.c.b.b.o.c.o;
import b.t.c.b.b.o.c.t;
import b.t.c.b.b.q.g;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k$_b$_c$1
implements j$_f {
    private final ArrayList new = new ArrayList();
    final /* synthetic */ k o00000;
    final /* synthetic */ f \u00d400000;
    final /* synthetic */ k$_b \u00d300000;

    k$_b$_c$1(k k2, f f2, k$_b k$_b) {
        this.o00000 = k2;
        this.\u00d400000 = f2;
        this.\u00d300000 = k$_b;
    }

    @Override
    public final void o00000(Object object) {
        this.new.add(k.super(this.o00000, this.\u00d400000, object));
    }

    @Override
    public final void o00000(d d2, f f2) {
        this.new.add(new b.t.c.b.b.o.c.f(d2, f2));
    }

    @Override
    public final void o00000(o o2) {
        this.new.add(new t(o2));
    }

    @Override
    public final j$_b o00000(d object) {
        ArrayList arrayList = new ArrayList();
        object = this.o00000.super((d)object, g.o00000, arrayList);
        return new k$_b$_c$1$_b$1((j$_b)object, this, arrayList);
    }

    @Override
    public final void o00000() {
        this.\u00d300000.super(this.\u00d400000, this.new);
    }

    public static final /* synthetic */ ArrayList o00000(k$_b$_c$1 k$_b$_c$1) {
        return k$_b$_c$1.new;
    }
}

