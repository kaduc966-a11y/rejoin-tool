/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_d;
import b.t.c.b.b.l.b$_e$1;
import b.t.c.b.b.l.b$_e$_b;
import b.t.c.b.b.l.b$_fb;
import b.t.c.b.b.l.b$_fb$_b;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.b$_i$_b;
import b.t.c.b.b.l.b$_p;
import b.t.c.b.b.l.b$_pb;
import b.t.c.b.b.l.b$_pb$_d;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d$_c;
import b.t.c.b.b.p.d$_c$_b;
import b.t.c.b.b.p.d$_g;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_e
extends d$_c
implements b$_p {
    private static final b$_e \u00f8Oo000;
    private final b \u00d2oo000;
    public static c nullthissuper;
    private int \u00f5Oo000;
    private b$_fb privatethissuper;
    private b$_pb \u00d5oo000;
    private b$_i \u00d3oo000;
    private List ooo000;
    private byte forthissuper;
    private int \u00f6Oo000;

    private b$_e(d$_g d$_g) {
        super(d$_g);
        this.forthissuper = (byte)-1;
        this.\u00f6Oo000 = -1;
        this.\u00d2oo000 = d$_g.class();
    }

    private b$_e(boolean bl) {
        this.forthissuper = (byte)-1;
        this.\u00f6Oo000 = -1;
        this.\u00d2oo000 = b.o00000;
    }

    public static b$_e O\u00d6\u00d2000() {
        return \u00f8Oo000;
    }

    public final b$_e classforsuper() {
        return \u00f8Oo000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_e(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block29: {
            this.forthissuper = (byte)-1;
            this.\u00f6Oo000 = -1;
            this.\u00d4\u00d5\u00d2000();
            int n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block20: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block20;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block20;
                            bl = true;
                            continue block20;
                        }
                        case 10: {
                            b$_fb$_b b$_fb$_b = null;
                            if ((this.\u00f5Oo000 & 1) == 1) {
                                b$_fb$_b = this.privatethissuper.publicpublic();
                            }
                            this.privatethissuper = (b$_fb)ab2.o00000(b$_fb.\u00f5OO000, s2);
                            if (b$_fb$_b != null) {
                                b$_fb$_b.super(this.privatethissuper);
                                this.privatethissuper = b$_fb$_b.\u00d2\u00f5O000();
                            }
                            this.\u00f5Oo000 |= 1;
                            continue block20;
                        }
                        case 18: {
                            b$_pb$_d b$_pb$_d = null;
                            if ((this.\u00f5Oo000 & 2) == 2) {
                                b$_pb$_d = this.\u00d5oo000.superStringsuper();
                            }
                            this.\u00d5oo000 = (b$_pb)ab2.o00000(b$_pb.\u00d3\u00d6O000, s2);
                            if (b$_pb$_d != null) {
                                b$_pb$_d.super(this.\u00d5oo000);
                                this.\u00d5oo000 = b$_pb$_d.\u00d6\u00d5o000();
                            }
                            this.\u00f5Oo000 |= 2;
                            continue block20;
                        }
                        case 26: {
                            b$_i$_b b$_i$_b = null;
                            if ((this.\u00f5Oo000 & 4) == 4) {
                                b$_i$_b = this.\u00d3oo000.publicpublicsuper();
                            }
                            this.\u00d3oo000 = (b$_i)ab2.o00000(b$_i.\u00d5\u00d3o000, s2);
                            if (b$_i$_b != null) {
                                b$_i$_b.\u00d200000(this.\u00d3oo000);
                                this.\u00d3oo000 = b$_i$_b.interfacewhilesuper();
                            }
                            this.\u00f5Oo000 |= 4;
                            continue block20;
                        }
                        case 34: 
                    }
                    if ((n2 & 8) != 8) {
                        this.ooo000 = new ArrayList();
                        n2 |= 8;
                    }
                    this.ooo000.add(ab2.o00000(b$_d.\u00d80o000, s2));
                }
                if ((n2 & 8) != 8) break block29;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 8) == 8) {
                        this.ooo000 = Collections.unmodifiableList(this.ooo000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00d2oo000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.ooo000 = Collections.unmodifiableList(this.ooo000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d2oo000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return nullthissuper;
    }

    public final boolean \u00d2\u00d5\u00d2000() {
        return (this.\u00f5Oo000 & 1) == 1;
    }

    public final b$_fb \u00d8\u00d5\u00d2000() {
        return this.privatethissuper;
    }

    public final boolean superforsuper() {
        return (this.\u00f5Oo000 & 2) == 2;
    }

    public final b$_pb intforsuper() {
        return this.\u00d5oo000;
    }

    public final boolean O\u00d5\u00d2000() {
        return (this.\u00f5Oo000 & 4) == 4;
    }

    public final b$_i \u00f8\u00d4\u00d2000() {
        return this.\u00d3oo000;
    }

    public final List \u00f8\u00d5\u00d2000() {
        return this.ooo000;
    }

    public final int \u00d6\u00d5\u00d2000() {
        return this.ooo000.size();
    }

    public final b$_d superString(int n2) {
        return (b$_d)this.ooo000.get(n2);
    }

    private void \u00d4\u00d5\u00d2000() {
        this.privatethissuper = b$_fb.O\u00f6O000();
        this.\u00d5oo000 = b$_pb.\u00d8\u00d5o000();
        this.\u00d3oo000 = b$_i.voidpublicsuper();
        this.ooo000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.forthissuper;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (this.superforsuper() && !this.intforsuper().\u00d200000()) {
            this.forthissuper = 0;
            return false;
        }
        if (this.O\u00d5\u00d2000() && !this.\u00f8\u00d4\u00d2000().\u00d200000()) {
            this.forthissuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d6\u00d5\u00d2000(); ++n2) {
            if (this.superString(n2).\u00d200000()) continue;
            this.forthissuper = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.forthissuper = 0;
            return false;
        }
        this.forthissuper = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.\u00f5Oo000 & 1) == 1) {
            h2.\u00d300000(1, this.privatethissuper);
        }
        if ((this.\u00f5Oo000 & 2) == 2) {
            h2.\u00d300000(2, this.\u00d5oo000);
        }
        if ((this.\u00f5Oo000 & 4) == 4) {
            h2.\u00d300000(3, this.\u00d3oo000);
        }
        for (int i2 = 0; i2 < this.ooo000.size(); ++i2) {
            h2.\u00d300000(4, (v)this.ooo000.get(i2));
        }
        d$_c$_b.o00000(200, h2);
        h2.\u00d300000(this.\u00d2oo000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00f6Oo000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.\u00f5Oo000 & 1) == 1) {
            n2 = 0 + h.o00000(1, this.privatethissuper);
        }
        if ((this.\u00f5Oo000 & 2) == 2) {
            n2 += h.o00000(2, this.\u00d5oo000);
        }
        if ((this.\u00f5Oo000 & 4) == 4) {
            n2 += h.o00000(3, this.\u00d3oo000);
        }
        for (int i2 = 0; i2 < this.ooo000.size(); ++i2) {
            n2 += h.o00000(4, (v)this.ooo000.get(i2));
        }
        this.\u00f6Oo000 = n2 = n2 + this.\u00d6\u00d6o000() + this.\u00d2oo000.\u00f400000();
        return n2;
    }

    public static b$_e \u00d200000(InputStream inputStream, s s2) throws IOException {
        return (b$_e)nullthissuper.o00000(inputStream, s2);
    }

    public static b$_e$_b \u00d3\u00d5\u00d2000() {
        return b$_e$_b.\u00f4\u00d4\u00d2000();
    }

    public final b$_e$_b \u00f4\u00d5\u00d2000() {
        return b$_e.\u00d3\u00d5\u00d2000();
    }

    public static b$_e$_b \u00d400000(b$_e b$_e) {
        return b$_e.\u00d3\u00d5\u00d2000().super(b$_e);
    }

    public final b$_e$_b \u00f6\u00d5\u00d2000() {
        return b$_e.\u00d400000(this);
    }

    /* synthetic */ b$_e(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_e(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ b$_fb super(b$_e b$_e, b$_fb b$_fb) {
        b$_e.privatethissuper = b$_fb;
        return b$_e.privatethissuper;
    }

    static /* synthetic */ b$_pb super(b$_e b$_e, b$_pb b$_pb) {
        b$_e.\u00d5oo000 = b$_pb;
        return b$_e.\u00d5oo000;
    }

    static /* synthetic */ b$_i super(b$_e b$_e, b$_i b$_i) {
        b$_e.\u00d3oo000 = b$_i;
        return b$_e.\u00d3oo000;
    }

    static /* synthetic */ List super(b$_e b$_e, List list) {
        b$_e.ooo000 = list;
        return b$_e.ooo000;
    }

    static /* synthetic */ int super(b$_e b$_e, int n2) {
        b$_e.\u00f5Oo000 = n2;
        return b$_e.\u00f5Oo000;
    }

    static /* synthetic */ List \u00d300000(b$_e b$_e) {
        return b$_e.ooo000;
    }

    static /* synthetic */ b \u00d200000(b$_e b$_e) {
        return b$_e.\u00d2oo000;
    }

    static {
        nullthissuper = new b$_e$1();
        \u00f8Oo000 = new b$_e(true);
        \u00f8Oo000.\u00d4\u00d5\u00d2000();
    }
}

