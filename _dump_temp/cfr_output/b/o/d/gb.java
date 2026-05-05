/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.e.f;
import b.o.e.g;
import b.o.e.h;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class gb {
    private static final Object[] o00000 = new Object[0];
    private static final int new = 0x7FFFFFFD;

    public static final Object[] o00000(Collection object) {
        int n2 = object.size();
        if (n2 == 0) {
            return o00000;
        }
        if (!(object = object.iterator()).hasNext()) {
            return o00000;
        }
        Object[] objectArray = new Object[n2];
        int n3 = 0;
        while (true) {
            objectArray[n3++] = object.next();
            if (n3 >= objectArray.length) {
                if (!object.hasNext()) {
                    return objectArray;
                }
                int n4 = n3 * 3 + 1 >>> 1;
                if (n4 <= n3) {
                    if (n3 >= 0x7FFFFFFD) {
                        throw new OutOfMemoryError();
                    }
                    n4 = 0x7FFFFFFD;
                }
                objectArray = Arrays.copyOf(objectArray, n4);
                continue;
            }
            if (!object.hasNext()) break;
        }
        return Arrays.copyOf(objectArray, n3);
    }

    public static final Object[] o00000(Collection collection, Object[] objectArray) {
        if (objectArray == null) {
            throw new NullPointerException();
        }
        int n2 = collection.size();
        if (n2 == 0) {
            if (objectArray.length > 0) {
                objectArray[0] = null;
            }
            return objectArray;
        }
        Iterator iterator = collection.iterator();
        if (!iterator.hasNext()) {
            if (objectArray.length > 0) {
                objectArray[0] = null;
            }
            return objectArray;
        }
        int n3 = n2;
        Object[] objectArray2 = n3 <= objectArray.length ? objectArray : (Object[])Array.newInstance(objectArray.getClass().getComponentType(), n3);
        n3 = 0;
        while (true) {
            objectArray2[n3++] = iterator.next();
            if (n3 >= objectArray2.length) {
                if (!iterator.hasNext()) {
                    return objectArray2;
                }
                n2 = n3 * 3 + 1 >>> 1;
                if (n2 <= n3) {
                    if (n3 >= 0x7FFFFFFD) {
                        throw new OutOfMemoryError();
                    }
                    n2 = 0x7FFFFFFD;
                }
                objectArray2 = Arrays.copyOf(objectArray2, n2);
                continue;
            }
            if (!iterator.hasNext()) break;
        }
        Object[] objectArray3 = objectArray2;
        if (objectArray2 == objectArray) {
            objectArray[n3] = null;
            return objectArray;
        }
        return Arrays.copyOf(objectArray3, n3);
    }

    private static final Object[] o00000(Collection object, h objectArray, g g2, f f2) {
        int n2 = object.size();
        if (n2 == 0) {
            return (Object[])objectArray.newreturn();
        }
        if (!(object = object.iterator()).hasNext()) {
            return (Object[])objectArray.newreturn();
        }
        objectArray = (Object[])g2.\u00f800000(n2);
        int n3 = 0;
        while (true) {
            objectArray[n3++] = object.next();
            if (n3 >= objectArray.length) {
                if (!object.hasNext()) {
                    return objectArray;
                }
                n2 = n3 * 3 + 1 >>> 1;
                if (n2 <= n3) {
                    if (n3 >= 0x7FFFFFFD) {
                        throw new OutOfMemoryError();
                    }
                    n2 = 0x7FFFFFFD;
                }
                objectArray = Arrays.copyOf(objectArray, n2);
                continue;
            }
            if (!object.hasNext()) break;
        }
        return (Object[])f2.o00000(objectArray, n3);
    }
}

