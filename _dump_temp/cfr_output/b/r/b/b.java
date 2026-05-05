/*
 * Decompiled with CFR 0.152.
 */
package b.r.b;

import java.util.concurrent.CancellationException;

public final class b {
    private static final CancellationException o00000(String object, Throwable throwable) {
        object = new CancellationException((String)object);
        ((Throwable)object).initCause(throwable);
        return object;
    }

    private static final CancellationException o00000(Throwable throwable) {
        Throwable throwable2 = throwable;
        CancellationException cancellationException = new CancellationException(throwable2 != null ? String.valueOf(throwable2) : null);
        cancellationException.initCause(throwable);
        return cancellationException;
    }

    public static /* synthetic */ void o00000() {
    }
}

