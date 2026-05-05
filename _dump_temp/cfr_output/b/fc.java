/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.b;
import b.dc;
import b.fc$_b;
import b.o.e.h;
import b.ob;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class fc
implements Serializable,
dc {
    public static final fc$_b class = new fc$_b(null);
    private volatile h \u00d300000;
    private volatile Object super;
    private final Object \u00d400000;
    private static final AtomicReferenceFieldUpdater \u00d200000 = AtomicReferenceFieldUpdater.newUpdater(fc.class, Object.class, "_value");

    public fc(h h2) {
        this.\u00d300000 = h2;
        this.super = ob.o00000;
        this.\u00d400000 = ob.o00000;
    }

    private static /* synthetic */ void \u00d300000() {
    }

    @Override
    public final Object \u00d200000() {
        Object object = this.super;
        if (object != ob.o00000) {
            return object;
        }
        object = this.\u00d300000;
        if (object != null && \u00d200000.compareAndSet(this, ob.o00000, object = object.newreturn())) {
            this.\u00d300000 = null;
            return object;
        }
        return this.super;
    }

    @Override
    public final boolean o00000() {
        return this.super != ob.o00000;
    }

    public final String toString() {
        if (this.o00000()) {
            return String.valueOf(this.\u00d200000());
        }
        return "Lazy value not initialized yet.";
    }

    private final Object String() {
        return new b(this.\u00d200000());
    }

    private final void o00000(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}

