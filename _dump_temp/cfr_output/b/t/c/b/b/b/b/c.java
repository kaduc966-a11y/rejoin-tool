/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.b;

import b.s.mc;
import b.s.ub;
import b.t.c.b.b.b.b.b;
import b.t.c.b.b.b.b.e;
import b.t.c.b.b.b.b.e$_b;
import b.t.c.b.b.b.b.g;
import b.t.c.b.b.b.f;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.lc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class c
implements b.t.c.b.b.q.f.e {
    private final l \u00f600000;
    private final bc \u00f500000;

    public c(l l2, bc bc2) {
        this.\u00f600000 = l2;
        this.\u00f500000 = bc2;
    }

    @Override
    public final boolean o00000(k k2, b.t.c.b.b.d.f object) {
        return (b.q.f.\u00d300000((String)(object = ((b.t.c.b.b.d.f)object).\u00d400000()), "Function", false, 2, null) || b.q.f.\u00d300000((String)object, "KFunction", false, 2, null) || b.q.f.\u00d300000((String)object, "SuspendFunction", false, 2, null) || b.q.f.\u00d300000((String)object, "KSuspendFunction", false, 2, null)) && e.\u00d400000.super().o00000(k2, (String)object) != null;
    }

    @Override
    public final ib o00000(d object) {
        if (((d)object).return() || ((d)object).new()) {
            return null;
        }
        Object object2 = ((d)object).\u00d400000().super();
        if (!b.q.f.\u00d300000((CharSequence)object2, (CharSequence)"Function", false, 2, null)) {
            return null;
        }
        object = ((d)object).\u00d800000();
        e$_b e$_b = e.\u00d400000.super().o00000((k)object, (String)object2);
        if (e$_b == null) {
            return null;
        }
        object2 = e$_b;
        b b2 = e$_b.o00000();
        int n2 = ((e$_b)object2).new();
        Object object3 = this.\u00f500000.new((k)object).o0O000();
        object = new ArrayList();
        Object object4 = object3.iterator();
        while (object4.hasNext()) {
            object3 = object4.next();
            if (!(object3 instanceof f)) continue;
            object.add(object3);
        }
        object = (List)object;
        object3 = (Iterable)object;
        object4 = new ArrayList();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            Object e2 = object3.next();
            if (!(e2 instanceof b.t.c.b.b.b.e)) continue;
            object4.add(e2);
        }
        b.t.c.b.b.b.e e3 = (b.t.c.b.b.b.e)mc.\u00f5O0000((List)object4);
        object = e3 != null ? (f)e3 : (f)mc.Oo0000((List)object);
        return new g(this.\u00f600000, (lc)object, b2, n2);
    }

    @Override
    public final Collection o00000(k k2) {
        return ub.\u00d300000();
    }
}

