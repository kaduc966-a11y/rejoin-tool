/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_w;
import b.t.c.b.b.l.b$_y$1;
import b.t.c.b.b.l.b$_y$_b;
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
public final class b$_y
extends d
implements b$_w {
    private static final b$_y \u00d8\u00d80000;
    private final b whileclass;
    public static c \u00d2\u00f40000;
    private int \u00f8\u00d80000;
    private int \u00f5\u00d80000;
    private b o\u00f40000;
    private byte \u00f6\u00d80000 = (byte)-1;
    private int thisreturn = -1;

    private b$_y(d$_f d$_f) {
        super(d$_f);
        this.whileclass = d$_f.class();
    }

    private b$_y(boolean bl) {
        this.whileclass = b.o00000;
    }

    public static b$_y publicint() {
        return \u00d8\u00d80000;
    }

    public final b$_y \u00d4OO000() {
        return \u00d8\u00d80000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_y(ab ab2, s s2) throws g {
        this.\u00d8OO000();
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
                        this.\u00f8\u00d80000 |= 1;
                        this.\u00f5\u00d80000 = ab2.\u00d3o0000();
                        continue block18;
                    }
                    case 18: 
                }
                this.\u00f8\u00d80000 |= 2;
                this.o\u00f40000 = ab2.\u00d300000();
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
                    this.whileclass = b$_b.\u00d300000();
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
            this.whileclass = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d2\u00f40000;
    }

    public final boolean \u00d6OO000() {
        return (this.\u00f8\u00d80000 & 1) == 1;
    }

    public final int voidint() {
        return this.\u00f5\u00d80000;
    }

    public final boolean \u00d2OO000() {
        return (this.\u00f8\u00d80000 & 2) == 2;
    }

    public final b OOO000() {
        return this.o\u00f40000;
    }

    private void \u00d8OO000() {
        this.\u00f5\u00d80000 = 0;
        this.o\u00f40000 = b.o00000;
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00f6\u00d80000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.\u00d6OO000()) {
            this.\u00f6\u00d80000 = 0;
            return false;
        }
        if (!this.\u00d2OO000()) {
            this.\u00f6\u00d80000 = 0;
            return false;
        }
        this.\u00f6\u00d80000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.\u00f8\u00d80000 & 1) == 1) {
            h2.return(1, this.\u00f5\u00d80000);
        }
        if ((this.\u00f8\u00d80000 & 2) == 2) {
            h2.o00000(2, this.o\u00f40000);
        }
        h2.\u00d300000(this.whileclass);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.thisreturn;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.\u00f8\u00d80000 & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.\u00f5\u00d80000);
        }
        if ((this.\u00f8\u00d80000 & 2) == 2) {
            n2 += h.new(2, this.o\u00f40000);
        }
        this.thisreturn = n2 += this.whileclass.\u00f400000();
        return n2;
    }

    public static b$_y$_b floatint() {
        return b$_y$_b.\u00f80O000();
    }

    public final b$_y$_b \u00d3OO000() {
        return b$_y.floatint();
    }

    public static b$_y$_b \u00d300000(b$_y b$_y) {
        return b$_y.floatint().super(b$_y);
    }

    public final b$_y$_b \u00f4OO000() {
        return b$_y.\u00d300000(this);
    }

    /* synthetic */ b$_y(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_y(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int \u00d200000(b$_y b$_y, int n2) {
        b$_y.\u00f5\u00d80000 = n2;
        return b$_y.\u00f5\u00d80000;
    }

    static /* synthetic */ b super(b$_y b$_y, b b2) {
        b$_y.o\u00f40000 = b2;
        return b$_y.o\u00f40000;
    }

    static /* synthetic */ int super(b$_y b$_y, int n2) {
        b$_y.\u00f8\u00d80000 = n2;
        return b$_y.\u00f8\u00d80000;
    }

    static /* synthetic */ b \u00d200000(b$_y b$_y) {
        return b$_y.whileclass;
    }

    static {
        \u00d2\u00f40000 = new b$_y$1();
        \u00d8\u00d80000 = new b$_y(true);
        \u00d8\u00d80000.\u00d8OO000();
    }
}

