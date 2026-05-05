/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.c.d;
import b.c.f;
import b.t.c.b.b.c.b.j;
import b.t.c.b.b.l.d.l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class cb
extends Enum {
    private final j \u00f400000;
    public static final /* enum */ cb \u00d600000 = new cb("INTERNAL", 0, 0);
    public static final /* enum */ cb \u00f500000 = new cb("PRIVATE", 1, 1);
    public static final /* enum */ cb \u00d500000 = new cb("PROTECTED", 2, 2);
    public static final /* enum */ cb o00000 = new cb("PUBLIC", 3, 3);
    public static final /* enum */ cb void = new cb("PRIVATE_TO_THIS", 4, 4);
    public static final /* enum */ cb \u00d400000 = new cb("LOCAL", 5, 5);
    private static final /* synthetic */ cb[] Object;
    private static final /* synthetic */ f \u00d200000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cb() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00f400000 = new j(l.\u00f400000, (int)var3_2);
    }

    public final j new() {
        return this.\u00f400000;
    }

    public static cb[] values() {
        return (cb[])Object.clone();
    }

    public static cb valueOf(String string) {
        return Enum.valueOf(cb.class, string);
    }

    public static f o00000() {
        return \u00d200000;
    }

    private static final /* synthetic */ cb[] \u00d300000() {
        cb[] cbArray = new cb[6];
        cb[] cbArray2 = cbArray;
        cbArray[0] = \u00d600000;
        cbArray2[1] = \u00f500000;
        cbArray2[2] = \u00d500000;
        cbArray2[3] = o00000;
        cbArray2[4] = void;
        cbArray2[5] = \u00d400000;
        return cbArray2;
    }

    static {
        Object = cb.\u00d300000();
        \u00d200000 = d.o00000(Object);
    }
}

