/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.c;
import b.e.u$_b;
import b.m.w;
import b.o.d.c.g;
import b.s.nb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class u
implements Iterable,
g {
    public static final u$_b o\u00d30000 = new u$_b(null);
    private final long O\u00d30000;
    private final long \u00f8\u00d20000;
    private final long ifnew;

    public u(long l2, long l3, long l4) {
        if (l4 == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (l4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.O\u00d30000 = l2;
        this.\u00f8\u00d20000 = w.o00000(l2, l3, l4);
        this.ifnew = l4;
    }

    public final long \u00d3O0000() {
        return this.O\u00d30000;
    }

    public final long oO0000() {
        return this.\u00f8\u00d20000;
    }

    public final long \u00d4O0000() {
        return this.ifnew;
    }

    public nb while() {
        return new c(this.O\u00d30000, this.\u00f8\u00d20000, this.ifnew);
    }

    public boolean if() {
        if (this.ifnew > 0L) {
            return this.O\u00d30000 > this.\u00f8\u00d20000;
        }
        return this.O\u00d30000 < this.\u00f8\u00d20000;
    }

    public boolean equals(Object object) {
        return object instanceof u && (this.if() && ((u)object).if() || this.O\u00d30000 == ((u)object).O\u00d30000 && this.\u00f8\u00d20000 == ((u)object).\u00f8\u00d20000 && this.ifnew == ((u)object).ifnew);
    }

    public int hashCode() {
        if (this.if()) {
            return -1;
        }
        return (int)(31L * (31L * (this.O\u00d30000 ^ this.O\u00d30000 >>> 32) + (this.\u00f8\u00d20000 ^ this.\u00f8\u00d20000 >>> 32)) + (this.ifnew ^ this.ifnew >>> 32));
    }

    public String toString() {
        if (this.ifnew > 0L) {
            return this.O\u00d30000 + ".." + this.\u00f8\u00d20000 + " step " + this.ifnew;
        }
        return this.O\u00d30000 + " downTo " + this.\u00f8\u00d20000 + " step " + -this.ifnew;
    }
}

