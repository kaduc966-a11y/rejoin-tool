/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.q.pb;
import b.t.c.b.cb;
import b.t.c.b.h;
import b.t.c.b.nc$_b$0;
import b.t.c.b.nc$_c;
import b.t.c.b.oc;
import b.t.t;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nc
extends cb
implements t {
    private final dc \u00d3\u00d5\u00d3000;

    public nc(h object, pb pb2, oc oc2) {
        super((h)object, pb2, oc2);
        object = this;
        this.\u00d3\u00d5\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new nc$_b$0((nc)object));
    }

    public nc(h object, String string, String string2, Object object2) {
        super((h)object, string, string2, object2);
        object = this;
        this.\u00d3\u00d5\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new nc$_b$0((nc)object));
    }

    public final nc$_c \u00d8Oo000() {
        return (nc$_c)this.\u00d3\u00d5\u00d3000.\u00d200000();
    }

    @Override
    public final void \u00d4O0000(Object object) {
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        this.\u00d8Oo000().o00000(objectArray2);
    }

    public final nc \u00f500000(oc oc2) {
        return new nc(this.o\u00d8O000(), this.\u00f4\u00f8O000(), oc2);
    }

    private static final nc$_c new(nc nc2) {
        return new nc$_c(nc2);
    }

    static /* synthetic */ nc$_c o00000(nc nc2) {
        return nc.new(nc2);
    }
}

