/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_jb;
import b.t.c.b.b.l.b$_kb;
import b.t.c.b.b.l.b$_kb$_c;
import b.t.c.b.b.l.b$_o$1;
import b.t.c.b.b.l.b$_o$_b;
import b.t.c.b.b.l.b$_o$_c;
import b.t.c.b.b.l.b$_o$_d;
import b.t.c.b.b.l.b$_o$_e;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_o
extends d
implements b$_jb {
    private static final b$_o newclass;
    private final b \u00f8\u00d60000;
    public static c \u00d5\u00d60000;
    private int \u00d6\u00d60000;
    private b$_o$_e \u00d3\u00d80000;
    private List \u00d2\u00d80000;
    private b$_kb returnclass;
    private b$_o$_c o\u00d80000;
    private b$_o$_b \u00f5\u00d60000;
    private byte \u00f6\u00d60000;
    private int \u00d8\u00d60000;

    private b$_o(d$_f d$_f) {
        super(d$_f);
        this.\u00f6\u00d60000 = (byte)-1;
        this.\u00d8\u00d60000 = -1;
        this.\u00f8\u00d60000 = d$_f.class();
    }

    private b$_o(boolean bl) {
        this.\u00f6\u00d60000 = (byte)-1;
        this.\u00d8\u00d60000 = -1;
        this.\u00f8\u00d60000 = b.o00000;
    }

    public static b$_o donull() {
        return newclass;
    }

    public final b$_o \u00d20O000() {
        return newclass;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_o(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block29: {
            this.\u00f6\u00d60000 = (byte)-1;
            this.\u00d8\u00d60000 = -1;
            this.\u00d6\u00f80000();
            int n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block21: while (!bl) {
                    Enum enum_;
                    int n3;
                    int n4 = ab2.oo0000();
                    switch (n4) {
                        case 0: {
                            bl = true;
                            continue block21;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n4)) continue block21;
                            bl = true;
                            continue block21;
                        }
                        case 8: {
                            n3 = ab2.\u00f6O0000();
                            enum_ = b$_o$_e.\u00d800000(n3);
                            if (enum_ == null) {
                                h2.oO0000(n4);
                                h2.oO0000(n3);
                                continue block21;
                            }
                            this.\u00d6\u00d60000 |= 1;
                            this.\u00d3\u00d80000 = enum_;
                            continue block21;
                        }
                        case 18: {
                            if ((n2 & 2) != 2) {
                                this.\u00d2\u00d80000 = new ArrayList();
                                n2 |= 2;
                            }
                            this.\u00d2\u00d80000.add(ab2.o00000(b$_kb.\u00d6oO000, s2));
                            continue block21;
                        }
                        case 26: {
                            b$_kb$_c b$_kb$_c = null;
                            if ((this.\u00d6\u00d60000 & 2) == 2) {
                                b$_kb$_c = this.returnclass.\u00d80o000();
                            }
                            this.returnclass = (b$_kb)ab2.o00000(b$_kb.\u00d6oO000, s2);
                            if (b$_kb$_c != null) {
                                b$_kb$_c.\u00d200000(this.returnclass);
                                this.returnclass = b$_kb$_c.\u00d6\u00f6O000();
                            }
                            this.\u00d6\u00d60000 |= 2;
                            continue block21;
                        }
                        case 32: {
                            n3 = ab2.\u00f6O0000();
                            enum_ = b$_o$_c.\u00d600000(n3);
                            if (enum_ == null) {
                                h2.oO0000(n4);
                                h2.oO0000(n3);
                                continue block21;
                            }
                            this.\u00d6\u00d60000 |= 4;
                            this.o\u00d80000 = enum_;
                            continue block21;
                        }
                        case 40: 
                    }
                    n3 = ab2.\u00f6O0000();
                    enum_ = b$_o$_b.class(n3);
                    if (enum_ == null) {
                        h2.oO0000(n4);
                        h2.oO0000(n3);
                        continue;
                    }
                    this.\u00d6\u00d60000 |= 8;
                    this.\u00f5\u00d60000 = enum_;
                }
                if ((n2 & 2) != 2) break block29;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 2) == 2) {
                        this.\u00d2\u00d80000 = Collections.unmodifiableList(this.\u00d2\u00d80000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00f8\u00d60000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00d2\u00d80000 = Collections.unmodifiableList(this.\u00d2\u00d80000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00f8\u00d60000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d5\u00d60000;
    }

    public final boolean \u00d2\u00f80000() {
        return (this.\u00d6\u00d60000 & 1) == 1;
    }

    public final b$_o$_e \u00f6\u00f80000() {
        return this.\u00d3\u00d80000;
    }

    public final List \u00d8\u00f80000() {
        return this.\u00d2\u00d80000;
    }

    public final int \u00d3\u00f80000() {
        return this.\u00d2\u00d80000.size();
    }

    public final b$_kb \u00f600000(int n2) {
        return (b$_kb)this.\u00d2\u00d80000.get(n2);
    }

    public final boolean classnull() {
        return (this.\u00d6\u00d60000 & 2) == 2;
    }

    public final b$_kb \u00d4\u00f80000() {
        return this.returnclass;
    }

    public final boolean supernull() {
        return (this.\u00d6\u00d60000 & 4) == 4;
    }

    public final b$_o$_c \u00f8\u00f60000() {
        return this.o\u00d80000;
    }

    public final boolean intnull() {
        return (this.\u00d6\u00d60000 & 8) == 8;
    }

    public final b$_o$_b O\u00f80000() {
        return this.\u00f5\u00d60000;
    }

    private void \u00d6\u00f80000() {
        this.\u00d3\u00d80000 = b$_o$_e.\u00f4\u00d20000;
        this.\u00d2\u00d80000 = Collections.emptyList();
        this.returnclass = b$_kb.\u00d20o000();
        this.o\u00d80000 = b$_o$_c.\u00d4\u00d20000;
        this.\u00f5\u00d60000 = b$_o$_b.\u00f5o0000;
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00f6\u00d60000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00f80000(); ++n2) {
            if (this.\u00f600000(n2).\u00d200000()) continue;
            this.\u00f6\u00d60000 = 0;
            return false;
        }
        if (this.classnull() && !this.\u00d4\u00f80000().\u00d200000()) {
            this.\u00f6\u00d60000 = 0;
            return false;
        }
        this.\u00f6\u00d60000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.\u00d6\u00d60000 & 1) == 1) {
            h2.new(1, this.\u00d3\u00d80000.super());
        }
        for (int i2 = 0; i2 < this.\u00d2\u00d80000.size(); ++i2) {
            h2.\u00d300000(2, (v)this.\u00d2\u00d80000.get(i2));
        }
        if ((this.\u00d6\u00d60000 & 2) == 2) {
            h2.\u00d300000(3, this.returnclass);
        }
        if ((this.\u00d6\u00d60000 & 4) == 4) {
            h2.new(4, this.o\u00d80000.super());
        }
        if ((this.\u00d6\u00d60000 & 8) == 8) {
            h2.new(5, this.\u00f5\u00d60000.super());
        }
        h2.\u00d300000(this.\u00f8\u00d60000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d8\u00d60000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.\u00d6\u00d60000 & 1) == 1) {
            n2 = 0 + h.o00000(1, this.\u00d3\u00d80000.super());
        }
        for (int i2 = 0; i2 < this.\u00d2\u00d80000.size(); ++i2) {
            n2 += h.o00000(2, (v)this.\u00d2\u00d80000.get(i2));
        }
        if ((this.\u00d6\u00d60000 & 2) == 2) {
            n2 += h.o00000(3, this.returnclass);
        }
        if ((this.\u00d6\u00d60000 & 4) == 4) {
            n2 += h.o00000(4, this.o\u00d80000.super());
        }
        if ((this.\u00d6\u00d60000 & 8) == 8) {
            n2 += h.o00000(5, this.\u00f5\u00d60000.super());
        }
        this.\u00d8\u00d60000 = n2 += this.\u00f8\u00d60000.\u00f400000();
        return n2;
    }

    public static b$_o$_d \u00f8\u00f80000() {
        return b$_o$_d.\u00d6\u00f60000();
    }

    public final b$_o$_d \u00f4\u00f80000() {
        return b$_o.\u00f8\u00f80000();
    }

    public static b$_o$_d \u00d200000(b$_o b$_o) {
        return b$_o.\u00f8\u00f80000().super(b$_o);
    }

    public final b$_o$_d O0O000() {
        return b$_o.\u00d200000(this);
    }

    /* synthetic */ b$_o(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_o(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ b$_o$_e super(b$_o b$_o, b$_o$_e b$_o$_e) {
        b$_o.\u00d3\u00d80000 = b$_o$_e;
        return b$_o.\u00d3\u00d80000;
    }

    static /* synthetic */ List super(b$_o b$_o, List list) {
        b$_o.\u00d2\u00d80000 = list;
        return b$_o.\u00d2\u00d80000;
    }

    static /* synthetic */ b$_kb super(b$_o b$_o, b$_kb b$_kb) {
        b$_o.returnclass = b$_kb;
        return b$_o.returnclass;
    }

    static /* synthetic */ b$_o$_c super(b$_o b$_o, b$_o$_c b$_o$_c) {
        b$_o.o\u00d80000 = b$_o$_c;
        return b$_o.o\u00d80000;
    }

    static /* synthetic */ b$_o$_b super(b$_o b$_o, b$_o$_b b$_o$_b) {
        b$_o.\u00f5\u00d60000 = b$_o$_b;
        return b$_o.\u00f5\u00d60000;
    }

    static /* synthetic */ int super(b$_o b$_o, int n2) {
        b$_o.\u00d6\u00d60000 = n2;
        return b$_o.\u00d6\u00d60000;
    }

    static /* synthetic */ List \u00d400000(b$_o b$_o) {
        return b$_o.\u00d2\u00d80000;
    }

    static /* synthetic */ b \u00d300000(b$_o b$_o) {
        return b$_o.\u00f8\u00d60000;
    }

    static {
        \u00d5\u00d60000 = new b$_o$1();
        newclass = new b$_o(true);
        newclass.\u00d6\u00f80000();
    }
}

