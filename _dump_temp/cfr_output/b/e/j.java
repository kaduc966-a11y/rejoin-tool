/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.g;
import b.e.h;
import b.e.j$_b;
import b.e.u;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j
extends u
implements g,
h {
    public static final j$_b o\u00d30000 = new j$_b(null);
    private static final j O\u00d50000 = new j(1L, 0L);

    public j(long l2, long l3) {
        super(l2, l3, 1L);
    }

    public final Long thisObject() {
        return this.\u00d3O0000();
    }

    public final Long \u00f4\u00d30000() {
        return this.oO0000();
    }

    public final Long \u00d5\u00d30000() {
        if (this.oO0000() == Long.MAX_VALUE) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return this.oO0000() + 1L;
    }

    public static /* synthetic */ void \u00d4\u00d30000() {
    }

    public final boolean \u00f400000(long l2) {
        return this.\u00d3O0000() <= l2 && l2 <= this.oO0000();
    }

    @Override
    public final boolean if() {
        return this.\u00d3O0000() > this.oO0000();
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof j && (((u)this).if() && ((u)((j)object)).if() || this.\u00d3O0000() == ((j)object).\u00d3O0000() && this.oO0000() == ((j)object).oO0000());
    }

    @Override
    public final int hashCode() {
        if (((u)this).if()) {
            return -1;
        }
        return (int)(31L * (this.\u00d3O0000() ^ this.\u00d3O0000() >>> 32) + (this.oO0000() ^ this.oO0000() >>> 32));
    }

    @Override
    public final String toString() {
        return this.\u00d3O0000() + ".." + this.oO0000();
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.\u00f400000(((Number)((Object)comparable)).longValue());
    }

    public static final /* synthetic */ j \u00d8\u00d30000() {
        return O\u00d50000;
    }
}

