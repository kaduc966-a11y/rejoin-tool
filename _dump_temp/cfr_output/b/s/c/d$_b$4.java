/*
 * Decompiled with CFR 0.152.
 */
package b.s.c;

import b.dd;
import b.hc;
import b.s.kb;
import b.s.z;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d$_b$4
extends kb
implements RandomAccess {
    final /* synthetic */ short[] \u00f400000;

    d$_b$4(short[] sArray) {
        this.\u00f400000 = sArray;
    }

    @Override
    public final int o00000() {
        return hc.\u00d400000(this.\u00f400000);
    }

    @Override
    public final boolean isEmpty() {
        return hc.o00000(this.\u00f400000);
    }

    public final boolean \u00d300000(short s2) {
        return hc.o00000(this.\u00f400000, s2);
    }

    public final short \u00d300000(int n2) {
        return hc.o00000(this.\u00f400000, n2);
    }

    public final int o00000(short s2) {
        return z.String(this.\u00f400000, s2);
    }

    public final int new(short s2) {
        return z.\u00d300000(this.\u00f400000, s2);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof dd)) {
            return false;
        }
        return this.\u00d300000(((dd)object).o00000());
    }

    @Override
    public final /* synthetic */ Object get(int n2) {
        return dd.\u00d6O0000(this.\u00d300000(n2));
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof dd)) {
            return -1;
        }
        return this.o00000(((dd)object).o00000());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof dd)) {
            return -1;
        }
        return this.new(((dd)object).o00000());
    }
}

