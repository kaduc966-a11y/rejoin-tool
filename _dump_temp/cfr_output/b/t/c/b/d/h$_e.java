/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.o.d.w;
import b.s.z;
import b.t.c.b.d.h;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public abstract class h$_e
extends h {
    private h$_e(Field field, boolean bl) {
        super(field, field.getGenericType(), bl ? field.getDeclaringClass() : null, new Type[0], null);
    }

    @Override
    public Object o00000(Object[] objectArray) {
        this.\u00d500000(objectArray);
        return ((Field)this.Object()).get(this.float() != null ? z.\u00f8O0000(objectArray) : null);
    }

    public /* synthetic */ h$_e(Field field, boolean bl, w w2) {
        this(field, bl);
    }
}

