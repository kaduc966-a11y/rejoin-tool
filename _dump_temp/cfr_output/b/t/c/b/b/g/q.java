/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.t.c.b.b.g.n;
import b.t.c.b.b.g.q$_b$1;
import java.util.Iterator;

public final class q
extends n {
    private final Object \u00d4o\u00f6000;
    private final int \u00d3o\u00f6000;

    public q(Object object, int n2) {
        super(null);
        this.\u00d4o\u00f6000 = object;
        this.\u00d3o\u00f6000 = n2;
    }

    public final Object \u00d3\u00f4\u00d3000() {
        return this.\u00d4o\u00f6000;
    }

    public final int \u00d4\u00f4\u00d3000() {
        return this.\u00d3o\u00f6000;
    }

    @Override
    public final int whileStringnew() {
        return 1;
    }

    @Override
    public final void \u00d300000(int n2, Object object) {
        throw new IllegalStateException();
    }

    @Override
    public final Object \u00f5\u00f40000(int n2) {
        if (n2 == this.\u00d3o\u00f6000) {
            return this.\u00d4o\u00f6000;
        }
        return null;
    }

    @Override
    public final Iterator iterator() {
        return new q$_b$1(this);
    }
}

