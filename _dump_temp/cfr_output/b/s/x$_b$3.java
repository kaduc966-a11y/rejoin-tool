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
public final class x$_b$3
extends kb
implements RandomAccess {
    final /* synthetic */ int[] \u00d3O0000;

    x$_b$3(int[] nArray) {
        this.\u00d3O0000 = nArray;
    }

    @Override
    public final int o00000() {
        return this.\u00d3O0000.length;
    }

    @Override
    public final boolean isEmpty() {
        return this.\u00d3O0000.length == 0;
    }

    public final boolean \u00d3O0000(int n2) {
        return z.\u00f600000(this.\u00d3O0000, n2);
    }

    public final Integer oO0000(int n2) {
        return this.\u00d3O0000[n2];
    }

    public final int while(int n2) {
        return z.String(this.\u00d3O0000, n2);
    }

    public final int \u00d4O0000(int n2) {
        return z.for(this.\u00d3O0000, n2);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Integer)) {
            return false;
        }
        return this.\u00d3O0000(((Number)object).intValue());
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        return this.while(((Number)object).intValue());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        return this.\u00d4O0000(((Number)object).intValue());
    }
}

