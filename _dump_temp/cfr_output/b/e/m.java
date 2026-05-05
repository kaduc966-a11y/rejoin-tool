/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.g;
import b.e.h;
import b.e.m$_b;
import b.e.x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
extends x
implements g,
h {
    public static final m$_b thisObject = new m$_b(null);
    private static final m \u00d8\u00d30000 = new m(1, 0);

    public m(int n2, int n3) {
        super(n2, n3, 1);
    }

    public final Integer \u00d5o0000() {
        return this.\u00f8O0000();
    }

    public final Integer \u00d3o0000() {
        return this.oo0000();
    }

    public final Integer \u00d8o0000() {
        if (this.oo0000() == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return this.oo0000() + 1;
    }

    public static /* synthetic */ void \u00d4o0000() {
    }

    public final boolean Oo0000(int n2) {
        return this.\u00f8O0000() <= n2 && n2 <= this.oo0000();
    }

    @Override
    public final boolean if() {
        return this.\u00f8O0000() > this.oo0000();
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof m && (((x)this).if() && ((x)((m)object)).if() || this.\u00f8O0000() == ((m)object).\u00f8O0000() && this.oo0000() == ((m)object).oo0000());
    }

    @Override
    public final int hashCode() {
        if (((x)this).if()) {
            return -1;
        }
        return 31 * this.\u00f8O0000() + this.oo0000();
    }

    @Override
    public final String toString() {
        return this.\u00f8O0000() + ".." + this.oo0000();
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.Oo0000(((Number)((Object)comparable)).intValue());
    }

    public static final /* synthetic */ m forsuper() {
        return \u00d8\u00d30000;
    }
}

