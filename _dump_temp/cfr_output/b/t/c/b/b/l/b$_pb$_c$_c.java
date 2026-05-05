/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_pb$_b;
import b.t.c.b.b.l.b$_pb$_c;
import b.t.c.b.b.l.b$_pb$_c$_b;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_pb$_c$_c
extends d$_f
implements b$_pb$_b {
    private int \u00f6\u00d4O000;
    private int \u00f5\u00d4O000 = -1;
    private int nullfor;
    private b$_pb$_c$_b \u00d8\u00d4O000 = b$_pb$_c$_b.o\u00f40000;

    private b$_pb$_c$_c() {
        this.\u00d3\u00d3o000();
    }

    private void \u00d3\u00d3o000() {
    }

    private static b$_pb$_c$_c \u00f4\u00d3o000() {
        return new b$_pb$_c$_c();
    }

    public final b$_pb$_c$_c \u00d6\u00d3o000() {
        return b$_pb$_c$_c.\u00f4\u00d3o000().super(this.classnewsuper());
    }

    public final b$_pb$_c \u00d4\u00d3o000() {
        return b$_pb$_c.\u00d3\u00d4o000();
    }

    public final b$_pb$_c \u00d8\u00d3o000() {
        b$_pb$_c b$_pb$_c = this.classnewsuper();
        if (!b$_pb$_c.\u00d200000()) {
            throw b$_pb$_c$_c.super(b$_pb$_c);
        }
        return b$_pb$_c;
    }

    public final b$_pb$_c classnewsuper() {
        b$_pb$_c b$_pb$_c = new b$_pb$_c(this, null);
        int n2 = this.\u00f6\u00d4O000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_pb$_c.super(b$_pb$_c, this.\u00f5\u00d4O000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_pb$_c.\u00d200000(b$_pb$_c, this.nullfor);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_pb$_c.super(b$_pb$_c, this.\u00d8\u00d4O000);
        b$_pb$_c.\u00d300000(b$_pb$_c, n3);
        return b$_pb$_c;
    }

    public final b$_pb$_c$_c super(b$_pb$_c b$_pb$_c) {
        if (b$_pb$_c == b$_pb$_c.\u00d3\u00d4o000()) {
            return this;
        }
        if (b$_pb$_c.\u00d8\u00d4o000()) {
            this.\u00d2\u00d20000(b$_pb$_c.\u00d2\u00d4o000());
        }
        if (b$_pb$_c.ObjectObjectsuper()) {
            this.supernew(b$_pb$_c.\u00f4\u00d4o000());
        }
        if (b$_pb$_c.\u00f8\u00d3o000()) {
            this.super(b$_pb$_c.interfacenewsuper());
        }
        b$_pb$_c$_c b$_pb$_c$_c = this;
        b$_pb$_c$_c.super(b$_pb$_c$_c.class().o00000(b$_pb$_c.\u00d200000(b$_pb$_c)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return this.intnewsuper();
    }

    public final b$_pb$_c$_c \u00d6O0000(ab object, s s2) throws IOException {
        b$_pb$_c b$_pb$_c = null;
        try {
            b$_pb$_c = (b$_pb$_c)b$_pb$_c.\u00f8\u00d4O000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_pb$_c = (b$_pb$_c)g2.o00000();
            throw object;
        }
        finally {
            if (b$_pb$_c != null) {
                this.super(b$_pb$_c);
            }
        }
        return this;
    }

    public final b$_pb$_c$_c \u00d2\u00d20000(int n2) {
        this.\u00f6\u00d4O000 |= 1;
        this.\u00f5\u00d4O000 = n2;
        return this;
    }

    public final boolean intnewsuper() {
        return (this.\u00f6\u00d4O000 & 2) == 2;
    }

    public final b$_pb$_c$_c supernew(int n2) {
        this.\u00f6\u00d4O000 |= 2;
        this.nullfor = n2;
        return this;
    }

    public final b$_pb$_c$_c super(b$_pb$_c$_b b$_pb$_c$_b) {
        if (b$_pb$_c$_b == null) {
            throw new NullPointerException();
        }
        this.\u00f6\u00d4O000 |= 4;
        this.\u00d8\u00d4O000 = b$_pb$_c$_b;
        return this;
    }

    static /* synthetic */ b$_pb$_c$_c \u00d2\u00d3o000() {
        return b$_pb$_c$_c.\u00f4\u00d3o000();
    }
}

