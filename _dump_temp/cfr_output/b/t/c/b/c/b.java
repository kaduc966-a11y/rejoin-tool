/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.t.l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    private static final l new(l l2, l l3) {
        if (l2 == l.\u00d500000) {
            return l3;
        }
        if (l3 != l.\u00d500000 && l2 != l3) {
            throw new IllegalStateException("CONFLICTING_PROJECTION".toString());
        }
        return l2;
    }

    public static final /* synthetic */ l o00000(l l2, l l3) {
        return b.new(l2, l3);
    }
}

