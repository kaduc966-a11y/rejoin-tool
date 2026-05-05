/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.c;

import b.o.d.fc;
import b.t.c.b.b.c.c.f$_b;
import b.t.c.b.b.l.d.c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f
implements Comparable {
    public static final f$_b \u00d600000 = new f$_b(null);
    private final int \u00d200000;
    private final int \u00d300000;
    private final int class;
    public static final f super = new f(c.\u00f800000.\u00d200000());
    public static final f \u00d400000 = new f(c.\u00f500000.\u00d200000());

    public f(int n2, int n3, int n4) {
        this.\u00d200000 = n2;
        this.\u00d300000 = n3;
        this.class = n4;
        if (!(this.\u00d200000 >= 0)) {
            String string = "Major version should be not less than 0";
            throw new IllegalArgumentException(string.toString());
        }
        if (!(this.\u00d300000 >= 0)) {
            String string = "Minor version should be not less than 0";
            throw new IllegalArgumentException(string.toString());
        }
        if (!(this.class >= 0)) {
            String string = "Patch version should be not less than 0";
            throw new IllegalArgumentException(string.toString());
        }
    }

    public f(int[] nArray) {
        this(nArray[0], nArray[1], nArray[2]);
    }

    public final int o00000(f f2) {
        int n2 = fc.o00000(this.\u00d200000, f2.\u00d200000);
        if (n2 != 0) {
            return n2;
        }
        n2 = fc.o00000(this.\u00d300000, f2.\u00d300000);
        if (n2 != 0) {
            return n2;
        }
        return fc.o00000(this.class, f2.class);
    }

    public final String toString() {
        return "" + this.\u00d200000 + '.' + this.\u00d300000 + '.' + this.class;
    }

    public final int hashCode() {
        int n2 = this.\u00d200000;
        n2 = 31 * n2 + this.\u00d300000;
        return 31 * n2 + this.class;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Object object2 = object;
        if (!fc.o00000(this.getClass(), object2 != null ? object2.getClass() : null)) {
            return false;
        }
        f cfr_ignored_0 = (f)object;
        if (this.\u00d200000 != ((f)object).\u00d200000) {
            return false;
        }
        if (this.\u00d300000 != ((f)object).\u00d300000) {
            return false;
        }
        return this.class == ((f)object).class;
    }
}

