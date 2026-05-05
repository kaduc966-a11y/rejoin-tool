/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.c.d;
import b.c.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k$_c
extends Enum {
    private final String \u00d200000;
    private final boolean \u00d500000;
    public static final /* enum */ k$_c \u00d300000 = new k$_c("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
    public static final /* enum */ k$_c \u00d800000 = new k$_c("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
    public static final /* enum */ k$_c o00000 = new k$_c("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);
    private static final /* synthetic */ k$_c[] \u00d600000;
    private static final /* synthetic */ f String;

    /*
     * WARNING - void declaration
     */
    private k$_c() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.\u00d200000 = var3_2;
        this.\u00d500000 = var4_1;
    }

    public static k$_c[] values() {
        return (k$_c[])\u00d600000.clone();
    }

    public static k$_c valueOf(String string) {
        return Enum.valueOf(k$_c.class, string);
    }

    private static final /* synthetic */ k$_c[] super() {
        k$_c[] k$_cArray = new k$_c[3];
        k$_c[] k$_cArray2 = k$_cArray;
        k$_cArray[0] = \u00d300000;
        k$_cArray2[1] = \u00d800000;
        k$_cArray2[2] = o00000;
        return k$_cArray2;
    }

    static {
        \u00d600000 = k$_c.super();
        String = d.o00000(\u00d600000);
    }
}

