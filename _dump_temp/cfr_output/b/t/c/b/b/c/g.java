/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g
extends Enum {
    public static final /* enum */ g return = new g("LANGUAGE_VERSION", 0);
    public static final /* enum */ g \u00d500000 = new g("COMPILER_VERSION", 1);
    public static final /* enum */ g \u00d400000 = new g("API_VERSION", 2);
    public static final /* enum */ g \u00d300000 = new g("UNKNOWN", 3);
    private static final /* synthetic */ g[] new;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g() {
        void var2_-1;
        void var1_-1;
    }

    public static g[] values() {
        return (g[])new.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    private static final /* synthetic */ g[] o00000() {
        g[] gArray = new g[4];
        g[] gArray2 = gArray;
        gArray[0] = return;
        gArray2[1] = \u00d500000;
        gArray2[2] = \u00d400000;
        gArray2[3] = \u00d300000;
        return gArray2;
    }

    static {
        new = g.o00000();
        o00000 = d.o00000(new);
    }
}

