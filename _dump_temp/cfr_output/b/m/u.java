/*
 * Decompiled with CFR 0.152.
 */
package b.m;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class u
extends Enum {
    public static final /* enum */ u \u00d500000 = new u("LANGUAGE_VERSION", 0);
    public static final /* enum */ u \u00d400000 = new u("COMPILER_VERSION", 1);
    public static final /* enum */ u \u00d300000 = new u("API_VERSION", 2);
    private static final /* synthetic */ u[] new;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private u() {
        void var2_-1;
        void var1_-1;
    }

    public static u[] values() {
        return (u[])new.clone();
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    public static f new() {
        return o00000;
    }

    private static final /* synthetic */ u[] o00000() {
        u[] uArray = new u[3];
        u[] uArray2 = uArray;
        uArray[0] = \u00d500000;
        uArray2[1] = \u00d400000;
        uArray2[2] = \u00d300000;
        return uArray2;
    }

    static {
        new = u.o00000();
        o00000 = d.o00000(new);
    }
}

