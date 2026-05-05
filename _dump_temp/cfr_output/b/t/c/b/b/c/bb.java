/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bb
extends Enum {
    public static final /* enum */ bb super = new bb("WARNING", 0);
    public static final /* enum */ bb \u00d300000 = new bb("ERROR", 1);
    public static final /* enum */ bb class = new bb("HIDDEN", 2);
    private static final /* synthetic */ bb[] \u00d400000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bb() {
        void var2_-1;
        void var1_-1;
    }

    public static bb[] values() {
        return (bb[])\u00d400000.clone();
    }

    public static bb valueOf(String string) {
        return Enum.valueOf(bb.class, string);
    }

    private static final /* synthetic */ bb[] o00000() {
        bb[] bbArray = new bb[3];
        bb[] bbArray2 = bbArray;
        bbArray[0] = super;
        bbArray2[1] = \u00d300000;
        bbArray2[2] = bb.class;
        return bbArray2;
    }

    static {
        \u00d400000 = bb.o00000();
        \u00d200000 = d.o00000(\u00d400000);
    }
}

