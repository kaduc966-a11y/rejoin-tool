/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.c.d;
import b.c.f;
import b.t.c.b.b.q.ab$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ab
extends Enum {
    public static final ab$_b \u00d800000;
    public static final /* enum */ ab \u00d600000;
    public static final /* enum */ ab super;
    public static final /* enum */ ab class;
    public static final /* enum */ ab \u00d400000;
    private static final /* synthetic */ ab[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ab() {
        void var2_-1;
        void var1_-1;
    }

    public static ab[] values() {
        return (ab[])\u00d300000.clone();
    }

    public static ab valueOf(String string) {
        return Enum.valueOf(ab.class, string);
    }

    private static final /* synthetic */ ab[] super() {
        ab[] abArray = new ab[4];
        ab[] abArray2 = abArray;
        abArray[0] = \u00d600000;
        abArray2[1] = super;
        abArray2[2] = ab.class;
        abArray2[3] = \u00d400000;
        return abArray2;
    }

    static {
        \u00d600000 = new ab("FINAL", 0);
        super = new ab("SEALED", 1);
        ab.class = new ab("OPEN", 2);
        \u00d400000 = new ab("ABSTRACT", 3);
        \u00d300000 = ab.super();
        \u00d200000 = d.o00000(\u00d300000);
        \u00d800000 = new ab$_b(null);
    }
}

