/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class l
extends Enum {
    public static final /* enum */ l \u00d500000 = new l("INVARIANT", 0);
    public static final /* enum */ l new = new l("IN", 1);
    public static final /* enum */ l o00000 = new l("OUT", 2);
    private static final /* synthetic */ l[] \u00d400000;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l() {
        void var2_-1;
        void var1_-1;
    }

    public static l[] values() {
        return (l[])\u00d400000.clone();
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    public static f o00000() {
        return \u00d300000;
    }

    private static final /* synthetic */ l[] new() {
        l[] lArray = new l[3];
        l[] lArray2 = lArray;
        lArray[0] = \u00d500000;
        lArray2[1] = new;
        lArray2[2] = o00000;
        return lArray2;
    }

    static {
        \u00d400000 = l.new();
        \u00d300000 = d.o00000(\u00d400000);
    }
}

