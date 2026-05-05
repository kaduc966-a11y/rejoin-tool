/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.t.c.b.b.n.c.fb;
import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.tb;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.wb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class fb$1
extends tb {
    fb$1(ac ac2) {
        super(ac2);
    }

    @Override
    public final boolean o00000(l l2, ub ub2, wb wb2, boolean bl) {
        if (ub2 == null) {
            fb$1.new(0);
        }
        if (wb2 == null) {
            fb$1.new(1);
        }
        return fb.\u00d200000(ub2, wb2);
    }

    private static /* synthetic */ void new(int n2) {
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
                objectArray3[0] = "fromPackage";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "myPackage";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "isVisible";
                break;
            }
            case 2: 
            case 3: {
                objectArray = objectArray2;
                objectArray2[2] = "visibleFromPackage";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

