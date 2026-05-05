/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_jb;
import b.t.c.b.b.l.b$_kb;
import b.t.c.b.b.l.b$_o;
import b.t.c.b.b.l.b$_o$_b;
import b.t.c.b.b.l.b$_o$_c;
import b.t.c.b.b.l.b$_o$_e;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_o$_d
extends d$_f
implements b$_jb {
    private int privateString;
    private b$_o$_e forString = b$_o$_e.\u00f4\u00d20000;
    private List \u00f8\u00d50000 = Collections.emptyList();
    private b$_kb \u00d2\u00d60000 = b$_kb.\u00d20o000();
    private b$_o$_c o\u00d60000 = b$_o$_c.\u00d4\u00d20000;
    private b$_o$_b \u00d3\u00d60000 = b$_o$_b.\u00f5o0000;

    private b$_o$_d() {
        this.O\u00f60000();
    }

    private void O\u00f60000() {
    }

    private static b$_o$_d \u00f4\u00f60000() {
        return new b$_o$_d();
    }

    public final b$_o$_d publicvoid() {
        return b$_o$_d.\u00f4\u00f60000().super(this.\u00d8\u00f60000());
    }

    public final b$_o \u00f6\u00f60000() {
        return b$_o.donull();
    }

    public final b$_o \u00d4\u00f60000() {
        b$_o b$_o = this.\u00d8\u00f60000();
        if (!b$_o.\u00d200000()) {
            throw b$_o$_d.super(b$_o);
        }
        return b$_o;
    }

    public final b$_o \u00d8\u00f60000() {
        b$_o b$_o = new b$_o(this, null);
        int n2 = this.privateString;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_o.super(b$_o, this.forString);
        if ((this.privateString & 2) == 2) {
            this.\u00f8\u00d50000 = Collections.unmodifiableList(this.\u00f8\u00d50000);
            this.privateString &= 0xFFFFFFFD;
        }
        b$_o.super(b$_o, this.\u00f8\u00d50000);
        if ((n2 & 4) == 4) {
            n3 |= 2;
        }
        b$_o.super(b$_o, this.\u00d2\u00d60000);
        if ((n2 & 8) == 8) {
            n3 |= 4;
        }
        b$_o.super(b$_o, this.o\u00d60000);
        if ((n2 & 0x10) == 16) {
            n3 |= 8;
        }
        b$_o.super(b$_o, this.\u00d3\u00d60000);
        b$_o.super(b$_o, n3);
        return b$_o;
    }

    public final b$_o$_d super(b$_o b$_o) {
        if (b$_o == b$_o.donull()) {
            return this;
        }
        if (b$_o.\u00d2\u00f80000()) {
            this.super(b$_o.\u00f6\u00f80000());
        }
        if (!b$_o.\u00d400000(b$_o).isEmpty()) {
            if (this.\u00f8\u00d50000.isEmpty()) {
                this.\u00f8\u00d50000 = b$_o.\u00d400000(b$_o);
                this.privateString &= 0xFFFFFFFD;
            } else {
                this.voidvoid();
                this.\u00f8\u00d50000.addAll(b$_o.\u00d400000(b$_o));
            }
        }
        if (b$_o.classnull()) {
            this.super(b$_o.\u00d4\u00f80000());
        }
        if (b$_o.supernull()) {
            this.super(b$_o.\u00f8\u00f60000());
        }
        if (b$_o.intnull()) {
            this.super(b$_o.O\u00f80000());
        }
        b$_o$_d b$_o$_d = this;
        b$_o$_d.super(b$_o$_d.class().o00000(b$_o.\u00d300000(b$_o)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        for (int i2 = 0; i2 < this.\u00d2\u00f60000(); ++i2) {
            if (this.int(i2).\u00d200000()) continue;
            return false;
        }
        return !this.floatvoid() || this.\u00d3\u00f60000().\u00d200000();
    }

    public final b$_o$_d \u00f400000(ab object, s s2) throws IOException {
        b$_o b$_o = null;
        try {
            b$_o = (b$_o)b$_o.\u00d5\u00d60000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_o = (b$_o)g2.o00000();
            throw object;
        }
        finally {
            if (b$_o != null) {
                this.super(b$_o);
            }
        }
        return this;
    }

    public final b$_o$_d super(b$_o$_e b$_o$_e) {
        if (b$_o$_e == null) {
            throw new NullPointerException();
        }
        this.privateString |= 1;
        this.forString = b$_o$_e;
        return this;
    }

    private void voidvoid() {
        if ((this.privateString & 2) != 2) {
            this.\u00f8\u00d50000 = new ArrayList(this.\u00f8\u00d50000);
            this.privateString |= 2;
        }
    }

    public final int \u00d2\u00f60000() {
        return this.\u00f8\u00d50000.size();
    }

    public final b$_kb int(int n2) {
        return (b$_kb)this.\u00f8\u00d50000.get(n2);
    }

    public final boolean floatvoid() {
        return (this.privateString & 4) == 4;
    }

    public final b$_kb \u00d3\u00f60000() {
        return this.\u00d2\u00d60000;
    }

    public final b$_o$_d super(b$_kb b$_kb) {
        this.\u00d2\u00d60000 = (this.privateString & 4) == 4 && this.\u00d2\u00d60000 != b$_kb.\u00d20o000() ? b$_kb.\u00d300000(this.\u00d2\u00d60000).\u00d200000(b$_kb).\u00d6\u00f6O000() : b$_kb;
        this.privateString |= 4;
        return this;
    }

    public final b$_o$_d super(b$_o$_c b$_o$_c) {
        if (b$_o$_c == null) {
            throw new NullPointerException();
        }
        this.privateString |= 8;
        this.o\u00d60000 = b$_o$_c;
        return this;
    }

    public final b$_o$_d super(b$_o$_b b$_o$_b) {
        if (b$_o$_b == null) {
            throw new NullPointerException();
        }
        this.privateString |= 0x10;
        this.\u00d3\u00d60000 = b$_o$_b;
        return this;
    }

    static /* synthetic */ b$_o$_d \u00d6\u00f60000() {
        return b$_o$_d.\u00f4\u00f60000();
    }
}

