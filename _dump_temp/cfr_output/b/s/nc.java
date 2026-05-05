/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.b.f;
import b.e.m;
import b.o.e.g;
import b.o.e.h;
import b.s.dc;
import b.s.ib;
import b.s.mc;
import b.s.nc$_b$1;
import b.s.oc;
import b.s.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class nc
extends ib {
    public static final Collection new(Object[] objectArray, boolean bl) {
        return new dc(objectArray, bl);
    }

    public static /* synthetic */ Collection o00000(Object[] objectArray, boolean bl, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        return mc.new(objectArray, bl);
    }

    public static final List \u00d500000() {
        return oc.\u00f40\u00f6000;
    }

    public static final List new(Object ... objectArray) {
        if (objectArray.length > 0) {
            return z.\u00d500000(objectArray);
        }
        return mc.\u00d500000();
    }

    private static final List \u00d300000() {
        return mc.\u00d500000();
    }

    private static final List new() {
        return new ArrayList();
    }

    private static final ArrayList return() {
        return new ArrayList();
    }

    public static final List \u00d400000(Object ... objectArray) {
        if (objectArray.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(mc.new(objectArray, true));
    }

    public static final ArrayList \u00d300000(Object ... objectArray) {
        if (objectArray.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(mc.new(objectArray, true));
    }

    public static final List new(Object object) {
        Object object2 = object;
        if (object2 != null) {
            return mc.o00000(object2);
        }
        return mc.\u00d500000();
    }

    public static final List \u00d500000(Object ... objectArray) {
        return z.\u00d2\u00d20000(objectArray);
    }

    private static final List \u00d400000(int n2, g g2) {
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        int n3 = 0;
        while (n3 < n2) {
            int n4 = n3++;
            arrayList.add(g2.\u00f800000(n4));
        }
        return arrayList;
    }

    private static final List \u00d300000(int n2, g g2) {
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        int n3 = 0;
        while (n3 < n2) {
            int n4 = n3++;
            arrayList.add(g2.\u00f800000(n4));
        }
        return arrayList;
    }

    private static final List new(g g2) {
        List list = mc.o00000();
        g2.\u00f800000(list);
        return mc.o00000(list);
    }

    private static final List new(int n2, g g2) {
        List list = mc.o00000(n2);
        g2.\u00f800000(list);
        return mc.o00000(list);
    }

    public static final m new(Collection collection) {
        return new m(0, collection.size() - 1);
    }

    public static final int \u00d300000(List list) {
        return list.size() - 1;
    }

    private static final boolean \u00d400000(Collection collection) {
        return !collection.isEmpty();
    }

    private static final boolean \u00d500000(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    private static final Collection return(Collection collection) {
        Collection collection2 = collection;
        if (collection2 == null) {
            collection2 = mc.\u00d500000();
        }
        return collection2;
    }

    private static final List \u00d400000(List list) {
        List list2 = list;
        if (list2 == null) {
            list2 = mc.\u00d500000();
        }
        return list2;
    }

    private static final Object o00000(Collection collection, h h2) {
        if (collection.isEmpty()) {
            return h2.newreturn();
        }
        return collection;
    }

    private static final boolean o00000(Collection collection, Collection collection2) {
        return collection.containsAll(collection2);
    }

    public static final List o00000(Iterable iterable, f f2) {
        iterable = mc.O\u00d40000(iterable);
        mc.o00000((List)iterable, f2);
        return iterable;
    }

    public static final List new(List list) {
        switch (list.size()) {
            case 0: {
                return mc.\u00d500000();
            }
            case 1: {
                return mc.o00000(list.get(0));
            }
        }
        return list;
    }

    public static final int o00000(List list, Comparable comparable, int n2, int n3) {
        nc.o00000(list.size(), n2, n3);
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = b.y.f.super((Comparable)list.get(n4), comparable);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public static /* synthetic */ int o00000(List list, Comparable comparable, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = list.size();
        }
        return mc.o00000(list, comparable, n2, n3);
    }

    public static final int o00000(List list, Object object, Comparator comparator, int n2, int n3) {
        nc.o00000(list.size(), n2, n3);
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            Object e2 = list.get(n4);
            int n5 = comparator.compare(e2, object);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public static /* synthetic */ int o00000(List list, Object object, Comparator comparator, int n2, int n3, int n4, Object object2) {
        if ((n4 & 4) != 0) {
            n2 = 0;
        }
        if ((n4 & 8) != 0) {
            n3 = list.size();
        }
        return mc.o00000(list, object, comparator, n2, n3);
    }

    public static final int o00000(List list, Comparable comparable, int n2, int n3, g g2) {
        return mc.o00000(list, n2, n3, new nc$_b$1(g2, comparable));
    }

    public static /* synthetic */ int o00000(List list, Comparable comparable, int n2, int n3, g g2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = list.size();
        }
        return mc.o00000(list, n2, n3, new nc$_b$1(g2, comparable));
    }

    public static final int o00000(List list, int n2, int n3, g g2) {
        nc.o00000(list.size(), n2, n3);
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            Object e2 = list.get(n4);
            int n5 = ((Number)g2.\u00f800000(e2)).intValue();
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public static /* synthetic */ int o00000(List list, int n2, int n3, g g2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = list.size();
        }
        return mc.o00000(list, n2, n3, g2);
    }

    private static final void o00000(int n2, int n3, int n4) {
        if (n3 > n4) {
            throw new IllegalArgumentException("fromIndex (" + n3 + ") is greater than toIndex (" + n4 + ").");
        }
        if (n3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + n3 + ") is less than zero.");
        }
        if (n4 > n2) {
            throw new IndexOutOfBoundsException("toIndex (" + n4 + ") is greater than size (" + n2 + ").");
        }
    }

    public static final void \u00d800000() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void \u00d400000() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final Object[] \u00d300000(Collection object) {
        if (object.isEmpty()) {
            return new Object[0];
        }
        Object[] objectArray = new Object[object.size()];
        object = object.iterator();
        int n2 = 0;
        while (object.hasNext()) {
            objectArray[n2++] = object.next();
        }
        return objectArray;
    }

    public static final Object[] new(Collection collection, Object[] objectArray) {
        if (collection.isEmpty()) {
            return mc.o00000(0, objectArray);
        }
        objectArray = objectArray.length < collection.size() ? z.o00000(objectArray, collection.size()) : objectArray;
        Iterator iterator = collection.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            objectArray[n2++] = iterator.next();
        }
        return mc.o00000(collection.size(), objectArray);
    }
}

