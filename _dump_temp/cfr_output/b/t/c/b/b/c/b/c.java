/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.b;

import b.i;
import b.o.d.fc;
import b.qd;
import b.s.mc;
import b.t.c.b.b.c.ab;
import b.t.c.b.b.c.b.b;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.b.c$_b$0;
import b.t.c.b.b.c.b.c$_b$1;
import b.t.c.b.b.c.b.c$_c;
import b.t.c.b.b.c.b.h;
import b.t.c.b.b.c.bb;
import b.t.c.b.b.c.d;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.e;
import b.t.c.b.b.c.fb;
import b.t.c.b.b.c.hb;
import b.t.c.b.b.c.ib;
import b.t.c.b.b.c.k;
import b.t.c.b.b.c.kb$_b;
import b.t.c.b.b.c.kb$_c;
import b.t.c.b.b.c.kb$_d;
import b.t.c.b.b.c.n;
import b.t.c.b.b.c.q;
import b.t.c.b.b.c.s;
import b.t.c.b.b.c.x;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_b$_b;
import b.t.c.b.b.l.b$_b$_c;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_c$_b;
import b.t.c.b.b.l.b$_m;
import b.t.c.b.b.l.b$_m$_b;
import b.t.c.b.b.l.b$_m$_c;
import b.t.c.b.b.l.b$_m$_d;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_n$_b;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_c;
import b.t.c.b.b.l.b$_nb$_c$_b;
import b.t.c.b.b.l.b$_nb$_c$_c;
import b.t.c.b.b.l.b$_nb$_d;
import b.t.c.b.b.l.d.l;
import b.t.c.b.b.p.d$_f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class c {
    private static final b$_b$_c o00000(b b2, k k2) {
        b$_b$_c b$_b$_c = b$_b.floatfloatnew();
        for (db db2 : (Iterable)k2.\u00d200000()) {
            b$_b$_c.Oo0000(c.o00000(b2, db2).supernullnew());
        }
        Iterator iterator = ((Iterable)b2.o00000()).iterator();
        while (iterator.hasNext()) {
            ((f)iterator.next()).o00000(k2, b$_b$_c, b2);
        }
        b$_b$_c.\u00d3\u00f80000(b2.\u00d200000(k2.\u00d300000()));
        b$_b$_c.O\u00f80000(k2.\u00d600000());
        boolean bl = b.t.c.b.b.c.b.o00000(k2);
        if (bl != b$_b.\u00f8\u00d5\u00d4000().O\u00d5\u00d4000()) {
            b$_b$_c.\u00d200000(bl);
        }
        if (k2.\u00d400000() == hb.\u00d200000) {
            b$_b$_c.super(b$_b$_b.new);
        } else if (k2.\u00d400000() == hb.o00000) {
            b$_b$_c.super(b$_b$_b.o00000);
        }
        return b$_b$_c;
    }

    private static final b$_nb$_c$_c o00000(b b2, s object) {
        b$_nb$_c$_c b$_nb$_c$_c = b$_nb$_c.\u00f4\u00d2o000();
        if (fc.o00000(object, (Object)s.o00000)) {
            b$_nb$_c$_c.super(b$_nb$_c$_b.\u00d3\u00d80000);
        } else {
            hb hb2 = ((s)object).o00000();
            object = ((s)object).Object();
            if (hb2 == null || object == null) {
                throw new ab("Variance and type must be set for non-star type projection", null, 2, null);
            }
            if (hb2 == hb.\u00d200000) {
                b$_nb$_c$_c.super(b$_nb$_c$_b.\u00d4\u00d80000);
            } else if (hb2 == hb.o00000) {
                b$_nb$_c$_c.super(b$_nb$_c$_b.nullclass);
            }
            b$_nb$_c$_c.\u00d200000(c.o00000(b2, (db)object).supernullnew());
        }
        return b$_nb$_c$_c;
    }

    private static final b$_nb$_d o00000(b b2, db db2) {
        int n2;
        b$_nb$_d b$_nb$_d = b$_nb.\u00f8\u00d2\u00d4000();
        Object object = db2.new();
        if (object instanceof kb$_c) {
            b$_nb$_d.\u00f4\u00f50000(b2.o00000(((kb$_c)object).o00000()));
        } else if (object instanceof kb$_d) {
            b$_nb$_d.\u00d6\u00f50000(b2.o00000(((kb$_d)object).\u00d200000()));
        } else if (object instanceof kb$_b) {
            b$_nb$_d.Objectvoid(((kb$_b)object).\u00d300000());
        } else {
            throw new qd();
        }
        for (Object object2 : (Iterable)db2.o00000()) {
            b$_nb$_d.super(c.o00000(b2, (s)object2));
        }
        db db3 = db2.\u00d500000();
        if (db3 != null) {
            object = db3;
            b$_nb$_d.\u00d8O0000(c.o00000(b2, (db)object).supernullnew());
        }
        db db4 = db2.\u00d800000();
        if (db4 != null) {
            object = db4;
            b$_nb$_d.\u00d4O0000(c.o00000(b2, (db)object).supernullnew());
        }
        q q2 = db2.\u00d300000();
        if (q2 != null) {
            Object object2;
            object = q2;
            object2 = c.o00000(b2, ((q)object).\u00d200000());
            String string = ((q)object).super();
            if (string != null) {
                object = string;
                b$_nb$_d.\u00f8\u00f50000(b2.\u00d200000((String)object));
            }
            b$_nb$_d.\u00d2O0000(((b$_nb$_d)object2).supernullnew());
        }
        object = ((Iterable)b2.o00000()).iterator();
        while (object.hasNext()) {
            ((f)object.next()).o00000(db2, b$_nb$_d, b2);
        }
        if (b.t.c.b.b.c.b.o00000(db2)) {
            b$_nb$_d.super(true);
        }
        if ((n2 = db2.return() >> 1) != b$_nb.\u00d2o\u00d4000().\u00d4o\u00d4000()) {
            b$_nb$_d.voidvoid(n2);
        }
        return b$_nb$_d;
    }

    public static final b$_n$_b o00000(b b2, e e2) {
        b$_n$_b b$_n$_b;
        block8: {
            Object object;
            Object object2;
            Iterator iterator;
            Object object32;
            b$_n$_b = b$_n.\u00f6\u00d2\u00d3000();
            for (Object object32 : (Iterable)e2.\u00d600000()) {
                b$_n$_b.\u00d800000(c.o00000(b2, (k)object32).\u00d4\u00d6\u00d4000());
            }
            db db2 = e2.\u00f400000();
            if (db2 != null) {
                iterator = db2;
                b$_n$_b.\u00d2o0000(c.o00000(b2, (db)((Object)iterator)).supernullnew());
            }
            object32 = e2.class();
            b$_n$_b b$_n$_b2 = b$_n$_b;
            iterator = object32;
            object32 = new ArrayList(mc.o00000((Iterable)object32, 10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object2 = iterator.next();
                object2 = (fb)object2;
                object = object32;
                object.add(c.o00000(b2, object2).\u00f6\u00d6o000());
            }
            b$_n$_b2.int((List)object32);
            object32 = e2.class();
            b$_n$_b2 = b$_n$_b;
            iterator = object32;
            object32 = new ArrayList(mc.o00000((Iterable)object32, 10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object2 = iterator.next();
                object2 = (fb)object2;
                object = object32;
                object.add(c.o00000(b2, ((fb)object2).\u00d200000()).supernullnew());
            }
            b$_n$_b2.\u00d800000((List)object32);
            fb fb2 = e2.\u00d400000();
            if (fb2 != null) {
                iterator = fb2;
                b$_n$_b.class(c.o00000(b2, (fb)((Object)iterator)).\u00f6\u00d6o000());
            }
            b$_n$_b.\u00d4o0000(c.o00000(b2, e2.int()).supernullnew());
            object32 = e2.\u00d4O0000();
            b$_n$_b2 = b$_n$_b;
            iterator = object32;
            object32 = new ArrayList();
            object2 = iterator.iterator();
            while (object2.hasNext()) {
                iterator = (ib)object2.next();
                Integer n2 = c.o00000(b2, (ib)((Object)iterator));
                if (n2 == null) continue;
                iterator = n2;
                object32.add(iterator);
            }
            b$_n$_b2.\u00f600000((List)object32);
            iterator = ((Iterable)b2.o00000()).iterator();
            while (iterator.hasNext()) {
                ((f)iterator.next()).o00000(e2, b$_n$_b, b2);
            }
            b$_n$_b.\u00f40O000(b2.\u00d200000(e2.\u00f800000()));
            int n3 = e2.do() | l.return.super(!((Collection)e2.\u00d800000()).isEmpty());
            if (n3 != b$_n.floatsupernew().O\u00d3\u00d3000()) {
                b$_n$_b.intnull(n3);
            }
            b$_n$_b.donull(e2.\u00d3O0000().\u00d200000() | l.return.super(!((Collection)e2.\u00d3O0000().o00000()).isEmpty()));
            n n4 = e2.\u00d300000();
            if (n4 == null) break block8;
            n n5 = n4;
            b$_n$_b.\u00d60O000(n5.\u00d200000() | l.return.super(!((Collection)n5.o00000()).isEmpty()));
        }
        return b$_n$_b;
    }

    private static final b$_c$_b o00000(b b2, fb fb2) {
        Iterator iterator;
        b$_c$_b b$_c$_b = b$_c.\u00d4\u00f4o000();
        b$_c$_b.\u00d400000(c.o00000(b2, fb2.\u00d200000()).supernullnew());
        db db2 = fb2.\u00d400000();
        if (db2 != null) {
            iterator = db2;
            b$_c$_b.\u00d800000(c.o00000(b2, (db)((Object)iterator)).supernullnew());
        }
        x x2 = fb2.\u00d500000();
        if (x2 != null) {
            iterator = x2;
            b$_c$_b.\u00d800000(h.o00000((x)((Object)iterator), b2.Object()).\u00f8\u00d2O000());
        }
        iterator = ((Iterable)b2.o00000()).iterator();
        while (iterator.hasNext()) {
            ((f)iterator.next()).o00000(fb2, b$_c$_b, b2);
        }
        int n2 = fb2.\u00d600000() | l.return.super(!((Collection)fb2.o00000()).isEmpty());
        if (n2 != b$_c.floatclasssuper().\u00d6\u00f4o000()) {
            b$_c$_b.\u00d6\u00d20000(n2);
        }
        b$_c$_b.classnew(b2.\u00d200000(fb2.Object()));
        return b$_c$_b;
    }

    private static final Integer o00000(b b2, ib ib2) {
        b$_m$_b b$_m$_b;
        b$_m$_d b$_m$_d;
        Object object = ib2.\u00d400000();
        bb bb2 = ib2.\u00d200000();
        Integer n2 = ib2.\u00d500000();
        String string = ib2.Object();
        Object object2 = b$_m.\u00f4\u00f50000();
        b$_m$_c b$_m$_c = object2;
        switch (c$_c.\u00d400000[((Enum)object).ordinal()]) {
            case 1: {
                b$_m$_d = b$_m$_d.\u00d3o0000;
                break;
            }
            case 2: {
                b$_m$_d = b$_m$_d.nullsuper;
                break;
            }
            case 3: {
                b$_m$_d = b$_m$_d.oo0000;
                break;
            }
            case 4: {
                return null;
            }
            default: {
                throw new qd();
            }
        }
        b$_m$_d b$_m$_d2 = b$_m$_d;
        if (b$_m$_d != b$_m$_c.\u00d2\u00f40000().\u00d8\u00f40000()) {
            b$_m$_c.super(b$_m$_d2);
        }
        switch (c$_c.\u00d300000[bb2.ordinal()]) {
            case 1: {
                b$_m$_b = b$_m$_b.\u00d5O0000;
                break;
            }
            case 2: {
                b$_m$_b = b$_m$_b.\u00d8O0000;
                break;
            }
            case 3: {
                b$_m$_b = b$_m$_b.\u00f5O0000;
                break;
            }
            default: {
                throw new qd();
            }
        }
        object = b$_m$_b;
        if (b$_m$_b != b$_m$_c.\u00d2\u00f40000().\u00d6\u00f50000()) {
            b$_m$_c.super((b$_m$_b)object);
        }
        if (n2 != null) {
            b$_m$_c.\u00d800000(n2);
        }
        if (string != null) {
            b$_m$_c.class(b2.\u00d200000(string));
        }
        object = object2;
        object2 = ib2.o00000();
        int n3 = ((d)object2).Object();
        int n4 = ((d)object2).\u00d200000();
        int n5 = ((d)object2).o00000();
        Object object3 = object;
        c$_b$0 c$_b$0 = new c$_b$0((b$_m$_c)object3);
        object3 = object;
        new b.t.c.b.b.l.d.b$_b(n3, n4, n5).o00000(c$_b$0, new c$_b$1((b$_m$_c)object3));
        return b2.\u00d200000().o00000((d$_f)object);
    }

    private static final i \u00d200000(b$_m$_c b$_m$_c, int n2) {
        b$_m$_c.\u00f400000(n2);
        return i.o00000;
    }

    private static final i \u00d400000(b$_m$_c b$_m$_c, int n2) {
        b$_m$_c.\u00d600000(n2);
        return i.o00000;
    }

    static /* synthetic */ i Object(b$_m$_c b$_m$_c, int n2) {
        return c.\u00d200000(b$_m$_c, n2);
    }

    static /* synthetic */ i o00000(b$_m$_c b$_m$_c, int n2) {
        return c.\u00d400000(b$_m$_c, n2);
    }
}

