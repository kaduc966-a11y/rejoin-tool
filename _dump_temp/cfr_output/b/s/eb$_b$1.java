/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.eb;
import b.s.k;

public final class eb$_b$1
extends k {
    private int \u00f8\u00d8\u00f5000;
    private int ifnewclass;
    final /* synthetic */ eb \u00f5\u00d8\u00f5000;

    eb$_b$1(eb eb2) {
        this.\u00f5\u00d8\u00f5000 = eb2;
        this.\u00f8\u00d8\u00f5000 = eb2.size();
        this.ifnewclass = eb.o00000(eb2);
    }

    @Override
    protected final void \u00f5\u00d3\u00d3000() {
        if (this.\u00f8\u00d8\u00f5000 == 0) {
            this.\u00f4\u00d3\u00d3000();
            return;
        }
        eb$_b$1 eb$_b$1 = this;
        eb$_b$1.\u00f5o0000(eb.new(eb$_b$1.\u00f5\u00d8\u00f5000)[this.ifnewclass]);
        eb eb2 = this.\u00f5\u00d8\u00f5000;
        this.ifnewclass = (this.ifnewclass + 1) % eb.\u00d300000(eb2);
        int n2 = this.\u00f8\u00d8\u00f5000;
        this.\u00f8\u00d8\u00f5000 = n2 + -1;
    }
}

