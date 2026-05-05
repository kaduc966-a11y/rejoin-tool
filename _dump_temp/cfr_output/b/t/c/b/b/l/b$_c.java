/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_bb;
import b.t.c.b.b.l.b$_c$1;
import b.t.c.b.b.l.b$_c$_b;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_db$_c$_c;
import b.t.c.b.b.l.b$_db$_c$_c$_c;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_d;
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
public final class b$_c
extends d$_c
implements b$_bb {
    private static final b$_c \u00d8\u00d8O000;
    private final b \u00f8\u00d8O000;
    public static c Stringwhile;
    private int \u00d5\u00d8O000;
    private int privatewhile;
    private int \u00d3\u00f4O000;
    private b$_nb o\u00f4O000;
    private int \u00d5\u00f4O000;
    private b$_nb nullwhile;
    private int \u00d2\u00f4O000;
    private List forwhile;
    private b$_db$_c$_c \u00f5\u00d8O000;
    private byte \u00f6\u00d8O000;
    private int \u00d6\u00d8O000;

    private b$_c(d$_g d$_g) {
        super(d$_g);
        this.\u00f6\u00d8O000 = (byte)-1;
        this.\u00d6\u00d8O000 = -1;
        this.\u00f8\u00d8O000 = d$_g.class();
    }

    private b$_c(boolean bl) {
        this.\u00f6\u00d8O000 = (byte)-1;
        this.\u00d6\u00d8O000 = -1;
        this.\u00f8\u00d8O000 = b.o00000;
    }

    public static b$_c floatclasssuper() {
        return \u00d8\u00d8O000;
    }

    public final b$_c O\u00f5o000() {
        return \u00d8\u00d8O000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_c(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        block33: {
            this.\u00f6\u00d8O000 = (byte)-1;
            this.\u00d6\u00d8O000 = -1;
            this.\u00d6\u00f5o000();
            int n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block24: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block24;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block24;
                            bl = true;
                            continue block24;
                        }
                        case 8: {
                            this.\u00d5\u00d8O000 |= 1;
                            this.privatewhile = ab2.\u00d3o0000();
                            continue block24;
                        }
                        case 16: {
                            this.\u00d5\u00d8O000 |= 2;
                            this.\u00d3\u00f4O000 = ab2.\u00d3o0000();
                            continue block24;
                        }
                        case 26: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.\u00d5\u00d8O000 & 4) == 4) {
                                b$_nb$_d = this.o\u00f4O000.\u00f4O\u00d4000();
                            }
                            this.o\u00f4O000 = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.o\u00f4O000);
                                this.o\u00f4O000 = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.\u00d5\u00d8O000 |= 4;
                            continue block24;
                        }
                        case 34: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.\u00d5\u00d8O000 & 0x10) == 16) {
                                b$_nb$_d = this.nullwhile.\u00f4O\u00d4000();
                            }
                            this.nullwhile = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.nullwhile);
                                this.nullwhile = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.\u00d5\u00d8O000 |= 0x10;
                            continue block24;
                        }
                        case 40: {
                            this.\u00d5\u00d8O000 |= 8;
                            this.\u00d5\u00f4O000 = ab2.\u00d3o0000();
                            continue block24;
                        }
                        case 48: {
                            this.\u00d5\u00d8O000 |= 0x20;
                            this.\u00d2\u00f4O000 = ab2.\u00d3o0000();
                            continue block24;
                        }
                        case 58: {
                            if ((n2 & 0x40) != 64) {
                                this.forwhile = new ArrayList();
                                n2 |= 0x40;
                            }
                            this.forwhile.add(ab2.o00000(b$_db.oOO000, s2));
                            continue block24;
                        }
                        case 66: 
                    }
                    b$_db$_c$_c$_c b$_db$_c$_c$_c = null;
                    if ((this.\u00d5\u00d8O000 & 0x40) == 64) {
                        b$_db$_c$_c$_c = this.\u00f5\u00d8O000.dofor();
                    }
                    this.\u00f5\u00d8O000 = (b$_db$_c$_c)ab2.o00000(b$_db$_c$_c.\u00f8\u00f50000, s2);
                    if (b$_db$_c$_c$_c != null) {
                        b$_db$_c$_c$_c.super(this.\u00f5\u00d8O000);
                        this.\u00f5\u00d8O000 = b$_db$_c$_c$_c.\u00d8\u00d2O000();
                    }
                    this.\u00d5\u00d8O000 |= 0x40;
                }
                if ((n2 & 0x40) != 64) break block33;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 0x40) == 64) {
                        this.forwhile = Collections.unmodifiableList(this.forwhile);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00f8\u00d8O000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.forwhile = Collections.unmodifiableList(this.forwhile);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00f8\u00d8O000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return Stringwhile;
    }

    public final boolean publicclasssuper() {
        return (this.\u00d5\u00d8O000 & 1) == 1;
    }

    public final int \u00d6\u00f4o000() {
        return this.privatewhile;
    }

    public final boolean intreturnsuper() {
        return (this.\u00d5\u00d8O000 & 2) == 2;
    }

    public final int \u00d2\u00f5o000() {
        return this.\u00d3\u00f4O000;
    }

    public final boolean \u00d8\u00f4o000() {
        return (this.\u00d5\u00d8O000 & 4) == 4;
    }

    public final b$_nb \u00f4\u00f4o000() {
        return this.o\u00f4O000;
    }

    public final boolean voidclasssuper() {
        return (this.\u00d5\u00d8O000 & 8) == 8;
    }

    public final int \u00d3\u00f5o000() {
        return this.\u00d5\u00f4O000;
    }

    public final boolean \u00d3\u00f4o000() {
        return (this.\u00d5\u00d8O000 & 0x10) == 16;
    }

    public final b$_nb \u00f4\u00f5o000() {
        return this.nullwhile;
    }

    public final boolean \u00d8\u00f5o000() {
        return (this.\u00d5\u00d8O000 & 0x20) == 32;
    }

    public final int \u00f6\u00f4o000() {
        return this.\u00d2\u00f4O000;
    }

    public final List \u00f8\u00f4o000() {
        return this.forwhile;
    }

    public final int classreturnsuper() {
        return this.forwhile.size();
    }

    public final b$_db \u00f6\u00d20000(int n2) {
        return (b$_db)this.forwhile.get(n2);
    }

    public final boolean \u00f6\u00f5o000() {
        return (this.\u00d5\u00d8O000 & 0x40) == 64;
    }

    public final b$_db$_c$_c \u00d2\u00f4o000() {
        return this.\u00f5\u00d8O000;
    }

    private void \u00d6\u00f5o000() {
        this.privatewhile = 0;
        this.\u00d3\u00f4O000 = 0;
        this.o\u00f4O000 = b$_nb.\u00d2o\u00d4000();
        this.\u00d5\u00f4O000 = 0;
        this.nullwhile = b$_nb.\u00d2o\u00d4000();
        this.\u00d2\u00f4O000 = 0;
        this.forwhile = Collections.emptyList();
        this.\u00f5\u00d8O000 = b$_db$_c$_c.\u00d4\u00d3O000();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00f6\u00d8O000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (!this.intreturnsuper()) {
            this.\u00f6\u00d8O000 = 0;
            return false;
        }
        if (this.\u00d8\u00f4o000() && !this.\u00f4\u00f4o000().\u00d200000()) {
            this.\u00f6\u00d8O000 = 0;
            return false;
        }
        if (this.\u00d3\u00f4o000() && !this.\u00f4\u00f5o000().\u00d200000()) {
            this.\u00f6\u00d8O000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.classreturnsuper(); ++n2) {
            if (this.\u00f6\u00d20000(n2).\u00d200000()) continue;
            this.\u00f6\u00d8O000 = 0;
            return false;
        }
        if (this.\u00f6\u00f5o000() && !this.\u00d2\u00f4o000().\u00d200000()) {
            this.\u00f6\u00d8O000 = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.\u00f6\u00d8O000 = 0;
            return false;
        }
        this.\u00f6\u00d8O000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.\u00d5\u00d8O000 & 1) == 1) {
            h2.return(1, this.privatewhile);
        }
        if ((this.\u00d5\u00d8O000 & 2) == 2) {
            h2.return(2, this.\u00d3\u00f4O000);
        }
        if ((this.\u00d5\u00d8O000 & 4) == 4) {
            h2.\u00d300000(3, this.o\u00f4O000);
        }
        if ((this.\u00d5\u00d8O000 & 0x10) == 16) {
            h2.\u00d300000(4, this.nullwhile);
        }
        if ((this.\u00d5\u00d8O000 & 8) == 8) {
            h2.return(5, this.\u00d5\u00f4O000);
        }
        if ((this.\u00d5\u00d8O000 & 0x20) == 32) {
            h2.return(6, this.\u00d2\u00f4O000);
        }
        for (int i2 = 0; i2 < this.forwhile.size(); ++i2) {
            h2.\u00d300000(7, (v)this.forwhile.get(i2));
        }
        if ((this.\u00d5\u00d8O000 & 0x40) == 64) {
            h2.\u00d300000(8, this.\u00f5\u00d8O000);
        }
        d$_c$_b.o00000(200, h2);
        h2.\u00d300000(this.\u00f8\u00d8O000);
    }

    @Override
    public final int \u00f800000() {
        int n2 = this.\u00d6\u00d8O000;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.\u00d5\u00d8O000 & 1) == 1) {
            n2 = 0 + h.\u00d500000(1, this.privatewhile);
        }
        if ((this.\u00d5\u00d8O000 & 2) == 2) {
            n2 += h.\u00d500000(2, this.\u00d3\u00f4O000);
        }
        if ((this.\u00d5\u00d8O000 & 4) == 4) {
            n2 += h.o00000(3, this.o\u00f4O000);
        }
        if ((this.\u00d5\u00d8O000 & 0x10) == 16) {
            n2 += h.o00000(4, this.nullwhile);
        }
        if ((this.\u00d5\u00d8O000 & 8) == 8) {
            n2 += h.\u00d500000(5, this.\u00d5\u00f4O000);
        }
        if ((this.\u00d5\u00d8O000 & 0x20) == 32) {
            n2 += h.\u00d500000(6, this.\u00d2\u00f4O000);
        }
        for (int i2 = 0; i2 < this.forwhile.size(); ++i2) {
            n2 += h.o00000(7, (v)this.forwhile.get(i2));
        }
        if ((this.\u00d5\u00d8O000 & 0x40) == 64) {
            n2 += h.o00000(8, this.\u00f5\u00d8O000);
        }
        this.\u00d6\u00d8O000 = n2 = n2 + this.\u00d6\u00d6o000() + this.\u00f8\u00d8O000.\u00f400000();
        return n2;
    }

    public static b$_c$_b \u00d4\u00f4o000() {
        return b$_c$_b.O\u00d8o000();
    }

    public final b$_c$_b \u00d4\u00f5o000() {
        return b$_c.\u00d4\u00f4o000();
    }

    public static b$_c$_b \u00d400000(b$_c b$_c) {
        return b$_c.\u00d4\u00f4o000().super(b$_c);
    }

    public final b$_c$_b superreturnsuper() {
        return b$_c.\u00d400000(this);
    }

    /* synthetic */ b$_c(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_c(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ int super(b$_c b$_c, int n2) {
        b$_c.privatewhile = n2;
        return b$_c.privatewhile;
    }

    static /* synthetic */ int \u00d200000(b$_c b$_c, int n2) {
        b$_c.\u00d3\u00f4O000 = n2;
        return b$_c.\u00d3\u00f4O000;
    }

    static /* synthetic */ b$_nb super(b$_c b$_c, b$_nb b$_nb) {
        b$_c.o\u00f4O000 = b$_nb;
        return b$_c.o\u00f4O000;
    }

    static /* synthetic */ int \u00d300000(b$_c b$_c, int n2) {
        b$_c.\u00d5\u00f4O000 = n2;
        return b$_c.\u00d5\u00f4O000;
    }

    static /* synthetic */ b$_nb \u00d200000(b$_c b$_c, b$_nb b$_nb) {
        b$_c.nullwhile = b$_nb;
        return b$_c.nullwhile;
    }

    static /* synthetic */ int \u00d400000(b$_c b$_c, int n2) {
        b$_c.\u00d2\u00f4O000 = n2;
        return b$_c.\u00d2\u00f4O000;
    }

    static /* synthetic */ List super(b$_c b$_c, List list) {
        b$_c.forwhile = list;
        return b$_c.forwhile;
    }

    static /* synthetic */ b$_db$_c$_c super(b$_c b$_c, b$_db$_c$_c b$_db$_c$_c) {
        b$_c.\u00f5\u00d8O000 = b$_db$_c$_c;
        return b$_c.\u00f5\u00d8O000;
    }

    static /* synthetic */ int class(b$_c b$_c, int n2) {
        b$_c.\u00d5\u00d8O000 = n2;
        return b$_c.\u00d5\u00d8O000;
    }

    static /* synthetic */ List \u00d200000(b$_c b$_c) {
        return b$_c.forwhile;
    }

    static /* synthetic */ b \u00d300000(b$_c b$_c) {
        return b$_c.\u00f8\u00d8O000;
    }

    static {
        Stringwhile = new b$_c$1();
        \u00d8\u00d8O000 = new b$_c(true);
        \u00d8\u00d8O000.\u00d6\u00f5o000();
    }
}

