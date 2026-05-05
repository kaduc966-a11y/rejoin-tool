/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.c.d;
import b.c.f;
import b.o.d.w;
import b.q.jb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g
extends Enum
implements jb {
    private final int \u00f400000;
    private final int float;
    public static final /* enum */ g void = new g("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final /* enum */ g \u00d600000 = new g("MULTILINE", 1, 8, 0, 2, null);
    public static final /* enum */ g Object = new g("LITERAL", 2, 16, 0, 2, null);
    public static final /* enum */ g \u00d200000 = new g("UNIX_LINES", 3, 1, 0, 2, null);
    public static final /* enum */ g \u00f500000 = new g("COMMENTS", 4, 4, 0, 2, null);
    public static final /* enum */ g \u00f600000 = new g("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final /* enum */ g o00000 = new g("CANON_EQ", 6, 128, 0, 2, null);
    private static final /* synthetic */ g[] \u00d500000;
    private static final /* synthetic */ f \u00d400000;

    /*
     * WARNING - void declaration
     */
    private g() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00f400000 = var3_2;
        this.float = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ g(int n2, int n3, int n4, w object) {
        void var1_-1;
        void var5_4;
        if ((var5_4 & 2) != 0) {
            object = n4;
        }
        this((String)var1_-1, n3, n4, (int)object);
    }

    @Override
    public final int \u00d200000() {
        return this.\u00f400000;
    }

    @Override
    public final int o00000() {
        return this.float;
    }

    public static g[] values() {
        return (g[])\u00d500000.clone();
    }

    public static g valueOf(String string) {
        return Enum.valueOf(g.class, string);
    }

    public static f Object() {
        return \u00d400000;
    }

    private static final /* synthetic */ g[] \u00d400000() {
        g[] gArray = new g[7];
        g[] gArray2 = gArray;
        gArray[0] = void;
        gArray2[1] = \u00d600000;
        gArray2[2] = Object;
        gArray2[3] = \u00d200000;
        gArray2[4] = \u00f500000;
        gArray2[5] = \u00f600000;
        gArray2[6] = o00000;
        return gArray2;
    }

    static {
        \u00d500000 = g.\u00d400000();
        \u00d400000 = d.o00000(\u00d500000);
    }
}

