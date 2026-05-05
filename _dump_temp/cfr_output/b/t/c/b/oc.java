/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.mc;
import b.t.c.b.c.j;
import b.t.c.b.oc$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oc {
    public static final oc$_b \u00f600000 = new oc$_b(null);
    private final mc \u00d500000;
    private final j \u00f400000;
    private final ab \u00f500000;
    private final boolean \u00d600000;
    private final boolean \u00d400000;
    private final boolean void;
    private final boolean \u00d200000;
    private final boolean o00000;
    private static final oc Object = new oc(null, j.\u00d300000.o00000(), null, false, false, false, false, false);

    public oc(mc mc2, j j2, ab ab2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.\u00d500000 = mc2;
        this.\u00f400000 = j2;
        this.\u00f500000 = ab2;
        this.\u00d600000 = bl;
        this.\u00d400000 = bl2;
        this.void = bl3;
        this.\u00d200000 = bl4;
        this.o00000 = bl5;
    }

    public final mc \u00d400000() {
        return this.\u00d500000;
    }

    public final j super() {
        return this.\u00f400000;
    }

    public final ab \u00f400000() {
        return this.\u00f500000;
    }

    public final boolean \u00d800000() {
        return this.\u00d600000;
    }

    public final boolean \u00d200000() {
        return this.\u00d400000;
    }

    public final boolean \u00d300000() {
        return this.void;
    }

    public final boolean \u00d600000() {
        return this.\u00d200000;
    }

    public final boolean class() {
        return this.o00000;
    }

    public final oc super(mc mc2, j j2, ab ab2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        return new oc(mc2, j2, ab2, bl, bl2, bl3, bl4, bl5);
    }

    public static /* synthetic */ oc super(oc oc2, mc mc2, j j2, ab ab2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n2, Object object) {
        if ((n2 & 1) != 0) {
            mc2 = oc2.\u00d500000;
        }
        if ((n2 & 2) != 0) {
            j2 = oc2.\u00f400000;
        }
        if ((n2 & 4) != 0) {
            ab2 = oc2.\u00f500000;
        }
        if ((n2 & 8) != 0) {
            bl = oc2.\u00d600000;
        }
        if ((n2 & 0x10) != 0) {
            bl2 = oc2.\u00d400000;
        }
        if ((n2 & 0x20) != 0) {
            bl3 = oc2.void;
        }
        if ((n2 & 0x40) != 0) {
            bl4 = oc2.\u00d200000;
        }
        if ((n2 & 0x80) != 0) {
            bl5 = oc2.o00000;
        }
        return oc2.super(mc2, j2, ab2, bl, bl2, bl3, bl4, bl5);
    }

    public final String toString() {
        return "KCallableOverriddenStorage(instanceReceiverParameter=" + this.\u00d500000 + ", typeSubstitutor=" + this.\u00f400000 + ", modality=" + (Object)((Object)this.\u00f500000) + ", isFakeOverride=" + this.\u00d600000 + ", forceIsExternal=" + this.\u00d400000 + ", forceIsOperator=" + this.void + ", forceIsInfix=" + this.\u00d200000 + ", forceIsInline=" + this.o00000 + ')';
    }

    public final int hashCode() {
        return (((((((this.\u00d500000 == null ? 0 : this.\u00d500000.hashCode()) * 31 + this.\u00f400000.hashCode()) * 31 + (this.\u00f500000 == null ? 0 : this.\u00f500000.hashCode())) * 31 + Boolean.hashCode(this.\u00d600000)) * 31 + Boolean.hashCode(this.\u00d400000)) * 31 + Boolean.hashCode(this.void)) * 31 + Boolean.hashCode(this.\u00d200000)) * 31 + Boolean.hashCode(this.o00000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof oc)) {
            return false;
        }
        object = (oc)object;
        if (!fc.o00000((Object)this.\u00d500000, (Object)((oc)object).\u00d500000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00f400000, (Object)((oc)object).\u00f400000)) {
            return false;
        }
        if (this.\u00f500000 != ((oc)object).\u00f500000) {
            return false;
        }
        if (this.\u00d600000 != ((oc)object).\u00d600000) {
            return false;
        }
        if (this.\u00d400000 != ((oc)object).\u00d400000) {
            return false;
        }
        if (this.void != ((oc)object).void) {
            return false;
        }
        if (this.\u00d200000 != ((oc)object).\u00d200000) {
            return false;
        }
        return this.o00000 == ((oc)object).o00000;
    }

    public static final /* synthetic */ oc int() {
        return Object;
    }
}

