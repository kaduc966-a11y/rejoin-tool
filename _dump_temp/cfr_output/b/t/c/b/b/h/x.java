/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.gc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.zb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x
extends gc {
    private final ib forObjectString;
    private final ib \u00d8\u00f4\u00d8000;

    public x(ib ib2, ib ib3) {
        this.forObjectString = ib2;
        this.\u00d8\u00f4\u00d8000 = ib3;
    }

    @Override
    protected final ib \u00d3\u00f4\u00d2000() {
        return this.forObjectString;
    }

    public final ib \u00d4\u00f4\u00d2000() {
        return this.\u00d8\u00f4\u00d8000;
    }

    public final ib \u00d5\u00f4\u00d2000() {
        return this.\u00d3\u00f4\u00d2000();
    }

    @Override
    public final ib new(zb zb2) {
        return new x(this.\u00d3\u00f4\u00d2000().new(zb2), this.\u00d8\u00f4\u00d8000);
    }

    public final x forsuper(boolean bl) {
        return new x(this.\u00d3\u00f4\u00d2000().\u00d4o0000(bl), this.\u00d8\u00f4\u00d8000.\u00d4o0000(bl));
    }

    public final x \u00d400000(ib ib2) {
        return new x(ib2, this.\u00d8\u00f4\u00d8000);
    }

    public final x \u00f4O0000(b b2) {
        return new x((ib)b2.\u00d200000(this.\u00d3\u00f4\u00d2000()), (ib)b2.\u00d200000(this.\u00d8\u00f4\u00d8000));
    }
}

