/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class l {
    private final int super;
    private final Object \u00d200000;

    public l(int n2, Object object) {
        this.super = n2;
        this.\u00d200000 = object;
    }

    public final int o00000() {
        return this.super;
    }

    public final Object String() {
        return this.\u00d200000;
    }

    public final int \u00d200000() {
        return this.super;
    }

    public final Object \u00d300000() {
        return this.\u00d200000;
    }

    public final l o00000(int n2, Object object) {
        return new l(n2, object);
    }

    public static /* synthetic */ l o00000(l l2, int n2, Object object, int n3, Object object2) {
        if ((n3 & 1) != 0) {
            n2 = l2.super;
        }
        if ((n3 & 2) != 0) {
            object = l2.\u00d200000;
        }
        return l2.o00000(n2, object);
    }

    public final String toString() {
        return "IndexedValue(index=" + this.super + ", value=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return Integer.hashCode(this.super) * 31 + (this.\u00d200000 == null ? 0 : this.\u00d200000.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        object = (l)object;
        if (this.super != ((l)object).super) {
            return false;
        }
        return fc.o00000(this.\u00d200000, ((l)object).\u00d200000);
    }
}

