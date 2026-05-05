/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_b;
import b.t.c.b.b.l.b$_nb$_c;
import b.t.c.b.b.l.b$_nb$_c$_b;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_nb$_c$_c
extends d$_f
implements b$_nb$_b {
    private int \u00f5\u00d3O000;
    private b$_nb$_c$_b whilefloat = b$_nb$_c$_b.\u00f4\u00d80000;
    private b$_nb \u00d6\u00d3O000 = b$_nb.\u00d2o\u00d4000();
    private int \u00d8\u00d3O000;

    private b$_nb$_c$_c() {
        this.interfacethissuper();
    }

    private void interfacethissuper() {
    }

    private static b$_nb$_c$_c Objectsupersuper() {
        return new b$_nb$_c$_c();
    }

    public final b$_nb$_c$_c \u00d8oo000() {
        return b$_nb$_c$_c.Objectsupersuper().super(this.\u00f4oo000());
    }

    public final b$_nb$_c \u00d6oo000() {
        return b$_nb$_c.\u00f6\u00d2o000();
    }

    public final b$_nb$_c \u00f6oo000() {
        b$_nb$_c b$_nb$_c = this.\u00f4oo000();
        if (!b$_nb$_c.\u00d200000()) {
            throw b$_nb$_c$_c.super(b$_nb$_c);
        }
        return b$_nb$_c;
    }

    public final b$_nb$_c \u00f4oo000() {
        b$_nb$_c b$_nb$_c = new b$_nb$_c(this, null);
        int n2 = this.\u00f5\u00d3O000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_nb$_c.super(b$_nb$_c, this.whilefloat);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_nb$_c.super(b$_nb$_c, this.\u00d6\u00d3O000);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_nb$_c.\u00d200000(b$_nb$_c, this.\u00d8\u00d3O000);
        b$_nb$_c.super(b$_nb$_c, n3);
        return b$_nb$_c;
    }

    public final b$_nb$_c$_c super(b$_nb$_c b$_nb$_c) {
        if (b$_nb$_c == b$_nb$_c.\u00f6\u00d2o000()) {
            return this;
        }
        if (b$_nb$_c.floatsupersuper()) {
            this.super(b$_nb$_c.\u00d8\u00d2o000());
        }
        if (b$_nb$_c.O\u00d3o000()) {
            this.\u00d300000(b$_nb$_c.publicsupersuper());
        }
        if (b$_nb$_c.\u00d4\u00d2o000()) {
            this.O\u00d20000(b$_nb$_c.\u00d2\u00d2o000());
        }
        b$_nb$_c$_c b$_nb$_c$_c = this;
        b$_nb$_c$_c.super(b$_nb$_c$_c.class().o00000(b$_nb$_c.\u00d300000(b$_nb$_c)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return !this.voidsupersuper() || this.O\u00d2o000().\u00d200000();
    }

    public final b$_nb$_c$_c interface(ab object, s s2) throws IOException {
        b$_nb$_c b$_nb$_c = null;
        try {
            b$_nb$_c = (b$_nb$_c)b$_nb$_c.\u00f6\u00d3O000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_nb$_c = (b$_nb$_c)g2.o00000();
            throw object;
        }
        finally {
            if (b$_nb$_c != null) {
                this.super(b$_nb$_c);
            }
        }
        return this;
    }

    public final b$_nb$_c$_c super(b$_nb$_c$_b b$_nb$_c$_b) {
        if (b$_nb$_c$_b == null) {
            throw new NullPointerException();
        }
        this.\u00f5\u00d3O000 |= 1;
        this.whilefloat = b$_nb$_c$_b;
        return this;
    }

    public final boolean voidsupersuper() {
        return (this.\u00f5\u00d3O000 & 2) == 2;
    }

    public final b$_nb O\u00d2o000() {
        return this.\u00d6\u00d3O000;
    }

    public final b$_nb$_c$_c \u00d200000(b$_nb b$_nb) {
        if (b$_nb == null) {
            throw new NullPointerException();
        }
        this.\u00d6\u00d3O000 = b$_nb;
        this.\u00f5\u00d3O000 |= 2;
        return this;
    }

    public final b$_nb$_c$_c \u00d300000(b$_nb b$_nb) {
        this.\u00d6\u00d3O000 = (this.\u00f5\u00d3O000 & 2) == 2 && this.\u00d6\u00d3O000 != b$_nb.\u00d2o\u00d4000() ? b$_nb.Objectsuper(this.\u00d6\u00d3O000).\u00d3O0000(b$_nb).\u00f60\u00d4000() : b$_nb;
        this.\u00f5\u00d3O000 |= 2;
        return this;
    }

    public final b$_nb$_c$_c O\u00d20000(int n2) {
        this.\u00f5\u00d3O000 |= 4;
        this.\u00d8\u00d3O000 = n2;
        return this;
    }

    static /* synthetic */ b$_nb$_c$_c \u00f8oo000() {
        return b$_nb$_c$_c.Objectsupersuper();
    }
}

