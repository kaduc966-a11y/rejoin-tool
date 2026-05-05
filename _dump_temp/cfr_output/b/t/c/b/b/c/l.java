/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;
import b.t.c.b.b.c.b.j;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class l
extends Enum {
    private final j o00000;
    public static final /* enum */ l void = new l("FINAL", 0, 0);
    public static final /* enum */ l \u00d600000 = new l("OPEN", 1, 1);
    public static final /* enum */ l \u00d500000 = new l("ABSTRACT", 2, 2);
    public static final /* enum */ l \u00d200000 = new l("SEALED", 3, 3);
    private static final /* synthetic */ l[] \u00d400000;
    private static final /* synthetic */ f Object;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private l() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.o00000 = new j(b.t.c.b.b.l.d.l.returnnew, (int)var3_2);
    }

    public final j \u00d300000() {
        return this.o00000;
    }

    public static l[] values() {
        return (l[])\u00d400000.clone();
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    public static f o00000() {
        return Object;
    }

    private static final /* synthetic */ l[] new() {
        l[] lArray = new l[4];
        l[] lArray2 = lArray;
        lArray[0] = void;
        lArray2[1] = \u00d600000;
        lArray2[2] = \u00d500000;
        lArray2[3] = \u00d200000;
        return lArray2;
    }

    static {
        \u00d400000 = l.new();
        Object = d.o00000(\u00d400000);
    }
}

