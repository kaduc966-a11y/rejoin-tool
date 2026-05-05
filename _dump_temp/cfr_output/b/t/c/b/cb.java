/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.q.pb;
import b.t.c.b.cb$_b$0;
import b.t.c.b.cb$_b$1;
import b.t.c.b.cb$_c;
import b.t.c.b.h;
import b.t.c.b.lc;
import b.t.c.b.oc;
import b.t.c.b.w;
import b.t.i;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class cb
extends w
implements i {
    private final dc \u00f4o\u00d3000;
    private final dc \u00d8o\u00d3000;

    public cb(h object, pb pb2, oc oc2) {
        super((h)object, pb2, oc2);
        object = this;
        this.\u00f4o\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new cb$_b$0((cb)object));
        object = this;
        this.\u00d8o\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new cb$_b$1((cb)object));
    }

    public cb(h object, String string, String string2, Object object2) {
        super((h)object, string, string2, object2);
        object = this;
        this.\u00f4o\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new cb$_b$0((cb)object));
        object = this;
        this.\u00d8o\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new cb$_b$1((cb)object));
    }

    public cb$_c \u00d80o000() {
        return (cb$_c)this.\u00f4o\u00d3000.\u00d200000();
    }

    @Override
    public Object forinterface() {
        return this.\u00d80o000().o00000(new Object[0]);
    }

    @Override
    public Object \u00d40o000() {
        return this.\u00d8o\u00d3000.\u00d200000();
    }

    @Override
    public Object newreturn() {
        return this.forinterface();
    }

    public cb \u00d400000(oc oc2) {
        return new cb(this.o\u00d8O000(), this.\u00f4\u00f8O000(), oc2);
    }

    private static final cb$_c o00000(cb cb2) {
        return new cb$_c(cb2);
    }

    private static final Object \u00d400000(cb cb2) {
        return lc.o00000(cb2, cb2.\u00d8\u00f8O000(), null, null);
    }

    static /* synthetic */ cb$_c new(cb cb2) {
        return cb.o00000(cb2);
    }

    static /* synthetic */ Object \u00d300000(cb cb2) {
        return cb.\u00d400000(cb2);
    }
}

