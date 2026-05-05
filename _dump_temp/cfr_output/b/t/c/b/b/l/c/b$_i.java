/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$1;
import b.t.c.b.b.l.c.b$_d;
import b.t.c.b.b.l.c.b$_f;
import b.t.c.b.b.l.c.b$_f$_b;
import b.t.c.b.b.l.c.b$_h;
import b.t.c.b.b.l.c.b$_h$_b;
import b.t.c.b.b.l.c.b$_i$1;
import b.t.c.b.b.l.c.b$_i$_b;
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
public final class b$_i
extends d
implements b$_d {
    private static final b$_i o\u00d30000;
    private final b \u00d3\u00d30000;
    public static c \u00f5\u00d20000;
    private int \u00f6\u00d20000;
    private b$_h privatenew;
    private b$_f \u00d6\u00d30000;
    private b$_f \u00d8\u00d30000;
    private b$_f \u00f8\u00d20000;
    private b$_f \u00d5\u00d30000;
    private byte \u00d2\u00d30000 = (byte)-1;
    private int fornew = -1;

    private b$_i(d$_f d$_f) {
        super(d$_f);
        this.\u00d3\u00d30000 = d$_f.class();
    }

    private b$_i(boolean bl) {
        this.\u00d3\u00d30000 = b.o00000;
    }

    public static b$_i \u00d3\u00d60000() {
        return o\u00d30000;
    }

    public final b$_i \u00f6\u00d50000() {
        return o\u00d30000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_i(ab ab2, s s2) throws g {
        this.\u00f8\u00d50000();
        b$_b b$_b = b.\u00d600000();
        h h2 = h.o00000(b$_b, 1);
        try {
            boolean bl = false;
            block21: while (!bl) {
                int n2 = ab2.oo0000();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block21;
                    }
                    default: {
                        if (this.super(ab2, h2, s2, n2)) continue block21;
                        bl = true;
                        continue block21;
                    }
                    case 10: {
                        b$_h$_b b$_h$_b = null;
                        if ((this.\u00f6\u00d20000 & 1) == 1) {
                            b$_h$_b = this.privatenew.\u00d6\u00d40000();
                        }
                        this.privatenew = (b$_h)ab2.o00000(b$_h.\u00d2\u00d20000, s2);
                        if (b$_h$_b != null) {
                            b$_h$_b.super(this.privatenew);
                            this.privatenew = b$_h$_b.interfacenew();
                        }
                        this.\u00f6\u00d20000 |= 1;
                        continue block21;
                    }
                    case 18: {
                        b$_f$_b b$_f$_b = null;
                        if ((this.\u00f6\u00d20000 & 2) == 2) {
                            b$_f$_b = this.\u00d6\u00d30000.donew();
                        }
                        this.\u00d6\u00d30000 = (b$_f)ab2.o00000(b$_f.\u00d3o0000, s2);
                        if (b$_f$_b != null) {
                            b$_f$_b.super(this.\u00d6\u00d30000);
                            this.\u00d6\u00d30000 = b$_f$_b.\u00d4\u00d20000();
                        }
                        this.\u00f6\u00d20000 |= 2;
                        continue block21;
                    }
                    case 26: {
                        b$_f$_b b$_f$_b = null;
                        if ((this.\u00f6\u00d20000 & 4) == 4) {
                            b$_f$_b = this.\u00d8\u00d30000.donew();
                        }
                        this.\u00d8\u00d30000 = (b$_f)ab2.o00000(b$_f.\u00d3o0000, s2);
                        if (b$_f$_b != null) {
                            b$_f$_b.super(this.\u00d8\u00d30000);
                            this.\u00d8\u00d30000 = b$_f$_b.\u00d4\u00d20000();
                        }
                        this.\u00f6\u00d20000 |= 4;
                        continue block21;
                    }
                    case 34: {
                        b$_f$_b b$_f$_b = null;
                        if ((this.\u00f6\u00d20000 & 8) == 8) {
                            b$_f$_b = this.\u00f8\u00d20000.donew();
                        }
                        this.\u00f8\u00d20000 = (b$_f)ab2.o00000(b$_f.\u00d3o0000, s2);
                        if (b$_f$_b != null) {
                            b$_f$_b.super(this.\u00f8\u00d20000);
                            this.\u00f8\u00d20000 = b$_f$_b.\u00d4\u00d20000();
                        }
                        this.\u00f6\u00d20000 |= 8;
                        continue block21;
                    }
                    case 42: 
                }
                b$_f$_b b$_f$_b = null;
                if ((this.\u00f6\u00d20000 & 0x10) == 16) {
                    b$_f$_b = this.\u00d5\u00d30000.donew();
                }
                this.\u00d5\u00d30000 = (b$_f)ab2.o00000(b$_f.\u00d3o0000, s2);
                if (b$_f$_b != null) {
                    b$_f$_b.super(this.\u00d5\u00d30000);
                    this.\u00d5\u00d30000 = b$_f$_b.\u00d4\u00d20000();
                }
                this.\u00f6\u00d20000 |= 0x10;
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
                    this.\u00d3\u00d30000 = b$_b.\u00d300000();
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
            this.\u00d3\u00d30000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f5\u00d20000;
    }

    public final boolean \u00d6\u00d50000() {
        return (this.\u00f6\u00d20000 & 1) == 1;
    }

    public final b$_h doString() {
        return this.privatenew;
    }

    public final boolean \u00d4\u00d50000() {
        return (this.\u00f6\u00d20000 & 2) == 2;
    }

    public final b$_f \u00d3\u00d50000() {
        return this.\u00d6\u00d30000;
    }

    public final boolean \u00d6\u00d60000() {
        return (this.\u00f6\u00d20000 & 4) == 4;
    }

    public final b$_f \u00d4\u00d60000() {
        return this.\u00d8\u00d30000;
    }

    public final boolean \u00d2\u00d60000() {
        return (this.\u00f6\u00d20000 & 8) == 8;
    }

    public final b$_f \u00f4\u00d50000() {
        return this.\u00f8\u00d20000;
    }

    public final boolean O\u00d60000() {
        return (this.\u00f6\u00d20000 & 0x10) == 16;
    }

    public final b$_f interfaceString() {
        return this.\u00d5\u00d30000;
    }

    private void \u00f8\u00d50000() {
        this.privatenew = b$_h.\u00f6\u00d30000();
        this.\u00d6\u00d30000 = b$_f.\u00d8\u00d20000();
        this.\u00d8\u00d30000 = b$_f.\u00d8\u00d20000();
        this.\u00f8\u00d20000 = b$_f.\u00d8\u00d20000();
        this.\u00d5\u00d30000 = b$_f.\u00d8\u00d20000();
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00d2\u00d30000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.\u00d2\u00d30000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.\u00f6\u00d20000 & 1) == 1) {
            h2.\u00d300000(1, this.privatenew);
        }
        if ((this.\u00f6\u00d20000 & 2) == 2) {
            h2.\u00d300000(2, this.\u00d6\u00d30000);
        }
        if ((this.\u00f6\u00d20000 & 4) == 4) {
            h2.\u00d300000(3, this.\u00d8\u00d30000);
        }
        if ((this.\u00f6\u00d20000 & 8) == 8) {
            h2.\u00d300000(4, this.\u00f8\u00d20000);
        }
        if ((this.\u00f6\u00d20000 & 0x10) == 16) {
            h2.\u00d300000(5, this.\u00d5\u00d30000);
        }
        h2.\u00d300000(this.\u00d3\u00d30000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.fornew;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.\u00f6\u00d20000 & 1) == 1) {
            n2 = 0 + h.o00000(1, this.privatenew);
        }
        if ((this.\u00f6\u00d20000 & 2) == 2) {
            n2 += h.o00000(2, this.\u00d6\u00d30000);
        }
        if ((this.\u00f6\u00d20000 & 4) == 4) {
            n2 += h.o00000(3, this.\u00d8\u00d30000);
        }
        if ((this.\u00f6\u00d20000 & 8) == 8) {
            n2 += h.o00000(4, this.\u00f8\u00d20000);
        }
        if ((this.\u00f6\u00d20000 & 0x10) == 16) {
            n2 += h.o00000(5, this.\u00d5\u00d30000);
        }
        this.fornew = n2 += this.\u00d3\u00d30000.\u00f400000();
        return n2;
    }

    public static b$_i$_b intString() {
        return b$_i$_b.publicObject();
    }

    public final b$_i$_b classString() {
        return b$_i.intString();
    }

    public static b$_i$_b \u00d200000(b$_i b$_i) {
        return b$_i.intString().super(b$_i);
    }

    public final b$_i$_b \u00d8\u00d50000() {
        return b$_i.\u00d200000(this);
    }

    /* synthetic */ b$_i(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_i(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ b$_h super(b$_i b$_i, b$_h b$_h) {
        b$_i.privatenew = b$_h;
        return b$_i.privatenew;
    }

    static /* synthetic */ b$_f \u00d400000(b$_i b$_i, b$_f b$_f) {
        b$_i.\u00d6\u00d30000 = b$_f;
        return b$_i.\u00d6\u00d30000;
    }

    static /* synthetic */ b$_f \u00d300000(b$_i b$_i, b$_f b$_f) {
        b$_i.\u00d8\u00d30000 = b$_f;
        return b$_i.\u00d8\u00d30000;
    }

    static /* synthetic */ b$_f super(b$_i b$_i, b$_f b$_f) {
        b$_i.\u00f8\u00d20000 = b$_f;
        return b$_i.\u00f8\u00d20000;
    }

    static /* synthetic */ b$_f \u00d200000(b$_i b$_i, b$_f b$_f) {
        b$_i.\u00d5\u00d30000 = b$_f;
        return b$_i.\u00d5\u00d30000;
    }

    static /* synthetic */ int super(b$_i b$_i, int n2) {
        b$_i.\u00f6\u00d20000 = n2;
        return b$_i.\u00f6\u00d20000;
    }

    static /* synthetic */ b \u00d300000(b$_i b$_i) {
        return b$_i.\u00d3\u00d30000;
    }

    static {
        \u00f5\u00d20000 = new b$_i$1();
        o\u00d30000 = new b$_i(true);
        o\u00d30000.\u00f8\u00d50000();
    }
}

