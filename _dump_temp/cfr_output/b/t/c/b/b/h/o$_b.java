/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.gc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.zb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class o$_b
extends gc {
    private final String \u00d5\u00f4\u00d8000;

    public o$_b(String string) {
        this.\u00d5\u00f4\u00d8000 = string;
    }

    @Override
    protected ib \u00d3\u00f4\u00d2000() {
        throw new IllegalStateException(this.\u00d5\u00f4\u00d8000);
    }

    @Override
    public ib new(zb zb2) {
        if (zb2 == null) {
            o$_b.O\u00d60000(0);
        }
        throw new IllegalStateException(this.\u00d5\u00f4\u00d8000);
    }

    @Override
    public ib \u00d4o0000(boolean bl) {
        throw new IllegalStateException(this.\u00d5\u00f4\u00d8000);
    }

    @Override
    public String toString() {
        String string = this.\u00d5\u00f4\u00d8000;
        if (string == null) {
            o$_b.O\u00d60000(1);
        }
        return string;
    }

    @Override
    public gc \u00d300000(ib ib2) {
        if (ib2 == null) {
            o$_b.O\u00d60000(2);
        }
        throw new IllegalStateException(this.\u00d5\u00f4\u00d8000);
    }

    public o$_b \u00d8O0000(b b2) {
        if (b2 == null) {
            o$_b.O\u00d60000(3);
        }
        return this;
    }

    private static /* synthetic */ void O\u00d60000(int n2) {
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
            case 4: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 1: 
            case 4: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newAttributes";
                break;
            }
            case 1: 
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "delegate";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlinTypeRefiner";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "toString";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "refine";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "replaceAttributes";
                break;
            }
            case 1: 
            case 4: {
                break;
            }
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "replaceDelegate";
                break;
            }
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "refine";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 1: 
            case 4: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

