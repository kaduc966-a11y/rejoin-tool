/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.fc;
import b.s.ub;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.t;
import b.t.c.b.b.q.i;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m {
    private final t o00000;
    private final Set new;
    private final ib \u00d300000;

    public m(t t2, Set set, ib ib2) {
        this.o00000 = t2;
        this.new = set;
        this.\u00d300000 = ib2;
    }

    public t Object() {
        return this.o00000;
    }

    public Set \u00d200000() {
        return this.new;
    }

    public ib o00000() {
        return this.\u00d300000;
    }

    public m o00000(i i2) {
        t t2;
        Set set;
        Set set2;
        t t3;
        block3: {
            block2: {
                t3 = this.Object();
                set2 = this.\u00d200000();
                if (set2 == null) break block2;
                set = set2;
                t2 = t3;
                Set set3 = ub.\u00d200000(set, (Object)i2);
                t3 = t2;
                set2 = set3;
                if (set3 != null) break block3;
            }
            set2 = ub.super((Object)i2);
        }
        i2 = this.o00000();
        set = set2;
        t2 = t3;
        return new m(t2, set, (ib)i2);
    }

    public boolean equals(Object object) {
        if (!(object instanceof m)) {
            return false;
        }
        return fc.o00000((Object)((m)object).o00000(), (Object)this.o00000()) && ((m)object).Object() == this.Object();
    }

    public int hashCode() {
        ib ib2 = this.o00000();
        int n2 = ib2 != null ? ((Object)ib2).hashCode() : 0;
        return n2 + (31 * n2 + this.Object().hashCode());
    }
}

