/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_c;
import b.t.c.b.b.p.e;
import b.t.c.b.b.p.e$1;
import b.t.c.b.b.p.e$_b;

class e$_d
implements b$_c {
    private final e$_b Object;
    private b$_c \u00d200000;
    int \u00d400000;
    final /* synthetic */ e o00000;

    private e$_d(e e2) {
        this.o00000 = e2;
        this.Object = new e$_b(e2, null);
        this.\u00d200000 = ((b)this.Object.o00000()).\u00d400000();
        this.\u00d400000 = ((b)e2).\u00f400000();
    }

    @Override
    public boolean hasNext() {
        return this.\u00d400000 > 0;
    }

    public Byte \u00d200000() {
        return this.o00000();
    }

    @Override
    public byte o00000() {
        if (!this.\u00d200000.hasNext()) {
            this.\u00d200000 = ((b)this.Object.o00000()).\u00d400000();
        }
        --this.\u00d400000;
        return this.\u00d200000.o00000();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ e$_d(e e2, e$1 e$1) {
        this(e2);
    }
}

