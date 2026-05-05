/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.c;

import b.o.d.fc;
import b.o.d.w;
import b.q.f;
import b.t.c.b.b.d.d;
import b.t.c.b.b.n.b.b.c;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.j$_d;
import b.t.c.b.b.n.b.j$_e;
import b.t.c.b.b.q.d.c.e;
import b.t.c.b.b.q.d.c.n$_b;

public final class n
implements j {
    public static final n$_b \u00d200000 = new n$_b(null);
    private final Class o00000;
    private final c \u00d300000;

    private n(Class clazz, c c2) {
        this.o00000 = clazz;
        this.\u00d300000 = c2;
    }

    public final Class \u00d400000() {
        return this.o00000;
    }

    @Override
    public final c \u00d200000() {
        return this.\u00d300000;
    }

    @Override
    public final String o00000() {
        return f.super(this.o00000.getName(), '.', '/', false, 4, null) + ".class";
    }

    @Override
    public final d Object() {
        return b.t.c.b.b.q.d.b.e.\u00d200000(this.o00000);
    }

    @Override
    public final void o00000(j$_d j$_d, byte[] byArray) {
        e.super.o00000(this.o00000, j$_d);
    }

    @Override
    public final void o00000(j$_e j$_e, byte[] byArray) {
        e.super.Object(this.o00000, j$_e);
    }

    public final boolean equals(Object object) {
        return object instanceof n && fc.o00000((Object)this.o00000, (Object)((n)object).o00000);
    }

    public final int hashCode() {
        return this.o00000.hashCode();
    }

    public final String toString() {
        return this.getClass().getName() + ": " + this.o00000;
    }

    public /* synthetic */ n(Class clazz, c c2, w w2) {
        this(clazz, c2);
    }
}

