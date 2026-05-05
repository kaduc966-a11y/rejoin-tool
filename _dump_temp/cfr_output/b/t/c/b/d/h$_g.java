/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.t.c.b.d.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

public final class h$_g
extends h {
    public h$_g(Constructor constructor) {
        Class clazz = constructor.getDeclaringClass();
        Type type = constructor.getDeclaringClass();
        Member member = constructor;
        h$_g h$_g = this;
        Class<?> clazz2 = clazz.getDeclaringClass();
        clazz = clazz2 != null && !Modifier.isStatic(clazz.getModifiers()) ? clazz2 : null;
        super(member, type, clazz, constructor.getGenericParameterTypes(), null);
    }

    @Override
    public final Object o00000(Object[] objectArray) {
        this.\u00d500000(objectArray);
        return ((Constructor)this.Object()).newInstance(Arrays.copyOf(objectArray, objectArray.length));
    }
}

