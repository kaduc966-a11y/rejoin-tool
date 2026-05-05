/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

import b.e.bb;
import b.qb;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.d.c;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.yc;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g {
    private static final d \u00f600000(String string) {
        return new d(c.\u00f4o0000.OO0000(), f.\u00d300000(string));
    }

    private static final d \u00d200000(d d2) {
        return new d(c.\u00f4o0000.OO0000(), f.\u00d300000("U" + d2.o00000().\u00d300000()));
    }

    private static final d float(String string) {
        return new d(c.\u00f4o0000.void(), f.\u00d300000(string));
    }

    private static final d o00000(f f2) {
        return new d(c.\u00f4o0000.public().\u00d800000(), f.\u00d300000(f2.\u00d300000() + c.\u00f4o0000.public().o00000().\u00d300000()));
    }

    private static final d \u00d600000(String string) {
        return new d(c.\u00f4o0000.\u00d200000(), f.\u00d300000(string));
    }

    private static final d \u00d4O0000(String string) {
        return new d(c.\u00f4o0000.\u00d500000(), f.\u00d300000(string));
    }

    private static final d public(String string) {
        return new d(c.\u00f4o0000.\u00f500000(), f.\u00d300000(string));
    }

    private static final d \u00d400000(String string) {
        return new d(c.\u00f4o0000.\u00d600000(), f.\u00d300000(string));
    }

    private static final d OO0000(String string) {
        return new d(c.\u00f4o0000.oO0000(), f.\u00d300000(string));
    }

    private static final d \u00d6O0000(String string) {
        return new d(c.\u00f4o0000.\u00f600000(), f.\u00d300000(string));
    }

    private static final d \u00d5O0000(String string) {
        return new d(c.\u00f4o0000.float(), f.\u00d300000(string));
    }

    private static final Map o00000(Map iterator) {
        iterator = iterator.entrySet();
        int n2 = bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)((Object)iterator), 10)), 16);
        Map map = new LinkedHashMap(n2);
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Map map2 = map;
            object = (Map.Entry)object;
            Object k2 = object.getKey();
            object = yc.o00000(object.getValue(), k2);
            map2.put(((qb)object).new(), ((qb)object).o00000());
        }
        return map;
    }

    public static final /* synthetic */ d \u00d500000(String string) {
        return g.\u00f600000(string);
    }

    public static final /* synthetic */ d \u00f400000(String string) {
        return g.float(string);
    }

    public static final /* synthetic */ d Object(String string) {
        return g.\u00d400000(string);
    }

    public static final /* synthetic */ d oO0000(String string) {
        return g.public(string);
    }

    public static final /* synthetic */ d o00000(d d2) {
        return g.\u00d200000(d2);
    }

    public static final /* synthetic */ d o00000(String string) {
        return g.\u00d5O0000(string);
    }

    public static final /* synthetic */ d \u00d200000(f f2) {
        return g.o00000(f2);
    }

    public static final /* synthetic */ Map \u00d200000(Map map) {
        return g.o00000(map);
    }

    public static final /* synthetic */ d \u00d200000(String string) {
        return g.\u00d600000(string);
    }

    public static final /* synthetic */ d \u00d2O0000(String string) {
        return g.\u00d4O0000(string);
    }

    public static final /* synthetic */ d \u00f500000(String string) {
        return g.OO0000(string);
    }

    public static final /* synthetic */ d void(String string) {
        return g.\u00d6O0000(string);
    }
}

