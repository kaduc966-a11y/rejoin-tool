/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.b.w;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.wb;

public abstract class z
extends w {
    private final wb \u00d5\u00f8\u00d6000;
    private final g \u00d8\u00f8\u00d6000;
    private final boolean thispublicObject;

    public z(l l2, wb wb2, f f2, g g2, boolean bl) {
        if (l2 == null) {
            z.\u00f4\u00d50000(0);
        }
        if (wb2 == null) {
            z.\u00f4\u00d50000(1);
        }
        if (f2 == null) {
            z.\u00f4\u00d50000(2);
        }
        if (g2 == null) {
            z.\u00f4\u00d50000(3);
        }
        super(l2, f2);
        this.\u00d5\u00f8\u00d6000 = wb2;
        this.\u00d8\u00f8\u00d6000 = g2;
        this.thispublicObject = bl;
    }

    @Override
    public boolean \u00f50O000() {
        return this.thispublicObject;
    }

    @Override
    public wb \u00d8\u00f80000() {
        wb wb2 = this.\u00d5\u00f8\u00d6000;
        if (wb2 == null) {
            z.\u00f4\u00d50000(4);
        }
        return wb2;
    }

    @Override
    public g \u00f4\u00f80000() {
        g g2 = this.\u00d8\u00f8\u00d6000;
        if (g2 == null) {
            z.\u00f4\u00d50000(5);
        }
        return g2;
    }

    private static /* synthetic */ void \u00f4\u00d50000(int n2) {
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
            case 5: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 5: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "storageManager";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "containingDeclaration";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 4: 
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getContainingDeclaration";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getSource";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 4: 
            case 5: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 5: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

