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
public final class x$_b$8
extends kb
implements RandomAccess {
    final /* synthetic */ char[] thissuper;

    x$_b$8(char[] cArray) {
        this.thissuper = cArray;
    }

    @Override
    public final int o00000() {
        return this.thissuper.length;
    }

    @Override
    public final boolean isEmpty() {
        return this.thissuper.length == 0;
    }

    public final boolean o00000(char c2) {
        return z.\u00d300000(this.thissuper, c2);
    }

    public final Character \u00d8O0000(int n2) {
        return Character.valueOf(this.thissuper[n2]);
    }

    public final int \u00d300000(char c2) {
        return z.\u00d200000(this.thissuper, c2);
    }

    public final int new(char c2) {
        return z.String(this.thissuper, c2);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Character)) {
            return false;
        }
        return this.o00000(((Character)object).charValue());
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Character)) {
            return -1;
        }
        return this.\u00d300000(((Character)object).charValue());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Character)) {
            return -1;
        }
        return this.new(((Character)object).charValue());
    }
}

