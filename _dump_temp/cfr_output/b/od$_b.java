/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.c.d;
import b.c.f;

public final class od$_b
extends Enum {
    public static final /* enum */ od$_b o00000 = new od$_b("WARNING", 0);
    public static final /* enum */ od$_b \u00d300000 = new od$_b("ERROR", 1);
    private static final /* synthetic */ od$_b[] String;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private od$_b() {
        void var2_-1;
        void var1_-1;
    }

    public static od$_b[] values() {
        return (od$_b[])String.clone();
    }

    public static od$_b valueOf(String string) {
        return Enum.valueOf(od$_b.class, string);
    }

    public static f \u00d200000() {
        return \u00d200000;
    }

    private static final /* synthetic */ od$_b[] o00000() {
        od$_b[] od$_bArray = new od$_b[2];
        od$_b[] od$_bArray2 = od$_bArray;
        od$_bArray[0] = o00000;
        od$_bArray2[1] = \u00d300000;
        return od$_bArray2;
    }

    static {
        String = od$_b.o00000();
        \u00d200000 = d.o00000(String);
    }
}

