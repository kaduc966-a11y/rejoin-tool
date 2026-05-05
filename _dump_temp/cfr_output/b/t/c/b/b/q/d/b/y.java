/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.n.c.b.n;
import b.t.c.b.b.q.d.b.z;
import java.util.ArrayList;
import java.util.List;

public final class y
extends z
implements n {
    private final Object[] \u00d500000;

    public y(f f2, Object[] objectArray) {
        super(f2, null);
        this.\u00d500000 = objectArray;
    }

    @Override
    public final List \u00d600000() {
        Object object = this.\u00d500000;
        Object[] objectArray = this.\u00d500000;
        object = new ArrayList(((Object[])object).length);
        for (Object object2 : objectArray) {
            Object object3 = object;
            object3.add(z.o00000.super(object2, null));
        }
        return (List)object;
    }
}

