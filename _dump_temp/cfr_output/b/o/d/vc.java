/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.ac;
import b.o.d.f;
import b.o.d.g;
import b.o.d.h;
import b.o.d.i;
import b.o.d.lb;
import b.o.d.nb;
import b.o.d.oc;
import b.o.d.p;
import b.o.d.r;
import b.o.d.s;
import b.o.d.xb;
import b.o.d.yb;
import b.t.b;
import b.t.bb;
import b.t.e;
import b.t.k;
import b.t.l;
import b.t.t;
import b.t.u;
import b.t.v;
import b.t.z;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class vc {
    private static final String o00000 = "kotlin.jvm.functions.";

    public z \u00d200000(Class clazz) {
        return new lb(clazz);
    }

    public z \u00d200000(Class clazz, String string) {
        return new lb(clazz);
    }

    public b super(Class clazz, String string) {
        return new nb(clazz, string);
    }

    public z super(Class clazz) {
        return new lb(clazz);
    }

    public z \u00d300000(Class clazz, String string) {
        return new lb(clazz);
    }

    public String super(ac ac2) {
        return this.super((g)ac2);
    }

    public String super(g object) {
        if (((String)(object = object.getClass().getGenericInterfaces()[0].toString())).startsWith(o00000)) {
            return ((String)object).substring(21);
        }
        return object;
    }

    public k super(yb yb2) {
        return yb2;
    }

    public b.t.i super(s s2) {
        return s2;
    }

    public t super(i i2) {
        return i2;
    }

    public b.t.f super(r r2) {
        return r2;
    }

    public b.t.s super(h h2) {
        return h2;
    }

    public e super(p p2) {
        return p2;
    }

    public b.t.r super(f f2) {
        return f2;
    }

    public u super(v v2, List list, boolean bl) {
        return new xb(v2, list, bl);
    }

    public bb super(Object object, String string, l l2, boolean bl) {
        return new oc(object, string, l2, bl);
    }

    public void super(bb bb2, List list) {
        ((oc)bb2).\u00f400000(list);
    }

    public u super(u u2, u u3) {
        return new xb(u2.privatevoid(), u2.\u00f5\u00f60000(), u3, ((xb)u2).\u00f8\u00f60000());
    }

    public u super(u u2) {
        xb xb2 = (xb)u2;
        return new xb(u2.privatevoid(), u2.\u00f5\u00f60000(), xb2.o\u00f80000(), xb2.\u00f8\u00f60000() | 2);
    }

    public u \u00d200000(u u2) {
        xb xb2 = (xb)u2;
        return new xb(u2.privatevoid(), u2.\u00f5\u00f60000(), xb2.o\u00f80000(), xb2.\u00f8\u00f60000() | 4);
    }
}

