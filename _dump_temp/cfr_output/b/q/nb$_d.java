/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.e.g;
import b.q.nb;
import b.q.nb$_b;
import b.q.nb$_b$_b;
import b.q.nb$_c;
import b.q.nb$_c$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nb$_d {
    private boolean o00000 = nb.\u00d600000.\u00d200000().\u00d200000();
    private nb$_b$_b \u00d200000;
    private nb$_c$_b Object;

    public final boolean \u00d300000() {
        return this.o00000;
    }

    public final void super(boolean bl) {
        this.o00000 = bl;
    }

    public final nb$_b$_b \u00d200000() {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new nb$_b$_b();
        }
        return this.\u00d200000;
    }

    public final nb$_c$_b super() {
        if (this.Object == null) {
            this.Object = new nb$_c$_b();
        }
        return this.Object;
    }

    private final void \u00d200000(g g2) {
        g2.\u00f800000(this.\u00d200000());
    }

    private final void super(g g2) {
        g2.\u00f800000(this.super());
    }

    public final nb \u00d400000() {
        Object object;
        Object object2 = this.\u00d200000;
        if (object2 == null || (object2 = ((nb$_b$_b)object2).\u00d500000()) == null) {
            object2 = nb$_b.\u00f500000.o00000();
        }
        if ((object = this.Object) == null || (object = ((nb$_c$_b)object).super()) == null) {
            object = nb$_c.\u00f400000.o00000();
        }
        return new nb(this.o00000, (nb$_b)object2, (nb$_c)object);
    }
}

