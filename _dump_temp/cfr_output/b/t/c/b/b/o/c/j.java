/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.o.d.fc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.bc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class j {
    private final Object super;

    public j(Object object) {
        this.super = object;
    }

    public Object o00000() {
        return this.super;
    }

    public abstract rc o00000(bc var1);

    public boolean equals(Object object) {
        block3: {
            block2: {
                if (this == object) break block2;
                j j2 = object instanceof j ? (j)object : null;
                if (!fc.o00000(this.o00000(), j2 != null ? j2.o00000() : null)) break block3;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object object = this.o00000();
        if (object != null) {
            return object.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(this.o00000());
    }
}

