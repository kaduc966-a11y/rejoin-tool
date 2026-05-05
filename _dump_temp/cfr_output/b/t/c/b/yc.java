/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.e.g;
import b.t.c.b.ed;
import b.t.c.b.vb;
import java.lang.ref.SoftReference;

final class yc
extends vb {
    private volatile ed \u00d300000;

    public yc(g g2) {
        this.\u00d300000 = new ed(g2);
    }

    @Override
    public final Object o00000(Class clazz) {
        ed ed2 = this.\u00d300000;
        Object t2 = ((SoftReference)ed2.get(clazz)).get();
        if (t2 != null) {
            return t2;
        }
        ed2.remove(clazz);
        Object t3 = ((SoftReference)ed2.get(clazz)).get();
        if (t3 != null) {
            return t3;
        }
        return ed2.super.\u00f800000(clazz);
    }

    @Override
    public final void o00000() {
        this.\u00d300000 = this.\u00d300000.o00000();
    }
}

