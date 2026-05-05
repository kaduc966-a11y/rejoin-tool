/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.ac;
import b.e.m;
import b.e.x;
import b.f;
import b.g.c;
import b.g.n;
import b.o.e.g;
import b.qb;
import b.s.ab;
import b.s.bb;
import b.s.e;
import b.s.fc$_b$_b$_b$1;
import b.s.fc$_c$1;
import b.s.gc;
import b.s.mc;
import b.s.ub;
import b.s.vb;
import b.s.y;
import b.s.z;
import b.y.b$_c$2;
import b.y.b$_d$1;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class fc
extends bb {
    private static final Object \u00f8O0000(List list) {
        return list.get(0);
    }

    private static final Object \u00d4O0000(List list) {
        return list.get(1);
    }

    private static final Object while(List list) {
        return list.get(2);
    }

    private static final Object nullsuper(List list) {
        return list.get(3);
    }

    private static final Object oo0000(List list) {
        return list.get(4);
    }

    public static final boolean \u00d800000(Iterable iterable, Object object) {
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(object);
        }
        return mc.o00000(iterable, object) >= 0;
    }

    public static final Object \u00d400000(Iterable iterable, int n2) {
        if (iterable instanceof List) {
            return ((List)iterable).get(n2);
        }
        int n3 = n2;
        return mc.new(iterable, n3, arg_0 -> fc.o00000(n3, arg_0));
    }

    private static final Object OO0000(List list, int n2) {
        return list.get(n2);
    }

    public static final Object new(Iterable object, int n2, g g2) {
        if (object instanceof List) {
            object = (List)object;
            boolean bl = n2 >= 0 ? n2 < object.size() : false;
            if (bl) {
                return object.get(n2);
            }
            return g2.\u00f800000(n2);
        }
        if (n2 < 0) {
            return g2.\u00f800000(n2);
        }
        object = object.iterator();
        int n3 = 0;
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n2 != n3++) continue;
            return e2;
        }
        return g2.\u00f800000(n2);
    }

    private static final Object o00000(List list, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < list.size() : false;
        if (bl) {
            return list.get(n2);
        }
        return g2.\u00f800000(n2);
    }

    public static final Object \u00d300000(Iterable object, int n2) {
        if (object instanceof List) {
            return mc.\u00f400000((List)object, n2);
        }
        if (n2 < 0) {
            return null;
        }
        object = object.iterator();
        int n3 = 0;
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n2 != n3++) continue;
            return e2;
        }
        return null;
    }

    private static final Object \u00f800000(List list, int n2) {
        return mc.\u00f400000(list, n2);
    }

    private static final Object nullsuper(Iterable object, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        return null;
    }

    private static final Object \u00f5O0000(Iterable object, g g2) {
        Object var2_2 = null;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            var2_2 = e2;
        }
        return var2_2;
    }

    private static final Object \u00d800000(List object, g g2) {
        List list = object;
        object = list.listIterator(list.size());
        while (object.hasPrevious()) {
            Object e2 = object.previous();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        return null;
    }

    public static final Object oO0000(Iterable object) {
        if (object instanceof List) {
            return mc.Oo0000((List)object);
        }
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return object.next();
    }

    public static final Object Oo0000(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final Object O\u00d40000(Iterable object, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final Object \u00d800000(Iterable object, g g2) {
        Object object2;
        block3: {
            object = object.iterator();
            while (object.hasNext()) {
                object2 = g2.\u00f800000(object.next());
                if (object2 == null) {
                    continue;
                }
                break block3;
            }
            object2 = null;
        }
        if (object2 == null) {
            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        return object2;
    }

    private static final Object Oo0000(Iterable object, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            if ((object2 = g2.\u00f800000(object2)) == null) continue;
            return object2;
        }
        return null;
    }

    public static final Object nullObject(Iterable object) {
        if (object instanceof List) {
            if (((List)object).isEmpty()) {
                return null;
            }
            return ((List)object).get(0);
        }
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        return object.next();
    }

    public static final Object \u00f5O0000(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object \u00f5\u00d30000(Iterable object, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        return null;
    }

    private static final Object new(List list, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < list.size() : false;
        if (bl) {
            return list.get(n2);
        }
        return g2.\u00f800000(n2);
    }

    public static final Object \u00f400000(List list, int n2) {
        boolean bl = n2 >= 0 ? n2 < list.size() : false;
        if (bl) {
            return list.get(n2);
        }
        return null;
    }

    public static final int o00000(Iterable object, Object object2) {
        if (object instanceof List) {
            return ((List)object).indexOf(object2);
        }
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n2 < 0) {
                mc.\u00d800000();
            }
            if (b.o.d.fc.o00000(object2, e2)) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static final int new(List list, Object object) {
        return list.indexOf(object);
    }

    public static final int \u00d3\u00d30000(Iterable object, g g2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n2 < 0) {
                mc.\u00d800000();
            }
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static final int if(List object, g g2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static final int \u00d4\u00d20000(Iterable object, g g2) {
        int n2 = -1;
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 < 0) {
                mc.\u00d800000();
            }
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) {
                n2 = n3;
            }
            ++n3;
        }
        return n2;
    }

    public static final int \u00f500000(List object, g g2) {
        List list = object;
        object = list.listIterator(list.size());
        while (object.hasPrevious()) {
            if (!((Boolean)g2.\u00f800000(object.previous())).booleanValue()) continue;
            return object.nextIndex();
        }
        return -1;
    }

    public static final Object \u00f8o0000(Iterable object) {
        Object e2;
        if (object instanceof List) {
            return mc.thissuper((List)object);
        }
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        do {
            e2 = object.next();
        } while (object.hasNext());
        return e2;
    }

    public static final Object thissuper(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        List list2 = list;
        return list2.get(mc.\u00d300000(list2));
    }

    public static final Object \u00f5o0000(Iterable object, g g2) {
        Object var2_2 = null;
        boolean bl = false;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            var2_2 = e2;
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return var2_2;
    }

    public static final Object \u00f800000(List object, g g2) {
        List list = object;
        object = list.listIterator(list.size());
        while (object.hasPrevious()) {
            Object e2 = object.previous();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final int \u00d400000(Iterable object, Object object2) {
        if (object instanceof List) {
            return ((List)object).lastIndexOf(object2);
        }
        int n2 = -1;
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 < 0) {
                mc.\u00d800000();
            }
            if (b.o.d.fc.o00000(object2, e2)) {
                n2 = n3;
            }
            ++n3;
        }
        return n2;
    }

    public static final int \u00d300000(List list, Object object) {
        return list.lastIndexOf(object);
    }

    public static final Object \u00d4\u00d20000(Iterable object) {
        Object e2;
        if (object instanceof List) {
            if (((List)object).isEmpty()) {
                return null;
            }
            return ((List)object).get(((List)object).size() - 1);
        }
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        do {
            e2 = object.next();
        } while (object.hasNext());
        return e2;
    }

    public static final Object \u00f4O0000(List list) {
        if (list.isEmpty()) {
            return null;
        }
        List list2 = list;
        return list2.get(list2.size() - 1);
    }

    public static final Object \u00f4o0000(Iterable object, g g2) {
        Object var2_2 = null;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            var2_2 = e2;
        }
        return var2_2;
    }

    public static final Object return(List object, g g2) {
        List list = object;
        object = list.listIterator(list.size());
        while (object.hasPrevious()) {
            Object e2 = object.previous();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        return null;
    }

    private static final Object \u00d5O0000(Collection collection) {
        return mc.new(collection, b.b.f.super);
    }

    public static final Object new(Collection collection, b.b.f f2) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return mc.\u00d400000((Iterable)collection, f2.o00000(collection.size()));
    }

    private static final Object if(Collection collection) {
        return mc.o00000(collection, (b.b.f)b.b.f.super);
    }

    public static final Object o00000(Collection collection, b.b.f f2) {
        if (collection.isEmpty()) {
            return null;
        }
        return mc.\u00d400000((Iterable)collection, f2.o00000(collection.size()));
    }

    public static final Object thisObject(Iterable object) {
        if (object instanceof List) {
            return mc.\u00d5O0000((List)object);
        }
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object e2 = object.next();
        if (object.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return e2;
    }

    public static final Object \u00d5O0000(List list) {
        switch (list.size()) {
            case 0: {
                throw new NoSuchElementException("List is empty.");
            }
            case 1: {
                return list.get(0);
            }
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final Object oO0000(Iterable object, g g2) {
        Object var2_2 = null;
        boolean bl = false;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            if (bl) {
                throw new IllegalArgumentException("Collection contains more than one matching element.");
            }
            var2_2 = e2;
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return var2_2;
    }

    public static final Object \u00d3o0000(Iterable object) {
        if (object instanceof List) {
            if (((List)object).size() == 1) {
                return ((List)object).get(0);
            }
            return null;
        }
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        if (object.hasNext()) {
            return null;
        }
        return e2;
    }

    public static final Object \u00d8O0000(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final Object o\u00d40000(Iterable object, g g2) {
        Object var2_2 = null;
        boolean bl = false;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            if (bl) {
                return null;
            }
            var2_2 = e2;
            bl = true;
        }
        if (!bl) {
            return null;
        }
        return var2_2;
    }

    public static final List new(Iterable iterable, int n2) {
        ArrayList<Object> arrayList;
        int n3;
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00f5O0000(iterable);
        }
        if (iterable instanceof Collection) {
            n3 = ((Collection)iterable).size() - n2;
            if (n3 <= 0) {
                return mc.\u00d500000();
            }
            if (n3 == 1) {
                return mc.o00000(mc.\u00f8o0000(iterable));
            }
            arrayList = new ArrayList(n3);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int n4 = ((List)iterable).size();
                    for (int i2 = n2; i2 < n4; ++i2) {
                        arrayList.add(((List)iterable).get(i2));
                    }
                } else {
                    Iterator iterator = ((List)iterable).listIterator(n2);
                    while (iterator.hasNext()) {
                        Object e2 = iterator.next();
                        arrayList.add(e2);
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList<Object>();
        }
        n3 = 0;
        for (Object t2 : iterable) {
            if (n3 >= n2) {
                Comparable cfr_ignored_0 = Boolean.valueOf(arrayList.add(t2));
                continue;
            }
            Comparable cfr_ignored_1 = Integer.valueOf(++n3);
        }
        return mc.new(arrayList);
    }

    public static final List if(List object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return mc.return((Iterable)object, b.e.bb.\u00d200000(object.size() - n2, 0));
    }

    public static final List \u00f400000(List list, g g2) {
        if (!list.isEmpty()) {
            List list2 = list;
            ListIterator listIterator = list2.listIterator(list2.size());
            while (listIterator.hasPrevious()) {
                if (((Boolean)g2.\u00f800000(listIterator.previous())).booleanValue()) continue;
                return mc.return((Iterable)list, listIterator.nextIndex() + 1);
            }
        }
        return mc.\u00d500000();
    }

    public static final List \u00d4\u00d40000(Iterable object, g g2) {
        boolean bl = false;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (bl) {
                arrayList.add(e2);
                continue;
            }
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            arrayList.add(e2);
            bl = true;
        }
        return arrayList;
    }

    public static final List \u00d8\u00d20000(Iterable object, g g2) {
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    public static final List \u00f500000(Iterable object, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            if (!((Boolean)f2.o00000(n3, e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    public static final Collection \u00d300000(Iterable object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            if (!((Boolean)f2.o00000(n3, e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final /* synthetic */ List \u00d5\u00d20000(Iterable object) {
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            b.o.d.fc.o00000(3, "R");
            if (!(e2 instanceof Object)) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    public static final /* synthetic */ Collection \u00d300000(Iterable object, Collection collection) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            b.o.d.fc.o00000(3, "R");
            if (!(e2 instanceof Object)) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final List o\u00d20000(Iterable object, g g2) {
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    public static final List o\u00d30000(Iterable iterable) {
        return (List)mc.o00000(iterable, new ArrayList());
    }

    public static final Collection o00000(Iterable object, Collection collection) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (e2 == null) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final Collection return(Iterable object, Collection collection, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final Collection o00000(Iterable object, Collection collection, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final List o00000(List list, m m2) {
        if (((x)m2).if()) {
            return mc.\u00d500000();
        }
        return mc.\u00f5O0000((Iterable)list.subList(m2.\u00d5o0000(), m2.\u00d3o0000() + 1));
    }

    public static final List o00000(List list, Iterable object) {
        int n2 = mc.o00000((Iterable)object, 10);
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        ArrayList arrayList = new ArrayList(n2);
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            arrayList.add(list.get(n3));
        }
        return arrayList;
    }

    public static final List return(Iterable object, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        if (object instanceof Collection) {
            if (n2 >= ((Collection)object).size()) {
                return mc.\u00f5O0000((Iterable)object);
            }
            if (n2 == 1) {
                return mc.o00000(mc.oO0000((Iterable)object));
            }
        }
        int n3 = 0;
        ArrayList arrayList = new ArrayList(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            arrayList.add(e2);
            if (++n3 != n2) continue;
        }
        return mc.new(arrayList);
    }

    public static final List \u00f500000(List list, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        int n3 = list.size();
        if (n2 >= n3) {
            return mc.\u00f5O0000((Iterable)list);
        }
        if (n2 == 1) {
            return mc.o00000(mc.thissuper(list));
        }
        ArrayList arrayList = new ArrayList(n2);
        if (list instanceof RandomAccess) {
            for (n2 = n3 - n2; n2 < n3; ++n2) {
                arrayList.add(list.get(n2));
            }
        } else {
            Iterator iterator = list.listIterator(n3 - n2);
            while (iterator.hasNext()) {
                list = iterator.next();
                arrayList.add(list);
            }
        }
        return arrayList;
    }

    public static final List \u00d300000(List list, g object) {
        if (list.isEmpty()) {
            return mc.\u00d500000();
        }
        List list2 = list;
        ListIterator listIterator = list2.listIterator(list2.size());
        while (listIterator.hasPrevious()) {
            if (((Boolean)object.\u00f800000(listIterator.previous())).booleanValue()) continue;
            listIterator.next();
            int n2 = list.size() - listIterator.nextIndex();
            if (n2 == 0) {
                return mc.\u00d500000();
            }
            ArrayList arrayList = new ArrayList(n2);
            object = arrayList;
            while (listIterator.hasNext()) {
                ((ArrayList)object).add(listIterator.next());
            }
            return arrayList;
        }
        return mc.\u00f5O0000((Iterable)list);
    }

    public static final List whilenew(Iterable object, g g2) {
        Object e2;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (object.hasNext() && ((Boolean)g2.\u00f800000(e2 = object.next())).booleanValue()) {
            arrayList.add(e2);
        }
        return arrayList;
    }

    public static final List \u00f4\u00d30000(Iterable iterable) {
        if (iterable instanceof Collection && ((Collection)iterable).size() <= 1) {
            return mc.\u00f5O0000(iterable);
        }
        iterable = mc.O\u00d40000(iterable);
        mc.oO0000((List)iterable);
        return iterable;
    }

    public static final void o00000(List list, b.b.f f2) {
        for (int i2 = mc.\u00d300000(list); i2 > 0; --i2) {
            int n2 = f2.o00000(i2 + 1);
            list.set(n2, list.set(i2, list.get(n2)));
        }
    }

    public static final void \u00d400000(List list, g g2) {
        if (list.size() > 1) {
            mc.o00000(list, new b$_c$2(g2));
        }
    }

    public static final void \u00d500000(List list, g g2) {
        if (list.size() > 1) {
            mc.o00000(list, new b$_d$1(g2));
        }
    }

    public static final void Stringsuper(List list) {
        mc.o00000(list, b.y.f.super());
    }

    public static final List \u00d4o0000(Iterable objectArray) {
        if (objectArray instanceof Collection) {
            if (((Collection)objectArray).size() <= 1) {
                return mc.\u00f5O0000((Iterable)objectArray);
            }
            objectArray = ((Collection)objectArray).toArray(new Comparable[0]);
            z.\u00d600000(objectArray);
            return z.\u00d500000(objectArray);
        }
        objectArray = mc.O\u00d40000((Iterable)objectArray);
        mc.return((List)objectArray);
        return objectArray;
    }

    public static final List \u00f800000(Iterable iterable, g g2) {
        return mc.return(iterable, new b$_c$2(g2));
    }

    public static final List \u00f8\u00d30000(Iterable iterable, g g2) {
        return mc.return(iterable, new b$_d$1(g2));
    }

    public static final List forsuper(Iterable iterable) {
        return mc.return(iterable, b.y.f.super());
    }

    public static final List return(Iterable objectArray, Comparator comparator) {
        if (objectArray instanceof Collection) {
            if (((Collection)objectArray).size() <= 1) {
                return mc.\u00f5O0000((Iterable)objectArray);
            }
            objectArray = ((Collection)objectArray).toArray(new Object[0]);
            z.\u00d200000(objectArray, comparator);
            return z.\u00d500000(objectArray);
        }
        objectArray = mc.O\u00d40000((Iterable)objectArray);
        mc.o00000((List)objectArray, comparator);
        return objectArray;
    }

    public static final boolean[] \u00d3O0000(Collection object) {
        boolean[] blArray = new boolean[object.size()];
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            boolean bl = (Boolean)object.next();
            blArray[n2++] = bl;
        }
        return blArray;
    }

    public static final byte[] \u00f400000(Collection object) {
        byte[] byArray = new byte[object.size()];
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            byte by = ((Number)object.next()).byteValue();
            byArray[n2++] = by;
        }
        return byArray;
    }

    public static final char[] thissuper(Collection object) {
        char[] cArray = new char[object.size()];
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            char c2 = ((Character)object.next()).charValue();
            cArray[n2++] = c2;
        }
        return cArray;
    }

    public static final double[] \u00f500000(Collection object) {
        double[] dArray = new double[object.size()];
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            double d2 = ((Number)object.next()).doubleValue();
            dArray[n2++] = d2;
        }
        return dArray;
    }

    public static final float[] \u00d8O0000(Collection object) {
        float[] fArray = new float[object.size()];
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            float f2 = ((Number)object.next()).floatValue();
            fArray[n2++] = f2;
        }
        return fArray;
    }

    public static final int[] oO0000(Collection object) {
        int[] nArray = new int[object.size()];
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            nArray[n2++] = n3;
        }
        return nArray;
    }

    public static final long[] \u00f800000(Collection object) {
        long[] lArray = new long[object.size()];
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            long l2 = ((Number)object.next()).longValue();
            lArray[n2++] = l2;
        }
        return lArray;
    }

    public static final short[] while(Collection object) {
        short[] sArray = new short[object.size()];
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            short s2 = ((Number)object.next()).shortValue();
            sArray[n2++] = s2;
        }
        return sArray;
    }

    public static final Map nullObject(Iterable object, g g2) {
        int n2 = b.e.bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
        Map map = new LinkedHashMap(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            Map map2 = map;
            object2 = (qb)g2.\u00f800000(object2);
            map2.put(((qb)object2).new(), ((qb)object2).o00000());
        }
        return map;
    }

    public static final Map \u00f8O0000(Iterable object, g g2) {
        int n2 = b.e.bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
        Map map = new LinkedHashMap(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(g2.\u00f800000(e2), e2);
        }
        return map;
    }

    public static final Map o00000(Iterable object, g g2, g g3) {
        int n2 = b.e.bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
        Map map = new LinkedHashMap(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(g2.\u00f800000(e2), g3.\u00f800000(e2));
        }
        return map;
    }

    public static final Map new(Iterable object, Map map, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(g2.\u00f800000(e2), e2);
        }
        return map;
    }

    public static final Map new(Iterable object, Map map, g g2, g g3) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(g2.\u00f800000(e2), g3.\u00f800000(e2));
        }
        return map;
    }

    public static final Map o00000(Iterable object, Map map, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            Map map2 = map;
            object2 = (qb)g2.\u00f800000(object2);
            map2.put(((qb)object2).new(), ((qb)object2).o00000());
        }
        return map;
    }

    public static final Map newnew(Iterable object, g g2) {
        Map map = new LinkedHashMap(b.e.bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16));
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(e2, g2.\u00f800000(e2));
        }
        return map;
    }

    public static final Map \u00d400000(Iterable object, Map map, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(e2, g2.\u00f800000(e2));
        }
        return map;
    }

    public static final Collection new(Iterable object, Collection collection) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            collection.add(e2);
        }
        return collection;
    }

    public static final HashSet \u00d8o0000(Iterable iterable) {
        return (HashSet)mc.new(iterable, new HashSet(y.\u00d200000(mc.o00000(iterable, 12))));
    }

    public static final List \u00f5O0000(Iterable iterable) {
        if (iterable instanceof Collection) {
            switch (((Collection)iterable).size()) {
                case 0: {
                    return mc.\u00d500000();
                }
                case 1: {
                    return mc.o00000(iterable instanceof List ? ((List)iterable).get(0) : ((Collection)iterable).iterator().next());
                }
            }
            return mc.OO0000((Collection)iterable);
        }
        return mc.new(mc.O\u00d40000(iterable));
    }

    public static final List O\u00d40000(Iterable iterable) {
        if (iterable instanceof Collection) {
            return mc.OO0000((Collection)iterable);
        }
        return (List)mc.new(iterable, new ArrayList());
    }

    public static final List OO0000(Collection collection) {
        return new ArrayList(collection);
    }

    public static final Set \u00d4O0000(Iterable iterable) {
        if (iterable instanceof Collection) {
            switch (((Collection)iterable).size()) {
                case 0: {
                    return ub.\u00d300000();
                }
                case 1: {
                    return ub.super(iterable instanceof List ? ((List)iterable).get(0) : ((Collection)iterable).iterator().next());
                }
            }
            return (Set)mc.new(iterable, new LinkedHashSet(y.\u00d200000(((Collection)iterable).size())));
        }
        return ub.\u00d200000((Set)mc.new(iterable, new LinkedHashSet()));
    }

    public static final List \u00d5O0000(Iterable object, g g2) {
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (Iterable)g2.\u00f800000(object2);
            mc.new(collection, object2);
        }
        return (List)collection;
    }

    public static final List returnnew(Iterable object, g g2) {
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (n)g2.\u00f800000(object2);
            mc.o00000(collection, object2);
        }
        return (List)collection;
    }

    private static final List return(Iterable object, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            mc.new(collection, (Iterable)f2.o00000(n3, e2));
        }
        return (List)collection;
    }

    private static final List \u00d800000(Iterable object, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            mc.o00000(collection, (n)f2.o00000(n3, e2));
        }
        return (List)collection;
    }

    private static final Collection o00000(Iterable object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object object2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = (Iterable)f2.o00000(n3, object2);
            mc.new(collection, object2);
        }
        return collection;
    }

    private static final Collection \u00d500000(Iterable object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object object2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = (n)f2.o00000(n3, object2);
            mc.o00000(collection, object2);
        }
        return collection;
    }

    public static final Collection \u00d300000(Iterable object, Collection collection, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (Iterable)g2.\u00f800000(object2);
            mc.new(collection, object2);
        }
        return collection;
    }

    public static final Collection \u00d400000(Iterable object, Collection collection, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (n)g2.\u00f800000(object2);
            mc.o00000(collection, object2);
        }
        return collection;
    }

    public static final Map \u00d8O0000(Iterable object, g g2) {
        Map map = new LinkedHashMap();
        object = object.iterator();
        while (object.hasNext()) {
            Map map2 = map;
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            Object object3 = map2.get(object2);
            if (object3 == null) {
                object3 = new ArrayList();
                map2.put(object2, object3);
            }
            ((List)object3).add(e2);
        }
        return map;
    }

    public static final Map new(Iterable object, g g2, g g3) {
        Map map = new LinkedHashMap();
        object = object.iterator();
        while (object.hasNext()) {
            Map map2 = map;
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            Object object3 = map2.get(object2);
            if (object3 == null) {
                object3 = new ArrayList();
                map2.put(object2, object3);
            }
            ((List)object3).add(g3.\u00f800000(e2));
        }
        return map;
    }

    public static final Map \u00d300000(Iterable object, Map map, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Map map2 = map;
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            Object object3 = map2.get(object2);
            if (object3 == null) {
                object3 = new ArrayList();
                map2.put(object2, object3);
            }
            ((List)object3).add(e2);
        }
        return map;
    }

    public static final Map o00000(Iterable object, Map map, g g2, g g3) {
        object = object.iterator();
        while (object.hasNext()) {
            Map map2 = map;
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            Object object3 = map2.get(object2);
            if (object3 == null) {
                object3 = new ArrayList();
                map2.put(object2, object3);
            }
            ((List)object3).add(g3.\u00f800000(e2));
        }
        return map;
    }

    public static final ab \u00f4O0000(Iterable iterable, g g2) {
        return new fc$_c$1(iterable, g2);
    }

    public static final List OO0000(Iterable iterable, g g2) {
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            iterable.add(g2.\u00f800000(e2));
        }
        return (List)iterable;
    }

    public static final List \u00d500000(Iterable iterable, b.o.e.f f2) {
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            iterable.add(f2.o00000(n3, e2));
        }
        return (List)iterable;
    }

    public static final List \u00d300000(Iterable object, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object object2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            Object object3 = f2.o00000(n3, object2);
            if (object3 == null) continue;
            object2 = object3;
            collection.add(object2);
        }
        return (List)collection;
    }

    public static final Collection new(Iterable object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object object2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            Object object3 = f2.o00000(n3, object2);
            if (object3 == null) continue;
            object2 = object3;
            collection.add(object2);
        }
        return collection;
    }

    public static final Collection \u00d400000(Iterable object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            collection.add(f2.o00000(n3, e2));
        }
        return collection;
    }

    public static final List \u00d3\u00d20000(Iterable object, g g2) {
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            Object object3 = g2.\u00f800000(object2);
            if (object3 == null) continue;
            object2 = object3;
            collection.add(object2);
        }
        return (List)collection;
    }

    public static final Collection new(Iterable object, Collection collection, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            Object object3 = g2.\u00f800000(object2);
            if (object3 == null) continue;
            object2 = object3;
            collection.add(object2);
        }
        return collection;
    }

    public static final Collection \u00d500000(Iterable object, Collection collection, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            collection.add(g2.\u00f800000(e2));
        }
        return collection;
    }

    public static final Iterable O\u00d20000(Iterable iterable) {
        return new gc(() -> fc.\u00f5\u00d30000(iterable));
    }

    public static final List \u00f4\u00d20000(Iterable iterable) {
        return mc.\u00f5O0000(mc.\u00d3\u00d30000(iterable));
    }

    public static final List StringObject(Iterable object, g g2) {
        HashSet<Object> hashSet = new HashSet<Object>();
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            if (!hashSet.add(object2)) continue;
            arrayList.add(e2);
        }
        return arrayList;
    }

    public static final Set \u00d500000(Iterable object, Iterable iterable) {
        iterable = mc.\u00d500000(iterable);
        Set set = new LinkedHashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!iterable.contains(e2)) continue;
            set.add(e2);
        }
        return set;
    }

    public static final Set \u00d400000(Iterable object, Iterable iterable) {
        iterable = mc.\u00d500000(iterable);
        Set set = new LinkedHashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (iterable.contains(e2)) continue;
            set.add(e2);
        }
        return set;
    }

    public static final Set \u00d3\u00d30000(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection)iterable);
        }
        return (Set)mc.new(iterable, new LinkedHashSet());
    }

    public static final Set new(Iterable iterable, Iterable iterable2) {
        iterable = mc.\u00d3\u00d30000(iterable);
        mc.new((Collection)iterable, iterable2);
        return iterable;
    }

    public static final boolean \u00f8o0000(Iterable object, g g2) {
        if (object instanceof Collection && ((Collection)object).isEmpty()) {
            return true;
        }
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static final boolean Oo0000(Iterable iterable) {
        if (iterable instanceof Collection) {
            return !((Collection)iterable).isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    public static final boolean o\u00d30000(Iterable object, g g2) {
        if (object instanceof Collection && ((Collection)object).isEmpty()) {
            return false;
        }
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return true;
        }
        return false;
    }

    public static final int newnew(Iterable object) {
        if (object instanceof Collection) {
            return ((Collection)object).size();
        }
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            object.next();
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        return n2;
    }

    private static final int \u00d4O0000(Collection collection) {
        return collection.size();
    }

    public static final int privatesuper(Iterable object, g g2) {
        if (object instanceof Collection && ((Collection)object).isEmpty()) {
            return 0;
        }
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue() || ++n2 >= 0) continue;
            mc.\u00d400000();
        }
        return n2;
    }

    public static final Object new(Iterable object, Object object2, b.o.e.f f2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            object2 = f2.o00000(object2, e2);
        }
        return object2;
    }

    public static final Object o00000(Iterable object, Object object2, b.o.e.e e2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3;
            Object e3 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = e2.o00000(n3, object2, e3);
        }
        return object2;
    }

    public static final Object o00000(List object, Object object2, b.o.e.f f2) {
        if (!object.isEmpty()) {
            List list = object;
            object = list.listIterator(list.size());
            while (object.hasPrevious()) {
                object2 = f2.o00000(object.previous(), object2);
            }
        }
        return object2;
    }

    public static final Object o00000(List object, Object object2, b.o.e.e e2) {
        if (!object.isEmpty()) {
            List list = object;
            object = list.listIterator(list.size());
            while (object.hasPrevious()) {
                int n2 = object.previousIndex();
                object2 = e2.o00000(n2, object.previous(), object2);
            }
        }
        return object2;
    }

    public static final void \u00f400000(Iterable object, g g2) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            g2.\u00f800000(e2);
        }
    }

    public static final void \u00f800000(Iterable object, b.o.e.f f2) {
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
    }

    public static final double privatesuper(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)object.next()).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    public static final float \u00f5o0000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 = Math.max(f2, f3);
        }
        return f2;
    }

    public static final Comparable o\u00d40000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)object.next();
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)object.next();
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    public static final Object \u00f8\u00d20000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(e2);
        do {
            Object e3;
            Comparable comparable2;
            if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) >= 0) continue;
            e2 = e3;
            comparable = comparable2;
        } while (object.hasNext());
        return e2;
    }

    public static final Object oo0000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(e2);
        do {
            Object e3;
            Comparable comparable2;
            if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) >= 0) continue;
            e2 = e3;
            comparable = comparable2;
        } while (object.hasNext());
        return e2;
    }

    private static final double \u00d8\u00d30000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    private static final float thisObject(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.max(f2, f3);
        }
        return f2;
    }

    private static final Comparable \u00f4\u00d20000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
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

    private static final Double if(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    private static final Float \u00f4\u00d30000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.max(f2, f3);
        }
        return Float.valueOf(f2);
    }

    private static final Comparable \u00d4\u00d30000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
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

    private static final Object o00000(Iterable object, Comparator comparator, g g2) {
        if (!(object = object.iterator()).hasNext()) {
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

    private static final Object new(Iterable object, Comparator comparator, g g2) {
        if (!(object = object.iterator()).hasNext()) {
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

    public static final Double \u00d8\u00d30000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        double d2 = ((Number)object.next()).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    public static final Float ifnew(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        float f2 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 = Math.max(f2, f3);
        }
        return Float.valueOf(f2);
    }

    public static final Comparable thissuper(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)object.next();
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)object.next();
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    public static final Object \u00d400000(Iterable object, Comparator comparator) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            if (comparator.compare(e2, e3) >= 0) continue;
            e2 = e3;
        }
        return e2;
    }

    public static final Object \u00d800000(Iterable object, Comparator comparator) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            if (comparator.compare(e2, e3) >= 0) continue;
            e2 = e3;
        }
        return e2;
    }

    public static final double \u00d5\u00d30000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)object.next()).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    public static final float \u00d4\u00d30000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    public static final Comparable StringObject(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)object.next();
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)object.next();
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    public static final Object O\u00d30000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(e2);
        do {
            Object e3;
            Comparable comparable2;
            if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) <= 0) continue;
            e2 = e3;
            comparable = comparable2;
        } while (object.hasNext());
        return e2;
    }

    public static final Object \u00d3\u00d40000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(e2);
        do {
            Object e3;
            Comparable comparable2;
            if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) <= 0) continue;
            e2 = e3;
            comparable = comparable2;
        } while (object.hasNext());
        return e2;
    }

    private static final double \u00d4O0000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    private static final float \u00d3O0000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    private static final Comparable \u00f5\u00d20000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
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

    private static final Double ifnew(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    private static final Float \u00d3o0000(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.min(f2, f3);
        }
        return Float.valueOf(f2);
    }

    private static final Comparable forsuper(Iterable object, g g2) {
        if (!(object = object.iterator()).hasNext()) {
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

    private static final Object \u00d400000(Iterable object, Comparator comparator, g g2) {
        if (!(object = object.iterator()).hasNext()) {
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

    private static final Object \u00d300000(Iterable object, Comparator comparator, g g2) {
        if (!(object = object.iterator()).hasNext()) {
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

    public static final Double \u00f4o0000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        double d2 = ((Number)object.next()).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    public static final Float \u00f8O0000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        float f2 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 = Math.min(f2, f3);
        }
        return Float.valueOf(f2);
    }

    public static final Comparable \u00d8\u00d20000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)object.next();
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)object.next();
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    public static final Object \u00d500000(Iterable object, Comparator comparator) {
        if (!(object = object.iterator()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            if (comparator.compare(e2, e3) <= 0) continue;
            e2 = e3;
        }
        return e2;
    }

    public static final Object \u00f400000(Iterable object, Comparator comparator) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            if (comparator.compare(e2, e3) <= 0) continue;
            e2 = e3;
        }
        return e2;
    }

    public static final boolean \u00f8\u00d30000(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection)iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    public static final boolean \u00f500000(Iterable object, g g2) {
        if (object instanceof Collection && ((Collection)object).isEmpty()) {
            return true;
        }
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static final Iterable \u00d4o0000(Iterable iterable, g g2) {
        for (Object t2 : iterable) {
            g2.\u00f800000(t2);
        }
        return iterable;
    }

    public static final Iterable \u00d400000(Iterable iterable, b.o.e.f f2) {
        Object object = iterable;
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
        return iterable;
    }

    public static final Object \u00f400000(Iterable object, b.o.e.f f2) {
        if (!(object = object.iterator()).hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object object2 = object.next();
        while (object.hasNext()) {
            object2 = f2.o00000(object2, object.next());
        }
        return object2;
    }

    public static final Object o00000(Iterable object, b.o.e.e e2) {
        if (!(object = object.iterator()).hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        int n2 = 1;
        Object object2 = object.next();
        while (object.hasNext()) {
            int n3;
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = e2.o00000(n3, object2, object.next());
        }
        return object2;
    }

    public static final Object new(Iterable object, b.o.e.e e2) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        int n2 = 1;
        Object object2 = object.next();
        while (object.hasNext()) {
            int n3;
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = e2.o00000(n3, object2, object.next());
        }
        return object2;
    }

    public static final Object if(Iterable object, b.o.e.f f2) {
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        Object object2 = object.next();
        while (object.hasNext()) {
            object2 = f2.o00000(object2, object.next());
        }
        return object2;
    }

    public static final Object \u00d300000(List listIterator, b.o.e.f f2) {
        List list = listIterator;
        listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        Object object = listIterator.previous();
        while (listIterator.hasPrevious()) {
            object = f2.o00000(listIterator.previous(), object);
        }
        return object;
    }

    public static final Object new(List listIterator, b.o.e.e e2) {
        List list = listIterator;
        listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        Object object = listIterator.previous();
        while (listIterator.hasPrevious()) {
            int n2 = listIterator.previousIndex();
            object = e2.o00000(n2, listIterator.previous(), object);
        }
        return object;
    }

    public static final Object o00000(List listIterator, b.o.e.e e2) {
        List list = listIterator;
        listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        Object object = listIterator.previous();
        while (listIterator.hasPrevious()) {
            int n2 = listIterator.previousIndex();
            object = e2.o00000(n2, listIterator.previous(), object);
        }
        return object;
    }

    public static final Object new(List listIterator, b.o.e.f f2) {
        List list = listIterator;
        listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        Object object = listIterator.previous();
        while (listIterator.hasPrevious()) {
            object = f2.o00000(listIterator.previous(), object);
        }
        return object;
    }

    public static final List \u00d300000(Iterable iterable2, Object iterator, b.o.e.f f2) {
        int n2 = mc.o00000(iterable2, 9);
        if (n2 == 0) {
            return mc.o00000(iterator);
        }
        Object object = new ArrayList<Object>(n2 + 1);
        ((ArrayList)object).add(iterator);
        ArrayList<Object> arrayList = object;
        object = iterator;
        for (Iterable iterable2 : iterable2) {
            object = f2.o00000(object, iterable2);
            arrayList.add(object);
        }
        return arrayList;
    }

    public static final List \u00d300000(Iterable object, Object object2, b.o.e.e e2) {
        int n2 = mc.o00000((Iterable)object, 9);
        if (n2 == 0) {
            return mc.o00000(object2);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(n2 + 1);
        arrayList.add(object2);
        ArrayList<Object> arrayList2 = arrayList;
        int n3 = 0;
        Object object3 = object2;
        object = object.iterator();
        while (object.hasNext()) {
            object2 = object.next();
            object3 = e2.o00000(n3++, object3, object2);
            arrayList2.add(object3);
        }
        return arrayList2;
    }

    public static final List o00000(Iterable arrayList, b.o.e.f f2) {
        Iterator iterator = arrayList.iterator();
        if (!iterator.hasNext()) {
            return mc.\u00d500000();
        }
        Object object = iterator.next();
        arrayList = new ArrayList(mc.o00000((Iterable)arrayList, 10));
        arrayList.add(object);
        while (iterator.hasNext()) {
            object = f2.o00000(object, iterator.next());
            arrayList.add(object);
        }
        return arrayList;
    }

    public static final List \u00d300000(Iterable arrayList, b.o.e.e e2) {
        Iterator iterator = arrayList.iterator();
        if (!iterator.hasNext()) {
            return mc.\u00d500000();
        }
        Object object = iterator.next();
        ArrayList arrayList2 = new ArrayList(mc.o00000((Iterable)arrayList, 10));
        arrayList2.add(object);
        arrayList = arrayList2;
        int n2 = 1;
        while (iterator.hasNext()) {
            object = e2.o00000(n2++, object, iterator.next());
            arrayList.add(object);
        }
        return arrayList;
    }

    public static final List o00000(Iterable iterable2, Object iterator, b.o.e.f f2) {
        int n2 = mc.o00000(iterable2, 9);
        if (n2 == 0) {
            return mc.o00000(iterator);
        }
        Object object = new ArrayList<Object>(n2 + 1);
        ((ArrayList)object).add(iterator);
        ArrayList<Object> arrayList = object;
        object = iterator;
        for (Iterable iterable2 : iterable2) {
            object = f2.o00000(object, iterable2);
            arrayList.add(object);
        }
        return arrayList;
    }

    public static final List new(Iterable object, Object object2, b.o.e.e e2) {
        int n2 = mc.o00000((Iterable)object, 9);
        if (n2 == 0) {
            return mc.o00000(object2);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(n2 + 1);
        arrayList.add(object2);
        ArrayList<Object> arrayList2 = arrayList;
        int n3 = 0;
        Object object3 = object2;
        object = object.iterator();
        while (object.hasNext()) {
            object2 = object.next();
            object3 = e2.o00000(n3++, object3, object2);
            arrayList2.add(object3);
        }
        return arrayList2;
    }

    public static final int \u00d5\u00d20000(Iterable object, g g2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            n2 += ((Number)g2.\u00f800000(e2)).intValue();
        }
        return n2;
    }

    public static final double O\u00d20000(Iterable object, g g2) {
        double d2 = 0.0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            d2 += ((Number)g2.\u00f800000(e2)).doubleValue();
        }
        return d2;
    }

    private static final double \u00d5\u00d30000(Iterable object, g g2) {
        double d2 = 0.0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            d2 += ((Number)g2.\u00f800000(e2)).doubleValue();
        }
        return d2;
    }

    private static final int \u00d8o0000(Iterable object, g g2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            n2 += ((Number)g2.\u00f800000(e2)).intValue();
        }
        return n2;
    }

    private static final long Stringsuper(Iterable object, g g2) {
        long l2 = 0L;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            l2 += ((Number)g2.\u00f800000(e2)).longValue();
        }
        return l2;
    }

    private static final int while(Iterable object, g g2) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(e2)).o00000());
        }
        return n2;
    }

    private static final long thissuper(Iterable object, g g2) {
        long l2 = 0L;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            l2 = f.super(l2 + ((f)g2.\u00f800000(e2)).super());
        }
        return l2;
    }

    public static final Iterable \u00f5\u00d20000(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != null) continue;
            throw new IllegalArgumentException("null element found in " + iterable + '.');
        }
        return iterable;
    }

    public static final List \u00d3O0000(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != null) continue;
            throw new IllegalArgumentException("null element found in " + list + '.');
        }
        return list;
    }

    public static final List \u00d500000(Iterable iterable, int n2) {
        int n3 = n2;
        return mc.o00000(iterable, n3, n3, true);
    }

    public static final List o00000(Iterable iterable, int n2, g g2) {
        int n3 = n2;
        return mc.o00000(iterable, n3, n3, true, g2);
    }

    public static final List \u00d300000(Iterable object, Object object2) {
        Collection collection = new ArrayList(mc.o00000((Iterable)object, 10));
        boolean bl = false;
        collection = collection;
        object = object.iterator();
        while (object.hasNext()) {
            boolean bl2;
            Object e2;
            Object e3 = e2 = object.next();
            if (!bl && b.o.d.fc.o00000(e3, object2)) {
                bl = true;
                bl2 = false;
            } else {
                bl2 = true;
            }
            if (!bl2) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    public static final List new(Iterable object, Object[] objectArray) {
        if (objectArray.length == 0) {
            return mc.\u00f5O0000((Iterable)object);
        }
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            Object e3 = e2;
            if (z.\u00d300000(objectArray, e3)) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    public static final List o00000(Iterable object, Iterable iterable) {
        if ((iterable = mc.\u00d500000(iterable)).isEmpty()) {
            return mc.\u00f5O0000((Iterable)object);
        }
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            Object e3 = e2;
            if (iterable.contains(e3)) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    public static final List o00000(Iterable object, n object2) {
        if ((object2 = c.\u00d6o0000((n)object2)).isEmpty()) {
            return mc.\u00f5O0000((Iterable)object);
        }
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            Object e3 = e2;
            if (object2.contains(e3)) continue;
            collection.add(e2);
        }
        return (List)collection;
    }

    private static final List \u00d500000(Iterable iterable, Object object) {
        return mc.\u00d300000(iterable, object);
    }

    public static final qb \u00d5o0000(Iterable object, g g2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) {
                arrayList.add(e2);
                continue;
            }
            arrayList2.add(e2);
        }
        return new qb(arrayList, arrayList2);
    }

    public static final List return(Iterable iterable, Object object) {
        if (iterable instanceof Collection) {
            return mc.\u00d500000((Collection)iterable, object);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        mc.new((Collection)arrayList, iterable);
        arrayList.add(object);
        return arrayList;
    }

    public static final List \u00d500000(Collection collection, Object object) {
        ArrayList<Object> arrayList = new ArrayList<Object>(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(object);
        return arrayList;
    }

    public static final List \u00d300000(Iterable iterable, Object[] objectArray) {
        if (iterable instanceof Collection) {
            return mc.\u00f400000((Collection)iterable, objectArray);
        }
        ArrayList arrayList = new ArrayList();
        mc.new((Collection)arrayList, iterable);
        mc.\u00d500000((Collection)arrayList, objectArray);
        return arrayList;
    }

    public static final List \u00f400000(Collection collection, Object[] objectArray) {
        ArrayList arrayList = new ArrayList(collection.size() + objectArray.length);
        arrayList.addAll(collection);
        mc.\u00d500000((Collection)arrayList, objectArray);
        return arrayList;
    }

    public static final List return(Iterable iterable, Iterable iterable2) {
        if (iterable instanceof Collection) {
            return mc.return((Collection)iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        mc.new((Collection)arrayList, iterable);
        mc.new((Collection)arrayList, iterable2);
        return arrayList;
    }

    public static final List return(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            ArrayList arrayList = new ArrayList(collection.size() + ((Collection)iterable).size());
            arrayList.addAll(collection);
            arrayList.addAll((Collection)iterable);
            return arrayList;
        }
        ArrayList arrayList = new ArrayList(collection);
        mc.new((Collection)arrayList, iterable);
        return arrayList;
    }

    public static final List new(Iterable iterable, n n2) {
        ArrayList arrayList = new ArrayList();
        mc.new((Collection)arrayList, iterable);
        mc.o00000((Collection)arrayList, n2);
        return arrayList;
    }

    public static final List return(Collection collection, n n2) {
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        mc.o00000((Collection)arrayList, n2);
        return arrayList;
    }

    private static final List new(Iterable iterable, Object object) {
        return mc.return(iterable, object);
    }

    private static final List \u00d400000(Collection collection, Object object) {
        return mc.\u00d500000(collection, object);
    }

    public static final List o00000(Iterable iterable, int n2, int n3, boolean bl) {
        e.super(n2, n3);
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            int n4 = ((List)iterable).size();
            int n5 = n4 / n3 + (n4 % n3 == 0 ? 0 : 1);
            ArrayList<List> arrayList = new ArrayList<List>(n5);
            int n6 = 0;
            while (true) {
                int n7;
                boolean bl2 = n6 >= 0 ? n6 < n4 : false;
                if (!bl2 || (n7 = b.e.bb.Object(n2, n4 - n6)) < n2 && !bl) break;
                ArrayList<List> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(n7);
                int n8 = 0;
                while (n8 < n7) {
                    int n9 = n8++;
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(((List)iterable).get(n9 + n6));
                }
                arrayList2.add(arrayList3);
                n6 += n3;
            }
            return arrayList;
        }
        ArrayList<List> arrayList = new ArrayList<List>();
        Iterator iterator = e.super(iterable.iterator(), n2, n3, bl, false);
        while (iterator.hasNext()) {
            List list = (List)iterator.next();
            arrayList.add(list);
        }
        return arrayList;
    }

    public static /* synthetic */ List o00000(Iterable iterable, int n2, int n3, boolean bl, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n3 = 1;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return mc.o00000(iterable, n2, n3, bl);
    }

    public static final List o00000(Iterable object, int n2, int n3, boolean bl, g g2) {
        e.super(n2, n3);
        if (object instanceof RandomAccess && object instanceof List) {
            int n4 = ((List)object).size();
            int n5 = n4 / n3 + (n4 % n3 == 0 ? 0 : 1);
            ArrayList<Object> arrayList = new ArrayList<Object>(n5);
            object = new vb((List)object);
            int n6 = 0;
            while (true) {
                boolean bl2 = n6 >= 0 ? n6 < n4 : false;
                if (!bl2) break;
                int n7 = b.e.bb.Object(n2, n4 - n6);
                if (!bl && n7 < n2) break;
                int n8 = n6;
                ((vb)object).new(n8, n8 + n7);
                arrayList.add(g2.\u00f800000(object));
                n6 += n3;
            }
            return arrayList;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = e.super(object.iterator(), n2, n3, bl, true);
        while (object.hasNext()) {
            List list = (List)object.next();
            arrayList.add(g2.\u00f800000(list));
        }
        return arrayList;
    }

    public static /* synthetic */ List o00000(Iterable iterable, int n2, int n3, boolean bl, g g2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n3 = 1;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        return mc.o00000(iterable, n2, n3, bl, g2);
    }

    public static final List o00000(Iterable object, Object[] objectArray) {
        int n2 = objectArray.length;
        ArrayList<qb> arrayList = new ArrayList<qb>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            if (n3 >= n2) break;
            Object e2 = object2;
            object2 = objectArray[n3++];
            Object e3 = e2;
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(e3, object2));
        }
        return arrayList;
    }

    public static final List o00000(Iterable object, Object[] objectArray, b.o.e.f f2) {
        int n2 = objectArray.length;
        ArrayList<Object> arrayList = new ArrayList<Object>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            arrayList.add(f2.o00000(e2, objectArray[n3++]));
        }
        return arrayList;
    }

    public static final List \u00d300000(Iterable arrayList, Iterable iterable) {
        Iterator iterator = arrayList.iterator();
        Iterator iterator2 = iterable.iterator();
        arrayList = new ArrayList<qb>(Math.min(mc.o00000((Iterable)arrayList, 10), mc.o00000(iterable, 10)));
        while (iterator.hasNext() && iterator2.hasNext()) {
            iterable = iterator2.next();
            Object t2 = iterator.next();
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(t2, iterable));
        }
        return arrayList;
    }

    public static final List o00000(Iterable arrayList, Iterable iterable, b.o.e.f f2) {
        Iterator iterator = arrayList.iterator();
        Iterator iterator2 = iterable.iterator();
        arrayList = new ArrayList<Object>(Math.min(mc.o00000((Iterable)arrayList, 10), mc.o00000(iterable, 10)));
        while (iterator.hasNext() && iterator2.hasNext()) {
            arrayList.add(f2.o00000(iterator.next(), iterator2.next()));
        }
        return arrayList;
    }

    public static final List \u00f4O0000(Iterable object) {
        if (!(object = object.iterator()).hasNext()) {
            return mc.\u00d500000();
        }
        List list = new ArrayList();
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            Object e4 = e2;
            e2 = e3;
            Object e5 = e4;
            List list2 = list;
            list2.add(yc.o00000(e5, e2));
            e2 = e3;
        }
        return list;
    }

    public static final List new(Iterable object, b.o.e.f f2) {
        if (!(object = object.iterator()).hasNext()) {
            return mc.\u00d500000();
        }
        List list = new ArrayList();
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            list.add(f2.o00000(e2, e3));
            e2 = e3;
        }
        return list;
    }

    public static final Appendable o00000(Iterable object, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, g g2) {
        appendable.append(charSequence2);
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (++n3 > 1) {
                appendable.append(charSequence);
            }
            if (n2 >= 0 && n3 > n2) break;
            b.q.f.super(appendable, e2, g2);
        }
        if (n2 >= 0 && n3 > n2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static /* synthetic */ Appendable o00000(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, g g2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            charSequence = ", ";
        }
        if ((n3 & 4) != 0) {
            charSequence2 = "";
        }
        if ((n3 & 8) != 0) {
            charSequence3 = "";
        }
        if ((n3 & 0x10) != 0) {
            n2 = -1;
        }
        if ((n3 & 0x20) != 0) {
            charSequence4 = "...";
        }
        if ((n3 & 0x40) != 0) {
            g2 = null;
        }
        return mc.o00000(iterable, appendable, charSequence, charSequence2, charSequence3, n2, charSequence4, g2);
    }

    public static final String o00000(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, g g2) {
        return ((StringBuilder)mc.o00000(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, n2, charSequence4, g2)).toString();
    }

    public static /* synthetic */ String o00000(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, g g2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            charSequence = ", ";
        }
        if ((n3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((n3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((n3 & 8) != 0) {
            n2 = -1;
        }
        if ((n3 & 0x10) != 0) {
            charSequence4 = "...";
        }
        if ((n3 & 0x20) != 0) {
            g2 = null;
        }
        return mc.o00000(iterable, charSequence, charSequence2, charSequence3, n2, charSequence4, g2);
    }

    private static final Iterable while(Iterable iterable) {
        return iterable;
    }

    public static final n \u00d5o0000(Iterable iterable) {
        return new fc$_b$_b$_b$1(iterable);
    }

    public static final double nullsuper(Iterable object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            byte by = ((Number)object.next()).byteValue();
            d2 += (double)by;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double whilenew(Iterable object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            short s2 = ((Number)object.next()).shortValue();
            d2 += (double)s2;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double \u00d8O0000(Iterable object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            d2 += (double)n3;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double o\u00d20000(Iterable object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            long l2 = ((Number)object.next()).longValue();
            d2 += (double)l2;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double Stringsuper(Iterable object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            float f2 = ((Number)object.next()).floatValue();
            d2 += (double)f2;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double \u00f8\u00d20000(Iterable object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 += d3;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final int returnnew(Iterable object) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            byte by = ((Number)object.next()).byteValue();
            n2 += by;
        }
        return n2;
    }

    public static final int oo0000(Iterable object) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            short s2 = ((Number)object.next()).shortValue();
            n2 += s2;
        }
        return n2;
    }

    public static final int O\u00d30000(Iterable object) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            n2 += n3;
        }
        return n2;
    }

    public static final long \u00d3O0000(Iterable object) {
        long l2 = 0L;
        object = object.iterator();
        while (object.hasNext()) {
            long l3 = ((Number)object.next()).longValue();
            l2 += l3;
        }
        return l2;
    }

    public static final float \u00d3\u00d20000(Iterable object) {
        float f2 = 0.0f;
        object = object.iterator();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 += f3;
        }
        return f2;
    }

    public static final double \u00d5O0000(Iterable object) {
        double d2 = 0.0;
        object = object.iterator();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 += d3;
        }
        return d2;
    }

    private static final Object o00000(int n2, int n3) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + n2 + '.');
    }

    private static final Iterator \u00f5\u00d30000(Iterable iterable) {
        return iterable.iterator();
    }
}

