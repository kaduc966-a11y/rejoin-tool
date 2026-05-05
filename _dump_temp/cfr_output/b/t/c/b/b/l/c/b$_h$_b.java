/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$_c;
import b.t.c.b.b.l.c.b$_h;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_h$_b
extends d$_f
implements b$_c {
    private int \u00d6o0000;
    private int \u00d5o0000;
    private int ifsuper;

    private b$_h$_b() {
        this.\u00d4\u00d30000();
    }

    private void \u00d4\u00d30000() {
    }

    private static b$_h$_b ObjectObject() {
        return new b$_h$_b();
    }

    public final b$_h$_b \u00d3\u00d30000() {
        return b$_h$_b.ObjectObject().super(this.interfacenew());
    }

    public final b$_h \u00f4\u00d30000() {
        return b$_h.\u00f6\u00d30000();
    }

    public final b$_h \u00d8\u00d30000() {
        b$_h b$_h = this.interfacenew();
        if (!b$_h.\u00d200000()) {
            throw b$_h$_b.super(b$_h);
        }
        return b$_h;
    }

    public final b$_h interfacenew() {
        b$_h b$_h = new b$_h(this, null);
        int n2 = this.\u00d6o0000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_h.\u00d200000(b$_h, this.\u00d5o0000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_h.super(b$_h, this.ifsuper);
        b$_h.\u00d300000(b$_h, n3);
        return b$_h;
    }

    public final b$_h$_b super(b$_h b$_h) {
        if (b$_h == b$_h.\u00f6\u00d30000()) {
            return this;
        }
        if (b$_h.\u00d8\u00d40000()) {
            this.\u00d300000(b$_h.\u00d4\u00d40000());
        }
        if (b$_h.O\u00d40000()) {
            this.\u00d400000(b$_h.\u00f8\u00d30000());
        }
        b$_h$_b b$_h$_b = this;
        b$_h$_b.super(b$_h$_b.class().o00000(b$_h.\u00d300000(b$_h)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return true;
    }

    public final b$_h$_b \u00d400000(ab object, s s2) throws IOException {
        b$_h b$_h = null;
        try {
            b$_h = (b$_h)b$_h.\u00d2\u00d20000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_h = (b$_h)g2.o00000();
            throw object;
        }
        finally {
            if (b$_h != null) {
                this.super(b$_h);
            }
        }
        return this;
    }

    public final b$_h$_b \u00d300000(int n2) {
        this.\u00d6o0000 |= 1;
        this.\u00d5o0000 = n2;
        return this;
    }

    public final b$_h$_b \u00d400000(int n2) {
        this.\u00d6o0000 |= 2;
        this.ifsuper = n2;
        return this;
    }

    static /* synthetic */ b$_h$_b \u00d6\u00d30000() {
        return b$_h$_b.ObjectObject();
    }
}

