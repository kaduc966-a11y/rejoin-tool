/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.n;
import b.t.c.b.b.p.n$1;
import java.util.Iterator;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class n$_b
implements Iterator {
    private int String = -1;
    private boolean \u00d300000;
    private Iterator \u00d200000;
    final /* synthetic */ n o00000;

    private n$_b(n n2) {
        this.o00000 = n2;
    }

    @Override
    public boolean hasNext() {
        return this.String + 1 < n.\u00d300000(this.o00000).size() || this.super().hasNext();
    }

    public Map.Entry \u00d200000() {
        this.\u00d300000 = true;
        if (++this.String < n.\u00d300000(this.o00000).size()) {
            return (Map.Entry)n.\u00d300000(this.o00000).get(this.String);
        }
        return (Map.Entry)this.super().next();
    }

    @Override
    public void remove() {
        if (!this.\u00d300000) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.\u00d300000 = false;
        n.\u00d200000(this.o00000);
        if (this.String < n.\u00d300000(this.o00000).size()) {
            n.super(this.o00000, this.String--);
            return;
        }
        this.super().remove();
    }

    private Iterator super() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = n.super(this.o00000).entrySet().iterator();
        }
        return this.\u00d200000;
    }

    /* synthetic */ n$_b(n n2, n$1 n$1) {
        this(n2);
    }
}

