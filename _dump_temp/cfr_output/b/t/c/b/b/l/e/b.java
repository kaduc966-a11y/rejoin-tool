/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.e;

import b.l.o;
import b.qb;
import b.t.c.b.b.l.b$_e;
import b.t.c.b.b.l.e.c;
import b.t.c.b.b.l.e.d;
import b.t.c.b.b.p.s;
import b.yc;
import java.io.Closeable;
import java.io.InputStream;

public final class b {
    public static final qb o00000(InputStream closeable) {
        Object object;
        closeable = closeable;
        Throwable throwable = null;
        try {
            b$_e b$_e;
            object = closeable;
            d d2 = d.return.o00000((InputStream)object);
            if (d2.String()) {
                Closeable closeable2 = object;
                object = s.\u00d200000();
                s s2 = object;
                Closeable closeable3 = closeable2;
                c.super(s2);
                b$_e = b$_e.\u00d200000(closeable3, (s)object);
            } else {
                b$_e = null;
            }
            object = yc.o00000(b$_e, d2);
        }
        catch (Throwable throwable2) {
            try {
                Throwable throwable3 = throwable2;
                throwable = throwable2;
                throw throwable3;
            }
            catch (Throwable throwable4) {
                o.o00000(closeable, throwable);
                throw throwable4;
            }
        }
        o.o00000(closeable, null);
        return object;
    }
}

