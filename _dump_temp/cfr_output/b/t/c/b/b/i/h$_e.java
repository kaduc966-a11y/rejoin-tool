/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.d;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$1;
import b.t.c.b.b.i.h$_e$1;
import b.t.c.b.b.i.h$_f;
import b.t.c.b.b.i.h$_h;
import java.util.concurrent.ConcurrentMap;

class h$_e
extends h$_f
implements d {
    private h$_e(h h2, ConcurrentMap concurrentMap) {
        if (h2 == null) {
            h$_e.\u00d8\u00d30000(0);
        }
        if (concurrentMap == null) {
            h$_e.\u00d8\u00d30000(1);
        }
        super(h2, concurrentMap, new h$_e$1());
    }

    public Object o00000(Object object, b.o.e.h h2) {
        if (h2 == null) {
            h$_e.\u00d8\u00d30000(2);
        }
        return this.\u00f800000(new h$_h(object, h2));
    }

    /* synthetic */ h$_e(h h2, ConcurrentMap concurrentMap, h$1 h$1) {
        this(h2, concurrentMap);
    }

    private static /* synthetic */ void \u00d8\u00d30000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
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
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "<init>";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "computeIfAbsent";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

