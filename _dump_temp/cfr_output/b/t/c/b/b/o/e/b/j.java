/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e.b;

import b.o.d.fc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.o.e.b.d;
import b.t.c.b.b.o.e.b.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class j
implements f,
d {
    private final b.t.c.b.b.q.ib int;
    private final j \u00f400000;
    private final b.t.c.b.b.q.ib \u00f600000;

    public j(b.t.c.b.b.q.ib ib2, j j2) {
        this.int = ib2;
        j j3 = j2;
        if (j3 == null) {
            j3 = this;
        }
        this.\u00f400000 = j3;
        this.\u00f600000 = this.int;
    }

    @Override
    public final b.t.c.b.b.q.ib \u00d200000() {
        return this.int;
    }

    public ib \u00d500000() {
        return this.int.nullint();
    }

    public boolean equals(Object object) {
        j j2 = object instanceof j ? (j)object : null;
        return fc.o00000((Object)this.int, (Object)(j2 != null ? j2.int : null));
    }

    public int hashCode() {
        return this.int.hashCode();
    }

    public String toString() {
        return "Class{" + this.\u00d500000() + '}';
    }
}

