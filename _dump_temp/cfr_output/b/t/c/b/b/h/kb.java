/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.fc;
import b.t.c.b.b.h.ic;
import b.t.c.b.b.q.e.j;
import b.t.c.b.b.q.e.o;
import b.t.z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class kb
extends ic {
    private final o o00000;

    public kb(o o2) {
        this.o00000 = o2;
    }

    public final o new() {
        return this.o00000;
    }

    public final kb o00000(kb kb2) {
        if (fc.o00000((Object)kb2, (Object)this)) {
            return this;
        }
        return null;
    }

    public final kb new(kb kb2) {
        if (kb2 == null) {
            return this;
        }
        return new kb(j.o00000(this.o00000, kb2.o00000));
    }

    @Override
    public final z o00000() {
        return b.o.d.z.\u00d200000(kb.class);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof kb)) {
            return false;
        }
        return fc.o00000((Object)((kb)object).o00000, (Object)this.o00000);
    }

    public final int hashCode() {
        return this.o00000.hashCode();
    }
}

