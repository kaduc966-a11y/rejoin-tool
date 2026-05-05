/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.k.b;
import b.t.c.b.b.q.e.n;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.wb;

public abstract class p
extends n
implements wb {
    private final f \u00f5\u00d6o000;

    public p(o o2, f f2) {
        if (o2 == null) {
            p.\u00d8\u00d20000(0);
        }
        if (f2 == null) {
            p.\u00d8\u00d20000(1);
        }
        super(o2);
        this.\u00f5\u00d6o000 = f2;
    }

    @Override
    public f \u00d5\u00f80000() {
        f f2 = this.\u00f5\u00d6o000;
        if (f2 == null) {
            p.\u00d8\u00d20000(2);
        }
        return f2;
    }

    @Override
    public wb returnnull() {
        return this;
    }

    public String toString() {
        return p.o00000(this);
    }

    public static String o00000(wb wb2) {
        String string;
        if (wb2 == null) {
            p.\u00d8\u00d20000(4);
        }
        try {
            string = b.class.super(wb2) + "[" + wb2.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(wb2)) + "]";
        }
        catch (Throwable throwable) {
            String string2 = wb2.getClass().getSimpleName() + " " + wb2.\u00d5\u00f80000();
            if (string2 == null) {
                p.\u00d8\u00d20000(6);
            }
            return string2;
        }
        if (string == null) {
            p.\u00d8\u00d20000(5);
        }
        return string;
    }

    private static /* synthetic */ void \u00d8\u00d20000(int n2) {
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
            case 2: 
            case 3: 
            case 5: 
            case 6: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: {
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
                objectArray3[0] = "name";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptor";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "getName";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 5: 
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "toString";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: {
                break;
            }
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "toString";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 2: 
            case 3: 
            case 5: 
            case 6: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

