/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.b;
import b.dc;
import b.o.d.w;
import b.o.e.h;
import b.ob;
import java.io.Serializable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class ed
implements Serializable,
dc {
    private h \u00f600000;
    private volatile Object \u00f400000;
    private final Object int;

    public ed(h h2, Object object) {
        this.\u00f600000 = h2;
        this.\u00f400000 = ob.o00000;
        Object object2 = object;
        if (object2 == null) {
            object2 = this;
        }
        this.int = object2;
    }

    public /* synthetic */ ed(h h2, Object object, int n2, w w2) {
        if ((n2 & 2) != 0) {
            object = null;
        }
        this(h2, object);
    }

    @Override
    public final Object \u00d200000() {
        Object object = this.\u00f400000;
        if (object != ob.o00000) {
            return object;
        }
        object = this.int;
        synchronized (object) {
            Object object2;
            Object object3 = this.\u00f400000;
            if (object3 != ob.o00000) {
                object2 = object3;
            } else {
                this.\u00f400000 = object3 = this.\u00f600000.newreturn();
                this.\u00f600000 = null;
                object2 = object3;
            }
            object3 = object2;
            return object3;
        }
    }

    @Override
    public final boolean o00000() {
        return this.\u00f400000 != ob.o00000;
    }

    public final String toString() {
        if (this.o00000()) {
            return String.valueOf(this.\u00d200000());
        }
        return "Lazy value not initialized yet.";
    }

    private final Object \u00d600000() {
        return new b(this.\u00d200000());
    }
}

