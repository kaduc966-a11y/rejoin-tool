/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.i;
import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.d.h;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

public abstract class h$_h
extends h {
    private final boolean \u00d5O0000;

    private h$_h(Method method, boolean bl, Type[] typeArray) {
        super(method, method.getGenericReturnType(), bl ? method.getDeclaringClass() : null, typeArray, null);
        this.\u00d5O0000 = fc.o00000((Object)this.\u00d400000(), Void.TYPE);
    }

    public /* synthetic */ h$_h(Method method, boolean bl, Type[] typeArray, int n2, w w2) {
        if ((n2 & 2) != 0) {
            boolean bl2 = bl = !Modifier.isStatic(method.getModifiers());
        }
        if ((n2 & 4) != 0) {
            typeArray = method.getGenericParameterTypes();
        }
        this(method, bl, typeArray, null);
    }

    protected final Object \u00d200000(Object object, Object[] objectArray) {
        object = ((Method)this.Object()).invoke(object, Arrays.copyOf(objectArray, objectArray.length));
        if (this.\u00d5O0000) {
            return i.o00000;
        }
        return object;
    }

    public /* synthetic */ h$_h(Method method, boolean bl, Type[] typeArray, w w2) {
        this(method, bl, typeArray);
    }
}

