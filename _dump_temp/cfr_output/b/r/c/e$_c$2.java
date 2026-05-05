/*
 * Decompiled with CFR 0.152.
 */
package b.r.c;

import b.o.e.g;
import b.pc;
import b.r.b;
import b.r.d.b.s;
import b.r.l;

public final class e$_c$2
extends s {
    private int \u00f8\u00f50000;
    final /* synthetic */ g O\u00f60000;

    public e$_c$2(b b2, l l2, g g2) {
        this.O\u00f60000 = g2;
        super(b2, l2);
    }

    @Override
    public final Object \u00d800000(Object object) {
        switch (this.\u00f8\u00f50000) {
            case 0: {
                this.\u00f8\u00f50000 = 1;
                pc.o00000(object);
                return this.O\u00f60000.\u00f800000(this);
            }
            case 1: {
                this.\u00f8\u00f50000 = 2;
                pc.o00000(object);
                return object;
            }
        }
        throw new IllegalStateException("This coroutine had already completed".toString());
    }
}

