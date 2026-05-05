/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_b$1;
import b.t.c.b.b.l.b$_b$_b;
import b.t.c.b.b.l.b$_b$_c;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_hb;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
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
public final class b$_b
extends d$_c
implements b$_hb {
    private static final b$_b o\u00d4\u00d2000;
    private final b \u00d5\u00d4\u00d2000;
    public static c \u00f6\u00d3\u00d2000;
    private int \u00f8\u00d3\u00d2000;
    private int \u00f8\u00d4\u00d2000;
    private int whilefloatsuper;
    private boolean iffloatsuper;
    private b$_b$_b \u00f5\u00d4\u00d2000;
    private List \u00d8\u00d4\u00d2000;
    private List \u00f6\u00d4\u00d2000;
    private int \u00d3\u00d4\u00d2000;
    private List \u00d6\u00d4\u00d2000;
    private byte \u00d2\u00d4\u00d2000;
    private int returnfloatsuper;

    private b$_b(d$_g d$_g) {
        super(d$_g);
        this.\u00d3\u00d4\u00d2000 = -1;
        this.\u00d2\u00d4\u00d2000 = (byte)-1;
        this.returnfloatsuper = -1;
        this.\u00d5\u00d4\u00d2000 = d$_g.class();
    }

    private b$_b(boolean bl) {
        this.\u00d3\u00d4\u00d2000 = -1;
        this.\u00d2\u00d4\u00d2000 = (byte)-1;
        this.returnfloatsuper = -1;
        this.\u00d5\u00d4\u00d2000 = b.o00000;
    }

    public static b$_b \u00f8\u00d5\u00d4000() {
        return o\u00d4\u00d2000;
    }

    public final b$_b \u00f8\u00d4\u00d4000() {
        return o\u00d4\u00d2000;
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
        block36: {
            this.\u00d3\u00d4\u00d2000 = -1;
            this.\u00d2\u00d4\u00d2000 = (byte)-1;
            this.returnfloatsuper = -1;
            this.\u00f6\u00d5\u00d4000();
            n2 = 0;
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
                            this.\u00f8\u00d3\u00d2000 |= 1;
                            this.\u00f8\u00d4\u00d2000 = ab2.\u00d3o0000();
                            continue block24;
                        }
                        case 16: {
                            this.\u00f8\u00d3\u00d2000 |= 2;
                            this.whilefloatsuper = ab2.\u00d3o0000();
                            continue block24;
                        }
                        case 24: {
                            this.\u00f8\u00d3\u00d2000 |= 4;
                            this.iffloatsuper = ab2.for();
                            continue block24;
                        }
                        case 32: {
                            int n4 = ab2.\u00f6O0000();
                            b$_b$_b b$_b$_b = b$_b$_b.super(n4);
                            if (b$_b$_b == null) {
                                h2.oO0000(n3);
                                h2.oO0000(n4);
                                continue block24;
                            }
                            this.\u00f8\u00d3\u00d2000 |= 8;
                            this.\u00f5\u00d4\u00d2000 = b$_b$_b;
                            continue block24;
                        }
                        case 42: {
                            if ((n2 & 0x10) != 16) {
                                this.\u00d8\u00d4\u00d2000 = new ArrayList();
                                n2 |= 0x10;
                            }
                            this.\u00d8\u00d4\u00d2000.add(ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2));
                            continue block24;
                        }
                        case 48: {
                            if ((n2 & 0x20) != 32) {
                                this.\u00f6\u00d4\u00d2000 = new ArrayList();
                                n2 |= 0x20;
                            }
                            this.\u00f6\u00d4\u00d2000.add(ab2.\u00d3o0000());
                            continue block24;
                        }
                        case 50: {
                            int n4 = ab2.\u00f500000();
                            int n5 = ab2.\u00d500000(n4);
                            if ((n2 & 0x20) != 32 && ab2.newsuper() > 0) {
                                this.\u00f6\u00d4\u00d2000 = new ArrayList();
                                n2 |= 0x20;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00f6\u00d4\u00d2000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n5);
                            continue block24;
                        }
                        case 802: 
                    }
                    if ((n2 & 0x40) != 64) {
                        this.\u00d6\u00d4\u00d2000 = new ArrayList();
                        n2 |= 0x40;
                    }
                    this.\u00d6\u00d4\u00d2000.add(ab2.o00000(b$_db.oOO000, s2));
                }
                if ((n2 & 0x10) != 16) break block36;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 0x10) == 16) {
                        this.\u00d8\u00d4\u00d2000 = Collections.unmodifiableList(this.\u00d8\u00d4\u00d2000);
                    }
                    if ((n2 & 0x20) == 32) {
                        this.\u00f6\u00d4\u00d2000 = Collections.unmodifiableList(this.\u00f6\u00d4\u00d2000);
                    }
                    if ((n2 & 0x40) == 64) {
                        this.\u00d6\u00d4\u00d2000 = Collections.unmodifiableList(this.\u00d6\u00d4\u00d2000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00d5\u00d4\u00d2000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00d8\u00d4\u00d2000 = Collections.unmodifiableList(this.\u00d8\u00d4\u00d2000);
        }
        if ((n2 & 0x20) == 32) {
            this.\u00f6\u00d4\u00d2000 = Collections.unmodifiableList(this.\u00f6\u00d4\u00d2000);
        }
        if ((n2 & 0x40) == 64) {
            this.\u00d6\u00d4\u00d2000 = Collections.unmodifiableList(this.\u00d6\u00d4\u00d2000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d5\u00d4\u00d2000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00f6\u00d3\u00d2000;
    }

    public final boolean superfornew() {
        return (this.\u00f8\u00d3\u00d2000 & 1) == 1;
    }

    public final int voidfloatnew() {
        return this.\u00f8\u00d4\u00d2000;
    }

    public final boolean O\u00d6\u00d4000() {
        return (this.\u00f8\u00d3\u00d2000 & 2) == 2;
    }

    public final int \u00d6\u00d5\u00d4000() {
        return this.whilefloatsuper;
    }

    public final boolean \u00d4\u00d5\u00d4000() {
        return (this.\u00f8\u00d3\u00d2000 & 4) == 4;
    }

    public final boolean O\u00d5\u00d4000() {
        return this.iffloatsuper;
    }

    public final boolean publicfloatnew() {
        return (this.\u00f8\u00d3\u00d2000 & 8) == 8;
    }

    public final b$_b$_b \u00f6\u00d4\u00d4000() {
        return this.\u00f5\u00d4\u00d2000;
    }

    public final List \u00d3\u00d6\u00d4000() {
        return this.\u00d8\u00d4\u00d2000;
    }

    public final int \u00f4\u00d5\u00d4000() {
        return this.\u00d8\u00d4\u00d2000.size();
    }

    public final b$_nb \u00f6\u00f60000(int n2) {
        return (b$_nb)this.\u00d8\u00d4\u00d2000.get(n2);
    }

    public final List \u00d3\u00d5\u00d4000() {
        return this.\u00f6\u00d4\u00d2000;
    }

    public final List \u00d2\u00d5\u00d4000() {
        return this.\u00d6\u00d4\u00d2000;
    }

    public final int \u00d8\u00d5\u00d4000() {
        return this.\u00d6\u00d4\u00d2000.size();
    }

    public final b$_db \u00f8\u00f60000(int n2) {
        return (b$_db)this.\u00d6\u00d4\u00d2000.get(n2);
    }

    private void \u00f6\u00d5\u00d4000() {
        this.\u00f8\u00d4\u00d2000 = 0;
        this.whilefloatsuper = 0;
        this.iffloatsuper = false;
        this.\u00f5\u00d4\u00d2000 = b$_b$_b.return;
        this.\u00d8\u00d4\u00d2000 = Collections.emptyList();
        this.\u00f6\u00d4\u00d2000 = Collections.emptyList();
        this.\u00d6\u00d4\u00d2000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00d2\u00d4\u00d2000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (!this.superfornew()) {
            this.\u00d2\u00d4\u00d2000 = 0;
            return false;
        }
        if (!this.O\u00d6\u00d4000()) {
            this.\u00d2\u00d4\u00d2000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f4\u00d5\u00d4000(); ++n2) {
            if (this.\u00f6\u00f60000(n2).\u00d200000()) continue;
            this.\u00d2\u00d4\u00d2000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d8\u00d5\u00d4000(); ++n2) {
            if (this.\u00f8\u00f60000(n2).\u00d200000()) continue;
            this.\u00d2\u00d4\u00d2000 = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.\u00d2\u00d4\u00d2000 = 0;
            return false;
        }
        this.\u00d2\u00d4\u00d2000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.\u00f8\u00d3\u00d2000 & 1) == 1) {
            h2.return(1, this.\u00f8\u00d4\u00d2000);
        }
        if ((this.\u00f8\u00d3\u00d2000 & 2) == 2) {
            h2.return(2, this.whilefloatsuper);
        }
        if ((this.\u00f8\u00d3\u00d2000 & 4) == 4) {
            h2.o00000(3, this.iffloatsuper);
        }
        if ((this.\u00f8\u00d3\u00d2000 & 8) == 8) {
            h2.new(4, this.\u00f5\u00d4\u00d2000.super());
        }
        for (n2 = 0; n2 < this.\u00d8\u00d4\u00d2000.size(); ++n2) {
            h2.\u00d300000(5, (v)this.\u00d8\u00d4\u00d2000.get(n2));
        }
        if (this.\u00d3\u00d5\u00d4000().size() > 0) {
            h2.oO0000(50);
            h2.oO0000(this.\u00d3\u00d4\u00d2000);
        }
        for (n2 = 0; n2 < this.\u00f6\u00d4\u00d2000.size(); ++n2) {
            h2.o00000((Integer)this.\u00f6\u00d4\u00d2000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d6\u00d4\u00d2000.size(); ++n2) {
            h2.\u00d300000(100, (v)this.\u00d6\u00d4\u00d2000.get(n2));
        }
        d$_c$_b.o00000(1000, h2);
        h2.\u00d300000(this.\u00d5\u00d4\u00d2000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.returnfloatsuper;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        if ((this.\u00f8\u00d3\u00d2000 & 1) == 1) {
            n3 = 0 + h.\u00d500000(1, this.\u00f8\u00d4\u00d2000);
        }
        if ((this.\u00f8\u00d3\u00d2000 & 2) == 2) {
            n3 += h.\u00d500000(2, this.whilefloatsuper);
        }
        if ((this.\u00f8\u00d3\u00d2000 & 4) == 4) {
            n3 += h.new(3, this.iffloatsuper);
        }
        if ((this.\u00f8\u00d3\u00d2000 & 8) == 8) {
            n3 += h.o00000(4, this.\u00f5\u00d4\u00d2000.super());
        }
        for (n2 = 0; n2 < this.\u00d8\u00d4\u00d2000.size(); ++n2) {
            n3 += h.o00000(5, (v)this.\u00d8\u00d4\u00d2000.get(n2));
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.\u00f6\u00d4\u00d2000.size(); ++i2) {
            n2 += h.\u00f500000((Integer)this.\u00f6\u00d4\u00d2000.get(i2));
        }
        n3 += n2;
        if (!this.\u00d3\u00d5\u00d4000().isEmpty()) {
            ++n3;
            n3 += h.\u00f500000(n2);
        }
        this.\u00d3\u00d4\u00d2000 = n2;
        for (n2 = 0; n2 < this.\u00d6\u00d4\u00d2000.size(); ++n2) {
            n3 += h.o00000(100, (v)this.\u00d6\u00d4\u00d2000.get(n2));
        }
        this.returnfloatsuper = n3 = n3 + this.\u00d6\u00d6o000() + this.\u00d5\u00d4\u00d2000.\u00f400000();
        return n3;
    }

    public static b$_b$_c floatfloatnew() {
        return b$_b$_c.\u00d6\u00d6\u00d4000();
    }

    public final b$_b$_c Objectfloatnew() {
        return b$_b.floatfloatnew();
    }

    public static b$_b$_c \u00d300000(b$_b b$_b) {
        return b$_b.floatfloatnew().\u00d600000(b$_b);
    }

    public final b$_b$_c \u00d2\u00d6\u00d4000() {
        return b$_b.\u00d300000(this);
    }

    /* synthetic */ b$_b(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_b(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ int \u00d300000(b$_b b$_b, int n2) {
        b$_b.\u00f8\u00d4\u00d2000 = n2;
        return b$_b.\u00f8\u00d4\u00d2000;
    }

    static /* synthetic */ int super(b$_b b$_b, int n2) {
        b$_b.whilefloatsuper = n2;
        return b$_b.whilefloatsuper;
    }

    static /* synthetic */ boolean super(b$_b b$_b, boolean bl) {
        b$_b.iffloatsuper = bl;
        return b$_b.iffloatsuper;
    }

    static /* synthetic */ b$_b$_b super(b$_b b$_b, b$_b$_b b$_b$_b) {
        b$_b.\u00f5\u00d4\u00d2000 = b$_b$_b;
        return b$_b.\u00f5\u00d4\u00d2000;
    }

    static /* synthetic */ List \u00d300000(b$_b b$_b, List list) {
        b$_b.\u00d8\u00d4\u00d2000 = list;
        return b$_b.\u00d8\u00d4\u00d2000;
    }

    static /* synthetic */ List \u00d200000(b$_b b$_b, List list) {
        b$_b.\u00f6\u00d4\u00d2000 = list;
        return b$_b.\u00f6\u00d4\u00d2000;
    }

    static /* synthetic */ List super(b$_b b$_b, List list) {
        b$_b.\u00d6\u00d4\u00d2000 = list;
        return b$_b.\u00d6\u00d4\u00d2000;
    }

    static /* synthetic */ int \u00d200000(b$_b b$_b, int n2) {
        b$_b.\u00f8\u00d3\u00d2000 = n2;
        return b$_b.\u00f8\u00d3\u00d2000;
    }

    static /* synthetic */ List \u00d400000(b$_b b$_b) {
        return b$_b.\u00d8\u00d4\u00d2000;
    }

    static /* synthetic */ List super(b$_b b$_b) {
        return b$_b.\u00f6\u00d4\u00d2000;
    }

    static /* synthetic */ List \u00d200000(b$_b b$_b) {
        return b$_b.\u00d6\u00d4\u00d2000;
    }

    static /* synthetic */ b class(b$_b b$_b) {
        return b$_b.\u00d5\u00d4\u00d2000;
    }

    static {
        \u00f6\u00d3\u00d2000 = new b$_b$1();
        o\u00d4\u00d2000 = new b$_b(true);
        o\u00d4\u00d2000.\u00f6\u00d5\u00d4000();
    }
}

