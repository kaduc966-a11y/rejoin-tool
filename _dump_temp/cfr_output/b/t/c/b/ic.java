/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.q.pb;
import b.t.c.b.h;
import b.t.c.b.ic$_b$0;
import b.t.c.b.ic$_c;
import b.t.c.b.oc;
import b.t.c.b.x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ic
extends x
implements b.t.r {
    private final dc \u00f8o\u00d3000;

    public ic(h object, String string, String string2) {
        super((h)object, string, string2);
        object = this;
        this.\u00f8o\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new ic$_b$0((ic)object));
    }

    public ic(h object, pb pb2, oc oc2) {
        super((h)object, pb2, oc2);
        object = this;
        this.\u00f8o\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new ic$_b$0((ic)object));
    }

    public final ic$_c \u00f80o000() {
        return (ic$_c)this.\u00f8o\u00d3000.\u00d200000();
    }

    @Override
    public final void \u00d300000(Object object, Object object2, Object object3) {
        Object[] objectArray = new Object[3];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        this.\u00f80o000().o00000(objectArray2);
    }

    public final ic return(oc oc2) {
        return new ic(this.o\u00d8O000(), this.\u00f4\u00f8O000(), oc2);
    }

    private static final ic$_c o00000(ic ic2) {
        return new ic$_c(ic2);
    }

    static /* synthetic */ ic$_c new(ic ic2) {
        return ic.o00000(ic2);
    }
}

