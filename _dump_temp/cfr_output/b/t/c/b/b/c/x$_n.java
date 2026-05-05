/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.lc;
import b.o.d.w;
import b.t.c.b.b.c.x$_p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_n
extends x$_p {
    private final byte \u00d4O0000;

    private x$_n(byte by) {
        super(null);
        this.\u00d4O0000 = by;
    }

    public final byte private() {
        return this.\u00d4O0000;
    }

    public final int hashCode() {
        return lc.\u00d600000(this.\u00d4O0000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_n)) {
            return false;
        }
        object = (x$_n)object;
        return this.\u00d4O0000 == ((x$_n)object).\u00d4O0000;
    }

    @Override
    public final /* synthetic */ Object null() {
        return lc.\u00d6O0000(this.private());
    }

    public /* synthetic */ x$_n(byte by, w w2) {
        this(by);
    }
}

