/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class v
extends Enum {
    public static final /* enum */ v \u00d500000 = new v("INCLUDE_DIRECTORIES", 0);
    public static final /* enum */ v \u00d400000 = new v("BREADTH_FIRST", 1);
    public static final /* enum */ v \u00d300000 = new v("FOLLOW_LINKS", 2);
    private static final /* synthetic */ v[] new;
    private static final /* synthetic */ f o00000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private v() {
        void var2_-1;
        void var1_-1;
    }

    public static v[] values() {
        return (v[])new.clone();
    }

    public static v valueOf(String string) {
        return Enum.valueOf(v.class, string);
    }

    public static f o00000() {
        return o00000;
    }

    private static final /* synthetic */ v[] new() {
        v[] vArray = new v[3];
        v[] vArray2 = vArray;
        vArray[0] = \u00d500000;
        vArray2[1] = \u00d400000;
        vArray2[2] = \u00d300000;
        return vArray2;
    }

    static {
        new = v.new();
        o00000 = d.o00000(new);
    }
}

