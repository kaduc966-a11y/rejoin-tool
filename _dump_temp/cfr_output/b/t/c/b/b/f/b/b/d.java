/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.o.e.g;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import b.t.c.b.b.f.b.b.i;
import b.t.c.b.b.f.b.b.m;
import b.t.c.b.b.f.b.t;
import b.t.c.b.b.j.b;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.d.h;
import b.t.c.b.b.l.d.j;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.q.f.e;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.lc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d
extends m {
    private final lc Oo0000;
    private final b$_i intsuper;
    private final String oo0000;
    private final k \u00d2o0000;

    public d(lc lc2, b$_i b$_i, b.t.c.b.b.l.d.e e2, j j2, i i2, t t2, String string, b.o.e.h h2) {
        super(t2.o00000(lc2, e2, new b.t.c.b.b.l.d.d(b$_i.O\u00f6\u00d2000()), h.\u00d300000.o00000(b$_i.\u00f4\u00f5\u00d2000()), j2, i2), b$_i.\u00f8\u00f6\u00d2000(), b$_i.\u00f6\u00f5\u00d2000(), b$_i.\u00f4\u00f6\u00d2000(), h2);
        this.Oo0000 = lc2;
        this.intsuper = b$_i;
        this.oo0000 = string;
        this.\u00d2o0000 = this.Oo0000.OOO000();
    }

    public final b$_i interface() {
        return this.intsuper;
    }

    public List \u00d200000(b.t.c.b.b.o.e.j iterator, g object) {
        Collection collection = this.super((b.t.c.b.b.o.e.j)((Object)iterator), (g)object, b.t.c.b.b.j.b.f.returnsuper);
        iterator = this.OO0000().null().private();
        Collection collection2 = collection;
        object = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Iterable iterable = ((e)iterator.next()).o00000(this.\u00d2o0000);
            mc.new((Collection)object, iterable);
        }
        return mc.return(collection2, (Iterable)((List)object));
    }

    @Override
    protected boolean super(f f2) {
        block7: {
            block6: {
                boolean bl;
                if (super.super(f2)) break block6;
                Object object = this.OO0000().null().private();
                if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                    object = object.iterator();
                    while (object.hasNext()) {
                        if (!((e)object.next()).o00000(this.\u00d2o0000, f2)) continue;
                        bl = true;
                        break;
                    }
                } else {
                    bl = false;
                }
                if (!bl) break block7;
            }
            return true;
        }
        return false;
    }

    @Override
    protected b.t.c.b.b.d.d \u00d400000(f f2) {
        return new b.t.c.b.b.d.d(this.\u00d2o0000, f2);
    }

    @Override
    public kb \u00d200000(f f2, b.t.c.b.b.j.b.e e2) {
        ((l)this).super(f2, e2);
        return super.\u00d200000(f2, e2);
    }

    @Override
    public void super(f f2, b.t.c.b.b.j.b.e e2) {
        b.o00000(this.OO0000().null().\u00d6O0000(), e2, this.Oo0000, f2);
    }

    @Override
    protected Set \u00d2O0000() {
        return ub.\u00d300000();
    }

    @Override
    protected Set \u00d3O0000() {
        return ub.\u00d300000();
    }

    @Override
    protected Set do() {
        return ub.\u00d300000();
    }

    @Override
    protected void super(Collection collection, g g2) {
    }

    public String toString() {
        return this.oo0000;
    }
}

