/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ec
extends Enum {
    private final String \u00d800000;
    public static final /* enum */ ec int = new ec("CLASS", 0, "class");
    public static final /* enum */ ec \u00d600000 = new ec("INTERFACE", 1, "interface");
    public static final /* enum */ ec \u00f400000 = new ec("ENUM_CLASS", 2, "enum class");
    public static final /* enum */ ec \u00d400000 = new ec("ENUM_ENTRY", 3, null);
    public static final /* enum */ ec super = new ec("ANNOTATION_CLASS", 4, "annotation class");
    public static final /* enum */ ec \u00d200000 = new ec("OBJECT", 5, "object");
    private static final /* synthetic */ ec[] class;
    private static final /* synthetic */ f \u00d300000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ec() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d800000 = var3_2;
    }

    public final boolean super() {
        return this == \u00d200000 || this == \u00d400000;
    }

    public static ec[] values() {
        return (ec[])ec.class.clone();
    }

    public static ec valueOf(String string) {
        return Enum.valueOf(ec.class, string);
    }

    private static final /* synthetic */ ec[] \u00d200000() {
        ec[] ecArray = new ec[6];
        ec[] ecArray2 = ecArray;
        ecArray[0] = int;
        ecArray2[1] = \u00d600000;
        ecArray2[2] = \u00f400000;
        ecArray2[3] = \u00d400000;
        ecArray2[4] = super;
        ecArray2[5] = \u00d200000;
        return ecArray2;
    }

    static {
        ec.class = ec.\u00d200000();
        \u00d300000 = d.o00000(ec.class);
    }
}

