/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.t.c.b.b.f.b.f;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import java.util.List;

final class f$1
implements f {
    f$1() {
    }

    @Override
    public final void o00000(ib ib2, List list) {
        if (ib2 == null) {
            f$1.o00000(0);
        }
        if (list == null) {
            f$1.o00000(1);
        }
    }

    @Override
    public final void o00000(hc hc2) {
        if (hc2 == null) {
            f$1.o00000(2);
        }
    }

    private static /* synthetic */ void o00000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptor";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "unresolvedSuperClasses";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "reportIncompleteHierarchy";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "reportCannotInferVisibility";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

