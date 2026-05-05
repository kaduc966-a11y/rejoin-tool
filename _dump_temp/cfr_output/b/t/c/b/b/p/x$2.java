/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.x;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class x$2
implements Iterator {
    Iterator new;
    final /* synthetic */ x o00000;

    x$2(x x2) {
        this.o00000 = x2;
        this.new = x.super(this.o00000).iterator();
    }

    @Override
    public boolean hasNext() {
        return this.new.hasNext();
    }

    public String super() {
        return (String)this.new.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

