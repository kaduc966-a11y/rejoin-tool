/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.v;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class v$_b$1
implements Iterator,
g {
    private Object forclass;
    private int \u00d8\u00d80000 = -2;
    final /* synthetic */ v \u00d5\u00d80000;

    v$_b$1(v v2) {
        this.\u00d5\u00d80000 = v2;
    }

    public final Object \u00f4\u00d50000() {
        return this.forclass;
    }

    public final void \u00d300000(Object object) {
        this.forclass = object;
    }

    public final int \u00d8\u00d50000() {
        return this.\u00d8\u00d80000;
    }

    public final void \u00d8o0000(int n2) {
        this.\u00d8\u00d80000 = n2;
    }

    private final void \u00f5\u00d50000() {
        this.forclass = this.\u00d8\u00d80000 == -2 ? v.\u00d200000(this.\u00d5\u00d80000).newreturn() : v.o00000(this.\u00d5\u00d80000).\u00f800000(this.forclass);
        this.\u00d8\u00d80000 = this.forclass == null ? 0 : 1;
    }

    public final Object next() {
        if (this.\u00d8\u00d80000 < 0) {
            this.\u00f5\u00d50000();
        }
        if (this.\u00d8\u00d80000 == 0) {
            throw new NoSuchElementException();
        }
        Object object = this.forclass;
        this.\u00d8\u00d80000 = -1;
        return object;
    }

    @Override
    public final boolean hasNext() {
        if (this.\u00d8\u00d80000 < 0) {
            this.\u00f5\u00d50000();
        }
        return this.\u00d8\u00d80000 == 1;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

