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
public final class x$_b$2
extends kb
implements RandomAccess {
    final /* synthetic */ short[] \u00d4O0000;

    x$_b$2(short[] sArray) {
        this.\u00d4O0000 = sArray;
    }

    @Override
    public final int o00000() {
        return this.\u00d4O0000.length;
    }

    @Override
    public final boolean isEmpty() {
        return this.\u00d4O0000.length == 0;
    }

    public final boolean \u00d500000(short s2) {
        return z.\u00d200000(this.\u00d4O0000, s2);
    }

    public final Short \u00d5O0000(int n2) {
        return this.\u00d4O0000[n2];
    }

    public final int \u00d400000(short s2) {
        return z.String(this.\u00d4O0000, s2);
    }

    public final int return(short s2) {
        return z.\u00d300000(this.\u00d4O0000, s2);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Short)) {
            return false;
        }
        return this.\u00d500000(((Number)object).shortValue());
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Short)) {
            return -1;
        }
        return this.\u00d400000(((Number)object).shortValue());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Short)) {
            return -1;
        }
        return this.return(((Number)object).shortValue());
    }
}

