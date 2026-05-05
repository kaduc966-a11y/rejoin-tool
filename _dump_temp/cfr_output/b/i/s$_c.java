/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.s;
import b.i.t;
import b.i.v;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class s$_c
implements s {
    private final long \u00d200000;
    private final int super;

    public s$_c(long l2, int n2) {
        this.\u00d200000 = l2;
        this.super = n2;
    }

    public final long \u00d300000() {
        return this.\u00d200000;
    }

    public final int \u00d400000() {
        return this.super;
    }

    @Override
    public final v new() {
        if (this.\u00d200000 < v.\u00d500000.\u00d300000().\u00d500000() || this.\u00d200000 > v.\u00d500000.class().\u00d500000()) {
            throw new t("The parsed date is outside the range representable by Instant (Unix epoch second " + this.\u00d200000 + ')');
        }
        return v.\u00d500000.super(this.\u00d200000, this.super);
    }

    @Override
    public final v o00000() {
        if (this.\u00d200000 < v.\u00d500000.\u00d300000().\u00d500000() || this.\u00d200000 > v.\u00d500000.class().\u00d500000()) {
            return null;
        }
        return v.\u00d500000.super(this.\u00d200000, this.super);
    }
}

