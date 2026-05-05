/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.t.c.b.b.h.rc;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class k$_b {
    private final rc \u00d200000;
    private final rc Object;
    private final List \u00d600000;
    private final List \u00d500000;
    private final List \u00d400000;
    private final boolean o00000;

    public k$_b(rc rc2, rc rc3, List list, List list2, List list3, boolean bl) {
        if (rc2 == null) {
            k$_b.o00000(0);
        }
        if (list == null) {
            k$_b.o00000(1);
        }
        if (list2 == null) {
            k$_b.o00000(2);
        }
        if (list3 == null) {
            k$_b.o00000(3);
        }
        this.\u00d200000 = rc2;
        this.Object = rc3;
        this.\u00d600000 = list;
        this.\u00d500000 = list2;
        this.\u00d400000 = list3;
        this.o00000 = bl;
    }

    public rc new() {
        rc rc2 = this.\u00d200000;
        if (rc2 == null) {
            k$_b.o00000(4);
        }
        return rc2;
    }

    public rc o00000() {
        return this.Object;
    }

    public List \u00d500000() {
        List list = this.\u00d600000;
        if (list == null) {
            k$_b.o00000(5);
        }
        return list;
    }

    public List \u00d300000() {
        List list = this.\u00d500000;
        if (list == null) {
            k$_b.o00000(6);
        }
        return list;
    }

    public boolean \u00d400000() {
        return this.o00000;
    }

    public List return() {
        List list = this.\u00d400000;
        if (list == null) {
            k$_b.o00000(7);
        }
        return list;
    }

    private static /* synthetic */ void o00000(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "returnType";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "valueParameters";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "signatureErrors";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getReturnType";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getValueParameters";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "getTypeParameters";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getErrors";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

