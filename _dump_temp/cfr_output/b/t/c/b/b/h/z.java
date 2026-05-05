/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.pb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.k.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class z
extends f
implements pb {
    private final f O\u00f5\u00d8000;
    private final rc o\u00f5\u00d8000;

    public z(f f2, rc rc2) {
        super(f2.\u00f4\u00f4\u00d2000(), f2.\u00d8\u00f4\u00d2000());
        this.O\u00f5\u00d8000 = f2;
        this.o\u00f5\u00d8000 = rc2;
    }

    public final f o\u00f5\u00d2000() {
        return this.O\u00f5\u00d8000;
    }

    @Override
    public final rc \u00f8\u00f4\u00d2000() {
        return this.o\u00f5\u00d8000;
    }

    @Override
    public final l o00000(zb zb2) {
        return jc.o00000(this.o\u00f5\u00d2000().o00000(zb2), this.\u00f8\u00f4\u00d2000());
    }

    @Override
    public final l oo0000(boolean bl) {
        return jc.o00000(this.o\u00f5\u00d2000().oo0000(bl), this.\u00f8\u00f4\u00d2000().\u00d8\u00d6\u00d2000().oo0000(bl));
    }

    @Override
    public final String o00000(b.t.c.b.b.k.b b2, o o2) {
        if (o2.super()) {
            return b2.super(this.\u00f8\u00f4\u00d2000());
        }
        return this.o\u00f5\u00d2000().o00000(b2, o2);
    }

    @Override
    public final ib \u00f5\u00f4\u00d2000() {
        return this.o\u00f5\u00d2000().\u00f5\u00f4\u00d2000();
    }

    public final z Stringsuper(b b2) {
        return new z((f)b2.\u00d200000(this.o\u00f5\u00d2000()), b2.\u00d200000(this.\u00f8\u00f4\u00d2000()));
    }

    @Override
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.\u00f8\u00f4\u00d2000() + ")] " + this.o\u00f5\u00d2000();
    }
}

