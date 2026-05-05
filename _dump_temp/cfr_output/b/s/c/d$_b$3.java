/*
 * Decompiled with CFR 0.152.
 */
package b.s.c;

import b.lc;
import b.s;
import b.s.kb;
import b.s.z;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d$_b$3
extends kb
implements RandomAccess {
    final /* synthetic */ byte[] \u00f500000;

    d$_b$3(byte[] byArray) {
        this.\u00f500000 = byArray;
    }

    @Override
    public final int o00000() {
        return s.o00000(this.\u00f500000);
    }

    @Override
    public final boolean isEmpty() {
        return s.\u00d500000(this.\u00f500000);
    }

    public final boolean new(byte by) {
        return s.o00000(this.\u00f500000, by);
    }

    public final byte \u00d400000(int n2) {
        return s.o00000(this.\u00f500000, n2);
    }

    public final int o00000(byte by) {
        return z.\u00d300000(this.\u00f500000, by);
    }

    public final int \u00d300000(byte by) {
        return z.\u00d200000(this.\u00f500000, by);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof lc)) {
            return false;
        }
        return this.new(((lc)object).super());
    }

    @Override
    public final /* synthetic */ Object get(int n2) {
        return lc.\u00d6O0000(this.\u00d400000(n2));
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof lc)) {
            return -1;
        }
        return this.o00000(((lc)object).super());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof lc)) {
            return -1;
        }
        return this.\u00d300000(((lc)object).super());
    }
}

