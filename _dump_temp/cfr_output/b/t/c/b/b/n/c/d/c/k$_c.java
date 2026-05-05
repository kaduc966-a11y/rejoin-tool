/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.e.m;
import b.o.d.fc;
import b.s.fb;
import b.s.mc;
import b.t.c.b.b.b.d;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.p;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.t;
import b.t.c.b.b.h.w;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.m.e;
import b.t.c.b.b.n.c.ab;
import b.t.c.b.b.n.c.b.c;
import b.t.c.b.b.n.c.d.b.f;
import b.t.c.b.b.n.c.d.c.k;
import b.t.c.b.b.n.c.d.c.k$_c$_b$0;
import b.t.c.b.b.n.c.q;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.z;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.r;
import b.t.c.b.b.q.t$_d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class k$_c
extends p {
    private final b.t.c.b.b.i.f privateclasssuper;
    final /* synthetic */ k \u00f5\u00f4o000;

    public k$_c(k k2) {
        this.\u00f5\u00f4o000 = k2;
        super(k.\u00d800000(k2).return());
        k2 = this.\u00f5\u00f4o000;
        this.privateclasssuper = k.\u00d800000(this.\u00f5\u00f4o000).return().o00000(new k$_c$_b$0(k2));
    }

    @Override
    public final List \u00f5OO000() {
        return (List)this.privateclasssuper.newreturn();
    }

    @Override
    public final Collection newif() {
        rc rc2;
        Object object;
        Object object2;
        Object object3;
        Iterator iterator = this.\u00f5\u00f4o000.\u00f5\u00d4\u00d2000().\u00d4o0000();
        ArrayList<Object> arrayList = new ArrayList<Object>(iterator.size());
        Object object4 = new ArrayList<Object>(0);
        i i2 = this.\u00f8oO000();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object3 = (c)iterator.next();
            object2 = k.\u00d800000(this.\u00f5\u00f4o000).\u00d800000().o00000((b.t.c.b.b.n.c.b.r)object3, f.o00000(t.o00000, false, false, null, 7, null));
            object = k.\u00d800000(this.\u00f5\u00f4o000).\u00d500000().oO0000().o00000((rc)object2, k.\u00d800000(this.\u00f5\u00f4o000));
            if (((rc)object).thisdosuper().\u00f4OO000() instanceof t$_d) {
                ((ArrayList)object4).add(object3);
            }
            i i3 = i2;
            if (fc.o00000((Object)((rc)object).thisdosuper(), (Object)(i3 != null ? ((rc)i3).thisdosuper() : null)) || b.t.c.b.b.b.c.\u00d3O0000((rc)object)) continue;
            arrayList.add(object);
        }
        Object object5 = arrayList;
        ib ib2 = k.return(this.\u00f5\u00f4o000);
        if (ib2 != null) {
            object3 = ib2;
            object2 = this.\u00f5\u00f4o000;
            object = object3;
            object3 = object5;
            rc2 = b.t.c.b.b.b.c.l.o00000((ib)object, (ib)object2).\u00d400000().o00000(object.nullint(), w.\u00d400000);
            object5 = object3;
        } else {
            rc2 = null;
        }
        e.o00000((Collection)object5, rc2);
        e.o00000(arrayList, i2);
        if (!((Collection)object4).isEmpty()) {
            iterator = (Iterable)object4;
            i2 = ((p)this).\u00d8oO000();
            object3 = k.\u00d800000(this.\u00f5\u00f4o000).\u00d500000().classsuper();
            object2 = iterator;
            object = new ArrayList(mc.o00000((Iterable)((Object)iterator), 10));
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                object4 = iterator.next();
                object4 = (b.t.c.b.b.n.c.b.r)object4;
                object2 = object;
                object2.add(((c)object4).\u00f5\u00d40000());
            }
            object2 = (List)object;
            object3.o00000((ib)i2, (List)object2);
        }
        if (!((Collection)arrayList).isEmpty()) {
            return mc.\u00f5O0000((Iterable)arrayList);
        }
        return mc.o00000(k.\u00d800000(this.\u00f5\u00f4o000).\u00d300000().returnforsuper().oO0000());
    }

    private final rc \u00f8oO000() {
        Collection<lc> collection;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        b.t.c.b.b.d.k k2 = this.ifif();
        if (k2 != null) {
            object4 = k2;
            b.t.c.b.b.d.k k3 = k2;
            object3 = !k2.\u00d600000() && k3.super(d.while) ? object4 : null;
        } else {
            object3 = null;
        }
        Object object5 = object3;
        b.t.c.b.b.d.k k4 = object3;
        if (object3 == null && (k4 = q.\u00d200000.o00000(b.\u00d800000(this.\u00f5\u00f4o000))) == null) {
            return null;
        }
        object4 = k4;
        ib ib2 = b.o00000(k.\u00d800000(this.\u00f5\u00f4o000).\u00d300000(), (b.t.c.b.b.d.k)object4, b.t.c.b.b.j.b.f.\u00f600000);
        if (ib2 == null) {
            return null;
        }
        object4 = ib2;
        int n2 = ib2.\u00d3OO000().\u00f5OO000().size();
        Iterable iterable = this.\u00f5\u00f4o000.\u00d3OO000().\u00f5OO000();
        int n3 = iterable.size();
        if (n3 == n2) {
            object2 = object5 = (Iterable)iterable;
            iterable = new ArrayList(mc.o00000((Iterable)object5, 10));
            object5 = object2.iterator();
            while (object5.hasNext()) {
                Object e2 = object5.next();
                object2 = (b.t.c.b.b.q.i)e2;
                object = iterable;
                object.add(new lc(w.\u00d400000, object2.nullint()));
            }
            collection = iterable;
        } else if (n3 == 1 && n2 > 1 && object5 == null) {
            object5 = new lc(w.\u00d400000, ((b.t.c.b.b.q.i)mc.\u00d5O0000((List)iterable)).nullint());
            object2 = new m(1, n2);
            iterable = object2;
            object2 = new ArrayList(mc.o00000((Iterable)object2, 10));
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                ((fb)iterator).\u00f4\u00d4\u00d3000();
                object = object2;
                object.add(object5);
            }
            collection = (List)object2;
        } else {
            return null;
        }
        object5 = collection;
        return oc.o00000(zb.ifreturnclass.Object(), (ib)object4, (List)object5);
    }

    private final b.t.c.b.b.d.k ifif() {
        l l2 = this.\u00f5\u00f4o000.\u00d4\u00f80000().\u00d400000(ab.\u00d800000);
        if (l2 == null) {
            return null;
        }
        Object object = mc.\u00d3o0000(l2.super().values());
        Object object2 = object instanceof z ? (z)object : null;
        if (object2 == null || (object2 = (String)((j)object2).o00000()) == null) {
            return null;
        }
        object = object2;
        if (!b.t.c.b.b.d.l.o00000((String)object2)) {
            return null;
        }
        return new b.t.c.b.b.d.k((String)object);
    }

    @Override
    public final r returnif() {
        return k.\u00d800000(this.\u00f5\u00f4o000).\u00d500000().\u00d600000();
    }

    @Override
    public final boolean \u00d8OO000() {
        return true;
    }

    @Override
    public final ib \u00d8oO000() {
        return this.\u00f5\u00f4o000;
    }

    public final String toString() {
        return this.\u00f5\u00f4o000.\u00d5\u00f80000().\u00d400000();
    }

    private static final List o00000(k k2) {
        return b.t.c.b.b.q.f.o00000(k2);
    }

    static /* synthetic */ List new(k k2) {
        return k$_c.o00000(k2);
    }
}

