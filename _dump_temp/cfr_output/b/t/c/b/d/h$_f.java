/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.o.d.b;
import b.s.z;
import b.t.c.b.d.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class h$_f
extends h {
    public h$_f(Constructor objectArray) {
        super((Member)objectArray, objectArray.getDeclaringClass(), null, (Type[])((objectArray = (Object[])objectArray.getGenericParameterTypes()).length <= 1 ? new Type[]{} : z.\u00d300000(objectArray, 0, objectArray.length - 1)), null);
    }

    @Override
    public final Object o00000(Object[] objectArray) {
        this.\u00d500000(objectArray);
        Constructor constructor = (Constructor)this.Object();
        b b2 = new b(2);
        b2.\u00d200000(objectArray);
        b2.super((Object)null);
        b b3 = b2;
        return constructor.newInstance(b3.super(new Object[b3.super()]));
    }
}

