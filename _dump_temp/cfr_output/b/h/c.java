/*
 * Decompiled with CFR 0.152.
 */
package b.h;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends Enum {
    public static final /* enum */ c \u00d4O0000 = new c("CLASS", 0);
    public static final /* enum */ c \u00d500000 = new c("ANNOTATION_CLASS", 1);
    public static final /* enum */ c \u00d200000 = new c("TYPE_PARAMETER", 2);
    public static final /* enum */ c \u00d5O0000 = new c("PROPERTY", 3);
    public static final /* enum */ c \u00f400000 = new c("FIELD", 4);
    public static final /* enum */ c \u00d2O0000 = new c("LOCAL_VARIABLE", 5);
    public static final /* enum */ c float = new c("VALUE_PARAMETER", 6);
    public static final /* enum */ c public = new c("CONSTRUCTOR", 7);
    public static final /* enum */ c oO0000 = new c("FUNCTION", 8);
    public static final /* enum */ c \u00f500000 = new c("PROPERTY_GETTER", 9);
    public static final /* enum */ c \u00d400000 = new c("PROPERTY_SETTER", 10);
    public static final /* enum */ c \u00f600000 = new c("TYPE", 11);
    public static final /* enum */ c OO0000 = new c("EXPRESSION", 12);
    public static final /* enum */ c Object = new c("FILE", 13);
    public static final /* enum */ c o00000 = new c("TYPEALIAS", 14);
    private static final /* synthetic */ c[] void;
    private static final /* synthetic */ f \u00d600000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c() {
        void var2_-1;
        void var1_-1;
    }

    public static c[] values() {
        return (c[])void.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static f o00000() {
        return \u00d600000;
    }

    private static final /* synthetic */ c[] new() {
        c[] cArray = new c[15];
        c[] cArray2 = cArray;
        cArray[0] = \u00d4O0000;
        cArray2[1] = \u00d500000;
        cArray2[2] = \u00d200000;
        cArray2[3] = \u00d5O0000;
        cArray2[4] = \u00f400000;
        cArray2[5] = \u00d2O0000;
        cArray2[6] = float;
        cArray2[7] = public;
        cArray2[8] = oO0000;
        cArray2[9] = \u00f500000;
        cArray2[10] = \u00d400000;
        cArray2[11] = \u00f600000;
        cArray2[12] = OO0000;
        cArray2[13] = Object;
        cArray2[14] = o00000;
        return cArray2;
    }

    static {
        void = c.new();
        \u00d600000 = d.o00000(void);
    }
}

