/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.d$_b;
import b.ld;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
implements Comparable {
    public static final d$_b void = new d$_b(null);
    private final int \u00d200000;
    private final int \u00d500000;
    private final int \u00d600000;
    private final int o00000;
    public static final int \u00d400000 = 255;
    public static final d Object = ld.o00000();

    public d(int n2, int n3, int n4) {
        this.\u00d200000 = n2;
        this.\u00d500000 = n3;
        this.\u00d600000 = n4;
        this.o00000 = this.o00000(this.\u00d200000, this.\u00d500000, this.\u00d600000);
    }

    public final int \u00d300000() {
        return this.\u00d200000;
    }

    public final int \u00d200000() {
        return this.\u00d500000;
    }

    public final int o00000() {
        return this.\u00d600000;
    }

    public d(int n2, int n3) {
        this(n2, n3, 0);
    }

    /*
     * Unable to fully structure code
     */
    private final int o00000(int var1_1, int var2_3, int var3_4) {
        v0 = var1_1 >= 0 ? var1_1 < 256 : false;
        if (!v0) ** GOTO lbl-1000
        v1 = var2_3 >= 0 ? var2_3 < 256 : false;
        if (!v1) ** GOTO lbl-1000
        v2 = var3_4 >= 0 ? var3_4 < 256 : false;
        if (v2) {
            v3 = true;
        } else lbl-1000:
        // 3 sources

        {
            v3 = false;
        }
        if (!v3) {
            var1_2 = "Version components are out of range: " + var1_1 + '.' + var2_3 + '.' + var3_4;
            throw new IllegalArgumentException(var1_2.toString());
        }
        return (var1_1 << 16) + (var2_3 << 8) + var3_4;
    }

    public final String toString() {
        return "" + this.\u00d200000 + '.' + this.\u00d500000 + '.' + this.\u00d600000;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        d d2 = object instanceof d ? (d)object : null;
        if (d2 == null) {
            return false;
        }
        object = d2;
        return this.o00000 == ((d)object).o00000;
    }

    public final int hashCode() {
        return this.o00000;
    }

    public final int o00000(d d2) {
        return this.o00000 - d2.o00000;
    }

    public final boolean o00000(int n2, int n3) {
        return this.\u00d200000 > n2 || this.\u00d200000 == n2 && this.\u00d500000 >= n3;
    }

    public final boolean \u00d200000(int n2, int n3, int n4) {
        return this.\u00d200000 > n2 || this.\u00d200000 == n2 && (this.\u00d500000 > n3 || this.\u00d500000 == n3 && this.\u00d600000 >= n4);
    }
}

