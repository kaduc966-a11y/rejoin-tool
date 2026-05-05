/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_gb;
import b.t.c.b.b.l.b$_mb$1;
import b.t.c.b.b.l.b$_mb$_b;
import b.t.c.b.b.l.b$_nb;
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
public final class b$_mb
extends d
implements b$_gb {
    private static final b$_mb \u00f6\u00d2O000;
    private final b returnfloat;
    public static c \u00d5\u00d3O000;
    private int \u00d2\u00d3O000;
    private List \u00f8\u00d2O000;
    private int iffloat;
    private byte o\u00d3O000;
    private int \u00d3\u00d3O000;

    private b$_mb(d$_f d$_f) {
        super(d$_f);
        this.o\u00d3O000 = (byte)-1;
        this.\u00d3\u00d3O000 = -1;
        this.returnfloat = d$_f.class();
    }

    private b$_mb(boolean bl) {
        this.o\u00d3O000 = (byte)-1;
        this.\u00d3\u00d3O000 = -1;
        this.returnfloat = b.o00000;
    }

    public static b$_mb \u00d4oo000() {
        return \u00f6\u00d2O000;
    }

    public final b$_mb \u00f4Oo000() {
        return \u00f6\u00d2O000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_mb(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block21: {
            this.o\u00d3O000 = (byte)-1;
            this.\u00d3\u00d3O000 = -1;
            this.\u00f8Oo000();
            boolean bl = false;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl2 = false;
                block18: while (!bl2) {
                    int n2 = ab2.oo0000();
                    switch (n2) {
                        case 0: {
                            bl2 = true;
                            continue block18;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n2)) continue block18;
                            bl2 = true;
                            continue block18;
                        }
                        case 10: {
                            if (!(bl & true)) {
                                this.\u00f8\u00d2O000 = new ArrayList();
                                bl |= true;
                            }
                            this.\u00f8\u00d2O000.add(ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2));
                            continue block18;
                        }
                        case 16: 
                    }
                    this.\u00d2\u00d3O000 |= 1;
                    this.iffloat = ab2.\u00d3o0000();
                }
                if (!(bl & true)) break block21;
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
                        this.\u00f8\u00d2O000 = Collections.unmodifiableList(this.\u00f8\u00d2O000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.returnfloat = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f8\u00d2O000 = Collections.unmodifiableList(this.\u00f8\u00d2O000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.returnfloat = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d5\u00d3O000;
    }

    public final List Ooo000() {
        return this.\u00f8\u00d2O000;
    }

    public final int intthissuper() {
        return this.\u00f8\u00d2O000.size();
    }

    public final b$_nb \u00f8o0000(int n2) {
        return (b$_nb)this.\u00f8\u00d2O000.get(n2);
    }

    public final boolean \u00f6Oo000() {
        return (this.\u00d2\u00d3O000 & 1) == 1;
    }

    public final int \u00d3oo000() {
        return this.iffloat;
    }

    private void \u00f8Oo000() {
        this.\u00f8\u00d2O000 = Collections.emptyList();
        this.iffloat = -1;
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.o\u00d3O000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        for (n2 = 0; n2 < this.intthissuper(); ++n2) {
            if (this.\u00f8o0000(n2).\u00d200000()) continue;
            this.o\u00d3O000 = 0;
            return false;
        }
        this.o\u00d3O000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        for (int i2 = 0; i2 < this.\u00f8\u00d2O000.size(); ++i2) {
            h2.\u00d300000(1, (v)this.\u00f8\u00d2O000.get(i2));
        }
        if ((this.\u00d2\u00d3O000 & 1) == 1) {
            h2.return(2, this.iffloat);
        }
        h2.\u00d300000(this.returnfloat);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d3\u00d3O000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.\u00f8\u00d2O000.size(); ++i2) {
            n2 += h.o00000(1, (v)this.\u00f8\u00d2O000.get(i2));
        }
        if ((this.\u00d2\u00d3O000 & 1) == 1) {
            n2 += h.\u00d500000(2, this.iffloat);
        }
        this.\u00d3\u00d3O000 = n2 += this.returnfloat.\u00f400000();
        return n2;
    }

    public static b$_mb$_b \u00d8Oo000() {
        return b$_mb$_b.superthissuper();
    }

    public final b$_mb$_b dothissuper() {
        return b$_mb.\u00d8Oo000();
    }

    public static b$_mb$_b \u00d400000(b$_mb b$_mb) {
        return b$_mb.\u00d8Oo000().super(b$_mb);
    }

    public final b$_mb$_b \u00d2oo000() {
        return b$_mb.\u00d400000(this);
    }

    /* synthetic */ b$_mb(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_mb(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ List super(b$_mb b$_mb, List list) {
        b$_mb.\u00f8\u00d2O000 = list;
        return b$_mb.\u00f8\u00d2O000;
    }

    static /* synthetic */ int super(b$_mb b$_mb, int n2) {
        b$_mb.iffloat = n2;
        return b$_mb.iffloat;
    }

    static /* synthetic */ int \u00d200000(b$_mb b$_mb, int n2) {
        b$_mb.\u00d2\u00d3O000 = n2;
        return b$_mb.\u00d2\u00d3O000;
    }

    static /* synthetic */ List \u00d300000(b$_mb b$_mb) {
        return b$_mb.\u00f8\u00d2O000;
    }

    static /* synthetic */ b \u00d200000(b$_mb b$_mb) {
        return b$_mb.returnfloat;
    }

    static {
        \u00d5\u00d3O000 = new b$_mb$1();
        \u00f6\u00d2O000 = new b$_mb(true);
        \u00f6\u00d2O000.\u00f8Oo000();
    }
}

