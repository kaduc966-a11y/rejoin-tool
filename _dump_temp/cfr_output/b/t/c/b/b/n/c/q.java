/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.s.y;
import b.t.c.b.b.d.c;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.yc;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class q {
    public static final q \u00d200000 = new q();
    private static final Map super = new LinkedHashMap();
    private static final Map \u00d300000;

    private q() {
    }

    public final k o00000(k k2) {
        return (k)\u00d300000.get(k2);
    }

    private final void o00000(d d2, List object) {
        object = (Iterable)object;
        Map map = super;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2;
            Object object2 = object.next();
            d cfr_ignored_0 = (d)object2;
            object2 = map;
            d d3 = d2;
            object2.put(e2, (d)d3);
        }
    }

    private final List o00000(String ... object) {
        String[] stringArray = object;
        object = new ArrayList(((String[])object).length);
        for (String string : stringArray) {
            Object object2 = object;
            object2.add(d.String.o00000(new k(string)));
        }
        return (List)object;
    }

    static {
        String[] stringArray = new String[2];
        Object object = stringArray;
        stringArray[0] = "java.util.ArrayList";
        object[1] = "java.util.LinkedList";
        \u00d200000.o00000(c.\u00f4o0000.\u00d4O0000(), \u00d200000.o00000((String[])object));
        String[] stringArray2 = new String[3];
        object = stringArray2;
        stringArray2[0] = "java.util.HashSet";
        object[1] = "java.util.TreeSet";
        object[2] = "java.util.LinkedHashSet";
        \u00d200000.o00000(c.\u00f4o0000.\u00d2O0000(), \u00d200000.o00000((String[])object));
        String[] stringArray3 = new String[5];
        object = stringArray3;
        stringArray3[0] = "java.util.HashMap";
        object[1] = "java.util.TreeMap";
        object[2] = "java.util.LinkedHashMap";
        object[3] = "java.util.concurrent.ConcurrentHashMap";
        object[4] = "java.util.concurrent.ConcurrentSkipListMap";
        \u00d200000.o00000(c.\u00f4o0000.Object(), \u00d200000.o00000((String[])object));
        String[] stringArray4 = new String[1];
        object = stringArray4;
        stringArray4[0] = "java.util.function.UnaryOperator";
        \u00d200000.o00000(d.String.o00000(new k("java.util.function.Function")), \u00d200000.o00000((String[])object));
        String[] stringArray5 = new String[1];
        object = stringArray5;
        stringArray5[0] = "java.util.function.BinaryOperator";
        \u00d200000.o00000(d.String.o00000(new k("java.util.function.BiFunction")), \u00d200000.o00000((String[])object));
        Object object2 = object = super;
        object = new ArrayList(object.size());
        for (Map.Entry entry : object2.entrySet()) {
            Object object3 = object;
            d d2 = (d)entry.getKey();
            d object32 = (d)entry.getValue();
            object3.add(yc.o00000(d2.\u00f400000(), object32.\u00f400000()));
        }
        \u00d300000 = y.o00000((List)object);
    }
}

