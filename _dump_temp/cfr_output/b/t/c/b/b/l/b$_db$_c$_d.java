/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_db$_b;
import b.t.c.b.b.l.b$_db$_c;
import b.t.c.b.b.l.b$_db$_c$_c;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_db$_c$_d
extends d$_f
implements b$_db$_b {
    private int \u00d6\u00f80000;
    private int \u00d5\u00f80000;
    private b$_db$_c$_c Stringnull = b$_db$_c$_c.\u00d4\u00d3O000();

    private b$_db$_c$_d() {
        this.\u00d6\u00d5O000();
    }

    private void \u00d6\u00d5O000() {
    }

    private static b$_db$_c$_d \u00f4\u00d5O000() {
        return new b$_db$_c$_d();
    }

    public final b$_db$_c$_d \u00d8\u00d5O000() {
        return b$_db$_c$_d.\u00f4\u00d5O000().super(this.\u00d2\u00d6O000());
    }

    public final b$_db$_c \u00f8\u00d5O000() {
        return b$_db$_c.\u00f6\u00d6O000();
    }

    public final b$_db$_c voiddo() {
        b$_db$_c b$_db$_c = this.\u00d2\u00d6O000();
        if (!b$_db$_c.\u00d200000()) {
            throw b$_db$_c$_d.super(b$_db$_c);
        }
        return b$_db$_c;
    }

    public final b$_db$_c \u00d2\u00d6O000() {
        b$_db$_c b$_db$_c = new b$_db$_c(this, null);
        int n2 = this.\u00d6\u00f80000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_db$_c.super(b$_db$_c, this.\u00d5\u00f80000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_db$_c.super(b$_db$_c, this.Stringnull);
        b$_db$_c.\u00d200000(b$_db$_c, n3);
        return b$_db$_c;
    }

    public final b$_db$_c$_d super(b$_db$_c b$_db$_c) {
        if (b$_db$_c == b$_db$_c.\u00f6\u00d6O000()) {
            return this;
        }
        if (b$_db$_c.superwhile()) {
            this.Objectsuper(b$_db$_c.\u00d8\u00d6O000());
        }
        if (b$_db$_c.\u00d6\u00d6O000()) {
            this.\u00d600000(b$_db$_c.\u00f4\u00d6O000());
        }
        b$_db$_c$_d b$_db$_c$_d = this;
        b$_db$_c$_d.super(b$_db$_c$_d.class().o00000(b$_db$_c.\u00d200000(b$_db$_c)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        if (!this.\u00d3\u00d6O000()) {
            return false;
        }
        if (!this.Objectdo()) {
            return false;
        }
        return this.\u00f6\u00d5O000().\u00d200000();
    }

    public final b$_db$_c$_d OO0000(ab object, s s2) throws IOException {
        b$_db$_c b$_db$_c = null;
        try {
            b$_db$_c = (b$_db$_c)b$_db$_c.\u00d20O000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_db$_c = (b$_db$_c)g2.o00000();
            throw object;
        }
        finally {
            if (b$_db$_c != null) {
                this.super(b$_db$_c);
            }
        }
        return this;
    }

    public final boolean \u00d3\u00d6O000() {
        return (this.\u00d6\u00f80000 & 1) == 1;
    }

    public final b$_db$_c$_d Objectsuper(int n2) {
        this.\u00d6\u00f80000 |= 1;
        this.\u00d5\u00f80000 = n2;
        return this;
    }

    public final boolean Objectdo() {
        return (this.\u00d6\u00f80000 & 2) == 2;
    }

    public final b$_db$_c$_c \u00f6\u00d5O000() {
        return this.Stringnull;
    }

    public final b$_db$_c$_d class(b$_db$_c$_c b$_db$_c$_c) {
        if (b$_db$_c$_c == null) {
            throw new NullPointerException();
        }
        this.Stringnull = b$_db$_c$_c;
        this.\u00d6\u00f80000 |= 2;
        return this;
    }

    public final b$_db$_c$_d \u00d600000(b$_db$_c$_c b$_db$_c$_c) {
        this.Stringnull = (this.\u00d6\u00f80000 & 2) == 2 && this.Stringnull != b$_db$_c$_c.\u00d4\u00d3O000() ? b$_db$_c$_c.\u00d300000(this.Stringnull).super(b$_db$_c$_c).\u00d8\u00d2O000() : b$_db$_c$_c;
        this.\u00d6\u00f80000 |= 2;
        return this;
    }

    static /* synthetic */ b$_db$_c$_d O\u00d6O000() {
        return b$_db$_c$_d.\u00f4\u00d5O000();
    }
}

