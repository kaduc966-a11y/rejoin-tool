/*
 * Decompiled with CFR 0.152.
 */
package b.k;

import b.k.b$_b$1;
import b.o;
import b.o.d.tc;
import b.o.e.g;
import b.o.e.h;

public final class b {
    private static final AutoCloseable o00000(h h2) {
        return new b$_b$1(h2);
    }

    private static final Object o00000(AutoCloseable autoCloseable, g object) {
        Throwable throwable = null;
        try {
            object = object.\u00f800000(autoCloseable);
        }
        catch (Throwable throwable2) {
            try {
                object = throwable2;
                throwable = throwable2;
                throw object;
            }
            catch (Throwable throwable3) {
                tc.Object(1);
                b.o00000(autoCloseable, throwable);
                tc.o00000(1);
                throw throwable3;
            }
        }
        tc.Object(1);
        b.o00000(autoCloseable, null);
        tc.o00000(1);
        return object;
    }

    public static final void o00000(AutoCloseable autoCloseable, Throwable throwable) {
        if (autoCloseable != null) {
            if (throwable == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
                return;
            }
            catch (Throwable throwable2) {
                o.o00000(throwable, throwable2);
            }
        }
    }

    public static /* synthetic */ void o00000() {
    }
}

