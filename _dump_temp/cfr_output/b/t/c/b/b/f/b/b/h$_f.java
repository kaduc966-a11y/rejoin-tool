/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.e.bb;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.d.f;
import b.t.c.b.b.f.b.b.e;
import b.t.c.b.b.f.b.b.h;
import b.t.c.b.b.f.b.b.h$_f$_b$0;
import b.t.c.b.b.f.b.b.h$_f$_b$1;
import b.t.c.b.b.f.b.b.h$_f$_b$2;
import b.t.c.b.b.f.b.v;
import b.t.c.b.b.f.b.y;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.i.i;
import b.t.c.b.b.i.l;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_rb;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.o.e.b$_b;
import b.t.c.b.b.q.b.fb;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.qb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class h$_f {
    private final Map \u00d400000;
    private final i \u00d300000;
    private final b.t.c.b.b.i.f new;
    final /* synthetic */ h o00000;

    public h$_f(h object) {
        this.o00000 = object;
        h$_f h$_f = this;
        object = h$_f.o00000.thisfloatsuper().Oo\u00d2000();
        Object object2 = this.o00000;
        h$_f h$_f2 = h$_f;
        int n2 = bb.\u00d200000(b.s.y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
        Map map = new LinkedHashMap(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object t2 = object.next();
            b$_rb b$_rb = (b$_rb)t2;
            Map map2 = map;
            map2.put(y.\u00d200000(((h)object2).\u00d8\u00d3\u00d2000().\u00f500000(), b$_rb.\u00d6\u00d4\u00d4000()), t2);
        }
        h$_f2.\u00d400000 = map;
        h$_f h$_f3 = this;
        object = h$_f3.o00000;
        object2 = h$_f3;
        this.\u00d300000 = this.o00000.\u00d8\u00d3\u00d2000().\u00d500000().\u00d200000(new h$_f$_b$0((h$_f)object2, (h)object));
        object = this;
        this.new = this.o00000.\u00d8\u00d3\u00d2000().\u00d500000().o00000(new h$_f$_b$1((h$_f)object));
    }

    public final ib o00000(f f2) {
        return (ib)this.\u00d300000.\u00f800000(f2);
    }

    private final Set new() {
        Object object;
        Object object2;
        Object object32;
        Object object4 = new HashSet<f>();
        Iterator iterator = this.o00000.\u00d3OO000().\u00d5OO000().iterator();
        while (iterator.hasNext()) {
            for (Object object32 : b$_b.o00000(((rc)iterator.next()).\u00f4\u00d6\u00d2000(), null, null, 3, null)) {
                if (!(object32 instanceof qb) && !(object32 instanceof pb)) continue;
                ((HashSet)object4).add(((hc)object32).\u00d5\u00f80000());
            }
        }
        iterator = this.o00000.thisfloatsuper().\u00d4\u00d2\u00d2000();
        object32 = (Collection)object4;
        Object object5 = this.o00000;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (b$_z)object2;
            object = object32;
            object.add(y.\u00d200000(((h)object5).\u00d8\u00d3\u00d2000().\u00f500000(), ((b$_z)object2).\u00d6\u00f8\u00d3000()));
        }
        Set set = (Set)object32;
        iterator = this.o00000.thisfloatsuper().interfacenullsuper();
        object32 = (Collection)object4;
        object5 = this.o00000;
        object = set;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (b$_n)object2;
            object4 = object32;
            object4.add(y.\u00d200000(((h)object5).\u00d8\u00d3\u00d2000().\u00f500000(), ((b$_n)object2).\u00d8\u00d5\u00d3000()));
        }
        return ub.super((Set)object, (Iterable)object32);
    }

    public final Collection o00000() {
        Object object = this.\u00d400000.keySet();
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (f)object.next();
            ib ib2 = this.o00000((f)object2);
            if (ib2 == null) continue;
            object2 = ib2;
            collection.add(object2);
        }
        return (List)collection;
    }

    private static final List new(h h2, b$_rb b$_rb) {
        return mc.\u00f5O0000((Iterable)h2.\u00d8\u00d3\u00d2000().null().\u00f500000().super((v)h2.\u00f8\u00d3\u00d2000(), b$_rb));
    }

    private static final ib new(h$_f object, h h2, f f2) {
        fb fb2;
        b$_rb b$_rb = (b$_rb)((h$_f)object).\u00d400000.get(f2);
        if (b$_rb != null) {
            b$_rb b$_rb2 = b$_rb;
            l l2 = h2.\u00d8\u00d3\u00d2000().\u00d500000();
            ib ib2 = h2;
            l l3 = h2.\u00d8\u00d3\u00d2000().\u00d500000();
            object = b$_rb2;
            fb2 = fb.o00000(l2, ib2, f2, ((h$_f)object).new, new e(l3, new h$_f$_b$2(h2, (b$_rb)object)), g.o00000);
        } else {
            fb2 = null;
        }
        return fb2;
    }

    private static final Set o00000(h$_f h$_f) {
        return h$_f.new();
    }

    static /* synthetic */ ib o00000(h$_f h$_f, h h2, f f2) {
        return h$_f.new(h$_f, h2, f2);
    }

    static /* synthetic */ Set new(h$_f h$_f) {
        return h$_f.o00000(h$_f);
    }

    static /* synthetic */ List o00000(h h2, b$_rb b$_rb) {
        return h$_f.new(h2, b$_rb);
    }
}

