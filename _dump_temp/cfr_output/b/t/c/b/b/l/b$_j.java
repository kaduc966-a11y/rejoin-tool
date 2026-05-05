/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_j$1;
import b.t.c.b.b.l.b$_j$_b;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_d;
import b.t.c.b.b.l.b$_x;
import b.t.c.b.b.l.b$_y;
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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_j
extends d$_c
implements b$_x {
    private static final b$_j \u00d6\u00d5o000;
    private final b \u00f6\u00d5o000;
    public static c \u00d3\u00d5o000;
    private int ifObjectsuper;
    private int \u00d6\u00d6o000;
    private int \u00d3\u00d6o000;
    private List \u00d2\u00d6o000;
    private b$_nb \u00f5\u00d5o000;
    private int o\u00d6o000;
    private b$_nb \u00d5\u00d6o000;
    private int StringStringsuper;
    private List thisStringsuper;
    private List \u00d8\u00d5o000;
    private List \u00f8\u00d5o000;
    private byte whileObjectsuper;
    private int \u00d5\u00d5o000;

    private b$_j(d$_g d$_g) {
        super(d$_g);
        this.whileObjectsuper = (byte)-1;
        this.\u00d5\u00d5o000 = -1;
        this.\u00f6\u00d5o000 = d$_g.class();
    }

    private b$_j(boolean bl) {
        this.whileObjectsuper = (byte)-1;
        this.\u00d5\u00d5o000 = -1;
        this.\u00f6\u00d5o000 = b.o00000;
    }

    public static b$_j \u00d2o\u00d3000() {
        return \u00d6\u00d5o000;
    }

    public final b$_j \u00f40\u00d3000() {
        return \u00d6\u00d5o000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_j(ab ab2, s s2) throws g {
        h h2;
        b.t.c.b.b.p.b$_b b$_b;
        int n2;
        block45: {
            this.whileObjectsuper = (byte)-1;
            this.\u00d5\u00d5o000 = -1;
            this.\u00d4o\u00d3000();
            n2 = 0;
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
                            this.ifObjectsuper |= 1;
                            this.\u00d6\u00d6o000 = ab2.\u00d3o0000();
                            continue block27;
                        }
                        case 16: {
                            this.ifObjectsuper |= 2;
                            this.\u00d3\u00d6o000 = ab2.\u00d3o0000();
                            continue block27;
                        }
                        case 26: {
                            if ((n2 & 4) != 4) {
                                this.\u00d2\u00d6o000 = new ArrayList();
                                n2 |= 4;
                            }
                            this.\u00d2\u00d6o000.add(ab2.o00000(b$_b.\u00f6\u00d3\u00d2000, s2));
                            continue block27;
                        }
                        case 34: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.ifObjectsuper & 4) == 4) {
                                b$_nb$_d = this.\u00f5\u00d5o000.\u00f4O\u00d4000();
                            }
                            this.\u00f5\u00d5o000 = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.\u00f5\u00d5o000);
                                this.\u00f5\u00d5o000 = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.ifObjectsuper |= 4;
                            continue block27;
                        }
                        case 40: {
                            this.ifObjectsuper |= 8;
                            this.o\u00d6o000 = ab2.\u00d3o0000();
                            continue block27;
                        }
                        case 50: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.ifObjectsuper & 0x10) == 16) {
                                b$_nb$_d = this.\u00d5\u00d6o000.\u00f4O\u00d4000();
                            }
                            this.\u00d5\u00d6o000 = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.\u00d5\u00d6o000);
                                this.\u00d5\u00d6o000 = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.ifObjectsuper |= 0x10;
                            continue block27;
                        }
                        case 56: {
                            this.ifObjectsuper |= 0x20;
                            this.StringStringsuper = ab2.\u00d3o0000();
                            continue block27;
                        }
                        case 66: {
                            if ((n2 & 0x80) != 128) {
                                this.thisStringsuper = new ArrayList();
                                n2 |= 0x80;
                            }
                            this.thisStringsuper.add(ab2.o00000(b$_db.oOO000, s2));
                            continue block27;
                        }
                        case 248: {
                            if ((n2 & 0x100) != 256) {
                                this.\u00d8\u00d5o000 = new ArrayList();
                                n2 |= 0x100;
                            }
                            this.\u00d8\u00d5o000.add(ab2.\u00d3o0000());
                            continue block27;
                        }
                        case 250: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 0x100) != 256 && ab2.newsuper() > 0) {
                                this.\u00d8\u00d5o000 = new ArrayList();
                                n2 |= 0x100;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00d8\u00d5o000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block27;
                        }
                        case 258: 
                    }
                    if ((n2 & 0x200) != 512) {
                        this.\u00f8\u00d5o000 = new ArrayList();
                        n2 |= 0x200;
                    }
                    this.\u00f8\u00d5o000.add(ab2.o00000(b$_y.\u00d2\u00f40000, s2));
                }
                if ((n2 & 4) != 4) break block45;
            }
            catch (g g2) {
                try {
                    throw g2.o00000(this);
                    catch (IOException iOException) {
                        throw new g(iOException.getMessage()).o00000(this);
                    }
                }
                catch (Throwable throwable) {
                    if ((n2 & 4) == 4) {
                        this.\u00d2\u00d6o000 = Collections.unmodifiableList(this.\u00d2\u00d6o000);
                    }
                    if ((n2 & 0x80) == 128) {
                        this.thisStringsuper = Collections.unmodifiableList(this.thisStringsuper);
                    }
                    if ((n2 & 0x100) == 256) {
                        this.\u00d8\u00d5o000 = Collections.unmodifiableList(this.\u00d8\u00d5o000);
                    }
                    if ((n2 & 0x200) == 512) {
                        this.\u00f8\u00d5o000 = Collections.unmodifiableList(this.\u00f8\u00d5o000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00f6\u00d5o000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00d2\u00d6o000 = Collections.unmodifiableList(this.\u00d2\u00d6o000);
        }
        if ((n2 & 0x80) == 128) {
            this.thisStringsuper = Collections.unmodifiableList(this.thisStringsuper);
        }
        if ((n2 & 0x100) == 256) {
            this.\u00d8\u00d5o000 = Collections.unmodifiableList(this.\u00d8\u00d5o000);
        }
        if ((n2 & 0x200) == 512) {
            this.\u00f8\u00d5o000 = Collections.unmodifiableList(this.\u00f8\u00d5o000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00f6\u00d5o000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d3\u00d5o000;
    }

    public final boolean \u00d6O\u00d3000() {
        return (this.ifObjectsuper & 1) == 1;
    }

    public final int floatinterfacesuper() {
        return this.\u00d6\u00d6o000;
    }

    public final boolean classthisnew() {
        return (this.ifObjectsuper & 2) == 2;
    }

    public final int \u00f8O\u00d3000() {
        return this.\u00d3\u00d6o000;
    }

    public final List voidinterfacesuper() {
        return this.\u00d2\u00d6o000;
    }

    public final int \u00f60\u00d3000() {
        return this.\u00d2\u00d6o000.size();
    }

    public final b$_b O\u00d80000(int n2) {
        return (b$_b)this.\u00d2\u00d6o000.get(n2);
    }

    public final boolean \u00d8O\u00d3000() {
        return (this.ifObjectsuper & 4) == 4;
    }

    public final b$_nb OO\u00d3000() {
        return this.\u00f5\u00d5o000;
    }

    public final boolean \u00f6O\u00d3000() {
        return (this.ifObjectsuper & 8) == 8;
    }

    public final int \u00d3o\u00d3000() {
        return this.o\u00d6o000;
    }

    public final boolean \u00f80\u00d3000() {
        return (this.ifObjectsuper & 0x10) == 16;
    }

    public final b$_nb \u00d6o\u00d3000() {
        return this.\u00d5\u00d6o000;
    }

    public final boolean \u00d2O\u00d3000() {
        return (this.ifObjectsuper & 0x20) == 32;
    }

    public final int \u00d4O\u00d3000() {
        return this.StringStringsuper;
    }

    public final List publicinterfacesuper() {
        return this.thisStringsuper;
    }

    public final int Oo\u00d3000() {
        return this.thisStringsuper.size();
    }

    public final b$_db \u00f8\u00d60000(int n2) {
        return (b$_db)this.thisStringsuper.get(n2);
    }

    public final List Objectinterfacesuper() {
        return this.\u00d8\u00d5o000;
    }

    public final int \u00f4O\u00d3000() {
        return this.\u00f8\u00d5o000.size();
    }

    public final b$_y \u00f6\u00d60000(int n2) {
        return (b$_y)this.\u00f8\u00d5o000.get(n2);
    }

    private void \u00d4o\u00d3000() {
        this.\u00d6\u00d6o000 = 6;
        this.\u00d3\u00d6o000 = 0;
        this.\u00d2\u00d6o000 = Collections.emptyList();
        this.\u00f5\u00d5o000 = b$_nb.\u00d2o\u00d4000();
        this.o\u00d6o000 = 0;
        this.\u00d5\u00d6o000 = b$_nb.\u00d2o\u00d4000();
        this.StringStringsuper = 0;
        this.thisStringsuper = Collections.emptyList();
        this.\u00d8\u00d5o000 = Collections.emptyList();
        this.\u00f8\u00d5o000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.whileObjectsuper;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (!this.classthisnew()) {
            this.whileObjectsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f60\u00d3000(); ++n2) {
            if (this.O\u00d80000(n2).\u00d200000()) continue;
            this.whileObjectsuper = 0;
            return false;
        }
        if (this.\u00d8O\u00d3000() && !this.OO\u00d3000().\u00d200000()) {
            this.whileObjectsuper = 0;
            return false;
        }
        if (this.\u00f80\u00d3000() && !this.\u00d6o\u00d3000().\u00d200000()) {
            this.whileObjectsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.Oo\u00d3000(); ++n2) {
            if (this.\u00f8\u00d60000(n2).\u00d200000()) continue;
            this.whileObjectsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f4O\u00d3000(); ++n2) {
            if (this.\u00f6\u00d60000(n2).\u00d200000()) continue;
            this.whileObjectsuper = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.whileObjectsuper = 0;
            return false;
        }
        this.whileObjectsuper = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.ifObjectsuper & 1) == 1) {
            h2.return(1, this.\u00d6\u00d6o000);
        }
        if ((this.ifObjectsuper & 2) == 2) {
            h2.return(2, this.\u00d3\u00d6o000);
        }
        for (n2 = 0; n2 < this.\u00d2\u00d6o000.size(); ++n2) {
            h2.\u00d300000(3, (v)this.\u00d2\u00d6o000.get(n2));
        }
        if ((this.ifObjectsuper & 4) == 4) {
            h2.\u00d300000(4, this.\u00f5\u00d5o000);
        }
        if ((this.ifObjectsuper & 8) == 8) {
            h2.return(5, this.o\u00d6o000);
        }
        if ((this.ifObjectsuper & 0x10) == 16) {
            h2.\u00d300000(6, this.\u00d5\u00d6o000);
        }
        if ((this.ifObjectsuper & 0x20) == 32) {
            h2.return(7, this.StringStringsuper);
        }
        for (n2 = 0; n2 < this.thisStringsuper.size(); ++n2) {
            h2.\u00d300000(8, (v)this.thisStringsuper.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d8\u00d5o000.size(); ++n2) {
            h2.return(31, (Integer)this.\u00d8\u00d5o000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00f8\u00d5o000.size(); ++n2) {
            h2.\u00d300000(32, (v)this.\u00f8\u00d5o000.get(n2));
        }
        d$_c$_b.o00000(200, h2);
        h2.\u00d300000(this.\u00f6\u00d5o000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.\u00d5\u00d5o000;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        if ((this.ifObjectsuper & 1) == 1) {
            n3 = 0 + h.\u00d500000(1, this.\u00d6\u00d6o000);
        }
        if ((this.ifObjectsuper & 2) == 2) {
            n3 += h.\u00d500000(2, this.\u00d3\u00d6o000);
        }
        for (n2 = 0; n2 < this.\u00d2\u00d6o000.size(); ++n2) {
            n3 += h.o00000(3, (v)this.\u00d2\u00d6o000.get(n2));
        }
        if ((this.ifObjectsuper & 4) == 4) {
            n3 += h.o00000(4, this.\u00f5\u00d5o000);
        }
        if ((this.ifObjectsuper & 8) == 8) {
            n3 += h.\u00d500000(5, this.o\u00d6o000);
        }
        if ((this.ifObjectsuper & 0x10) == 16) {
            n3 += h.o00000(6, this.\u00d5\u00d6o000);
        }
        if ((this.ifObjectsuper & 0x20) == 32) {
            n3 += h.\u00d500000(7, this.StringStringsuper);
        }
        for (n2 = 0; n2 < this.thisStringsuper.size(); ++n2) {
            n3 += h.o00000(8, (v)this.thisStringsuper.get(n2));
        }
        n2 = 0;
        for (int i2 = 0; i2 < this.\u00d8\u00d5o000.size(); ++i2) {
            n2 += h.\u00f500000((Integer)this.\u00d8\u00d5o000.get(i2));
        }
        n3 = n3 + n2 + 2 * this.Objectinterfacesuper().size();
        for (n2 = 0; n2 < this.\u00f8\u00d5o000.size(); ++n2) {
            n3 += h.o00000(32, (v)this.\u00f8\u00d5o000.get(n2));
        }
        this.\u00d5\u00d5o000 = n3 = n3 + this.\u00d6\u00d6o000() + this.\u00f6\u00d5o000.\u00f400000();
        return n3;
    }

    public static b$_j \u00d400000(InputStream inputStream, s s2) throws IOException {
        return (b$_j)\u00d3\u00d5o000.new(inputStream, s2);
    }

    public static b$_j$_b \u00d3O\u00d3000() {
        return b$_j$_b.\u00d2\u00f8\u00d2000();
    }

    public final b$_j$_b \u00d80\u00d3000() {
        return b$_j.\u00d3O\u00d3000();
    }

    public static b$_j$_b \u00d600000(b$_j b$_j) {
        return b$_j.\u00d3O\u00d3000().super(b$_j);
    }

    public final b$_j$_b superthisnew() {
        return b$_j.\u00d600000(this);
    }

    /* synthetic */ b$_j(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_j(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ int \u00d200000(b$_j b$_j, int n2) {
        b$_j.\u00d6\u00d6o000 = n2;
        return b$_j.\u00d6\u00d6o000;
    }

    static /* synthetic */ int \u00d400000(b$_j b$_j, int n2) {
        b$_j.\u00d3\u00d6o000 = n2;
        return b$_j.\u00d3\u00d6o000;
    }

    static /* synthetic */ List super(b$_j b$_j, List list) {
        b$_j.\u00d2\u00d6o000 = list;
        return b$_j.\u00d2\u00d6o000;
    }

    static /* synthetic */ b$_nb \u00d200000(b$_j b$_j, b$_nb b$_nb) {
        b$_j.\u00f5\u00d5o000 = b$_nb;
        return b$_j.\u00f5\u00d5o000;
    }

    static /* synthetic */ int class(b$_j b$_j, int n2) {
        b$_j.o\u00d6o000 = n2;
        return b$_j.o\u00d6o000;
    }

    static /* synthetic */ b$_nb super(b$_j b$_j, b$_nb b$_nb) {
        b$_j.\u00d5\u00d6o000 = b$_nb;
        return b$_j.\u00d5\u00d6o000;
    }

    static /* synthetic */ int super(b$_j b$_j, int n2) {
        b$_j.StringStringsuper = n2;
        return b$_j.StringStringsuper;
    }

    static /* synthetic */ List \u00d400000(b$_j b$_j, List list) {
        b$_j.thisStringsuper = list;
        return b$_j.thisStringsuper;
    }

    static /* synthetic */ List \u00d300000(b$_j b$_j, List list) {
        b$_j.\u00d8\u00d5o000 = list;
        return b$_j.\u00d8\u00d5o000;
    }

    static /* synthetic */ List \u00d200000(b$_j b$_j, List list) {
        b$_j.\u00f8\u00d5o000 = list;
        return b$_j.\u00f8\u00d5o000;
    }

    static /* synthetic */ int \u00d300000(b$_j b$_j, int n2) {
        b$_j.ifObjectsuper = n2;
        return b$_j.ifObjectsuper;
    }

    static /* synthetic */ List \u00d300000(b$_j b$_j) {
        return b$_j.\u00d2\u00d6o000;
    }

    static /* synthetic */ List \u00d800000(b$_j b$_j) {
        return b$_j.thisStringsuper;
    }

    static /* synthetic */ List \u00d400000(b$_j b$_j) {
        return b$_j.\u00d8\u00d5o000;
    }

    static /* synthetic */ List \u00d200000(b$_j b$_j) {
        return b$_j.\u00f8\u00d5o000;
    }

    static /* synthetic */ b class(b$_j b$_j) {
        return b$_j.\u00f6\u00d5o000;
    }

    static {
        \u00d3\u00d5o000 = new b$_j$1();
        \u00d6\u00d5o000 = new b$_j(true);
        \u00d6\u00d5o000.\u00d4o\u00d3000();
    }
}

