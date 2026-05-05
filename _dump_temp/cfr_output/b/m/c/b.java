/*
 * Decompiled with CFR 0.152.
 */
package b.m.c;

import b.m.c.b$_b;
import b.m.d;
import b.s.z;
import java.util.List;

public class b
extends d {
    private final boolean o00000(int n2) {
        return b$_b.o00000 == null || b$_b.o00000 >= n2;
    }

    @Override
    public void o00000(Throwable throwable, Throwable throwable2) {
        if (this.o00000(19)) {
            throwable.addSuppressed(throwable2);
            return;
        }
        super.o00000(throwable, throwable2);
    }

    @Override
    public List o00000(Throwable throwable) {
        if (this.o00000(19)) {
            return z.\u00d500000(throwable.getSuppressed());
        }
        return super.o00000(throwable);
    }
}

