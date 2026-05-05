/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.o.d.fc;
import b.o.e.g;
import b.y.b$_b$1;
import b.y.b$_b$2;
import b.y.b$_c$2;
import b.y.b$_c$3;
import b.y.b$_d$1;
import b.y.b$_d$2;
import b.y.b$_e$1;
import b.y.b$_f$1;
import b.y.b$_f$2;
import b.y.d;
import b.y.f;
import b.y.h;
import b.y.j;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b {
    public static final int super(Object object, Object object2, g ... gArray) {
        if (!(gArray.length > 0)) {
            object = "Failed requirement.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.\u00d200000(object, object2, gArray);
    }

    private static final int \u00d200000(Object object, Object object2, g[] gArray) {
        for (g object3 : gArray) {
            Comparable comparable;
            Comparable comparable2 = (Comparable)object3.\u00f800000(object);
            int n2 = f.super(comparable2, comparable = (Comparable)object3.\u00f800000(object2));
            if (n2 == 0) continue;
            return n2;
        }
        return 0;
    }

    private static final int super(Object object, Object object2, g g2) {
        return f.super((Comparable)g2.\u00f800000(object), (Comparable)g2.\u00f800000(object2));
    }

    private static final int super(Object object, Object object2, Comparator comparator, g g2) {
        return comparator.compare(g2.\u00f800000(object), g2.\u00f800000(object2));
    }

    public static final int super(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final Comparator super(g ... object) {
        if (!(((g[])object).length > 0)) {
            object = "Failed requirement.";
            throw new IllegalArgumentException(object.toString());
        }
        return (arg_0, arg_1) -> b.super((g[])object, arg_0, arg_1);
    }

    private static final Comparator super(g g2) {
        return new b$_c$2(g2);
    }

    private static final Comparator super(Comparator comparator, g g2) {
        return new b$_c$3(comparator, g2);
    }

    private static final Comparator \u00d200000(g g2) {
        return new b$_d$1(g2);
    }

    private static final Comparator \u00d200000(Comparator comparator, g g2) {
        return new b$_d$2(comparator, g2);
    }

    private static final Comparator \u00d300000(Comparator comparator, g g2) {
        return new b$_f$1(comparator, g2);
    }

    private static final Comparator super(Comparator comparator, Comparator comparator2, g g2) {
        return new b$_f$2(comparator, comparator2, g2);
    }

    private static final Comparator \u00d400000(Comparator comparator, g g2) {
        return new b$_b$1(comparator, g2);
    }

    private static final Comparator \u00d200000(Comparator comparator, Comparator comparator2, g g2) {
        return new b$_b$2(comparator, comparator2, g2);
    }

    private static final Comparator super(Comparator comparator, b.o.e.f f2) {
        return new b$_e$1(comparator, f2);
    }

    public static final Comparator super(Comparator comparator, Comparator comparator2) {
        return (arg_0, arg_1) -> b.\u00d200000(comparator, comparator2, arg_0, arg_1);
    }

    public static final Comparator \u00d200000(Comparator comparator, Comparator comparator2) {
        return (arg_0, arg_1) -> b.super(comparator, comparator2, arg_0, arg_1);
    }

    public static final Comparator super(Comparator comparator) {
        return (arg_0, arg_1) -> b.super(comparator, arg_0, arg_1);
    }

    private static final Comparator \u00d200000() {
        return f.super(f.\u00d400000());
    }

    public static final Comparator \u00d200000(Comparator comparator) {
        return (arg_0, arg_1) -> b.\u00d200000(comparator, arg_0, arg_1);
    }

    private static final Comparator \u00d300000() {
        return f.\u00d200000(f.\u00d400000());
    }

    public static final Comparator \u00d400000() {
        return d.o00000;
    }

    public static final Comparator super() {
        return h.o00000;
    }

    public static final Comparator \u00d300000(Comparator comparator) {
        Comparator comparator2 = comparator;
        if (comparator2 instanceof j) {
            return ((j)comparator).o00000();
        }
        if (fc.o00000((Object)comparator2, (Object)d.o00000)) {
            return h.o00000;
        }
        if (fc.o00000((Object)comparator2, (Object)h.o00000)) {
            return d.o00000;
        }
        return new j(comparator);
    }

    private static final int super(g[] gArray, Object object, Object object2) {
        return b.\u00d200000(object, object2, gArray);
    }

    private static final int \u00d200000(Comparator comparator, Comparator comparator2, Object object, Object object2) {
        int n2 = comparator.compare(object, object2);
        if (n2 != 0) {
            return n2;
        }
        return comparator2.compare(object, object2);
    }

    private static final int super(Comparator comparator, Comparator comparator2, Object object, Object object2) {
        int n2 = comparator.compare(object, object2);
        if (n2 != 0) {
            return n2;
        }
        return comparator2.compare(object2, object);
    }

    private static final int super(Comparator comparator, Object object, Object object2) {
        if (object == object2) {
            return 0;
        }
        if (object == null) {
            return -1;
        }
        if (object2 == null) {
            return 1;
        }
        return comparator.compare(object, object2);
    }

    private static final int \u00d200000(Comparator comparator, Object object, Object object2) {
        if (object == object2) {
            return 0;
        }
        if (object == null) {
            return 1;
        }
        if (object2 == null) {
            return -1;
        }
        return comparator.compare(object, object2);
    }
}

