/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.o.d.c.b;
import b.o.d.pc;
import java.util.Iterator;

final class c$_b
implements Iterator,
b {
    private final Iterator privatepublicString;

    public c$_b(Object[] objectArray) {
        this.privatepublicString = pc.o00000(objectArray);
    }

    @Override
    public final boolean hasNext() {
        return this.privatepublicString.hasNext();
    }

    public final Object next() {
        return this.privatepublicString.next();
    }

    public final Void newprivatesuper() {
        throw new UnsupportedOperationException();
    }
}

