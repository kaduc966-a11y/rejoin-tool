/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.f.b.b.h;
import b.t.c.b.b.f.b.b.h$_d$_b$0;
import b.t.c.b.b.f.b.b.h$_d$_b$1;
import b.t.c.b.b.f.b.b.h$_d$_b$2;
import b.t.c.b.b.f.b.b.h$_d$_c$1;
import b.t.c.b.b.f.b.b.h$_f;
import b.t.c.b.b.f.b.b.m;
import b.t.c.b.b.f.b.q;
import b.t.c.b.b.f.b.y;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.j.b;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.qb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class h$_d
extends m {
    private final b.t.c.b.b.h.e.b dosuper;
    private final b.t.c.b.b.i.f \u00d5o0000;
    private final b.t.c.b.b.i.f \u00d6o0000;
    final /* synthetic */ h \u00d4o0000;

    public h$_d(h object, b.t.c.b.b.h.e.b b2) {
        Object object2;
        this.\u00d4o0000 = object;
        q q2 = ((h)object).\u00d8\u00d3\u00d2000();
        List list = ((h)object).thisfloatsuper().\u00d4\u00d2\u00d2000();
        List list2 = ((h)object).thisfloatsuper().interfacenullsuper();
        List list3 = ((h)object).thisfloatsuper().\u00d8\u00d3\u00d2000();
        Iterable iterable = ((h)object).thisfloatsuper().\u00f8\u00d2\u00d2000();
        object = ((h)object).\u00d8\u00d3\u00d2000().\u00f500000();
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        q q3 = q2;
        h$_d h$_d = this;
        Object object3 = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object3 = object3.iterator();
        while (object3.hasNext()) {
            Object e2 = object3.next();
            int n2 = ((Number)e2).intValue();
            object2 = iterable;
            object2.add(y.\u00d200000((e)object, n2));
        }
        object = object2 = (List)iterable;
        object2 = new h$_d$_b$0((List)object);
        super(q3, list6, list5, list4, (b.o.e.h)object2);
        this.dosuper = b2;
        object = this;
        this.\u00d5o0000 = this.OO0000().\u00d500000().o00000(new h$_d$_b$1((h$_d)object));
        object = this;
        this.\u00d6o0000 = this.OO0000().\u00d500000().o00000(new h$_d$_b$2((h$_d)object));
    }

    private final h \u00d6O0000() {
        return this.\u00d4o0000;
    }

    @Override
    public final Collection super(j j2, g g2) {
        return (Collection)this.\u00d5o0000.newreturn();
    }

    @Override
    public final Collection \u00d300000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        ((l)this).super(f2, e2);
        return super.\u00d300000(f2, e2);
    }

    @Override
    public final Collection \u00d400000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        ((l)this).super(f2, e2);
        return super.\u00d400000(f2, e2);
    }

    @Override
    protected final boolean \u00d300000(qb qb2) {
        return this.OO0000().null().o00000().o00000(this.\u00d4o0000, qb2);
    }

    @Override
    protected final void super(b.t.c.b.b.d.f f2, List list) {
        ArrayList arrayList = new ArrayList();
        for (rc rc2 : (Collection)this.\u00d6o0000.newreturn()) {
            arrayList.addAll(rc2.\u00f4\u00d6\u00d2000().\u00d300000(f2, b.t.c.b.b.j.b.f.\u00d500000));
        }
        list.addAll(this.OO0000().null().\u00d3O0000().o00000(f2, this.\u00d4o0000));
        this.super(f2, arrayList, list);
    }

    @Override
    protected final void \u00d200000(b.t.c.b.b.d.f f2, List list) {
        ArrayList arrayList = new ArrayList();
        for (rc rc2 : (Collection)this.\u00d6o0000.newreturn()) {
            arrayList.addAll(rc2.\u00f4\u00d6\u00d2000().\u00d400000(f2, b.t.c.b.b.j.b.f.\u00d500000));
        }
        this.super(f2, arrayList, list);
    }

    private final void super(b.t.c.b.b.d.f f2, Collection collection, List list) {
        ArrayList arrayList = new ArrayList(list);
        this.OO0000().null().\u00d800000().\u00d200000().o00000(f2, collection, arrayList, this.\u00d6O0000(), new h$_d$_c$1(list));
    }

    @Override
    protected final Set \u00d2O0000() {
        Object object = h.\u00f800000(this.\u00d6O0000()).\u00d3oO000();
        Object object2 = new LinkedHashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Iterable iterable = ((rc)object.next()).\u00f4\u00d6\u00d2000().super();
            mc.new((Collection)object2, iterable);
        }
        object = object2;
        object2 = this.\u00d4o0000;
        ((LinkedHashSet)object).addAll(this.OO0000().null().\u00d3O0000().o00000((ib)object2));
        return (Set)object;
    }

    @Override
    protected final Set \u00d3O0000() {
        Object object = h.\u00f800000(this.\u00d6O0000()).\u00d3oO000();
        Collection collection = new LinkedHashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Iterable iterable = ((rc)object.next()).\u00f4\u00d6\u00d2000().\u00d300000();
            mc.new(collection, iterable);
        }
        return (Set)collection;
    }

    @Override
    protected final Set do() {
        Collection collection;
        block2: {
            Object object = h.\u00f800000(this.\u00d6O0000()).\u00d3oO000();
            Collection collection2 = new LinkedHashSet();
            object = object.iterator();
            while (object.hasNext()) {
                Iterable iterable;
                if ((Iterable)((rc)object.next()).\u00f4\u00d6\u00d2000().\u00d200000() == null) {
                    collection = null;
                    break block2;
                }
                mc.new(collection2, iterable);
            }
            collection = collection2;
        }
        return (Set)collection;
    }

    @Override
    public final kb \u00d200000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        ((l)this).super(f2, e2);
        Object object = h.\u00d500000(this.\u00d6O0000());
        if (object != null && (object = ((h$_f)object).o00000(f2)) != null) {
            return (kb)object;
        }
        return super.\u00d200000(f2, e2);
    }

    @Override
    protected final d \u00d400000(b.t.c.b.b.d.f f2) {
        return h.\u00f500000(this.\u00d4o0000).o00000(f2);
    }

    @Override
    protected final void super(Collection collection, g g2) {
        h$_f h$_f = h.\u00d500000(this.\u00d6O0000());
        Collection collection2 = h$_f != null ? h$_f.o00000() : null;
        if (collection2 == null) {
            collection2 = mc.\u00d500000();
        }
        collection.addAll(collection2);
    }

    @Override
    public final void super(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        b.o00000(this.OO0000().null().\u00d6O0000(), e2, this.\u00d6O0000(), f2);
    }

    private static final List super(List list) {
        return list;
    }

    private static final Collection \u00d200000(h$_d h$_d) {
        return h$_d.super(j.class, f.o00000.o00000(), b.t.c.b.b.j.b.f.returnsuper);
    }

    private static final Collection \u00d400000(h$_d h$_d) {
        return h$_d.dosuper.o00000(h$_d.\u00d6O0000());
    }

    static /* synthetic */ List \u00d200000(List list) {
        return h$_d.super(list);
    }

    static /* synthetic */ Collection \u00d300000(h$_d h$_d) {
        return h$_d.\u00d200000(h$_d);
    }

    static /* synthetic */ Collection super(h$_d h$_d) {
        return h$_d.\u00d400000(h$_d);
    }
}

