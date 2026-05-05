/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.e.g;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.db;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.j;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.xc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.e.f;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class v
extends ib {
    private final bc \u00d8\u00d8\u00d8000;
    private final List StringObjectString;
    private final boolean \u00f5\u00d8\u00d8000;
    private final f thisObjectString;
    private final g \u00f4\u00d8\u00d8000;

    public v(bc bc2, List list, boolean bl, f f2, g g2) {
        this.\u00d8\u00d8\u00d8000 = bc2;
        this.StringObjectString = list;
        this.\u00f5\u00d8\u00d8000 = bl;
        this.thisObjectString = f2;
        this.\u00f4\u00d8\u00d8000 = g2;
        if (((rc)this).\u00f4\u00d6\u00d2000() instanceof b.t.c.b.b.h.d.b && !(((rc)this).\u00f4\u00d6\u00d2000() instanceof b.t.c.b.b.h.d.j)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + ((rc)this).\u00f4\u00d6\u00d2000() + '\n' + ((rc)this).thisdosuper());
        }
    }

    @Override
    public final bc thisdosuper() {
        return this.\u00d8\u00d8\u00d8000;
    }

    @Override
    public final List \u00d4\u00d6\u00d2000() {
        return this.StringObjectString;
    }

    @Override
    public final boolean \u00f5\u00d6\u00d2000() {
        return this.\u00f5\u00d8\u00d8000;
    }

    @Override
    public final f \u00f4\u00d6\u00d2000() {
        return this.thisObjectString;
    }

    @Override
    public final zb \u00d5\u00d6\u00d2000() {
        return zb.ifreturnclass.Object();
    }

    @Override
    public final ib new(zb zb2) {
        if (zb2.ifStringnew()) {
            return this;
        }
        return new xc(this, zb2);
    }

    @Override
    public final ib \u00d4o0000(boolean bl) {
        if (bl == ((rc)this).\u00f5\u00d6\u00d2000()) {
            return this;
        }
        if (bl) {
            return new db(this);
        }
        return new j(this);
    }

    public final ib \u00d4O0000(b b2) {
        ib ib2 = (ib)this.\u00f4\u00d8\u00d8000.\u00f800000(b2);
        if (ib2 == null) {
            ib2 = this;
        }
        return ib2;
    }
}

