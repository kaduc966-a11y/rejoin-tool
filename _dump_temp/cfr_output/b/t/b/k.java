/*
 * Decompiled with CFR 0.152.
 */
package b.t.b;

import b.o.d.w;

public final class k
extends Exception {
    public k(Exception exception) {
        super(exception);
    }

    public /* synthetic */ k(Exception exception, int n2, w w2) {
        if ((n2 & 1) != 0) {
            exception = null;
        }
        this(exception);
    }

    public k() {
        this(null, 1, null);
    }
}

