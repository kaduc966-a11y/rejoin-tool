/*
 * Decompiled with CFR 0.152.
 */
package b.m;

import b.d;
import b.m.b.b;
import b.o.d.fc;

public final class s {
    public static final b.m.d o00000;

    private static final /* synthetic */ Object o00000(Object object) {
        try {
            fc.o00000(1, "T");
            return object;
        }
        catch (ClassCastException classCastException) {
            object = object.getClass().getClassLoader();
            fc.o00000(4, "T");
            ClassLoader classLoader = Object.class.getClassLoader();
            if (!fc.o00000(object, (Object)classLoader)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + object + ", base type classloader: " + classLoader, classCastException);
            }
            throw classCastException;
        }
    }

    public static final boolean o00000(int n2, int n3, int n4) {
        return d.Object.\u00d200000(n2, n3, n4);
    }

    static {
        b.m.d d2;
        Object object = new b();
        try {
            d2 = (b.m.d)object;
        }
        catch (ClassCastException classCastException) {
            object = object.getClass().getClassLoader();
            ClassLoader classLoader = b.m.d.class.getClassLoader();
            if (!fc.o00000(object, (Object)classLoader)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + object + ", base type classloader: " + classLoader, classCastException);
            }
            throw classCastException;
        }
        o00000 = d2;
    }
}

