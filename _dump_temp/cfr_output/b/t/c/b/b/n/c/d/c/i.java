/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.o.e.g;
import b.s.mc;
import b.s.ub;
import b.s.z;
import b.t.c.b.b.g.b.b;
import b.t.c.b.b.n.c.d.c.c;
import b.t.c.b.b.n.c.d.c.e;
import b.t.c.b.b.n.c.d.c.i$_b$0;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.o.e.n;
import b.t.c.b.b.q.dc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.k;
import b.t.c.b.b.q.kb;
import b.t.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i
implements f {
    static final /* synthetic */ m[] \u00d500000;
    private final b.t.c.b.b.n.c.d.i \u00f400000;
    private final e void;
    private final c \u00d600000;
    private final b.t.c.b.b.i.f \u00d400000;

    public i(b.t.c.b.b.n.c.d.i object, b.t.c.b.b.n.c.b.f f2, e e2) {
        this.\u00f400000 = object;
        this.void = e2;
        this.\u00d600000 = new c(this.\u00f400000, f2, this.void);
        object = this;
        this.\u00d400000 = this.\u00f400000.return().o00000(new i$_b$0((i)object));
    }

    public final c \u00d600000() {
        return this.\u00d600000;
    }

    private final f[] class() {
        return (f[])b.t.c.b.b.i.k.o00000(this.\u00d400000, (Object)this, \u00d500000[0]);
    }

    @Override
    public final kb \u00d200000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        this.super(f2, e2);
        ib ib2 = this.\u00d600000.\u00f400000(f2, e2);
        if (ib2 != null) {
            return ib2;
        }
        f[] fArray = this.class();
        kb kb2 = null;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            kb kb3 = fArray[i2].\u00d200000(f2, e2);
            if (kb3 == null) continue;
            if (kb3 instanceof k && ((dc)((Object)kb3)).\u00d80O000()) {
                if (kb2 != null) continue;
                kb2 = kb3;
                continue;
            }
            return kb3;
        }
        return kb2;
    }

    @Override
    public final Collection \u00d400000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        this.super(f2, e2);
        c c2 = this.\u00d600000;
        f[] fArray = this.class();
        Collection collection = ((f)c2).\u00d400000(f2, e2);
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            collection = b.o00000(collection, fArray[i2].\u00d400000(f2, e2));
        }
        Collection collection2 = collection;
        if (collection2 == null) {
            collection2 = ub.\u00d300000();
        }
        return collection2;
    }

    @Override
    public final Collection \u00d300000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        this.super(f2, e2);
        c c2 = this.\u00d600000;
        f[] fArray = this.class();
        Collection collection = ((f)c2).\u00d300000(f2, e2);
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            collection = b.o00000(collection, fArray[i2].\u00d300000(f2, e2));
        }
        Collection collection2 = collection;
        if (collection2 == null) {
            collection2 = ub.\u00d300000();
        }
        return collection2;
    }

    @Override
    public final Collection super(j j2, g g2) {
        c c2 = this.\u00d600000;
        f[] fArray = this.class();
        Collection collection = ((f)c2).super(j2, g2);
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            collection = b.o00000(collection, fArray[i2].super(j2, g2));
        }
        Collection collection2 = collection;
        if (collection2 == null) {
            collection2 = ub.\u00d300000();
        }
        return collection2;
    }

    @Override
    public final Set super() {
        Object object = this.class();
        Collection collection = new LinkedHashSet();
        int n2 = ((f[])object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Iterable iterable = object[i2].super();
            mc.new(collection, iterable);
        }
        object = collection;
        ((Set)object).addAll(((l)this.\u00d600000).super());
        return (Set)object;
    }

    @Override
    public final Set \u00d300000() {
        Object object = this.class();
        Collection collection = new LinkedHashSet();
        int n2 = ((f[])object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Iterable iterable = object[i2].\u00d300000();
            mc.new(collection, iterable);
        }
        object = collection;
        ((Set)object).addAll(((l)this.\u00d600000).\u00d300000());
        return (Set)object;
    }

    @Override
    public final Set \u00d200000() {
        Set set = n.o00000(z.private(this.class()));
        if (set != null) {
            Set set2 = set;
            set.addAll(((l)this.\u00d600000).\u00d200000());
            return set2;
        }
        return null;
    }

    @Override
    public final void super(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        b.t.c.b.b.j.b.o00000(this.\u00f400000.\u00d500000().public(), e2, this.void, f2);
    }

    public final String toString() {
        return "scope for " + this.void;
    }

    private static final f[] super(i i2) {
        Object object = i2.void.\u00f8\u00d4\u00d2000().values();
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (b.t.c.b.b.n.b.j)object.next();
            f f2 = i2.\u00f400000.\u00d500000().supersuper().o00000(i2.void, (b.t.c.b.b.n.b.j)object2);
            if (f2 == null) continue;
            object2 = f2;
            collection.add(object2);
        }
        return ((Collection)b.o00000((List)collection)).toArray(new f[0]);
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(i.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0);
        \u00d500000 = mArray2;
    }

    static /* synthetic */ f[] \u00d200000(i i2) {
        return i.super(i2);
    }
}

