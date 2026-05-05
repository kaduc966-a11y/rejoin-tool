/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_f$1;
import b.t.c.b.b.l.b$_f$_b;
import b.t.c.b.b.l.b$_ub;
import b.t.c.b.b.l.b$_y;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_f
extends d$_c
implements b$_ub {
    private static final b$_f \u00d3\u00d2o000;
    private final b \u00d6\u00d2o000;
    public static c returnsupersuper;
    private int o\u00d2o000;
    private int \u00f6\u00d2o000;
    private List \u00f5\u00d2o000;
    private List ifsupersuper;
    private List whilesupersuper;
    private List \u00d8\u00d2o000;
    private byte \u00d5\u00d2o000;
    private int \u00d2\u00d2o000;

    private b$_f(d$_g d$_g) {
        super(d$_g);
        this.\u00d5\u00d2o000 = (byte)-1;
        this.\u00d2\u00d2o000 = -1;
        this.\u00d6\u00d2o000 = d$_g.class();
    }

    private b$_f(boolean bl) {
        this.\u00d5\u00d2o000 = (byte)-1;
        this.\u00d2\u00d2o000 = -1;
        this.\u00d6\u00d2o000 = b.o00000;
    }

    public static b$_f \u00d8\u00d8\u00d2000() {
        return \u00d3\u00d2o000;
    }

    public final b$_f O\u00f4\u00d2000() {
        return \u00d3\u00d2o000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_f(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        int n2;
        block36: {
            this.\u00d5\u00d2o000 = (byte)-1;
            this.\u00d2\u00d2o000 = -1;
            this.\u00d3\u00f4\u00d2000();
            n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block22: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block22;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block22;
                            bl = true;
                            continue block22;
                        }
                        case 8: {
                            this.o\u00d2o000 |= 1;
                            this.\u00f6\u00d2o000 = ab2.\u00d3o0000();
                            continue block22;
                        }
                        case 18: {
                            if ((n2 & 2) != 2) {
                                this.\u00f5\u00d2o000 = new ArrayList();
                                n2 |= 2;
                            }
                            this.\u00f5\u00d2o000.add(ab2.o00000(b$_c.Stringwhile, s2));
                            continue block22;
                        }
                        case 26: {
                            if ((n2 & 0x10) != 16) {
                                this.\u00d8\u00d2o000 = new ArrayList();
                                n2 |= 0x10;
                            }
                            this.\u00d8\u00d2o000.add(ab2.o00000(b$_db.oOO000, s2));
                            continue block22;
                        }
                        case 248: {
                            if ((n2 & 4) != 4) {
                                this.ifsupersuper = new ArrayList();
                                n2 |= 4;
                            }
                            this.ifsupersuper.add(ab2.\u00d3o0000());
                            continue block22;
                        }
                        case 250: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 4) != 4 && ab2.newsuper() > 0) {
                                this.ifsupersuper = new ArrayList();
                                n2 |= 4;
                            }
                            while (ab2.newsuper() > 0) {
                                this.ifsupersuper.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block22;
                        }
                        case 258: 
                    }
                    if ((n2 & 8) != 8) {
                        this.whilesupersuper = new ArrayList();
                        n2 |= 8;
                    }
                    this.whilesupersuper.add(ab2.o00000(b$_y.\u00d2\u00f40000, s2));
                }
                if ((n2 & 2) != 2) break block36;
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
                        this.\u00f5\u00d2o000 = Collections.unmodifiableList(this.\u00f5\u00d2o000);
                    }
                    if ((n2 & 0x10) == 16) {
                        this.\u00d8\u00d2o000 = Collections.unmodifiableList(this.\u00d8\u00d2o000);
                    }
                    if ((n2 & 4) == 4) {
                        this.ifsupersuper = Collections.unmodifiableList(this.ifsupersuper);
                    }
                    if ((n2 & 8) == 8) {
                        this.whilesupersuper = Collections.unmodifiableList(this.whilesupersuper);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00d6\u00d2o000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f5\u00d2o000 = Collections.unmodifiableList(this.\u00f5\u00d2o000);
        }
        if ((n2 & 0x10) == 16) {
            this.\u00d8\u00d2o000 = Collections.unmodifiableList(this.\u00d8\u00d2o000);
        }
        if ((n2 & 4) == 4) {
            this.ifsupersuper = Collections.unmodifiableList(this.ifsupersuper);
        }
        if ((n2 & 8) == 8) {
            this.whilesupersuper = Collections.unmodifiableList(this.whilesupersuper);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d6\u00d2o000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return returnsupersuper;
    }

    public final boolean \u00f4\u00d8\u00d2000() {
        return (this.o\u00d2o000 & 1) == 1;
    }

    public final int \u00d6\u00d8\u00d2000() {
        return this.\u00f6\u00d2o000;
    }

    public final List floatdosuper() {
        return this.\u00f5\u00d2o000;
    }

    public final int \u00d4\u00d8\u00d2000() {
        return this.\u00f5\u00d2o000.size();
    }

    public final b$_c \u00d6\u00d50000(int n2) {
        return (b$_c)this.\u00f5\u00d2o000.get(n2);
    }

    public final List \u00d3\u00d8\u00d2000() {
        return this.ifsupersuper;
    }

    public final int \u00f6\u00d8\u00d2000() {
        return this.whilesupersuper.size();
    }

    public final b$_y \u00d8\u00d50000(int n2) {
        return (b$_y)this.whilesupersuper.get(n2);
    }

    public final List \u00f8\u00d8\u00d2000() {
        return this.\u00d8\u00d2o000;
    }

    public final int \u00d2\u00f4\u00d2000() {
        return this.\u00d8\u00d2o000.size();
    }

    public final b$_db \u00f4\u00d50000(int n2) {
        return (b$_db)this.\u00d8\u00d2o000.get(n2);
    }

    private void \u00d3\u00f4\u00d2000() {
        this.\u00f6\u00d2o000 = 6;
        this.\u00f5\u00d2o000 = Collections.emptyList();
        this.ifsupersuper = Collections.emptyList();
        this.whilesupersuper = Collections.emptyList();
        this.\u00d8\u00d2o000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00d5\u00d2o000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00d4\u00d8\u00d2000(); ++n2) {
            if (this.\u00d6\u00d50000(n2).\u00d200000()) continue;
            this.\u00d5\u00d2o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f6\u00d8\u00d2000(); ++n2) {
            if (this.\u00d8\u00d50000(n2).\u00d200000()) continue;
            this.\u00d5\u00d2o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d2\u00f4\u00d2000(); ++n2) {
            if (this.\u00f4\u00d50000(n2).\u00d200000()) continue;
            this.\u00d5\u00d2o000 = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.\u00d5\u00d2o000 = 0;
            return false;
        }
        this.\u00d5\u00d2o000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.o\u00d2o000 & 1) == 1) {
            h2.return(1, this.\u00f6\u00d2o000);
        }
        for (n2 = 0; n2 < this.\u00f5\u00d2o000.size(); ++n2) {
            h2.\u00d300000(2, (v)this.\u00f5\u00d2o000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d8\u00d2o000.size(); ++n2) {
            h2.\u00d300000(3, (v)this.\u00d8\u00d2o000.get(n2));
        }
        for (n2 = 0; n2 < this.ifsupersuper.size(); ++n2) {
            h2.return(31, (Integer)this.ifsupersuper.get(n2));
        }
        for (n2 = 0; n2 < this.whilesupersuper.size(); ++n2) {
            h2.\u00d300000(32, (v)this.whilesupersuper.get(n2));
        }
        d$_c$_b.o00000(19000, h2);
        h2.\u00d300000(this.\u00d6\u00d2o000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.\u00d2\u00d2o000;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        if ((this.o\u00d2o000 & 1) == 1) {
            n3 = 0 + h.\u00d500000(1, this.\u00f6\u00d2o000);
        }
        for (n2 = 0; n2 < this.\u00f5\u00d2o000.size(); ++n2) {
            n3 += h.o00000(2, (v)this.\u00f5\u00d2o000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d8\u00d2o000.size(); ++n2) {
            n3 += h.o00000(3, (v)this.\u00d8\u00d2o000.get(n2));
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.ifsupersuper.size(); ++i2) {
            n2 += h.\u00f500000((Integer)this.ifsupersuper.get(i2));
        }
        n3 = n3 + n2 + 2 * this.\u00d3\u00d8\u00d2000().size();
        for (n2 = 0; n2 < this.whilesupersuper.size(); ++n2) {
            n3 += h.o00000(32, (v)this.whilesupersuper.get(n2));
        }
        this.\u00d2\u00d2o000 = n3 = n3 + this.\u00d6\u00d6o000() + this.\u00d6\u00d2o000.\u00f400000();
        return n3;
    }

    public static b$_f$_b publicdosuper() {
        return b$_f$_b.\u00d4\u00d6\u00d2000();
    }

    public final b$_f$_b \u00d4\u00f4\u00d2000() {
        return b$_f.publicdosuper();
    }

    public static b$_f$_b class(b$_f b$_f) {
        return b$_f.publicdosuper().super(b$_f);
    }

    public final b$_f$_b superwhilesuper() {
        return b$_f.class(this);
    }

    /* synthetic */ b$_f(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_f(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ int \u00d200000(b$_f b$_f, int n2) {
        b$_f.\u00f6\u00d2o000 = n2;
        return b$_f.\u00f6\u00d2o000;
    }

    static /* synthetic */ List \u00d400000(b$_f b$_f, List list) {
        b$_f.\u00f5\u00d2o000 = list;
        return b$_f.\u00f5\u00d2o000;
    }

    static /* synthetic */ List \u00d300000(b$_f b$_f, List list) {
        b$_f.ifsupersuper = list;
        return b$_f.ifsupersuper;
    }

    static /* synthetic */ List super(b$_f b$_f, List list) {
        b$_f.whilesupersuper = list;
        return b$_f.whilesupersuper;
    }

    static /* synthetic */ List \u00d200000(b$_f b$_f, List list) {
        b$_f.\u00d8\u00d2o000 = list;
        return b$_f.\u00d8\u00d2o000;
    }

    static /* synthetic */ int super(b$_f b$_f, int n2) {
        b$_f.o\u00d2o000 = n2;
        return b$_f.o\u00d2o000;
    }

    static /* synthetic */ List \u00d800000(b$_f b$_f) {
        return b$_f.\u00f5\u00d2o000;
    }

    static /* synthetic */ List \u00d400000(b$_f b$_f) {
        return b$_f.ifsupersuper;
    }

    static /* synthetic */ List \u00d300000(b$_f b$_f) {
        return b$_f.whilesupersuper;
    }

    static /* synthetic */ List \u00d600000(b$_f b$_f) {
        return b$_f.\u00d8\u00d2o000;
    }

    static /* synthetic */ b \u00d200000(b$_f b$_f) {
        return b$_f.\u00d6\u00d2o000;
    }

    static {
        returnsupersuper = new b$_f$1();
        \u00d3\u00d2o000 = new b$_f(true);
        \u00d3\u00d2o000.\u00d3\u00f4\u00d2000();
    }
}

