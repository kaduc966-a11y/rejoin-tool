/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.b.n.c.g.d;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r {
    private final b.t.c.b.b.n.c.g.r \u00d300000;
    private final Collection \u00d500000;
    private final boolean \u00d400000;
    private final boolean new;
    private final boolean o00000;

    public r(b.t.c.b.b.n.c.g.r r2, Collection collection, boolean bl, boolean bl2, boolean bl3) {
        this.\u00d300000 = r2;
        this.\u00d500000 = collection;
        this.\u00d400000 = bl;
        this.new = bl2;
        this.o00000 = bl3;
    }

    public /* synthetic */ r(b.t.c.b.b.n.c.g.r r2, Collection collection, boolean bl, boolean bl2, boolean bl3, int n2, w w2) {
        if ((n2 & 4) != 0) {
            boolean bl4 = bl = r2.\u00d200000() == d.class;
        }
        if ((n2 & 8) != 0) {
            bl2 = false;
        }
        if ((n2 & 0x10) != 0) {
            bl3 = false;
        }
        this(r2, collection, bl, bl2, bl3);
    }

    public final b.t.c.b.b.n.c.g.r new() {
        return this.\u00d300000;
    }

    public final Collection \u00d400000() {
        return this.\u00d500000;
    }

    public final boolean \u00d300000() {
        return this.\u00d400000;
    }

    public final boolean o00000() {
        return this.o00000;
    }

    public final r o00000(b.t.c.b.b.n.c.g.r r2, Collection collection, boolean bl, boolean bl2, boolean bl3) {
        return new r(r2, collection, bl, bl2, bl3);
    }

    public static /* synthetic */ r o00000(r r2, b.t.c.b.b.n.c.g.r r3, Collection collection, boolean bl, boolean bl2, boolean bl3, int n2, Object object) {
        if ((n2 & 1) != 0) {
            r3 = r2.\u00d300000;
        }
        if ((n2 & 2) != 0) {
            collection = r2.\u00d500000;
        }
        if ((n2 & 4) != 0) {
            bl = r2.\u00d400000;
        }
        if ((n2 & 8) != 0) {
            bl2 = r2.new;
        }
        if ((n2 & 0x10) != 0) {
            bl3 = r2.o00000;
        }
        return r2.o00000(r3, collection, bl, bl2, bl3);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.\u00d300000 + ", qualifierApplicabilityTypes=" + this.\u00d500000 + ", definitelyNotNull=" + this.\u00d400000 + ", preferQualifierOverBound=" + this.new + ", preferQualifierOverSupertype=" + this.o00000 + ')';
    }

    public final int hashCode() {
        return (((this.\u00d300000.hashCode() * 31 + ((Object)this.\u00d500000).hashCode()) * 31 + Boolean.hashCode(this.\u00d400000)) * 31 + Boolean.hashCode(this.new)) * 31 + Boolean.hashCode(this.o00000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof r)) {
            return false;
        }
        object = (r)object;
        if (!fc.o00000((Object)this.\u00d300000, (Object)((r)object).\u00d300000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d500000, (Object)((r)object).\u00d500000)) {
            return false;
        }
        if (this.\u00d400000 != ((r)object).\u00d400000) {
            return false;
        }
        if (this.new != ((r)object).new) {
            return false;
        }
        return this.o00000 == ((r)object).o00000;
    }
}

