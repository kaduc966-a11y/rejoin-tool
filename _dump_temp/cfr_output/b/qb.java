/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.o.d.fc;
import java.io.Serializable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class qb
implements Serializable {
    private final Object \u00d200000;
    private final Object o00000;

    public qb(Object object, Object object2) {
        this.\u00d200000 = object;
        this.o00000 = object2;
    }

    public final Object new() {
        return this.\u00d200000;
    }

    public final Object o00000() {
        return this.o00000;
    }

    public final String toString() {
        return "(" + this.\u00d200000 + ", " + this.o00000 + ')';
    }

    public final Object \u00d400000() {
        return this.\u00d200000;
    }

    public final Object \u00d300000() {
        return this.o00000;
    }

    public final qb o00000(Object object, Object object2) {
        return new qb(object, object2);
    }

    public static /* synthetic */ qb o00000(qb qb2, Object object, Object object2, int n2, Object object3) {
        if ((n2 & 1) != 0) {
            object = qb2.\u00d200000;
        }
        if ((n2 & 2) != 0) {
            object2 = qb2.o00000;
        }
        return qb2.o00000(object, object2);
    }

    public final int hashCode() {
        return (this.\u00d200000 == null ? 0 : this.\u00d200000.hashCode()) * 31 + (this.o00000 == null ? 0 : this.o00000.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof qb)) {
            return false;
        }
        object = (qb)object;
        if (!fc.o00000(this.\u00d200000, ((qb)object).\u00d200000)) {
            return false;
        }
        return fc.o00000(this.o00000, ((qb)object).o00000);
    }
}

