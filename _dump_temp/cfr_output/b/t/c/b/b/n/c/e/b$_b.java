/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
enum b$_b {
    void(false, false),
    \u00d500000(true, false),
    \u00d600000(false, true),
    Object(true, true);

    public final boolean o00000;
    public final boolean \u00d200000;

    /*
     * WARNING - void declaration
     */
    private b$_b() {
        void var4_1;
        void var3_2;
        this.o00000 = var3_2;
        this.\u00d200000 = var4_1;
    }

    public static b$_b o00000(boolean bl, boolean bl2) {
        b$_b b$_b = bl ? (bl2 ? Object : \u00d500000) : (bl2 ? \u00d600000 : void);
        if (b$_b == null) {
            b$_b.o00000(0);
        }
        return b$_b;
    }

    private static /* synthetic */ void o00000(int n2) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
    }
}

