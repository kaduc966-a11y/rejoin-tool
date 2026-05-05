/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.s.d.b;
import b.s.ub;
import b.s.z;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d {
    public static final Set super(Object object) {
        return Collections.singleton(object);
    }

    private static final Set super(g g2) {
        Set set = ub.super();
        g2.\u00f800000(set);
        return ub.super(set);
    }

    private static final Set super(int n2, g g2) {
        Set set = ub.super(n2);
        g2.\u00f800000(set);
        return ub.super(set);
    }

    public static final Set super() {
        return new b();
    }

    public static final Set super(int n2) {
        return new b(n2);
    }

    public static final Set super(Set set) {
        return ((b)set).newthisnew();
    }

    public static final TreeSet super(Object ... objectArray) {
        return (TreeSet)z.\u00d500000(objectArray, new TreeSet());
    }

    public static final TreeSet super(Comparator comparator, Object ... objectArray) {
        return (TreeSet)z.\u00d500000(objectArray, new TreeSet(comparator));
    }
}

