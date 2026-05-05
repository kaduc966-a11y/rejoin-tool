/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.g.c;
import b.g.n;
import b.s.e$_b$_b$_b$1;
import b.s.e$_c$1;
import b.s.jc;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static final void super(int n2, int n3) {
        if (!(n2 > 0 && n3 > 0)) {
            String string = n2 != n3 ? "Both size " + n2 + " and step " + n3 + " must be greater than zero." : "size " + n2 + " must be greater than zero.";
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static final n super(n n2, int n3, int n4, boolean bl, boolean bl2) {
        e.super(n3, n4);
        return new e$_b$_b$_b$1(n2, n3, n4, bl, bl2);
    }

    public static final Iterator super(Iterator iterator, int n2, int n3, boolean bl, boolean bl2) {
        if (!iterator.hasNext()) {
            return jc.\u00d80\u00f6000;
        }
        return c.\u00d200000(new e$_c$1(n2, n3, iterator, bl2, bl, null));
    }
}

