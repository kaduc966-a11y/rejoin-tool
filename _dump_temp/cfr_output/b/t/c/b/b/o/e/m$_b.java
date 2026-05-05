/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.m.d;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.f$_b;
import b.t.c.b.b.o.e.m;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m$_b {
    private m$_b() {
    }

    public final f super(String string, Iterable object) {
        d d2 = new d();
        object = object.iterator();
        while (object.hasNext()) {
            f f2 = (f)object.next();
            if (f2 == f$_b.\u00f6\u00d30000) continue;
            if (f2 instanceof m) {
                mc.\u00d500000((Collection)d2, (Object[])m.super((m)f2));
                continue;
            }
            d2.add(f2);
        }
        return this.super(string, d2);
    }

    public final f super(String string, List list) {
        switch (list.size()) {
            case 0: {
                return f$_b.\u00f6\u00d30000;
            }
            case 1: {
                return (f)list.get(0);
            }
        }
        return new m(string, ((Collection)list).toArray(new f[0]), null);
    }

    public /* synthetic */ m$_b(w w2) {
        this();
    }
}

