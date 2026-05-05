/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.h;

import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;

public class b {
    private final String o00000;
    private k \u00d200000;

    public static b o00000(String string) {
        if (string == null) {
            b.o00000(0);
        }
        return new b(string);
    }

    public static b o00000(d d2) {
        if (d2 == null) {
            b.o00000(1);
        }
        return new b(b.\u00d200000(d2));
    }

    public static String \u00d200000(d object) {
        if (object == null) {
            b.o00000(2);
        }
        k k2 = ((d)object).\u00d800000();
        object = ((d)object).\u00d400000().super().replace('.', '$');
        Object object2 = k2.\u00d600000() ? object : k2.super().replace('.', '/') + "/" + (String)object;
        if (object2 == null) {
            b.o00000(3);
        }
        return object2;
    }

    public static b o00000(k k2) {
        if (k2 == null) {
            b.o00000(4);
        }
        b b2 = new b(k2.super().replace('.', '/'));
        new b(k2.super().replace('.', '/')).\u00d200000 = k2;
        return b2;
    }

    private b(String string) {
        if (string == null) {
            b.o00000(7);
        }
        this.o00000 = string;
    }

    public k o00000() {
        return new k(this.o00000.replace('/', '.'));
    }

    public k Object() {
        int n2 = this.o00000.lastIndexOf("/");
        if (n2 == -1) {
            k k2 = k.\u00d200000;
            if (k2 == null) {
                b.o00000(9);
            }
            return k2;
        }
        return new k(this.o00000.substring(0, n2).replace('/', '.'));
    }

    public String \u00d200000() {
        String string = this.o00000;
        if (string == null) {
            b.o00000(10);
        }
        return string;
    }

    public String toString() {
        return this.o00000;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return this.o00000.equals(((b)object).o00000);
    }

    public int hashCode() {
        return this.o00000.hashCode();
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
            case 3: 
            case 5: 
            case 8: 
            case 9: 
            case 10: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 3: 
            case 5: 
            case 8: 
            case 9: 
            case 10: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "internalName";
                break;
            }
            case 1: 
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classId";
                break;
            }
            case 3: 
            case 5: 
            case 8: 
            case 9: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            }
            case 4: 
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fqName";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "internalNameByClassId";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "byFqNameWithoutInnerClasses";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "getFqNameForClassNameWithoutDollars";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "getPackageFqName";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getInternalName";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "byInternalName";
                break;
            }
            case 1: {
                objectArray = objectArray;
                objectArray[2] = "byClassId";
                break;
            }
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "internalNameByClassId";
                break;
            }
            case 3: 
            case 5: 
            case 8: 
            case 9: 
            case 10: {
                break;
            }
            case 4: 
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "byFqNameWithoutInnerClasses";
                break;
            }
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 3: 
            case 5: 
            case 8: 
            case 9: 
            case 10: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

