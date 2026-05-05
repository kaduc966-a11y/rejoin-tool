/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.d;
import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.b.n.c.cb;
import b.t.c.b.b.n.c.gb$_b;

public final class gb {
    public static final gb$_b \u00d500000 = new gb$_b(null);
    private final cb Object;
    private final d \u00d200000;
    private final cb \u00d400000;
    private static final gb o00000 = new gb(cb.super, null, null, 6, null);

    public gb(cb cb2, d d2, cb cb3) {
        this.Object = cb2;
        this.\u00d200000 = d2;
        this.\u00d400000 = cb3;
    }

    public /* synthetic */ gb(cb cb2, d d2, cb cb3, int n2, w w2) {
        if ((n2 & 2) != 0) {
            d2 = new d(1, 0);
        }
        if ((n2 & 4) != 0) {
            cb3 = cb2;
        }
        this(cb2, d2, cb3);
    }

    public final cb o00000() {
        return this.Object;
    }

    public final d String() {
        return this.\u00d200000;
    }

    public final cb \u00d300000() {
        return this.\u00d400000;
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + (Object)((Object)this.Object) + ", sinceVersion=" + this.\u00d200000 + ", reportLevelAfter=" + (Object)((Object)this.\u00d400000) + ')';
    }

    public final int hashCode() {
        return (this.Object.hashCode() * 31 + (this.\u00d200000 == null ? 0 : this.\u00d200000.hashCode())) * 31 + this.\u00d400000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof gb)) {
            return false;
        }
        object = (gb)object;
        if (this.Object != ((gb)object).Object) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d200000, (Object)((gb)object).\u00d200000)) {
            return false;
        }
        return this.\u00d400000 == ((gb)object).\u00d400000;
    }

    public static final /* synthetic */ gb \u00d200000() {
        return o00000;
    }
}

