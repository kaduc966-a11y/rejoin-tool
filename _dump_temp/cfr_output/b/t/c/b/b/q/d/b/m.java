/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.n.c.b.h;
import b.t.c.b.b.q.d.b.i;
import b.t.c.b.b.q.d.b.o;
import b.t.c.b.b.q.d.b.r;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public final class m
extends r
implements h {
    private final Object \u00d600000;

    public m(Object object) {
        this.\u00d600000 = object;
    }

    @Override
    public final b.t.c.b.b.n.c.b.r \u00d4O0000() {
        Class clazz = i.o00000.\u00d300000(this.\u00d600000);
        if (clazz == null) {
            throw new NoSuchMethodError("Can't find `getType` method");
        }
        Class clazz2 = clazz;
        return new o(clazz2);
    }

    @Override
    public final boolean \u00d3O0000() {
        return false;
    }

    @Override
    public final Member \u00d5\u00d20000() {
        Method method = i.o00000.o00000(this.\u00d600000);
        if (method == null) {
            throw new NoSuchMethodError("Can't find `getAccessor` method");
        }
        return method;
    }
}

