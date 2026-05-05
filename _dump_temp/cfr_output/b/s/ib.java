/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.fc;
import b.o.d.gb;
import b.o.e.g;
import b.s.d.f;
import b.s.mc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ib {
    public static final List o00000(Object object) {
        return Collections.singletonList(object);
    }

    private static final ArrayList o00000(Object[] objectArray) {
        return new ArrayList(mc.new(objectArray, true));
    }

    private static final List o00000(g g2) {
        List list = mc.o00000();
        g2.\u00f800000(list);
        return mc.o00000(list);
    }

    private static final List o00000(int n2, g g2) {
        List list = mc.o00000(n2);
        g2.\u00f800000(list);
        return mc.o00000(list);
    }

    public static final List o00000() {
        return new f(0, 1, null);
    }

    public static final List o00000(int n2) {
        return new f(n2);
    }

    public static final List o00000(List list) {
        return ((f)list).returnthisnew();
    }

    private static final List o00000(Enumeration enumeration) {
        return Collections.list(enumeration);
    }

    public static final List o00000(Iterable iterable) {
        iterable = mc.O\u00d40000(iterable);
        Collections.shuffle(iterable);
        return iterable;
    }

    public static final List o00000(Iterable iterable, Random random) {
        iterable = mc.O\u00d40000(iterable);
        Collections.shuffle(iterable, random);
        return iterable;
    }

    private static final Object[] o00000(Collection collection) {
        return gb.o00000(collection);
    }

    private static final Object[] o00000(Collection collection, Object[] objectArray) {
        return gb.o00000(collection, objectArray);
    }

    public static final Object[] o00000(int n2, Object[] objectArray) {
        if (n2 < objectArray.length) {
            objectArray[n2] = null;
        }
        return objectArray;
    }

    public static final Object[] o00000(Object[] objectArray, boolean bl) {
        if (bl && fc.o00000(objectArray.getClass(), Object[].class)) {
            return objectArray;
        }
        return Arrays.copyOf(objectArray, objectArray.length, Object[].class);
    }

    private static final int new(int n2) {
        if (n2 < 0) {
            mc.\u00d800000();
        }
        return n2;
    }

    private static final int \u00d300000(int n2) {
        if (n2 < 0) {
            mc.\u00d400000();
        }
        return n2;
    }
}

