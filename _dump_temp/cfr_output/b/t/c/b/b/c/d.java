/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    private final int super;
    private final int \u00d200000;
    private final int \u00d300000;

    public d(int n2, int n3, int n4) {
        this.super = n2;
        this.\u00d200000 = n3;
        this.\u00d300000 = n4;
    }

    public final String toString() {
        return "" + this.super + '.' + this.\u00d200000 + '.' + this.\u00d300000;
    }

    public final int Object() {
        return this.super;
    }

    public final int \u00d200000() {
        return this.\u00d200000;
    }

    public final int o00000() {
        return this.\u00d300000;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.super) * 31 + Integer.hashCode(this.\u00d200000)) * 31 + Integer.hashCode(this.\u00d300000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (this.super != ((d)object).super) {
            return false;
        }
        if (this.\u00d200000 != ((d)object).\u00d200000) {
            return false;
        }
        return this.\u00d300000 == ((d)object).\u00d300000;
    }
}

