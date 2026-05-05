/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g {
    public static final RuntimeException o00000(Throwable throwable) {
        throw throwable;
    }

    public static final boolean new(Throwable serializable) {
        serializable = serializable.getClass();
        while (!fc.o00000((Object)((Class)serializable).getCanonicalName(), (Object)"com.intellij.openapi.progress.ProcessCanceledException")) {
            if (((Class)serializable).getSuperclass() != null) continue;
            return false;
        }
        return true;
    }
}

