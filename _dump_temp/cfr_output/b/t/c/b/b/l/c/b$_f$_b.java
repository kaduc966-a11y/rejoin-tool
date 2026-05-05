/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$_f;
import b.t.c.b.b.l.c.b$_g;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_f$_b
extends d$_f
implements b$_g {
    private int \u00d8O0000;
    private int \u00d6O0000;
    private int \u00d5O0000;

    private b$_f$_b() {
        this.\u00f6o0000();
    }

    private void \u00f6o0000() {
    }

    private static b$_f$_b supernew() {
        return new b$_f$_b();
    }

    public final b$_f$_b \u00d3\u00d20000() {
        return b$_f$_b.supernew().super(this.\u00d4\u00d20000());
    }

    public final b$_f O\u00d20000() {
        return b$_f.\u00d8\u00d20000();
    }

    public final b$_f \u00d2\u00d20000() {
        b$_f b$_f = this.\u00d4\u00d20000();
        if (!b$_f.\u00d200000()) {
            throw b$_f$_b.super(b$_f);
        }
        return b$_f;
    }

    public final b$_f \u00d4\u00d20000() {
        b$_f b$_f = new b$_f(this, null);
        int n2 = this.\u00d8O0000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_f.super(b$_f, this.\u00d6O0000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_f.\u00d300000(b$_f, this.\u00d5O0000);
        b$_f.\u00d200000(b$_f, n3);
        return b$_f;
    }

    public final b$_f$_b super(b$_f b$_f) {
        if (b$_f == b$_f.\u00d8\u00d20000()) {
            return this;
        }
        if (b$_f.\u00d2\u00d30000()) {
            this.super(b$_f.\u00f8\u00d20000());
        }
        if (b$_f.\u00d6\u00d20000()) {
            this.\u00d200000(b$_f.classnew());
        }
        b$_f$_b b$_f$_b = this;
        b$_f$_b.super(b$_f$_b.class().o00000(b$_f.\u00d300000(b$_f)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return true;
    }

    public final b$_f$_b \u00d300000(ab object, s s2) throws IOException {
        b$_f b$_f = null;
        try {
            b$_f = (b$_f)b$_f.\u00d3o0000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_f = (b$_f)g2.o00000();
            throw object;
        }
        finally {
            if (b$_f != null) {
                this.super(b$_f);
            }
        }
        return this;
    }

    public final b$_f$_b super(int n2) {
        this.\u00d8O0000 |= 1;
        this.\u00d6O0000 = n2;
        return this;
    }

    public final b$_f$_b \u00d200000(int n2) {
        this.\u00d8O0000 |= 2;
        this.\u00d5O0000 = n2;
        return this;
    }

    static /* synthetic */ b$_f$_b \u00f8o0000() {
        return b$_f$_b.supernew();
    }
}

