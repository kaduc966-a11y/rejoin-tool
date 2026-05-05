/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m.b;

import java.util.concurrent.ConcurrentHashMap;

public final class b {
    private static final ConcurrentHashMap o00000 = new ConcurrentHashMap();

    public static final Void o00000(String string) {
        throw new IllegalStateException(string.toString());
    }

    public static /* synthetic */ Void o00000(String string, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = "should not be called";
        }
        return b.o00000(string);
    }
}

