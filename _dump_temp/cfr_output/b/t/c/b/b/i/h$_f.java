/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.o.e.g;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$_b;
import b.t.c.b.b.i.h$_l;
import b.t.c.b.b.i.i;
import java.util.concurrent.ConcurrentMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class h$_f
implements i {
    private final h nullintnew;
    private final ConcurrentMap o\u00d2\u00d4000;
    private final g \u00d3\u00d2\u00d4000;

    public h$_f(h h2, ConcurrentMap concurrentMap, g g2) {
        if (h2 == null) {
            h$_f.thisObject(0);
        }
        if (concurrentMap == null) {
            h$_f.thisObject(1);
        }
        if (g2 == null) {
            h$_f.thisObject(2);
        }
        this.nullintnew = h2;
        this.o\u00d2\u00d4000 = concurrentMap;
        this.\u00d3\u00d2\u00d4000 = g2;
    }

    @Override
    public Object \u00f800000(Object object) {
        Object object2 = this.o\u00d2\u00d4000.get(object);
        if (object2 != null && object2 != h$_b.o00000) {
            return b.t.c.b.b.m.h.o00000(object2);
        }
        this.nullintnew.\u00d200000.\u00d200000();
        try {
            Object object3;
            object2 = this.o\u00d2\u00d4000.get(object);
            if (object2 == h$_b.o00000) {
                object2 = h$_b.\u00d300000;
                object3 = this.o00000(object, true);
                if (!((h$_l)object3).o00000()) {
                    object2 = ((h$_l)object3).\u00d200000();
                    return object2;
                }
            }
            if (object2 == h$_b.\u00d300000 && !((h$_l)(object3 = this.o00000(object, false))).o00000()) {
                object2 = ((h$_l)object3).\u00d200000();
                return object2;
            }
            if (object2 != null) {
                object3 = b.t.c.b.b.m.h.o00000(object2);
                return object3;
            }
            object3 = null;
            try {
                this.o\u00d2\u00d4000.put(object, h$_b.o00000);
                object2 = this.\u00d3\u00d2\u00d4000.\u00f800000(object);
                Object object4 = this.o\u00d2\u00d4000.put(object, b.t.c.b.b.m.h.\u00d200000(object2));
                if (object4 != h$_b.o00000) {
                    object3 = this.\u00f500000(object, object4);
                    throw object3;
                }
                return object2;
            }
            catch (Throwable throwable) {
                object2 = throwable;
                if (b.t.c.b.b.m.g.new(throwable)) {
                    Object v2;
                    try {
                        v2 = this.o\u00d2\u00d4000.remove(object);
                    }
                    catch (Throwable throwable2) {
                        throw this.o00000(object, throwable2);
                    }
                    if (v2 != h$_b.o00000) {
                        throw this.if(object, v2);
                    }
                    throw (RuntimeException)object2;
                }
                if (object2 == object3) {
                    try {
                        this.o\u00d2\u00d4000.remove(object);
                    }
                    catch (Throwable throwable3) {
                        throw this.o00000(object, throwable3);
                    }
                    throw h.o00000(this.nullintnew).o00000((Throwable)object2);
                }
                Object object5 = this.o\u00d2\u00d4000.put(object, b.t.c.b.b.m.h.o00000(object2));
                if (object5 != h$_b.o00000) {
                    throw this.\u00f500000(object, object5);
                }
                throw h.o00000(this.nullintnew).o00000((Throwable)object2);
            }
        }
        finally {
            this.nullintnew.\u00d200000.o00000();
        }
    }

    protected h$_l o00000(Object object, boolean bl) {
        h$_l h$_l = this.nullintnew.o00000("", object);
        if (h$_l == null) {
            h$_f.thisObject(3);
        }
        return h$_l;
    }

    private AssertionError \u00f500000(Object object, Object object2) {
        AssertionError assertionError = (AssertionError)((Object)h.\u00d200000((Throwable)((Object)new AssertionError((Object)("Race condition detected on input " + object + ". Old value is " + object2 + " under " + this.nullintnew)))));
        if (assertionError == null) {
            h$_f.thisObject(4);
        }
        return assertionError;
    }

    private AssertionError if(Object object, Object object2) {
        return (AssertionError)((Object)h.\u00d200000((Throwable)((Object)new AssertionError((Object)("Inconsistent key detected. " + (Object)((Object)h$_b.o00000) + " is expected, was: " + object2 + ", most probably race condition detected on input " + object + " under " + this.nullintnew)))));
    }

    private AssertionError o00000(Object object, Throwable throwable) {
        return (AssertionError)((Object)h.\u00d200000((Throwable)((Object)new AssertionError("Unable to remove " + object + " under " + this.nullintnew, throwable))));
    }

    @Override
    public boolean Stringsuper(Object object) {
        return (object = this.o\u00d2\u00d4000.get(object)) != null && object != h$_b.o00000;
    }

    protected h \u00f5oo000() {
        return this.nullintnew;
    }

    private static /* synthetic */ void thisObject(int n2) {
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
            case 3: 
            case 4: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 3: 
            case 4: {
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
            case 3: 
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "recursionDetected";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "raceCondition";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 3: 
            case 4: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 3: 
            case 4: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

