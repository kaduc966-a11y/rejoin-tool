/*
 * Decompiled with CFR 0.152.
 */
package b.s.c;

import b.f;
import b.nc;
import b.s.kb;
import b.s.z;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d$_b$2
extends kb
implements RandomAccess {
    final /* synthetic */ long[] if;

    d$_b$2(long[] lArray) {
        this.if = lArray;
    }

    @Override
    public final int o00000() {
        return nc.\u00d500000(this.if);
    }

    @Override
    public final boolean isEmpty() {
        return nc.o00000(this.if);
    }

    public final boolean \u00d300000(long l2) {
        return nc.o00000(this.if, l2);
    }

    public final long \u00d500000(int n2) {
        return nc.o00000(this.if, n2);
    }

    public final int o00000(long l2) {
        return z.\u00d200000(this.if, l2);
    }

    public final int new(long l2) {
        return z.String(this.if, l2);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof f)) {
            return false;
        }
        return this.\u00d300000(((f)object).super());
    }

    @Override
    public final /* synthetic */ Object get(int n2) {
        return f.\u00d4O0000(this.\u00d500000(n2));
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof f)) {
            return -1;
        }
        return this.o00000(((f)object).super());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof f)) {
            return -1;
        }
        return this.new(((f)object).super());
    }
}

