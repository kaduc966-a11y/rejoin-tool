/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.e;
import b.t.c.b.b.p.e$1;
import b.t.c.b.b.p.y;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

class e$_b
implements Iterator {
    private final Stack o00000 = new Stack();
    private y \u00d200000;

    private e$_b(b b2) {
        this.\u00d200000 = this.o00000(b2);
    }

    private y o00000(b b2) {
        while (b2 instanceof e) {
            b2 = (e)b2;
            this.o00000.push(b2);
            b2 = e.o00000((e)b2);
        }
        return (y)b2;
    }

    private y \u00d200000() {
        e$_b e$_b;
        y y2;
        do {
            if (this.o00000.isEmpty()) {
                return null;
            }
            e$_b = this;
        } while ((y2 = e$_b.o00000(e.\u00d200000((e)e$_b.o00000.pop()))).void());
        return y2;
    }

    @Override
    public boolean hasNext() {
        return this.\u00d200000 != null;
    }

    public y o00000() {
        if (this.\u00d200000 == null) {
            throw new NoSuchElementException();
        }
        y y2 = this.\u00d200000;
        this.\u00d200000 = this.\u00d200000();
        return y2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ e$_b(b b2, e$1 e$1) {
        this(b2);
    }
}

