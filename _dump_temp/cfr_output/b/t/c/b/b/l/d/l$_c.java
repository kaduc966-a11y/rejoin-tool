/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.t.c.b.b.l.d.l$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class l$_c
extends l$_b {
    public l$_c(int n2) {
        super(n2, 1, null);
    }

    public Boolean \u00d200000(int n2) {
        Boolean bl = (n2 & 1 << this.new) != 0;
        if (bl == null) {
            l$_c.\u00d300000(0);
        }
        return bl;
    }

    public int super(Boolean bl) {
        if (bl.booleanValue()) {
            return 1 << this.new;
        }
        return 0;
    }

    private static /* synthetic */ void \u00d300000(int n2) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
    }
}

