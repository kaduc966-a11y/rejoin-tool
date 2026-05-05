/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_b;
import b.t.c.b.b.l.b$_nb$_c$1;
import b.t.c.b.b.l.b$_nb$_c$_b;
import b.t.c.b.b.l.b$_nb$_c$_c;
import b.t.c.b.b.l.b$_nb$_d;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_nb$_c
extends d
implements b$_nb$_b {
    private static final b$_nb$_c o\u00d4O000;
    private final b \u00d3\u00d4O000;
    public static c \u00f6\u00d3O000;
    private int \u00f8\u00d3O000;
    private b$_nb$_c$_b \u00d5\u00d4O000;
    private b$_nb Stringfor;
    private int \u00d6\u00d4O000;
    private byte \u00d2\u00d4O000 = (byte)-1;
    private int thisfor = -1;

    private b$_nb$_c(d$_f d$_f) {
        super(d$_f);
        this.\u00d3\u00d4O000 = d$_f.class();
    }

    private b$_nb$_c(boolean bl) {
        this.\u00d3\u00d4O000 = b.o00000;
    }

    public static b$_nb$_c \u00f6\u00d2o000() {
        return o\u00d4O000;
    }

    public final b$_nb$_c \u00d3\u00d2o000() {
        return o\u00d4O000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_nb$_c(ab ab2, s s2) throws g {
        this.\u00d6\u00d2o000();
        b$_b b$_b = b.\u00d600000();
        h h2 = h.o00000(b$_b, 1);
        try {
            boolean bl = false;
            block19: while (!bl) {
                int n2 = ab2.oo0000();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block19;
                    }
                    default: {
                        if (this.super(ab2, h2, s2, n2)) continue block19;
                        bl = true;
                        continue block19;
                    }
                    case 8: {
                        int n3 = ab2.\u00f6O0000();
                        b$_nb$_c$_b b$_nb$_c$_b = b$_nb$_c$_b.\u00d2O0000(n3);
                        if (b$_nb$_c$_b == null) {
                            h2.oO0000(n2);
                            h2.oO0000(n3);
                            continue block19;
                        }
                        this.\u00f8\u00d3O000 |= 1;
                        this.\u00d5\u00d4O000 = b$_nb$_c$_b;
                        continue block19;
                    }
                    case 18: {
                        b$_nb$_d b$_nb$_d = null;
                        if ((this.\u00f8\u00d3O000 & 2) == 2) {
                            b$_nb$_d = this.Stringfor.\u00f4O\u00d4000();
                        }
                        this.Stringfor = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                        if (b$_nb$_d != null) {
                            b$_nb$_d.\u00d3O0000(this.Stringfor);
                            this.Stringfor = b$_nb$_d.\u00f60\u00d4000();
                        }
                        this.\u00f8\u00d3O000 |= 2;
                        continue block19;
                    }
                    case 24: 
                }
                this.\u00f8\u00d3O000 |= 4;
                this.\u00d6\u00d4O000 = ab2.\u00d3o0000();
            }
        }
        catch (g g2) {
            try {
                throw g2.o00000(this);
                catch (IOException iOException) {
                    throw new g(iOException.getMessage()).o00000(this);
                }
            }
            catch (Throwable throwable) {
                try {
                    h2.new();
                }
                catch (IOException iOException) {
                }
                finally {
                    this.\u00d3\u00d4O000 = b$_b.\u00d300000();
                }
                this.\u00d2O0000();
                throw throwable;
            }
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d3\u00d4O000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f6\u00d3O000;
    }

    public final boolean floatsupersuper() {
        return (this.\u00f8\u00d3O000 & 1) == 1;
    }

    public final b$_nb$_c$_b \u00d8\u00d2o000() {
        return this.\u00d5\u00d4O000;
    }

    public final boolean O\u00d3o000() {
        return (this.\u00f8\u00d3O000 & 2) == 2;
    }

    public final b$_nb publicsupersuper() {
        return this.Stringfor;
    }

    public final boolean \u00d4\u00d2o000() {
        return (this.\u00f8\u00d3O000 & 4) == 4;
    }

    public final int \u00d2\u00d2o000() {
        return this.\u00d6\u00d4O000;
    }

    private void \u00d6\u00d2o000() {
        this.\u00d5\u00d4O000 = b$_nb$_c$_b.\u00f4\u00d80000;
        this.Stringfor = b$_nb.\u00d2o\u00d4000();
        this.\u00d6\u00d4O000 = 0;
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00d2\u00d4O000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (this.O\u00d3o000() && !this.publicsupersuper().\u00d200000()) {
            this.\u00d2\u00d4O000 = 0;
            return false;
        }
        this.\u00d2\u00d4O000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.\u00f8\u00d3O000 & 1) == 1) {
            h2.new(1, this.\u00d5\u00d4O000.super());
        }
        if ((this.\u00f8\u00d3O000 & 2) == 2) {
            h2.\u00d300000(2, this.Stringfor);
        }
        if ((this.\u00f8\u00d3O000 & 4) == 4) {
            h2.return(3, this.\u00d6\u00d4O000);
        }
        h2.\u00d300000(this.\u00d3\u00d4O000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.thisfor;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.\u00f8\u00d3O000 & 1) == 1) {
            n2 = 0 + h.o00000(1, this.\u00d5\u00d4O000.super());
        }
        if ((this.\u00f8\u00d3O000 & 2) == 2) {
            n2 += h.o00000(2, this.Stringfor);
        }
        if ((this.\u00f8\u00d3O000 & 4) == 4) {
            n2 += h.\u00d500000(3, this.\u00d6\u00d4O000);
        }
        this.thisfor = n2 += this.\u00d3\u00d4O000.\u00f400000();
        return n2;
    }

    public static b$_nb$_c$_c \u00f4\u00d2o000() {
        return b$_nb$_c$_c.\u00f8oo000();
    }

    public final b$_nb$_c$_c supernewsuper() {
        return b$_nb$_c.\u00f4\u00d2o000();
    }

    public static b$_nb$_c$_c \u00d200000(b$_nb$_c b$_nb$_c) {
        return b$_nb$_c.\u00f4\u00d2o000().super(b$_nb$_c);
    }

    public final b$_nb$_c$_c \u00f8\u00d2o000() {
        return b$_nb$_c.\u00d200000(this);
    }

    /* synthetic */ b$_nb$_c(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_nb$_c(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ b$_nb$_c$_b super(b$_nb$_c b$_nb$_c, b$_nb$_c$_b b$_nb$_c$_b) {
        b$_nb$_c.\u00d5\u00d4O000 = b$_nb$_c$_b;
        return b$_nb$_c.\u00d5\u00d4O000;
    }

    static /* synthetic */ b$_nb super(b$_nb$_c b$_nb$_c, b$_nb b$_nb) {
        b$_nb$_c.Stringfor = b$_nb;
        return b$_nb$_c.Stringfor;
    }

    static /* synthetic */ int \u00d200000(b$_nb$_c b$_nb$_c, int n2) {
        b$_nb$_c.\u00d6\u00d4O000 = n2;
        return b$_nb$_c.\u00d6\u00d4O000;
    }

    static /* synthetic */ int super(b$_nb$_c b$_nb$_c, int n2) {
        b$_nb$_c.\u00f8\u00d3O000 = n2;
        return b$_nb$_c.\u00f8\u00d3O000;
    }

    static /* synthetic */ b \u00d300000(b$_nb$_c b$_nb$_c) {
        return b$_nb$_c.\u00d3\u00d4O000;
    }

    static {
        \u00f6\u00d3O000 = new b$_nb$_c$1();
        o\u00d4O000 = new b$_nb$_c(true);
        o\u00d4O000.\u00d6\u00d2o000();
    }
}

