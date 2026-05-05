/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.c;
import b.i.fb;
import b.i.j$_b;
import b.i.j$_c$_b;
import b.i.m;
import b.i.n;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x
implements j$_b {
    public static final x \u00d800000 = new x();
    private static final long \u00d600000 = System.nanoTime();

    private x() {
    }

    private final long int() {
        return System.nanoTime() - \u00d600000;
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public final long \u00f400000() {
        return j$_c$_b.oO0000(this.int());
    }

    public final long \u00d300000(long l2) {
        return c.o00000(this.int(), l2, m.\u00d300000);
    }

    public final long \u00d200000(long l2, long l3) {
        return c.\u00d300000(l2, l3, m.\u00d300000);
    }

    public final long super(long l2, long l3) {
        return j$_c$_b.oO0000(c.new(l2, m.\u00d300000, l3));
    }

    @Override
    public final /* synthetic */ fb \u00d200000() {
        return j$_c$_b.return(this.\u00f400000());
    }

    @Override
    public final /* synthetic */ n super() {
        return j$_c$_b.return(this.\u00f400000());
    }
}

