/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.o.d.w;
import b.s.mc;
import b.s.y;
import b.t.bb;
import b.t.c.b.c.g;
import b.t.c.b.c.j;
import b.t.c.b.c.l;
import b.t.c.b.c.n;
import b.t.u;
import b.t.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class j$_b {
    private j$_b() {
    }

    public final j o00000() {
        return j.o00000();
    }

    public final j o00000(u u2) {
        Object object = l.\u00d800000;
        b.t.c.b.b.h.c.g g2 = ((l)object).\u00d500000((n)u2);
        int n2 = ((l)object).\u00d400000(g2);
        ArrayList<bb> arrayList = new ArrayList<bb>(n2);
        int n3 = 0;
        while (n3 < n2) {
            int n4 = n3++;
            ArrayList<bb> arrayList2 = arrayList;
            arrayList2.add((bb)((Object)((l)object).o00000(g2, n4)));
        }
        object = arrayList;
        if (!((Collection)object).isEmpty()) {
            return new j(y.o00000(mc.\u00d300000((Iterable)object, (Iterable)u2.\u00f5\u00f60000())));
        }
        return this.o00000();
    }

    public final j o00000(z object, List list, boolean bl) {
        object = g.\u00d300000((z)object);
        object = bl ? mc.new((Iterable)object, 1) : object;
        return new j(y.o00000(mc.\u00d300000((Iterable)object, (Iterable)list)));
    }

    public /* synthetic */ j$_b(w w2) {
        this();
    }
}

