/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.c;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.t.c.b.b.f.b.c.c;
import b.t.c.b.b.f.b.c.e;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.x;
import b.t.c.b.b.n.b.x$_b;
import b.t.c.b.b.n.b.x$_b$_c;
import b.t.c.b.b.q.d.c.b;
import b.t.c.b.b.q.d.c.f;
import b.t.c.b.b.q.d.c.n;
import java.io.InputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
implements x {
    private final ClassLoader o00000;
    private final c \u00d200000;

    public m(ClassLoader classLoader) {
        this.o00000 = classLoader;
        this.\u00d200000 = new c();
    }

    private final x$_b super(String object) {
        x$_b$_c x$_b$_c;
        Object object2 = f.super(this.o00000, (String)object);
        if (object2 != null && (object2 = n.\u00d200000.super((Class)(object = object2))) != null) {
            object = (j)object2;
            x$_b$_c = new x$_b$_c((j)object, null, 2, null);
        } else {
            x$_b$_c = null;
        }
        return x$_b$_c;
    }

    @Override
    public final x$_b super(d d2, b.t.c.b.b.l.d.c c2) {
        return this.super(b.\u00d200000(d2));
    }

    @Override
    public final x$_b super(b.t.c.b.b.n.c.b.b b2, b.t.c.b.b.l.d.c c2) {
        Object object = b2.Oo0000();
        if (object == null || (object = ((k)object).super()) == null) {
            return null;
        }
        return this.super((String)object);
    }

    @Override
    public final InputStream super(k k2) {
        if (!k2.super(b.t.c.b.b.b.d.while)) {
            return null;
        }
        return this.\u00d200000.o00000(e.\u00d6O0000.Object(k2));
    }
}

