/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.db;
import b.e.g;
import b.e.h;
import b.e.r$_b;
import b.f;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r
extends db
implements g,
h {
    public static final r$_b o\u00d40000 = new r$_b(null);
    private static final r nullObject = new r(-1L, 0L, null);

    private r(long l2, long l3) {
        super(l2, l3, 1L, null);
    }

    public final long o\u00d20000() {
        return this.\u00f8o0000();
    }

    public final long newnew() {
        return this.O\u00d20000();
    }

    public final long \u00d3\u00d20000() {
        if (this.O\u00d20000() == -1L) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return f.super(this.O\u00d20000() + f.super(1L));
    }

    public static /* synthetic */ void \u00d5\u00d20000() {
    }

    public final boolean \u00d800000(long l2) {
        return Long.compareUnsigned(this.\u00f8o0000(), l2) <= 0 && Long.compareUnsigned(l2, this.O\u00d20000()) <= 0;
    }

    @Override
    public final boolean if() {
        return Long.compareUnsigned(this.\u00f8o0000(), this.O\u00d20000()) > 0;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof r && (((db)this).if() && ((db)((r)object)).if() || this.\u00f8o0000() == ((r)object).\u00f8o0000() && this.O\u00d20000() == ((r)object).O\u00d20000());
    }

    @Override
    public final int hashCode() {
        if (((db)this).if()) {
            return -1;
        }
        return 31 * (int)f.super(this.\u00f8o0000() ^ f.super(this.\u00f8o0000() >>> 32)) + (int)f.super(this.O\u00d20000() ^ f.super(this.O\u00d20000() >>> 32));
    }

    @Override
    public final String toString() {
        return f.\u00d400000(this.\u00f8o0000()) + ".." + f.\u00d400000(this.O\u00d20000());
    }

    @Override
    public final /* synthetic */ Comparable OO0000() {
        return f.\u00d4O0000(this.o\u00d20000());
    }

    @Override
    public final /* synthetic */ Comparable \u00f800000() {
        return f.\u00d4O0000(this.newnew());
    }

    @Override
    public final /* synthetic */ Comparable \u00d5O0000() {
        return f.\u00d4O0000(this.\u00d3\u00d20000());
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.\u00d800000(((f)comparable).super());
    }

    public /* synthetic */ r(long l2, long l3, w w2) {
        this(l2, l3);
    }

    public static final /* synthetic */ r \u00d4\u00d20000() {
        return nullObject;
    }
}

