/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.t.c.b.b.h.e.n;
import b.t.c.b.b.h.e.p;
import b.t.c.b.b.h.e.u;
import b.t.c.b.b.h.rc;

public class y {
    public static rc o00000(rc rc2, rc rc3) {
        if (rc2 == null) {
            y.o00000(0);
        }
        if (rc3 == null) {
            y.o00000(1);
        }
        return y.o00000(rc2, rc3, new n());
    }

    public static rc o00000(rc rc2, rc rc3, p p2) {
        if (rc2 == null) {
            y.o00000(2);
        }
        if (rc3 == null) {
            y.o00000(3);
        }
        if (p2 == null) {
            y.o00000(4);
        }
        return u.o00000(rc2, rc3, p2);
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
            case 7: 
            case 10: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 7: 
            case 10: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "subtype";
                break;
            }
            case 1: 
            case 3: 
            case 18: 
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertype";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeCheckingProcedureCallbacks";
                break;
            }
            case 5: 
            case 8: 
            case 23: {
                objectArray2 = objectArray3;
                objectArray3[0] = "parameter";
                break;
            }
            case 6: 
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "argument";
                break;
            }
            case 7: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            }
            case 11: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type1";
                break;
            }
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type2";
                break;
            }
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameter";
                break;
            }
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeArgument";
                break;
            }
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameterVariance";
                break;
            }
            case 16: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeArgumentVariance";
                break;
            }
            case 21: {
                objectArray2 = objectArray3;
                objectArray3[0] = "subtypeArgumentProjection";
                break;
            }
            case 22: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertypeArgumentProjection";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getOutType";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getInType";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "findCorrespondingSupertype";
                break;
            }
            case 5: 
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "getOutType";
                break;
            }
            case 7: 
            case 10: {
                break;
            }
            case 8: 
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "getInType";
                break;
            }
            case 11: 
            case 12: {
                objectArray = objectArray;
                objectArray[2] = "equalTypes";
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                objectArray = objectArray;
                objectArray[2] = "getEffectiveProjectionKind";
                break;
            }
            case 17: 
            case 18: {
                objectArray = objectArray;
                objectArray[2] = "isSubtypeOf";
                break;
            }
            case 19: 
            case 20: {
                objectArray = objectArray;
                objectArray[2] = "checkSubtypeForTheSameConstructor";
                break;
            }
            case 21: 
            case 22: 
            case 23: {
                objectArray = objectArray;
                objectArray[2] = "capture";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 7: 
            case 10: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

