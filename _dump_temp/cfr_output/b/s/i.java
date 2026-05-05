/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.s.gb;
import b.s.mc;
import java.util.Comparator;
import java.util.Map;

class i
extends gb {
    private static final /* synthetic */ Map.Entry \u00f500000(Map object, g g2) {
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

    private static final /* synthetic */ Map.Entry Object(Map map, Comparator comparator) {
        return (Map.Entry)mc.\u00d800000((Iterable)map.entrySet(), comparator);
    }

    public static final /* synthetic */ Map.Entry \u00f600000(Map object, g g2) {
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

    public static final /* synthetic */ Map.Entry \u00d200000(Map map, Comparator comparator) {
        return (Map.Entry)mc.\u00f400000((Iterable)map.entrySet(), comparator);
    }
}

