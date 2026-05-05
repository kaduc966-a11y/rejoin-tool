/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.c;

import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.b.b.c$_b;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.p;
import b.t.c.b.b.n.b.x;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.h.b;
import b.t.c.b.b.q.b.db;
import b.t.c.b.b.q.d.c.m;
import b.t.c.b.b.q.d.c.n;
import b.t.c.b.b.q.lc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class l {
    private final p \u00d300000;
    private final m new;
    private final ConcurrentHashMap o00000;

    public l(p p2, m m2) {
        this.\u00d300000 = p2;
        this.new = m2;
        this.o00000 = new ConcurrentHashMap();
    }

    public final f o00000(n object) {
        ConcurrentMap concurrentMap = this.o00000;
        d d2 = ((n)object).Object();
        Object object2 = concurrentMap.get(d2);
        if (object2 == null) {
            List list;
            Collection collection;
            Object object3;
            Object object4;
            Object object5;
            k k2 = ((n)object).Object().\u00d800000();
            if (((n)object).\u00d200000().\u00d600000() == c$_b.float) {
                object5 = ((n)object).\u00d200000().\u00f500000();
                object4 = new ArrayList();
                object5 = object5.iterator();
                while (object5.hasNext()) {
                    object3 = (String)object5.next();
                    if (b.t.c.b.b.n.b.f.o00000((x)this.new, (d)(object3 = d.String.o00000(b.o00000((String)object3).o00000())), this.\u00d300000.\u00d400000().\u00d300000().\u00d500000()) == null) continue;
                    object4.add(collection);
                }
                list = (List)object4;
            } else {
                list = mc.o00000(object);
            }
            object5 = list;
            object4 = new db(this.\u00d300000.\u00d400000().\u00f800000(), k2);
            object5 = (Iterable)object5;
            collection = new ArrayList();
            Iterator iterator = object5.iterator();
            while (iterator.hasNext()) {
                object3 = (j)iterator.next();
                if (this.\u00d300000.o00000((lc)object4, (j)object3) == null) continue;
                collection.add(object5);
            }
            object4 = mc.\u00f5O0000((Iterable)((List)collection));
            object = b.t.c.b.b.o.e.m.o00000.super("package " + k2 + " (" + object + ')', (Iterable)object4);
            object2 = concurrentMap.putIfAbsent(d2, object);
            if (object2 == null) {
                object2 = object;
            }
        }
        return (f)object2;
    }
}

