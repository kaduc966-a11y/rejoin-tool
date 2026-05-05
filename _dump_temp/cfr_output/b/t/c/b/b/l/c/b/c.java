/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c.b;

import b.t.c.b.b.l.c.b.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class c {
    private static final boolean o00000;

    private c() {
    }

    private static void o00000(byte[] byArray, int n2) {
        if (byArray == null) {
            c.o00000(4);
        }
        int n3 = byArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            byArray[i2] = (byte)(byArray[i2] + n2 & 0x7F);
        }
    }

    public static byte[] \u00d300000(String[] stringArray) {
        if (stringArray == null) {
            c.o00000(7);
        }
        if (stringArray.length > 0 && !stringArray[0].isEmpty()) {
            char c2 = stringArray[0].charAt(0);
            if (c2 == '\u0000') {
                byte[] byArray = b.o00000(c.new(stringArray));
                if (byArray == null) {
                    c.o00000(8);
                }
                return byArray;
            }
            if (c2 == '\uffff') {
                stringArray = c.new(stringArray);
            }
        }
        byte[] byArray = c.o00000(stringArray);
        c.o00000(byArray, 127);
        return c.o00000(byArray);
    }

    private static String[] new(String[] stringArray) {
        if (stringArray == null) {
            c.o00000(9);
        }
        String[] stringArray2 = (String[])stringArray.clone();
        stringArray = stringArray2;
        stringArray2[0] = stringArray[0].substring(1);
        if (stringArray == null) {
            c.o00000(10);
        }
        return stringArray;
    }

    private static byte[] o00000(String[] stringArray) {
        if (stringArray == null) {
            c.o00000(11);
        }
        int n2 = 0;
        Object[] objectArray = stringArray;
        int n3 = stringArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            String string = objectArray[i2];
            assert (string.length() <= 65535) : "String is too long: " + string.length();
            n2 += string.length();
        }
        objectArray = new byte[n2];
        n3 = 0;
        String[] stringArray2 = stringArray;
        int n4 = stringArray.length;
        for (int i3 = 0; i3 < n4; ++i3) {
            String string = stringArray2[i3];
            int n5 = string.length();
            for (int i4 = 0; i4 < n5; ++i4) {
                objectArray[n3++] = (String)((byte)string.charAt(i4));
            }
        }
        return objectArray;
    }

    private static byte[] o00000(byte[] byArray) {
        if (byArray == null) {
            c.o00000(13);
        }
        int n2 = 7 * byArray.length / 8;
        byte[] byArray2 = new byte[n2];
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n5 = (byArray[n3] & 0xFF) >>> n4;
            int n6 = (byArray[++n3] & (1 << n4 + 1) - 1) << 7 - n4;
            byArray2[i2] = (byte)(n5 + n6);
            if (n4 == 6) {
                ++n3;
                n4 = 0;
                continue;
            }
            ++n4;
        }
        return byArray2;
    }

    static {
        String string;
        try {
            string = System.getProperty("kotlin.jvm.serialization.use8to7");
        }
        catch (SecurityException securityException) {
            string = null;
        }
        o00000 = "true".equals(string);
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
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "data";
                break;
            }
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "encodeBytes";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "encode8to7";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "splitBytesToStringArray";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "decodeBytes";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "dropMarker";
                break;
            }
            case 12: {
                objectArray = objectArray2;
                objectArray2[1] = "combineStringArrayIntoBytes";
                break;
            }
            case 14: {
                objectArray = objectArray2;
                objectArray2[1] = "decode7to8";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "encodeBytes";
                break;
            }
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                break;
            }
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "encode8to7";
                break;
            }
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "addModuloByte";
                break;
            }
            case 5: {
                objectArray = objectArray;
                objectArray[2] = "splitBytesToStringArray";
                break;
            }
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "decodeBytes";
                break;
            }
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "dropMarker";
                break;
            }
            case 11: {
                objectArray = objectArray;
                objectArray[2] = "combineStringArrayIntoBytes";
                break;
            }
            case 13: {
                objectArray = objectArray;
                objectArray[2] = "decode7to8";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 1: 
            case 3: 
            case 6: 
            case 8: 
            case 10: 
            case 12: 
            case 14: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

