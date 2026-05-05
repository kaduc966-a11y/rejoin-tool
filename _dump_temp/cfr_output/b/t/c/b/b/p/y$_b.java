/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_c;
import b.t.c.b.b.p.y;
import b.t.c.b.b.p.y$1;
import java.util.NoSuchElementException;

class y$_b
implements b$_c {
    private int \u00f500000 = 0;
    private final int \u00f600000;
    final /* synthetic */ y \u00f400000;

    private y$_b(y y2) {
        this.\u00f400000 = y2;
        this.\u00f600000 = ((b)y2).\u00f400000();
    }

    @Override
    public boolean hasNext() {
        return this.\u00f500000 < this.\u00f600000;
    }

    public Byte \u00d400000() {
        return this.o00000();
    }

    @Override
    public byte o00000() {
        try {
            return this.\u00f400000.if[this.\u00f500000++];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ y$_b(y y2, y$1 y$1) {
        this(y2);
    }
}

