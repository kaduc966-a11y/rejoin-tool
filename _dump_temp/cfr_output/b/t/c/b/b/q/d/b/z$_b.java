/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.d.w;
import b.t.c.b.b.d.f;
import b.t.c.b.b.q.d.b.cb;
import b.t.c.b.b.q.d.b.d;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.b.h;
import b.t.c.b.b.q.d.b.u;
import b.t.c.b.b.q.d.b.y;
import b.t.c.b.b.q.d.b.z;
import java.lang.annotation.Annotation;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class z$_b {
    private z$_b() {
    }

    public final z super(Object object, f f2) {
        if (e.\u00d600000(object.getClass())) {
            return new h(f2, (Enum)object);
        }
        if (object instanceof Annotation) {
            return new cb(f2, (Annotation)object);
        }
        if (object instanceof Object[]) {
            return new y(f2, (Object[])object);
        }
        if (object instanceof Class) {
            return new d(f2, (Class)object);
        }
        return new u(f2, object);
    }

    public /* synthetic */ z$_b(w w2) {
        this();
    }
}

