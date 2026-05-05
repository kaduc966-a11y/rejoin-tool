/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.d.d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f$_b {
    private final d \u00d300000;
    private final d o00000;
    private final d new;

    public f$_b(d d2, d d3, d d4) {
        this.\u00d300000 = d2;
        this.o00000 = d3;
        this.new = d4;
    }

    public final d \u00d400000() {
        return this.\u00d300000;
    }

    public final d new() {
        return this.\u00d300000;
    }

    public final d \u00d300000() {
        return this.o00000;
    }

    public final d o00000() {
        return this.new;
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.\u00d300000 + ", kotlinReadOnly=" + this.o00000 + ", kotlinMutable=" + this.new + ')';
    }

    public final int hashCode() {
        return (this.\u00d300000.hashCode() * 31 + this.o00000.hashCode()) * 31 + this.new.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f$_b)) {
            return false;
        }
        object = (f$_b)object;
        if (!fc.o00000((Object)this.\u00d300000, (Object)((f$_b)object).\u00d300000)) {
            return false;
        }
        if (!fc.o00000((Object)this.o00000, (Object)((f$_b)object).o00000)) {
            return false;
        }
        return fc.o00000((Object)this.new, (Object)((f$_b)object).new);
    }
}

