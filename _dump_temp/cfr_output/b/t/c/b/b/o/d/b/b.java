/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.d.b;

import b.m;
import b.s.mc;
import b.t.c.b.b.h.e.d;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.o.d.b.c;
import java.util.Collection;
import java.util.List;

public final class b
implements c {
    private final hc \u00d8\u00f6o000;
    private d \u00f4\u00f6o000;

    public b(hc hc2) {
        boolean bl;
        this.\u00d8\u00f6o000 = hc2;
        boolean bl2 = bl = this.\u00f5\u00d2O000().\u00d200000() != w.\u00d400000;
        if (m.new && !bl) {
            String string = "Only nontrivial projections can be captured, not: " + this.\u00f5\u00d2O000();
            throw new AssertionError((Object)string);
        }
    }

    @Override
    public final hc \u00f5\u00d2O000() {
        return this.\u00d8\u00f6o000;
    }

    public final d O\u00d3O000() {
        return this.\u00f4\u00f6o000;
    }

    public final void \u00d300000(d d2) {
        this.\u00f4\u00f6o000 = d2;
    }

    @Override
    public final List \u00f5OO000() {
        return mc.\u00d500000();
    }

    @Override
    public final Collection \u00d5OO000() {
        return mc.o00000(this.\u00f5\u00d2O000().\u00d200000() == w.return ? this.\u00f5\u00d2O000().\u00d300000() : (rc)this.forint().\u00f800000());
    }

    @Override
    public final boolean \u00d8OO000() {
        return false;
    }

    public final Void o\u00d3O000() {
        return null;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.\u00f5\u00d2O000() + ')';
    }

    @Override
    public final b.t.c.b.b.b.c forint() {
        return this.\u00f5\u00d2O000().\u00d300000().thisdosuper().forint();
    }

    public final b \u00d400000(b.t.c.b.b.h.e.b b2) {
        return new b(this.\u00f5\u00d2O000().super(b2));
    }
}

