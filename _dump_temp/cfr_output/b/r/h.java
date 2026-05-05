/*
 * Decompiled with CFR 0.152.
 */
package b.r;

import b.r.b;
import b.r.c.c;
import b.r.h$_b;
import b.r.l;
import b.xd$_b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
implements b,
b.r.d.b.b {
    private static final h$_b o\u00f50000 = new h$_b(null);
    private final b \u00f8\u00f40000;
    private volatile Object ifreturn;
    private static final AtomicReferenceFieldUpdater O\u00f50000 = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");

    public h(b b2, Object object) {
        this.\u00f8\u00f40000 = b2;
        this.ifreturn = object;
    }

    public h(b b2) {
        this(b2, (Object)c.\u00d400000);
    }

    @Override
    public final l O\u00d80000() {
        return this.\u00f8\u00f40000.O\u00d80000();
    }

    @Override
    public final void return(Object object) {
        block2: {
            while (true) {
                Object object2;
                if ((object2 = this.ifreturn) == c.\u00d400000) {
                    if (!O\u00f50000.compareAndSet(this, c.\u00d400000, object)) continue;
                    return;
                }
                if (object2 != b.r.c.b.\u00d200000()) break block2;
                if (O\u00f50000.compareAndSet(this, b.r.c.b.\u00d200000(), c.o00000)) break;
            }
            this.\u00f8\u00f40000.return(object);
            return;
        }
        throw new IllegalStateException("Already resumed");
    }

    public final Object \u00d5\u00d80000() {
        Object object = this.ifreturn;
        if (object == c.\u00d400000) {
            if (O\u00f50000.compareAndSet(this, c.\u00d400000, b.r.c.b.\u00d200000())) {
                return b.r.c.b.\u00d200000();
            }
            object = this.ifreturn;
        }
        if (object == c.o00000) {
            return b.r.c.b.\u00d200000();
        }
        if (object instanceof xd$_b) {
            throw ((xd$_b)object).o00000;
        }
        return object;
    }

    @Override
    public final b.r.d.b.b \u00d4\u00d80000() {
        b b2 = this.\u00f8\u00f40000;
        if (b2 instanceof b.r.d.b.b) {
            return (b.r.d.b.b)((Object)b2);
        }
        return null;
    }

    @Override
    public final StackTraceElement \u00d3\u00d80000() {
        return null;
    }

    public final String toString() {
        return "SafeContinuation for " + this.\u00f8\u00f40000;
    }
}

