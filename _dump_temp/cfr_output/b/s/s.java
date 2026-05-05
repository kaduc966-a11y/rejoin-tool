/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.g.n;
import b.o.e.f;
import b.o.e.g;
import b.qb;
import b.s.i;
import b.s.mc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class s
extends i {
    private static final Object \u00d2\u00d20000(Map object, g g2) {
        Object object2;
        block3: {
            object = object.entrySet().iterator();
            while (object.hasNext()) {
                object2 = g2.\u00f800000((Map.Entry)object.next());
                if (object2 == null) {
                    continue;
                }
                break block3;
            }
            object2 = null;
        }
        if (object2 == null) {
            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
        }
        return object2;
    }

    private static final Object \u00d6o0000(Map object, g g2) {
        for (Map.Entry entry : object.entrySet()) {
            Object object2 = g2.\u00f800000(entry);
            if (object2 == null) continue;
            return object2;
        }
        return null;
    }

    public static final List \u00d2O0000(Map arrayList) {
        if (arrayList.size() == 0) {
            return mc.\u00d500000();
        }
        Iterator iterator = arrayList.entrySet().iterator();
        if (!iterator.hasNext()) {
            return mc.\u00d500000();
        }
        Map.Entry entry = iterator.next();
        if (!iterator.hasNext()) {
            arrayList = entry;
            return mc.o00000(new qb(arrayList.getKey(), arrayList.getValue()));
        }
        arrayList = new ArrayList<qb>(arrayList.size());
        arrayList.add(new qb(entry.getKey(), entry.getValue()));
        do {
            entry = iterator.next();
            arrayList.add(new qb(entry.getKey(), entry.getValue()));
        } while (iterator.hasNext());
        return arrayList;
    }

    public static final List oO0000(Map object, g g2) {
        Collection collection = new ArrayList();
        for (Map.Entry entry : object.entrySet()) {
            Iterable object2 = (Iterable)g2.\u00f800000(entry);
            mc.new(collection, object2);
        }
        return (List)collection;
    }

    public static final List \u00d2O0000(Map object, g g2) {
        Collection collection = new ArrayList();
        for (Map.Entry entry : object.entrySet()) {
            n object2 = (n)g2.\u00f800000(entry);
            mc.o00000(collection, object2);
        }
        return (List)collection;
    }

    public static final Collection \u00d200000(Map object, Collection collection, g g2) {
        for (Map.Entry entry : object.entrySet()) {
            Iterable object2 = (Iterable)g2.\u00f800000(entry);
            mc.new(collection, object2);
        }
        return collection;
    }

    public static final Collection \u00d400000(Map object, Collection collection, g g2) {
        for (Map.Entry entry : object.entrySet()) {
            n object2 = (n)g2.\u00f800000(entry);
            mc.o00000(collection, object2);
        }
        return collection;
    }

    public static final List OO0000(Map object, g g2) {
        Iterator object2 = object;
        object = new ArrayList(object.size());
        for (Map.Entry entry : object2.entrySet()) {
            object.add((Object)g2.\u00f800000(entry));
        }
        return (List)((Object)object);
    }

    public static final List \u00d5o0000(Map object, g g2) {
        Collection collection = new ArrayList();
        for (Map.Entry entry : object.entrySet()) {
            Object object2;
            if (g2.\u00f800000(entry) == null) continue;
            collection.add(object2);
        }
        return (List)collection;
    }

    public static final Collection o00000(Map object, Collection collection, g g2) {
        for (Map.Entry entry : object.entrySet()) {
            Object object2;
            if (g2.\u00f800000(entry) == null) continue;
            collection.add(object2);
        }
        return collection;
    }

    public static final Collection Object(Map object, Collection collection, g g2) {
        for (Map.Entry entry : object.entrySet()) {
            collection.add(g2.\u00f800000(entry));
        }
        return collection;
    }

    public static final boolean O\u00d20000(Map object, g g2) {
        if (object.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : object.entrySet()) {
            if (((Boolean)g2.\u00f800000(entry)).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static final boolean public(Map map) {
        return !map.isEmpty();
    }

    public static final boolean \u00f4o0000(Map object, g g2) {
        if (object.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : object.entrySet()) {
            if (!((Boolean)g2.\u00f800000(entry)).booleanValue()) continue;
            return true;
        }
        return false;
    }

    private static final int \u00d4O0000(Map map) {
        return map.size();
    }

    public static final int supersuper(Map object, g g2) {
        if (object.isEmpty()) {
            return 0;
        }
        int n2 = 0;
        for (Map.Entry entry : object.entrySet()) {
            if (!((Boolean)g2.\u00f800000(entry)).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }

    public static final void dosuper(Map object, g g2) {
        for (Map.Entry entry : object.entrySet()) {
            g2.\u00f800000(entry);
        }
    }

    private static final Map.Entry oo0000(Map object, g g2) {
        Object e2;
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e3 = object.next();
        if (!object.hasNext()) {
            e2 = e3;
        } else {
            Comparable comparable = (Comparable)g2.\u00f800000(e3);
            do {
                Object e4;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e4 = object.next())) >= 0) continue;
                e3 = e4;
                comparable = comparable2;
            } while (object.hasNext());
            e2 = e3;
        }
        return (Map.Entry)e2;
    }

    private static final Map.Entry public(Map object, g g2) {
        Object v0;
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            v0 = null;
        } else {
            Object e2 = object.next();
            if (!object.hasNext()) {
                v0 = e2;
            } else {
                Comparable comparable = (Comparable)g2.\u00f800000(e2);
                do {
                    Object e3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) >= 0) continue;
                    e2 = e3;
                    comparable = comparable2;
                } while (object.hasNext());
                v0 = e2;
            }
        }
        return v0;
    }

    private static final double interfacesuper(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    private static final float \u00f6o0000(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.max(f2, f3);
        }
        return f2;
    }

    private static final Comparable \u00f6O0000(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)g2.\u00f800000(object.next());
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    private static final Double \u00d6O0000(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    private static final Float float(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.max(f2, f3);
        }
        return Float.valueOf(f2);
    }

    private static final Comparable classsuper(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)g2.\u00f800000(object.next());
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    private static final Object o00000(Map object, Comparator comparator, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object object2 = g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Object object3 = g2.\u00f800000(object.next());
            if (comparator.compare(object2, object3) >= 0) continue;
            object2 = object3;
        }
        return object2;
    }

    private static final Object \u00d400000(Map object, Comparator comparator, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            return null;
        }
        Object object2 = g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Object object3 = g2.\u00f800000(object.next());
            if (comparator.compare(object2, object3) >= 0) continue;
            object2 = object3;
        }
        return object2;
    }

    private static final Map.Entry \u00d500000(Map map, Comparator comparator) {
        return (Map.Entry)mc.\u00d400000((Iterable)map.entrySet(), comparator);
    }

    private static final Map.Entry void(Map map, Comparator comparator) {
        return (Map.Entry)mc.\u00d800000((Iterable)map.entrySet(), comparator);
    }

    private static final Map.Entry \u00f4O0000(Map object, g g2) {
        Object e2;
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e3 = object.next();
        if (!object.hasNext()) {
            e2 = e3;
        } else {
            Comparable comparable = (Comparable)g2.\u00f800000(e3);
            do {
                Object e4;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e4 = object.next())) <= 0) continue;
                e3 = e4;
                comparable = comparable2;
            } while (object.hasNext());
            e2 = e3;
        }
        return (Map.Entry)e2;
    }

    private static final Map.Entry \u00d5O0000(Map object, g g2) {
        Object v0;
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            v0 = null;
        } else {
            Object e2 = object.next();
            if (!object.hasNext()) {
                v0 = e2;
            } else {
                Comparable comparable = (Comparable)g2.\u00f800000(e2);
                do {
                    Object e3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) <= 0) continue;
                    e2 = e3;
                    comparable = comparable2;
                } while (object.hasNext());
                v0 = e2;
            }
        }
        return v0;
    }

    private static final double \u00d4o0000(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    private static final float intsuper(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    private static final Comparable \u00d2o0000(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)g2.\u00f800000(object.next());
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    private static final Double \u00d4O0000(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    private static final Float \u00f5o0000(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.min(f2, f3);
        }
        return Float.valueOf(f2);
    }

    private static final Comparable \u00f5O0000(Map object, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)g2.\u00f800000(object.next());
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    private static final Object Object(Map object, Comparator comparator, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object object2 = g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Object object3 = g2.\u00f800000(object.next());
            if (comparator.compare(object2, object3) <= 0) continue;
            object2 = object3;
        }
        return object2;
    }

    private static final Object \u00d200000(Map object, Comparator comparator, g g2) {
        if (!(object = ((Iterable)object.entrySet()).iterator()).hasNext()) {
            return null;
        }
        Object object2 = g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Object object3 = g2.\u00f800000(object.next());
            if (comparator.compare(object2, object3) <= 0) continue;
            object2 = object3;
        }
        return object2;
    }

    private static final Map.Entry \u00d600000(Map map, Comparator comparator) {
        return (Map.Entry)mc.\u00d500000((Iterable)map.entrySet(), comparator);
    }

    private static final Map.Entry \u00d400000(Map map, Comparator comparator) {
        return (Map.Entry)mc.\u00f400000((Iterable)map.entrySet(), comparator);
    }

    public static final boolean \u00d5O0000(Map map) {
        return map.isEmpty();
    }

    public static final boolean o\u00d20000(Map object, g g2) {
        if (object.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : object.entrySet()) {
            if (!((Boolean)g2.\u00f800000(entry)).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static final Map Oo0000(Map map, g g2) {
        for (Map.Entry entry : map.entrySet()) {
            g2.\u00f800000(entry);
        }
        return map;
    }

    public static final Map o00000(Map map, f f2) {
        Object object = map.entrySet();
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            f2.o00000(n3, e2);
        }
        return map;
    }

    private static final Iterable supersuper(Map map) {
        return map.entrySet();
    }

    public static final n \u00d6O0000(Map map) {
        return mc.\u00d5o0000(map.entrySet());
    }
}

