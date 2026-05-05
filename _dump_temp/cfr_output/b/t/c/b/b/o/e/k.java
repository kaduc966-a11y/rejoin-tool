/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.o.d.fc;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.m.d;
import b.t.c.b.b.m.e;
import b.t.c.b.b.o.e.b$_b;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.k$_b$0;
import b.t.c.b.b.o.e.k$_c$4;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.o.i;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.qb;
import b.t.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class k
extends l {
    static final /* synthetic */ m[] o\u00d50000;
    private final ib O\u00d50000;
    private final b.t.c.b.b.i.f \u00d2\u00d50000;

    public k(b.t.c.b.b.i.l object, ib ib2) {
        this.O\u00d50000 = ib2;
        b.t.c.b.b.i.l l2 = object;
        object = this;
        this.\u00d2\u00d50000 = l2.o00000(new k$_b$0((k)object));
    }

    protected final ib \u00f4\u00d20000() {
        return this.O\u00d50000;
    }

    private final List \u00d8\u00d20000() {
        return (List)b.t.c.b.b.i.k.o00000(this.\u00d2\u00d50000, (Object)this, o\u00d50000[0]);
    }

    protected abstract List intnew();

    @Override
    public Collection super(j j2, g g2) {
        if (!j2.new(j.\u00d400000.\u00f400000())) {
            return mc.\u00d500000();
        }
        return this.\u00d8\u00d20000();
    }

    @Override
    public Collection \u00d300000(f f2, b.t.c.b.b.j.b.e object) {
        List list;
        object = this.\u00d8\u00d20000();
        if (object.isEmpty()) {
            list = mc.\u00d500000();
        } else {
            object = (Iterable)object;
            Collection collection = new d();
            object = object.iterator();
            while (object.hasNext()) {
                Object t2 = object.next();
                if (!(t2 instanceof qb) || !fc.o00000((Object)((qb)t2).\u00d5\u00f80000(), (Object)f2)) continue;
                collection.add(t2);
            }
            list = (List)collection;
        }
        return list;
    }

    @Override
    public Collection \u00d400000(f f2, b.t.c.b.b.j.b.e object) {
        List list;
        object = this.\u00d8\u00d20000();
        if (object.isEmpty()) {
            list = mc.\u00d500000();
        } else {
            object = (Iterable)object;
            Collection collection = new d();
            object = object.iterator();
            while (object.hasNext()) {
                Object t2 = object.next();
                if (!(t2 instanceof pb) || !fc.o00000((Object)((pb)t2).\u00d5\u00f80000(), (Object)f2)) continue;
                collection.add(t2);
            }
            list = (List)collection;
        }
        return list;
    }

    private final List \u00d300000(List list) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        ArrayList arrayList = new ArrayList(3);
        Object object7 = this.O\u00d50000.\u00d3OO000().\u00d5OO000();
        Collection object82 = new ArrayList();
        Object object8 = object7.iterator();
        while (object8.hasNext()) {
            object6 = b$_b.o00000(((rc)object8.next()).\u00f4\u00d6\u00d2000(), null, null, 3, null);
            mc.new(object82, (Iterable)object6);
        }
        object7 = (List)object82;
        Collection collection = new ArrayList();
        object8 = object7.iterator();
        while (object8.hasNext()) {
            object5 = object8.next();
            if (!(object5 instanceof hc)) continue;
            collection.add(object5);
        }
        Iterable iterable = (List)collection;
        Object object9 = new LinkedHashMap();
        object5 = iterable.iterator();
        while (object5.hasNext()) {
            Object object10;
            object4 = object9;
            object6 = object5.next();
            object8 = ((hc)object6).\u00d5\u00f80000();
            object3 = object8;
            object2 = object4.get(object3);
            if (object2 == null) {
                object = new ArrayList();
                object4.put(object3, object);
                object10 = object;
            } else {
                object10 = object2;
            }
            ((List)object10).add(object6);
        }
        for (Map.Entry entry : object9.entrySet()) {
            object7 = (f)entry.getKey();
            object6 = (List)entry.getValue();
            Map map = new LinkedHashMap();
            object8 = object6.iterator();
            while (object8.hasNext()) {
                object = map;
                object4 = object8.next();
                object2 = (hc)object4 instanceof ic;
                object9 = object2;
                Object object11 = object.get(object9);
                if (object11 == null) {
                    object11 = new ArrayList();
                    object.put(object9, object11);
                }
                ((List)object11).add(object4);
            }
            object9 = map.entrySet().iterator();
            while (object9.hasNext()) {
                List list2;
                object8 = (Map.Entry)object9.next();
                boolean bl = (Boolean)object8.getKey();
                object6 = (List)object8.getValue();
                i i2 = i.o00000;
                Object object12 = object7;
                Object object13 = (Collection)object6;
                if (bl) {
                    Iterable iterable2 = list;
                    object3 = object13;
                    object6 = object12;
                    i i3 = i2;
                    object8 = iterable2;
                    object4 = new ArrayList();
                    Iterator iterator = object8.iterator();
                    while (iterator.hasNext()) {
                        object2 = iterator.next();
                        if (!fc.o00000((Object)((ic)object2).\u00d5\u00f80000(), object7)) continue;
                        object4.add(object2);
                    }
                    List list3 = (List)object4;
                    i2 = i3;
                    object12 = object6;
                    object13 = object3;
                    list2 = list3;
                } else {
                    list2 = mc.\u00d500000();
                }
                i2.o00000((f)object12, (Collection)object13, list2, this.O\u00d50000, new k$_c$4(arrayList, this));
            }
        }
        return e.o00000(arrayList);
    }

    private static final List \u00d200000(k k2) {
        List list = k2.intnew();
        return mc.return((Collection)list, (Iterable)k2.\u00d300000(list));
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(k.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0);
        o\u00d50000 = mArray2;
    }

    static /* synthetic */ List super(k k2) {
        return k.\u00d200000(k2);
    }
}

