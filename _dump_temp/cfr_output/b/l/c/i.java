/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i
extends Enum {
    public static final /* enum */ i o00000 = new i("SKIP_SUBTREE", 0);
    public static final /* enum */ i String = new i("TERMINATE", 1);
    private static final /* synthetic */ i[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private i() {
        void var2_-1;
        void var1_-1;
    }

    public static i[] values() {
        return (i[])\u00d300000.clone();
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    public static f o00000() {
        return \u00d200000;
    }

    private static final /* synthetic */ i[] new() {
        i[] iArray = new i[2];
        i[] iArray2 = iArray;
        iArray[0] = o00000;
        iArray2[1] = String;
        return iArray2;
    }

    static {
        \u00d300000 = i.new();
        \u00d200000 = d.o00000(\u00d300000);
    }
}

