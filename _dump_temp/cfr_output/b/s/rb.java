/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.g.n;
import b.o.d.fc;
import b.s.mc;
import b.s.ub;
import b.s.v;
import b.s.y;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class rb
extends v {
    public static final Set \u00d400000(Set object, Object object2) {
        Collection collection = new LinkedHashSet(y.\u00d200000(object.size()));
        boolean bl = false;
        object = (Iterable)object;
        collection = collection;
        object = object.iterator();
        while (object.hasNext()) {
            boolean bl2;
            Object e2;
            Object e3 = e2 = object.next();
            if (!bl && fc.o00000(e3, object2)) {
                bl = true;
                bl2 = false;
            } else {
                bl2 = true;
            }
            if (!bl2) continue;
            collection.add(e2);
        }
        return (Set)collection;
    }

    public static final Set super(Set linkedHashSet, Object[] objectArray) {
        linkedHashSet = new LinkedHashSet(linkedHashSet);
        mc.\u00d800000(linkedHashSet, objectArray);
        return linkedHashSet;
    }

    public static final Set \u00d200000(Set object, Iterable iterable) {
        if ((iterable = mc.\u00d500000(iterable)).isEmpty()) {
            return mc.\u00d4O0000((Iterable)object);
        }
        if (iterable instanceof Set) {
            object = (Iterable)object;
            Collection collection = new LinkedHashSet();
            object = object.iterator();
            while (object.hasNext()) {
                Object e2 = object.next();
                Object e3 = e2;
                if (((Set)iterable).contains(e3)) continue;
                collection.add(e2);
            }
            return (Set)collection;
        }
        object = new LinkedHashSet((Collection)object);
        ((AbstractSet)object).removeAll((Collection<?>)iterable);
        return (Set)object;
    }

    public static final Set \u00d200000(Set linkedHashSet, n n2) {
        linkedHashSet = new LinkedHashSet(linkedHashSet);
        mc.\u00d400000((Collection)linkedHashSet, n2);
        return linkedHashSet;
    }

    private static final Set \u00d300000(Set set, Object object) {
        return ub.\u00d400000(set, object);
    }

    public static final Set \u00d200000(Set set, Object object) {
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>(y.\u00d200000(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(object);
        return linkedHashSet;
    }

    public static final Set \u00d200000(Set set, Object[] objectArray) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.\u00d200000(set.size() + objectArray.length));
        linkedHashSet.addAll(set);
        mc.\u00d500000((Collection)linkedHashSet, objectArray);
        return linkedHashSet;
    }

    public static final Set super(Set set, Iterable iterable) {
        int n2;
        int n3;
        Integer n4 = mc.\u00d400000(iterable);
        if (n4 != null) {
            n3 = ((Number)n4).intValue();
            n2 = set.size() + n3;
        } else {
            n2 = set.size() * 2;
        }
        n3 = y.\u00d200000(n2);
        LinkedHashSet linkedHashSet = new LinkedHashSet(n3);
        linkedHashSet.addAll(set);
        mc.new((Collection)linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static final Set super(Set set, n n2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.\u00d200000(set.size() * 2));
        linkedHashSet.addAll(set);
        mc.o00000((Collection)linkedHashSet, n2);
        return linkedHashSet;
    }

    private static final Set super(Set set, Object object) {
        return ub.\u00d200000(set, object);
    }
}

