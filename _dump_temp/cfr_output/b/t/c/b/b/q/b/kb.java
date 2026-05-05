/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.q.b.p;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.nb;
import b.t.c.b.b.q.q;
import b.t.c.b.b.q.wb;

public abstract class kb
extends p
implements nb {
    private final wb \u00d4\u00d8o000;
    private final g \u00d5\u00d8o000;

    protected kb(wb wb2, o o2, f f2, g g2) {
        if (wb2 == null) {
            kb.\u00f4\u00d20000(0);
        }
        if (o2 == null) {
            kb.\u00f4\u00d20000(1);
        }
        if (f2 == null) {
            kb.\u00f4\u00d20000(2);
        }
        if (g2 == null) {
            kb.\u00f4\u00d20000(3);
        }
        super(o2, f2);
        this.\u00d4\u00d8o000 = wb2;
        this.\u00d5\u00d8o000 = g2;
    }

    public q oOO000() {
        q q2 = (q)super.returnnull();
        if (q2 == null) {
            kb.\u00f4\u00d20000(4);
        }
        return q2;
    }

    @Override
    public wb \u00d8\u00f80000() {
        wb wb2 = this.\u00d4\u00d8o000;
        if (wb2 == null) {
            kb.\u00f4\u00d20000(5);
        }
        return wb2;
    }

    @Override
    public g \u00f4\u00f80000() {
        g g2 = this.\u00d5\u00d8o000;
        if (g2 == null) {
            kb.\u00f4\u00d20000(6);
        }
        return g2;
    }

    private static /* synthetic */ void \u00f4\u00d20000(int n2) {
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
            case 6: {
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
            case 6: {
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
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
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
            case 5: 
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getContainingDeclaration";
                break;
            }
            case 6: {
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
            case 6: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

