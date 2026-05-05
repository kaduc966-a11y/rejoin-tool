/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.o.d.fc;
import b.o.e.g;
import b.t.c.b.b.l.d.b$_b$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_b {
    public static final b$_b$_b \u00d500000 = new b$_b$_b(null);
    private final int o00000;
    private final int \u00d300000;
    private final int \u00d400000;
    public static final b$_b new = new b$_b(256, 256, 256);

    public b$_b(int n2, int n3, int n4) {
        this.o00000 = n2;
        this.\u00d300000 = n3;
        this.\u00d400000 = n4;
    }

    public final String o00000() {
        if (this.\u00d400000 == 0) {
            return "" + this.o00000 + '.' + this.\u00d300000;
        }
        return "" + this.o00000 + '.' + this.\u00d300000 + '.' + this.\u00d400000;
    }

    public final void o00000(g g2, g g3) {
        if (!fc.o00000((Object)this, (Object)new)) {
            if (this.o00000 > 7 || this.\u00d300000 > 15 || this.\u00d400000 > 127) {
                g3.\u00f800000(this.o00000 | this.\u00d300000 << 8 | this.\u00d400000 << 16);
                return;
            }
            g2.\u00f800000(this.o00000 | this.\u00d300000 << 3 | this.\u00d400000 << 7);
        }
    }

    public final String toString() {
        return this.o00000();
    }

    public final int \u00d400000() {
        return this.o00000;
    }

    public final int \u00d300000() {
        return this.\u00d300000;
    }

    public final int new() {
        return this.\u00d400000;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.o00000) * 31 + Integer.hashCode(this.\u00d300000)) * 31 + Integer.hashCode(this.\u00d400000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b$_b)) {
            return false;
        }
        object = (b$_b)object;
        if (this.o00000 != ((b$_b)object).o00000) {
            return false;
        }
        if (this.\u00d300000 != ((b$_b)object).\u00d300000) {
            return false;
        }
        return this.\u00d400000 == ((b$_b)object).\u00d400000;
    }
}

