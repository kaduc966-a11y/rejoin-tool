/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.e.b.e;
import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.tb;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.vb;
import b.t.c.b.b.q.wb;

final class eb$3
extends tb {
    eb$3(ac ac2) {
        super(ac2);
    }

    @Override
    public final boolean o00000(l l2, ub ub2, wb wb2, boolean bl) {
        while (true) {
            if (ub2 == null) {
                eb$3.\u00f500000(0);
            }
            if (wb2 == null) {
                eb$3.\u00f500000(1);
            }
            ub ub3 = (ib)n.super((wb)ub2, ib.class);
            if ((wb2 = (ib)n.super(wb2, ib.class, false)) == null) {
                return false;
            }
            if (ub3 != null && n.\u00d2O0000(ub3) && (ub3 = (ib)n.super((wb)ub3, ib.class)) != null && n.\u00d200000((ib)wb2, ub3)) {
                return true;
            }
            ub3 = n.super(ub2);
            ib ib2 = (ib)n.super((wb)ub3, ib.class);
            if (ib2 == null) {
                return false;
            }
            if (n.\u00d200000((ib)wb2, ib2) && this.o00000(l2, ub3, (ib)wb2)) {
                return true;
            }
            wb2 = wb2.\u00d8\u00f80000();
        }
    }

    private boolean o00000(l object, ub ub2, ib ib2) {
        if (ub2 == null) {
            eb$3.\u00f500000(2);
        }
        if (ib2 == null) {
            eb$3.\u00f500000(3);
        }
        if (object == eb.void) {
            return false;
        }
        if (!(ub2 instanceof hc)) {
            return true;
        }
        if (ub2 instanceof vb) {
            return true;
        }
        if (object == eb.\u00d400000) {
            return true;
        }
        if (object == eb.\u00d200000() || object == null) {
            return false;
        }
        return n.\u00d200000((rc)(object = object instanceof e ? ((e)object).\u00d600000() : object.o00000()), (wb)ib2) || b.t.c.b.b.h.ac.o00000((rc)object);
    }

    private static /* synthetic */ void \u00f500000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "what";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "from";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "whatDeclaration";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fromClass";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "isVisible";
                break;
            }
            case 2: 
            case 3: {
                objectArray = objectArray2;
                objectArray2[2] = "doesReceiverFitForProtectedVisibility";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

