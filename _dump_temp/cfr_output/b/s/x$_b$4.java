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
public final class x$_b$4
extends kb
implements RandomAccess {
    final /* synthetic */ long[] while;

    x$_b$4(long[] lArray) {
        this.while = lArray;
    }

    @Override
    public final int o00000() {
        return this.while.length;
    }

    @Override
    public final boolean isEmpty() {
        return this.while.length == 0;
    }

    public final boolean \u00d500000(long l2) {
        return z.\u00d300000(this.while, l2);
    }

    public final Long OO0000(int n2) {
        return this.while[n2];
    }

    public final int \u00d400000(long l2) {
        return z.\u00d200000(this.while, l2);
    }

    public final int return(long l2) {
        return z.String(this.while, l2);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Long)) {
            return false;
        }
        return this.\u00d500000(((Number)object).longValue());
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Long)) {
            return -1;
        }
        return this.\u00d400000(((Number)object).longValue());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Long)) {
            return -1;
        }
        return this.return(((Number)object).longValue());
    }
}

