/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.n.c.b.db;
import b.t.c.b.b.n.c.b.y;
import b.t.c.b.b.q.d.b.ab;
import b.t.c.b.b.q.d.b.l;
import b.t.c.b.b.q.d.b.r;
import b.t.c.b.b.q.d.b.z;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public final class t
extends r
implements y {
    private final Method \u00d500000;

    public t(Method method) {
        this.\u00d500000 = method;
    }

    public final Method \u00f4\u00d30000() {
        return this.\u00d500000;
    }

    @Override
    public final List thisObject() {
        t t2 = this;
        return t2.o00000(t2.\u00f4\u00d30000().getGenericParameterTypes(), this.\u00f4\u00d30000().getParameterAnnotations(), this.\u00f4\u00d30000().isVarArgs());
    }

    public final ab \u00d8\u00d30000() {
        return ab.oO0000.o00000(this.\u00f4\u00d30000().getGenericReturnType());
    }

    @Override
    public final db \u00d3\u00d30000() {
        z z2;
        Object object = this.\u00f4\u00d30000().getDefaultValue();
        if (object != null) {
            Object object2 = object;
            z2 = z.o00000.super(object2, null);
        } else {
            z2 = null;
        }
        return z2;
    }

    @Override
    public final List o00000() {
        Object object = this.\u00f4\u00d30000().getTypeParameters();
        Object[] objectArray = object;
        object = new ArrayList(((Object[])object).length);
        for (Object object2 : objectArray) {
            object2 = (TypeVariable)object2;
            Object object3 = object;
            object3.add(new l((TypeVariable)object2));
        }
        return (List)object;
    }

    @Override
    public final boolean whilenew() {
        return Modifier.isNative(this.\u00f4\u00d30000().getModifiers());
    }

    @Override
    public final boolean \u00d4\u00d30000() {
        return this.\u00d3\u00d30000() != null;
    }
}

