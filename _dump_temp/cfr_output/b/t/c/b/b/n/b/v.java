/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.m;
import b.o.d.fc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.f.b.g;
import b.t.c.b.b.f.b.u;
import b.t.c.b.b.n.b.f;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.p;
import b.t.c.b.b.n.b.x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class v
implements u {
    private final x \u00d300000;
    private final p new;

    public v(x x2, p p2) {
        this.\u00d300000 = x2;
        this.new = p2;
    }

    @Override
    public final g o00000(d object) {
        j j2 = f.o00000(this.\u00d300000, (d)object, this.new.\u00d400000().\u00d300000().\u00d500000());
        if (j2 == null) {
            return null;
        }
        j j3 = j2;
        boolean bl = fc.o00000((Object)j2.Object(), object);
        if (m.new && !bl) {
            object = "Class with incorrect id found: expected " + object + ", actual " + j3.Object();
            throw new AssertionError(object);
        }
        return this.new.\u00d400000(j3);
    }
}

