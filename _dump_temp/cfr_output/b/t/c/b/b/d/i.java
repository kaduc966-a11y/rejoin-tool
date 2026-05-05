/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

import b.o.d.fc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.i$_b;
import b.t.c.b.b.d.j;
import b.t.c.b.b.d.k;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    public static final i$_b \u00f400000 = new i$_b(null);
    private final k \u00d200000;
    private final k \u00d400000;
    private final f o00000;
    private final d \u00d500000;
    private final k void;
    private static final f \u00d600000 = j.int;
    private static final k Object = k.\u00d400000.super(\u00d600000);

    private i(k k2, k k3, f f2, d d2, k k4) {
        this.\u00d200000 = k2;
        this.\u00d400000 = k3;
        this.o00000 = f2;
        this.\u00d500000 = d2;
        this.void = k4;
    }

    public i(k k2, f f2) {
        this(k2, null, f2, null, null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof i && fc.o00000((Object)this.\u00d200000, (Object)((i)object).\u00d200000) && fc.o00000((Object)this.\u00d400000, (Object)((i)object).\u00d400000) && fc.o00000((Object)this.o00000, (Object)((i)object).o00000);
    }

    public final int hashCode() {
        k k2 = this.\u00d400000;
        return ((527 + this.\u00d200000.hashCode()) * 31 + (k2 != null ? ((Object)k2).hashCode() : 0)) * 31 + this.o00000.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append(b.q.f.super(this.\u00d200000.super(), '.', '/', false, 4, null));
        stringBuilder2.append("/");
        if (this.\u00d400000 != null) {
            stringBuilder2.append(this.\u00d400000);
            stringBuilder2.append(".");
        }
        stringBuilder2.append(this.o00000);
        return stringBuilder.toString();
    }
}

