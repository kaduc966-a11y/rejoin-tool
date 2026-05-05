/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e.b;

import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.e.b.f;
import b.t.c.b.b.o.e.b.g;
import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.q.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class k
extends g
implements f {
    private final b class;

    public k(b b2, rc rc2, l l2) {
        if (b2 == null) {
            k.Object(0);
        }
        if (rc2 == null) {
            k.Object(1);
        }
        super(rc2, l2);
        this.class = b2;
    }

    public String toString() {
        return this.o00000() + ": Ext {" + this.class + "}";
    }

    private static /* synthetic */ void Object(int n2) {
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
            case 2: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 2: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "callableDescriptor";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "receiverType";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newType";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "getDeclarationDescriptor";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "replaceType";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 2: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

