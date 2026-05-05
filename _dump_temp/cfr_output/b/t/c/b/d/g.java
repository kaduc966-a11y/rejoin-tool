/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.o.d.w;
import b.t.c.b.d.b;
import b.t.c.b.d.e;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public abstract class g
implements b {
    private final Method \u00d800000;
    private final List \u00d500000;
    private final Type \u00d600000;

    private g(Method method, List list) {
        this.\u00d800000 = method;
        this.\u00d500000 = list;
        this.\u00d600000 = this.\u00d800000.getReturnType();
    }

    @Override
    public final List \u00d200000() {
        return this.\u00d500000;
    }

    public final Method \u00f500000() {
        return null;
    }

    @Override
    public final Type \u00d400000() {
        return this.\u00d600000;
    }

    protected final Object o00000(Object object, Object[] objectArray) {
        return this.\u00d800000.invoke(object, Arrays.copyOf(objectArray, objectArray.length));
    }

    public void Object(Object[] objectArray) {
        this.\u00d200000(objectArray);
    }

    @Override
    public boolean o00000() {
        return this.\u00f400000();
    }

    public /* synthetic */ g(Method method, List list, w w2) {
        this(method, list);
    }

    public void \u00d200000(Object[] objectArray) {
        if (e.o00000(this) != objectArray.length) {
            throw new IllegalArgumentException("Callable expects " + e.o00000(this) + " arguments, but " + objectArray.length + " were provided.");
        }
    }

    public boolean \u00f400000() {
        return false;
    }
}

