/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.x;
import java.util.ListIterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class x$1
implements ListIterator {
    ListIterator \u00d300000;
    final /* synthetic */ int \u00d200000;
    final /* synthetic */ x super;

    x$1(x x2, int n2) {
        this.super = x2;
        this.\u00d200000 = n2;
        this.\u00d300000 = x.super(this.super).listIterator(this.\u00d200000);
    }

    @Override
    public boolean hasNext() {
        return this.\u00d300000.hasNext();
    }

    public String o00000() {
        return (String)this.\u00d300000.next();
    }

    @Override
    public boolean hasPrevious() {
        return this.\u00d300000.hasPrevious();
    }

    public String \u00d200000() {
        return (String)this.\u00d300000.previous();
    }

    @Override
    public int nextIndex() {
        return this.\u00d300000.nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.\u00d300000.previousIndex();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void o00000(String string) {
        throw new UnsupportedOperationException();
    }

    public void \u00d200000(String string) {
        throw new UnsupportedOperationException();
    }
}

