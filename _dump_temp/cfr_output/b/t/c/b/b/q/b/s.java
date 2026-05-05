/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.o.e.g;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import b.t.c.b.b.m.e;
import b.t.c.b.b.o.e.g$_b;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.cc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class s
extends l {
    private final bc \u00d6\u00d40000;
    private final k \u00d5\u00d40000;

    public s(bc bc2, k k2) {
        this.\u00d6\u00d40000 = bc2;
        this.\u00d5\u00d40000 = k2;
    }

    protected final cc int(f object) {
        if (((f)object).super()) {
            return null;
        }
        if ((object = this.\u00d6\u00d40000.new(this.\u00d5\u00d40000.\u00d200000((f)object))).\u00f5\u00f80000()) {
            return null;
        }
        return object;
    }

    @Override
    public Collection super(j iterator, g g2) {
        if (!((j)((Object)iterator)).new(j.\u00d6O0000.\u00d800000())) {
            return mc.\u00d500000();
        }
        if (this.\u00d5\u00d40000.\u00d600000() && ((j)((Object)iterator)).new().contains(g$_b.\u00d300000)) {
            return mc.\u00d500000();
        }
        iterator = this.\u00d6\u00d40000.o00000(this.\u00d5\u00d40000, g2);
        ArrayList arrayList = new ArrayList(iterator.size());
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            f f2 = ((k)iterator.next()).\u00d400000();
            if (!((Boolean)g2.\u00f800000(f2)).booleanValue()) continue;
            e.o00000(arrayList, this.int(f2));
        }
        return arrayList;
    }

    @Override
    public Set \u00d200000() {
        return ub.\u00d300000();
    }

    public String toString() {
        return "subpackages of " + this.\u00d5\u00d40000 + " from " + this.\u00d6\u00d40000;
    }
}

