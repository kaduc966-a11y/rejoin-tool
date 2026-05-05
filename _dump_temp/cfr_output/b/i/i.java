/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.i.n;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class i
implements n {
    private final n new;
    private final long o00000;

    private i(n n2, long l2) {
        this.new = n2;
        this.o00000 = l2;
    }

    public final n \u00d500000() {
        return this.new;
    }

    public final long \u00d400000() {
        return this.o00000;
    }

    @Override
    public final long o00000() {
        return b.String(this.new.o00000(), this.o00000);
    }

    @Override
    public final n new(long l2) {
        return new i(this.new, b.\u00d200000(this.o00000, l2), null);
    }

    public /* synthetic */ i(n n2, long l2, w w2) {
        this(n2, l2);
    }
}

