/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$_d;
import b.t.c.b.b.l.c.b$_f;
import b.t.c.b.b.l.c.b$_h;
import b.t.c.b.b.l.c.b$_i;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_i$_b
extends d$_f
implements b$_d {
    private int \u00d8\u00d20000;
    private b$_h nullnew = b$_h.\u00f6\u00d30000();
    private b$_f Stringnew = b$_f.\u00d8\u00d20000();
    private b$_f \u00d3\u00d20000 = b$_f.\u00d8\u00d20000();
    private b$_f \u00d6\u00d20000 = b$_f.\u00d8\u00d20000();
    private b$_f \u00d5\u00d20000 = b$_f.\u00d8\u00d20000();

    private b$_i$_b() {
        this.\u00f4\u00d40000();
    }

    private void \u00f4\u00d40000() {
    }

    private static b$_i$_b \u00f6\u00d40000() {
        return new b$_i$_b();
    }

    public final b$_i$_b \u00d2\u00d50000() {
        return b$_i$_b.\u00f6\u00d40000().super(this.\u00f8\u00d40000());
    }

    public final b$_i O\u00d50000() {
        return b$_i.\u00d3\u00d60000();
    }

    public final b$_i superString() {
        b$_i b$_i = this.\u00f8\u00d40000();
        if (!b$_i.\u00d200000()) {
            throw b$_i$_b.super(b$_i);
        }
        return b$_i;
    }

    public final b$_i \u00f8\u00d40000() {
        b$_i b$_i = new b$_i(this, null);
        int n2 = this.\u00d8\u00d20000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_i.super(b$_i, this.nullnew);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_i.\u00d400000(b$_i, this.Stringnew);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_i.\u00d300000(b$_i, this.\u00d3\u00d20000);
        if ((n2 & 8) == 8) {
            n3 |= 8;
        }
        b$_i.super(b$_i, this.\u00d6\u00d20000);
        if ((n2 & 0x10) == 16) {
            n3 |= 0x10;
        }
        b$_i.\u00d200000(b$_i, this.\u00d5\u00d20000);
        b$_i.super(b$_i, n3);
        return b$_i;
    }

    public final b$_i$_b super(b$_i b$_i) {
        if (b$_i == b$_i.\u00d3\u00d60000()) {
            return this;
        }
        if (b$_i.\u00d6\u00d50000()) {
            this.class(b$_i.doString());
        }
        if (b$_i.\u00d4\u00d50000()) {
            this.\u00f600000(b$_i.\u00d3\u00d50000());
        }
        if (b$_i.\u00d6\u00d60000()) {
            this.class(b$_i.\u00d4\u00d60000());
        }
        if (b$_i.\u00d2\u00d60000()) {
            this.int(b$_i.\u00f4\u00d50000());
        }
        if (b$_i.O\u00d60000()) {
            this.\u00d800000(b$_i.interfaceString());
        }
        b$_i$_b b$_i$_b = this;
        b$_i$_b.super(b$_i$_b.class().o00000(b$_i.\u00d300000(b$_i)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return true;
    }

    public final b$_i$_b class(ab object, s s2) throws IOException {
        b$_i b$_i = null;
        try {
            b$_i = (b$_i)b$_i.\u00f5\u00d20000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_i = (b$_i)g2.o00000();
            throw object;
        }
        finally {
            if (b$_i != null) {
                this.super(b$_i);
            }
        }
        return this;
    }

    public final b$_i$_b \u00d400000(b$_h b$_h) {
        if (b$_h == null) {
            throw new NullPointerException();
        }
        this.nullnew = b$_h;
        this.\u00d8\u00d20000 |= 1;
        return this;
    }

    public final b$_i$_b class(b$_h b$_h) {
        this.nullnew = (this.\u00d8\u00d20000 & 1) == 1 && this.nullnew != b$_h.\u00f6\u00d30000() ? b$_h.\u00d200000(this.nullnew).super(b$_h).interfacenew() : b$_h;
        this.\u00d8\u00d20000 |= 1;
        return this;
    }

    public final b$_i$_b \u00d600000(b$_f b$_f) {
        if (b$_f == null) {
            throw new NullPointerException();
        }
        this.Stringnew = b$_f;
        this.\u00d8\u00d20000 |= 2;
        return this;
    }

    public final b$_i$_b \u00f600000(b$_f b$_f) {
        this.Stringnew = (this.\u00d8\u00d20000 & 2) == 2 && this.Stringnew != b$_f.\u00d8\u00d20000() ? b$_f.\u00d200000(this.Stringnew).super(b$_f).\u00d4\u00d20000() : b$_f;
        this.\u00d8\u00d20000 |= 2;
        return this;
    }

    public final b$_i$_b \u00f400000(b$_f b$_f) {
        if (b$_f == null) {
            throw new NullPointerException();
        }
        this.\u00d3\u00d20000 = b$_f;
        this.\u00d8\u00d20000 |= 4;
        return this;
    }

    public final b$_i$_b class(b$_f b$_f) {
        this.\u00d3\u00d20000 = (this.\u00d8\u00d20000 & 4) == 4 && this.\u00d3\u00d20000 != b$_f.\u00d8\u00d20000() ? b$_f.\u00d200000(this.\u00d3\u00d20000).super(b$_f).\u00d4\u00d20000() : b$_f;
        this.\u00d8\u00d20000 |= 4;
        return this;
    }

    public final b$_i$_b \u00d400000(b$_f b$_f) {
        if (b$_f == null) {
            throw new NullPointerException();
        }
        this.\u00d6\u00d20000 = b$_f;
        this.\u00d8\u00d20000 |= 8;
        return this;
    }

    public final b$_i$_b int(b$_f b$_f) {
        this.\u00d6\u00d20000 = (this.\u00d8\u00d20000 & 8) == 8 && this.\u00d6\u00d20000 != b$_f.\u00d8\u00d20000() ? b$_f.\u00d200000(this.\u00d6\u00d20000).super(b$_f).\u00d4\u00d20000() : b$_f;
        this.\u00d8\u00d20000 |= 8;
        return this;
    }

    public final b$_i$_b \u00f800000(b$_f b$_f) {
        if (b$_f == null) {
            throw new NullPointerException();
        }
        this.\u00d5\u00d20000 = b$_f;
        this.\u00d8\u00d20000 |= 0x10;
        return this;
    }

    public final b$_i$_b \u00d800000(b$_f b$_f) {
        this.\u00d5\u00d20000 = (this.\u00d8\u00d20000 & 0x10) == 16 && this.\u00d5\u00d20000 != b$_f.\u00d8\u00d20000() ? b$_f.\u00d200000(this.\u00d5\u00d20000).super(b$_f).\u00d4\u00d20000() : b$_f;
        this.\u00d8\u00d20000 |= 0x10;
        return this;
    }

    static /* synthetic */ b$_i$_b publicObject() {
        return b$_i$_b.\u00f6\u00d40000();
    }
}

