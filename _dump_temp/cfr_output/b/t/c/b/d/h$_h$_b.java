/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.o.d.b;
import b.s.z;
import b.t.c.b.d.h$_h;
import b.t.c.b.d.i;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class h$_h$_b
extends h$_h
implements i {
    private final boolean \u00d8O0000;
    private final Object \u00d6O0000;

    public h$_h$_b(Method objectArray, boolean bl, Object object) {
        super((Method)objectArray, false, (Type[])((objectArray = (Object[])objectArray.getGenericParameterTypes()).length <= 1 ? new Type[]{} : z.\u00d300000(objectArray, 1, objectArray.length)), null);
        this.\u00d8O0000 = bl;
        this.\u00d6O0000 = object;
    }

    public final boolean OO0000() {
        return this.\u00d8O0000;
    }

    @Override
    public final Object o00000(Object[] objectArray) {
        this.\u00d500000(objectArray);
        b b2 = new b(2);
        b2.super(this.\u00d6O0000);
        b2.\u00d200000(objectArray);
        b b3 = b2;
        return this.\u00d200000(null, b3.super(new Object[b3.super()]));
    }
}

