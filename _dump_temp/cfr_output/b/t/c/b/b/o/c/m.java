/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.s.mc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.c.cb;
import b.t.c.b.b.o.c.e;
import b.t.c.b.b.o.c.g;
import b.t.c.b.b.o.c.h;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.k;
import b.t.c.b.b.o.c.l;
import b.t.c.b.b.o.c.m$_b$0;
import b.t.c.b.b.o.c.n;
import b.t.c.b.b.o.c.p;
import b.t.c.b.b.o.c.s;
import b.t.c.b.b.o.c.u;
import b.t.c.b.b.o.c.x;
import b.t.c.b.b.o.c.z;
import b.t.c.b.b.q.bc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m {
    public static final m o00000 = new m();

    private m() {
    }

    public final k super(List list, rc rc2) {
        return new s(list, rc2);
    }

    public final j super(Object object, bc bc2) {
        Object object2 = object;
        if (object2 instanceof Byte) {
            return new n(((Number)object).byteValue());
        }
        if (object2 instanceof Short) {
            return new x(((Number)object).shortValue());
        }
        if (object2 instanceof Integer) {
            return new p(((Number)object).intValue());
        }
        if (object2 instanceof Long) {
            return new l(((Number)object).longValue());
        }
        if (object2 instanceof Character) {
            return new g(((Character)object).charValue());
        }
        if (object2 instanceof Float) {
            return new cb(((Number)object).floatValue());
        }
        if (object2 instanceof Double) {
            return new h(((Number)object).doubleValue());
        }
        if (object2 instanceof Boolean) {
            return new e((Boolean)object);
        }
        if (object2 instanceof String) {
            return new z((String)object);
        }
        if (object2 instanceof byte[]) {
            return this.super(b.s.z.\u00d5O0000((byte[])object), bc2, b.t.c.b.b.b.j.OO0000);
        }
        if (object2 instanceof short[]) {
            return this.super(b.s.z.nullnew((short[])object), bc2, b.t.c.b.b.b.j.\u00d3O0000);
        }
        if (object2 instanceof int[]) {
            return this.super(b.s.z.\u00f8\u00d20000((int[])object), bc2, b.t.c.b.b.b.j.super);
        }
        if (object2 instanceof long[]) {
            return this.super(b.s.z.\u00d8O0000((long[])object), bc2, b.t.c.b.b.b.j.\u00d200000);
        }
        if (object2 instanceof char[]) {
            return this.super(b.s.z.thisnew((char[])object), bc2, b.t.c.b.b.b.j.\u00d4O0000);
        }
        if (object2 instanceof float[]) {
            return this.super(b.s.z.privatenew((float[])object), bc2, b.t.c.b.b.b.j.\u00d2O0000);
        }
        if (object2 instanceof double[]) {
            return this.super(b.s.z.o\u00d30000((double[])object), bc2, b.t.c.b.b.b.j.\u00d800000);
        }
        if (object2 instanceof boolean[]) {
            return this.super(b.s.z.\u00d3O0000((boolean[])object), bc2, b.t.c.b.b.b.j.class);
        }
        if (object2 == null) {
            return new u();
        }
        return null;
    }

    public static /* synthetic */ j super(m m2, Object object, bc bc2, int n2, Object object2) {
        if ((n2 & 2) != 0) {
            bc2 = null;
        }
        return m2.super(object, bc2);
    }

    private final k super(List object, bc bc2, b.t.c.b.b.b.j j2) {
        object = mc.\u00f5O0000((Iterable)object);
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            j j3 = m.super(this, object2, null, 2, null);
            if (j3 == null) continue;
            object2 = j3;
            collection.add(object2);
        }
        object = (List)collection;
        if (bc2 != null) {
            return new s((List)object, bc2.returnforsuper().\u00d200000(j2));
        }
        Object object3 = object;
        object = j2;
        return new k((List)object3, new m$_b$0((b.t.c.b.b.b.j)((Object)object)));
    }

    private static final rc super(b.t.c.b.b.b.j j2, bc bc2) {
        return bc2.returnforsuper().\u00d200000(j2);
    }

    static /* synthetic */ rc \u00d200000(b.t.c.b.b.b.j j2, bc bc2) {
        return m.super(j2, bc2);
    }
}

