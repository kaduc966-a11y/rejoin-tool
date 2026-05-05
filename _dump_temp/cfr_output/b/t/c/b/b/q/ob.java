/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.g.c;
import b.o.d.fc;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.q.db;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.ob$_b$0;
import b.t.c.b.b.q.ob$_b$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ob
implements db {
    private final Collection \u00d500000;

    public ob(Collection collection) {
        this.\u00d500000 = collection;
    }

    @Override
    public final void o00000(k k2, Collection collection) {
        for (Object t2 : (Iterable)this.\u00d500000) {
            if (!fc.o00000((Object)((lc)t2).OOO000(), (Object)k2)) continue;
            collection.add(t2);
        }
    }

    @Override
    public final boolean \u00d200000(k k2) {
        Object object = this.\u00d500000;
        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (!fc.o00000((Object)((lc)object.next()).OOO000(), (Object)k2)) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public final List o00000(k k2) {
        Object object = this.\u00d500000;
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!fc.o00000((Object)((lc)e2).OOO000(), (Object)k2)) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    @Override
    public final Collection o00000(k k2, g g2) {
        return c.\u00d6o0000(c.nullnew(c.\u00f5\u00d30000(mc.\u00d5o0000(this.\u00d500000), ob$_b$0.\u00d3\u00d3\u00d5000), new ob$_b$1(k2)));
    }

    private static final k \u00d200000(lc lc2) {
        return lc2.OOO000();
    }

    private static final boolean \u00d200000(k k2, k k3) {
        return !k3.\u00d600000() && fc.o00000((Object)k3.\u00d300000(), (Object)k2);
    }

    static /* synthetic */ k o00000(lc lc2) {
        return ob.\u00d200000(lc2);
    }

    static /* synthetic */ boolean o00000(k k2, k k3) {
        return ob.\u00d200000(k2, k3);
    }
}

