/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.b.f;
import b.g.b;
import b.g.c;
import b.g.g;
import b.g.h;
import b.g.j;
import b.g.n;
import b.g.o;
import b.g.t$_b$1;
import b.g.t$_c$_b$_b$1;
import b.g.t$_d$1;
import b.g.t$_e$1;
import b.g.t$_f$1;
import b.g.t$_g$_b$_b$1;
import b.g.v;
import b.qb;
import b.s.z;
import b.yc;
import java.util.ArrayList;
import java.util.Iterator;

public class t
extends g {
    private static final n \u00d200000(b.o.e.h h2) {
        return new t$_b$1(h2);
    }

    public static final n o00000(Iterator iterator) {
        return c.String(new t$_c$_b$_b$1(iterator));
    }

    public static final n o00000(Object ... objectArray) {
        return z.\u00f5\u00d20000(objectArray);
    }

    public static final n \u00d200000(Object object) {
        return new t$_g$_b$_b$1(object);
    }

    private static final n o00000() {
        return c.\u00d200000();
    }

    public static final n \u00d200000() {
        return b.\u00f400000;
    }

    private static final n \u00d800000(n n2) {
        n n3 = n2;
        if (n3 == null) {
            n3 = c.\u00d200000();
        }
        return n3;
    }

    public static final n o00000(n n2, b.o.e.h h2) {
        return c.o00000(new t$_d$1(n2, h2, null));
    }

    public static final n \u00d500000(n n2) {
        return t.o00000(n2, t::\u00d300000);
    }

    public static final n \u00d600000(n n2) {
        return t.o00000(n2, t::o00000);
    }

    private static final n o00000(n n2, b.o.e.g g2) {
        if (n2 instanceof j) {
            return ((j)n2).o00000(g2);
        }
        return new h(n2, t::\u00d300000, g2);
    }

    public static final qb \u00d200000(n object) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        object = object.o00000();
        while (object.hasNext()) {
            qb qb2 = (qb)object.next();
            arrayList.add(qb2.new());
            arrayList2.add(qb2.o00000());
        }
        return yc.o00000(arrayList, arrayList2);
    }

    public static final n o00000(n n2) {
        return c.o00000(n2, f.super);
    }

    public static final n o00000(n n2, f f2) {
        return c.o00000(new t$_e$1(n2, f2, null));
    }

    public static final n o00000(n n2, b.o.e.f f2, b.o.e.g g2) {
        return c.o00000(new t$_f$1(n2, f2, g2, null));
    }

    public static final n String(n n2) {
        if (n2 instanceof o) {
            return n2;
        }
        return new o(n2);
    }

    public static final n o00000(b.o.e.h h2) {
        b.o.e.h h3 = h2;
        return c.String(new v(h3, arg_0 -> t.o00000(h3, arg_0)));
    }

    public static final n o00000(Object object, b.o.e.g g2) {
        if (object == null) {
            return b.\u00f400000;
        }
        return new v(() -> t.o00000(object), g2);
    }

    public static final n o00000(b.o.e.h h2, b.o.e.g g2) {
        return new v(h2, g2);
    }

    private static final Iterator \u00d300000(n n2) {
        return n2.o00000();
    }

    private static final Iterator o00000(Iterable iterable) {
        return iterable.iterator();
    }

    private static final Object \u00d300000(Object object) {
        return object;
    }

    private static final Object o00000(b.o.e.h h2, Object object) {
        return h2.newreturn();
    }

    private static final Object o00000(Object object) {
        return object;
    }
}

