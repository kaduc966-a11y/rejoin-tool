/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.g.c;
import b.o.r;
import b.s.mc;
import b.t.bb;
import b.t.c.b.c.d;
import b.t.c.b.c.g$_b$0;
import b.t.c.b.c.g$_b$1;
import b.t.c.b.c.h;
import b.t.c.b.c.j;
import b.t.c.b.c.n;
import b.t.c.b.c.p;
import b.t.c.b.lb;
import b.t.l;
import b.t.q;
import b.t.u;
import b.t.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g {
    public static final u o00000(u u2) {
        u u3;
        Collection<Object> collection;
        Object object;
        boolean bl;
        Object object2;
        Object object3 = u2.privatevoid();
        z z2 = object3 instanceof z ? (z)object3 : null;
        if (z2 == null) {
            return null;
        }
        z z3 = z2;
        List list = u2.\u00f5\u00f60000();
        object3 = list;
        if (!(object3 instanceof Collection) || !((Collection)object3).isEmpty()) {
            object2 = object3.iterator();
            while (object2.hasNext()) {
                if (((q)object2.next()).new() == l.\u00d500000) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        if (bl) {
            return null;
        }
        object3 = g.\u00d300000(z3);
        if (object3.size() != list.size()) {
            return null;
        }
        object2 = list;
        Iterable iterable = object2;
        Object object4 = new ArrayList(mc.o00000((Iterable)object2, 10));
        for (Object object5 : iterable) {
            Object object6;
            object = (q)object5;
            collection = object4;
            if (((q)object).new() == l.\u00d500000) {
                object6 = object;
            } else {
                u3 = ((q)object).o00000();
                object2 = ((q)object).new() == l.new ? u3 : null;
                object6 = q.\u00d400000.\u00d200000(new p((u)object2, new d((q)object), false));
            }
            collection.add(object6);
        }
        object = (List)object4;
        object2 = j.\u00d300000.o00000(z3, (List)object, false);
        int n2 = ((Collection)list).size();
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object5;
            object4 = (q)list.get(i2);
            if (((q)object4).new() == l.\u00d500000) continue;
            Iterator iterator = ((bb)object3.get(i2)).\u00f4\u00d4o000();
            object5 = new ArrayList();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                u3 = iterator.next();
                collection = object5;
                collection.add(j.o00000((j)object2, u3, null, 2, null).o00000());
            }
            object5 = (List)object5;
            if (((q)object4).new() == l.o00000) {
                ((Collection)object5).add(((q)object4).o00000());
            }
            ((p)((q)object.get(i2)).o00000()).\u00f5\u00f5\u00d2000().\u00d800000((List)object5);
        }
        n n3 = u2 instanceof n ? (n)u2 : null;
        n n4 = u2 instanceof n ? (n)u2 : null;
        return new h(z3, (List)object, u2.\u00f4\u00f60000(), u2.\u00d8\u00f50000(), n3 != null ? n3.nulldosuper() : null, false, false, false, n4 != null ? n4.\u00f4\u00d8\u00d2000() : null, null, 512, null);
    }

    public static final List \u00d300000(z z2) {
        return c.\u00d6o0000(c.\u00d6\u00d20000(c.o00000((Object)z2, (b.o.e.g)g$_b$0.\u00f4\u00d3\u00d5000), g$_b$1.\u00d8\u00d3\u00d5000));
    }

    private static final Void new() {
        throw new lb("javaType for captured types is not supported");
    }

    private static final z \u00d500000(z z2) {
        if (z2.newfor()) {
            Class<?> clazz = r.\u00d300000(z2).getDeclaringClass();
            if (clazz != null) {
                return r.o00000(clazz);
            }
        }
        return null;
    }

    private static final Iterable new(z z2) {
        return z2.O\u00d4O000();
    }

    public static final /* synthetic */ Void o00000() {
        return g.new();
    }

    static /* synthetic */ z \u00d400000(z z2) {
        return g.\u00d500000(z2);
    }

    static /* synthetic */ Iterable o00000(z z2) {
        return g.new(z2);
    }
}

