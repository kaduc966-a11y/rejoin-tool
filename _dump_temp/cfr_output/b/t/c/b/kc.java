/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.q.pb;
import b.t.c.b.bb;
import b.t.c.b.h;
import b.t.c.b.kc$_b$0;
import b.t.c.b.kc$_c;
import b.t.c.b.oc;
import b.t.s;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class kc
extends bb
implements s {
    private final dc \u00d5\u00d2\u00d3000;

    public kc(h object, String string, String string2, Object object2) {
        super((h)object, string, string2, object2);
        object = this;
        this.\u00d5\u00d2\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new kc$_b$0((kc)object));
    }

    public kc(h object, pb pb2, oc oc2) {
        super((h)object, pb2, oc2);
        object = this;
        this.\u00d5\u00d2\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new kc$_b$0((kc)object));
    }

    public final kc$_c \u00d4Oo000() {
        return (kc$_c)this.\u00d5\u00d2\u00d3000.\u00d200000();
    }

    @Override
    public final void return(Object object, Object object2) {
        Object[] objectArray = new Object[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        this.\u00d4Oo000().o00000(objectArray2);
    }

    public final kc \u00f400000(oc oc2) {
        return new kc(this.o\u00d8O000(), this.\u00f4\u00f8O000(), oc2);
    }

    private static final kc$_c new(kc kc2) {
        return new kc$_c(kc2);
    }

    static /* synthetic */ kc$_c o00000(kc kc2) {
        return kc.new(kc2);
    }
}

