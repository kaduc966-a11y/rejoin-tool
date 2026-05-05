/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.n.c.b.d;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.q.d.b.p;
import b.t.c.b.b.q.d.b.z;
import java.lang.annotation.Annotation;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class cb
extends z
implements d {
    private final Annotation return;

    public cb(f f2, Annotation annotation) {
        super(f2, null);
        this.return = annotation;
    }

    @Override
    public final q \u00d800000() {
        return new p(this.return);
    }
}

