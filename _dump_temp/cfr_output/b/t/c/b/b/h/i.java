/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.i$_b;
import b.t.c.b.b.q.h;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    public static final i$_b class = new i$_b(null);
    private final i \u00d200000;
    private final h \u00d400000;
    private final List \u00d300000;
    private final Map super;

    private i(i i2, h h2, List list, Map map) {
        this.\u00d200000 = i2;
        this.\u00d400000 = h2;
        this.\u00d300000 = list;
        this.super = map;
    }

    public final h o00000() {
        return this.\u00d400000;
    }

    public final List \u00d200000() {
        return this.\u00d300000;
    }

    public final hc o00000(bc object) {
        if ((object = object.\u00f4OO000()) instanceof b.t.c.b.b.q.i) {
            return (hc)this.super.get(object);
        }
        return null;
    }

    public final boolean o00000(h h2) {
        block3: {
            block2: {
                if (fc.o00000((Object)this.\u00d400000, (Object)h2)) break block2;
                i i2 = this.\u00d200000;
                if (!(i2 != null ? i2.o00000(h2) : false)) break block3;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ i(i i2, h h2, List list, Map map, w w2) {
        this(i2, h2, list, map);
    }
}

