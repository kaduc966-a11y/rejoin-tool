/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.e;

import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.e.o;

public class n
implements i {
    private final o \u00f4\u00d6o000;

    public n(o o2) {
        if (o2 == null) {
            n.returnnew(0);
        }
        this.\u00f4\u00d6o000 = o2;
    }

    @Override
    public o \u00d4\u00f80000() {
        o o2 = this.\u00f4\u00d6o000;
        if (o2 == null) {
            n.returnnew(1);
        }
        return o2;
    }

    private static /* synthetic */ void returnnew(int n2) {
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
                objectArray3[0] = "annotations";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "getAnnotations";
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

