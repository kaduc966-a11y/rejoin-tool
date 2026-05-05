/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.o.d.w;
import b.s.mc;
import b.s.y;
import b.t.c.b.d.b;
import b.t.c.b.d.e;
import b.t.c.b.d.j;
import b.t.c.b.d.k$_b;
import b.t.c.b.d.k$_c;
import b.xc;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k
implements b {
    private final Class ifsuper;
    private final List \u00d3o0000;
    private final k$_c oo0000;
    private final List returnsuper;
    private final List \u00f8O0000;
    private final List \u00d2o0000;
    private final List \u00d5o0000;

    public k(Class object, List iterator, k$_c object2, k$_b k$_b, List object3) {
        Object object4;
        this.ifsuper = object;
        this.\u00d3o0000 = iterator;
        this.oo0000 = object2;
        this.returnsuper = object3;
        k k2 = this;
        object = k2.returnsuper;
        object3 = k2;
        iterator = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (Method)object2;
            object4 = object;
            object4.add(((Method)object2).getGenericReturnType());
        }
        ((k)object3).\u00f8O0000 = (List)object;
        k k3 = this;
        object = k3.returnsuper;
        object3 = k3;
        iterator = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (Method)object2;
            object4 = object;
            Object object5 = b.t.c.b.b.q.d.b.e.o00000(object2 = ((Method)object2).getReturnType());
            if (object5 == null) {
                object5 = object2;
            }
            object4.add(object5);
        }
        ((k)object3).\u00d2o0000 = (List)object;
        k k4 = this;
        object = k4.returnsuper;
        object3 = k4;
        iterator = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (Method)object2;
            object4 = object;
            object4.add(((Method)object2).getDefaultValue());
        }
        ((k)object3).\u00d5o0000 = (List)object;
        if (this.oo0000 == k$_c.\u00d400000 && k$_b == k$_b.\u00d400000 && !((Collection)mc.\u00d300000((Iterable)this.\u00d3o0000, (Object)"value")).isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public /* synthetic */ k(Class clazz, List list, k$_c k$_c, k$_b k$_b, List iterable, int n2, w object) {
        if ((n2 & 0x10) != 0) {
            iterable = list;
            Object object2 = iterable;
            iterable = new ArrayList(mc.o00000((Iterable)iterable, 10));
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                object = (String)object;
                Iterable<Method> iterable2 = iterable;
                iterable2.add(clazz.getDeclaredMethod((String)object, new Class[0]));
            }
        }
        this(clazz, list, k$_c, k$_b, (List)iterable);
    }

    public final Void \u00d2O0000() {
        return null;
    }

    @Override
    public final Type \u00d400000() {
        return this.ifsuper;
    }

    @Override
    public final List \u00d200000() {
        return this.\u00f8O0000;
    }

    @Override
    public final Object o00000(Object[] object) {
        this.void((Object[])object);
        Object[] objectArray = object;
        object = new ArrayList(((Object[])object).length);
        int n2 = 0;
        for (Object object2 : objectArray) {
            int n3 = n2++;
            Object object3 = object;
            Object object4 = object2 == null && this.oo0000 == k$_c.super ? this.\u00d5o0000.get(n3) : j.o00000(object2, (Class)this.\u00d2o0000.get(n3));
            if (object4 == null) {
                j.o00000(n3, (String)this.\u00d3o0000.get(n3), (Class)this.\u00d2o0000.get(n3));
                throw new xc();
            }
            object3.add(object4);
        }
        object = (List)object;
        return j.o00000(this.ifsuper, y.o00000(mc.\u00d300000((Iterable)this.\u00d3o0000, (Iterable)object)), this.returnsuper);
    }

    public final void void(Object[] objectArray) {
        this.\u00d600000(objectArray);
    }

    @Override
    public final boolean o00000() {
        return this.oO0000();
    }

    public final void \u00d600000(Object[] objectArray) {
        if (e.o00000(this) != objectArray.length) {
            throw new IllegalArgumentException("Callable expects " + e.o00000(this) + " arguments, but " + objectArray.length + " were provided.");
        }
    }

    public final boolean oO0000() {
        return false;
    }
}

