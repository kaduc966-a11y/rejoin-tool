/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_m;
import b.t.c.b.b.l.b$_m$_b;
import b.t.c.b.b.l.b$_m$_d;
import b.t.c.b.b.l.b$_s;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_m$_c
extends d$_f
implements b$_s {
    private int whileObject;
    private int \u00f6\u00d40000;
    private int ifObject;
    private b$_m$_b \u00d8\u00d40000 = b$_m$_b.\u00d8O0000;
    private int \u00d6\u00d40000;
    private int \u00d5\u00d40000;
    private b$_m$_d \u00f5\u00d40000 = b$_m$_d.\u00d3o0000;

    private b$_m$_c() {
        this.\u00f8\u00d80000();
    }

    private void \u00f8\u00d80000() {
    }

    private static b$_m$_c \u00d3\u00f40000() {
        return new b$_m$_c();
    }

    public final b$_m$_c superreturn() {
        return b$_m$_c.\u00d3\u00f40000().super(this.\u00d4\u00f40000());
    }

    public final b$_m \u00d2\u00f40000() {
        return b$_m.\u00f6\u00f50000();
    }

    public final b$_m O\u00f40000() {
        b$_m b$_m = this.\u00d4\u00f40000();
        if (!b$_m.\u00d200000()) {
            throw b$_m$_c.super(b$_m);
        }
        return b$_m;
    }

    public final b$_m \u00d4\u00f40000() {
        b$_m b$_m = new b$_m(this, null);
        int n2 = this.whileObject;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_m.\u00d200000(b$_m, this.\u00f6\u00d40000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_m.class(b$_m, this.ifObject);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_m.super(b$_m, this.\u00d8\u00d40000);
        if ((n2 & 8) == 8) {
            n3 |= 8;
        }
        b$_m.\u00d400000(b$_m, this.\u00d6\u00d40000);
        if ((n2 & 0x10) == 16) {
            n3 |= 0x10;
        }
        b$_m.\u00d300000(b$_m, this.\u00d5\u00d40000);
        if ((n2 & 0x20) == 32) {
            n3 |= 0x20;
        }
        b$_m.super(b$_m, this.\u00f5\u00d40000);
        b$_m.super(b$_m, n3);
        return b$_m;
    }

    public final b$_m$_c super(b$_m b$_m) {
        if (b$_m == b$_m.\u00f6\u00f50000()) {
            return this;
        }
        if (b$_m.O\u00f50000()) {
            this.\u00f400000(b$_m.doreturn());
        }
        if (b$_m.\u00d6\u00f40000()) {
            this.\u00d600000(b$_m.intreturn());
        }
        if (b$_m.\u00d4\u00f50000()) {
            this.super(b$_m.\u00d6\u00f50000());
        }
        if (b$_m.\u00f4\u00f40000()) {
            this.\u00d800000(b$_m.\u00f6\u00f40000());
        }
        if (b$_m.Objectvoid()) {
            this.class(b$_m.\u00d2\u00f50000());
        }
        if (b$_m.\u00f8\u00f40000()) {
            this.super(b$_m.\u00d8\u00f40000());
        }
        b$_m$_c b$_m$_c = this;
        b$_m$_c.super(b$_m$_c.class().o00000(b$_m.\u00d200000(b$_m)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return true;
    }

    public final b$_m$_c \u00d800000(ab object, s s2) throws IOException {
        b$_m b$_m = null;
        try {
            b$_m = (b$_m)b$_m.\u00f8\u00d40000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_m = (b$_m)g2.o00000();
            throw object;
        }
        finally {
            if (b$_m != null) {
                this.super(b$_m);
            }
        }
        return this;
    }

    public final b$_m$_c \u00f400000(int n2) {
        this.whileObject |= 1;
        this.\u00f6\u00d40000 = n2;
        return this;
    }

    public final b$_m$_c \u00d600000(int n2) {
        this.whileObject |= 2;
        this.ifObject = n2;
        return this;
    }

    public final b$_m$_c super(b$_m$_b b$_m$_b) {
        if (b$_m$_b == null) {
            throw new NullPointerException();
        }
        this.whileObject |= 4;
        this.\u00d8\u00d40000 = b$_m$_b;
        return this;
    }

    public final b$_m$_c \u00d800000(int n2) {
        this.whileObject |= 8;
        this.\u00d6\u00d40000 = n2;
        return this;
    }

    public final b$_m$_c class(int n2) {
        this.whileObject |= 0x10;
        this.\u00d5\u00d40000 = n2;
        return this;
    }

    public final b$_m$_c super(b$_m$_d b$_m$_d) {
        if (b$_m$_d == null) {
            throw new NullPointerException();
        }
        this.whileObject |= 0x20;
        this.\u00f5\u00d40000 = b$_m$_d;
        return this;
    }

    static /* synthetic */ b$_m$_c classreturn() {
        return b$_m$_c.\u00d3\u00f40000();
    }
}

