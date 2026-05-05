/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_kb$1;
import b.t.c.b.b.l.b$_kb$_b;
import b.t.c.b.b.l.b$_kb$_c;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_d;
import b.t.c.b.b.l.b$_r;
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
public final class b$_kb
extends d
implements b$_r {
    private static final b$_kb \u00f5oO000;
    private final b forif;
    public static c \u00d6oO000;
    private int \u00d8oO000;
    private int \u00d5\u00d2O000;
    private int \u00d6\u00d2O000;
    private b$_kb$_b o\u00d2O000;
    private b$_nb privateif;
    private int \u00d2\u00d2O000;
    private List \u00f6oO000;
    private List \u00d3\u00d2O000;
    private byte \u00f8oO000;
    private int nullif;

    private b$_kb(d$_f d$_f) {
        super(d$_f);
        this.\u00f8oO000 = (byte)-1;
        this.nullif = -1;
        this.forif = d$_f.class();
    }

    private b$_kb(boolean bl) {
        this.\u00f8oO000 = (byte)-1;
        this.nullif = -1;
        this.forif = b.o00000;
    }

    public static b$_kb \u00d20o000() {
        return \u00f5oO000;
    }

    public final b$_kb \u00d30o000() {
        return \u00f5oO000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_kb(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        int n2;
        block32: {
            this.\u00f8oO000 = (byte)-1;
            this.nullif = -1;
            this.\u00d60o000();
            n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block23: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block23;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block23;
                            bl = true;
                            continue block23;
                        }
                        case 8: {
                            this.\u00d8oO000 |= 1;
                            this.\u00d5\u00d2O000 = ab2.\u00d3o0000();
                            continue block23;
                        }
                        case 16: {
                            this.\u00d8oO000 |= 2;
                            this.\u00d6\u00d2O000 = ab2.\u00d3o0000();
                            continue block23;
                        }
                        case 24: {
                            int n4 = ab2.\u00f6O0000();
                            b$_kb$_b b$_kb$_b = b$_kb$_b.do(n4);
                            if (b$_kb$_b == null) {
                                h2.oO0000(n3);
                                h2.oO0000(n4);
                                continue block23;
                            }
                            this.\u00d8oO000 |= 4;
                            this.o\u00d2O000 = b$_kb$_b;
                            continue block23;
                        }
                        case 34: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.\u00d8oO000 & 8) == 8) {
                                b$_nb$_d = this.privateif.\u00f4O\u00d4000();
                            }
                            this.privateif = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.privateif);
                                this.privateif = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.\u00d8oO000 |= 8;
                            continue block23;
                        }
                        case 40: {
                            this.\u00d8oO000 |= 0x10;
                            this.\u00d2\u00d2O000 = ab2.\u00d3o0000();
                            continue block23;
                        }
                        case 50: {
                            if ((n2 & 0x20) != 32) {
                                this.\u00f6oO000 = new ArrayList();
                                n2 |= 0x20;
                            }
                            this.\u00f6oO000.add(ab2.o00000(\u00d6oO000, s2));
                            continue block23;
                        }
                        case 58: 
                    }
                    if ((n2 & 0x40) != 64) {
                        this.\u00d3\u00d2O000 = new ArrayList();
                        n2 |= 0x40;
                    }
                    this.\u00d3\u00d2O000.add(ab2.o00000(\u00d6oO000, s2));
                }
                if ((n2 & 0x20) != 32) break block32;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 0x20) == 32) {
                        this.\u00f6oO000 = Collections.unmodifiableList(this.\u00f6oO000);
                    }
                    if ((n2 & 0x40) == 64) {
                        this.\u00d3\u00d2O000 = Collections.unmodifiableList(this.\u00d3\u00d2O000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.forif = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f6oO000 = Collections.unmodifiableList(this.\u00f6oO000);
        }
        if ((n2 & 0x40) == 64) {
            this.\u00d3\u00d2O000 = Collections.unmodifiableList(this.\u00d3\u00d2O000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.forif = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d6oO000;
    }

    public final boolean \u00d6\u00f8O000() {
        return (this.\u00d8oO000 & 1) == 1;
    }

    public final int interfaceprivate() {
        return this.\u00d5\u00d2O000;
    }

    public final boolean floatinterface() {
        return (this.\u00d8oO000 & 2) == 2;
    }

    public final int \u00d40o000() {
        return this.\u00d6\u00d2O000;
    }

    public final boolean O0o000() {
        return (this.\u00d8oO000 & 4) == 4;
    }

    public final b$_kb$_b \u00f4\u00f8O000() {
        return this.o\u00d2O000;
    }

    public final boolean voidinterface() {
        return (this.\u00d8oO000 & 8) == 8;
    }

    public final b$_nb \u00f6\u00f8O000() {
        return this.privateif;
    }

    public final boolean \u00d3\u00f8O000() {
        return (this.\u00d8oO000 & 0x10) == 16;
    }

    public final int Objectinterface() {
        return this.\u00d2\u00d2O000;
    }

    public final List \u00d4\u00f8O000() {
        return this.\u00f6oO000;
    }

    public final int publicinterface() {
        return this.\u00f6oO000.size();
    }

    public final b$_kb \u00f4o0000(int n2) {
        return (b$_kb)this.\u00f6oO000.get(n2);
    }

    public final List \u00d2\u00f8O000() {
        return this.\u00d3\u00d2O000;
    }

    public final int \u00f40o000() {
        return this.\u00d3\u00d2O000.size();
    }

    public final b$_kb \u00d8o0000(int n2) {
        return (b$_kb)this.\u00d3\u00d2O000.get(n2);
    }

    private void \u00d60o000() {
        this.\u00d5\u00d2O000 = 0;
        this.\u00d6\u00d2O000 = 0;
        this.o\u00d2O000 = b$_kb$_b.Stringclass;
        this.privateif = b$_nb.\u00d2o\u00d4000();
        this.\u00d2\u00d2O000 = 0;
        this.\u00f6oO000 = Collections.emptyList();
        this.\u00d3\u00d2O000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00f8oO000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (this.voidinterface() && !this.\u00f6\u00f8O000().\u00d200000()) {
            this.\u00f8oO000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.publicinterface(); ++n2) {
            if (this.\u00f4o0000(n2).\u00d200000()) continue;
            this.\u00f8oO000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f40o000(); ++n2) {
            if (this.\u00d8o0000(n2).\u00d200000()) continue;
            this.\u00f8oO000 = 0;
            return false;
        }
        this.\u00f8oO000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        if ((this.\u00d8oO000 & 1) == 1) {
            h2.return(1, this.\u00d5\u00d2O000);
        }
        if ((this.\u00d8oO000 & 2) == 2) {
            h2.return(2, this.\u00d6\u00d2O000);
        }
        if ((this.\u00d8oO000 & 4) == 4) {
            h2.new(3, this.o\u00d2O000.super());
        }
        if ((this.\u00d8oO000 & 8) == 8) {
            h2.\u00d300000(4, this.privateif);
        }
        if ((this.\u00d8oO000 & 0x10) == 16) {
            h2.return(5, this.\u00d2\u00d2O000);
        }
        for (n2 = 0; n2 < this.\u00f6oO000.size(); ++n2) {
            h2.\u00d300000(6, (v)this.\u00f6oO000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d3\u00d2O000.size(); ++n2) {
            h2.\u00d300000(7, (v)this.\u00d3\u00d2O000.get(n2));
        }
        h2.\u00d300000(this.forif);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.nullif;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        if ((this.\u00d8oO000 & 1) == 1) {
            n3 = 0 + h.\u00d500000(1, this.\u00d5\u00d2O000);
        }
        if ((this.\u00d8oO000 & 2) == 2) {
            n3 += h.\u00d500000(2, this.\u00d6\u00d2O000);
        }
        if ((this.\u00d8oO000 & 4) == 4) {
            n3 += h.o00000(3, this.o\u00d2O000.super());
        }
        if ((this.\u00d8oO000 & 8) == 8) {
            n3 += h.o00000(4, this.privateif);
        }
        if ((this.\u00d8oO000 & 0x10) == 16) {
            n3 += h.\u00d500000(5, this.\u00d2\u00d2O000);
        }
        for (n2 = 0; n2 < this.\u00f6oO000.size(); ++n2) {
            n3 += h.o00000(6, (v)this.\u00f6oO000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d3\u00d2O000.size(); ++n2) {
            n3 += h.o00000(7, (v)this.\u00d3\u00d2O000.get(n2));
        }
        this.nullif = n3 += this.forif.\u00f400000();
        return n3;
    }

    public static b$_kb$_c \u00d8\u00f8O000() {
        return b$_kb$_c.classprivate();
    }

    public final b$_kb$_c \u00f8\u00f8O000() {
        return b$_kb.\u00d8\u00f8O000();
    }

    public static b$_kb$_c \u00d300000(b$_kb b$_kb) {
        return b$_kb.\u00d8\u00f8O000().\u00d200000(b$_kb);
    }

    public final b$_kb$_c \u00d80o000() {
        return b$_kb.\u00d300000(this);
    }

    /* synthetic */ b$_kb(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_kb(d$_f d$_f, b$1 b$1) {
        this(d$_f);
    }

    static /* synthetic */ int \u00d400000(b$_kb b$_kb, int n2) {
        b$_kb.\u00d5\u00d2O000 = n2;
        return b$_kb.\u00d5\u00d2O000;
    }

    static /* synthetic */ int \u00d300000(b$_kb b$_kb, int n2) {
        b$_kb.\u00d6\u00d2O000 = n2;
        return b$_kb.\u00d6\u00d2O000;
    }

    static /* synthetic */ b$_kb$_b super(b$_kb b$_kb, b$_kb$_b b$_kb$_b) {
        b$_kb.o\u00d2O000 = b$_kb$_b;
        return b$_kb.o\u00d2O000;
    }

    static /* synthetic */ b$_nb super(b$_kb b$_kb, b$_nb b$_nb) {
        b$_kb.privateif = b$_nb;
        return b$_kb.privateif;
    }

    static /* synthetic */ int \u00d200000(b$_kb b$_kb, int n2) {
        b$_kb.\u00d2\u00d2O000 = n2;
        return b$_kb.\u00d2\u00d2O000;
    }

    static /* synthetic */ List \u00d200000(b$_kb b$_kb, List list) {
        b$_kb.\u00f6oO000 = list;
        return b$_kb.\u00f6oO000;
    }

    static /* synthetic */ List super(b$_kb b$_kb, List list) {
        b$_kb.\u00d3\u00d2O000 = list;
        return b$_kb.\u00d3\u00d2O000;
    }

    static /* synthetic */ int super(b$_kb b$_kb, int n2) {
        b$_kb.\u00d8oO000 = n2;
        return b$_kb.\u00d8oO000;
    }

    static /* synthetic */ List class(b$_kb b$_kb) {
        return b$_kb.\u00f6oO000;
    }

    static /* synthetic */ List \u00d400000(b$_kb b$_kb) {
        return b$_kb.\u00d3\u00d2O000;
    }

    static /* synthetic */ b \u00d600000(b$_kb b$_kb) {
        return b$_kb.forif;
    }

    static {
        \u00d6oO000 = new b$_kb$1();
        \u00f5oO000 = new b$_kb(true);
        \u00f5oO000.\u00d60o000();
    }
}

