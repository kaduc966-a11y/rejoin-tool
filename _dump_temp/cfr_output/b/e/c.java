/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.s.nb;
import java.util.NoSuchElementException;

public final class c
extends nb {
    private final long \u00f5\u00f5\u00f5000;
    private final long \u00f4\u00f5\u00f5000;
    private boolean forObjectclass;
    private long \u00d8\u00f5\u00f5000;

    public c(long l2, long l3, long l4) {
        this.\u00f5\u00f5\u00f5000 = l4;
        this.\u00f4\u00f5\u00f5000 = l3;
        this.forObjectclass = this.\u00f5\u00f5\u00f5000 > 0L ? l2 <= l3 : l2 >= l3;
        this.\u00d8\u00f5\u00f5000 = this.forObjectclass ? l2 : this.\u00f4\u00f5\u00f5000;
    }

    public final long whilenewnew() {
        return this.\u00f5\u00f5\u00f5000;
    }

    @Override
    public final boolean hasNext() {
        return this.forObjectclass;
    }

    @Override
    public final long o\u00d5\u00d3000() {
        long l2 = this.\u00d8\u00f5\u00f5000;
        if (l2 == this.\u00f4\u00f5\u00f5000) {
            if (!this.forObjectclass) {
                throw new NoSuchElementException();
            }
            this.forObjectclass = false;
        } else {
            this.\u00d8\u00f5\u00f5000 += this.\u00f5\u00f5\u00f5000;
        }
        return l2;
    }
}

