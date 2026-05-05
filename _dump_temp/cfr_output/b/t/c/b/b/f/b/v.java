/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.o.d.w;
import b.t.c.b.b.d.k;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.q.g;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class v {
    private final e o00000;
    private final d \u00d200000;
    private final g \u00d300000;

    private v(e e2, d d2, g g2) {
        this.o00000 = e2;
        this.\u00d200000 = d2;
        this.\u00d300000 = g2;
    }

    public final e \u00d400000() {
        return this.o00000;
    }

    public final d \u00d300000() {
        return this.\u00d200000;
    }

    public final g \u00d200000() {
        return this.\u00d300000;
    }

    public abstract k super();

    public String toString() {
        return this.getClass().getSimpleName() + ": " + this.super();
    }

    public /* synthetic */ v(e e2, d d2, g g2, w w2) {
        this(e2, d2, g2);
    }
}

