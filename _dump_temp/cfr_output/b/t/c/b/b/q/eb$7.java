/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.tb;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.wb;

final class eb$7
extends tb {
    eb$7(ac ac2) {
        super(ac2);
    }

    @Override
    public final boolean o00000(l l2, ub ub2, wb wb2, boolean bl) {
        if (ub2 == null) {
            eb$7.\u00d500000(0);
        }
        if (wb2 == null) {
            eb$7.\u00d500000(1);
        }
        throw new IllegalStateException("Visibility is unknown yet");
    }

    private static /* synthetic */ void \u00d500000(int n2) {
        Object[] objectArray;
        Object[] objectArray2 = new Object[3];
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[0] = "what";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[0] = "from";
            }
        }
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
        objectArray[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

