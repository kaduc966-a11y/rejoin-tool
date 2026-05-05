/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.fc;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;

class b {
    public static final /* synthetic */ Object[] \u00d200000(Object[] objectArray) {
        Object[] objectArray2 = objectArray;
        if (objectArray == null) {
            fc.o00000(0, "T");
            objectArray2 = new Object[]{};
        }
        return objectArray2;
    }

    private static final String o00000(byte[] byArray, Charset charset) {
        return new String(byArray, charset);
    }

    public static final /* synthetic */ Object[] o00000(Collection collection) {
        fc.o00000(0, "T?");
        return collection.toArray(new Object[0]);
    }

    public static final Object[] o00000(Object[] objectArray, int n2) {
        return (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n2);
    }

    public static final void o00000(int n2, int n3) {
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("toIndex (" + n2 + ") is greater than size (" + n3 + ").");
        }
    }

    public static final int o00000(Object[] objectArray) {
        return Arrays.deepHashCode(objectArray);
    }
}

