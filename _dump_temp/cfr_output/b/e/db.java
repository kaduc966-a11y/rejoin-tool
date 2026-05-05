/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.db$_b;
import b.e.o;
import b.f;
import b.m.r;
import b.o.d.c.g;
import b.o.d.w;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class db
implements Iterable,
g {
    public static final db$_b o\u00d40000 = new db$_b(null);
    private final long O\u00d40000;
    private final long \u00f8\u00d30000;
    private final long StringObject;

    private db(long l2, long l3, long l4) {
        if (l4 == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (l4 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.O\u00d40000 = l2;
        this.\u00f8\u00d30000 = r.o00000(l2, l3, l4);
        this.StringObject = l4;
    }

    public final long \u00f8o0000() {
        return this.O\u00d40000;
    }

    public final long O\u00d20000() {
        return this.\u00f8\u00d30000;
    }

    public final long privatesuper() {
        return this.StringObject;
    }

    public final Iterator iterator() {
        return new o(this.O\u00d40000, this.\u00f8\u00d30000, this.StringObject, null);
    }

    public boolean if() {
        if (this.StringObject > 0L) {
            return Long.compareUnsigned(this.O\u00d40000, this.\u00f8\u00d30000) > 0;
        }
        return Long.compareUnsigned(this.O\u00d40000, this.\u00f8\u00d30000) < 0;
    }

    public boolean equals(Object object) {
        return object instanceof db && (this.if() && ((db)object).if() || this.O\u00d40000 == ((db)object).O\u00d40000 && this.\u00f8\u00d30000 == ((db)object).\u00f8\u00d30000 && this.StringObject == ((db)object).StringObject);
    }

    public int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * (31 * (int)f.super(this.O\u00d40000 ^ f.super(this.O\u00d40000 >>> 32)) + (int)f.super(this.\u00f8\u00d30000 ^ f.super(this.\u00f8\u00d30000 >>> 32))) + (int)(this.StringObject ^ this.StringObject >>> 32);
    }

    public String toString() {
        if (this.StringObject > 0L) {
            return f.\u00d400000(this.O\u00d40000) + ".." + f.\u00d400000(this.\u00f8\u00d30000) + " step " + this.StringObject;
        }
        return f.\u00d400000(this.O\u00d40000) + " downTo " + f.\u00d400000(this.\u00f8\u00d30000) + " step " + -this.StringObject;
    }

    public /* synthetic */ db(long l2, long l3, long l4, w w2) {
        this(l2, l3, l4);
    }
}

