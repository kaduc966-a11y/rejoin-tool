/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.g.c;
import b.o.d.fc;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.m.b;
import b.t.c.b.b.m.b$_c;
import b.t.c.b.b.m.e;
import b.t.c.b.b.n.c.b.w;
import b.t.c.b.b.n.c.d.c.g;
import b.t.c.b.b.n.c.d.c.l;
import b.t.c.b.b.n.c.d.c.m;
import b.t.c.b.b.n.c.d.c.n$_b$0;
import b.t.c.b.b.n.c.d.c.n$_b$1;
import b.t.c.b.b.n.c.d.c.n$_b$2;
import b.t.c.b.b.n.c.d.c.n$_b$3;
import b.t.c.b.b.n.c.d.c.n$_b$4;
import b.t.c.b.b.n.c.d.c.n$_c$2;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.o.d;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.pb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class n
extends l {
    private final b.t.c.b.b.n.c.b.b \u00f5\u00d30000;
    private final b.t.c.b.b.n.c.e.e \u00f4\u00d30000;

    public n(i i2, b.t.c.b.b.n.c.b.b b2, b.t.c.b.b.n.c.e.e e2) {
        super(i2);
        this.\u00f5\u00d30000 = b2;
        this.\u00f4\u00d30000 = e2;
    }

    protected final b.t.c.b.b.n.c.e.e supernew() {
        return this.\u00f4\u00d30000;
    }

    protected final g \u00d2\u00d20000() {
        return new g(this.\u00f5\u00d30000, n$_b$0.\u00d8\u00d6\u00d4000);
    }

    @Override
    protected final Set \u00d400000(j object, b.o.e.g object2) {
        object2 = object = mc.\u00d3\u00d30000(((m)this.\u00f8O0000().newreturn()).\u00d200000());
        n n2 = b.t.c.b.b.n.c.e.i.super(this.supernew());
        Set set = n2 != null ? ((b.t.c.b.b.o.e.l)n2).super() : null;
        if (set == null) {
            set = ub.\u00d300000();
        }
        object.addAll(set);
        if (this.\u00f5\u00d30000.\u00d3o0000()) {
            Object[] objectArray = new b.t.c.b.b.d.f[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = b.t.c.b.b.b.d.\u00d4o0000;
            objectArray2[1] = b.t.c.b.b.b.d.\u00f4O0000;
            object2.addAll(mc.new(objectArray2));
        }
        object2.addAll(this.\u00f6O0000().\u00d500000().float().Object(this.supernew(), this.\u00f6O0000()));
        return object;
    }

    @Override
    protected final Set \u00d600000(j object, b.o.e.g object2) {
        object2 = object = mc.\u00d3\u00d30000(((m)this.\u00f8O0000().newreturn()).o00000());
        n n2 = this;
        n2.super(n2.supernew(), (Set)object2, n$_b$1.returnfornew);
        if (this.\u00f5\u00d30000.\u00d3o0000()) {
            object2.add(b.t.c.b.b.b.d.thissuper);
        }
        return object;
    }

    @Override
    protected final Set class(j j2, b.o.e.g g2) {
        return ub.\u00d300000();
    }

    @Override
    public final kb \u00d200000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        return null;
    }

    @Override
    protected final void super(Collection collection, b.t.c.b.b.d.f f2) {
        Set set = this.super(f2, this.supernew());
        collection.addAll(b.t.c.b.b.n.c.f.e.super(f2, set, collection, this.supernew(), this.\u00f6O0000().\u00d500000().classsuper(), this.\u00f6O0000().\u00d500000().\u00d500000().\u00d200000()));
        if (this.\u00f5\u00d30000.\u00d3o0000()) {
            if (fc.o00000((Object)f2, (Object)b.t.c.b.b.b.d.\u00d4o0000)) {
                collection.add(d.\u00d300000(this.supernew()));
                return;
            }
            if (fc.o00000((Object)f2, (Object)b.t.c.b.b.b.d.\u00f4O0000)) {
                collection.add(d.o00000(this.supernew()));
            }
        }
    }

    @Override
    protected final void \u00d200000(Collection collection, b.t.c.b.b.d.f f2) {
        this.\u00f6O0000().\u00d500000().float().o00000((ib)this.supernew(), f2, collection, this.\u00f6O0000());
    }

    @Override
    protected final void super(b.t.c.b.b.d.f f2, Collection collection) {
        n n2 = this;
        Iterator iterator = f2;
        iterator = n2.super(n2.supernew(), new LinkedHashSet(), new n$_b$2((b.t.c.b.b.d.f)((Object)iterator)));
        if (!collection.isEmpty()) {
            collection.addAll(b.t.c.b.b.n.c.f.e.super(f2, (Collection)((Object)iterator), collection, this.supernew(), this.\u00f6O0000().\u00d500000().classsuper(), this.\u00f6O0000().\u00d500000().\u00d500000().\u00d200000()));
        } else {
            iterator = (Iterable)((Object)iterator);
            Collection collection2 = collection;
            Object object = new LinkedHashMap();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object2 = object;
                Object t2 = iterator.next();
                pb object22 = (pb)t2;
                object22 = this.\u00d300000(object22);
                Object object3 = object2.get(object22);
                if (object3 == null) {
                    object3 = new ArrayList();
                    object2.put(object22, object3);
                }
                ((List)object3).add(t2);
            }
            iterator = object;
            object = new ArrayList();
            for (Map.Entry entry : iterator.entrySet()) {
                Iterable iterable = b.t.c.b.b.n.c.f.e.super(f2, (Collection)entry.getValue(), collection, this.supernew(), this.\u00f6O0000().\u00d500000().classsuper(), this.\u00f6O0000().\u00d500000().\u00d500000().\u00d200000());
                mc.new((Collection)object, iterable);
            }
            collection2.addAll((List)object);
        }
        if (this.\u00f5\u00d30000.\u00d3o0000() && fc.o00000((Object)f2, (Object)b.t.c.b.b.b.d.thissuper)) {
            e.o00000(collection, d.\u00d200000(this.supernew()));
        }
    }

    private final Set super(b.t.c.b.b.d.f f2, ib ib2) {
        n n2 = b.t.c.b.b.n.c.e.i.super(ib2);
        if (n2 == null) {
            return ub.\u00d300000();
        }
        return mc.\u00d4O0000((Iterable)((b.t.c.b.b.o.e.l)n2).\u00d300000(f2, b.t.c.b.b.j.b.f.\u00d800000));
    }

    private final Set super(ib ib2, Set set, b.o.e.g g2) {
        b.o00000((Collection)mc.o00000(ib2), (b$_c)n$_b$3.\u00d400000, new n$_c$2(ib2, set, g2));
        return set;
    }

    private final pb \u00d300000(pb object) {
        if (object.O\u00f5o000().o00000()) {
            return object;
        }
        Object object2 = object = (Iterable)object.\u00d5\u00f4o000();
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (pb)object3;
            Object object4 = object;
            object4.add(this.\u00d300000((pb)object3));
        }
        return (pb)mc.\u00d5O0000(mc.\u00f4\u00d20000((List)object));
    }

    private static final boolean \u00d400000(w w2) {
        return w2.\u00f800000();
    }

    private static final Collection \u00d200000(f f2) {
        return f2.\u00d300000();
    }

    private static final Collection super(b.t.c.b.b.d.f f2, f f3) {
        return f3.\u00d400000(f2, b.t.c.b.b.j.b.f.\u00d800000);
    }

    private static final ib super(rc i2) {
        if ((i2 = i2.thisdosuper().\u00f4OO000()) instanceof ib) {
            return (ib)i2;
        }
        return null;
    }

    private static final Iterable \u00d200000(ib ib2) {
        return c.ifsuper(c.oo0000(mc.\u00d5o0000(ib2.\u00d3OO000().\u00d5OO000()), n$_b$4.\u00d4\u00d6\u00d4000));
    }

    static /* synthetic */ boolean \u00d300000(w w2) {
        return n.\u00d400000(w2);
    }

    static /* synthetic */ Collection super(f f2) {
        return n.\u00d200000(f2);
    }

    static /* synthetic */ Collection \u00d200000(b.t.c.b.b.d.f f2, f f3) {
        return n.super(f2, f3);
    }

    static /* synthetic */ Iterable \u00d300000(ib ib2) {
        return n.\u00d200000(ib2);
    }

    static /* synthetic */ ib \u00d200000(rc rc2) {
        return n.super(rc2);
    }
}

