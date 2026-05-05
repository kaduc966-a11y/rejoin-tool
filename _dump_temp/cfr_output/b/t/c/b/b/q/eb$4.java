/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.tb;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.wb;

final class eb$4
extends tb {
    eb$4(ac ac2) {
        super(ac2);
    }

    @Override
    public final boolean o00000(l object, ub ub2, wb wb2, boolean bl) {
        if (ub2 == null) {
            eb$4.\u00f400000(0);
        }
        if (wb2 == null) {
            eb$4.\u00f400000(1);
        }
        object = n.\u00f800000(ub2);
        if (!n.\u00f800000(wb2).o00000((bc)object)) {
            return false;
        }
        return eb.super().o00000(ub2, wb2);
    }

    private static /* synthetic */ void \u00f400000(int n2) {
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
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
        objectArray[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

