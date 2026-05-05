/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.j;
import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.q.b.n;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.wb;

public class f
extends n {
    private final wb \u00d8\u00d6\u00d6000;
    private l \u00f4\u00d6\u00d6000;

    public f(wb wb2, l l2, o o2) {
        if (wb2 == null) {
            f.\u00d4\u00d50000(0);
        }
        if (l2 == null) {
            f.\u00d4\u00d50000(1);
        }
        if (o2 == null) {
            f.\u00d4\u00d50000(2);
        }
        this(wb2, l2, o2, j.do);
    }

    public f(wb wb2, l l2, o o2, b.t.c.b.b.d.f f2) {
        if (wb2 == null) {
            f.\u00d4\u00d50000(3);
        }
        if (l2 == null) {
            f.\u00d4\u00d50000(4);
        }
        if (o2 == null) {
            f.\u00d4\u00d50000(5);
        }
        if (f2 == null) {
            f.\u00d4\u00d50000(6);
        }
        super(o2, f2);
        this.\u00d8\u00d6\u00d6000 = wb2;
        this.\u00f4\u00d6\u00d6000 = l2;
    }

    @Override
    public l \u00f4O\u00d2000() {
        l l2 = this.\u00f4\u00d6\u00d6000;
        if (l2 == null) {
            f.\u00d4\u00d50000(7);
        }
        return l2;
    }

    @Override
    public wb \u00d8\u00f80000() {
        wb wb2 = this.\u00d8\u00d6\u00d6000;
        if (wb2 == null) {
            f.\u00d4\u00d50000(8);
        }
        return wb2;
    }

    private static /* synthetic */ void \u00d4\u00d50000(int n2) {
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
            case 8: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 7: 
            case 8: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "containingDeclaration";
                break;
            }
            case 1: 
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "value";
                break;
            }
            case 2: 
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 7: 
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            }
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newOwner";
                break;
            }
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "outType";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getValue";
                break;
            }
            case 8: {
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
            case 7: 
            case 8: {
                break;
            }
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "copy";
                break;
            }
            case 10: {
                objectArray = objectArray;
                objectArray[2] = "setOutType";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 7: 
            case 8: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

