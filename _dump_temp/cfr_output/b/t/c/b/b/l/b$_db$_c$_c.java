/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_db$_c$_b;
import b.t.c.b.b.l.b$_db$_c$_c$1;
import b.t.c.b.b.l.b$_db$_c$_c$_b;
import b.t.c.b.b.l.b$_db$_c$_c$_c;
import b.t.c.b.b.l.b$_db$_d;
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
public final class b$_db$_c$_c
extends d
implements b$_db$_c$_b {
    private static final b$_db$_c$_c \u00d2\u00f60000;
    private final b \u00d6\u00f60000;
    public static c \u00f8\u00f50000;
    private int returnvoid;
    private b$_db$_c$_c$_b whilevoid;
    private long \u00f8\u00f60000;
    private float \u00d3\u00f60000;
    private double \u00d5\u00f60000;
    private int o\u00f80000;
    private int \u00f6\u00f60000;
    private int \u00f5\u00f60000;
    private b$_db \u00d8\u00f60000;
    private List \u00d3\u00f80000;
    private int \u00d2\u00f80000;
    private int thisnull;
    private byte ifvoid;
    private int o\u00f60000;

    private b$_db$_c$_c(d$_f d$_f) {
        super(d$_f);
        this.ifvoid = (byte)-1;
        this.o\u00f60000 = -1;
        this.\u00d6\u00f60000 = d$_f.class();
    }

    private b$_db$_c$_c(boolean bl) {
        this.ifvoid = (byte)-1;
        this.o\u00f60000 = -1;
        this.\u00d6\u00f60000 = b.o00000;
    }

    public static b$_db$_c$_c \u00d4\u00d3O000() {
        return \u00d2\u00f60000;
    }

    public final b$_db$_c$_c \u00d2\u00d4O000() {
        return \u00d2\u00f60000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_db$_c$_c(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block33: {
            this.ifvoid = (byte)-1;
            this.o\u00f60000 = -1;
            this.O\u00d5O000();
            int n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block27: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block27;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block27;
                            bl = true;
                            continue block27;
                        }
                        case 8: {
                            int n4 = ab2.\u00f6O0000();
                            b$_db$_c$_c$_b b$_db$_c$_c$_b = b$_db$_c$_c$_b.\u00f800000(n4);
                            if (b$_db$_c$_c$_b == null) {
                                h2.oO0000(n3);
                                h2.oO0000(n4);
                                continue block27;
                            }
                            this.returnvoid |= 1;
                            this.whilevoid = b$_db$_c$_c$_b;
                            continue block27;
                        }
                        case 16: {
                            this.returnvoid |= 2;
                            this.\u00f8\u00f60000 = ab2.oO0000();
                            continue block27;
                        }
                        case 29: {
                            this.returnvoid |= 4;
                            this.\u00d3\u00f60000 = ab2.\u00d6O0000();
                            continue block27;
                        }
                        case 33: {
                            this.returnvoid |= 8;
                            this.\u00d5\u00f60000 = ab2.String();
                            continue block27;
                        }
                        case 40: {
                            this.returnvoid |= 0x10;
                            this.o\u00f80000 = ab2.\u00d3o0000();
                            continue block27;
                        }
                        case 48: {
                            this.returnvoid |= 0x20;
                            this.\u00f6\u00f60000 = ab2.\u00d3o0000();
                            continue block27;
                        }
                        case 56: {
                            this.returnvoid |= 0x40;
                            this.\u00f5\u00f60000 = ab2.\u00d3o0000();
                            continue block27;
                        }
                        case 66: {
                            b$_db$_d b$_db$_d = null;
                            if ((this.returnvoid & 0x80) == 128) {
                                b$_db$_d = this.\u00d8\u00f60000.\u00d6\u00f4O000();
                            }
                            this.\u00d8\u00f60000 = (b$_db)ab2.o00000(b$_db.oOO000, s2);
                            if (b$_db$_d != null) {
                                b$_db$_d.\u00d300000(this.\u00d8\u00f60000);
                                this.\u00d8\u00f60000 = b$_db$_d.\u00d2\u00d8O000();
                            }
                            this.returnvoid |= 0x80;
                            continue block27;
                        }
                        case 74: {
                            if ((n2 & 0x100) != 256) {
                                this.\u00d3\u00f80000 = new ArrayList();
                                n2 |= 0x100;
                            }
                            this.\u00d3\u00f80000.add(ab2.o00000(\u00f8\u00f50000, s2));
                            continue block27;
                        }
                        case 80: {
                            this.returnvoid |= 0x200;
                            this.thisnull = ab2.\u00d3o0000();
                            continue block27;
                        }
                        case 88: 
                    }
                    this.returnvoid |= 0x100;
                    this.\u00d2\u00f80000 = ab2.\u00d3o0000();
                }
                if ((n2 & 0x100) != 256) break block33;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 0x100) == 256) {
                        this.\u00d3\u00f80000 = Collections.unmodifiableList(this.\u00d3\u00f80000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00d6\u00f60000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00d3\u00f80000 = Collections.unmodifiableList(this.\u00d3\u00f80000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d6\u00f60000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f8\u00f50000;
    }

    public final boolean O\u00d4O000() {
        return (this.returnvoid & 1) == 1;
    }

    public final b$_db$_c$_c$_b \u00f6\u00d4O000() {
        return this.whilevoid;
    }

    public final boolean floatfloat() {
        return (this.returnvoid & 2) == 2;
    }

    public final long \u00d4\u00d5O000() {
        return this.\u00f8\u00f60000;
    }

    public final boolean classfor() {
        return (this.returnvoid & 4) == 4;
    }

    public final float \u00d3\u00d3O000() {
        return this.\u00d3\u00f60000;
    }

    public final boolean \u00f8\u00d3O000() {
        return (this.returnvoid & 8) == 8;
    }

    public final double \u00d6\u00d3O000() {
        return this.\u00d5\u00f60000;
    }

    public final boolean \u00d3\u00d4O000() {
        return (this.returnvoid & 0x10) == 16;
    }

    public final int publicfloat() {
        return this.o\u00f80000;
    }

    public final boolean \u00d6\u00d4O000() {
        return (this.returnvoid & 0x20) == 32;
    }

    public final int intfor() {
        return this.\u00f6\u00f60000;
    }

    public final boolean \u00f8\u00d4O000() {
        return (this.returnvoid & 0x40) == 64;
    }

    public final int \u00d4\u00d4O000() {
        return this.\u00f5\u00f60000;
    }

    public final boolean \u00f4\u00d3O000() {
        return (this.returnvoid & 0x80) == 128;
    }

    public final b$_db interfacefor() {
        return this.\u00d8\u00f60000;
    }

    public final List \u00d8\u00d3O000() {
        return this.\u00d3\u00f80000;
    }

    public final int \u00d3\u00d5O000() {
        return this.\u00d3\u00f80000.size();
    }

    public final b$_db$_c$_c \u00f4O0000(int n2) {
        return (b$_db$_c$_c)this.\u00d3\u00f80000.get(n2);
    }

    public final boolean \u00d2\u00d3O000() {
        return (this.returnvoid & 0x100) == 256;
    }

    public final int \u00d8\u00d4O000() {
        return this.\u00d2\u00f80000;
    }

    public final boolean superfor() {
        return (this.returnvoid & 0x200) == 512;
    }

    public final int \u00f6\u00d3O000() {
        return this.thisnull;
    }

    private void O\u00d5O000() {
        this.whilevoid = b$_db$_c$_c$_b.returnString;
        this.\u00f8\u00f60000 = 0L;
        this.\u00d3\u00f60000 = 0.0f;
        this.\u00d5\u00f60000 = 0.0;
        this.o\u00f80000 = 0;
        this.\u00f6\u00f60000 = 0;
        this.\u00f5\u00f60000 = 0;
        this.\u00d8\u00f60000 = b$_db.\u00d4\u00f4O000();
        this.\u00d3\u00f80000 = Collections.emptyList();
        this.\u00d2\u00f80000 = 0;
        this.thisnull = 0;
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.ifvoid;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (this.\u00f4\u00d3O000() && !this.interfacefor().\u00d200000()) {
            this.ifvoid = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00d5O000(); ++n2) {
            if (this.\u00f4O0000(n2).\u00d200000()) continue;
            this.ifvoid = 0;
            return false;
        }
        this.ifvoid = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        if ((this.returnvoid & 1) == 1) {
            h2.new(1, this.whilevoid.super());
        }
        if ((this.returnvoid & 2) == 2) {
            h2.new(2, this.\u00f8\u00f60000);
        }
        if ((this.returnvoid & 4) == 4) {
            h2.new(3, this.\u00d3\u00f60000);
        }
        if ((this.returnvoid & 8) == 8) {
            h2.o00000(4, this.\u00d5\u00f60000);
        }
        if ((this.returnvoid & 0x10) == 16) {
            h2.return(5, this.o\u00f80000);
        }
        if ((this.returnvoid & 0x20) == 32) {
            h2.return(6, this.\u00f6\u00f60000);
        }
        if ((this.returnvoid & 0x40) == 64) {
            h2.return(7, this.\u00f5\u00f60000);
        }
        if ((this.returnvoid & 0x80) == 128) {
            h2.\u00d300000(8, this.\u00d8\u00f60000);
        }
        for (int i2 = 0; i2 < this.\u00d3\u00f80000.size(); ++i2) {
            h2.\u00d300000(9, (v)this.\u00d3\u00f80000.get(i2));
        }
        if ((this.returnvoid & 0x200) == 512) {
            h2.return(10, this.thisnull);
        }
        if ((this.returnvoid & 0x100) == 256) {
            h2.return(11, this.\u00d2\u00f80000);
        }
        h2.\u00d300000(this.\u00d6\u00f60000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.o\u00f60000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.returnvoid & 1) == 1) {
            n2 = 0 + h.o00000(1, this.whilevoid.super());
        }
        if ((this.returnvoid & 2) == 2) {
            n2 += h.o00000(2, this.\u00f8\u00f60000);
        }
        if ((this.returnvoid & 4) == 4) {
            n2 += h.o00000(3, this.\u00d3\u00f60000);
        }
        if ((this.returnvoid & 8) == 8) {
            n2 += h.new(4, this.\u00d5\u00f60000);
        }
        if ((this.returnvoid & 0x10) == 16) {
            n2 += h.\u00d500000(5, this.o\u00f80000);
        }
        if ((this.returnvoid & 0x20) == 32) {
            n2 += h.\u00d500000(6, this.\u00f6\u00f60000);
        }
        if ((this.returnvoid & 0x40) == 64) {
            n2 += h.\u00d500000(7, this.\u00f5\u00f60000);
        }
        if ((this.returnvoid & 0x80) == 128) {
            n2 += h.o00000(8, this.\u00d8\u00f60000);
        }
        for (int i2 = 0; i2 < this.\u00d3\u00f80000.size(); ++i2) {
            n2 += h.o00000(9, (v)this.\u00d3\u00f80000.get(i2));
        }
        if ((this.returnvoid & 0x200) == 512) {
            n2 += h.\u00d500000(10, this.thisnull);
        }
        if ((this.returnvoid & 0x100) == 256) {
            n2 += h.\u00d500000(11, this.\u00d2\u00f80000);
        }
        this.o\u00f60000 = n2 += this.\u00d6\u00f60000.\u00f400000();
        return n2;
    }

    public static b$_db$_c$_c$_c \u00d2\u00d5O000() {
        return b$_db$_c$_c$_c.\u00f4\u00d2O000();
    }

    public final b$_db$_c$_c$_c \u00f4\u00d4O000() {
        return b$_db$_c$_c.\u00d2\u00d5O000();
    }

    public static b$_db$_c$_c$_c \u00d300000(b$_db$_c$_c b$_db$_c$_c) {
        return b$_db$_c$_c.\u00d2\u00d5O000().super(b$_db$_c$_c);
    }

    public final b$_db$_c$_c$_c dofor() {
        return b$_db$_c$_c.\u00d300000(this);
    }

    /* synthetic */ b$_db$_c$_c(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_db$_c$_c(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ b$_db$_c$_c$_b super(b$_db$_c$_c b$_db$_c$_c, b$_db$_c$_c$_b b$_db$_c$_c$_b) {
        b$_db$_c$_c.whilevoid = b$_db$_c$_c$_b;
        return b$_db$_c$_c.whilevoid;
    }

    static /* synthetic */ long super(b$_db$_c$_c b$_db$_c$_c, long l2) {
        b$_db$_c$_c.\u00f8\u00f60000 = l2;
        return b$_db$_c$_c.\u00f8\u00f60000;
    }

    static /* synthetic */ float super(b$_db$_c$_c b$_db$_c$_c, float f2) {
        b$_db$_c$_c.\u00d3\u00f60000 = f2;
        return b$_db$_c$_c.\u00d3\u00f60000;
    }

    static /* synthetic */ double super(b$_db$_c$_c b$_db$_c$_c, double d2) {
        b$_db$_c$_c.\u00d5\u00f60000 = d2;
        return b$_db$_c$_c.\u00d5\u00f60000;
    }

    static /* synthetic */ int class(b$_db$_c$_c b$_db$_c$_c, int n2) {
        b$_db$_c$_c.o\u00f80000 = n2;
        return b$_db$_c$_c.o\u00f80000;
    }

    static /* synthetic */ int \u00d300000(b$_db$_c$_c b$_db$_c$_c, int n2) {
        b$_db$_c$_c.\u00f6\u00f60000 = n2;
        return b$_db$_c$_c.\u00f6\u00f60000;
    }

    static /* synthetic */ int super(b$_db$_c$_c b$_db$_c$_c, int n2) {
        b$_db$_c$_c.\u00f5\u00f60000 = n2;
        return b$_db$_c$_c.\u00f5\u00f60000;
    }

    static /* synthetic */ b$_db super(b$_db$_c$_c b$_db$_c$_c, b$_db b$_db) {
        b$_db$_c$_c.\u00d8\u00f60000 = b$_db;
        return b$_db$_c$_c.\u00d8\u00f60000;
    }

    static /* synthetic */ List super(b$_db$_c$_c b$_db$_c$_c, List list) {
        b$_db$_c$_c.\u00d3\u00f80000 = list;
        return b$_db$_c$_c.\u00d3\u00f80000;
    }

    static /* synthetic */ int \u00d600000(b$_db$_c$_c b$_db$_c$_c, int n2) {
        b$_db$_c$_c.\u00d2\u00f80000 = n2;
        return b$_db$_c$_c.\u00d2\u00f80000;
    }

    static /* synthetic */ int \u00d400000(b$_db$_c$_c b$_db$_c$_c, int n2) {
        b$_db$_c$_c.thisnull = n2;
        return b$_db$_c$_c.thisnull;
    }

    static /* synthetic */ int \u00d200000(b$_db$_c$_c b$_db$_c$_c, int n2) {
        b$_db$_c$_c.returnvoid = n2;
        return b$_db$_c$_c.returnvoid;
    }

    static /* synthetic */ List \u00d200000(b$_db$_c$_c b$_db$_c$_c) {
        return b$_db$_c$_c.\u00d3\u00f80000;
    }

    static /* synthetic */ b \u00d400000(b$_db$_c$_c b$_db$_c$_c) {
        return b$_db$_c$_c.\u00d6\u00f60000;
    }

    static {
        \u00f8\u00f50000 = new b$_db$_c$_c$1();
        \u00d2\u00f60000 = new b$_db$_c$_c(true);
        \u00d2\u00f60000.O\u00d5O000();
    }
}

