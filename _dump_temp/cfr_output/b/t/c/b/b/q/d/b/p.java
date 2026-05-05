/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.r;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.b.j;
import b.t.c.b.b.q.d.b.v;
import b.t.c.b.b.q.d.b.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p
extends j
implements q {
    private final Annotation null;

    public p(Annotation annotation) {
        this.null = annotation;
    }

    public final Annotation forObject() {
        return this.null;
    }

    @Override
    public final Collection o\u00d40000() {
        Object object = r.\u00d300000(r.o00000(this.null)).getDeclaredMethods();
        Object[] objectArray = object;
        object = new ArrayList(((Object[])object).length);
        for (Object object2 : objectArray) {
            object2 = (Method)object2;
            Object object3 = object;
            object3.add(z.o00000.super(((Method)object2).invoke((Object)this.null, new Object[0]), f.\u00d300000(((Method)object2).getName())));
        }
        return (List)object;
    }

    @Override
    public final d \u00d4\u00d40000() {
        return e.\u00d200000(r.\u00d300000(r.o00000(this.null)));
    }

    public final v \u00d5\u00d40000() {
        return new v(r.\u00d300000(r.o00000(this.null)));
    }

    public final boolean equals(Object object) {
        return object instanceof p && this.null == ((p)object).null;
    }

    public final int hashCode() {
        return System.identityHashCode(this.null);
    }

    public final String toString() {
        return this.getClass().getName() + ": " + this.null;
    }

    @Override
    public final boolean O\u00d40000() {
        return false;
    }

    @Override
    public final boolean \u00d3\u00d40000() {
        return false;
    }
}

