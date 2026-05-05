/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.kb;
import b.s.z;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_b$1
extends kb
implements RandomAccess {
    final /* synthetic */ byte[] \u00d5O0000;

    x$_b$1(byte[] byArray) {
        this.\u00d5O0000 = byArray;
    }

    @Override
    public final int o00000() {
        return this.\u00d5O0000.length;
    }

    @Override
    public final boolean isEmpty() {
        return this.\u00d5O0000.length == 0;
    }

    public final boolean \u00d400000(byte by) {
        return z.String(this.\u00d5O0000, by);
    }

    public final Byte thissuper(int n2) {
        return this.\u00d5O0000[n2];
    }

    public final int return(byte by) {
        return z.\u00d300000(this.\u00d5O0000, by);
    }

    public final int \u00d500000(byte by) {
        return z.\u00d200000(this.\u00d5O0000, by);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Byte)) {
            return false;
        }
        return this.\u00d400000(((Number)object).byteValue());
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Byte)) {
            return -1;
        }
        return this.return(((Number)object).byteValue());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Byte)) {
            return -1;
        }
        return this.\u00d500000(((Number)object).byteValue());
    }
}

