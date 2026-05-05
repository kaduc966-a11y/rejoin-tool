/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.o.d.fc;
import b.qb;
import b.s.fb;
import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.f.b.i$_b;
import b.t.c.b.b.f.b.y;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_db$_c;
import b.t.c.b.b.l.b$_db$_c$_c;
import b.t.c.b.b.l.b$_db$_c$_c$_b;
import b.t.c.b.b.o.c.ab;
import b.t.c.b.b.o.c.bb;
import b.t.c.b.b.o.c.c;
import b.t.c.b.b.o.c.cb;
import b.t.c.b.b.o.c.f;
import b.t.c.b.b.o.c.g;
import b.t.c.b.b.o.c.h;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.k;
import b.t.c.b.b.o.c.m;
import b.t.c.b.b.o.c.n;
import b.t.c.b.b.o.c.p;
import b.t.c.b.b.o.c.t;
import b.t.c.b.b.o.c.v;
import b.t.c.b.b.o.c.w;
import b.t.c.b.b.o.c.x;
import b.t.c.b.b.o.c.z;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.e.e;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.pc;
import b.t.c.b.b.q.sb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i {
    private final bc o00000;
    private final b.t.c.b.b.q.t \u00d200000;

    public i(bc bc2, b.t.c.b.b.q.t t2) {
        this.o00000 = bc2;
        this.\u00d200000 = t2;
    }

    private final b.t.c.b.b.b.c o00000() {
        return this.o00000.returnforsuper();
    }

    public final l o00000(b$_db serializable, b.t.c.b.b.l.d.e e2) {
        Object object;
        ib ib2 = this.o00000(y.super(e2, serializable.\u00d8\u00f4O000()));
        Map map = b.s.y.Object();
        if (serializable.O\u00f4O000() != 0 && !b.t.c.b.b.h.d.k.o00000(ib2) && b.t.c.b.b.o.n.\u00d200000(ib2) && (object = (sb)mc.\u00d3o0000(ib2.newifsuper())) != null) {
            object = object.\u00f5\u00d8o000();
            int n2 = b.e.bb.\u00d200000(b.s.y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
            map = new LinkedHashMap(n2);
            object = object.iterator();
            while (object.hasNext()) {
                Object t2 = object.next();
                jc jc2 = (jc)t2;
                Map map2 = map;
                map2.put(jc2.\u00d5\u00f80000(), t2);
            }
            Object object2 = serializable.dowhile();
            object = new ArrayList();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                serializable = (b$_db$_c)object2.next();
                qb qb2 = this.o00000((b$_db$_c)serializable, map, e2);
                if (qb2 == null) continue;
                serializable = qb2;
                object.add(serializable);
            }
            map = b.s.y.o00000((List)object);
        }
        return new e(ib2.nullint(), map, b.t.c.b.b.q.g.o00000);
    }

    private final qb o00000(b$_db$_c b$_db$_c, Map object, b.t.c.b.b.l.d.e e2) {
        jc jc2 = (jc)object.get(y.\u00d200000(e2, b$_db$_c.\u00d8\u00d6O000()));
        if (jc2 == null) {
            return null;
        }
        object = jc2;
        return new qb(y.\u00d200000(e2, b$_db$_c.\u00d8\u00d6O000()), this.\u00d200000(object.forclasssuper(), b$_db$_c.\u00f4\u00d6O000(), e2));
    }

    private final j \u00d200000(rc rc2, b$_db$_c$_c b$_db$_c$_c, b.t.c.b.b.l.d.e object) {
        Object object2 = object = this.o00000(rc2, b$_db$_c$_c, (b.t.c.b.b.l.d.e)object);
        Object object3 = this.o00000((j)object2, rc2, b$_db$_c$_c) ? object : null;
        if (object3 == null) {
            object3 = b.t.c.b.b.o.c.y.\u00d800000.o00000("Unexpected argument value: actual type " + b$_db$_c$_c.\u00f6\u00d4O000() + " != expected type " + rc2);
        }
        return object3;
    }

    public final j o00000(rc rc2, b$_db$_c$_c object, b.t.c.b.b.l.d.e e2) {
        boolean bl = b.t.c.b.b.l.d.l.OO0000.\u00d200000(((b$_db$_c$_c)object).\u00f6\u00d3O000());
        b$_db$_c$_c$_b b$_db$_c$_c$_b = ((b$_db$_c$_c)object).\u00f6\u00d4O000();
        switch (b$_db$_c$_c$_b == null ? -1 : i$_b.o00000[b$_db$_c$_c$_b.ordinal()]) {
            case 1: {
                j j2;
                byte by = (byte)((b$_db$_c$_c)object).\u00d4\u00d5O000();
                if (bl) {
                    byte by2 = by;
                    j2 = new w(by2);
                } else {
                    byte by3 = by;
                    j2 = new n(by3);
                }
                return j2;
            }
            case 2: {
                return new g((char)((b$_db$_c$_c)object).\u00d4\u00d5O000());
            }
            case 3: {
                j j3;
                short s2 = (short)((b$_db$_c$_c)object).\u00d4\u00d5O000();
                if (bl) {
                    short s3 = s2;
                    j3 = new c(s3);
                } else {
                    short s4 = s2;
                    j3 = new x(s4);
                }
                return j3;
            }
            case 4: {
                j j4;
                int n2 = (int)((b$_db$_c$_c)object).\u00d4\u00d5O000();
                if (bl) {
                    int n3 = n2;
                    j4 = new ab(n3);
                } else {
                    int n4 = n2;
                    j4 = new p(n4);
                }
                return j4;
            }
            case 5: {
                j j5;
                long l2 = ((b$_db$_c$_c)object).\u00d4\u00d5O000();
                if (bl) {
                    long l3 = l2;
                    j5 = new v(l3);
                } else {
                    long l4 = l2;
                    j5 = new b.t.c.b.b.o.c.l(l4);
                }
                return j5;
            }
            case 6: {
                return new cb(((b$_db$_c$_c)object).\u00d3\u00d3O000());
            }
            case 7: {
                return new h(((b$_db$_c$_c)object).\u00d6\u00d3O000());
            }
            case 8: {
                return new b.t.c.b.b.o.c.e(((b$_db$_c$_c)object).\u00d4\u00d5O000() != 0L);
            }
            case 9: {
                return new z(e2.new(((b$_db$_c$_c)object).publicfloat()));
            }
            case 10: {
                return new t(y.super(e2, ((b$_db$_c$_c)object).intfor()), ((b$_db$_c$_c)object).\u00d8\u00d4O000());
            }
            case 11: {
                return new f(y.super(e2, ((b$_db$_c$_c)object).intfor()), y.\u00d200000(e2, ((b$_db$_c$_c)object).\u00d4\u00d4O000()));
            }
            case 12: {
                return new bb(this.o00000(((b$_db$_c$_c)object).interfacefor(), e2));
            }
            case 13: {
                object = ((b$_db$_c$_c)object).\u00d8\u00d3O000();
                m m2 = m.o00000;
                Object object2 = object;
                object = new ArrayList(mc.o00000((Iterable)object, 10));
                Iterator iterator = object2.iterator();
                while (iterator.hasNext()) {
                    object2 = iterator.next();
                    object2 = (b$_db$_c$_c)object2;
                    Object object3 = object;
                    i i2 = this;
                    object3.add(i2.o00000(i2.o00000().oO0000(), (b$_db$_c$_c)object2, e2));
                }
                return m2.super((List)object, rc2);
            }
        }
        throw new IllegalStateException(("Unsupported annotation argument type: " + ((b$_db$_c$_c)object).\u00f6\u00d4O000() + " (expected " + rc2 + ')').toString());
    }

    private final boolean o00000(j j2, rc i2, b$_db$_c$_c b$_db$_c$_c) {
        b$_db$_c$_c$_b b$_db$_c$_c$_b = b$_db$_c$_c.\u00f6\u00d4O000();
        switch (b$_db$_c$_c$_b == null ? -1 : i$_b.o00000[b$_db$_c$_c$_b.ordinal()]) {
            case 10: {
                kb kb2 = i2.thisdosuper().\u00f4OO000();
                i2 = kb2 instanceof ib ? (ib)kb2 : null;
                return i2 == null || b.t.c.b.b.b.c.\u00d500000((ib)i2);
            }
            case 13: {
                if (!(j2 instanceof k && ((List)((k)j2).o00000()).size() == b$_db$_c$_c.\u00d8\u00d3O000().size())) {
                    String string = "Deserialized ArrayValue should have the same number of elements as the original array value: ".concat(String.valueOf(j2));
                    throw new IllegalStateException(string.toString());
                }
                rc rc2 = this.o00000().private((rc)i2);
                if (rc2 == null) {
                    return false;
                }
                i2 = rc2;
                Object object = mc.new((Collection)((k)j2).o00000());
                if (object instanceof Collection && ((Collection)object).isEmpty()) {
                    return true;
                }
                object = object.iterator();
                while (object.hasNext()) {
                    int n2 = ((fb)object).\u00f4\u00d4\u00d3000();
                    if (this.o00000((j)((List)((k)j2).o00000()).get(n2), (rc)i2, b$_db$_c$_c.\u00f4O0000(n2))) continue;
                    return false;
                }
                return true;
            }
        }
        return fc.o00000((Object)j2.o00000(this.o00000), (Object)i2);
    }

    private final ib o00000(d d2) {
        return pc.o00000(this.o00000, d2, this.\u00d200000);
    }
}

