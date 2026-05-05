/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.dc;
import b.i.b;
import b.i.fb;
import b.i.j$_b;
import b.i.m;
import b.i.w$_b;
import b.r;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class w
implements j$_b {
    private final m \u00d400000;
    private final dc \u00d300000;

    public w(m m2) {
        this.\u00d400000 = m2;
        this.\u00d300000 = r.o00000(() -> w.super(this));
    }

    protected final m \u00d800000() {
        return this.\u00d400000;
    }

    protected abstract long \u00d400000();

    private final long \u00d600000() {
        return ((Number)this.\u00d300000.\u00d200000()).longValue();
    }

    private final long class() {
        return this.\u00d400000() - this.\u00d600000();
    }

    @Override
    public fb \u00d200000() {
        return new w$_b(this.class(), this, b.void.\u00d400000(), null);
    }

    private static final long super(w w2) {
        return w2.\u00d400000();
    }

    public static final /* synthetic */ long \u00d200000(w w2) {
        return w2.class();
    }
}

