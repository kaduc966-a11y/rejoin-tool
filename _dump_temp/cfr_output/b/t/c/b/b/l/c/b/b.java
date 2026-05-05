/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c.b;

import b.m;

public final class b {
    public static final byte[] o00000(String[] stringArray) {
        int n2;
        Object[] objectArray = stringArray;
        int n3 = 0;
        int n4 = objectArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            String string;
            String string2 = string = objectArray[n2];
            int n5 = string2.length();
            n3 += n5;
        }
        objectArray = new byte[n3];
        n3 = 0;
        n4 = stringArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            String string = stringArray[n2];
            int n6 = string.length();
            for (int i2 = 0; i2 < n6; ++i2) {
                objectArray[n3++] = (String)((byte)string.charAt(i2));
            }
        }
        int n7 = n2 = n3 == objectArray.length ? 1 : 0;
        if (m.new && n2 == 0) {
            String string = "Should have reached the end";
            throw new AssertionError((Object)string);
        }
        return objectArray;
    }
}

