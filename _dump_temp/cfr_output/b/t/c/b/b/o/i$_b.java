/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.t.c.b.b.o.i$_b$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class i$_b {
    private static final i$_b super = new i$_b(i$_b$_b.\u00d400000, "SUCCESS");
    private final i$_b$_b \u00d300000;
    private final String \u00d200000;

    public static i$_b o00000() {
        i$_b i$_b = super;
        if (i$_b == null) {
            i$_b.o00000(0);
        }
        return i$_b;
    }

    public static i$_b \u00d200000(String string) {
        if (string == null) {
            i$_b.o00000(1);
        }
        return new i$_b(i$_b$_b.\u00d200000, string);
    }

    public static i$_b o00000(String string) {
        if (string == null) {
            i$_b.o00000(2);
        }
        return new i$_b(i$_b$_b.\u00d300000, string);
    }

    public i$_b(i$_b$_b i$_b$_b, String string) {
        if (i$_b$_b == null) {
            i$_b.o00000(3);
        }
        if (string == null) {
            i$_b.o00000(4);
        }
        this.\u00d300000 = i$_b$_b;
        this.\u00d200000 = string;
    }

    public i$_b$_b \u00d200000() {
        i$_b$_b i$_b$_b = this.\u00d300000;
        if (i$_b$_b == null) {
            i$_b.o00000(5);
        }
        return i$_b$_b;
    }

    public String toString() {
        return (Object)((Object)this.\u00d300000) + ": " + this.\u00d200000;
    }

    private static /* synthetic */ void o00000(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "@NotNull method %s.%s must not return null";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
        }
        switch (n2) {
            default: {
                n3 = 2;
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                n3 = 3;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            }
            case 1: 
            case 2: 
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "debugMessage";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "success";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "success";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getResult";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "getDebugMessage";
            }
        }
        switch (n2) {
            default: {
                break;
            }
            case 1: {
                objectArray = objectArray;
                objectArray[2] = "incompatible";
                break;
            }
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "conflict";
                break;
            }
            case 3: 
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalStateException(string2);
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                runtimeException = new IllegalArgumentException(string2);
            }
        }
        throw runtimeException;
    }
}

