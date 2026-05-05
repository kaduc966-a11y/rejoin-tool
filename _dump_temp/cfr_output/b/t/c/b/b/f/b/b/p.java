/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.o.d.fc;
import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.f.b.b.p$_b;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p {
    public static final p$_b \u00d400000 = new p$_b(null);
    private final boolean \u00d300000;
    private final List new;
    private static final p o00000 = new p(false, null, 2, null);

    public p(boolean bl, List list) {
        this.\u00d300000 = bl;
        this.new = list;
    }

    public /* synthetic */ p(boolean bl, List list, int n2, w w2) {
        if ((n2 & 2) != 0) {
            list = mc.\u00d500000();
        }
        this(bl, list);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.\u00d300000 + ", poisoningFeatures=" + this.new + ')';
    }

    public final int hashCode() {
        return Boolean.hashCode(this.\u00d300000) * 31 + ((Object)this.new).hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        object = (p)object;
        if (this.\u00d300000 != ((p)object).\u00d300000) {
            return false;
        }
        return fc.o00000((Object)this.new, (Object)((p)object).new);
    }

    public static final /* synthetic */ p o00000() {
        return o00000;
    }
}

