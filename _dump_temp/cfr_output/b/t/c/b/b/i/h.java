/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.b;
import b.t.c.b.b.i.c;
import b.t.c.b.b.i.d;
import b.t.c.b.b.i.e;
import b.t.c.b.b.i.f;
import b.t.c.b.b.i.g;
import b.t.c.b.b.i.h$1;
import b.t.c.b.b.i.h$4;
import b.t.c.b.b.i.h$5;
import b.t.c.b.b.i.h$_c;
import b.t.c.b.b.i.h$_e;
import b.t.c.b.b.i.h$_f;
import b.t.c.b.b.i.h$_g;
import b.t.c.b.b.i.h$_i;
import b.t.c.b.b.i.h$_j;
import b.t.c.b.b.i.h$_l;
import b.t.c.b.b.i.h$_m;
import b.t.c.b.b.i.i;
import b.t.c.b.b.i.j;
import b.t.c.b.b.i.l;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class h
implements l {
    private static final String Object = b.q.f.\u00d300000(h.class.getCanonicalName(), ".", "");
    public static final l \u00d500000 = new h$1("NO_LOCKS", h$_j.super, b.\u00d500000);
    protected final e \u00d200000;
    private final h$_j o00000;
    private final String \u00d400000;

    private h(String string, h$_j h$_j, e e2) {
        if (string == null) {
            h.o00000(4);
        }
        if (h$_j == null) {
            h.o00000(5);
        }
        if (e2 == null) {
            h.o00000(6);
        }
        this.\u00d200000 = e2;
        this.o00000 = h$_j;
        this.\u00d400000 = string;
    }

    public h(String string) {
        this(string, (Runnable)null, (b.o.e.g)null);
    }

    public h(String string, Runnable runnable, b.o.e.g g2) {
        this(string, h$_j.super, e.o00000.o00000(runnable, g2));
    }

    public String toString() {
        return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()) + " (" + this.\u00d400000 + ")";
    }

    @Override
    public j o00000(b.o.e.g g2) {
        if (g2 == null) {
            h.o00000(9);
        }
        j j2 = this.\u00d200000(g2, h.Object());
        if (j2 == null) {
            h.o00000(10);
        }
        return j2;
    }

    public j \u00d200000(b.o.e.g g2, ConcurrentMap concurrentMap) {
        if (g2 == null) {
            h.o00000(14);
        }
        if (concurrentMap == null) {
            h.o00000(15);
        }
        return new h$_i(this, concurrentMap, g2);
    }

    @Override
    public i \u00d200000(b.o.e.g g2) {
        if (g2 == null) {
            h.o00000(19);
        }
        i i2 = this.o00000(g2, h.Object());
        if (i2 == null) {
            h.o00000(20);
        }
        return i2;
    }

    public i o00000(b.o.e.g g2, ConcurrentMap concurrentMap) {
        if (g2 == null) {
            h.o00000(21);
        }
        if (concurrentMap == null) {
            h.o00000(22);
        }
        return new h$_f(this, concurrentMap, g2);
    }

    @Override
    public f o00000(b.o.e.h h2) {
        if (h2 == null) {
            h.o00000(23);
        }
        return new h$_m(this, h2);
    }

    @Override
    public f o00000(b.o.e.h h2, Object object) {
        if (h2 == null) {
            h.o00000(26);
        }
        if (object == null) {
            h.o00000(27);
        }
        h h3 = this;
        return new h$4(h3, h3, h2, object);
    }

    @Override
    public f o00000(b.o.e.h h2, b.o.e.g g2, b.o.e.g g3) {
        if (h2 == null) {
            h.o00000(28);
        }
        if (g3 == null) {
            h.o00000(29);
        }
        h h3 = this;
        return new h$5(h3, h3, h2, g2, g3);
    }

    @Override
    public c \u00d200000(b.o.e.h h2) {
        if (h2 == null) {
            h.o00000(30);
        }
        return new h$_g(this, h2);
    }

    @Override
    public Object Object(b.o.e.h object) {
        if (object == null) {
            h.o00000(34);
        }
        this.\u00d200000.\u00d200000();
        try {
            object = object.newreturn();
            return object;
        }
        catch (Throwable throwable) {
            throw this.o00000.o00000(throwable);
        }
        finally {
            this.\u00d200000.o00000();
        }
    }

    private static ConcurrentMap Object() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    protected h$_l o00000(String string, Object object) {
        if (string == null) {
            h.o00000(35);
        }
        throw (AssertionError)((Object)h.o00000((Throwable)((Object)new AssertionError((Object)("Recursion detected " + string + (object == null ? "" : "on input: ".concat(String.valueOf(object))) + " under " + this)))));
    }

    private static Throwable o00000(Throwable throwable) {
        List<StackTraceElement> list;
        if (throwable == null) {
            h.o00000(36);
        }
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        int n2 = stackTraceElementArray.length;
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (stackTraceElementArray[i2].getClassName().startsWith(Object)) continue;
            n3 = i2;
            break;
        }
        assert (n3 >= 0) : "This method should only be called on exceptions created in LockBasedStorageManager";
        List<StackTraceElement> list2 = list = Arrays.asList(stackTraceElementArray).subList(n3, n2);
        throwable.setStackTrace(list2.toArray(new StackTraceElement[list2.size()]));
        Throwable throwable2 = throwable;
        if (throwable2 == null) {
            h.o00000(37);
        }
        return throwable2;
    }

    @Override
    public d o00000() {
        return new h$_e(this, h.Object(), null);
    }

    @Override
    public g \u00d200000() {
        return new h$_c(this, h.Object(), null);
    }

    /* synthetic */ h(String string, h$_j h$_j, e e2, h$1 h$1) {
        this(string, h$_j, e2);
    }

    static /* synthetic */ h$_j o00000(h h2) {
        return h2.o00000;
    }

    static /* synthetic */ Throwable \u00d200000(Throwable throwable) {
        return h.o00000(throwable);
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
            case 10: 
            case 13: 
            case 20: 
            case 37: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 10: 
            case 13: 
            case 20: 
            case 37: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "debugText";
                break;
            }
            case 1: 
            case 3: 
            case 5: 
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "exceptionHandlingStrategy";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "lock";
                break;
            }
            case 9: 
            case 11: 
            case 14: 
            case 16: 
            case 19: 
            case 21: {
                objectArray2 = objectArray3;
                objectArray3[0] = "compute";
                break;
            }
            case 10: 
            case 13: 
            case 20: 
            case 37: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                break;
            }
            case 12: 
            case 17: 
            case 25: 
            case 27: {
                objectArray2 = objectArray3;
                objectArray3[0] = "onRecursiveCall";
                break;
            }
            case 15: 
            case 18: 
            case 22: {
                objectArray2 = objectArray3;
                objectArray3[0] = "map";
                break;
            }
            case 23: 
            case 24: 
            case 26: 
            case 28: 
            case 30: 
            case 31: 
            case 32: 
            case 34: {
                objectArray2 = objectArray3;
                objectArray3[0] = "computable";
                break;
            }
            case 29: 
            case 33: {
                objectArray2 = objectArray3;
                objectArray3[0] = "postCompute";
                break;
            }
            case 35: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 36: {
                objectArray2 = objectArray3;
                objectArray3[0] = "throwable";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                break;
            }
            case 10: 
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "createMemoizedFunction";
                break;
            }
            case 20: {
                objectArray = objectArray2;
                objectArray2[1] = "createMemoizedFunctionWithNullableValues";
                break;
            }
            case 37: {
                objectArray = objectArray2;
                objectArray2[1] = "sanitizeStackTrace";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "createWithExceptionHandling";
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 7: 
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "replaceExceptionHandling";
                break;
            }
            case 9: 
            case 11: 
            case 12: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                objectArray = objectArray;
                objectArray[2] = "createMemoizedFunction";
                break;
            }
            case 10: 
            case 13: 
            case 20: 
            case 37: {
                break;
            }
            case 19: 
            case 21: 
            case 22: {
                objectArray = objectArray;
                objectArray[2] = "createMemoizedFunctionWithNullableValues";
                break;
            }
            case 23: 
            case 24: 
            case 25: {
                objectArray = objectArray;
                objectArray[2] = "createLazyValue";
                break;
            }
            case 26: 
            case 27: {
                objectArray = objectArray;
                objectArray[2] = "createRecursionTolerantLazyValue";
                break;
            }
            case 28: 
            case 29: {
                objectArray = objectArray;
                objectArray[2] = "createLazyValueWithPostCompute";
                break;
            }
            case 30: {
                objectArray = objectArray;
                objectArray[2] = "createNullableLazyValue";
                break;
            }
            case 31: {
                objectArray = objectArray;
                objectArray[2] = "createRecursionTolerantNullableLazyValue";
                break;
            }
            case 32: 
            case 33: {
                objectArray = objectArray;
                objectArray[2] = "createNullableLazyValueWithPostCompute";
                break;
            }
            case 34: {
                objectArray = objectArray;
                objectArray[2] = "compute";
                break;
            }
            case 35: {
                objectArray = objectArray;
                objectArray[2] = "recursionDetectedDefault";
                break;
            }
            case 36: {
                objectArray = objectArray;
                objectArray[2] = "sanitizeStackTrace";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 10: 
            case 13: 
            case 20: 
            case 37: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

