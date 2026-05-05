/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$1;
import b.t.c.b.b.l.c.b$_c;
import b.t.c.b.b.l.c.b$_h$1;
import b.t.c.b.b.l.c.b$_h$_b;
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
public final class b$_h
extends d
implements b$_c {
    private static final b$_h \u00d8o0000;
    private final b whilesuper;
    public static c \u00d2\u00d20000;
    private int thisnew;
    private int \u00f8o0000;
    private int \u00f5o0000;
    private byte \u00f6o0000 = (byte)-1;
    private int o\u00d20000 = -1;

    private b$_h(d$_f d$_f) {
        super(d$_f);
        this.whilesuper = d$_f.class();
    }

    private b$_h(boolean bl) {
        this.whilesuper = b.o00000;
    }

    public static b$_h \u00f6\u00d30000() {
        return \u00d8o0000;
    }

    public final b$_h \u00d3\u00d40000() {
        return \u00d8o0000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_h(ab ab2, s s2) throws g {
        this.\u00d2\u00d40000();
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
                        this.thisnew |= 1;
                        this.\u00f8o0000 = ab2.\u00d3o0000();
                        continue block18;
                    }
                    case 16: 
                }
                this.thisnew |= 2;
                this.\u00f5o0000 = ab2.\u00d3o0000();
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
                    this.whilesuper = b$_b.\u00d300000();
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
            this.whilesuper = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d2\u00d20000;
    }

    public final boolean \u00d8\u00d40000() {
        return (this.thisnew & 1) == 1;
    }

    public final int \u00d4\u00d40000() {
        return this.\u00f8o0000;
    }

    public final boolean O\u00d40000() {
        return (this.thisnew & 2) == 2;
    }

    public final int \u00f8\u00d30000() {
        return this.\u00f5o0000;
    }

    private void \u00d2\u00d40000() {
        this.\u00f8o0000 = 0;
        this.\u00f5o0000 = 0;
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00f6o0000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.\u00f6o0000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.thisnew & 1) == 1) {
            h2.return(1, this.\u00f8o0000);
        }
        if ((this.thisnew & 2) == 2) {
            h2.return(2, this.\u00f5o0000);
        }
        h2.\u00d300000(this.whilesuper);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.o\u00d20000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.thisnew & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.\u00f8o0000);
        }
        if ((this.thisnew & 2) == 2) {
            n2 += h.\u00d500000(2, this.\u00f5o0000);
        }
        this.o\u00d20000 = n2 += this.whilesuper.\u00f400000();
        return n2;
    }

    public static b$_h$_b voidObject() {
        return b$_h$_b.\u00d6\u00d30000();
    }

    public final b$_h$_b floatObject() {
        return b$_h.voidObject();
    }

    public static b$_h$_b \u00d200000(b$_h b$_h) {
        return b$_h.voidObject().super(b$_h);
    }

    public final b$_h$_b \u00d6\u00d40000() {
        return b$_h.\u00d200000(this);
    }

    /* synthetic */ b$_h(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_h(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int \u00d200000(b$_h b$_h, int n2) {
        b$_h.\u00f8o0000 = n2;
        return b$_h.\u00f8o0000;
    }

    static /* synthetic */ int super(b$_h b$_h, int n2) {
        b$_h.\u00f5o0000 = n2;
        return b$_h.\u00f5o0000;
    }

    static /* synthetic */ int \u00d300000(b$_h b$_h, int n2) {
        b$_h.thisnew = n2;
        return b$_h.thisnew;
    }

    static /* synthetic */ b \u00d300000(b$_h b$_h) {
        return b$_h.whilesuper;
    }

    static {
        \u00d2\u00d20000 = new b$_h$1();
        \u00d8o0000 = new b$_h(true);
        \u00d8o0000.\u00d2\u00d40000();
    }
}

