/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.o.d.w;
import b.t.c.b.b.n.c.g.d;
import b.t.c.b.b.n.c.g.m$_b;
import b.t.c.b.b.n.c.g.p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m {
    public static final m$_b \u00d800000 = new m$_b(null);
    private final d \u00d400000;
    private final p \u00d500000;
    private final boolean \u00d300000;
    private final boolean o00000;
    private final boolean new;
    private static final m return = new m(null, null, false, false, false, 24, null);

    public m(d d2, p p2, boolean bl, boolean bl2, boolean bl3) {
        this.\u00d400000 = d2;
        this.\u00d500000 = p2;
        this.\u00d300000 = bl;
        this.o00000 = bl2;
        this.new = bl3;
    }

    public /* synthetic */ m(d d2, p p2, boolean bl, boolean bl2, boolean bl3, int n2, w w2) {
        if ((n2 & 8) != 0) {
            bl2 = false;
        }
        if ((n2 & 0x10) != 0) {
            bl3 = false;
        }
        this(d2, p2, bl, bl2, bl3);
    }

    public final d String() {
        return this.\u00d400000;
    }

    public final p \u00d300000() {
        return this.\u00d500000;
    }

    public final boolean \u00d500000() {
        return this.\u00d300000;
    }

    public final boolean \u00d600000() {
        return this.o00000;
    }

    public final boolean \u00d200000() {
        return this.new;
    }

    public final m o00000(d d2, p p2, boolean bl, boolean bl2, boolean bl3) {
        return new m(d2, p2, bl, bl2, bl3);
    }

    public static /* synthetic */ m o00000(m m2, d d2, p p2, boolean bl, boolean bl2, boolean bl3, int n2, Object object) {
        if ((n2 & 1) != 0) {
            d2 = m2.\u00d400000;
        }
        if ((n2 & 2) != 0) {
            p2 = m2.\u00d500000;
        }
        if ((n2 & 4) != 0) {
            bl = m2.\u00d300000;
        }
        if ((n2 & 8) != 0) {
            bl2 = m2.o00000;
        }
        if ((n2 & 0x10) != 0) {
            bl3 = m2.new;
        }
        return m2.o00000(d2, p2, bl, bl2, bl3);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + (Object)((Object)this.\u00d400000) + ", mutability=" + (Object)((Object)this.\u00d500000) + ", definitelyNotNull=" + this.\u00d300000 + ", isNullabilityQualifierForWarning=" + this.o00000 + ", isMutabilityQualifierForWarning=" + this.new + ')';
    }

    public final int hashCode() {
        return ((((this.\u00d400000 == null ? 0 : this.\u00d400000.hashCode()) * 31 + (this.\u00d500000 == null ? 0 : this.\u00d500000.hashCode())) * 31 + Boolean.hashCode(this.\u00d300000)) * 31 + Boolean.hashCode(this.o00000)) * 31 + Boolean.hashCode(this.new);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        if (this.\u00d400000 != ((m)object).\u00d400000) {
            return false;
        }
        if (this.\u00d500000 != ((m)object).\u00d500000) {
            return false;
        }
        if (this.\u00d300000 != ((m)object).\u00d300000) {
            return false;
        }
        if (this.o00000 != ((m)object).o00000) {
            return false;
        }
        return this.new == ((m)object).new;
    }

    public static final /* synthetic */ m o00000() {
        return return;
    }
}

