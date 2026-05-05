/*
 * Decompiled with CFR 0.152.
 */
package b.n;

import b.n.b$_b$_b$1;
import b.o.e.h;

public final class b {
    public static final Thread o00000(boolean bl, boolean bl2, ClassLoader classLoader, String string, int n2, h object) {
        object = new b$_b$_b$1((h)object);
        if (bl2) {
            ((Thread)object).setDaemon(true);
        }
        if (n2 > 0) {
            ((Thread)object).setPriority(n2);
        }
        if (string != null) {
            ((Thread)object).setName(string);
        }
        if (classLoader != null) {
            ((Thread)object).setContextClassLoader(classLoader);
        }
        if (bl) {
            ((Thread)object).start();
        }
        return (Thread)object;
    }

    public static /* synthetic */ Thread o00000(boolean bl, boolean bl2, ClassLoader classLoader, String string, int n2, h h2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            bl = true;
        }
        if ((n3 & 2) != 0) {
            bl2 = false;
        }
        if ((n3 & 4) != 0) {
            classLoader = null;
        }
        if ((n3 & 8) != 0) {
            string = null;
        }
        if ((n3 & 0x10) != 0) {
            n2 = -1;
        }
        return b.o00000(bl, bl2, classLoader, string, n2, h2);
    }

    private static final Object o00000(ThreadLocal threadLocal, h object) {
        Object object2 = threadLocal.get();
        if (object2 == null) {
            Object object3 = object = object.newreturn();
            threadLocal.set(object3);
            object2 = object;
        }
        return object2;
    }
}

