/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.b;

import b.t.c.b.b.l.d.l$_b;
import b.t.c.b.b.l.d.l$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j {
    private final int \u00d300000;
    private final int o00000;
    private final int new;

    public j(int n2, int n3, int n4) {
        this.\u00d300000 = n2;
        this.o00000 = n3;
        this.new = n4;
    }

    public final int \u00d300000() {
        return this.\u00d300000;
    }

    public final int \u00d200000() {
        return this.o00000;
    }

    public final int super() {
        return this.new;
    }

    public j(l$_b l$_b, int n2) {
        this(l$_b.new, l$_b.o00000, n2);
    }

    public j(l$_c l$_c) {
        this(l$_c, 1);
    }

    public final int \u00d200000(int n2) {
        return (n2 & ~((1 << this.o00000) - 1 << this.\u00d300000)) + (this.new << this.\u00d300000);
    }

    public final boolean super(int n2) {
        return (n2 >>> this.\u00d300000 & (1 << this.o00000) - 1) == this.new;
    }
}

