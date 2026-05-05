/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.dc;
import b.o.e.g;
import b.r;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.o.e.b$_b;
import b.t.c.b.b.o.e.e$_b$0;
import b.t.c.b.b.o.e.e$_b$1;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.nb;
import b.t.c.b.b.q.rb;
import b.t.c.b.b.q.wb;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e
implements f {
    private final f OO0000;
    private final dc float;
    private final kc oO0000;
    private Map \u00f500000;
    private final dc \u00f600000;

    public e(f object, kc kc2) {
        this.OO0000 = object;
        object = kc2;
        this.float = r.o00000(new e$_b$0((kc)object));
        this.oO0000 = b.t.c.b.b.o.d.b.e.o00000(kc2.new(), false, 1, null).\u00d400000();
        object = this;
        this.\u00f600000 = r.o00000(new e$_b$1((e)object));
    }

    private final Collection \u00d800000() {
        return (Collection)this.\u00f600000.\u00d200000();
    }

    private final wb super(wb object) {
        Object object2;
        wb wb2;
        Map map;
        Object v2;
        if (this.oO0000.o00000()) {
            return object;
        }
        if (this.\u00f500000 == null) {
            this.\u00f500000 = new HashMap();
        }
        if ((v2 = (map = this.\u00f500000).get(wb2 = object)) == null) {
            nb nb2;
            if (object instanceof rb) {
                nb2 = ((rb)object).o00000(this.oO0000);
                if (nb2 == null) {
                    object = "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + object + " substitution fails";
                    throw new AssertionError(object);
                }
            } else {
                throw new IllegalStateException("Unknown descriptor in scope: ".concat(String.valueOf(object)).toString());
            }
            object = nb2;
            map.put(wb2, object);
            object2 = object;
        } else {
            object2 = v2;
        }
        return (wb)object2;
    }

    private final Collection super(Collection object) {
        if (this.oO0000.o00000()) {
            return object;
        }
        if (object.isEmpty()) {
            return object;
        }
        LinkedHashSet linkedHashSet = b.t.c.b.b.m.e.\u00d300000(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            wb wb2 = (wb)object.next();
            wb2 = this.super(wb2);
            linkedHashSet.add(wb2);
        }
        return linkedHashSet;
    }

    @Override
    public final Collection \u00d400000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        e e3 = this;
        return e3.super(e3.OO0000.\u00d400000(f2, e2));
    }

    @Override
    public final kb \u00d200000(b.t.c.b.b.d.f object, b.t.c.b.b.j.b.e e2) {
        kb kb2 = this.OO0000.\u00d200000((b.t.c.b.b.d.f)object, e2);
        if (kb2 != null) {
            object = kb2;
            return (kb)this.super((wb)object);
        }
        return null;
    }

    @Override
    public final Collection \u00d300000(b.t.c.b.b.d.f f2, b.t.c.b.b.j.b.e e2) {
        e e3 = this;
        return e3.super(e3.OO0000.\u00d300000(f2, e2));
    }

    @Override
    public final Collection super(j j2, g g2) {
        return this.\u00d800000();
    }

    @Override
    public final Set super() {
        return this.OO0000.super();
    }

    @Override
    public final Set \u00d300000() {
        return this.OO0000.\u00d300000();
    }

    @Override
    public final Set \u00d200000() {
        return this.OO0000.\u00d200000();
    }

    private static final kc \u00d200000(kc kc2) {
        return kc2.new().\u00d400000();
    }

    private static final Collection super(e e2) {
        e e3 = e2;
        return e3.super(b$_b.o00000(e3.OO0000, null, null, 3, null));
    }

    static /* synthetic */ kc super(kc kc2) {
        return e.\u00d200000(kc2);
    }

    static /* synthetic */ Collection \u00d200000(e e2) {
        return e.super(e2);
    }
}

