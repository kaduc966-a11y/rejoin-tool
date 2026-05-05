/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.r.b;
import b.r.l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
implements b {
    public static final m \u00f5\u00f40000 = new m();

    private m() {
    }

    @Override
    public final l O\u00d80000() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override
    public final void return(Object object) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

