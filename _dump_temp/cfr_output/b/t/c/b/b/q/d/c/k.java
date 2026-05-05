/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.c;

import b.t.c.b.b.d.d;
import b.t.c.b.b.n.c.b.b;
import b.t.c.b.b.n.c.s;
import b.t.c.b.b.n.c.s$_b;
import b.t.c.b.b.q.d.b.n;
import b.t.c.b.b.q.d.b.v;
import b.t.c.b.b.q.d.c.f;
import java.util.Set;

public final class k
implements s {
    private final ClassLoader o00000;

    public k(ClassLoader classLoader) {
        this.o00000 = classLoader;
    }

    @Override
    public final b o00000(s$_b object) {
        object = ((s$_b)object).o00000();
        b.t.c.b.b.d.k k2 = ((d)object).\u00d800000();
        object = b.q.f.super(((d)object).\u00d400000().super(), '.', '$', false, 4, null);
        object = k2.\u00d600000() ? object : k2.super() + '.' + (String)object;
        if ((object = f.super(this.o00000, (String)object)) != null) {
            return new v((Class)object);
        }
        return null;
    }

    @Override
    public final b.t.c.b.b.n.c.b.f o00000(b.t.c.b.b.d.k k2, boolean bl) {
        return new n(k2);
    }

    @Override
    public final Set o00000(b.t.c.b.b.d.k k2) {
        return null;
    }
}

