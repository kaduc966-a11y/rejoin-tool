/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.o.e.g;
import b.t.c.b.b.m.b$_h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class b$1
extends b$_h {
    final /* synthetic */ g \u00d400000;
    final /* synthetic */ boolean[] \u00d300000;

    b$1(g g2, boolean[] blArray) {
        this.\u00d400000 = g2;
        this.\u00d300000 = blArray;
    }

    @Override
    public final boolean super(Object object) {
        if (((Boolean)this.\u00d400000.\u00f800000(object)).booleanValue()) {
            this.\u00d300000[0] = true;
        }
        return !this.\u00d300000[0];
    }

    public final Boolean \u00d300000() {
        return this.\u00d300000[0];
    }
}

