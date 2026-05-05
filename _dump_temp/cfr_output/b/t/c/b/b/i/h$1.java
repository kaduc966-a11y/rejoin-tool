/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.e;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$_j;
import b.t.c.b.b.i.h$_l;

final class h$1
extends h {
    h$1(String string, h._j _j2, e e2) {
        super(string, _j2, e2, null);
    }

    @Override
    protected final h$_l o00000(String string, Object object) {
        if (string == null) {
            h$1.\u00d200000(0);
        }
        h$_l h$_l = h$_l.\u00d300000();
        if (h$_l == null) {
            h$1.\u00d200000(1);
        }
        return h$_l;
    }

    private static /* synthetic */ void \u00d200000(int n2) {
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
            case 1: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "recursionDetectedDefault";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "recursionDetectedDefault";
            }
            case 1: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 1: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

