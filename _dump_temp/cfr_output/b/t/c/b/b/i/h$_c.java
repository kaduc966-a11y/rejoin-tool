/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.g;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$1;
import b.t.c.b.b.i.h$_e;
import java.util.concurrent.ConcurrentMap;

class h$_c
extends h$_e
implements g {
    static final /* synthetic */ boolean \u00d4\u00d2\u00d4000;

    private h$_c(h h2, ConcurrentMap concurrentMap) {
        if (h2 == null) {
            h$_c.\u00f4\u00d30000(0);
        }
        if (concurrentMap == null) {
            h$_c.\u00f4\u00d30000(1);
        }
        super(h2, concurrentMap, (h$1)null);
    }

    @Override
    public Object o00000(Object object, b.o.e.h h2) {
        if (h2 == null) {
            h$_c.\u00f4\u00d30000(2);
        }
        object = super.o00000(object, h2);
        if (!\u00d4\u00d2\u00d4000 && object == null) {
            throw new AssertionError((Object)("computeIfAbsent() returned null under " + this.\u00f5oo000()));
        }
        Object object2 = object;
        if (object2 == null) {
            h$_c.\u00f4\u00d30000(3);
        }
        return object2;
    }

    /* synthetic */ h$_c(h h2, ConcurrentMap concurrentMap, h$1 h$1) {
        this(h2, concurrentMap);
    }

    static {
        \u00d4\u00d2\u00d4000 = !h.class.desiredAssertionStatus();
    }

    private static /* synthetic */ void \u00f4\u00d30000(int n2) {
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
                objectArray3[0] = "computation";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "computeIfAbsent";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "computeIfAbsent";
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

