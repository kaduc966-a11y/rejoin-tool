/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.h$_j;
import b.t.c.b.b.m.g;

final class h$_j$1
implements h$_j {
    h$_j$1() {
    }

    @Override
    public final RuntimeException o00000(Throwable throwable) {
        if (throwable == null) {
            h$_j$1.o00000(0);
        }
        throw g.o00000(throwable);
    }

    private static /* synthetic */ void o00000(int n2) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
    }
}

