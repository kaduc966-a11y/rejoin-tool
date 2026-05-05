/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.o.d.fc;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r {
    private final Object o00000;
    private final boolean \u00d200000;

    public r(Object object, boolean bl) {
        this.o00000 = object;
        this.\u00d200000 = bl;
    }

    public /* synthetic */ r(Object object, boolean bl, int n2, w w2) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        this(object, bl);
    }

    public final Object \u00d200000() {
        return this.o00000;
    }

    public final boolean super() {
        return this.\u00d200000;
    }

    public final r super(Object object, boolean bl) {
        return new r(object, bl);
    }

    public static /* synthetic */ r super(r r2, Object object, boolean bl, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            object = r2.o00000;
        }
        if ((n2 & 2) != 0) {
            bl = r2.\u00d200000;
        }
        return r2.super(object, bl);
    }

    public final String toString() {
        return "WithMigrationStatus(qualifier=" + this.o00000 + ", isForWarningOnly=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return (this.o00000 == null ? 0 : this.o00000.hashCode()) * 31 + Boolean.hashCode(this.\u00d200000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof r)) {
            return false;
        }
        object = (r)object;
        if (!fc.o00000(this.o00000, ((r)object).o00000)) {
            return false;
        }
        return this.\u00d200000 == ((r)object).\u00d200000;
    }
}

