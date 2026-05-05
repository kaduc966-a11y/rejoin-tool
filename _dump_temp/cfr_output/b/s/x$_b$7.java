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
public final class x$_b$7
extends kb
implements RandomAccess {
    final /* synthetic */ boolean[] \u00d8O0000;

    x$_b$7(boolean[] blArray) {
        this.\u00d8O0000 = blArray;
    }

    @Override
    public final int o00000() {
        return this.\u00d8O0000.length;
    }

    @Override
    public final boolean isEmpty() {
        return this.\u00d8O0000.length == 0;
    }

    public final boolean o00000(boolean bl) {
        return z.\u00d200000(this.\u00d8O0000, bl);
    }

    public final Boolean \u00f4O0000(int n2) {
        return this.\u00d8O0000[n2];
    }

    public final int \u00d300000(boolean bl) {
        return z.String(this.\u00d8O0000, bl);
    }

    public final int new(boolean bl) {
        return z.\u00d300000(this.\u00d8O0000, bl);
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Boolean)) {
            return false;
        }
        return this.o00000((Boolean)object);
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Boolean)) {
            return -1;
        }
        return this.\u00d300000((Boolean)object);
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Boolean)) {
            return -1;
        }
        return this.new((Boolean)object);
    }
}

