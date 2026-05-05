/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.h;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.vb$_b;
import b.t.c.b.b.h.w;
import b.t.c.b.b.q.e.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class vb
extends h {
    public static final vb$_b \u00d200000 = new vb$_b(null);
    private final h \u00f600000;
    private final h \u00f500000;

    private vb(h h2, h h3) {
        this.\u00f600000 = h2;
        this.\u00f500000 = h3;
    }

    @Override
    public final hc o00000(rc rc2) {
        hc hc2 = this.\u00f600000.o00000(rc2);
        if (hc2 == null) {
            hc2 = this.\u00f500000.o00000(rc2);
        }
        return hc2;
    }

    @Override
    public final rc o00000(rc rc2, w w2) {
        return this.\u00f500000.o00000(this.\u00f600000.o00000(rc2, w2), w2);
    }

    @Override
    public final boolean o00000() {
        return false;
    }

    @Override
    public final boolean new() {
        return this.\u00f600000.new() || this.\u00f500000.new();
    }

    @Override
    public final boolean \u00d500000() {
        return this.\u00f600000.\u00d500000() || this.\u00f500000.\u00d500000();
    }

    @Override
    public final o o00000(o o2) {
        return this.\u00f500000.o00000(this.\u00f600000.o00000(o2));
    }

    public static final h o00000(h h2, h h3) {
        return \u00d200000.o00000(h2, h3);
    }

    public /* synthetic */ vb(h h2, h h3, b.o.d.w w2) {
        this(h2, h3);
    }
}

