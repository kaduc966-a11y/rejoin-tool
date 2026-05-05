/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.s.d;
import b.s.qc;
import b.s.ub;
import b.s.y;
import b.s.z;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class v
extends d {
    public static final Set \u00d300000() {
        return qc.privateclassclass;
    }

    public static final Set \u00d300000(Object ... objectArray) {
        return z.\u00d3o0000(objectArray);
    }

    private static final Set \u00d400000() {
        return ub.\u00d300000();
    }

    private static final Set \u00d200000() {
        return new LinkedHashSet();
    }

    public static final Set \u00d600000(Object ... objectArray) {
        return (Set)z.\u00d500000(objectArray, new LinkedHashSet(y.\u00d200000(objectArray.length)));
    }

    private static final HashSet \u00d600000() {
        return new HashSet();
    }

    public static final HashSet \u00d400000(Object ... objectArray) {
        return (HashSet)z.\u00d500000(objectArray, new HashSet(y.\u00d200000(objectArray.length)));
    }

    private static final LinkedHashSet class() {
        return new LinkedHashSet();
    }

    public static final LinkedHashSet class(Object ... objectArray) {
        return (LinkedHashSet)z.\u00d500000(objectArray, new LinkedHashSet(y.\u00d200000(objectArray.length)));
    }

    public static final Set \u00d200000(Object object) {
        Object object2 = object;
        if (object2 != null) {
            return ub.super(object2);
        }
        return ub.\u00d300000();
    }

    public static final Set \u00d200000(Object ... objectArray) {
        return (Set)z.\u00d200000(objectArray, (Collection)new LinkedHashSet());
    }

    private static final Set \u00d200000(g g2) {
        Set set = ub.super();
        g2.\u00f800000(set);
        return ub.super(set);
    }

    private static final Set \u00d200000(int n2, g g2) {
        Set set = ub.super(n2);
        g2.\u00f800000(set);
        return ub.super(set);
    }

    private static final Set \u00d300000(Set set) {
        Set set2 = set;
        if (set2 == null) {
            set2 = ub.\u00d300000();
        }
        return set2;
    }

    public static final Set \u00d200000(Set set) {
        switch (set.size()) {
            case 0: {
                return ub.\u00d300000();
            }
            case 1: {
                return ub.super(set.iterator().next());
            }
        }
        return set;
    }
}

