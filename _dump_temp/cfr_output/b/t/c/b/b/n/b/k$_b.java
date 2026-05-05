/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_f;
import b.t.c.b.b.n.b.k;
import b.t.c.b.b.n.b.k$_b$_b$1;
import b.t.c.b.b.n.b.k$_b$_c$1;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.o;
import b.t.c.b.b.o.c.t;
import b.t.c.b.b.q.g;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
abstract class k$_b
implements j$_b {
    final /* synthetic */ k OO0000;

    public k$_b(k k2) {
        this.OO0000 = k2;
    }

    public abstract void super(f var1, j var2);

    public abstract void super(f var1, ArrayList var2);

    @Override
    public void super(f f2, Object object) {
        this.super(f2, k.super(this.OO0000, f2, object));
    }

    @Override
    public void super(f f2, o o2) {
        this.super(f2, new t(o2));
    }

    @Override
    public void super(f f2, d d2, f f3) {
        this.super(f2, new b.t.c.b.b.o.c.f(d2, f3));
    }

    @Override
    public j$_f super(f f2) {
        return new k$_b$_c$1(this.OO0000, f2, this);
    }

    @Override
    public j$_b super(f f2, d object) {
        ArrayList arrayList = new ArrayList();
        object = this.OO0000.super((d)object, g.o00000, arrayList);
        return new k$_b$_b$1((j$_b)object, this, f2, arrayList);
    }
}

