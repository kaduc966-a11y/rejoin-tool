/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.o.d.tc;
import b.o.e.g;
import java.io.Closeable;

public final class o {
    private static final Object o00000(Closeable closeable, g object) {
        Throwable throwable = null;
        try {
            object = object.\u00f800000(closeable);
        }
        catch (Throwable throwable2) {
            try {
                object = throwable2;
                throwable = throwable2;
                throw object;
            }
            catch (Throwable throwable3) {
                tc.Object(1);
                o.o00000(closeable, throwable);
                tc.o00000(1);
                throw throwable3;
            }
        }
        tc.Object(1);
        o.o00000(closeable, null);
        tc.o00000(1);
        return object;
    }

    public static final void o00000(Closeable closeable, Throwable throwable) {
        if (closeable != null) {
            if (throwable == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
                return;
            }
            catch (Throwable throwable2) {
                b.o.o00000(throwable, throwable2);
            }
        }
    }
}

