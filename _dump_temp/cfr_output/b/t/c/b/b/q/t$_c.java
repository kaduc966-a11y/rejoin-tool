/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.o.d.fc;
import b.t.c.b.b.d.d;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class t$_c {
    private final d \u00d200000;
    private final List super;

    public t$_c(d d2, List list) {
        this.\u00d200000 = d2;
        this.super = list;
    }

    public final d super() {
        return this.\u00d200000;
    }

    public final List \u00d200000() {
        return this.super;
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.\u00d200000 + ", typeParametersCount=" + this.super + ')';
    }

    public final int hashCode() {
        return this.\u00d200000.hashCode() * 31 + ((Object)this.super).hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof t$_c)) {
            return false;
        }
        object = (t$_c)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((t$_c)object).\u00d200000)) {
            return false;
        }
        return fc.o00000((Object)this.super, (Object)((t$_c)object).super);
    }
}

