/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.o.d.fc;
import b.o.e.g;
import b.qd;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.x$_b;
import b.t.c.b.b.n.b.x$_b$_b;
import b.t.c.b.b.n.c.b.b;
import b.t.c.b.b.n.c.d.c.c$_b;
import b.t.c.b.b.n.c.d.c.c$_c$0;
import b.t.c.b.b.n.c.d.c.c$_c$1;
import b.t.c.b.b.n.c.d.c.c$_d;
import b.t.c.b.b.n.c.d.c.c$_d$_b;
import b.t.c.b.b.n.c.d.c.c$_d$_c;
import b.t.c.b.b.n.c.d.c.c$_d$_d;
import b.t.c.b.b.n.c.d.c.e;
import b.t.c.b.b.n.c.d.c.k;
import b.t.c.b.b.n.c.d.c.l;
import b.t.c.b.b.n.c.d.c.m;
import b.t.c.b.b.n.c.d.c.m$_b;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.n.c.s$_b;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends l {
    private final b.t.c.b.b.n.c.b.f \u00d4\u00d30000;
    private final e superObject;
    private final b.t.c.b.b.i.c \u00d6\u00d30000;
    private final b.t.c.b.b.i.i \u00d5\u00d30000;

    public c(i i2, b.t.c.b.b.n.c.b.f object, e object2) {
        super(i2);
        this.\u00d4\u00d30000 = object;
        this.superObject = object2;
        object = this;
        object2 = i2;
        this.\u00d6\u00d30000 = i2.return().\u00d200000(new c$_c$0((i)object2, (c)object));
        object = i2;
        object2 = this;
        this.\u00d5\u00d30000 = i2.return().\u00d200000(new c$_c$1((c)object2, (i)object));
    }

    protected final e \u00f8o0000() {
        return this.superObject;
    }

    private final b.t.c.b.b.l.d.c O\u00d20000() {
        return this.\u00f6O0000().\u00d500000().supersuper().\u00d400000().\u00d300000().\u00d500000();
    }

    private final c$_d super(b.t.c.b.b.n.b.j object) {
        if (object == null) {
            return c$_d$_d.\u00d200000;
        }
        if (object.\u00d200000().\u00d600000() == b.t.c.b.b.n.b.b.c$_b.\u00f600000) {
            object = this.\u00f6O0000().\u00d500000().supersuper().\u00d200000((b.t.c.b.b.n.b.j)object);
            if (object != null) {
                return new c$_d$_b((ib)object);
            }
            return c$_d$_d.\u00d200000;
        }
        return c$_d$_c.super;
    }

    public final ib \u00f400000(f f2, b.t.c.b.b.j.b.e e2) {
        return this.super(f2, (b)null);
    }

    private final ib super(f f2, b b2) {
        if (!b.t.c.b.b.d.j.\u00d3O0000.super(f2)) {
            return null;
        }
        Set set = (Set)this.\u00d6\u00d30000.newreturn();
        if (b2 == null && set != null && !set.contains(f2.\u00d400000())) {
            return null;
        }
        return (ib)this.\u00d5\u00d30000.\u00f800000(new c$_b(f2, b2));
    }

    public final ib super(b b2) {
        return this.super(b2.oO0000(), b2);
    }

    @Override
    public final Collection \u00d400000(f f2, b.t.c.b.b.j.b.e e2) {
        return mc.\u00d500000();
    }

    @Override
    protected final m \u00d3o0000() {
        return m$_b.o00000;
    }

    @Override
    protected final Set class(j object, g object2) {
        if (!((j)object).new(j.\u00d6O0000.\u00d600000())) {
            return ub.\u00d300000();
        }
        Set set = (Set)this.\u00d6\u00d30000.newreturn();
        if (set != null) {
            object = set;
            object2 = new HashSet();
            object = object.iterator();
            while (object.hasNext()) {
                Object object3 = object.next();
                object3 = (String)object3;
                Object object4 = object2;
                object4.add(f.\u00d300000(object3));
            }
            return (Set)object2;
        }
        Object object5 = object2;
        if (object5 == null) {
            object5 = b.t.c.b.b.m.f.\u00d200000();
        }
        object = this.\u00d4\u00d30000.o00000((g)object5);
        object2 = new LinkedHashSet();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (b)iterator.next();
            f f2 = object.\u00f4o0000() == b.t.c.b.b.n.c.b.k.\u00d300000 ? null : object.oO0000();
            if (f2 == null) continue;
            object = f2;
            object2.add(object);
        }
        return (Set)object2;
    }

    @Override
    protected final Set \u00d400000(j j2, g g2) {
        return ub.\u00d300000();
    }

    @Override
    protected final void super(Collection collection, f f2) {
    }

    @Override
    protected final Set \u00d600000(j j2, g g2) {
        return ub.\u00d300000();
    }

    @Override
    public final Collection super(j iterator, g g2) {
        if (!((j)((Object)iterator)).new(j.\u00d6O0000.null() | j.\u00d6O0000.\u00d600000())) {
            return mc.\u00d500000();
        }
        iterator = (Iterable)this.\u00d4o0000().newreturn();
        Collection collection = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            wb wb2 = (wb)t2;
            if (!(wb2 instanceof ib && (Boolean)g2.\u00f800000(((ib)wb2).\u00d5\u00f80000()) != false)) continue;
            collection.add(t2);
        }
        return (List)collection;
    }

    private static final Set super(i i2, c c2) {
        return i2.\u00d500000().o00000().o00000(c2.\u00f8o0000().OOO000());
    }

    private static final ib \u00d200000(c object, i object2, c$_b object3) {
        Object object4 = new d(((c)object).\u00f8o0000().OOO000(), ((c$_b)object3).new());
        x$_b x$_b = ((c$_b)object3).o00000() != null ? ((i)object2).\u00d500000().\u00f5O0000().super(((c$_b)object3).o00000(), ((c)object).O\u00d20000()) : ((i)object2).\u00d500000().\u00f5O0000().super((d)object4, ((c)object).O\u00d20000());
        Object object5 = x$_b != null ? x$_b.o00000() : null;
        d d2 = object5 != null ? object5.Object() : null;
        if (d2 != null && (d2.new() || d2.return())) {
            return null;
        }
        if ((object5 = ((c)object).super((b.t.c.b.b.n.b.j)object5)) instanceof c$_d$_b) {
            return ((c$_d$_b)object5).o00000();
        }
        if (object5 instanceof c$_d$_c) {
            return null;
        }
        if (object5 instanceof c$_d$_d) {
            Object object6;
            Object object7 = ((c$_b)object3).o00000();
            if (object7 == null) {
                x$_b$_b x$_b$_b = x$_b instanceof x$_b$_b ? (x$_b$_b)x$_b : null;
                object7 = object3 = ((i)object2).\u00d500000().o00000().o00000(new s$_b((d)object4, (byte[])(x$_b$_b != null ? x$_b$_b.Object() : null), null, 4, null));
            }
            if ((object7 != null ? object7.\u00f4o0000() : null) == b.t.c.b.b.n.c.b.k.String) {
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + object3 + "\nClassId: " + object4 + "\nfindKotlinClass(JavaClass) = " + b.t.c.b.b.n.b.f.o00000(((i)object2).\u00d500000().\u00f5O0000(), (b)object3, ((c)object).O\u00d20000()) + "\nfindKotlinClass(ClassId) = " + b.t.c.b.b.n.b.f.o00000(((i)object2).\u00d500000().\u00f5O0000(), (d)object4, ((c)object).O\u00d20000()) + '\n');
            }
            Object object8 = object3;
            object4 = object8 != null ? object8.Oo0000() : null;
            if (object4 == null || ((b.t.c.b.b.d.k)object4).\u00d600000() || !fc.o00000((Object)((b.t.c.b.b.d.k)object4).\u00d300000(), (Object)((c)object).\u00f8o0000().OOO000())) {
                object6 = null;
            } else {
                object = new k((i)object2, ((c)object).\u00f8o0000(), (b)object3, null, 8, null);
                object2 = ((i)object2).\u00d500000().\u00f6O0000();
                object3 = (b.t.c.b.b.n.c.e.e)object;
                object2.o00000((b.t.c.b.b.n.c.e.e)object3);
                object6 = object;
            }
            return (ib)object6;
        }
        throw new qd();
    }

    static /* synthetic */ Set \u00d200000(i i2, c c2) {
        return c.super(i2, c2);
    }

    static /* synthetic */ ib super(c c2, i i2, c$_b c$_b) {
        return c.\u00d200000(c2, i2, c$_b);
    }
}

