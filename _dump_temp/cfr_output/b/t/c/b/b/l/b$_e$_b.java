/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_d;
import b.t.c.b.b.l.b$_e;
import b.t.c.b.b.l.b$_fb;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.b$_p;
import b.t.c.b.b.l.b$_pb;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_c;
import b.t.c.b.b.p.d$_g;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_e$_b
extends d$_g
implements b$_p {
    private int \u00d8Oo000;
    private b$_fb \u00d6Oo000 = b$_fb.O\u00f6O000();
    private b$_pb \u00d5Oo000 = b$_pb.\u00d8\u00d5o000();
    private b$_i Stringthissuper = b$_i.voidpublicsuper();
    private List \u00d3Oo000 = Collections.emptyList();

    private b$_e$_b() {
        this.\u00f6\u00d3\u00d2000();
    }

    private void \u00f6\u00d3\u00d2000() {
    }

    private static b$_e$_b floatfloatsuper() {
        return new b$_e$_b();
    }

    public final b$_e$_b \u00d4\u00d4\u00d2000() {
        return b$_e$_b.floatfloatsuper().super(this.\u00d6\u00d4\u00d2000());
    }

    public final b$_e \u00d3\u00d4\u00d2000() {
        return b$_e.O\u00d6\u00d2000();
    }

    public final b$_e voidfloatsuper() {
        b$_e b$_e = this.\u00d6\u00d4\u00d2000();
        if (!b$_e.\u00d200000()) {
            throw b$_e$_b.super(b$_e);
        }
        return b$_e;
    }

    public final b$_e \u00d6\u00d4\u00d2000() {
        b$_e b$_e = new b$_e(this, null);
        int n2 = this.\u00d8Oo000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_e.super(b$_e, this.\u00d6Oo000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_e.super(b$_e, this.\u00d5Oo000);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_e.super(b$_e, this.Stringthissuper);
        if ((this.\u00d8Oo000 & 8) == 8) {
            this.\u00d3Oo000 = Collections.unmodifiableList(this.\u00d3Oo000);
            this.\u00d8Oo000 &= 0xFFFFFFF7;
        }
        b$_e.super(b$_e, this.\u00d3Oo000);
        b$_e.super(b$_e, n3);
        return b$_e;
    }

    public final b$_e$_b super(b$_e b$_e) {
        if (b$_e == b$_e.O\u00d6\u00d2000()) {
            return this;
        }
        if (b$_e.\u00d2\u00d5\u00d2000()) {
            this.class(b$_e.\u00d8\u00d5\u00d2000());
        }
        if (b$_e.superforsuper()) {
            this.class(b$_e.intforsuper());
        }
        if (b$_e.O\u00d5\u00d2000()) {
            this.super(b$_e.\u00f8\u00d4\u00d2000());
        }
        if (!b$_e.\u00d300000(b$_e).isEmpty()) {
            if (this.\u00d3Oo000.isEmpty()) {
                this.\u00d3Oo000 = b$_e.\u00d300000(b$_e);
                this.\u00d8Oo000 &= 0xFFFFFFF7;
            } else {
                this.\u00f6\u00d4\u00d2000();
                this.\u00d3Oo000.addAll(b$_e.\u00d300000(b$_e));
            }
        }
        this.super((d$_c)b$_e);
        b$_e$_b b$_e$_b = this;
        b$_e$_b.super(b$_e$_b.class().o00000(b$_e.\u00d200000(b$_e)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        if (this.\u00d2\u00d4\u00d2000() && !this.publicfloatsuper().\u00d200000()) {
            return false;
        }
        if (this.O\u00d4\u00d2000() && !this.\u00f8\u00d3\u00d2000().\u00d200000()) {
            return false;
        }
        for (int i2 = 0; i2 < this.\u00d8\u00d4\u00d2000(); ++i2) {
            if (this.O\u00d50000(i2).\u00d200000()) continue;
            return false;
        }
        return this.classStringsuper();
    }

    public final b$_e$_b \u00f6O0000(ab object, s s2) throws IOException {
        b$_e b$_e = null;
        try {
            b$_e = (b$_e)b$_e.nullthissuper.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_e = (b$_e)g2.o00000();
            throw object;
        }
        finally {
            if (b$_e != null) {
                this.super(b$_e);
            }
        }
        return this;
    }

    public final b$_e$_b class(b$_fb b$_fb) {
        this.\u00d6Oo000 = (this.\u00d8Oo000 & 1) == 1 && this.\u00d6Oo000 != b$_fb.O\u00f6O000() ? b$_fb.\u00d400000(this.\u00d6Oo000).super(b$_fb).\u00d2\u00f5O000() : b$_fb;
        this.\u00d8Oo000 |= 1;
        return this;
    }

    public final boolean \u00d2\u00d4\u00d2000() {
        return (this.\u00d8Oo000 & 2) == 2;
    }

    public final b$_pb publicfloatsuper() {
        return this.\u00d5Oo000;
    }

    public final b$_e$_b class(b$_pb b$_pb) {
        this.\u00d5Oo000 = (this.\u00d8Oo000 & 2) == 2 && this.\u00d5Oo000 != b$_pb.\u00d8\u00d5o000() ? b$_pb.\u00d200000(this.\u00d5Oo000).super(b$_pb).\u00d6\u00d5o000() : b$_pb;
        this.\u00d8Oo000 |= 2;
        return this;
    }

    public final boolean O\u00d4\u00d2000() {
        return (this.\u00d8Oo000 & 4) == 4;
    }

    public final b$_i \u00f8\u00d3\u00d2000() {
        return this.Stringthissuper;
    }

    public final b$_e$_b super(b$_i b$_i) {
        this.Stringthissuper = (this.\u00d8Oo000 & 4) == 4 && this.Stringthissuper != b$_i.voidpublicsuper() ? b$_i.\u00d300000(this.Stringthissuper).\u00d200000(b$_i).interfacewhilesuper() : b$_i;
        this.\u00d8Oo000 |= 4;
        return this;
    }

    private void \u00f6\u00d4\u00d2000() {
        if ((this.\u00d8Oo000 & 8) != 8) {
            this.\u00d3Oo000 = new ArrayList(this.\u00d3Oo000);
            this.\u00d8Oo000 |= 8;
        }
    }

    public final int \u00d8\u00d4\u00d2000() {
        return this.\u00d3Oo000.size();
    }

    public final b$_d O\u00d50000(int n2) {
        return (b$_d)this.\u00d3Oo000.get(n2);
    }

    static /* synthetic */ b$_e$_b \u00f4\u00d4\u00d2000() {
        return b$_e$_b.floatfloatsuper();
    }
}

