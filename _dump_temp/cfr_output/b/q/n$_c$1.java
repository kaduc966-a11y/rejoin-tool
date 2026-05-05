/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.n;
import b.s.kb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class n$_c$1
extends kb {
    final /* synthetic */ n \u00d800000;

    n$_c$1(n n2) {
        this.\u00d800000 = n2;
    }

    @Override
    public final int o00000() {
        return n.super(this.\u00d800000).groupCount() + 1;
    }

    public final String new(int n2) {
        String string = n.super(this.\u00d800000).group(n2);
        if (string == null) {
            string = "";
        }
        return string;
    }
}

