/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.t.c.b.b.m.g;
import b.t.c.b.b.m.h$1;
import b.t.c.b.b.m.h$_b;
import b.t.c.b.b.m.h$_c;

public class h {
    private static final Object o00000 = new h$1();
    public static volatile boolean \u00d200000 = false;

    public static Object String(Object object) {
        if (object == null) {
            h.o00000(0);
        }
        if (object == o00000) {
            return null;
        }
        return object;
    }

    public static Object \u00d200000(Object object) {
        if (object == null) {
            Object object2 = o00000;
            if (object2 == null) {
                h.o00000(1);
            }
            return object2;
        }
        Object object3 = object;
        if (object3 == null) {
            h.o00000(2);
        }
        return object3;
    }

    public static Object o00000(Throwable throwable) {
        if (throwable == null) {
            h.o00000(3);
        }
        return new h$_b(throwable, null);
    }

    public static Object o00000(Object object) {
        if (object == null) {
            h.o00000(4);
        }
        return h.String(h.\u00d300000(object));
    }

    public static Object \u00d300000(Object object) {
        if (object instanceof h$_b) {
            object = ((h$_b)object).o00000();
            if (\u00d200000 && g.new((Throwable)object)) {
                throw new h$_c((Throwable)object);
            }
            throw g.o00000((Throwable)object);
        }
        return object;
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
                objectArray3[0] = "value";
                break;
            }
            case 1: 
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "throwable";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
                break;
            }
            case 1: 
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "escapeNull";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "unescapeNull";
                break;
            }
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "escapeThrowable";
                break;
            }
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "unescapeExceptionOrNull";
            }
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

