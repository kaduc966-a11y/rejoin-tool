/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.j.b;

import b.c.d;
import b.t.c.b.b.j.b.b;
import b.t.c.b.b.j.b.e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f
extends Enum
implements e {
    public static final /* enum */ f \u00f8O0000 = new f("FROM_IDE", 0);
    public static final /* enum */ f \u00d300000 = new f("FROM_BACKEND", 1);
    public static final /* enum */ f for = new f("FROM_TEST", 2);
    public static final /* enum */ f \u00d3O0000 = new f("FROM_BUILTINS", 3);
    public static final /* enum */ f \u00d200000 = new f("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
    public static final /* enum */ f \u00d5O0000 = new f("WHEN_CHECK_OVERRIDES", 5);
    public static final /* enum */ f newsuper = new f("FOR_SCRIPT", 6);
    public static final /* enum */ f o00000 = new f("FROM_REFLECTION", 7);
    public static final /* enum */ f \u00f5O0000 = new f("WHEN_RESOLVE_DECLARATION", 8);
    public static final /* enum */ f \u00d600000 = new f("WHEN_GET_DECLARATION_SCOPE", 9);
    public static final /* enum */ f \u00f6O0000 = new f("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
    public static final /* enum */ f \u00d500000 = new f("FOR_ALREADY_TRACKED", 11);
    public static final /* enum */ f returnsuper = new f("WHEN_GET_ALL_DESCRIPTORS", 12);
    public static final /* enum */ f String = new f("WHEN_TYPING", 13);
    public static final /* enum */ f \u00d800000 = new f("WHEN_GET_SUPER_MEMBERS", 14);
    public static final /* enum */ f \u00d8O0000 = new f("FOR_NON_TRACKED_SCOPE", 15);
    public static final /* enum */ f oO0000 = new f("FROM_SYNTHETIC_SCOPE", 16);
    public static final /* enum */ f null = new f("FROM_DESERIALIZATION", 17);
    public static final /* enum */ f \u00f600000 = new f("FROM_JAVA_LOADER", 18);
    public static final /* enum */ f \u00f800000 = new f("WHEN_GET_LOCAL_VARIABLE", 19);
    public static final /* enum */ f oo0000 = new f("WHEN_FIND_BY_FQNAME", 20);
    public static final /* enum */ f private = new f("WHEN_GET_COMPANION_OBJECT", 21);
    public static final /* enum */ f \u00f500000 = new f("FOR_DEFAULT_IMPORTS", 22);
    private static final /* synthetic */ f[] \u00d6O0000;
    private static final /* synthetic */ b.c.f \u00d2O0000;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f() {
        void var2_-1;
        void var1_-1;
    }

    @Override
    public final b super() {
        return null;
    }

    public static f[] values() {
        return (f[])\u00d6O0000.clone();
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    private static final /* synthetic */ f[] \u00d200000() {
        f[] fArray = new f[23];
        f[] fArray2 = fArray;
        fArray[0] = \u00f8O0000;
        fArray2[1] = \u00d300000;
        fArray2[2] = for;
        fArray2[3] = \u00d3O0000;
        fArray2[4] = \u00d200000;
        fArray2[5] = \u00d5O0000;
        fArray2[6] = newsuper;
        fArray2[7] = o00000;
        fArray2[8] = \u00f5O0000;
        fArray2[9] = \u00d600000;
        fArray2[10] = \u00f6O0000;
        fArray2[11] = \u00d500000;
        fArray2[12] = returnsuper;
        fArray2[13] = String;
        fArray2[14] = \u00d800000;
        fArray2[15] = \u00d8O0000;
        fArray2[16] = oO0000;
        fArray2[17] = null;
        fArray2[18] = \u00f600000;
        fArray2[19] = \u00f800000;
        fArray2[20] = oo0000;
        fArray2[21] = private;
        fArray2[22] = \u00f500000;
        return fArray2;
    }

    static {
        \u00d6O0000 = f.\u00d200000();
        \u00d2O0000 = d.o00000(\u00d6O0000);
    }
}

