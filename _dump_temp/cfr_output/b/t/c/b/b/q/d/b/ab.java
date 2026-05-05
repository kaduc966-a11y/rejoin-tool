/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.d.fc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.n.c.b.r;
import b.t.c.b.b.q.d.b.ab$_b;
import java.lang.reflect.Type;

public abstract class ab
implements r {
    public static final ab$_b oO0000 = new ab$_b(null);

    protected abstract Type newString();

    public boolean equals(Object object) {
        return object instanceof ab && fc.o00000((Object)this.newString(), (Object)((ab)object).newString());
    }

    public int hashCode() {
        return this.newString().hashCode();
    }

    public String toString() {
        return this.getClass().getName() + ": " + this.newString();
    }

    @Override
    public q o00000(k k2) {
        Object v1;
        block1: {
            for (Object t2 : (Iterable)this.\u00d300000()) {
                d d2 = ((q)t2).\u00d4\u00d40000();
                if (!fc.o00000((Object)(d2 != null ? d2.\u00f400000() : null), (Object)k2)) continue;
                v1 = t2;
                break block1;
            }
            v1 = null;
        }
        return v1;
    }
}

