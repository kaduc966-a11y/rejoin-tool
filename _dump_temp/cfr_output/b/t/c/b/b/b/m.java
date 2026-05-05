/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.dc;
import b.o.d.w;
import b.r;
import b.t.c.b.b.b.c;
import b.t.c.b.b.b.m$_b$0;
import b.t.c.b.b.b.m$_c;
import b.t.c.b.b.i.h;

public final class m
extends c {
    public static final m$_c \u00d2O0000 = new m$_c(null);
    private static final dc oO0000 = r.o00000(m$_b$0.\u00f50O000);

    public m(boolean bl) {
        super(new h("DefaultBuiltIns"));
        if (bl) {
            this.o00000(false);
        }
    }

    public /* synthetic */ m(boolean bl, int n2, w w2) {
        if ((n2 & 1) != 0) {
            bl = true;
        }
        this(bl);
    }

    private static final m \u00f8o0000() {
        return new m(false, 1, null);
    }

    public m() {
        this(false, 1, null);
    }

    public static final /* synthetic */ dc \u00f6o0000() {
        return oO0000;
    }

    static /* synthetic */ m thisnew() {
        return m.\u00f8o0000();
    }
}

