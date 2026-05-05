/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.kb;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_b$5
extends kb
implements RandomAccess {
    final /* synthetic */ float[] oO0000;

    x$_b$5(float[] fArray) {
        this.oO0000 = fArray;
    }

    @Override
    public final int o00000() {
        return this.oO0000.length;
    }

    @Override
    public final boolean isEmpty() {
        return this.oO0000.length == 0;
    }

    public final boolean \u00d300000(float f2) {
        float[] fArray = this.oO0000;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(Float.floatToIntBits(fArray[i2]) == Float.floatToIntBits(f2))) continue;
            return true;
        }
        return false;
    }

    public final Float \u00f800000(int n2) {
        return Float.valueOf(this.oO0000[n2]);
    }

    public final int new(float f2) {
        float[] fArray = this.oO0000;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!(Float.floatToIntBits(fArray[i2]) == Float.floatToIntBits(f2))) continue;
            return i2;
        }
        return -1;
    }

    public final int o00000(float f2) {
        float[] fArray = this.oO0000;
        int n2 = this.oO0000.length + -1;
        if (n2 >= 0) {
            do {
                int n3;
                if (!(Float.floatToIntBits(fArray[n3 = n2--]) == Float.floatToIntBits(f2))) continue;
                return n3;
            } while (n2 >= 0);
        }
        return -1;
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Float)) {
            return false;
        }
        return this.\u00d300000(((Number)object).floatValue());
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Float)) {
            return -1;
        }
        return this.new(((Number)object).floatValue());
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Float)) {
            return -1;
        }
        return this.o00000(((Number)object).floatValue());
    }
}

