/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.c.e;
import b.t.c.b.eb$_b$0;
import b.t.c.b.eb$_b$1;
import b.t.c.b.eb$_c;
import b.t.c.b.g;
import b.t.c.b.h;
import b.t.c.b.lc;
import b.t.f;
import java.lang.reflect.Member;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class eb
extends g
implements f {
    private final dc o\u00d2\u00d3000;
    private final dc O\u00d2\u00d3000;

    public eb(h object, String string, Object object2, e e2) {
        super((h)object, string, object2, e2);
        object = this;
        this.o\u00d2\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new eb$_b$0((eb)object));
        object = this;
        this.O\u00d2\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new eb$_b$1((eb)object));
    }

    public eb$_c oOo000() {
        return (eb$_c)this.o\u00d2\u00d3000.\u00d200000();
    }

    @Override
    public Object \u00d3O0000(Object object) {
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        return this.oOo000().o00000(objectArray2);
    }

    @Override
    public Object while(Object object) {
        return lc.o00000(this, (Member)this.O\u00d2\u00d3000.\u00d200000(), object, null);
    }

    @Override
    public Object \u00f800000(Object object) {
        return this.\u00d3O0000(object);
    }

    private static final eb$_c new(eb eb2) {
        return new eb$_c(eb2);
    }

    private static final Member \u00d300000(eb eb2) {
        return eb2.whileprivate();
    }

    static /* synthetic */ eb$_c \u00d400000(eb eb2) {
        return eb.new(eb2);
    }

    static /* synthetic */ Member o00000(eb eb2) {
        return eb.\u00d300000(eb2);
    }
}

