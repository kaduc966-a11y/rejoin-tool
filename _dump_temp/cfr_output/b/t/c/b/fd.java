/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class fd
extends Enum {
    public static final /* enum */ fd class = new fd("NOT_NULL", 0);
    public static final /* enum */ fd \u00d400000 = new fd("NULLABLE", 1);
    public static final /* enum */ fd \u00d300000 = new fd("FLEXIBLE", 2);
    private static final /* synthetic */ fd[] \u00d200000;
    private static final /* synthetic */ f super;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fd() {
        void var2_-1;
        void var1_-1;
    }

    public static fd[] values() {
        return (fd[])\u00d200000.clone();
    }

    public static fd valueOf(String string) {
        return Enum.valueOf(fd.class, string);
    }

    private static final /* synthetic */ fd[] o00000() {
        fd[] fdArray = new fd[3];
        fd[] fdArray2 = fdArray;
        fdArray[0] = fd.class;
        fdArray2[1] = \u00d400000;
        fdArray2[2] = \u00d300000;
        return fdArray2;
    }

    static {
        \u00d200000 = fd.o00000();
        super = d.o00000(\u00d200000);
    }
}

