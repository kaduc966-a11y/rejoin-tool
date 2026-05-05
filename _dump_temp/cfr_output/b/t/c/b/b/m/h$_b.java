/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.t.c.b.b.m.h$1;

final class h$_b {
    private final Throwable o00000;

    private h$_b(Throwable throwable) {
        if (throwable == null) {
            h$_b.o00000(0);
        }
        this.o00000 = throwable;
    }

    public final Throwable o00000() {
        Throwable throwable = this.o00000;
        if (throwable == null) {
            h$_b.o00000(1);
        }
        return throwable;
    }

    public final String toString() {
        return this.o00000.toString();
    }

    /* synthetic */ h$_b(Throwable throwable, h$1 h$1) {
        this(throwable);
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
                objectArray3[0] = "throwable";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "getThrowable";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
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

