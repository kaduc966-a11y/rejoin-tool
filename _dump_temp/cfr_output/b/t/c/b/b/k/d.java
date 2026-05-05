/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.c.f;
import b.o.d.w;
import b.t.c.b.b.k.d$_b;
import b.t.c.b.b.k.d$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class d
extends Enum {
    public static final /* enum */ d \u00d300000 = new d$_b("PLAIN", 0);
    public static final /* enum */ d \u00d400000 = new d$_c("HTML", 1);
    private static final /* synthetic */ d[] new;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var2_-1;
        void var1_-1;
    }

    public abstract String o00000(String var1);

    public static d[] values() {
        return (d[])new.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static final /* synthetic */ d[] o00000() {
        d[] dArray = new d[2];
        d[] dArray2 = dArray;
        dArray[0] = \u00d300000;
        dArray2[1] = \u00d400000;
        return dArray2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ d(w w2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        new = d.o00000();
        o00000 = b.c.d.o00000(new);
    }
}

