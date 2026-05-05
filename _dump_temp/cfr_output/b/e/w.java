/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.ac;
import b.e.p;
import b.e.w$_b;
import b.m.r;
import b.o.d.c.g;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class w
implements Iterable,
g {
    public static final w$_b \u00f4\u00d40000 = new w$_b(null);
    private final int \u00d8\u00d40000;
    private final int forObject;
    private final int \u00d5\u00d40000;

    private w(int n2, int n3, int n4) {
        if (n4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (n4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.\u00d8\u00d40000 = n2;
        this.forObject = r.o00000(n2, n3, n4);
        this.\u00d5\u00d40000 = n4;
    }

    public final int \u00f5\u00d20000() {
        return this.\u00d8\u00d40000;
    }

    public final int ifnew() {
        return this.forObject;
    }

    public final int \u00f4\u00d20000() {
        return this.\u00d5\u00d40000;
    }

    public final Iterator iterator() {
        return new p(this.\u00d8\u00d40000, this.forObject, this.\u00d5\u00d40000, null);
    }

    public boolean if() {
        if (this.\u00d5\u00d40000 > 0) {
            return Integer.compareUnsigned(this.\u00d8\u00d40000, this.forObject) > 0;
        }
        return Integer.compareUnsigned(this.\u00d8\u00d40000, this.forObject) < 0;
    }

    public boolean equals(Object object) {
        return object instanceof w && (this.if() && ((w)object).if() || this.\u00d8\u00d40000 == ((w)object).\u00d8\u00d40000 && this.forObject == ((w)object).forObject && this.\u00d5\u00d40000 == ((w)object).\u00d5\u00d40000);
    }

    public int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * (31 * this.\u00d8\u00d40000 + this.forObject) + this.\u00d5\u00d40000;
    }

    public String toString() {
        if (this.\u00d5\u00d40000 > 0) {
            return ac.\u00f800000(this.\u00d8\u00d40000) + ".." + ac.\u00f800000(this.forObject) + " step " + this.\u00d5\u00d40000;
        }
        return ac.\u00f800000(this.\u00d8\u00d40000) + " downTo " + ac.\u00f800000(this.forObject) + " step " + -this.\u00d5\u00d40000;
    }

    public /* synthetic */ w(int n2, int n3, int n4, b.o.d.w w2) {
        this(n2, n3, n4);
    }
}

