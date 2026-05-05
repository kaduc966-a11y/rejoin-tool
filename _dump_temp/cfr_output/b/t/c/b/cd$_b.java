/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.e.bb;
import b.o.d.w;
import b.qb;
import b.s.l;
import b.s.y;
import b.t.c.b.b.c.b;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.k;
import b.t.c.b.cd;
import b.t.c.b.mc;
import b.t.c.b.p;
import b.t.c.b.u;
import b.t.c.b.z;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class cd$_b {
    private cd$_b() {
    }

    public final cd o00000(List list, cd iterator, z object, ClassLoader classLoader) {
        Object object2;
        Object object3;
        Object object4;
        Object object5 = object4 = (Iterable)list;
        Collection collection = new ArrayList(b.s.mc.o00000((Iterable)object4, 10));
        Object object6 = object5.iterator();
        while (object6.hasNext()) {
            object3 = object6.next();
            object2 = (k)object3;
            object4 = collection;
            object4.add(new mc((z)object, ((k)object2).\u00d300000(), p.super(((k)object2).\u00d400000()), b.o00000((k)object2)));
        }
        object = (List)collection;
        object4 = b.s.mc.O\u00d20000(list);
        int n2 = bb.\u00d200000(y.\u00d200000(b.s.mc.o00000((Iterable)object4, 10)), 16);
        Object object7 = object4;
        object6 = new LinkedHashMap(n2);
        object2 = object7.iterator();
        while (object2.hasNext()) {
            Object e2 = object2.next();
            object3 = object6;
            object4 = (l)e2;
            n2 = ((l)object4).\u00d200000();
            object4 = yc.o00000(((k)((l)object4).\u00d300000()).\u00d600000(), object.get(n2));
            object3.put((Object)((qb)object4).new(), (Object)((qb)object4).o00000());
        }
        object4 = object6;
        object5 = object4 = new cd((List)object, (Map)object4, (cd)((Object)iterator), null);
        object7 = ((Iterable)object).iterator();
        int n3 = 0;
        while (object7.hasNext()) {
            Iterable iterable;
            int n4 = n3++;
            Iterable iterable2 = ((k)list.get(n4)).\u00d200000();
            object3 = (mc)object7.next();
            iterator = iterable2;
            iterable2 = new ArrayList(b.s.mc.o00000(iterable2, 10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                object = (db)object;
                object2 = iterable2;
                object2.add(p.super((db)object, classLoader, (cd)object5, null, 4, null));
            }
            Object object8 = object3;
            if ((iterable2 = (Collection)((List)iterable2)).isEmpty()) {
                object3 = object8;
                iterable = b.s.mc.o00000(u.\u00d500000.\u00d500000());
                object8 = object3;
            } else {
                iterable = iterable2;
            }
            ((mc)object8).\u00f500000((List)iterable);
        }
        return object4;
    }

    public /* synthetic */ cd$_b(w w2) {
        this();
    }
}

