/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.m;
import b.e.x;
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class t {
    private final String new;
    private final m o00000;

    public t(String string, m m2) {
        this.new = string;
        this.o00000 = m2;
    }

    public final String Object() {
        return this.new;
    }

    public final m \u00d200000() {
        return this.o00000;
    }

    public final String \u00d400000() {
        return this.new;
    }

    public final m o00000() {
        return this.o00000;
    }

    public final t o00000(String string, m m2) {
        return new t(string, m2);
    }

    public static /* synthetic */ t o00000(t t2, String string, m m2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = t2.new;
        }
        if ((n2 & 2) != 0) {
            m2 = t2.o00000;
        }
        return t2.o00000(string, m2);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.new + ", range=" + this.o00000 + ')';
    }

    public final int hashCode() {
        return this.new.hashCode() * 31 + ((x)this.o00000).hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof t)) {
            return false;
        }
        object = (t)object;
        if (!fc.o00000((Object)this.new, (Object)((t)object).new)) {
            return false;
        }
        return fc.o00000((Object)this.o00000, (Object)((t)object).o00000);
    }
}

