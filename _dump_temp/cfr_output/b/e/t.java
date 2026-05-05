/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.n;
import b.e.t$_b;
import b.m.w;
import b.o.d.c.g;
import b.o.d.fc;
import b.s.ec;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class t
implements Iterable,
g {
    public static final t$_b \u00d8\u00d20000 = new t$_b(null);
    private final char returnnew;
    private final char \u00d5\u00d20000;
    private final int \u00d4\u00d20000;

    public t(char c2, char c3, int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (n2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.returnnew = c2;
        this.\u00d5\u00d20000 = (char)w.\u00d200000(c2, c3, n2);
        this.\u00d4\u00d20000 = n2;
    }

    public final char \u00f400000() {
        return this.returnnew;
    }

    public final char \u00f500000() {
        return this.\u00d5\u00d20000;
    }

    public final int return() {
        return this.\u00d4\u00d20000;
    }

    public ec \u00d800000() {
        return new n(this.returnnew, this.\u00d5\u00d20000, this.\u00d4\u00d20000);
    }

    public boolean if() {
        if (this.\u00d4\u00d20000 > 0) {
            return fc.o00000((int)this.returnnew, this.\u00d5\u00d20000) > 0;
        }
        return fc.o00000((int)this.returnnew, this.\u00d5\u00d20000) < 0;
    }

    public boolean equals(Object object) {
        return object instanceof t && (this.if() && ((t)object).if() || this.returnnew == ((t)object).returnnew && this.\u00d5\u00d20000 == ((t)object).\u00d5\u00d20000 && this.\u00d4\u00d20000 == ((t)object).\u00d4\u00d20000);
    }

    public int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * (31 * this.returnnew + this.\u00d5\u00d20000) + this.\u00d4\u00d20000;
    }

    public String toString() {
        if (this.\u00d4\u00d20000 > 0) {
            return this.returnnew + ".." + this.\u00d5\u00d20000 + " step " + this.\u00d4\u00d20000;
        }
        return this.returnnew + " downTo " + this.\u00d5\u00d20000 + " step " + -this.\u00d4\u00d20000;
    }
}

