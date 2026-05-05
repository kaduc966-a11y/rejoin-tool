/*
 * Decompiled with CFR 0.152.
 */
package b.m;

import b.o.e.h;
import java.io.InvalidObjectException;

public final class j {
    private static final Void o00000() {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private static final void o00000(h h2) {
        try {
            h2.newreturn();
            return;
        }
        catch (Throwable throwable) {
            throw new InvalidObjectException(throwable.getMessage()).initCause(throwable);
        }
    }
}

