/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_db$_b;
import b.t.c.b.b.l.b$_db$_c$1;
import b.t.c.b.b.l.b$_db$_c$_c;
import b.t.c.b.b.l.b$_db$_c$_c$_c;
import b.t.c.b.b.l.b$_db$_c$_d;
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
public final class b$_db$_c
extends d
implements b$_db$_b {
    private static final b$_db$_c nullnull;
    private final b \u00f6\u00f80000;
    public static c \u00d20O000;
    private int fornull;
    private int \u00f5\u00f80000;
    private b$_db$_c$_c \u00d8\u00f80000;
    private byte \u00f8\u00f80000 = (byte)-1;
    private int o0O000 = -1;

    private b$_db$_c(d$_f d$_f) {
        super(d$_f);
        this.\u00f6\u00f80000 = d$_f.class();
    }

    private b$_db$_c(boolean bl) {
        this.\u00f6\u00f80000 = b.o00000;
    }

    public static b$_db$_c \u00f6\u00d6O000() {
        return nullnull;
    }

    public final b$_db$_c \u00f8\u00d6O000() {
        return nullnull;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_db$_c(ab ab2, s s2) throws g {
        this.publicdo();
        b$_b b$_b = b.\u00d600000();
        h h2 = h.o00000(b$_b, 1);
        try {
            boolean bl = false;
            block18: while (!bl) {
                int n2 = ab2.oo0000();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block18;
                    }
                    default: {
                        if (this.super(ab2, h2, s2, n2)) continue block18;
                        bl = true;
                        continue block18;
                    }
                    case 8: {
                        this.fornull |= 1;
                        this.\u00f5\u00f80000 = ab2.\u00d3o0000();
                        continue block18;
                    }
                    case 18: 
                }
                b$_db$_c$_c$_c b$_db$_c$_c$_c = null;
                if ((this.fornull & 2) == 2) {
                    b$_db$_c$_c$_c = this.\u00d8\u00f80000.dofor();
                }
                this.\u00d8\u00f80000 = (b$_db$_c$_c)ab2.o00000(b$_db$_c$_c.\u00f8\u00f50000, s2);
                if (b$_db$_c$_c$_c != null) {
                    b$_db$_c$_c$_c.super(this.\u00d8\u00f80000);
                    this.\u00d8\u00f80000 = b$_db$_c$_c$_c.\u00d8\u00d2O000();
                }
                this.fornull |= 2;
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
                    this.\u00f6\u00f80000 = b$_b.\u00d300000();
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
            this.\u00f6\u00f80000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d20O000;
    }

    public final boolean superwhile() {
        return (this.fornull & 1) == 1;
    }

    public final int \u00d8\u00d6O000() {
        return this.\u00f5\u00f80000;
    }

    public final boolean \u00d6\u00d6O000() {
        return (this.fornull & 2) == 2;
    }

    public final b$_db$_c$_c \u00f4\u00d6O000() {
        return this.\u00d8\u00f80000;
    }

    private void publicdo() {
        this.\u00f5\u00f80000 = 0;
        this.\u00d8\u00f80000 = b$_db$_c$_c.\u00d4\u00d3O000();
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00f8\u00f80000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.superwhile()) {
            this.\u00f8\u00f80000 = 0;
            return false;
        }
        if (!this.\u00d6\u00d6O000()) {
            this.\u00f8\u00f80000 = 0;
            return false;
        }
        if (!this.\u00f4\u00d6O000().\u00d200000()) {
            this.\u00f8\u00f80000 = 0;
            return false;
        }
        this.\u00f8\u00f80000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.fornull & 1) == 1) {
            h2.return(1, this.\u00f5\u00f80000);
        }
        if ((this.fornull & 2) == 2) {
            h2.\u00d300000(2, this.\u00d8\u00f80000);
        }
        h2.\u00d300000(this.\u00f6\u00f80000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.o0O000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.fornull & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.\u00f5\u00f80000);
        }
        if ((this.fornull & 2) == 2) {
            n2 += h.o00000(2, this.\u00d8\u00f80000);
        }
        this.o0O000 = n2 += this.\u00f6\u00f80000.\u00f400000();
        return n2;
    }

    public static b$_db$_c$_d \u00d4\u00d6O000() {
        return b$_db$_c$_d.O\u00d6O000();
    }

    public final b$_db$_c$_d floatdo() {
        return b$_db$_c.\u00d4\u00d6O000();
    }

    public static b$_db$_c$_d \u00d300000(b$_db$_c b$_db$_c) {
        return b$_db$_c.\u00d4\u00d6O000().super(b$_db$_c);
    }

    public final b$_db$_c$_d O\u00d8O000() {
        return b$_db$_c.\u00d300000(this);
    }

    /* synthetic */ b$_db$_c(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_db$_c(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int super(b$_db$_c b$_db$_c, int n2) {
        b$_db$_c.\u00f5\u00f80000 = n2;
        return b$_db$_c.\u00f5\u00f80000;
    }

    static /* synthetic */ b$_db$_c$_c super(b$_db$_c b$_db$_c, b$_db$_c$_c b$_db$_c$_c) {
        b$_db$_c.\u00d8\u00f80000 = b$_db$_c$_c;
        return b$_db$_c.\u00d8\u00f80000;
    }

    static /* synthetic */ int \u00d200000(b$_db$_c b$_db$_c, int n2) {
        b$_db$_c.fornull = n2;
        return b$_db$_c.fornull;
    }

    static /* synthetic */ b \u00d200000(b$_db$_c b$_db$_c) {
        return b$_db$_c.\u00f6\u00f80000;
    }

    static {
        \u00d20O000 = new b$_db$_c$1();
        nullnull = new b$_db$_c(true);
        nullnull.publicdo();
    }
}

