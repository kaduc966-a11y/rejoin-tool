/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.s.k;
import b.t.c.b.b.g.i;

public final class i$_b$1
extends k {
    private int o\u00f4\u00f5000 = -1;
    final /* synthetic */ i O\u00f4\u00f5000;

    i$_b$1(i i2) {
        this.O\u00f4\u00f5000 = i2;
    }

    @Override
    public final void \u00f5\u00d3\u00d3000() {
        do {
            int n2 = this.o\u00f4\u00f5000;
            this.o\u00f4\u00f5000 = n2 + 1;
        } while (this.o\u00f4\u00f5000 < i.o00000(this.O\u00f4\u00f5000).length && i.o00000(this.O\u00f4\u00f5000)[this.o\u00f4\u00f5000] == null);
        if (this.o\u00f4\u00f5000 >= i.o00000(this.O\u00f4\u00f5000).length) {
            this.\u00f4\u00d3\u00d3000();
            return;
        }
        i$_b$1 i$_b$1 = this;
        i$_b$1.\u00f5o0000(i.o00000(i$_b$1.O\u00f4\u00f5000)[this.o\u00f4\u00f5000]);
    }
}

