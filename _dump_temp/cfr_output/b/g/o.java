/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.n;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class o
implements n {
    private final AtomicReference Stringsuper;

    public o(n n2) {
        this.Stringsuper = new AtomicReference<n>(n2);
    }

    @Override
    public final Iterator o00000() {
        n n2 = this.Stringsuper.getAndSet(null);
        if (n2 == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return n2.o00000();
    }
}

