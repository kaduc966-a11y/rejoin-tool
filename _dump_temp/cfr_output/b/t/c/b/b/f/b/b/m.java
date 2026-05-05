/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.o.e.g;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.f.b.b.m$_b$0;
import b.t.c.b.b.f.b.b.m$_b$1;
import b.t.c.b.b.f.b.b.m$_c;
import b.t.c.b.b.f.b.b.m$_d;
import b.t.c.b.b.f.b.b.m$_e;
import b.t.c.b.b.f.b.q;
import b.t.c.b.b.i.c;
import b.t.c.b.b.i.k;
import b.t.c.b.b.m.e;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.qb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class m
extends l {
    static final /* synthetic */ b.t.m[] \u00f6O0000;
    private final q classsuper;
    private final m$_c \u00f5O0000;
    private final b.t.c.b.b.i.f \u00f4O0000;
    private final c supersuper;

    protected m(q object, List list, List list2, List list3, b.o.e.h h2) {
        this.classsuper = object;
        this.\u00f5O0000 = this.super(list, list2, list3);
        object = h2;
        this.\u00f4O0000 = this.classsuper.\u00d500000().o00000(new m$_b$0((b.o.e.h)object));
        object = this;
        this.supersuper = this.classsuper.\u00d500000().\u00d200000(new m$_b$1((m)object));
    }

    public final q OO0000() {
        return this.classsuper;
    }

    public final Set \u00f800000() {
        return (Set)k.o00000(this.\u00f4O0000, (Object)this, \u00f6O0000[0]);
    }

    private final Set \u00d4O0000() {
        return (Set)k.o00000(this.supersuper, (Object)this, \u00f6O0000[1]);
    }

    @Override
    public Set super() {
        return this.\u00f5O0000.o00000();
    }

    @Override
    public Set \u00d300000() {
        return this.\u00f5O0000.\u00d300000();
    }

    @Override
    public Set \u00d200000() {
        return this.\u00d4O0000();
    }

    protected boolean \u00d300000(qb qb2) {
        return true;
    }

    protected void super(f f2, List list) {
    }

    @Override
    public Collection \u00d300000(f f2, b.t.c.b.b.j.b.e e2) {
        return this.\u00f5O0000.new(f2, e2);
    }

    protected void \u00d200000(f f2, List list) {
    }

    private final h \u00d300000(f f2) {
        return this.\u00f5O0000.o00000(f2);
    }

    @Override
    public Collection \u00d400000(f f2, b.t.c.b.b.j.b.e e2) {
        return this.\u00f5O0000.o00000(f2, e2);
    }

    protected final Collection super(j j2, g g2, b.t.c.b.b.j.b.e iterator) {
        ArrayList arrayList = new ArrayList(0);
        if (j2.new(j.\u00d6O0000.\u00d300000())) {
            this.super(arrayList, g2);
        }
        this.\u00f5O0000.o00000(arrayList, j2, g2, (b.t.c.b.b.j.b.e)((Object)iterator));
        if (j2.new(j.\u00d6O0000.null())) {
            for (f f2 : this.\u00f800000()) {
                if (!((Boolean)g2.\u00f800000(f2)).booleanValue()) continue;
                e.o00000(arrayList, this.\u00d200000(f2));
            }
        }
        if (j2.new(j.\u00d6O0000.String())) {
            for (f f2 : this.\u00f5O0000.new()) {
                if (!((Boolean)g2.\u00f800000(f2)).booleanValue()) continue;
                e.o00000(arrayList, this.\u00f5O0000.o00000(f2));
            }
        }
        return e.o00000(arrayList);
    }

    @Override
    public kb \u00d200000(f f2, b.t.c.b.b.j.b.e e2) {
        if (this.super(f2)) {
            return this.\u00d200000(f2);
        }
        if (this.\u00f5O0000.new().contains(f2)) {
            return this.\u00d300000(f2);
        }
        return null;
    }

    private final ib \u00d200000(f f2) {
        return this.classsuper.null().o00000(this.\u00d400000(f2));
    }

    protected boolean super(f f2) {
        return this.\u00f800000().contains(f2);
    }

    protected abstract d \u00d400000(f var1);

    protected abstract Set \u00d2O0000();

    protected abstract Set \u00d3O0000();

    protected abstract Set do();

    protected abstract void super(Collection var1, g var2);

    private final m$_c super(List list, List list2, List list3) {
        if (this.classsuper.null().\u00d300000().\u00d600000()) {
            return new m$_e(this, list, list2, list3);
        }
        return new m$_d(this, list, list2, list3);
    }

    private static final Set \u00d400000(b.o.e.h h2) {
        return mc.\u00d4O0000((Iterable)h2.newreturn());
    }

    private static final Set \u00d200000(m m2) {
        Set set = m2.do();
        if (set == null) {
            return null;
        }
        Set set2 = set;
        return ub.super(ub.super(m2.\u00f800000(), m2.\u00f5O0000.new()), set2);
    }

    static {
        b.t.m[] mArray = new b.t.m[2];
        b.t.m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(m.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        mArray2[1] = new b.o.d.ib(m.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0);
        \u00f6O0000 = mArray2;
    }

    static /* synthetic */ Set \u00d300000(b.o.e.h h2) {
        return m.\u00d400000(h2);
    }

    static /* synthetic */ Set super(m m2) {
        return m.\u00d200000(m2);
    }
}

