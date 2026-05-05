/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.e;

import b.o.e.g;
import b.t.c.b.b.d.k;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.e.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b
implements o {
    private final o \u00d4\u00d2\u00f6000;
    private final boolean \u00d3\u00d2\u00f6000;
    private final g \u00d5\u00d2\u00f6000;

    public b(o o2, boolean bl, g g2) {
        this.\u00d4\u00d2\u00f6000 = o2;
        this.\u00d3\u00d2\u00f6000 = bl;
        this.\u00d5\u00d2\u00f6000 = g2;
    }

    public b(o o2, g g2) {
        this(o2, false, g2);
    }

    @Override
    public final boolean \u00d300000(k k2) {
        if (((Boolean)this.\u00d5\u00d2\u00f6000.\u00f800000(k2)).booleanValue()) {
            return this.\u00d4\u00d2\u00f6000.\u00d300000(k2);
        }
        return false;
    }

    @Override
    public final l \u00d400000(k k2) {
        if (((Boolean)this.\u00d5\u00d2\u00f6000.\u00f800000(k2)).booleanValue()) {
            return this.\u00d4\u00d2\u00f6000.\u00d400000(k2);
        }
        return null;
    }

    public final Iterator iterator() {
        Object object = this.\u00d4\u00d2\u00f6000;
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            l l2 = (l)e2;
            if (!this.o00000(l2)) continue;
            collection.add(e2);
        }
        return ((List)collection).iterator();
    }

    @Override
    public final boolean \u00d5\u00f4\u00d3000() {
        boolean bl;
        boolean bl2;
        Object object = this.\u00d4\u00d2\u00f6000;
        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                l l2 = (l)object.next();
                if (!this.o00000(l2)) continue;
                bl2 = true;
                break;
            }
        } else {
            bl2 = bl = false;
        }
        if (this.\u00d3\u00d2\u00f6000) {
            return !bl;
        }
        return bl;
    }

    private final boolean o00000(l object) {
        return (object = object.\u00d300000()) != null && (Boolean)this.\u00d5\u00d2\u00f6000.\u00f800000(object) != false;
    }
}

