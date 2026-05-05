/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.g.b.b;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.e.d;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d$_c {
    private d$_c() {
    }

    public final f super(String string, Collection object) {
        Object object2;
        object = object2 = (Iterable)object;
        object2 = new ArrayList(mc.o00000((Iterable)object2, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object3 = object.next();
            object3 = (rc)object3;
            Iterable iterable = object2;
            iterable.add(((rc)object3).\u00f4\u00d6\u00d2000());
        }
        object = b.o00000((List)object2);
        object2 = m.o00000.super(string, (List)object);
        if (((b.t.c.b.b.m.d)object).size() <= 1) {
            return object2;
        }
        return new d(string, (f)object2, null);
    }

    public /* synthetic */ d$_c(w w2) {
        this();
    }
}

