/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.b;

import b.q.f;
import b.s.mc;
import b.t.c.b.b.b.b.b;
import b.t.c.b.b.b.b.b$_b;
import b.t.c.b.b.b.b.b$_c;
import b.t.c.b.b.b.b.b$_d;
import b.t.c.b.b.b.b.b$_e;
import b.t.c.b.b.b.b.e$_b;
import b.t.c.b.b.b.b.e$_c;
import b.t.c.b.b.d.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static final e$_c \u00d400000 = new e$_c(null);
    private final List \u00d300000;
    private final Map new;
    private static final e o00000;

    public e(List object) {
        this.\u00d300000 = object;
        e e2 = this;
        object = e2.\u00d300000;
        e e3 = e2;
        Map map = new LinkedHashMap();
        object = object.iterator();
        while (object.hasNext()) {
            Map map2 = map;
            Object e4 = object.next();
            k k2 = ((b)e4).o00000();
            Object object2 = map2.get(k2);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(k2, object2);
            }
            ((List)object2).add(e4);
        }
        e3.new = map;
    }

    public final b \u00d200000(k k2, String string) {
        e$_b e$_b = this.o00000(k2, string);
        if (e$_b != null) {
            return e$_b.\u00d300000();
        }
        return null;
    }

    public final e$_b o00000(k object, String string) {
        List list = (List)this.new.get(object);
        if (list == null) {
            return null;
        }
        for (b b2 : list) {
            if (!f.\u00d300000(string, b2.new(), false, 2, null)) continue;
            Integer n2 = this.o00000(string.substring(b2.new().length()));
            if (n2 == null) {
                continue;
            }
            int n3 = n2;
            return new e$_b(b2, n3);
        }
        return null;
    }

    private final Integer o00000(String string) {
        if (((CharSequence)string).length() == 0) {
            return null;
        }
        int n2 = 0;
        int n3 = string.length();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = string.charAt(i2) - 48;
            if (!(n4 >= 0 ? n4 < 10 : false)) {
                return null;
            }
            n2 = n2 * 10 + n4;
        }
        return n2;
    }

    public static final /* synthetic */ e o00000() {
        return o00000;
    }

    static {
        Object[] objectArray = new b[4];
        Object[] objectArray2 = objectArray;
        objectArray[0] = b$_b.\u00f800000;
        objectArray2[1] = b$_e.if;
        objectArray2[2] = b$_c.\u00f400000;
        objectArray2[3] = b$_d.\u00f500000;
        o00000 = new e(mc.new(objectArray2));
    }
}

