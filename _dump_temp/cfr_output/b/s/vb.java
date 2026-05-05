/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.kb;
import java.util.List;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class vb
extends kb
implements RandomAccess {
    private final List forsuper;
    private int \u00d5o0000;
    private int \u00d4o0000;

    public vb(List list) {
        this.forsuper = list;
    }

    public final void new(int n2, int n3) {
        kb.return.\u00d200000(n2, n3, this.forsuper.size());
        this.\u00d5o0000 = n2;
        this.\u00d4o0000 = n3 - n2;
    }

    @Override
    public final Object get(int n2) {
        kb.return.\u00d200000(n2, this.\u00d4o0000);
        return this.forsuper.get(this.\u00d5o0000 + n2);
    }

    @Override
    public final int o00000() {
        return this.\u00d4o0000;
    }
}

