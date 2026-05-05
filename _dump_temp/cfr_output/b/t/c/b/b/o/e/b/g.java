/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e.b;

import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.e.b.l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class g
implements l {
    protected final rc \u00d200000;
    private final l super;

    public g(rc rc2, l l2) {
        if (rc2 == null) {
            g.o00000(0);
        }
        this.\u00d200000 = rc2;
        this.super = l2 != null ? l2 : this;
    }

    @Override
    public rc o00000() {
        rc rc2 = this.\u00d200000;
        if (rc2 == null) {
            g.o00000(1);
        }
        return rc2;
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
                objectArray3[0] = "receiverType";
                break;
            }
            case 1: 
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "getType";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 1: 
            case 2: 
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

