/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.e.f$_b;

final class i$1
implements f$_b {
    i$1() {
    }

    @Override
    public final boolean o00000(bc bc2, bc bc3) {
        if (bc2 == null) {
            i$1.o00000(0);
        }
        if (bc3 == null) {
            i$1.o00000(1);
        }
        return bc2.equals(bc3);
    }

    private static /* synthetic */ void o00000(int n2) {
        Object[] objectArray;
        Object[] objectArray2 = new Object[3];
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[0] = "a";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[0] = "b";
            }
        }
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objectArray[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

