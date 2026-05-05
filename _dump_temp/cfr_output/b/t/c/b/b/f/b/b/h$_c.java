/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.f.b.b.h;
import b.t.c.b.b.f.b.b.h$_c$_b$0;
import b.t.c.b.b.h.p;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.i.f;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.d.k;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.b.w;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.r;
import b.t.c.b.b.q.r$_b;
import b.t.c.b.b.q.t$_d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class h$_c
extends p {
    private final f \u00d5\u00f4o000;
    final /* synthetic */ h \u00d4\u00f4o000;

    public h$_c(h h2) {
        this.\u00d4\u00f4o000 = h2;
        super(h2.\u00d8\u00d3\u00d2000().\u00d500000());
        h2 = this.\u00d4\u00f4o000;
        this.\u00d5\u00f4o000 = this.\u00d4\u00f4o000.\u00d8\u00d3\u00d2000().\u00d500000().o00000(new h$_c$_b$0(h2));
    }

    @Override
    public final Collection newif() {
        Object object;
        Object object2;
        Iterable iterable = k.\u00d300000(this.\u00d4\u00f4o000.thisfloatsuper(), this.\u00d4\u00f4o000.\u00d8\u00d3\u00d2000().String());
        Object object3 = this.\u00d4\u00f4o000;
        Iterator iterator = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (b$_nb)object2;
            object = iterable;
            object.add(((h)object3).\u00d8\u00d3\u00d2000().o00000().\u00d300000((b$_nb)object2));
        }
        List list = mc.return((Collection)((List)iterable), (Iterable)this.\u00d4\u00f4o000.\u00d8\u00d3\u00d2000().null().\u00d3O0000().\u00d300000(this.\u00d4\u00f4o000));
        iterator = list;
        iterable = new ArrayList();
        object2 = iterator.iterator();
        while (object2.hasNext()) {
            object3 = ((rc)object2.next()).thisdosuper().\u00f4OO000();
            t$_d t$_d = object3 instanceof t$_d ? (t$_d)object3 : null;
            if (t$_d == null) continue;
            object3 = t$_d;
            iterable.add(object3);
        }
        if (!((Collection)(iterable = (List)iterable)).isEmpty()) {
            object3 = iterable;
            ib ib2 = this.\u00d4\u00f4o000;
            object = this.\u00d4\u00f4o000.\u00d8\u00d3\u00d2000().null().newsuper();
            iterator = object3;
            iterable = new ArrayList(mc.o00000((Iterable)object3, 10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object2 = iterator.next();
                object2 = (t$_d)object2;
                object3 = iterable;
                Object object4 = b.o00000((kb)object2);
                if (object4 == null || (object4 = ((d)object4).\u00f400000()) == null || (object4 = ((b.t.c.b.b.d.k)object4).super()) == null) {
                    object4 = ((w)object2).\u00d5\u00f80000().\u00d400000();
                }
                object3.add(object4);
            }
            object3 = (List)iterable;
            object.o00000(ib2, (List)object3);
        }
        return mc.\u00f5O0000((Iterable)list);
    }

    @Override
    public final List \u00f5OO000() {
        return (List)this.\u00d5\u00f4o000.newreturn();
    }

    @Override
    public final boolean \u00d8OO000() {
        return true;
    }

    public final h \u00f5oO000() {
        return this.\u00d4\u00f4o000;
    }

    public final String toString() {
        return this.\u00d4\u00f4o000.\u00d5\u00f80000().toString();
    }

    @Override
    public final r returnif() {
        return r$_b.o00000;
    }

    private static final List o00000(h h2) {
        return b.t.c.b.b.q.f.o00000(h2);
    }

    static /* synthetic */ List new(h h2) {
        return h$_c.o00000(h2);
    }
}

