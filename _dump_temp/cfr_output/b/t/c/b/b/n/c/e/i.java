/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.e;

import b.m;
import b.qb;
import b.s.mc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.d.c.n;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.b.ib;
import b.t.c.b.b.q.jc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    public static final List super(Collection iterator, Collection collection, b b2) {
        boolean bl;
        boolean bl2 = bl = iterator.size() == collection.size();
        if (m.new && !bl) {
            iterator = "Different value parameters sizes: Enhanced = " + iterator.size() + ", Old = " + collection.size();
            throw new AssertionError(iterator);
        }
        Object object = mc.\u00d300000((Iterable)((Object)iterator), (Iterable)collection);
        iterator = object;
        collection = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            object = (qb)object;
            Collection collection2 = collection;
            rc rc2 = (rc)((qb)object).\u00d400000();
            object = (jc)((qb)object).\u00d300000();
            collection2.add(new ib(b2, null, object.whilenullsuper(), object.\u00d4\u00f80000(), object.\u00d5\u00f80000(), rc2, object.\u00f80\u00d2000(), object.\u00d3O\u00d2000(), object.\u00d4O\u00d2000(), object.\u00d5O\u00d2000() != null ? b.t.c.b.b.o.f.b.\u00d500000(b2).returnforsuper().newsuper(rc2) : null, object.\u00f4\u00f80000()));
        }
        return (List)collection;
    }

    public static final n super(b.t.c.b.b.q.ib ib2) {
        n n2;
        do {
            if (b.t.c.b.b.o.f.b.o00000(ib2) == null) {
                return null;
            }
            f f2 = ib2.\u00d3\u00d2\u00d2000();
            n2 = f2 instanceof n ? (n)f2 : null;
        } while (n2 == null);
        return n2;
    }
}

