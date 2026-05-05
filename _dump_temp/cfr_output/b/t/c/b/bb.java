/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.q.pb;
import b.t.c.b.bb$_b$0;
import b.t.c.b.bb$_b$1;
import b.t.c.b.bb$_c;
import b.t.c.b.h;
import b.t.c.b.lc;
import b.t.c.b.oc;
import b.t.c.b.w;
import b.t.f;
import java.lang.reflect.Member;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bb
extends w
implements f {
    private final dc \u00d4\u00d2\u00d3000;
    private final dc \u00d3\u00d2\u00d3000;

    public bb(h object, String string, String string2, Object object2) {
        super((h)object, string, string2, object2);
        object = this;
        this.\u00d4\u00d2\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new bb$_b$0((bb)object));
        object = this;
        this.\u00d3\u00d2\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new bb$_b$1((bb)object));
    }

    public bb(h object, pb pb2, oc oc2) {
        super((h)object, pb2, oc2);
        object = this;
        this.\u00d4\u00d2\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new bb$_b$0((bb)object));
        object = this;
        this.\u00d3\u00d2\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new bb$_b$1((bb)object));
    }

    public bb$_c \u00d3Oo000() {
        return (bb$_c)this.\u00d4\u00d2\u00d3000.\u00d200000();
    }

    @Override
    public Object \u00d3O0000(Object object) {
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        return this.\u00d3Oo000().o00000(objectArray2);
    }

    @Override
    public Object while(Object object) {
        return lc.o00000(this, (Member)this.\u00d3\u00d2\u00d3000.\u00d200000(), object, null);
    }

    @Override
    public Object \u00f800000(Object object) {
        return this.\u00d3O0000(object);
    }

    public bb \u00d800000(oc oc2) {
        return new bb(this.o\u00d8O000(), this.\u00f4\u00f8O000(), oc2);
    }

    private static final bb$_c \u00d300000(bb bb2) {
        return new bb$_c(bb2);
    }

    private static final Member new(bb bb2) {
        return bb2.\u00d8\u00f8O000();
    }

    static /* synthetic */ bb$_c \u00d400000(bb bb2) {
        return bb.\u00d300000(bb2);
    }

    static /* synthetic */ Member o00000(bb bb2) {
        return bb.new(bb2);
    }
}

