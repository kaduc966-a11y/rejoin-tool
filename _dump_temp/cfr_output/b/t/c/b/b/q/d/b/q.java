/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.e;
import b.t.c.b.b.q.d.b.ab;
import b.t.c.b.b.q.d.b.j;
import b.t.c.b.b.q.d.b.p;
import b.t.c.b.b.q.d.b.s;
import java.lang.annotation.Annotation;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class q
extends j
implements e {
    private final ab \u00f800000;
    private final Annotation[] for;
    private final String \u00f600000;
    private final boolean \u00f500000;

    public q(ab ab2, Annotation[] annotationArray, String string, boolean bl) {
        this.\u00f800000 = ab2;
        this.for = annotationArray;
        this.\u00f600000 = string;
        this.\u00f500000 = bl;
    }

    public final ab \u00f4\u00d40000() {
        return this.\u00f800000;
    }

    @Override
    public final boolean \u00d400000() {
        return this.\u00f500000;
    }

    public final List \u00d8\u00d40000() {
        return s.o00000(this.for);
    }

    public final p \u00d300000(k k2) {
        return s.o00000(this.for, k2);
    }

    @Override
    public final boolean new() {
        return false;
    }

    @Override
    public final f return() {
        String string = this.\u00f600000;
        if (string != null) {
            return f.\u00d200000(string);
        }
        return null;
    }

    public final String toString() {
        return this.getClass().getName() + ": " + (this.\u00d400000() ? "vararg " : "") + this.return() + ": " + this.\u00f4\u00d40000();
    }
}

