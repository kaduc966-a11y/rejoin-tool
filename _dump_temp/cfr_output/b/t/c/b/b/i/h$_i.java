/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.o.e.g;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$_f;
import b.t.c.b.b.i.j;
import java.util.concurrent.ConcurrentMap;

class h$_i
extends h$_f
implements j {
    static final /* synthetic */ boolean \u00d5\u00d2\u00d4000;

    public h$_i(h h2, ConcurrentMap concurrentMap, g g2) {
        if (h2 == null) {
            h$_i.\u00f5\u00d30000(0);
        }
        if (concurrentMap == null) {
            h$_i.\u00f5\u00d30000(1);
        }
        if (g2 == null) {
            h$_i.\u00f5\u00d30000(2);
        }
        super(h2, concurrentMap, g2);
    }

    @Override
    public Object \u00f800000(Object object) {
        object = super.\u00f800000(object);
        if (!\u00d5\u00d2\u00d4000 && object == null) {
            throw new AssertionError((Object)("compute() returned null under " + this.\u00f5oo000()));
        }
        Object object2 = object;
        if (object2 == null) {
            h$_i.\u00f5\u00d30000(3);
        }
        return object2;
    }

    static {
        \u00d5\u00d2\u00d4000 = !h.class.desiredAssertionStatus();
    }

    private static /* synthetic */ void \u00f5\u00d30000(int n2) {
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
            case 3: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 3: {
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
                objectArray3[0] = "map";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "compute";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "invoke";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 3: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 3: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

