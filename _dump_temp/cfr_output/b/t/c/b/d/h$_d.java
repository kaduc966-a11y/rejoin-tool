/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.i;
import b.o.d.w;
import b.s.z;
import b.t.c.b.d.h;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public abstract class h$_d
extends h {
    private final boolean \u00d2O0000;

    private h$_d(Field field, boolean bl, boolean bl2) {
        Type[] typeArray = new Type[1];
        Type[] typeArray2 = typeArray;
        typeArray[0] = field.getGenericType();
        super(field, Void.TYPE, bl2 ? field.getDeclaringClass() : null, typeArray2, null);
        this.\u00d2O0000 = bl;
    }

    @Override
    public void \u00d500000(Object[] objectArray) {
        super.\u00d500000(objectArray);
        if (this.\u00d2O0000 && z.\u00d6\u00d20000(objectArray) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }

    @Override
    public Object o00000(Object[] objectArray) {
        ((h)this).\u00d500000(objectArray);
        ((Field)this.Object()).set(this.float() != null ? z.\u00f8O0000(objectArray) : null, z.\u00d6\u00d20000(objectArray));
        return i.o00000;
    }

    public /* synthetic */ h$_d(Field field, boolean bl, boolean bl2, w w2) {
        this(field, bl, bl2);
    }
}

