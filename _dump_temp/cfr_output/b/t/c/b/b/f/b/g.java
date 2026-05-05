/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.o.d.fc;
import b.t.c.b.b.l.b$_d;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.j;

public final class g {
    private final e Object;
    private final b$_d \u00d400000;
    private final j o00000;
    private final b.t.c.b.b.q.g \u00d200000;

    public g(e e2, b$_d b$_d, j j2, b.t.c.b.b.q.g g2) {
        this.Object = e2;
        this.\u00d400000 = b$_d;
        this.o00000 = j2;
        this.\u00d200000 = g2;
    }

    public final e o00000() {
        return this.Object;
    }

    public final b$_d \u00d200000() {
        return this.\u00d400000;
    }

    public final j String() {
        return this.o00000;
    }

    public final b.t.c.b.b.q.g \u00d300000() {
        return this.\u00d200000;
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.Object + ", classProto=" + this.\u00d400000 + ", metadataVersion=" + this.o00000 + ", sourceElement=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return ((this.Object.hashCode() * 31 + this.\u00d400000.hashCode()) * 31 + this.o00000.hashCode()) * 31 + this.\u00d200000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        if (!fc.o00000((Object)this.Object, (Object)((g)object).Object)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d400000, (Object)((g)object).\u00d400000)) {
            return false;
        }
        if (!fc.o00000((Object)this.o00000, (Object)((g)object).o00000)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d200000, (Object)((g)object).\u00d200000);
    }
}

