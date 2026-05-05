/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.o.d.fc;
import b.t.c.b.b.h.rc;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f$_c {
    private final rc \u00d200000;
    private final rc \u00d300000;
    private final List \u00d500000;
    private final List String;
    private final boolean o00000;
    private final List \u00d600000;

    public f$_c(rc rc2, rc rc3, List list, List list2, boolean bl, List list3) {
        this.\u00d200000 = rc2;
        this.\u00d300000 = rc3;
        this.\u00d500000 = list;
        this.String = list2;
        this.o00000 = bl;
        this.\u00d600000 = list3;
    }

    public final rc return() {
        return this.\u00d200000;
    }

    public final rc \u00d500000() {
        return this.\u00d300000;
    }

    public final List new() {
        return this.\u00d500000;
    }

    public final List \u00d300000() {
        return this.String;
    }

    public final boolean o00000() {
        return this.o00000;
    }

    public final List \u00d400000() {
        return this.\u00d600000;
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.\u00d200000 + ", receiverType=" + this.\u00d300000 + ", valueParameters=" + this.\u00d500000 + ", typeParameters=" + this.String + ", hasStableParameterNames=" + this.o00000 + ", errors=" + this.\u00d600000 + ')';
    }

    public final int hashCode() {
        return ((((this.\u00d200000.hashCode() * 31 + (this.\u00d300000 == null ? 0 : this.\u00d300000.hashCode())) * 31 + ((Object)this.\u00d500000).hashCode()) * 31 + ((Object)this.String).hashCode()) * 31 + Boolean.hashCode(this.o00000)) * 31 + ((Object)this.\u00d600000).hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f$_c)) {
            return false;
        }
        object = (f$_c)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((f$_c)object).\u00d200000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d300000, (Object)((f$_c)object).\u00d300000)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d500000, (Object)((f$_c)object).\u00d500000)) {
            return false;
        }
        if (!fc.o00000((Object)this.String, (Object)((f$_c)object).String)) {
            return false;
        }
        if (this.o00000 != ((f$_c)object).o00000) {
            return false;
        }
        return fc.o00000((Object)this.\u00d600000, (Object)((f$_c)object).\u00d600000);
    }
}

