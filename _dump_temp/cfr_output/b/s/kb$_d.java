/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.kb;
import java.util.List;
import java.util.RandomAccess;

final class kb$_d
extends kb
implements RandomAccess {
    private final kb nullsuper;
    private final int oo0000;
    private int Oo0000;

    public kb$_d(kb kb2, int n2, int n3) {
        this.nullsuper = kb2;
        this.oo0000 = n2;
        kb.return.\u00d200000(this.oo0000, n3, this.nullsuper.size());
        this.Oo0000 = n3 - this.oo0000;
    }

    @Override
    public final Object get(int n2) {
        kb.return.\u00d200000(n2, this.Oo0000);
        return this.nullsuper.get(this.oo0000 + n2);
    }

    @Override
    public final int o00000() {
        return this.Oo0000;
    }

    @Override
    public final List subList(int n2, int n3) {
        kb.return.\u00d200000(n2, n3, this.Oo0000);
        return new kb$_d(this.nullsuper, this.oo0000 + n2, this.oo0000 + n3);
    }
}

