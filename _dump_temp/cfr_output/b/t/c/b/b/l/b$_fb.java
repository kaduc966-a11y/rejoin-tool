/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_fb$1;
import b.t.c.b.b.l.b$_fb$_b;
import b.t.c.b.b.l.b$_l;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.o;
import b.t.c.b.b.p.q;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.u;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_fb
extends d
implements b$_l {
    private static final b$_fb ifint;
    private final b \u00d5OO000;
    public static c \u00f5OO000;
    private q whileint;
    private byte \u00d6OO000 = (byte)-1;
    private int \u00d8OO000 = -1;

    private b$_fb(d$_f d$_f) {
        super(d$_f);
        this.\u00d5OO000 = d$_f.class();
    }

    private b$_fb(boolean bl) {
        this.\u00d5OO000 = b.o00000;
    }

    public static b$_fb O\u00f6O000() {
        return ifint;
    }

    public final b$_fb \u00d8\u00f5O000() {
        return ifint;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_fb(ab ab2, s s2) throws g {
        this.\u00f6\u00f5O000();
        boolean bl = false;
        b$_b b$_b = b.\u00d600000();
        h h2 = h.o00000(b$_b, 1);
        try {
            boolean bl2 = false;
            block17: while (!bl2) {
                int n2 = ab2.oo0000();
                switch (n2) {
                    case 0: {
                        bl2 = true;
                        continue block17;
                    }
                    default: {
                        if (this.super(ab2, h2, s2, n2)) continue block17;
                        bl2 = true;
                        continue block17;
                    }
                    case 10: 
                }
                b b2 = ab2.\u00d300000();
                if (!(bl & true)) {
                    this.whileint = new u();
                    bl |= true;
                }
                this.whileint.super(b2);
            }
            if (bl & true) {
                this.whileint = this.whileint.\u00d200000();
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
                if (bl & true) {
                    this.whileint = this.whileint.\u00d200000();
                }
                try {
                    h2.new();
                }
                catch (IOException iOException) {
                }
                finally {
                    this.\u00d5OO000 = b$_b.\u00d300000();
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
            this.\u00d5OO000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f5OO000;
    }

    public final o \u00f8\u00f5O000() {
        return this.whileint;
    }

    public final String voidsuper(int n2) {
        return (String)this.whileint.get(n2);
    }

    private void \u00f6\u00f5O000() {
        this.whileint = u.new;
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00d6OO000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.\u00d6OO000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        for (int i2 = 0; i2 < this.whileint.size(); ++i2) {
            h2.o00000(1, this.whileint.super(i2));
        }
        h2.\u00d300000(this.\u00d5OO000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d8OO000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.whileint.size(); ++i2) {
            n2 += h.new(this.whileint.super(i2));
        }
        this.\u00d8OO000 = n2 = 0 + n2 + 1 * this.\u00f8\u00f5O000().size() + this.\u00d5OO000.\u00f400000();
        return n2;
    }

    public static b$_fb$_b \u00f4\u00f5O000() {
        return b$_fb$_b.floatpublic();
    }

    public final b$_fb$_b \u00d6\u00f5O000() {
        return b$_fb.\u00f4\u00f5O000();
    }

    public static b$_fb$_b \u00d400000(b$_fb b$_fb) {
        return b$_fb.\u00f4\u00f5O000().super(b$_fb);
    }

    public final b$_fb$_b publicpublic() {
        return b$_fb.\u00d400000(this);
    }

    /* synthetic */ b$_fb(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_fb(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ q super(b$_fb b$_fb, q q2) {
        b$_fb.whileint = q2;
        return b$_fb.whileint;
    }

    static /* synthetic */ q \u00d300000(b$_fb b$_fb) {
        return b$_fb.whileint;
    }

    static /* synthetic */ b \u00d200000(b$_fb b$_fb) {
        return b$_fb.\u00d5OO000;
    }

    static {
        \u00f5OO000 = new b$_fb$1();
        ifint = new b$_fb(true);
        ifint.\u00f6\u00f5O000();
    }
}

