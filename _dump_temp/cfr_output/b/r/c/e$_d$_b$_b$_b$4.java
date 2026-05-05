/*
 * Decompiled with CFR 0.152.
 */
package b.r.c;

import b.o.d.rb;
import b.o.e.f;
import b.pc;
import b.r.b;
import b.r.d.b.s;
import b.r.l;

public final class e$_d$_b$_b$_b$4
extends s {
    private int nullvoid;
    final /* synthetic */ f \u00d3\u00f60000;
    final /* synthetic */ Object o\u00f60000;

    public e$_d$_b$_b$_b$4(b b2, l l2, f f2, Object object) {
        this.\u00d3\u00f60000 = f2;
        this.o\u00f60000 = object;
        super(b2, l2);
    }

    @Override
    public final Object \u00d800000(Object object) {
        switch (this.nullvoid) {
            case 0: {
                this.nullvoid = 1;
                pc.o00000(object);
                object = this;
                return ((f)rb.o00000((Object)this.\u00d3\u00f60000, 2)).o00000(this.o\u00f60000, object);
            }
            case 1: {
                this.nullvoid = 2;
                pc.o00000(object);
                return object;
            }
        }
        throw new IllegalStateException("This coroutine had already completed".toString());
    }
}

