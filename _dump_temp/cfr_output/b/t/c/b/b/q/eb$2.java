/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.t.c.b.b.o.e.b.d;
import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.tb;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.wb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class eb$2
extends tb {
    eb$2(ac ac2) {
        super(ac2);
    }

    @Override
    public final boolean o00000(l l2, ub wb2, wb wb3, boolean bl) {
        if (wb2 == null) {
            eb$2.if(0);
        }
        if (wb3 == null) {
            eb$2.if(1);
        }
        if (eb.oO0000.o00000(l2, (ub)wb2, wb3, bl)) {
            if (l2 == eb.\u00d400000) {
                return true;
            }
            if (l2 == eb.\u00d200000()) {
                return false;
            }
            if ((wb2 = n.super(wb2, ib.class)) != null && l2 instanceof d) {
                return ((d)l2).\u00d200000().\u00f4o\u00d2000().equals(wb2.returnnull());
            }
        }
        return false;
    }

    private static /* synthetic */ void if(int n2) {
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
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
        objectArray[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

