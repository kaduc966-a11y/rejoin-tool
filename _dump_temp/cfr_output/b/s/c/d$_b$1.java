/*
 * Decompiled with CFR 0.152.
 */
package b.s.c;

import b.ac;
import b.s.kb;
import b.s.z;
import b.v;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d$_b$1
extends kb
implements RandomAccess {
    final /* synthetic */ int[] \u00f800000;

    d$_b$1(int[] nArray) {
        this.\u00f800000 = nArray;
    }

    @Override
    public final int o00000() {
        return v.\u00d300000(this.\u00f800000);
    }

    @Override
    public final boolean isEmpty() {
        return v.\u00d500000(this.\u00f800000);
    }

    public final boolean \u00d800000(int n2) {
        return v.o00000(this.\u00f800000, n2);
    }

    public final int \u00f400000(int n2) {
        return v.new(this.\u00f800000, n2);
    }

    public final int \u00f500000(int n2) {
        return z.String(this.\u00f800000, n2);
    }

    public final int return(int n2) {
        return z.for(this.\u00f800000, n2);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof ac)) {
            return false;
        }
        return this.\u00d800000(((ac)object).o00000());
    }

    @Override
    public final /* synthetic */ Object get(int n2) {
        return ac.return(this.\u00f400000(n2));
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof ac)) {
            return -1;
        }
        return this.\u00f500000(((ac)object).o00000());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof ac)) {
            return -1;
        }
        return this.return(((ac)object).o00000());
    }
}

