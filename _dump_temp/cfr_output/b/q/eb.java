/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.c.d;
import b.c.f;
import b.dc;
import b.e.bb;
import b.q.eb$_b;
import b.r;
import b.s.mc;
import b.s.y;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class eb
extends Enum {
    public static final eb$_b float;
    private final int oO0000;
    private static final dc \u00d6O0000;
    public static final /* enum */ eb oo0000;
    public static final /* enum */ eb \u00d500000;
    public static final /* enum */ eb \u00d600000;
    public static final /* enum */ eb Oo0000;
    public static final /* enum */ eb \u00f6O0000;
    public static final /* enum */ eb void;
    public static final /* enum */ eb o00000;
    public static final /* enum */ eb Object;
    public static final /* enum */ eb \u00f5O0000;
    public static final /* enum */ eb \u00d2O0000;
    public static final /* enum */ eb \u00d400000;
    public static final /* enum */ eb \u00d200000;
    public static final /* enum */ eb \u00f500000;
    public static final /* enum */ eb \u00f4O0000;
    public static final /* enum */ eb \u00d5O0000;
    public static final /* enum */ eb supersuper;
    public static final /* enum */ eb OO0000;
    public static final /* enum */ eb classsuper;
    public static final /* enum */ eb \u00d4O0000;
    public static final /* enum */ eb \u00f400000;
    private static final /* synthetic */ eb[] public;
    private static final /* synthetic */ f \u00f600000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.oO0000 = var3_2;
    }

    public final int \u00d300000() {
        return this.oO0000;
    }

    public static eb[] values() {
        return (eb[])public.clone();
    }

    public static eb valueOf(String string) {
        return Enum.valueOf(eb.class, string);
    }

    public static f \u00d200000() {
        return \u00f600000;
    }

    private static final Map String() {
        Object object = eb.\u00d200000();
        int n2 = bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
        Map map = new LinkedHashMap(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            eb eb2 = (eb)((Object)e2);
            Map map2 = map;
            map2.put(eb2.oO0000, e2);
        }
        return map;
    }

    private static final /* synthetic */ eb[] o00000() {
        eb[] ebArray = new eb[20];
        eb[] ebArray2 = ebArray;
        ebArray[0] = oo0000;
        ebArray2[1] = \u00d500000;
        ebArray2[2] = \u00d600000;
        ebArray2[3] = Oo0000;
        ebArray2[4] = \u00f6O0000;
        ebArray2[5] = void;
        ebArray2[6] = o00000;
        ebArray2[7] = Object;
        ebArray2[8] = \u00f5O0000;
        ebArray2[9] = \u00d2O0000;
        ebArray2[10] = \u00d400000;
        ebArray2[11] = \u00d200000;
        ebArray2[12] = \u00f500000;
        ebArray2[13] = \u00f4O0000;
        ebArray2[14] = \u00d5O0000;
        ebArray2[15] = supersuper;
        ebArray2[16] = OO0000;
        ebArray2[17] = classsuper;
        ebArray2[18] = \u00d4O0000;
        ebArray2[19] = \u00f400000;
        return ebArray2;
    }

    public static final /* synthetic */ dc \u00d500000() {
        return \u00d6O0000;
    }

    static {
        oo0000 = new eb("UNDEFINED", 0, -1);
        \u00d500000 = new eb("LEFT_TO_RIGHT", 1, 0);
        \u00d600000 = new eb("RIGHT_TO_LEFT", 2, 1);
        Oo0000 = new eb("RIGHT_TO_LEFT_ARABIC", 3, 2);
        \u00f6O0000 = new eb("EUROPEAN_NUMBER", 4, 3);
        void = new eb("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
        o00000 = new eb("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
        Object = new eb("ARABIC_NUMBER", 7, 6);
        \u00f5O0000 = new eb("COMMON_NUMBER_SEPARATOR", 8, 7);
        \u00d2O0000 = new eb("NONSPACING_MARK", 9, 8);
        \u00d400000 = new eb("BOUNDARY_NEUTRAL", 10, 9);
        \u00d200000 = new eb("PARAGRAPH_SEPARATOR", 11, 10);
        \u00f500000 = new eb("SEGMENT_SEPARATOR", 12, 11);
        \u00f4O0000 = new eb("WHITESPACE", 13, 12);
        \u00d5O0000 = new eb("OTHER_NEUTRALS", 14, 13);
        supersuper = new eb("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
        OO0000 = new eb("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
        classsuper = new eb("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
        \u00d4O0000 = new eb("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
        \u00f400000 = new eb("POP_DIRECTIONAL_FORMAT", 19, 18);
        public = eb.o00000();
        \u00f600000 = d.o00000(public);
        float = new eb$_b(null);
        \u00d6O0000 = r.o00000(eb::String);
    }
}

