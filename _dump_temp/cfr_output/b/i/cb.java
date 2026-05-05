/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.i.m;
import b.i.p;
import b.i.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class cb
extends w {
    private long class;

    public cb() {
        super(m.\u00d300000);
        this.\u00d200000();
    }

    @Override
    protected final long \u00d400000() {
        return this.class;
    }

    public final void \u00d200000(long l2) {
        long l3 = b.o00000(l2, this.\u00d800000());
        if (!((l3 - 1L | 1L) == Long.MAX_VALUE)) {
            long l4 = this.class + l3;
            if ((this.class ^ l3) >= 0L && (this.class ^ l4) < 0L) {
                this.super(l2);
            }
            this.class = l4;
            return;
        }
        long l5 = b.o00000(l2, 2);
        if (!((b.o00000(l5, this.\u00d800000()) - 1L | 1L) == Long.MAX_VALUE)) {
            long l6 = this.class;
            try {
                this.\u00d200000(l5);
                this.\u00d200000(b.String(l2, l5));
                return;
            }
            catch (IllegalStateException illegalStateException) {
                this.class = l6;
                throw illegalStateException;
            }
        }
        this.super(l2);
    }

    private final void super(long l2) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.class + p.\u00d300000(this.\u00d800000()) + " is advanced by " + b.null(l2) + '.');
    }
}

