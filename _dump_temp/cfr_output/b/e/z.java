/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.ac;
import b.e.g;
import b.e.h;
import b.e.w;
import b.e.z$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class z
extends w
implements g,
h {
    public static final z$_b \u00f4\u00d40000 = new z$_b(null);
    private static final z \u00f5\u00d40000 = new z(-1, 0, null);

    private z(int n2, int n3) {
        super(n2, n3, 1, null);
    }

    public final int whilenew() {
        return this.\u00f5\u00d20000();
    }

    public final int O\u00d30000() {
        return this.ifnew();
    }

    public final int o\u00d30000() {
        if (this.ifnew() == -1) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return ac.\u00d500000(this.ifnew() + 1);
    }

    public static /* synthetic */ void \u00d3\u00d30000() {
    }

    public final boolean oo0000(int n2) {
        return Integer.compareUnsigned(this.\u00f5\u00d20000(), n2) <= 0 && Integer.compareUnsigned(n2, this.ifnew()) <= 0;
    }

    @Override
    public final boolean if() {
        return Integer.compareUnsigned(this.\u00f5\u00d20000(), this.ifnew()) > 0;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof z && (((w)this).if() && ((w)((z)object)).if() || this.\u00f5\u00d20000() == ((z)object).\u00f5\u00d20000() && this.ifnew() == ((z)object).ifnew());
    }

    @Override
    public final int hashCode() {
        if (((w)this).if()) {
            return -1;
        }
        return 31 * this.\u00f5\u00d20000() + this.ifnew();
    }

    @Override
    public final String toString() {
        return ac.\u00f800000(this.\u00f5\u00d20000()) + ".." + ac.\u00f800000(this.ifnew());
    }

    @Override
    public final /* synthetic */ Comparable OO0000() {
        return ac.return(this.whilenew());
    }

    @Override
    public final /* synthetic */ Comparable \u00f800000() {
        return ac.return(this.O\u00d30000());
    }

    @Override
    public final /* synthetic */ Comparable \u00d5O0000() {
        return ac.return(this.o\u00d30000());
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.oo0000(((ac)comparable).o00000());
    }

    public /* synthetic */ z(int n2, int n3, b.o.d.w w2) {
        this(n2, n3);
    }

    public static final /* synthetic */ z \u00f8\u00d20000() {
        return \u00f5\u00d40000;
    }
}

