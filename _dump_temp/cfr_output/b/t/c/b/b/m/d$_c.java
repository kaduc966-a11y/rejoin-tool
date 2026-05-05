/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class d$_c
implements Iterator {
    private static final d$_c super = new d$_c();

    private d$_c() {
    }

    public static d$_c super() {
        return super;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new IllegalStateException();
    }
}

