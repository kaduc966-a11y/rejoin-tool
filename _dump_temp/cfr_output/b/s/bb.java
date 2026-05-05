/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.s.hb;
import b.s.mc;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bb
extends hb {
    public static final List o00000(Iterable iterable, Class clazz) {
        return (List)mc.o00000(iterable, new ArrayList(), clazz);
    }

    public static final Collection o00000(Iterable object, Collection collection, Class clazz) {
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!clazz.isInstance(e2)) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final void oO0000(List list) {
        Collections.reverse(list);
    }

    public static final SortedSet OO0000(Iterable iterable) {
        return (SortedSet)mc.new(iterable, new TreeSet());
    }

    public static final SortedSet o00000(Iterable iterable, Comparator comparator) {
        return (SortedSet)mc.new(iterable, new TreeSet(comparator));
    }

    public static final /* synthetic */ Double \u00f400000(Iterable iterable) {
        return mc.\u00d8\u00d30000(iterable);
    }

    public static final /* synthetic */ Float \u00f800000(Iterable iterable) {
        return mc.ifnew(iterable);
    }

    public static final /* synthetic */ Comparable \u00d800000(Iterable iterable) {
        return mc.thissuper(iterable);
    }

    public static final /* synthetic */ Object \u00d500000(Iterable object, g g2) {
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

    public static final /* synthetic */ Object \u00d300000(Iterable iterable, Comparator comparator) {
        return mc.\u00d800000(iterable, comparator);
    }

    public static final /* synthetic */ Double \u00f500000(Iterable iterable) {
        return mc.\u00f4o0000(iterable);
    }

    public static final /* synthetic */ Float return(Iterable iterable) {
        return mc.\u00f8O0000(iterable);
    }

    public static final /* synthetic */ Comparable if(Iterable iterable) {
        return mc.\u00d8\u00d20000(iterable);
    }

    public static final /* synthetic */ Object \u00d300000(Iterable object, g g2) {
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

    public static final /* synthetic */ Object new(Iterable iterable, Comparator comparator) {
        return mc.\u00f400000(iterable, comparator);
    }

    private static final BigDecimal return(Iterable object, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(e2));
        }
        return bigDecimal;
    }

    private static final BigInteger \u00d400000(Iterable object, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(e2));
        }
        return bigInteger;
    }
}

