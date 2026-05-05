/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.o.d.fc;
import b.t.b.b;
import b.t.bb;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.c.k$_b$0;
import b.t.c.b.c.k$_b$1;
import b.t.c.b.c.m;
import b.t.c.b.c.n;
import b.t.c.b.lb;
import b.t.c.b.mc;
import b.t.c.b.u;
import b.t.l;
import b.t.q;
import b.t.v;
import b.t.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class k {
    public static final m o00000(b.t.c.b.b.d.k k2, z z2) {
        Object object = k2;
        Object object2 = z2;
        k$_b$0 k$_b$0 = new k$_b$0((z)object2, (b.t.c.b.b.d.k)object);
        object = z2;
        object2 = k2;
        return new m(z2, k2.super(), k$_b$0, new k$_b$1((b.t.c.b.b.d.k)object2, (z)object));
    }

    private static final List \u00d200000(z object, b.t.c.b.b.d.k k2, m m2) {
        Object object2 = object = (Iterable)object.O\u00d4O000();
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (bb)object3;
            Object object4 = object;
            object3 = new mc(m2, object3.\u00f5\u00d4o000(), fc.o00000((Object)k2, (Object)d$_b.\u00d3\u00d20000) || fc.o00000((Object)k2, (Object)d$_b.oo0000) ? l.o00000 : l.\u00d500000, false);
            ((mc)object3).\u00f500000(b.s.mc.o00000(u.\u00d500000.\u00d500000()));
            object4.add(object3);
        }
        return (List)object;
    }

    private static final List o00000(b.t.c.b.b.d.k object, z z2, m object2) {
        Object[] objectArray;
        Object object3;
        z z3;
        Object object4 = object;
        if (fc.o00000(object4, (Object)d$_b.privateObject)) {
            z3 = ((n)b.o.d.z.o00000(b.o.d.z.\u00d200000(Iterable.class, q.\u00d400000.o00000()))).\u00f4\u00d8\u00d2000();
            if (z3 == null) {
                throw new lb("No mutable collection class found: " + b.o.d.z.\u00d200000(Iterable.class));
            }
        } else if (fc.o00000(object4, (Object)d$_b.\u00d5o0000)) {
            z3 = ((n)b.o.d.z.o00000(b.o.d.z.\u00d200000(Collection.class, q.\u00d400000.o00000()))).\u00f4\u00d8\u00d2000();
            if (z3 == null) {
                throw new lb("No mutable collection class found: " + b.o.d.z.\u00d200000(Collection.class));
            }
        } else if (fc.o00000(object4, (Object)d$_b.\u00d3o0000)) {
            z3 = ((n)b.o.d.z.o00000(b.o.d.z.\u00d200000(Collection.class, q.\u00d400000.o00000()))).\u00f4\u00d8\u00d2000();
            if (z3 == null) {
                throw new lb("No mutable collection class found: " + b.o.d.z.\u00d200000(Collection.class));
            }
        } else if (fc.o00000(object4, (Object)d$_b.\u00f8\u00d60000)) {
            z3 = ((n)b.o.d.z.o00000(b.o.d.z.\u00d200000(Iterator.class, q.\u00d400000.o00000()))).\u00f4\u00d8\u00d2000();
            if (z3 == null) {
                throw new lb("No mutable collection class found: " + b.o.d.z.\u00d200000(Iterator.class));
            }
        } else {
            z3 = null;
        }
        object = z3;
        object2 = object2.O\u00d4O000();
        Iterator iterator = object2;
        object2 = new ArrayList(b.s.mc.o00000((Iterable)object2, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            object3 = (bb)object3;
            objectArray = object2;
            objectArray.add(q.\u00d400000.\u00d200000(b.super((v)object3, null, false, null, 7, null)));
        }
        object4 = (List)object2;
        Object[] objectArray2 = new z[2];
        object2 = objectArray2;
        objectArray2[0] = z2;
        object2[1] = object;
        object2 = b.s.mc.\u00d500000(object2);
        iterator = object2;
        object2 = new ArrayList(b.s.mc.o00000((Iterable)object2, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            object3 = (z)object3;
            objectArray = object2;
            objectArray.add(b.super((v)object3, (List)object4, false, null, 6, null));
        }
        return (List)object2;
    }

    static /* synthetic */ List o00000(z z2, b.t.c.b.b.d.k k2, m m2) {
        return k.\u00d200000(z2, k2, m2);
    }

    static /* synthetic */ List \u00d200000(b.t.c.b.b.d.k k2, z z2, m m2) {
        return k.o00000(k2, z2, m2);
    }
}

