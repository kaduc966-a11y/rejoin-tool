/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.c.k;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.k.b;
import b.t.c.b.b.k.o;
import java.util.List;

public abstract class f
extends l
implements k {
    private final ib \u00f5\u00f4\u00d8000;
    private final ib \u00f4\u00f4\u00d8000;

    public f(ib ib2, ib ib3) {
        super(null);
        this.\u00f5\u00f4\u00d8000 = ib2;
        this.\u00f4\u00f4\u00d8000 = ib3;
    }

    public final ib \u00f4\u00f4\u00d2000() {
        return this.\u00f5\u00f4\u00d8000;
    }

    public final ib \u00d8\u00f4\u00d2000() {
        return this.\u00f4\u00f4\u00d8000;
    }

    public abstract ib \u00f5\u00f4\u00d2000();

    public abstract String o00000(b var1, o var2);

    @Override
    public zb \u00d5\u00d6\u00d2000() {
        return this.\u00f5\u00f4\u00d2000().\u00d5\u00d6\u00d2000();
    }

    @Override
    public bc thisdosuper() {
        return this.\u00f5\u00f4\u00d2000().thisdosuper();
    }

    @Override
    public List \u00d4\u00d6\u00d2000() {
        return this.\u00f5\u00f4\u00d2000().\u00d4\u00d6\u00d2000();
    }

    @Override
    public boolean \u00f5\u00d6\u00d2000() {
        return this.\u00f5\u00f4\u00d2000().\u00f5\u00d6\u00d2000();
    }

    @Override
    public b.t.c.b.b.o.e.f \u00f4\u00d6\u00d2000() {
        return this.\u00f5\u00f4\u00d2000().\u00f4\u00d6\u00d2000();
    }

    public String toString() {
        return b.class.super(this);
    }
}

