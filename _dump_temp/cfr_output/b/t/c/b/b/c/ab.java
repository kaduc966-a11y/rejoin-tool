/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.w;

public final class ab
extends IllegalArgumentException {
    public ab(String string, Throwable throwable) {
        super(string, throwable);
    }

    public /* synthetic */ ab(String string, Throwable throwable, int n2, w w2) {
        if ((n2 & 2) != 0) {
            throwable = null;
        }
        this(string, throwable);
    }
}

