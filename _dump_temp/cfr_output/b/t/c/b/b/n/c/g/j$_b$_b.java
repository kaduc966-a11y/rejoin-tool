/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.e.bb;
import b.qb;
import b.s.l;
import b.s.mc;
import b.s.y;
import b.s.z;
import b.t.c.b.b.n.b.o;
import b.t.c.b.b.n.c.g.b;
import b.t.c.b.b.n.c.g.g;
import b.t.c.b.b.n.c.g.j$_b;
import b.t.c.b.b.n.c.g.m;
import b.t.c.b.b.o.h.e;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j$_b$_b {
    private final String \u00d500000;
    private final String Object;
    private final List \u00d400000;
    private qb \u00d200000;
    private b.t.c.b.b.o.o \u00d600000;
    final /* synthetic */ j$_b o00000;

    public j$_b$_b(j$_b _b2, String string, String string2) {
        this.o00000 = _b2;
        this.\u00d500000 = string;
        this.Object = string2;
        this.\u00d400000 = new ArrayList();
        this.\u00d200000 = yc.o00000("V", null);
    }

    public final void super(String object, m ... mArray) {
        b b2;
        Collection collection = this.\u00d400000;
        String string = object;
        if (mArray.length == 0) {
            b2 = null;
        } else {
            object = z.\u00d8\u00d20000(mArray);
            String string2 = string;
            int n2 = bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
            Map map = new LinkedHashMap(n2);
            object = object.iterator();
            while (object.hasNext()) {
                Object object2 = object.next();
                Object object3 = (l)object2;
                Map map2 = map;
                object3 = (l)object2;
                object2 = ((l)object3).o00000();
                object3 = (m)((l)object3).String();
                map2.put(object2, object3);
            }
            string = string2;
            object = map;
            b2 = new b((Map)object);
        }
        collection.add(yc.o00000(string, b2));
    }

    public final void \u00d200000(String object, m ... mArray) {
        Map map;
        String string = object;
        object = z.\u00d8\u00d20000(mArray);
        String string2 = string;
        j$_b$_b j$_b$_b = this;
        int n2 = bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
        Map map2 = new LinkedHashMap(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            Object object3 = (l)object2;
            map = map2;
            object3 = (l)object2;
            object2 = ((l)object3).o00000();
            object3 = (m)((l)object3).String();
            map.put(object2, object3);
        }
        map = map2;
        object = map;
        j$_b$_b.\u00d200000 = yc.o00000(string2, new b((Map)object));
    }

    public final void super(e e2) {
        this.\u00d200000 = yc.o00000(e2.\u00d400000(), null);
    }

    public final void super() {
        this.\u00d600000 = b.t.c.b.b.o.o.o00000;
    }

    public final qb \u00d200000() {
        Object object;
        Object object2;
        Object object3 = o.o00000;
        Object object4 = this.o00000;
        o o2 = object3;
        String string = ((j$_b)object4).super();
        o o3 = object3;
        object3 = this.\u00d400000;
        object4 = this.\u00d500000;
        Object object5 = o3;
        Object object6 = string;
        Object object7 = o2;
        Iterator iterator = object3;
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (qb)object2;
            object = object3;
            object.add((String)((qb)object2).new());
        }
        object = (List)object3;
        String string2 = ((o)object7).super((String)object6, ((o)object5).super((String)object4, (List)object, (String)this.\u00d200000.new()));
        object3 = this.\u00d400000;
        object4 = (b)this.\u00d200000.o00000();
        object7 = string2;
        iterator = object3;
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (qb)object2;
            object = object3;
            object.add((b)((qb)object2).o00000());
        }
        object = (List)object3;
        Object object8 = object4;
        object3 = this.\u00d600000;
        object4 = this.Object;
        object5 = object;
        object6 = object8;
        return yc.o00000(object7, new g((b)object6, (List)object5, (String)object4, (b.t.c.b.b.o.o)((Object)object3)));
    }
}

