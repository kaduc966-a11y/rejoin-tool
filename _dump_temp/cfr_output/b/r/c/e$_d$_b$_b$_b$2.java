/*
 * Decompiled with CFR 0.152.
 */
package b.r.c;

import b.o.d.rb;
import b.o.e.g;
import b.pc;
import b.r.b;
import b.r.d.b.s;
import b.r.l;

public final class e$_d$_b$_b$_b$2
extends s {
    private int \u00d4\u00f60000;
    final /* synthetic */ g \u00d5\u00f60000;

    public e$_d$_b$_b$_b$2(b b2, l l2, g g2) {
        this.\u00d5\u00f60000 = g2;
        super(b2, l2);
    }

    @Override
    public final Object \u00d800000(Object object) {
        switch (this.\u00d4\u00f60000) {
            case 0: {
                this.\u00d4\u00f60000 = 1;
                pc.o00000(object);
                object = this;
                return ((g)rb.o00000((Object)this.\u00d5\u00f60000, 1)).\u00f800000(object);
            }
            case 1: {
                this.\u00d4\u00f60000 = 2;
                pc.o00000(object);
                return object;
            }
        }
        throw new IllegalStateException("This coroutine had already completed".toString());
    }
}

