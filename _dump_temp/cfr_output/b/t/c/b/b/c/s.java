/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.hb;
import b.t.c.b.b.c.s$_b;

public final class s {
    public static final s$_b String = new s$_b(null);
    private hb \u00d200000;
    private db \u00d300000;
    public static final s o00000 = new s(null, null);

    public s(hb hb2, db db2) {
        this.\u00d200000 = hb2;
        this.\u00d300000 = db2;
    }

    public final hb \u00d400000() {
        return this.\u00d200000;
    }

    public final db \u00d200000() {
        return this.\u00d300000;
    }

    public final hb o00000() {
        return this.\u00d200000;
    }

    public final db Object() {
        return this.\u00d300000;
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + (Object)((Object)this.\u00d200000) + ", type=" + this.\u00d300000 + ')';
    }

    public final int hashCode() {
        return (this.\u00d200000 == null ? 0 : this.\u00d200000.hashCode()) * 31 + (this.\u00d300000 == null ? 0 : this.\u00d300000.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        object = (s)object;
        if (this.\u00d200000 != ((s)object).\u00d200000) {
            return false;
        }
        return fc.o00000((Object)this.\u00d300000, (Object)((s)object).\u00d300000);
    }
}

