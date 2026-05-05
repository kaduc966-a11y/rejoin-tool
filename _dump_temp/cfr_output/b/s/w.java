/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.g.c;
import b.g.n;
import b.o.d.rb;
import b.o.e.g;
import b.s.mc;
import b.s.r;
import b.s.z;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class w
extends r {
    private static final boolean o00000(Collection collection, Object object) {
        return rb.oo0000(collection).remove(object);
    }

    private static final boolean \u00d300000(Collection collection, Collection collection2) {
        return rb.oo0000(collection).removeAll(collection2);
    }

    private static final boolean new(Collection collection, Collection collection2) {
        return rb.oo0000(collection).retainAll(collection2);
    }

    private static final void new(Collection collection, Object object) {
        collection.add(object);
    }

    private static final void \u00d500000(Collection collection, Iterable iterable) {
        mc.new(collection, iterable);
    }

    private static final void return(Collection collection, Object[] objectArray) {
        mc.\u00d500000(collection, objectArray);
    }

    private static final void \u00d500000(Collection collection, n n2) {
        mc.o00000(collection, n2);
    }

    private static final void \u00d300000(Collection collection, Object object) {
        collection.remove(object);
    }

    private static final void \u00d300000(Collection collection, Iterable iterable) {
        mc.\u00d400000(collection, iterable);
    }

    private static final void \u00d400000(Collection collection, Object[] objectArray) {
        mc.\u00d800000(collection, objectArray);
    }

    private static final void new(Collection collection, n n2) {
        mc.\u00d400000(collection, n2);
    }

    public static final boolean new(Collection collection, Iterable object) {
        if (object instanceof Collection) {
            return collection.addAll((Collection)object);
        }
        boolean bl = false;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!collection.add(e2)) continue;
            bl = true;
        }
        return bl;
    }

    public static final boolean o00000(Collection collection, n object) {
        boolean bl = false;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!collection.add(e2)) continue;
            bl = true;
        }
        return bl;
    }

    public static final boolean \u00d500000(Collection collection, Object[] objectArray) {
        return collection.addAll(z.\u00d500000(objectArray));
    }

    public static final Collection \u00d500000(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection)iterable;
        }
        return mc.\u00f5O0000(iterable);
    }

    public static final boolean \u00d400000(Collection collection, Iterable iterable) {
        return collection.removeAll(mc.\u00d500000(iterable));
    }

    public static final boolean \u00d400000(Collection collection, n object) {
        return !((Collection)(object = c.\u00d6o0000((n)object))).isEmpty() && collection.removeAll((Collection)object);
    }

    public static final boolean \u00d800000(Collection collection, Object[] objectArray) {
        return !(objectArray.length == 0) && collection.removeAll(z.\u00d500000(objectArray));
    }

    public static final boolean o00000(Collection collection, Iterable iterable) {
        return collection.retainAll(mc.\u00d500000(iterable));
    }

    public static final boolean \u00d300000(Collection collection, Object[] objectArray) {
        if (!(objectArray.length == 0)) {
            return collection.retainAll(z.\u00d500000(objectArray));
        }
        return w.\u00d800000(collection);
    }

    public static final boolean \u00d300000(Collection collection, n object) {
        if (!((Collection)(object = c.\u00d6o0000((n)object))).isEmpty()) {
            return collection.retainAll((Collection)object);
        }
        return w.\u00d800000(collection);
    }

    private static final boolean \u00d800000(Collection collection) {
        boolean bl = !collection.isEmpty();
        collection.clear();
        return bl;
    }

    public static final boolean o00000(Iterable iterable, g g2) {
        return w.o00000(iterable, g2, true);
    }

    public static final boolean new(Iterable iterable, g g2) {
        return w.o00000(iterable, g2, false);
    }

    private static final boolean o00000(Iterable object, g g2, boolean bl) {
        boolean bl2 = false;
        object = object.iterator();
        while (object.hasNext()) {
            if ((Boolean)g2.\u00f800000(object.next()) != bl) continue;
            object.remove();
            bl2 = true;
        }
        return bl2;
    }

    private static final Object o00000(List list, int n2) {
        return list.remove(n2);
    }

    public static final Object \u00f500000(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static final Object \u00f400000(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final Object if(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        List list2 = list;
        return list2.remove(mc.\u00d300000(list2));
    }

    public static final Object \u00d800000(List list) {
        if (list.isEmpty()) {
            return null;
        }
        List list2 = list;
        return list2.remove(mc.\u00d300000(list2));
    }

    public static final boolean new(List list, g g2) {
        return w.o00000(list, g2, true);
    }

    public static final boolean o00000(List list, g g2) {
        return w.o00000(list, g2, false);
    }

    private static final boolean o00000(List list, g g2, boolean bl) {
        if (!(list instanceof RandomAccess)) {
            return w.o00000(rb.\u00f6O0000(list), g2, bl);
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = mc.\u00d300000(list);
        if (n4 >= 0) {
            while (true) {
                Object e2;
                if ((Boolean)g2.\u00f800000(e2 = list.get(n3)) != bl) {
                    if (n2 != n3) {
                        list.set(n2, e2);
                    }
                    ++n2;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        if (n2 < list.size()) {
            n4 = n2;
            n3 = mc.\u00d300000(list);
            if (n4 <= n3) {
                while (true) {
                    list.remove(n3);
                    if (n3 == n4) break;
                    --n3;
                }
            }
            return true;
        }
        return false;
    }
}

