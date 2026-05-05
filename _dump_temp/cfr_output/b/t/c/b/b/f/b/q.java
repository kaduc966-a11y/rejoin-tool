/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.t.c.b.b.f.b.b.i;
import b.t.c.b.b.f.b.cb;
import b.t.c.b.b.f.b.p;
import b.t.c.b.b.f.b.t;
import b.t.c.b.b.i.l;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.f;
import b.t.c.b.b.l.d.h;
import b.t.c.b.b.l.d.j;
import b.t.c.b.b.q.wb;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class q {
    private final t \u00d500000;
    private final e \u00d600000;
    private final wb \u00d400000;
    private final d \u00f500000;
    private final h \u00f400000;
    private final j void;
    private final i \u00d200000;
    private final p Object;
    private final cb o00000;

    public q(t t2, e e2, wb wb2, d d2, h h2, j j2, i i2, p p2, List list) {
        this.\u00d500000 = t2;
        this.\u00d600000 = e2;
        this.\u00d400000 = wb2;
        this.\u00f500000 = d2;
        this.\u00f400000 = h2;
        this.void = j2;
        this.\u00d200000 = i2;
        String string = "Deserializer for \"" + this.\u00d400000.\u00d5\u00f80000() + '\"';
        Object object = this.\u00d200000;
        if (object == null || (object = object.class()) == null) {
            object = "[container not found]";
        }
        this.Object = new p(this, p2, list, string, (String)object);
        this.o00000 = new cb(this);
    }

    public final t null() {
        return this.\u00d500000;
    }

    public final e \u00f500000() {
        return this.\u00d600000;
    }

    public final wb \u00d600000() {
        return this.\u00d400000;
    }

    public final d String() {
        return this.\u00f500000;
    }

    public final h \u00d200000() {
        return this.\u00f400000;
    }

    public final j \u00d300000() {
        return this.void;
    }

    public final i \u00f600000() {
        return this.\u00d200000;
    }

    public final p o00000() {
        return this.Object;
    }

    public final cb \u00d800000() {
        return this.o00000;
    }

    public final l \u00d500000() {
        return this.\u00d500000.\u00d500000();
    }

    public final q o00000(wb wb2, List list, e e2, d d2, h h2, j j2) {
        return new q(this.\u00d500000, e2, wb2, d2, f.o00000(j2) ? h2 : this.\u00f400000, j2, this.\u00d200000, this.Object, list);
    }

    public static /* synthetic */ q o00000(q q2, wb wb2, List list, e e2, d d2, h h2, j j2, int n2, Object object) {
        if ((n2 & 4) != 0) {
            e2 = q2.\u00d600000;
        }
        if ((n2 & 8) != 0) {
            d2 = q2.\u00f500000;
        }
        if ((n2 & 0x10) != 0) {
            h2 = q2.\u00f400000;
        }
        if ((n2 & 0x20) != 0) {
            j2 = q2.void;
        }
        return q2.o00000(wb2, list, e2, d2, h2, j2);
    }
}

