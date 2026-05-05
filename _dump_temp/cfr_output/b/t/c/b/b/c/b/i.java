/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.b;

import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.b.e;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    private final b.t.c.b.b.l.d.e \u00d200000;
    private final d \u00d400000;
    private final h void;
    private final boolean \u00f400000;
    private final i \u00d600000;
    private final List Object;
    private final Map o00000;
    private final List \u00d500000;

    public i(b.t.c.b.b.l.d.e e2, d d2, h h2, boolean bl, i i2, List list) {
        this.\u00d200000 = e2;
        this.\u00d400000 = d2;
        this.void = h2;
        this.\u00f400000 = bl;
        this.\u00d600000 = i2;
        this.Object = list;
        this.o00000 = new LinkedHashMap();
        this.\u00d500000 = f.o00000.Object();
    }

    public /* synthetic */ i(b.t.c.b.b.l.d.e e2, d d2, h h2, boolean bl, i i2, List list, int n2, w w2) {
        if ((n2 & 0x10) != 0) {
            i2 = null;
        }
        if ((n2 & 0x20) != 0) {
            list = mc.\u00d500000();
        }
        this(e2, d2, h2, bl, i2, list);
    }

    public final b.t.c.b.b.l.d.e o00000() {
        return this.\u00d200000;
    }

    public final d \u00d400000() {
        return this.\u00d400000;
    }

    public final h new() {
        return this.void;
    }

    public final boolean \u00d500000() {
        return this.\u00f400000;
    }

    public final List \u00d300000() {
        return this.\u00d500000;
    }

    public final String \u00d300000(int n2) {
        return this.\u00d200000.new(n2);
    }

    public final String new(int n2) {
        return e.o00000(this.\u00d200000, n2);
    }

    public final Integer o00000(int n2) {
        Integer n3;
        while ((n3 = (Integer)this.o00000.get(n2)) == null) {
            if (this.\u00d600000 != null) continue;
            n3 = null;
            break;
        }
        return n3;
    }

    public final i o00000(List object) {
        i i2;
        i i3 = this;
        i i4 = i2 = new i(this.\u00d200000, this.\u00d400000, this.void, this.\u00f400000, i3, i3.Object);
        object = object.iterator();
        while (object.hasNext()) {
            b$_b b$_b = (b$_b)object.next();
            i4.o00000.put(b$_b.\u00d6\u00d5\u00d4000(), b$_b.voidfloatnew());
        }
        return i2;
    }
}

