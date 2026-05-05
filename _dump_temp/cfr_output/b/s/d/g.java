/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.fc;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class g {
    public static final Object[] o00000(int n2) {
        if (!(n2 >= 0)) {
            String string = "capacity must be non-negative.";
            throw new IllegalArgumentException(string.toString());
        }
        return new Object[n2];
    }

    private static final String \u00d200000(Object[] objectArray, int n2, int n3, Collection collection) {
        StringBuilder stringBuilder = new StringBuilder(2 + n3 * 3);
        stringBuilder.append("[");
        for (int i2 = 0; i2 < n3; ++i2) {
            Object object;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((object = objectArray[n2 + i2]) == collection) {
                stringBuilder.append("(this Collection)");
                continue;
            }
            stringBuilder.append(object);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static final int o00000(Object[] objectArray, int n2, int n3) {
        int n4 = 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            Object object;
            Object object2 = object = objectArray[n2 + i2];
            n4 = n4 * 31 + (object2 != null ? object2.hashCode() : 0);
        }
        return n4;
    }

    private static final boolean o00000(Object[] objectArray, int n2, int n3, List list) {
        if (n3 != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            if (fc.o00000(objectArray[n2 + i2], list.get(i2))) continue;
            return false;
        }
        return true;
    }

    public static final Object[] \u00d200000(Object[] objectArray, int n2) {
        return Arrays.copyOf(objectArray, n2);
    }

    public static final void o00000(Object[] objectArray, int n2) {
        objectArray[n2] = null;
    }

    public static final void Object(Object[] objectArray, int n2, int n3) {
        while (n2 < n3) {
            g.o00000(objectArray, n2);
            ++n2;
        }
    }

    public static final /* synthetic */ int \u00d200000(Object[] objectArray, int n2, int n3) {
        return g.o00000(objectArray, n2, n3);
    }

    public static final /* synthetic */ String o00000(Object[] objectArray, int n2, int n3, Collection collection) {
        return g.\u00d200000(objectArray, n2, n3, collection);
    }

    public static final /* synthetic */ boolean \u00d200000(Object[] objectArray, int n2, int n3, List list) {
        return g.o00000(objectArray, n2, n3, list);
    }
}

