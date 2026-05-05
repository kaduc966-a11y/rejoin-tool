/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.e.bb;
import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.f.b.g;
import b.t.c.b.b.f.b.u;
import b.t.c.b.b.f.b.y;
import b.t.c.b.b.l.b$_d;
import b.t.c.b.b.l.b$_e;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.j;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
implements u {
    private final e \u00d800000;
    private final j \u00d500000;
    private final b.o.e.g \u00d400000;
    private final Map return;

    public c(b$_e iterator, e e2, j j2, b.o.e.g object) {
        this.\u00d800000 = e2;
        this.\u00d500000 = j2;
        this.\u00d400000 = object;
        iterator = ((b$_e)((Object)iterator)).\u00f8\u00d5\u00d2000();
        c c2 = this;
        int n2 = bb.\u00d200000(b.s.y.\u00d200000(mc.o00000((Iterable)((Object)iterator), 10)), 16);
        Map map = new LinkedHashMap(n2);
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            j2 = iterator.next();
            object = (b$_d)((Object)j2);
            Map map2 = map;
            map2.put(y.super(this.\u00d800000, ((b$_d)object).\u00d6o\u00d2000()), j2);
        }
        c2.return = map;
    }

    public final Collection o00000() {
        return this.return.keySet();
    }

    @Override
    public final g o00000(d d2) {
        b$_d b$_d = (b$_d)this.return.get(d2);
        if (b$_d == null) {
            return null;
        }
        b$_d b$_d2 = b$_d;
        return new g(this.\u00d800000, b$_d2, this.\u00d500000, (b.t.c.b.b.q.g)this.\u00d400000.\u00f800000(d2));
    }
}

