/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$1;
import b.t.c.b.b.l.c.b$_f$1;
import b.t.c.b.b.l.c.b$_f$_b;
import b.t.c.b.b.l.c.b$_g;
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
public final class b$_f
extends d
implements b$_g {
    private static final b$_f newsuper;
    private final b \u00f5O0000;
    public static c \u00d3o0000;
    private int oo0000;
    private int returnsuper;
    private int \u00f6O0000;
    private byte \u00f8O0000 = (byte)-1;
    private int \u00d2o0000 = -1;

    private b$_f(d$_f d$_f) {
        super(d$_f);
        this.\u00f5O0000 = d$_f.class();
    }

    private b$_f(boolean bl) {
        this.\u00f5O0000 = b.o00000;
    }

    public static b$_f \u00d8\u00d20000() {
        return newsuper;
    }

    public final b$_f \u00f6\u00d20000() {
        return newsuper;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_f(ab ab2, s s2) throws g {
        this.\u00f4\u00d20000();
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
                        this.oo0000 |= 1;
                        this.returnsuper = ab2.\u00d3o0000();
                        continue block18;
                    }
                    case 16: 
                }
                this.oo0000 |= 2;
                this.\u00f6O0000 = ab2.\u00d3o0000();
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
                    this.\u00f5O0000 = b$_b.\u00d300000();
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
            this.\u00f5O0000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d3o0000;
    }

    public final boolean \u00d2\u00d30000() {
        return (this.oo0000 & 1) == 1;
    }

    public final int \u00f8\u00d20000() {
        return this.returnsuper;
    }

    public final boolean \u00d6\u00d20000() {
        return (this.oo0000 & 2) == 2;
    }

    public final int classnew() {
        return this.\u00f6O0000;
    }

    private void \u00f4\u00d20000() {
        this.returnsuper = 0;
        this.\u00f6O0000 = 0;
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00f8O0000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.\u00f8O0000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.oo0000 & 1) == 1) {
            h2.return(1, this.returnsuper);
        }
        if ((this.oo0000 & 2) == 2) {
            h2.return(2, this.\u00f6O0000);
        }
        h2.\u00d300000(this.\u00f5O0000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d2o0000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.oo0000 & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.returnsuper);
        }
        if ((this.oo0000 & 2) == 2) {
            n2 += h.\u00d500000(2, this.\u00f6O0000);
        }
        this.\u00d2o0000 = n2 += this.\u00f5O0000.\u00f400000();
        return n2;
    }

    public static b$_f$_b O\u00d30000() {
        return b$_f$_b.\u00f8o0000();
    }

    public final b$_f$_b intnew() {
        return b$_f.O\u00d30000();
    }

    public static b$_f$_b \u00d200000(b$_f b$_f) {
        return b$_f.O\u00d30000().super(b$_f);
    }

    public final b$_f$_b donew() {
        return b$_f.\u00d200000(this);
    }

    /* synthetic */ b$_f(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_f(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int super(b$_f b$_f, int n2) {
        b$_f.returnsuper = n2;
        return b$_f.returnsuper;
    }

    static /* synthetic */ int \u00d300000(b$_f b$_f, int n2) {
        b$_f.\u00f6O0000 = n2;
        return b$_f.\u00f6O0000;
    }

    static /* synthetic */ int \u00d200000(b$_f b$_f, int n2) {
        b$_f.oo0000 = n2;
        return b$_f.oo0000;
    }

    static /* synthetic */ b \u00d300000(b$_f b$_f) {
        return b$_f.\u00f5O0000;
    }

    static {
        \u00d3o0000 = new b$_f$1();
        newsuper = new b$_f(true);
        newsuper.\u00f4\u00d20000();
    }
}

