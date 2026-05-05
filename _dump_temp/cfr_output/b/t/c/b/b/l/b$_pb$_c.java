/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_pb$_b;
import b.t.c.b.b.l.b$_pb$_c$1;
import b.t.c.b.b.l.b$_pb$_c$_b;
import b.t.c.b.b.l.b$_pb$_c$_c;
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
public final class b$_pb$_c
extends d
implements b$_pb$_b {
    private static final b$_pb$_c \u00d3\u00d5O000;
    private final b \u00d5\u00d5O000;
    public static c \u00f8\u00d4O000;
    private int o\u00d5O000;
    private int \u00d8\u00d5O000;
    private int forfor;
    private b$_pb$_c$_b \u00d6\u00d5O000;
    private byte privatefor = (byte)-1;
    private int \u00d2\u00d5O000 = -1;

    private b$_pb$_c(d$_f d$_f) {
        super(d$_f);
        this.\u00d5\u00d5O000 = d$_f.class();
    }

    private b$_pb$_c(boolean bl) {
        this.\u00d5\u00d5O000 = b.o00000;
    }

    public static b$_pb$_c \u00d3\u00d4o000() {
        return \u00d3\u00d5O000;
    }

    public final b$_pb$_c \u00d4\u00d4o000() {
        return \u00d3\u00d5O000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_pb$_c(ab ab2, s s2) throws g {
        this.\u00d6\u00d4o000();
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
                        this.o\u00d5O000 |= 1;
                        this.\u00d8\u00d5O000 = ab2.\u00d3o0000();
                        continue block19;
                    }
                    case 16: {
                        this.o\u00d5O000 |= 2;
                        this.forfor = ab2.\u00d3o0000();
                        continue block19;
                    }
                    case 24: 
                }
                int n3 = ab2.\u00f6O0000();
                b$_pb$_c$_b b$_pb$_c$_b = b$_pb$_c$_b.\u00d3O0000(n3);
                if (b$_pb$_c$_b == null) {
                    h2.oO0000(n2);
                    h2.oO0000(n3);
                    continue;
                }
                this.o\u00d5O000 |= 4;
                this.\u00d6\u00d5O000 = b$_pb$_c$_b;
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
                    this.\u00d5\u00d5O000 = b$_b.\u00d300000();
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
            this.\u00d5\u00d5O000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f8\u00d4O000;
    }

    public final boolean \u00d8\u00d4o000() {
        return (this.o\u00d5O000 & 1) == 1;
    }

    public final int \u00d2\u00d4o000() {
        return this.\u00d8\u00d5O000;
    }

    public final boolean ObjectObjectsuper() {
        return (this.o\u00d5O000 & 2) == 2;
    }

    public final int \u00f4\u00d4o000() {
        return this.forfor;
    }

    public final boolean \u00f8\u00d3o000() {
        return (this.o\u00d5O000 & 4) == 4;
    }

    public final b$_pb$_c$_b interfacenewsuper() {
        return this.\u00d6\u00d5O000;
    }

    private void \u00d6\u00d4o000() {
        this.\u00d8\u00d5O000 = -1;
        this.forfor = 0;
        this.\u00d6\u00d5O000 = b$_pb$_c$_b.o\u00f40000;
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.privatefor;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.ObjectObjectsuper()) {
            this.privatefor = 0;
            return false;
        }
        this.privatefor = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.o\u00d5O000 & 1) == 1) {
            h2.return(1, this.\u00d8\u00d5O000);
        }
        if ((this.o\u00d5O000 & 2) == 2) {
            h2.return(2, this.forfor);
        }
        if ((this.o\u00d5O000 & 4) == 4) {
            h2.new(3, this.\u00d6\u00d5O000.super());
        }
        h2.\u00d300000(this.\u00d5\u00d5O000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d2\u00d5O000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.o\u00d5O000 & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.\u00d8\u00d5O000);
        }
        if ((this.o\u00d5O000 & 2) == 2) {
            n2 += h.\u00d500000(2, this.forfor);
        }
        if ((this.o\u00d5O000 & 4) == 4) {
            n2 += h.o00000(3, this.\u00d6\u00d5O000.super());
        }
        this.\u00d2\u00d5O000 = n2 += this.\u00d5\u00d5O000.\u00f400000();
        return n2;
    }

    public static b$_pb$_c$_c O\u00d4o000() {
        return b$_pb$_c$_c.\u00d2\u00d3o000();
    }

    public final b$_pb$_c$_c donewsuper() {
        return b$_pb$_c.O\u00d4o000();
    }

    public static b$_pb$_c$_c \u00d300000(b$_pb$_c b$_pb$_c) {
        return b$_pb$_c.O\u00d4o000().super(b$_pb$_c);
    }

    public final b$_pb$_c$_c \u00f6\u00d3o000() {
        return b$_pb$_c.\u00d300000(this);
    }

    /* synthetic */ b$_pb$_c(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_pb$_c(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int super(b$_pb$_c b$_pb$_c, int n2) {
        b$_pb$_c.\u00d8\u00d5O000 = n2;
        return b$_pb$_c.\u00d8\u00d5O000;
    }

    static /* synthetic */ int \u00d200000(b$_pb$_c b$_pb$_c, int n2) {
        b$_pb$_c.forfor = n2;
        return b$_pb$_c.forfor;
    }

    static /* synthetic */ b$_pb$_c$_b super(b$_pb$_c b$_pb$_c, b$_pb$_c$_b b$_pb$_c$_b) {
        b$_pb$_c.\u00d6\u00d5O000 = b$_pb$_c$_b;
        return b$_pb$_c.\u00d6\u00d5O000;
    }

    static /* synthetic */ int \u00d300000(b$_pb$_c b$_pb$_c, int n2) {
        b$_pb$_c.o\u00d5O000 = n2;
        return b$_pb$_c.o\u00d5O000;
    }

    static /* synthetic */ b \u00d200000(b$_pb$_c b$_pb$_c) {
        return b$_pb$_c.\u00d5\u00d5O000;
    }

    static {
        \u00f8\u00d4O000 = new b$_pb$_c$1();
        \u00d3\u00d5O000 = new b$_pb$_c(true);
        \u00d3\u00d5O000.\u00d6\u00d4o000();
    }
}

