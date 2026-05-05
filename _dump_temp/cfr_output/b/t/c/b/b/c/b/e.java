/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.b;

import b.ac;
import b.dd;
import b.f;
import b.lc;
import b.qb;
import b.qd;
import b.s.y;
import b.t.c.b.b.c.b.e$_b;
import b.t.c.b.b.c.x;
import b.t.c.b.b.c.x$_b;
import b.t.c.b.b.c.x$_c;
import b.t.c.b.b.c.x$_d;
import b.t.c.b.b.c.x$_e;
import b.t.c.b.b.c.x$_f;
import b.t.c.b.b.c.x$_g;
import b.t.c.b.b.c.x$_h;
import b.t.c.b.b.c.x$_i;
import b.t.c.b.b.c.x$_j;
import b.t.c.b.b.c.x$_k;
import b.t.c.b.b.c.x$_l;
import b.t.c.b.b.c.x$_m;
import b.t.c.b.b.c.x$_n;
import b.t.c.b.b.c.x$_o;
import b.t.c.b.b.c.x$_q;
import b.t.c.b.b.c.x$_r;
import b.t.c.b.b.c.x$_s;
import b.t.c.b.b.c.x$_t;
import b.t.c.b.b.c.z;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_db$_c;
import b.t.c.b.b.l.b$_db$_c$_c;
import b.t.c.b.b.l.b$_db$_c$_c$_b;
import b.t.c.b.b.l.d.l;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class e {
    public static final z o00000(b$_db object, b.t.c.b.b.l.d.e object2) {
        String string = e.o00000((b.t.c.b.b.l.d.e)object2, ((b$_db)object).\u00d8\u00f4O000());
        object = ((b$_db)object).dowhile();
        String string2 = string;
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            x x2;
            b$_db$_c b$_db$_c = (b$_db$_c)object.next();
            qb qb2 = e.o00000(b$_db$_c.\u00f4\u00d6O000(), (b.t.c.b.b.l.d.e)object2) != null ? yc.o00000(object2.new(b$_db$_c.\u00d8\u00d6O000()), x2) : null;
            if (qb2 == null) continue;
            b$_db$_c = qb2;
            collection.add(b$_db$_c);
        }
        object = y.o00000((List)collection);
        object2 = string2;
        return new z((String)object2, (Map)object);
    }

    public static final x o00000(b$_db$_c$_c object, b.t.c.b.b.l.d.e object2) {
        if (l.OO0000.\u00d200000(((b$_db$_c$_c)object).\u00f6\u00d3O000()).booleanValue()) {
            b$_db$_c$_c$_b b$_db$_c$_c$_b = ((b$_db$_c$_c)object).\u00f6\u00d4O000();
            switch (b$_db$_c$_c$_b == null ? -1 : e$_b.o00000[b$_db$_c$_c$_b.ordinal()]) {
                case 1: {
                    return new x$_n(lc.super((byte)((b$_db$_c$_c)object).\u00d4\u00d5O000()), null);
                }
                case 2: {
                    return new x$_b(dd.\u00d2O0000((short)((b$_db$_c$_c)object).\u00d4\u00d5O000()), null);
                }
                case 3: {
                    return new x$_s(ac.\u00d500000((int)((b$_db$_c$_c)object).\u00d4\u00d5O000()), null);
                }
                case 4: {
                    return new x$_m(f.super(((b$_db$_c$_c)object).\u00d4\u00d5O000()), null);
                }
            }
            throw new IllegalStateException(("Cannot read value of unsigned type: " + ((b$_db$_c$_c)object).\u00f6\u00d4O000()).toString());
        }
        b$_db$_c$_c$_b b$_db$_c$_c$_b = ((b$_db$_c$_c)object).\u00f6\u00d4O000();
        switch (b$_db$_c$_c$_b == null ? -1 : e$_b.o00000[b$_db$_c$_c$_b.ordinal()]) {
            case 1: {
                return new x$_i((byte)((b$_db$_c$_c)object).\u00d4\u00d5O000());
            }
            case 5: {
                return new x$_e((char)((b$_db$_c$_c)object).\u00d4\u00d5O000());
            }
            case 2: {
                return new x$_o((short)((b$_db$_c$_c)object).\u00d4\u00d5O000());
            }
            case 3: {
                return new x$_j((int)((b$_db$_c$_c)object).\u00d4\u00d5O000());
            }
            case 4: {
                return new x$_h(((b$_db$_c$_c)object).\u00d4\u00d5O000());
            }
            case 6: {
                return new x$_r(((b$_db$_c$_c)object).\u00d3\u00d3O000());
            }
            case 7: {
                return new x$_f(((b$_db$_c$_c)object).\u00d6\u00d3O000());
            }
            case 8: {
                return new x$_c(((b$_db$_c$_c)object).\u00d4\u00d5O000() != 0L);
            }
            case 9: {
                return new x$_q(object2.new(((b$_db$_c$_c)object).publicfloat()));
            }
            case 10: {
                object2 = e.o00000((b.t.c.b.b.l.d.e)object2, ((b$_db$_c$_c)object).intfor());
                if (((b$_db$_c$_c)object).\u00d8\u00d4O000() == 0) {
                    return new x$_k((String)object2);
                }
                return new x$_l((String)object2, ((b$_db$_c$_c)object).\u00d8\u00d4O000());
            }
            case 11: {
                return new x$_d(e.o00000((b.t.c.b.b.l.d.e)object2, ((b$_db$_c$_c)object).intfor()), object2.new(((b$_db$_c$_c)object).\u00d4\u00d4O000()));
            }
            case 12: {
                return new x$_t(e.o00000(((b$_db$_c$_c)object).interfacefor(), (b.t.c.b.b.l.d.e)object2));
            }
            case 13: {
                object = ((b$_db$_c$_c)object).\u00d8\u00d3O000();
                Collection collection = new ArrayList();
                object = object.iterator();
                while (object.hasNext()) {
                    x x2;
                    if (e.o00000((b$_db$_c$_c)object.next(), (b.t.c.b.b.l.d.e)object2) == null) continue;
                    collection.add(x2);
                }
                object = (List)collection;
                return new x$_g((List)object);
            }
            case -1: {
                return null;
            }
        }
        throw new qd();
    }

    public static final String o00000(b.t.c.b.b.l.d.e e2, int n2) {
        String string = e2.\u00d300000(n2);
        if (e2.o00000(n2)) {
            return ".".concat(String.valueOf(string));
        }
        return string;
    }
}

