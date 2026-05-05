/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.y.f;
import b.y.g;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class e
extends g {
    public static final Object \u00d200000(Object object, Object object2, Object object3, Comparator comparator) {
        return f.super(object, f.super(object2, object3, comparator), comparator);
    }

    public static final Object super(Object object, Object object2, Comparator comparator) {
        if (comparator.compare(object, object2) >= 0) {
            return object;
        }
        return object2;
    }

    public static final Object super(Object object, Object[] objectArray, Comparator comparator) {
        for (Object object2 : objectArray) {
            if (comparator.compare(object, object2) >= 0) continue;
            object = object2;
        }
        return object;
    }

    public static final Object super(Object object, Object object2, Object object3, Comparator comparator) {
        return f.\u00d200000(object, f.\u00d200000(object2, object3, comparator), comparator);
    }

    public static final Object \u00d200000(Object object, Object object2, Comparator comparator) {
        if (comparator.compare(object, object2) <= 0) {
            return object;
        }
        return object2;
    }

    public static final Object \u00d200000(Object object, Object[] objectArray, Comparator comparator) {
        for (Object object2 : objectArray) {
            if (comparator.compare(object, object2) <= 0) continue;
            object = object2;
        }
        return object;
    }
}

