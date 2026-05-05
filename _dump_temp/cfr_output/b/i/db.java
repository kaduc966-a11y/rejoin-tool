/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.o.d.fc;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class db {
    private final Object o00000;
    private final long \u00d200000;

    private db(Object object, long l2) {
        this.o00000 = object;
        this.\u00d200000 = l2;
    }

    public final Object \u00d300000() {
        return this.o00000;
    }

    public final long new() {
        return this.\u00d200000;
    }

    public final Object \u00d400000() {
        return this.o00000;
    }

    public final long o00000() {
        return this.\u00d200000;
    }

    public final db o00000(Object object, long l2) {
        return new db(object, l2, null);
    }

    public static /* synthetic */ db o00000(db db2, Object object, long l2, int n2, Object object2) {
        if ((n2 & 1) != 0) {
            object = db2.o00000;
        }
        if ((n2 & 2) != 0) {
            l2 = db2.\u00d200000;
        }
        return db2.o00000(object, l2);
    }

    public final String toString() {
        return "TimedValue(value=" + this.o00000 + ", duration=" + b.null(this.\u00d200000) + ')';
    }

    public final int hashCode() {
        return (this.o00000 == null ? 0 : this.o00000.hashCode()) * 31 + b.\u00d3O0000(this.\u00d200000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof db)) {
            return false;
        }
        object = (db)object;
        if (!fc.o00000(this.o00000, ((db)object).o00000)) {
            return false;
        }
        return b.\u00d300000(this.\u00d200000, ((db)object).\u00d200000);
    }

    public /* synthetic */ db(Object object, long l2, w w2) {
        this(object, l2);
    }
}

