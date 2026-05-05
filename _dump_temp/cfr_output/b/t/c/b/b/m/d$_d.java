/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.t.c.b.b.m.d$1;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
abstract class d$_d
implements Iterator {
    private boolean super;

    private d$_d() {
    }

    @Override
    public final boolean hasNext() {
        return !this.super;
    }

    public final Object next() {
        if (this.super) {
            throw new NoSuchElementException();
        }
        this.super = true;
        this.\u00d200000();
        return this.super();
    }

    protected abstract void \u00d200000();

    protected abstract Object super();

    /* synthetic */ d$_d(d$1 d$1) {
        this();
    }
}

