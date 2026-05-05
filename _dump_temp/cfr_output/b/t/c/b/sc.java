/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.t.c.b.ab;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.c.h;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class sc {
    private static final ConcurrentMap o00000 = new ConcurrentHashMap();

    public static final h o00000(Class object) {
        ab ab2 = new ab((ClassLoader)(object = e.\u00d800000((Class)object)));
        WeakReference<Object> weakReference = (WeakReference<Object>)o00000.get(ab2);
        if (weakReference != null) {
            h h2 = (h)weakReference.get();
            if (h2 != null) {
                return h2;
            }
            o00000.remove(ab2, weakReference);
        }
        object = h.\u00d300000.super((ClassLoader)object);
        try {
            while (true) {
                if (o00000.putIfAbsent(ab2, new WeakReference<Object>(object)) == null) {
                    return object;
                }
                h h3 = (h)weakReference.get();
                if (h3 != null) {
                    object = h3;
                    return object;
                }
                o00000.remove(ab2, weakReference);
            }
        }
        finally {
            ab2.o00000(null);
        }
    }

    public static final void o00000() {
        o00000.clear();
    }
}

