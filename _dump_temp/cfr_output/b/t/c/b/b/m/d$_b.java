/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.t.c.b.b.m.d;
import b.t.c.b.b.m.d$_d;
import java.util.ConcurrentModificationException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class d$_b
extends d$_d {
    private final int \u00d300000;
    final /* synthetic */ d \u00d200000;

    public d$_b(d d2) {
        this.\u00d200000 = d2;
        super(null);
        this.\u00d300000 = d.\u00d400000(d2);
    }

    @Override
    protected Object super() {
        return d.\u00d200000(this.\u00d200000);
    }

    @Override
    protected void \u00d200000() {
        if (d.\u00d300000(this.\u00d200000) != this.\u00d300000) {
            throw new ConcurrentModificationException("ModCount: " + d.super(this.\u00d200000) + "; expected: " + this.\u00d300000);
        }
    }

    @Override
    public void remove() {
        this.\u00d200000();
        this.\u00d200000.clear();
    }
}

