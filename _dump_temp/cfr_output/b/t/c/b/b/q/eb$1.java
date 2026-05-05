/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.tb;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.vb;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.yb;

final class eb$1
extends tb {
    eb$1(ac ac2) {
        super(ac2);
    }

    private boolean o00000(wb wb2) {
        if (wb2 == null) {
            eb$1.\u00f800000(0);
        }
        return n.super(wb2) != yb.o00000;
    }

    @Override
    public final boolean o00000(l object, ub wb2, wb wb3, boolean bl) {
        if (wb2 == null) {
            eb$1.\u00f800000(1);
        }
        if (wb3 == null) {
            eb$1.\u00f800000(2);
        }
        if (n.\u00d3O0000(wb2) && this.o00000(wb3)) {
            return eb.super(wb2, wb3);
        }
        if (wb2 instanceof vb) {
            object = ((vb)wb2).\u00d8\u00f6o000();
            if (bl && n.\u00d600000((wb)object) && n.\u00d3O0000((wb)object) && wb3 instanceof vb && n.\u00d3O0000(wb3.\u00d8\u00f80000()) && eb.super(wb2, wb3)) {
                return true;
            }
        }
        object = wb2;
        while (!(object == null || (object = object.\u00d8\u00f80000()) instanceof ib && !n.\u00d2O0000((wb)object) || object instanceof lc)) {
        }
        if (object == null) {
            return false;
        }
        for (wb2 = wb3; wb2 != null; wb2 = wb2.\u00d8\u00f80000()) {
            if (object == wb2) {
                return true;
            }
            if (!(wb2 instanceof lc)) continue;
            return object instanceof lc && ((lc)object).OOO000().equals(((lc)wb2).OOO000()) && n.super(wb2, (wb)object);
        }
        return false;
    }

    private static /* synthetic */ void \u00f800000(int n2) {
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
                objectArray3[0] = "what";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "from";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "hasContainingSourceFile";
                break;
            }
            case 1: 
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "isVisible";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

