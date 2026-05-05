/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b.b;

import b.c.d;
import b.c.f;
import b.e.bb;
import b.s.y;
import b.t.c.b.b.n.b.b.c$_b$_b;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c$_b
extends Enum {
    public static final c$_b$_b \u00f500000;
    private final int o00000;
    private static final Map \u00d500000;
    public static final /* enum */ c$_b void;
    public static final /* enum */ c$_b \u00f600000;
    public static final /* enum */ c$_b \u00d600000;
    public static final /* enum */ c$_b \u00f400000;
    public static final /* enum */ c$_b float;
    public static final /* enum */ c$_b \u00d200000;
    private static final /* synthetic */ c$_b[] \u00d400000;
    private static final /* synthetic */ f Object;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c$_b() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o00000 = var3_2;
    }

    public static c$_b[] values() {
        return (c$_b[])\u00d400000.clone();
    }

    public static c$_b valueOf(String string) {
        return Enum.valueOf(c$_b.class, string);
    }

    private static final /* synthetic */ c$_b[] o00000() {
        c$_b[] c$_bArray = new c$_b[6];
        c$_b[] c$_bArray2 = c$_bArray;
        c$_bArray[0] = void;
        c$_bArray2[1] = \u00f600000;
        c$_bArray2[2] = \u00d600000;
        c$_bArray2[3] = \u00f400000;
        c$_bArray2[4] = float;
        c$_bArray2[5] = \u00d200000;
        return c$_bArray2;
    }

    public static final c$_b o00000(int n2) {
        return \u00f500000.o00000(n2);
    }

    public static final /* synthetic */ Map \u00d200000() {
        return \u00d500000;
    }

    static {
        void = new c$_b("UNKNOWN", 0, 0);
        \u00f600000 = new c$_b("CLASS", 1, 1);
        \u00d600000 = new c$_b("FILE_FACADE", 2, 2);
        \u00f400000 = new c$_b("SYNTHETIC_CLASS", 3, 3);
        float = new c$_b("MULTIFILE_CLASS", 4, 4);
        \u00d200000 = new c$_b("MULTIFILE_CLASS_PART", 5, 5);
        \u00d400000 = c$_b.o00000();
        Object = d.o00000(\u00d400000);
        \u00f500000 = new c$_b$_b(null);
        c$_b[] c$_bArray = c$_b.values();
        int n2 = bb.\u00d200000(y.\u00d200000(c$_bArray.length), 16);
        Map map = new LinkedHashMap(n2);
        int n3 = c$_bArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            c$_b c$_b;
            c$_b c$_b2 = c$_b = c$_bArray[i2];
            Map map2 = map;
            map2.put(c$_b2.o00000, c$_b);
        }
        \u00d500000 = map;
    }
}

