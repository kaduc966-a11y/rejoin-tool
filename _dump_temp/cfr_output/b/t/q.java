/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.o.d.fc;
import b.qd;
import b.t.l;
import b.t.q$_b;
import b.t.q$_c;
import b.t.u;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class q {
    public static final q$_c \u00d400000 = new q$_c(null);
    private final l super;
    private final u \u00d200000;
    public static final q \u00d300000 = new q(null, null);

    public q(l object, u u2) {
        this.super = object;
        this.\u00d200000 = u2;
        if (!(this.super == null == (this.\u00d200000 == null))) {
            object = this.super == null ? "Star projection must have no type specified." : "The projection variance " + (Object)((Object)this.super) + " requires type to be specified.";
            throw new IllegalArgumentException(object.toString());
        }
    }

    public final l new() {
        return this.super;
    }

    public final u o00000() {
        return this.\u00d200000;
    }

    public final String toString() {
        l l2 = this.super;
        switch (l2 == null ? -1 : q$_b.o00000[l2.ordinal()]) {
            case -1: {
                return "*";
            }
            case 1: {
                return String.valueOf(this.\u00d200000);
            }
            case 2: {
                return "in " + this.\u00d200000;
            }
            case 3: {
                return "out " + this.\u00d200000;
            }
        }
        throw new qd();
    }

    public final l \u00d400000() {
        return this.super;
    }

    public final u \u00d300000() {
        return this.\u00d200000;
    }

    public final q o00000(l l2, u u2) {
        return new q(l2, u2);
    }

    public static /* synthetic */ q o00000(q q2, l l2, u u2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            l2 = q2.super;
        }
        if ((n2 & 2) != 0) {
            u2 = q2.\u00d200000;
        }
        return q2.o00000(l2, u2);
    }

    public final int hashCode() {
        return (this.super == null ? 0 : this.super.hashCode()) * 31 + (this.\u00d200000 == null ? 0 : this.\u00d200000.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof q)) {
            return false;
        }
        object = (q)object;
        if (this.super != ((q)object).super) {
            return false;
        }
        return fc.o00000((Object)this.\u00d200000, (Object)((q)object).\u00d200000);
    }

    public static final q \u00d300000(u u2) {
        return \u00d400000.\u00d200000(u2);
    }

    public static final q new(u u2) {
        return \u00d400000.o00000(u2);
    }

    public static final q o00000(u u2) {
        return \u00d400000.\u00d300000(u2);
    }
}

