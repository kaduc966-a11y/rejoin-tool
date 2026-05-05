/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.c;
import b.g.n;
import b.g.t;
import b.o.e.g;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class i
extends t {
    public static final n o00000(n n2, Class clazz) {
        return c.nullnew(n2, arg_0 -> i.o00000(clazz, arg_0));
    }

    public static final Collection o00000(n object, Collection collection, Class clazz) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!clazz.isInstance(e2)) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final SortedSet oO0000(n n2) {
        return (SortedSet)c.o00000(n2, new TreeSet());
    }

    public static final SortedSet \u00d200000(n n2, Comparator comparator) {
        return (SortedSet)c.o00000(n2, new TreeSet(comparator));
    }

    public static final /* synthetic */ Double \u00f800000(n n2) {
        return c.\u00f6\u00d20000(n2);
    }

    public static final /* synthetic */ Float \u00d2O0000(n n2) {
        return c.\u00d5O0000(n2);
    }

    public static final /* synthetic */ Comparable \u00f500000(n n2) {
        return c.\u00d3O0000(n2);
    }

    public static final /* synthetic */ Object \u00d200000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
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

    public static final /* synthetic */ Object o00000(n n2, Comparator comparator) {
        return c.\u00d500000(n2, comparator);
    }

    public static final /* synthetic */ Double \u00f600000(n n2) {
        return c.\u00d2\u00d20000(n2);
    }

    public static final /* synthetic */ Float null(n n2) {
        return c.\u00d5\u00d20000(n2);
    }

    public static final /* synthetic */ Comparable for(n n2) {
        return c.\u00d5o0000(n2);
    }

    public static final /* synthetic */ Object \u00d300000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
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

    public static final /* synthetic */ Object \u00d300000(n n2, Comparator comparator) {
        return c.\u00d800000(n2, comparator);
    }

    private static final BigDecimal String(n object, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(e2));
        }
        return bigDecimal;
    }

    private static final BigInteger \u00d500000(n object, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(e2));
        }
        return bigInteger;
    }

    private static final boolean o00000(Class clazz, Object object) {
        return clazz.isInstance(object);
    }
}

