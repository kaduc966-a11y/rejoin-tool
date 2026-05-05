/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.o.d.fc;
import java.io.Serializable;

public final class hd
implements Serializable {
    private final Object Object;
    private final Object \u00d200000;
    private final Object o00000;

    public hd(Object object, Object object2, Object object3) {
        this.Object = object;
        this.\u00d200000 = object2;
        this.o00000 = object3;
    }

    public final Object Object() {
        return this.Object;
    }

    public final Object o00000() {
        return this.\u00d200000;
    }

    public final Object \u00d200000() {
        return this.o00000;
    }

    public final String toString() {
        return "(" + this.Object + ", " + this.\u00d200000 + ", " + this.o00000 + ')';
    }

    public final Object \u00d600000() {
        return this.Object;
    }

    public final Object \u00d500000() {
        return this.\u00d200000;
    }

    public final Object \u00d400000() {
        return this.o00000;
    }

    public final hd o00000(Object object, Object object2, Object object3) {
        return new hd(object, object2, object3);
    }

    public static /* synthetic */ hd o00000(hd hd2, Object object, Object object2, Object object3, int n2, Object object4) {
        if ((n2 & 1) != 0) {
            object = hd2.Object;
        }
        if ((n2 & 2) != 0) {
            object2 = hd2.\u00d200000;
        }
        if ((n2 & 4) != 0) {
            object3 = hd2.o00000;
        }
        return hd2.o00000(object, object2, object3);
    }

    public final int hashCode() {
        return ((this.Object == null ? 0 : this.Object.hashCode()) * 31 + (this.\u00d200000 == null ? 0 : this.\u00d200000.hashCode())) * 31 + (this.o00000 == null ? 0 : this.o00000.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hd)) {
            return false;
        }
        object = (hd)object;
        if (!fc.o00000(this.Object, ((hd)object).Object)) {
            return false;
        }
        if (!fc.o00000(this.\u00d200000, ((hd)object).\u00d200000)) {
            return false;
        }
        return fc.o00000(this.o00000, ((hd)object).o00000);
    }
}

