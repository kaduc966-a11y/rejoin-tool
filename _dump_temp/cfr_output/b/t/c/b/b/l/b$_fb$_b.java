/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_fb;
import b.t.c.b.b.l.b$_l;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.q;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.u;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_fb$_b
extends d$_f
implements b$_l {
    private int \u00d2OO000;
    private q \u00d3OO000 = u.new;

    private b$_fb$_b() {
        this.\u00f6\u00f4O000();
    }

    private void \u00f6\u00f4O000() {
    }

    private static b$_fb$_b \u00d3\u00f5O000() {
        return new b$_fb$_b();
    }

    public final b$_fb$_b voidpublic() {
        return b$_fb$_b.\u00d3\u00f5O000().super(this.\u00d2\u00f5O000());
    }

    public final b$_fb \u00f8\u00f4O000() {
        return b$_fb.O\u00f6O000();
    }

    public final b$_fb \u00d4\u00f5O000() {
        b$_fb b$_fb = this.\u00d2\u00f5O000();
        if (!b$_fb.\u00d200000()) {
            throw b$_fb$_b.super(b$_fb);
        }
        return b$_fb;
    }

    public final b$_fb \u00d2\u00f5O000() {
        b$_fb b$_fb = new b$_fb(this, null);
        if ((this.\u00d2OO000 & 1) == 1) {
            this.\u00d3OO000 = this.\u00d3OO000.\u00d200000();
            this.\u00d2OO000 &= 0xFFFFFFFE;
        }
        b$_fb.super(b$_fb, this.\u00d3OO000);
        return b$_fb;
    }

    public final b$_fb$_b super(b$_fb b$_fb) {
        if (b$_fb == b$_fb.O\u00f6O000()) {
            return this;
        }
        if (!b$_fb.\u00d300000(b$_fb).isEmpty()) {
            if (this.\u00d3OO000.isEmpty()) {
                this.\u00d3OO000 = b$_fb.\u00d300000(b$_fb);
                this.\u00d2OO000 &= 0xFFFFFFFE;
            } else {
                this.O\u00f5O000();
                this.\u00d3OO000.addAll(b$_fb.\u00d300000(b$_fb));
            }
        }
        b$_fb$_b b$_fb$_b = this;
        b$_fb$_b.super(b$_fb$_b.class().o00000(b$_fb.\u00d200000(b$_fb)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return true;
    }

    public final b$_fb$_b \u00d2O0000(ab object, s s2) throws IOException {
        b$_fb b$_fb = null;
        try {
            b$_fb = (b$_fb)b$_fb.\u00f5OO000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_fb = (b$_fb)g2.o00000();
            throw object;
        }
        finally {
            if (b$_fb != null) {
                this.super(b$_fb);
            }
        }
        return this;
    }

    private void O\u00f5O000() {
        if ((this.\u00d2OO000 & 1) != 1) {
            this.\u00d3OO000 = new u(this.\u00d3OO000);
            this.\u00d2OO000 |= 1;
        }
    }

    static /* synthetic */ b$_fb$_b floatpublic() {
        return b$_fb$_b.\u00d3\u00f5O000();
    }
}

