/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.f;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$_d;

abstract class h$_k
extends h$_d
implements f {
    static final /* synthetic */ boolean O\u00f4O000;

    public h$_k(h h2, b.o.e.h h3) {
        if (h2 == null) {
            h$_k.\u00d4\u00d20000(0);
        }
        if (h3 == null) {
            h$_k.\u00d4\u00d20000(1);
        }
        super(h2, h3);
    }

    @Override
    public Object newreturn() {
        Object object = super.newreturn();
        if (!O\u00f4O000 && object == null) {
            throw new AssertionError((Object)"compute() returned null");
        }
        Object object2 = object;
        if (object2 == null) {
            h$_k.\u00d4\u00d20000(2);
        }
        return object2;
    }

    static {
        O\u00f4O000 = !h.class.desiredAssertionStatus();
    }

    private static /* synthetic */ void \u00d4\u00d20000(int n2) {
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
                objectArray3[0] = "storageManager";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "computable";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "invoke";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 2: 
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

