/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.b;
import b.dc;
import b.o.e.h;
import b.ob;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class ad
implements Serializable,
dc {
    private h \u00d800000;
    private Object \u00d600000;

    public ad(h h2) {
        this.\u00d800000 = h2;
        this.\u00d600000 = ob.o00000;
    }

    @Override
    public final Object \u00d200000() {
        if (this.\u00d600000 == ob.o00000) {
            this.\u00d600000 = this.\u00d800000.newreturn();
            this.\u00d800000 = null;
        }
        return this.\u00d600000;
    }

    @Override
    public final boolean o00000() {
        return this.\u00d600000 != ob.o00000;
    }

    public final String toString() {
        if (this.o00000()) {
            return String.valueOf(this.\u00d200000());
        }
        return "Lazy value not initialized yet.";
    }

    private final Object \u00d500000() {
        return new b(this.\u00d200000());
    }

    private final void \u00d200000(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}

