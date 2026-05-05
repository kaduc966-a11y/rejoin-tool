/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.c.e;
import b.t.c.b.eb;
import b.t.c.b.h;
import b.t.c.b.rb$_b$0;
import b.t.c.b.rb$_c;
import b.t.s;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class rb
extends eb
implements s {
    private final dc whilethisnew;

    public rb(h object, String string, Object object2, e e2) {
        super((h)object, string, object2, e2);
        object = this;
        this.whilethisnew = r.o00000(lb.\u00d400000, (b.o.e.h)new rb$_b$0((rb)object));
    }

    public final rb$_c newthissuper() {
        return (rb$_c)this.whilethisnew.\u00d200000();
    }

    @Override
    public final void return(Object object, Object object2) {
        Object[] objectArray = new Object[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        this.newthissuper().o00000(objectArray2);
    }

    private static final rb$_c new(rb rb2) {
        return new rb$_c(rb2);
    }

    static /* synthetic */ rb$_c o00000(rb rb2) {
        return rb.new(rb2);
    }
}

