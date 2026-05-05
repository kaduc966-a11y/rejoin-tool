/*
 * Decompiled with CFR 0.152.
 */
package b.r.c;

import b.o.e.g;
import b.pc;
import b.r.b;
import b.r.d.b.t;

public final class e$_c$1
extends t {
    private int forvoid;
    final /* synthetic */ g \u00d8\u00f60000;

    public e$_c$1(b b2, g g2) {
        this.\u00d8\u00f60000 = g2;
        super(b2);
    }

    @Override
    public final Object \u00d800000(Object object) {
        switch (this.forvoid) {
            case 0: {
                this.forvoid = 1;
                pc.o00000(object);
                return this.\u00d8\u00f60000.\u00f800000(this);
            }
            case 1: {
                this.forvoid = 2;
                pc.o00000(object);
                return object;
            }
        }
        throw new IllegalStateException("This coroutine had already completed".toString());
    }
}

