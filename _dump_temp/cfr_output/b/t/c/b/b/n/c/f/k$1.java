/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.b.y;
import b.t.c.b.b.n.c.f.k;
import b.t.c.b.b.n.c.f.k$_b;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class k$1
implements k {
    k$1() {
    }

    @Override
    public final k$_b super(y y2, ib ib2, rc rc2, rc rc3, List list, List list2) {
        if (y2 == null) {
            k$1.super(0);
        }
        if (ib2 == null) {
            k$1.super(1);
        }
        if (rc2 == null) {
            k$1.super(2);
        }
        if (list == null) {
            k$1.super(3);
        }
        if (list2 == null) {
            k$1.super(4);
        }
        return new k$_b(rc2, rc3, list, list2, Collections.emptyList(), false);
    }

    @Override
    public final void super(hc hc2, List list) {
        if (hc2 == null) {
            k$1.super(5);
        }
        if (list == null) {
            k$1.super(6);
        }
        throw new UnsupportedOperationException("Should not be called");
    }

    private static /* synthetic */ void super(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "method";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "owner";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "returnType";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "valueParameters";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptor";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "signatureErrors";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "resolvePropagatedSignature";
                break;
            }
            case 5: 
            case 6: {
                objectArray = objectArray2;
                objectArray2[2] = "reportSignatureErrors";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

