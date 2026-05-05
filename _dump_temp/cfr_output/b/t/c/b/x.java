/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.q.pb;
import b.t.c.b.h;
import b.t.c.b.lc;
import b.t.c.b.oc;
import b.t.c.b.w;
import b.t.c.b.x$_b$0;
import b.t.c.b.x$_b$1;
import b.t.c.b.x$_c;
import b.t.e;
import java.lang.reflect.Member;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class x
extends w
implements e {
    private final dc ifthisnew;
    private final dc \u00f5o\u00d3000;

    public x(h object, String string, String string2) {
        super((h)object, string, string2, b.o.d.x.\u00d40\u00d2000);
        object = this;
        this.ifthisnew = r.o00000(lb.\u00d400000, (b.o.e.h)new x$_b$0((x)object));
        object = this;
        this.\u00f5o\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new x$_b$1((x)object));
    }

    public x(h object, pb pb2, oc oc2) {
        super((h)object, pb2, oc2);
        object = this;
        this.ifthisnew = r.o00000(lb.\u00d400000, (b.o.e.h)new x$_b$0((x)object));
        object = this;
        this.\u00f5o\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new x$_b$1((x)object));
    }

    public x$_c privateinterface() {
        return (x$_c)this.ifthisnew.\u00d200000();
    }

    @Override
    public Object \u00d500000(Object object, Object object2) {
        Object[] objectArray = new Object[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        return this.privateinterface().o00000(objectArray2);
    }

    @Override
    public Object \u00d400000(Object object, Object object2) {
        return lc.o00000(this, (Member)this.\u00f5o\u00d3000.\u00d200000(), object, object2);
    }

    @Override
    public Object o00000(Object object, Object object2) {
        return this.\u00d500000(object, object2);
    }

    public x \u00d500000(oc oc2) {
        return new x(this.o\u00d8O000(), this.\u00f4\u00f8O000(), oc2);
    }

    private static final x$_c \u00d400000(x x2) {
        return new x$_c(x2);
    }

    private static final Member new(x x2) {
        return x2.\u00d8\u00f8O000();
    }

    static /* synthetic */ x$_c o00000(x x2) {
        return x.\u00d400000(x2);
    }

    static /* synthetic */ Member \u00d300000(x x2) {
        return x.new(x2);
    }
}

