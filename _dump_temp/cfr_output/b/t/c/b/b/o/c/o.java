/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.o.d.fc;
import b.t.c.b.b.d.d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class o {
    private final d \u00d200000;
    private final int super;

    public o(d d2, int n2) {
        this.\u00d200000 = d2;
        this.super = n2;
    }

    public final d \u00d400000() {
        return this.\u00d200000;
    }

    public final int Object() {
        return this.super;
    }

    public final String toString() {
        int n2;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        int n3 = this.super;
        for (n2 = 0; n2 < n3; ++n2) {
            stringBuilder2.append("kotlin/Array<");
        }
        stringBuilder2.append(this.\u00d200000);
        n3 = this.super;
        for (n2 = 0; n2 < n3; ++n2) {
            stringBuilder2.append(">");
        }
        return stringBuilder.toString();
    }

    public final d o00000() {
        return this.\u00d200000;
    }

    public final int \u00d200000() {
        return this.super;
    }

    public final int hashCode() {
        return this.\u00d200000.hashCode() * 31 + Integer.hashCode(this.super);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof o)) {
            return false;
        }
        object = (o)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((o)object).\u00d200000)) {
            return false;
        }
        return this.super == ((o)object).super;
    }
}

