/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.d;

import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
extends Enum {
    private final String do;
    public static final /* enum */ d \u00f600000 = new d("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
    public static final /* enum */ d class = new d("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
    public static final /* enum */ d \u00f800000 = new d("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
    public static final /* enum */ d \u00d800000 = new d("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
    public static final /* enum */ d \u00d200000 = new d("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
    public static final /* enum */ d \u00d300000 = new d("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
    public static final /* enum */ d int = new d("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
    public static final /* enum */ d \u00f400000 = new d("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
    public static final /* enum */ d OO0000 = new d("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
    public static final /* enum */ d super = new d("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");
    private static final /* synthetic */ d[] \u00d600000;
    private static final /* synthetic */ f \u00d400000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.do = var3_2;
    }

    public final String super() {
        return this.do;
    }

    public static d[] values() {
        return (d[])\u00d600000.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private static final /* synthetic */ d[] \u00d200000() {
        d[] dArray = new d[10];
        d[] dArray2 = dArray;
        dArray[0] = \u00f600000;
        dArray2[1] = d.class;
        dArray2[2] = \u00f800000;
        dArray2[3] = \u00d800000;
        dArray2[4] = \u00d200000;
        dArray2[5] = \u00d300000;
        dArray2[6] = int;
        dArray2[7] = \u00f400000;
        dArray2[8] = OO0000;
        dArray2[9] = super;
        return dArray2;
    }

    static {
        \u00d600000 = d.\u00d200000();
        \u00d400000 = b.c.d.o00000(\u00d600000);
    }
}

