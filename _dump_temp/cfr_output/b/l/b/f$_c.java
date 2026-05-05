/*
 * Decompiled with CFR 0.152.
 */
package b.l.b;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f$_c
extends Enum {
    public static final /* enum */ f$_c \u00d500000 = new f$_c("PRESENT", 0);
    public static final /* enum */ f$_c \u00d600000 = new f$_c("ABSENT", 1);
    public static final /* enum */ f$_c o00000 = new f$_c("PRESENT_OPTIONAL", 2);
    public static final /* enum */ f$_c String = new f$_c("ABSENT_OPTIONAL", 3);
    private static final /* synthetic */ f$_c[] \u00d300000;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f$_c() {
        void var2_-1;
        void var1_-1;
    }

    public static f$_c[] values() {
        return (f$_c[])\u00d300000.clone();
    }

    public static f$_c valueOf(String string) {
        return Enum.valueOf(f$_c.class, string);
    }

    public static f o00000() {
        return \u00d200000;
    }

    private static final /* synthetic */ f$_c[] new() {
        f$_c[] f$_cArray = new f$_c[4];
        f$_c[] f$_cArray2 = f$_cArray;
        f$_cArray[0] = \u00d500000;
        f$_cArray2[1] = \u00d600000;
        f$_cArray2[2] = o00000;
        f$_cArray2[3] = String;
        return f$_cArray2;
    }

    static {
        \u00d300000 = f$_c.new();
        \u00d200000 = d.o00000(\u00d300000);
    }
}

