/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.e.p;

class n
implements p {
    n() {
    }

    @Override
    public boolean o00000(bc bc2, bc bc3) {
        if (bc2 == null) {
            n.o00000(3);
        }
        if (bc3 == null) {
            n.o00000(4);
        }
        return bc2.equals(bc3);
    }

    private static /* synthetic */ void o00000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "a";
                break;
            }
            case 1: 
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "b";
                break;
            }
            case 2: 
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeCheckingProcedure";
                break;
            }
            case 5: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "subtype";
                break;
            }
            case 6: 
            case 11: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertype";
                break;
            }
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeProjection";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "assertEqualTypes";
                break;
            }
            case 3: 
            case 4: {
                objectArray = objectArray2;
                objectArray2[2] = "assertEqualTypeConstructors";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                objectArray = objectArray2;
                objectArray2[2] = "assertSubtype";
                break;
            }
            case 8: 
            case 9: {
                objectArray = objectArray2;
                objectArray2[2] = "capture";
                break;
            }
            case 10: 
            case 11: {
                objectArray = objectArray2;
                objectArray2[2] = "noCorrespondingSupertype";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

