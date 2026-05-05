/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;

public final class jb
extends Enum {
    public static final /* enum */ jb \u00d500000 = new jb("AT_MOST_ONCE", 0);
    public static final /* enum */ jb Object = new jb("EXACTLY_ONCE", 1);
    public static final /* enum */ jb \u00d400000 = new jb("AT_LEAST_ONCE", 2);
    private static final /* synthetic */ jb[] \u00d200000;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jb() {
        void var2_-1;
        void var1_-1;
    }

    public static jb[] values() {
        return (jb[])\u00d200000.clone();
    }

    public static jb valueOf(String string) {
        return Enum.valueOf(jb.class, string);
    }

    private static final /* synthetic */ jb[] o00000() {
        jb[] jbArray = new jb[3];
        jb[] jbArray2 = jbArray;
        jbArray[0] = \u00d500000;
        jbArray2[1] = Object;
        jbArray2[2] = \u00d400000;
        return jbArray2;
    }

    static {
        \u00d200000 = jb.o00000();
        o00000 = d.o00000(\u00d200000);
    }
}

