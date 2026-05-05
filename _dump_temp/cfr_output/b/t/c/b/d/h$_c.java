/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.o.d.b;
import b.t.c.b.d.h;
import b.t.c.b.d.i;
import java.lang.reflect.Constructor;

public final class h$_c
extends h
implements i {
    private final Object oO0000;

    public h$_c(Constructor constructor, Object object) {
        super(constructor, constructor.getDeclaringClass(), null, constructor.getGenericParameterTypes(), null);
        this.oO0000 = object;
    }

    @Override
    public final Object o00000(Object[] objectArray) {
        this.\u00d500000(objectArray);
        Constructor constructor = (Constructor)this.Object();
        b b2 = new b(2);
        b2.super(this.oO0000);
        b2.\u00d200000(objectArray);
        b b3 = b2;
        return constructor.newInstance(b3.super(new Object[b3.super()]));
    }
}

