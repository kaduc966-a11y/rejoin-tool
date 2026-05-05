/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f
implements Comparable {
    private final String \u00d200000;
    private final boolean o00000;

    private f(String string, boolean bl) {
        if (string == null) {
            f.super(0);
        }
        this.\u00d200000 = string;
        this.o00000 = bl;
    }

    public final String \u00d400000() {
        String string = this.\u00d200000;
        if (string == null) {
            f.super(1);
        }
        return string;
    }

    public final String \u00d300000() {
        if (this.o00000) {
            throw new IllegalStateException("not identifier: ".concat(String.valueOf(this)));
        }
        String string = this.\u00d400000();
        if (string == null) {
            f.super(2);
        }
        return string;
    }

    public final boolean super() {
        return this.o00000;
    }

    public final String \u00d200000() {
        if (this.super()) {
            String string = this.\u00d400000().substring(1, this.\u00d400000().length() - 1);
            if (string == null) {
                f.super(3);
            }
            return string;
        }
        String string = this.\u00d400000();
        if (string == null) {
            f.super(4);
        }
        return string;
    }

    public final int super(f f2) {
        return this.\u00d200000.compareTo(f2.\u00d200000);
    }

    public static f \u00d300000(String string) {
        if (string == null) {
            f.super(5);
        }
        return new f(string, false);
    }

    public static boolean super(String string) {
        if (string == null) {
            f.super(6);
        }
        if (string.isEmpty() || string.startsWith("<")) {
            return false;
        }
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != '.' && c2 != '/' && c2 != '\\') continue;
            return false;
        }
        return true;
    }

    public static f \u00d400000(String string) {
        if (string == null) {
            f.super(8);
        }
        if (!string.startsWith("<")) {
            throw new IllegalArgumentException("special name must start with '<': ".concat(String.valueOf(string)));
        }
        return new f(string, true);
    }

    public static f \u00d200000(String string) {
        if (string == null) {
            f.super(9);
        }
        if (string.startsWith("<")) {
            return f.\u00d400000(string);
        }
        return f.\u00d300000(string);
    }

    public final String toString() {
        return this.\u00d200000;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        object = (f)object;
        if (this.o00000 != ((f)object).o00000) {
            return false;
        }
        return this.\u00d200000.equals(((f)object).\u00d200000);
    }

    public final int hashCode() {
        int n2 = this.\u00d200000.hashCode();
        return 31 * n2 + (this.o00000 ? 1 : 0);
    }

    private static /* synthetic */ void super(int n2) {
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
            case 2: 
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
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "asString";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "getIdentifier";
                break;
            }
            case 3: 
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "asStringStripSpecialMarkers";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                break;
            }
            case 5: {
                objectArray = objectArray;
                objectArray[2] = "identifier";
                break;
            }
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "isValidIdentifier";
                break;
            }
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "identifierIfValid";
                break;
            }
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "special";
                break;
            }
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "guessByFirstCharacter";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

