/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.d.fc;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.f;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.q.d.b.j;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class n
extends j
implements f {
    private final k \u00d800000;

    public n(k k2) {
        this.\u00d800000 = k2;
    }

    @Override
    public final k StringObject() {
        return this.\u00d800000;
    }

    @Override
    public final Collection o00000(g g2) {
        return mc.\u00d500000();
    }

    @Override
    public final Collection \u00f5\u00d30000() {
        return mc.\u00d500000();
    }

    public final List \u00f8\u00d30000() {
        return mc.\u00d500000();
    }

    @Override
    public final q o00000(k k2) {
        return null;
    }

    @Override
    public final boolean new() {
        return false;
    }

    public final boolean equals(Object object) {
        return object instanceof n && fc.o00000((Object)this.StringObject(), (Object)((n)object).StringObject());
    }

    public final int hashCode() {
        return this.StringObject().hashCode();
    }

    public final String toString() {
        return this.getClass().getName() + ": " + this.StringObject();
    }
}

