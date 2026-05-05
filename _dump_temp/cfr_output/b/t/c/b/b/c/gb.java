/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;
import b.t.c.b.b.c.b.j;
import b.t.c.b.b.l.d.l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class gb
extends Enum {
    private final j \u00d600000;
    public static final /* enum */ gb \u00f600000 = new gb("CLASS", 0, 0);
    public static final /* enum */ gb void = new gb("INTERFACE", 1, 1);
    public static final /* enum */ gb \u00f500000 = new gb("ENUM_CLASS", 2, 2);
    public static final /* enum */ gb \u00d400000 = new gb("ENUM_ENTRY", 3, 3);
    public static final /* enum */ gb o00000 = new gb("ANNOTATION_CLASS", 4, 4);
    public static final /* enum */ gb \u00d200000 = new gb("OBJECT", 5, 5);
    public static final /* enum */ gb \u00f400000 = new gb("COMPANION_OBJECT", 6, 6);
    private static final /* synthetic */ gb[] \u00d500000;
    private static final /* synthetic */ f Object;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d600000 = new j(l.\u00f8o0000, (int)var3_2);
    }

    public final j Object() {
        return this.\u00d600000;
    }

    public static gb[] values() {
        return (gb[])\u00d500000.clone();
    }

    public static gb valueOf(String string) {
        return Enum.valueOf(gb.class, string);
    }

    public static f \u00d200000() {
        return Object;
    }

    private static final /* synthetic */ gb[] o00000() {
        gb[] gbArray = new gb[7];
        gb[] gbArray2 = gbArray;
        gbArray[0] = \u00f600000;
        gbArray2[1] = void;
        gbArray2[2] = \u00f500000;
        gbArray2[3] = \u00d400000;
        gbArray2[4] = o00000;
        gbArray2[5] = \u00d200000;
        gbArray2[6] = \u00f400000;
        return gbArray2;
    }

    static {
        \u00d500000 = gb.o00000();
        Object = d.o00000(\u00d500000);
    }
}

