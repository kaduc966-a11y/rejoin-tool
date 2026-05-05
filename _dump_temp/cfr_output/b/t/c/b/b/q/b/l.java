/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.o.e.b.j;
import b.t.c.b.b.q.b.n;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.wb;

public class l
extends n {
    private final ib \u00f8\u00d6\u00d6000;
    private final j privatefloatObject;

    public l(ib ib2) {
        if (ib2 == null) {
            l.\u00d5\u00d50000(0);
        }
        super(o.\u00d8o\u00f6000.o00000());
        this.\u00f8\u00d6\u00d6000 = ib2;
        this.privatefloatObject = new j(ib2, null);
    }

    @Override
    public b.t.c.b.b.o.e.b.l \u00f4O\u00d2000() {
        j j2 = this.privatefloatObject;
        if (j2 == null) {
            l.\u00d5\u00d50000(1);
        }
        return j2;
    }

    @Override
    public wb \u00d8\u00f80000() {
        ib ib2 = this.\u00f8\u00d6\u00d6000;
        if (ib2 == null) {
            l.\u00d5\u00d50000(2);
        }
        return ib2;
    }

    @Override
    public String toString() {
        return "class " + this.\u00f8\u00d6\u00d6000.\u00d5\u00f80000() + "::this";
    }

    private static /* synthetic */ void \u00d5\u00d50000(int n2) {
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
            case 1: 
            case 2: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 1: 
            case 2: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptor";
                break;
            }
            case 1: 
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newOwner";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "getValue";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "getContainingDeclaration";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "copy";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 1: 
            case 2: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

