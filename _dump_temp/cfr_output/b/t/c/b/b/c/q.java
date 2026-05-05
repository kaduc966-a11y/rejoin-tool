/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.q$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class q {
    public static final q$_b \u00d300000 = new q$_b(null);
    private db \u00d200000;
    private String o00000;

    public q(db db2, String string) {
        this.\u00d200000 = db2;
        this.o00000 = string;
    }

    public final db \u00d200000() {
        return this.\u00d200000;
    }

    public final String super() {
        return this.o00000;
    }

    public final String toString() {
        return "KmFlexibleTypeUpperBound(type=" + this.\u00d200000 + ", typeFlexibilityId=" + this.o00000 + ')';
    }

    public final int hashCode() {
        return this.\u00d200000.hashCode() * 31 + (this.o00000 == null ? 0 : this.o00000.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof q)) {
            return false;
        }
        object = (q)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((q)object).\u00d200000)) {
            return false;
        }
        return fc.o00000((Object)this.o00000, (Object)((q)object).o00000);
    }
}

