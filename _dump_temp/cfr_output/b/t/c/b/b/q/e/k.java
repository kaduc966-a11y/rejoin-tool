/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.e;

import b.g.c;
import b.g.n;
import b.s.mc;
import b.s.z;
import b.t.c.b.b.q.e.k$_b$0;
import b.t.c.b.b.q.e.k$_b$1;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.e.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k
implements o {
    private final List \u00d8\u00d2\u00f6000;

    public k(List list) {
        this.\u00d8\u00d2\u00f6000 = list;
    }

    public k(o ... oArray) {
        this(z.thisnew(oArray));
    }

    @Override
    public final boolean \u00d5\u00f4\u00d3000() {
        Object object = this.\u00d8\u00d2\u00f6000;
        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (((o)object.next()).\u00d5\u00f4\u00d3000()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean \u00d300000(b.t.c.b.b.d.k k2) {
        Iterator iterator = mc.\u00d5o0000(this.\u00d8\u00d2\u00f6000).o00000();
        while (iterator.hasNext()) {
            if (!((o)iterator.next()).\u00d300000(k2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public final l \u00d400000(b.t.c.b.b.d.k k2) {
        return (l)c.\u00d6\u00d30000(c.oo0000(mc.\u00d5o0000(this.\u00d8\u00d2\u00f6000), new k$_b$0(k2)));
    }

    public final Iterator iterator() {
        return c.\u00d5\u00d30000(mc.\u00d5o0000(this.\u00d8\u00d2\u00f6000), k$_b$1.\u00d8\u00d2\u00d5000).o00000();
    }

    private static final l o00000(b.t.c.b.b.d.k k2, o o2) {
        return o2.\u00d400000(k2);
    }

    private static final n new(o o2) {
        return mc.\u00d5o0000(o2);
    }

    static /* synthetic */ l new(b.t.c.b.b.d.k k2, o o2) {
        return k.o00000(k2, o2);
    }

    static /* synthetic */ n o00000(o o2) {
        return k.new(o2);
    }
}

