/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j
extends Enum {
    public static final /* enum */ j \u00d500000 = new j("PUBLIC", 0);
    public static final /* enum */ j o00000 = new j("PROTECTED", 1);
    public static final /* enum */ j \u00d400000 = new j("INTERNAL", 2);
    public static final /* enum */ j return = new j("PRIVATE", 3);
    private static final /* synthetic */ j[] \u00d300000;
    private static final /* synthetic */ f new;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j() {
        void var2_-1;
        void var1_-1;
    }

    public static j[] values() {
        return (j[])\u00d300000.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public static f o00000() {
        return new;
    }

    private static final /* synthetic */ j[] \u00d200000() {
        j[] jArray = new j[4];
        j[] jArray2 = jArray;
        jArray[0] = \u00d500000;
        jArray2[1] = o00000;
        jArray2[2] = \u00d400000;
        jArray2[3] = return;
        return jArray2;
    }

    static {
        \u00d300000 = j.\u00d200000();
        new = d.o00000(\u00d300000);
    }
}

