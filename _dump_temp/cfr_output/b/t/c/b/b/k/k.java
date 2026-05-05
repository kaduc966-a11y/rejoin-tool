/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.c.d;
import b.c.f;
import b.s.mc;
import b.s.z;
import b.t.c.b.b.k.k$_b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k
extends Enum {
    public static final k$_b float;
    private final boolean \u00f400000;
    public static final Set \u00d6O0000;
    public static final Set \u00d400000;
    public static final /* enum */ k void;
    public static final /* enum */ k supersuper;
    public static final /* enum */ k o00000;
    public static final /* enum */ k \u00d5O0000;
    public static final /* enum */ k \u00f500000;
    public static final /* enum */ k \u00d200000;
    public static final /* enum */ k \u00d600000;
    public static final /* enum */ k oO0000;
    public static final /* enum */ k Object;
    public static final /* enum */ k \u00d2O0000;
    public static final /* enum */ k public;
    public static final /* enum */ k OO0000;
    public static final /* enum */ k \u00f4O0000;
    public static final /* enum */ k \u00d500000;
    private static final /* synthetic */ k[] \u00d4O0000;
    private static final /* synthetic */ f \u00f600000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00f400000 = var3_2;
    }

    public static k[] values() {
        return (k[])\u00d4O0000.clone();
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    private static final /* synthetic */ k[] super() {
        k[] kArray = new k[14];
        k[] kArray2 = kArray;
        kArray[0] = void;
        kArray2[1] = supersuper;
        kArray2[2] = o00000;
        kArray2[3] = \u00d5O0000;
        kArray2[4] = \u00f500000;
        kArray2[5] = \u00d200000;
        kArray2[6] = \u00d600000;
        kArray2[7] = oO0000;
        kArray2[8] = Object;
        kArray2[9] = \u00d2O0000;
        kArray2[10] = public;
        kArray2[11] = OO0000;
        kArray2[12] = \u00f4O0000;
        kArray2[13] = \u00d500000;
        return kArray2;
    }

    static {
        void = new k("VISIBILITY", 0, true);
        supersuper = new k("MODALITY", 1, true);
        o00000 = new k("OVERRIDE", 2, true);
        \u00d5O0000 = new k("ANNOTATIONS", 3, false);
        \u00f500000 = new k("INNER", 4, true);
        \u00d200000 = new k("MEMBER_KIND", 5, true);
        \u00d600000 = new k("DATA", 6, true);
        oO0000 = new k("INLINE", 7, true);
        Object = new k("EXPECT", 8, true);
        \u00d2O0000 = new k("ACTUAL", 9, true);
        public = new k("CONST", 10, true);
        OO0000 = new k("LATEINIT", 11, true);
        \u00f4O0000 = new k("FUN", 12, true);
        \u00d500000 = new k("VALUE", 13, true);
        \u00d4O0000 = k.super();
        \u00f600000 = d.o00000(\u00d4O0000);
        float = new k$_b(null);
        k[] kArray = k.values();
        Collection collection = new ArrayList();
        for (k k2 : kArray) {
            if (!k2.\u00f400000) continue;
            collection.add(k2);
        }
        \u00d6O0000 = mc.\u00d4O0000((Iterable)((List)collection));
        \u00d400000 = z.\u00d3o0000((Object[])k.values());
    }
}

