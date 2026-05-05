/*
 * Decompiled with CFR 0.152.
 */
package b.r.c;

import b.o.d.rb;
import b.o.e.f;
import b.pc;
import b.r.b;
import b.r.d.b.t;

public final class e$_d$_b$_b$_b$3
extends t {
    private int \u00f5\u00f60000;
    final /* synthetic */ f privatevoid;
    final /* synthetic */ Object \u00f4\u00f60000;

    public e$_d$_b$_b$_b$3(b b2, f f2, Object object) {
        this.privatevoid = f2;
        this.\u00f4\u00f60000 = object;
        super(b2);
    }

    @Override
    public final Object \u00d800000(Object object) {
        switch (this.\u00f5\u00f60000) {
            case 0: {
                this.\u00f5\u00f60000 = 1;
                pc.o00000(object);
                object = this;
                return ((f)rb.o00000((Object)this.privatevoid, 2)).o00000(this.\u00f4\u00f60000, object);
            }
            case 1: {
                this.\u00f5\u00f60000 = 2;
                pc.o00000(object);
                return object;
            }
        }
        throw new IllegalStateException("This coroutine had already completed".toString());
    }
}

