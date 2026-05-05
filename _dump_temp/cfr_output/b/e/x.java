/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.d;
import b.e.x$_b;
import b.m.w;
import b.o.d.c.g;
import b.s.fb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class x
implements Iterable,
g {
    public static final x$_b thisObject = new x$_b(null);
    private final int \u00d5\u00d30000;
    private final int \u00d4\u00d30000;
    private final int \u00d3\u00d30000;

    public x(int n2, int n3, int n4) {
        if (n4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (n4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.\u00d5\u00d30000 = n2;
        this.\u00d4\u00d30000 = w.\u00d200000(n2, n3, n4);
        this.\u00d3\u00d30000 = n4;
    }

    public final int \u00f8O0000() {
        return this.\u00d5\u00d30000;
    }

    public final int oo0000() {
        return this.\u00d4\u00d30000;
    }

    public final int Oo0000() {
        return this.\u00d3\u00d30000;
    }

    public fb nullsuper() {
        return new d(this.\u00d5\u00d30000, this.\u00d4\u00d30000, this.\u00d3\u00d30000);
    }

    public boolean if() {
        if (this.\u00d3\u00d30000 > 0) {
            return this.\u00d5\u00d30000 > this.\u00d4\u00d30000;
        }
        return this.\u00d5\u00d30000 < this.\u00d4\u00d30000;
    }

    public boolean equals(Object object) {
        return object instanceof x && (this.if() && ((x)object).if() || this.\u00d5\u00d30000 == ((x)object).\u00d5\u00d30000 && this.\u00d4\u00d30000 == ((x)object).\u00d4\u00d30000 && this.\u00d3\u00d30000 == ((x)object).\u00d3\u00d30000);
    }

    public int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * (31 * this.\u00d5\u00d30000 + this.\u00d4\u00d30000) + this.\u00d3\u00d30000;
    }

    public String toString() {
        if (this.\u00d3\u00d30000 > 0) {
            return this.\u00d5\u00d30000 + ".." + this.\u00d4\u00d30000 + " step " + this.\u00d3\u00d30000;
        }
        return this.\u00d5\u00d30000 + " downTo " + this.\u00d4\u00d30000 + " step " + -this.\u00d3\u00d30000;
    }
}

