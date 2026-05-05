/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$1;
import b.t.c.b.b.l.c.b$_b$1;
import b.t.c.b.b.l.c.b$_b$_b;
import b.t.c.b.b.l.c.b$_b$_d;
import b.t.c.b.b.l.c.b$_e;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d;
import b.t.c.b.b.p.d$_f;
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
public final class b$_b
extends d
implements b$_e {
    private static final b$_b \u00f6\u00d8\u00d2000;
    private final b o\u00f4\u00d2000;
    public static c Stringwhilesuper;
    private List \u00f5\u00d8\u00d2000;
    private List \u00f8\u00d8\u00d2000;
    private int thiswhilesuper;
    private byte \u00d2\u00f4\u00d2000;
    private int \u00d3\u00f4\u00d2000;

    private b$_b(d$_f d$_f) {
        super(d$_f);
        this.thiswhilesuper = -1;
        this.\u00d2\u00f4\u00d2000 = (byte)-1;
        this.\u00d3\u00f4\u00d2000 = -1;
        this.o\u00f4\u00d2000 = d$_f.class();
    }

    private b$_b(boolean bl) {
        this.thiswhilesuper = -1;
        this.\u00d2\u00f4\u00d2000 = (byte)-1;
        this.\u00d3\u00f4\u00d2000 = -1;
        this.o\u00f4\u00d2000 = b.o00000;
    }

    public static b$_b \u00d4\u00f8\u00d4000() {
        return \u00f6\u00d8\u00d2000;
    }

    public final b$_b \u00f8\u00f6\u00d4000() {
        return \u00f6\u00d8\u00d2000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_b(ab ab2, s s2) throws g {
        h h2;
        b.t.c.b.b.p.b$_b b$_b;
        int n2;
        block27: {
            this.thiswhilesuper = -1;
            this.\u00d2\u00f4\u00d2000 = (byte)-1;
            this.\u00d3\u00f4\u00d2000 = -1;
            this.\u00d3\u00f8\u00d4000();
            n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block19: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block19;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block19;
                            bl = true;
                            continue block19;
                        }
                        case 10: {
                            if ((n2 & 1) != 1) {
                                this.\u00f5\u00d8\u00d2000 = new ArrayList();
                                n2 |= 1;
                            }
                            this.\u00f5\u00d8\u00d2000.add(ab2.o00000(b$_b$_b.\u00d300000, s2));
                            continue block19;
                        }
                        case 40: {
                            if ((n2 & 2) != 2) {
                                this.\u00f8\u00d8\u00d2000 = new ArrayList();
                                n2 |= 2;
                            }
                            this.\u00f8\u00d8\u00d2000.add(ab2.\u00d3o0000());
                            continue block19;
                        }
                        case 42: 
                    }
                    n3 = ab2.\u00f500000();
                    n3 = ab2.\u00d500000(n3);
                    if ((n2 & 2) != 2 && ab2.newsuper() > 0) {
                        this.\u00f8\u00d8\u00d2000 = new ArrayList();
                        n2 |= 2;
                    }
                    while (ab2.newsuper() > 0) {
                        this.\u00f8\u00d8\u00d2000.add(ab2.\u00d3o0000());
                    }
                    ab2.\u00d200000(n3);
                }
                if (!(n2 & true)) break block27;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if (n2 & true) {
                        this.\u00f5\u00d8\u00d2000 = Collections.unmodifiableList(this.\u00f5\u00d8\u00d2000);
                    }
                    if ((n2 & 2) == 2) {
                        this.\u00f8\u00d8\u00d2000 = Collections.unmodifiableList(this.\u00f8\u00d8\u00d2000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.o\u00f4\u00d2000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f5\u00d8\u00d2000 = Collections.unmodifiableList(this.\u00f5\u00d8\u00d2000);
        }
        if ((n2 & 2) == 2) {
            this.\u00f8\u00d8\u00d2000 = Collections.unmodifiableList(this.\u00f8\u00d8\u00d2000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.o\u00f4\u00d2000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return Stringwhilesuper;
    }

    public final List \u00d2\u00f8\u00d4000() {
        return this.\u00f5\u00d8\u00d2000;
    }

    public final List O\u00f8\u00d4000() {
        return this.\u00f8\u00d8\u00d2000;
    }

    private void \u00d3\u00f8\u00d4000() {
        this.\u00f5\u00d8\u00d2000 = Collections.emptyList();
        this.\u00f8\u00d8\u00d2000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        byte by = this.\u00d2\u00f4\u00d2000;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.\u00d2\u00f4\u00d2000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        for (n2 = 0; n2 < this.\u00f5\u00d8\u00d2000.size(); ++n2) {
            h2.\u00d300000(1, (v)this.\u00f5\u00d8\u00d2000.get(n2));
        }
        if (this.O\u00f8\u00d4000().size() > 0) {
            h2.oO0000(42);
            h2.oO0000(this.thiswhilesuper);
        }
        for (n2 = 0; n2 < this.\u00f8\u00d8\u00d2000.size(); ++n2) {
            h2.o00000((Integer)this.\u00f8\u00d8\u00d2000.get(n2));
        }
        h2.\u00d300000(this.o\u00f4\u00d2000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.\u00d3\u00f4\u00d2000;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        for (n2 = 0; n2 < this.\u00f5\u00d8\u00d2000.size(); ++n2) {
            n3 += h.o00000(1, (v)this.\u00f5\u00d8\u00d2000.get(n2));
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.\u00f8\u00d8\u00d2000.size(); ++i2) {
            n2 += h.\u00f500000((Integer)this.\u00f8\u00d8\u00d2000.get(i2));
        }
        n3 += n2;
        if (!this.O\u00f8\u00d4000().isEmpty()) {
            ++n3;
            n3 += h.\u00f500000(n2);
        }
        this.thiswhilesuper = n2;
        this.\u00d3\u00f4\u00d2000 = n3 += this.o\u00f4\u00d2000.\u00f400000();
        return n3;
    }

    public static b$_b \u00d600000(InputStream inputStream, s s2) throws IOException {
        return (b$_b)Stringwhilesuper.new(inputStream, s2);
    }

    public static b$_b$_d \u00f6\u00f6\u00d4000() {
        return b$_b$_d.\u00f6\u00f8\u00d4000();
    }

    public final b$_b$_d floatpublicnew() {
        return b$_b.\u00f6\u00f6\u00d4000();
    }

    public static b$_b$_d super(b$_b b$_b) {
        return b$_b.\u00f6\u00f6\u00d4000().class(b$_b);
    }

    public final b$_b$_d voidpublicnew() {
        return b$_b.super(this);
    }

    /* synthetic */ b$_b(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_b(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ List super(b$_b b$_b, List list) {
        b$_b.\u00f5\u00d8\u00d2000 = list;
        return b$_b.\u00f5\u00d8\u00d2000;
    }

    static /* synthetic */ List \u00d200000(b$_b b$_b, List list) {
        b$_b.\u00f8\u00d8\u00d2000 = list;
        return b$_b.\u00f8\u00d8\u00d2000;
    }

    static /* synthetic */ List \u00d200000(b$_b b$_b) {
        return b$_b.\u00f5\u00d8\u00d2000;
    }

    static /* synthetic */ List \u00d400000(b$_b b$_b) {
        return b$_b.\u00f8\u00d8\u00d2000;
    }

    static /* synthetic */ b \u00d300000(b$_b b$_b) {
        return b$_b.o\u00f4\u00d2000;
    }

    static {
        Stringwhilesuper = new b$_b$1();
        \u00f6\u00d8\u00d2000 = new b$_b(true);
        \u00f6\u00d8\u00d2000.\u00d3\u00f8\u00d4000();
    }
}

