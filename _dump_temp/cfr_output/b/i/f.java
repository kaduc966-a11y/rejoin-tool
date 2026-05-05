/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.i.f$_b;
import b.i.fb;
import b.i.j$_b;
import b.i.m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class f
implements j$_b {
    private final m \u00f400000;

    public f(m m2) {
        this.\u00f400000 = m2;
    }

    protected final m \u00f800000() {
        return this.\u00f400000;
    }

    protected abstract double \u00f600000();

    @Override
    public fb \u00d200000() {
        return new f$_b(this.\u00f600000(), this, b.void.\u00d400000(), null);
    }
}

