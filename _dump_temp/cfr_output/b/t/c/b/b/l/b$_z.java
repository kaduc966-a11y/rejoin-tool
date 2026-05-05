/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_ab;
import b.t.c.b.b.l.b$_ab$_b;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_k;
import b.t.c.b.b.l.b$_mb;
import b.t.c.b.b.l.b$_mb$_b;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_d;
import b.t.c.b.b.l.b$_y;
import b.t.c.b.b.l.b$_z$1;
import b.t.c.b.b.l.b$_z$_b;
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
public final class b$_z
extends d$_c
implements b$_k {
    private static final b$_z \u00f5\u00f6o000;
    private final b \u00f50\u00d2000;
    public static c \u00d20\u00d2000;
    private int \u00d3\u00f8o000;
    private int \u00d30\u00d2000;
    private int \u00d8\u00f8o000;
    private int nullnullsuper;
    private b$_nb \u00f6\u00f6o000;
    private int \u00d5\u00f8o000;
    private List \u00f5\u00f8o000;
    private b$_nb thisnullsuper;
    private int returnvoidsuper;
    private List o0\u00d2000;
    private List \u00d60\u00d2000;
    private int \u00d2\u00f8o000;
    private List ifvoidsuper;
    private List \u00d80\u00d2000;
    private b$_mb o\u00f8o000;
    private List \u00f8\u00f8o000;
    private b$_ab \u00f8\u00f6o000;
    private List whilevoidsuper;
    private List \u00d6\u00f8o000;
    private List \u00d50\u00d2000;
    private byte Stringnullsuper;
    private int \u00f6\u00f8o000;

    private b$_z(d$_g d$_g) {
        super(d$_g);
        this.\u00d2\u00f8o000 = -1;
        this.Stringnullsuper = (byte)-1;
        this.\u00f6\u00f8o000 = -1;
        this.\u00f50\u00d2000 = d$_g.class();
    }

    private b$_z(boolean bl) {
        this.\u00d2\u00f8o000 = -1;
        this.Stringnullsuper = (byte)-1;
        this.\u00f6\u00f8o000 = -1;
        this.\u00f50\u00d2000 = b.o00000;
    }

    public static b$_z \u00d3\u00f5\u00d3000() {
        return \u00f5\u00f6o000;
    }

    public final b$_z \u00d8\u00f5\u00d3000() {
        return \u00f5\u00f6o000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_z(ab ab2, s s2) throws g {
        h h2;
        b.t.c.b.b.p.b$_b b$_b;
        int n2;
        block75: {
            this.\u00d2\u00f8o000 = -1;
            this.Stringnullsuper = (byte)-1;
            this.\u00f6\u00f8o000 = -1;
            this.\u00d8\u00f8\u00d3000();
            n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block36: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block36;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block36;
                            bl = true;
                            continue block36;
                        }
                        case 8: {
                            this.\u00d3\u00f8o000 |= 2;
                            this.\u00d8\u00f8o000 = ab2.\u00d3o0000();
                            continue block36;
                        }
                        case 16: {
                            this.\u00d3\u00f8o000 |= 4;
                            this.nullnullsuper = ab2.\u00d3o0000();
                            continue block36;
                        }
                        case 26: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.\u00d3\u00f8o000 & 8) == 8) {
                                b$_nb$_d = this.\u00f6\u00f6o000.\u00f4O\u00d4000();
                            }
                            this.\u00f6\u00f6o000 = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.\u00f6\u00f6o000);
                                this.\u00f6\u00f6o000 = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.\u00d3\u00f8o000 |= 8;
                            continue block36;
                        }
                        case 34: {
                            if ((n2 & 0x20) != 32) {
                                this.\u00f5\u00f8o000 = new ArrayList();
                                n2 |= 0x20;
                            }
                            this.\u00f5\u00f8o000.add(ab2.o00000(b$_b.\u00f6\u00d3\u00d2000, s2));
                            continue block36;
                        }
                        case 42: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.\u00d3\u00f8o000 & 0x20) == 32) {
                                b$_nb$_d = this.thisnullsuper.\u00f4O\u00d4000();
                            }
                            this.thisnullsuper = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.thisnullsuper);
                                this.thisnullsuper = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.\u00d3\u00f8o000 |= 0x20;
                            continue block36;
                        }
                        case 50: {
                            if ((n2 & 0x800) != 2048) {
                                this.\u00d80\u00d2000 = new ArrayList();
                                n2 |= 0x800;
                            }
                            this.\u00d80\u00d2000.add(ab2.o00000(b$_c.Stringwhile, s2));
                            continue block36;
                        }
                        case 56: {
                            this.\u00d3\u00f8o000 |= 0x10;
                            this.\u00d5\u00f8o000 = ab2.\u00d3o0000();
                            continue block36;
                        }
                        case 64: {
                            this.\u00d3\u00f8o000 |= 0x40;
                            this.returnvoidsuper = ab2.\u00d3o0000();
                            continue block36;
                        }
                        case 72: {
                            this.\u00d3\u00f8o000 |= 1;
                            this.\u00d30\u00d2000 = ab2.\u00d3o0000();
                            continue block36;
                        }
                        case 82: {
                            if ((n2 & 0x100) != 256) {
                                this.o0\u00d2000 = new ArrayList();
                                n2 |= 0x100;
                            }
                            this.o0\u00d2000.add(ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2));
                            continue block36;
                        }
                        case 88: {
                            if ((n2 & 0x200) != 512) {
                                this.\u00d60\u00d2000 = new ArrayList();
                                n2 |= 0x200;
                            }
                            this.\u00d60\u00d2000.add(ab2.\u00d3o0000());
                            continue block36;
                        }
                        case 90: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 0x200) != 512 && ab2.newsuper() > 0) {
                                this.\u00d60\u00d2000 = new ArrayList();
                                n2 |= 0x200;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00d60\u00d2000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block36;
                        }
                        case 98: {
                            if ((n2 & 0x10000) != 65536) {
                                this.\u00d6\u00f8o000 = new ArrayList();
                                n2 |= 0x10000;
                            }
                            this.\u00d6\u00f8o000.add(ab2.o00000(b$_db.oOO000, s2));
                            continue block36;
                        }
                        case 106: {
                            if ((n2 & 0x400) != 1024) {
                                this.ifvoidsuper = new ArrayList();
                                n2 |= 0x400;
                            }
                            this.ifvoidsuper.add(ab2.o00000(b$_c.Stringwhile, s2));
                            continue block36;
                        }
                        case 242: {
                            b$_mb$_b b$_mb$_b = null;
                            if ((this.\u00d3\u00f8o000 & 0x80) == 128) {
                                b$_mb$_b = this.o\u00f8o000.\u00d2oo000();
                            }
                            this.o\u00f8o000 = (b$_mb)ab2.o00000(b$_mb.\u00d5\u00d3O000, s2);
                            if (b$_mb$_b != null) {
                                b$_mb$_b.super(this.o\u00f8o000);
                                this.o\u00f8o000 = b$_mb$_b.\u00d6Oo000();
                            }
                            this.\u00d3\u00f8o000 |= 0x80;
                            continue block36;
                        }
                        case 248: {
                            if ((n2 & 0x2000) != 8192) {
                                this.\u00f8\u00f8o000 = new ArrayList();
                                n2 |= 0x2000;
                            }
                            this.\u00f8\u00f8o000.add(ab2.\u00d3o0000());
                            continue block36;
                        }
                        case 250: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 0x2000) != 8192 && ab2.newsuper() > 0) {
                                this.\u00f8\u00f8o000 = new ArrayList();
                                n2 |= 0x2000;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00f8\u00f8o000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block36;
                        }
                        case 258: {
                            b$_ab$_b b$_ab$_b = null;
                            if ((this.\u00d3\u00f8o000 & 0x100) == 256) {
                                b$_ab$_b = this.\u00f8\u00f6o000.\u00f4oO000();
                            }
                            this.\u00f8\u00f6o000 = (b$_ab)ab2.o00000(b$_ab.\u00f6\u00f40000, s2);
                            if (b$_ab$_b != null) {
                                b$_ab$_b.super(this.\u00f8\u00f6o000);
                                this.\u00f8\u00f6o000 = b$_ab$_b.\u00d2oO000();
                            }
                            this.\u00d3\u00f8o000 |= 0x100;
                            continue block36;
                        }
                        case 266: {
                            if ((n2 & 0x8000) != 32768) {
                                this.whilevoidsuper = new ArrayList();
                                n2 |= 0x8000;
                            }
                            this.whilevoidsuper.add(ab2.o00000(b$_y.\u00d2\u00f40000, s2));
                            continue block36;
                        }
                        case 274: 
                    }
                    if ((n2 & 0x20000) != 131072) {
                        this.\u00d50\u00d2000 = new ArrayList();
                        n2 |= 0x20000;
                    }
                    this.\u00d50\u00d2000.add(ab2.o00000(b$_db.oOO000, s2));
                }
                if ((n2 & 0x20) != 32) break block75;
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
                        this.\u00f5\u00f8o000 = Collections.unmodifiableList(this.\u00f5\u00f8o000);
                    }
                    if ((n2 & 0x800) == 2048) {
                        this.\u00d80\u00d2000 = Collections.unmodifiableList(this.\u00d80\u00d2000);
                    }
                    if ((n2 & 0x100) == 256) {
                        this.o0\u00d2000 = Collections.unmodifiableList(this.o0\u00d2000);
                    }
                    if ((n2 & 0x200) == 512) {
                        this.\u00d60\u00d2000 = Collections.unmodifiableList(this.\u00d60\u00d2000);
                    }
                    if ((n2 & 0x10000) == 65536) {
                        this.\u00d6\u00f8o000 = Collections.unmodifiableList(this.\u00d6\u00f8o000);
                    }
                    if ((n2 & 0x400) == 1024) {
                        this.ifvoidsuper = Collections.unmodifiableList(this.ifvoidsuper);
                    }
                    if ((n2 & 0x2000) == 8192) {
                        this.\u00f8\u00f8o000 = Collections.unmodifiableList(this.\u00f8\u00f8o000);
                    }
                    if ((n2 & 0x8000) == 32768) {
                        this.whilevoidsuper = Collections.unmodifiableList(this.whilevoidsuper);
                    }
                    if ((n2 & 0x20000) == 131072) {
                        this.\u00d50\u00d2000 = Collections.unmodifiableList(this.\u00d50\u00d2000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00f50\u00d2000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f5\u00f8o000 = Collections.unmodifiableList(this.\u00f5\u00f8o000);
        }
        if ((n2 & 0x800) == 2048) {
            this.\u00d80\u00d2000 = Collections.unmodifiableList(this.\u00d80\u00d2000);
        }
        if ((n2 & 0x100) == 256) {
            this.o0\u00d2000 = Collections.unmodifiableList(this.o0\u00d2000);
        }
        if ((n2 & 0x200) == 512) {
            this.\u00d60\u00d2000 = Collections.unmodifiableList(this.\u00d60\u00d2000);
        }
        if ((n2 & 0x10000) == 65536) {
            this.\u00d6\u00f8o000 = Collections.unmodifiableList(this.\u00d6\u00f8o000);
        }
        if ((n2 & 0x400) == 1024) {
            this.ifvoidsuper = Collections.unmodifiableList(this.ifvoidsuper);
        }
        if ((n2 & 0x2000) == 8192) {
            this.\u00f8\u00f8o000 = Collections.unmodifiableList(this.\u00f8\u00f8o000);
        }
        if ((n2 & 0x8000) == 32768) {
            this.whilevoidsuper = Collections.unmodifiableList(this.whilevoidsuper);
        }
        if ((n2 & 0x20000) == 131072) {
            this.\u00d50\u00d2000 = Collections.unmodifiableList(this.\u00d50\u00d2000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00f50\u00d2000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d20\u00d2000;
    }

    public final boolean \u00f4\u00f8\u00d3000() {
        return (this.\u00d3\u00f8o000 & 1) == 1;
    }

    public final int \u00d6\u00f5\u00d3000() {
        return this.\u00d30\u00d2000;
    }

    public final boolean \u00f8\u00f4\u00d3000() {
        return (this.\u00d3\u00f8o000 & 2) == 2;
    }

    public final int floatclassnew() {
        return this.\u00d8\u00f8o000;
    }

    public final boolean \u00f6\u00f4\u00d3000() {
        return (this.\u00d3\u00f8o000 & 4) == 4;
    }

    public final int \u00d6\u00f8\u00d3000() {
        return this.nullnullsuper;
    }

    public final boolean publicclassnew() {
        return (this.\u00d3\u00f8o000 & 8) == 8;
    }

    public final b$_nb \u00d4\u00f8\u00d3000() {
        return this.\u00f6\u00f6o000;
    }

    public final boolean \u00d2\u00f8\u00d3000() {
        return (this.\u00d3\u00f8o000 & 0x10) == 16;
    }

    public final int \u00d6\u00f4\u00d3000() {
        return this.\u00d5\u00f8o000;
    }

    public final List O\u00f8\u00d3000() {
        return this.\u00f5\u00f8o000;
    }

    public final int intreturnnew() {
        return this.\u00f5\u00f8o000.size();
    }

    public final b$_b interfacereturn(int n2) {
        return (b$_b)this.\u00f5\u00f8o000.get(n2);
    }

    public final boolean Objectclassnew() {
        return (this.\u00d3\u00f8o000 & 0x20) == 32;
    }

    public final b$_nb \u00d2\u00f5\u00d3000() {
        return this.thisnullsuper;
    }

    public final boolean O\u00f6\u00d3000() {
        return (this.\u00d3\u00f8o000 & 0x40) == 64;
    }

    public final int \u00d6\u00f6\u00d3000() {
        return this.returnvoidsuper;
    }

    public final List \u00d4\u00f6\u00d3000() {
        return this.o0\u00d2000;
    }

    public final int \u00f4\u00f6\u00d3000() {
        return this.o0\u00d2000.size();
    }

    public final b$_nb \u00f8\u00f40000(int n2) {
        return (b$_nb)this.o0\u00d2000.get(n2);
    }

    public final List \u00d3\u00f8\u00d3000() {
        return this.\u00d60\u00d2000;
    }

    public final List O\u00f5\u00d3000() {
        return this.ifvoidsuper;
    }

    public final int \u00d3\u00f6\u00d3000() {
        return this.ifvoidsuper.size();
    }

    public final b$_c \u00d2\u00f50000(int n2) {
        return (b$_c)this.ifvoidsuper.get(n2);
    }

    public final List classreturnnew() {
        return this.\u00d80\u00d2000;
    }

    public final int \u00f8\u00f6\u00d3000() {
        return this.\u00d80\u00d2000.size();
    }

    public final b$_c \u00d3\u00f50000(int n2) {
        return (b$_c)this.\u00d80\u00d2000.get(n2);
    }

    public final boolean \u00d8\u00f4\u00d3000() {
        return (this.\u00d3\u00f8o000 & 0x80) == 128;
    }

    public final b$_mb voidclassnew() {
        return this.o\u00f8o000;
    }

    public final List \u00d2\u00f6\u00d3000() {
        return this.\u00f8\u00f8o000;
    }

    public final boolean interfacereturnnew() {
        return (this.\u00d3\u00f8o000 & 0x100) == 256;
    }

    public final b$_ab \u00f8\u00f5\u00d3000() {
        return this.\u00f8\u00f6o000;
    }

    public final int \u00f4\u00f4\u00d3000() {
        return this.whilevoidsuper.size();
    }

    public final b$_y O\u00f50000(int n2) {
        return (b$_y)this.whilevoidsuper.get(n2);
    }

    public final List superreturnnew() {
        return this.\u00d6\u00f8o000;
    }

    public final int \u00d8\u00f6\u00d3000() {
        return this.\u00d6\u00f8o000.size();
    }

    public final b$_db doreturn(int n2) {
        return (b$_db)this.\u00d6\u00f8o000.get(n2);
    }

    public final List \u00f6\u00f5\u00d3000() {
        return this.\u00d50\u00d2000;
    }

    public final int doreturnnew() {
        return this.\u00d50\u00d2000.size();
    }

    public final b$_db \u00d4\u00f50000(int n2) {
        return (b$_db)this.\u00d50\u00d2000.get(n2);
    }

    private void \u00d8\u00f8\u00d3000() {
        this.\u00d30\u00d2000 = 6;
        this.\u00d8\u00f8o000 = 6;
        this.nullnullsuper = 0;
        this.\u00f6\u00f6o000 = b$_nb.\u00d2o\u00d4000();
        this.\u00d5\u00f8o000 = 0;
        this.\u00f5\u00f8o000 = Collections.emptyList();
        this.thisnullsuper = b$_nb.\u00d2o\u00d4000();
        this.returnvoidsuper = 0;
        this.o0\u00d2000 = Collections.emptyList();
        this.\u00d60\u00d2000 = Collections.emptyList();
        this.ifvoidsuper = Collections.emptyList();
        this.\u00d80\u00d2000 = Collections.emptyList();
        this.o\u00f8o000 = b$_mb.\u00d4oo000();
        this.\u00f8\u00f8o000 = Collections.emptyList();
        this.\u00f8\u00f6o000 = b$_ab.intif();
        this.whilevoidsuper = Collections.emptyList();
        this.\u00d6\u00f8o000 = Collections.emptyList();
        this.\u00d50\u00d2000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.Stringnullsuper;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (!this.\u00f6\u00f4\u00d3000()) {
            this.Stringnullsuper = 0;
            return false;
        }
        if (this.publicclassnew() && !this.\u00d4\u00f8\u00d3000().\u00d200000()) {
            this.Stringnullsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.intreturnnew(); ++n2) {
            if (this.interfacereturn(n2).\u00d200000()) continue;
            this.Stringnullsuper = 0;
            return false;
        }
        if (this.Objectclassnew() && !this.\u00d2\u00f5\u00d3000().\u00d200000()) {
            this.Stringnullsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f4\u00f6\u00d3000(); ++n2) {
            if (this.\u00f8\u00f40000(n2).\u00d200000()) continue;
            this.Stringnullsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00f6\u00d3000(); ++n2) {
            if (this.\u00d2\u00f50000(n2).\u00d200000()) continue;
            this.Stringnullsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f8\u00f6\u00d3000(); ++n2) {
            if (this.\u00d3\u00f50000(n2).\u00d200000()) continue;
            this.Stringnullsuper = 0;
            return false;
        }
        if (this.\u00d8\u00f4\u00d3000() && !this.voidclassnew().\u00d200000()) {
            this.Stringnullsuper = 0;
            return false;
        }
        if (this.interfacereturnnew() && !this.\u00f8\u00f5\u00d3000().\u00d200000()) {
            this.Stringnullsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f4\u00f4\u00d3000(); ++n2) {
            if (this.O\u00f50000(n2).\u00d200000()) continue;
            this.Stringnullsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d8\u00f6\u00d3000(); ++n2) {
            if (this.doreturn(n2).\u00d200000()) continue;
            this.Stringnullsuper = 0;
            return false;
        }
        for (n2 = 0; n2 < this.doreturnnew(); ++n2) {
            if (this.\u00d4\u00f50000(n2).\u00d200000()) continue;
            this.Stringnullsuper = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.Stringnullsuper = 0;
            return false;
        }
        this.Stringnullsuper = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.\u00d3\u00f8o000 & 2) == 2) {
            h2.return(1, this.\u00d8\u00f8o000);
        }
        if ((this.\u00d3\u00f8o000 & 4) == 4) {
            h2.return(2, this.nullnullsuper);
        }
        if ((this.\u00d3\u00f8o000 & 8) == 8) {
            h2.\u00d300000(3, this.\u00f6\u00f6o000);
        }
        for (n2 = 0; n2 < this.\u00f5\u00f8o000.size(); ++n2) {
            h2.\u00d300000(4, (v)this.\u00f5\u00f8o000.get(n2));
        }
        if ((this.\u00d3\u00f8o000 & 0x20) == 32) {
            h2.\u00d300000(5, this.thisnullsuper);
        }
        for (n2 = 0; n2 < this.\u00d80\u00d2000.size(); ++n2) {
            h2.\u00d300000(6, (v)this.\u00d80\u00d2000.get(n2));
        }
        if ((this.\u00d3\u00f8o000 & 0x10) == 16) {
            h2.return(7, this.\u00d5\u00f8o000);
        }
        if ((this.\u00d3\u00f8o000 & 0x40) == 64) {
            h2.return(8, this.returnvoidsuper);
        }
        if ((this.\u00d3\u00f8o000 & 1) == 1) {
            h2.return(9, this.\u00d30\u00d2000);
        }
        for (n2 = 0; n2 < this.o0\u00d2000.size(); ++n2) {
            h2.\u00d300000(10, (v)this.o0\u00d2000.get(n2));
        }
        if (this.\u00d3\u00f8\u00d3000().size() > 0) {
            h2.oO0000(90);
            h2.oO0000(this.\u00d2\u00f8o000);
        }
        for (n2 = 0; n2 < this.\u00d60\u00d2000.size(); ++n2) {
            h2.o00000((Integer)this.\u00d60\u00d2000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d6\u00f8o000.size(); ++n2) {
            h2.\u00d300000(12, (v)this.\u00d6\u00f8o000.get(n2));
        }
        for (n2 = 0; n2 < this.ifvoidsuper.size(); ++n2) {
            h2.\u00d300000(13, (v)this.ifvoidsuper.get(n2));
        }
        if ((this.\u00d3\u00f8o000 & 0x80) == 128) {
            h2.\u00d300000(30, this.o\u00f8o000);
        }
        for (n2 = 0; n2 < this.\u00f8\u00f8o000.size(); ++n2) {
            h2.return(31, (Integer)this.\u00f8\u00f8o000.get(n2));
        }
        if ((this.\u00d3\u00f8o000 & 0x100) == 256) {
            h2.\u00d300000(32, this.\u00f8\u00f6o000);
        }
        for (n2 = 0; n2 < this.whilevoidsuper.size(); ++n2) {
            h2.\u00d300000(33, (v)this.whilevoidsuper.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d50\u00d2000.size(); ++n2) {
            h2.\u00d300000(34, (v)this.\u00d50\u00d2000.get(n2));
        }
        d$_c$_b.o00000(19000, h2);
        h2.\u00d300000(this.\u00f50\u00d2000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3;
        int n4 = this.\u00f6\u00f8o000;
        if (n4 != -1) {
            return n4;
        }
        n4 = 0;
        if ((this.\u00d3\u00f8o000 & 2) == 2) {
            n4 = 0 + h.\u00d500000(1, this.\u00d8\u00f8o000);
        }
        if ((this.\u00d3\u00f8o000 & 4) == 4) {
            n4 += h.\u00d500000(2, this.nullnullsuper);
        }
        if ((this.\u00d3\u00f8o000 & 8) == 8) {
            n4 += h.o00000(3, this.\u00f6\u00f6o000);
        }
        for (n3 = 0; n3 < this.\u00f5\u00f8o000.size(); ++n3) {
            n4 += h.o00000(4, (v)this.\u00f5\u00f8o000.get(n3));
        }
        if ((this.\u00d3\u00f8o000 & 0x20) == 32) {
            n4 += h.o00000(5, this.thisnullsuper);
        }
        for (n3 = 0; n3 < this.\u00d80\u00d2000.size(); ++n3) {
            n4 += h.o00000(6, (v)this.\u00d80\u00d2000.get(n3));
        }
        if ((this.\u00d3\u00f8o000 & 0x10) == 16) {
            n4 += h.\u00d500000(7, this.\u00d5\u00f8o000);
        }
        if ((this.\u00d3\u00f8o000 & 0x40) == 64) {
            n4 += h.\u00d500000(8, this.returnvoidsuper);
        }
        if ((this.\u00d3\u00f8o000 & 1) == 1) {
            n4 += h.\u00d500000(9, this.\u00d30\u00d2000);
        }
        for (n3 = 0; n3 < this.o0\u00d2000.size(); ++n3) {
            n4 += h.o00000(10, (v)this.o0\u00d2000.get(n3));
        }
        n3 = 0;
        for (n2 = 0; n2 < this.\u00d60\u00d2000.size(); ++n2) {
            n3 += h.\u00f500000((Integer)this.\u00d60\u00d2000.get(n2));
        }
        n4 += n3;
        if (!this.\u00d3\u00f8\u00d3000().isEmpty()) {
            ++n4;
            n4 += h.\u00f500000(n3);
        }
        this.\u00d2\u00f8o000 = n3;
        for (n3 = 0; n3 < this.\u00d6\u00f8o000.size(); ++n3) {
            n4 += h.o00000(12, (v)this.\u00d6\u00f8o000.get(n3));
        }
        for (n3 = 0; n3 < this.ifvoidsuper.size(); ++n3) {
            n4 += h.o00000(13, (v)this.ifvoidsuper.get(n3));
        }
        if ((this.\u00d3\u00f8o000 & 0x80) == 128) {
            n4 += h.o00000(30, this.o\u00f8o000);
        }
        n3 = 0;
        for (n2 = 0; n2 < this.\u00f8\u00f8o000.size(); ++n2) {
            n3 += h.\u00f500000((Integer)this.\u00f8\u00f8o000.get(n2));
        }
        n4 = n4 + n3 + 2 * this.\u00d2\u00f6\u00d3000().size();
        if ((this.\u00d3\u00f8o000 & 0x100) == 256) {
            n4 += h.o00000(32, this.\u00f8\u00f6o000);
        }
        for (n3 = 0; n3 < this.whilevoidsuper.size(); ++n3) {
            n4 += h.o00000(33, (v)this.whilevoidsuper.get(n3));
        }
        for (n3 = 0; n3 < this.\u00d50\u00d2000.size(); ++n3) {
            n4 += h.o00000(34, (v)this.\u00d50\u00d2000.get(n3));
        }
        this.\u00f6\u00f8o000 = n4 = n4 + this.\u00d6\u00d6o000() + this.\u00f50\u00d2000.\u00f400000();
        return n4;
    }

    public static b$_z class(InputStream inputStream, s s2) throws IOException {
        return (b$_z)\u00d20\u00d2000.o00000(inputStream, s2);
    }

    public static b$_z$_b \u00f4\u00f5\u00d3000() {
        return b$_z$_b.\u00d3\u00f4\u00d3000();
    }

    public final b$_z$_b \u00d4\u00f5\u00d3000() {
        return b$_z.\u00f4\u00f5\u00d3000();
    }

    public static b$_z$_b \u00d400000(b$_z b$_z) {
        return b$_z.\u00f4\u00f5\u00d3000().super(b$_z);
    }

    public final b$_z$_b \u00f6\u00f6\u00d3000() {
        return b$_z.\u00d400000(this);
    }

    /* synthetic */ b$_z(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_z(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ int class(b$_z b$_z, int n2) {
        b$_z.\u00d30\u00d2000 = n2;
        return b$_z.\u00d30\u00d2000;
    }

    static /* synthetic */ int super(b$_z b$_z, int n2) {
        b$_z.\u00d8\u00f8o000 = n2;
        return b$_z.\u00d8\u00f8o000;
    }

    static /* synthetic */ int \u00d300000(b$_z b$_z, int n2) {
        b$_z.nullnullsuper = n2;
        return b$_z.nullnullsuper;
    }

    static /* synthetic */ b$_nb \u00d200000(b$_z b$_z, b$_nb b$_nb) {
        b$_z.\u00f6\u00f6o000 = b$_nb;
        return b$_z.\u00f6\u00f6o000;
    }

    static /* synthetic */ int \u00d200000(b$_z b$_z, int n2) {
        b$_z.\u00d5\u00f8o000 = n2;
        return b$_z.\u00d5\u00f8o000;
    }

    static /* synthetic */ List \u00d400000(b$_z b$_z, List list) {
        b$_z.\u00f5\u00f8o000 = list;
        return b$_z.\u00f5\u00f8o000;
    }

    static /* synthetic */ b$_nb super(b$_z b$_z, b$_nb b$_nb) {
        b$_z.thisnullsuper = b$_nb;
        return b$_z.thisnullsuper;
    }

    static /* synthetic */ int \u00d600000(b$_z b$_z, int n2) {
        b$_z.returnvoidsuper = n2;
        return b$_z.returnvoidsuper;
    }

    static /* synthetic */ List \u00d800000(b$_z b$_z, List list) {
        b$_z.o0\u00d2000 = list;
        return b$_z.o0\u00d2000;
    }

    static /* synthetic */ List \u00d200000(b$_z b$_z, List list) {
        b$_z.\u00d60\u00d2000 = list;
        return b$_z.\u00d60\u00d2000;
    }

    static /* synthetic */ List int(b$_z b$_z, List list) {
        b$_z.ifvoidsuper = list;
        return b$_z.ifvoidsuper;
    }

    static /* synthetic */ List class(b$_z b$_z, List list) {
        b$_z.\u00d80\u00d2000 = list;
        return b$_z.\u00d80\u00d2000;
    }

    static /* synthetic */ b$_mb super(b$_z b$_z, b$_mb b$_mb) {
        b$_z.o\u00f8o000 = b$_mb;
        return b$_z.o\u00f8o000;
    }

    static /* synthetic */ List \u00d600000(b$_z b$_z, List list) {
        b$_z.\u00f8\u00f8o000 = list;
        return b$_z.\u00f8\u00f8o000;
    }

    static /* synthetic */ b$_ab super(b$_z b$_z, b$_ab b$_ab) {
        b$_z.\u00f8\u00f6o000 = b$_ab;
        return b$_z.\u00f8\u00f6o000;
    }

    static /* synthetic */ List super(b$_z b$_z, List list) {
        b$_z.whilevoidsuper = list;
        return b$_z.whilevoidsuper;
    }

    static /* synthetic */ List \u00f400000(b$_z b$_z, List list) {
        b$_z.\u00d6\u00f8o000 = list;
        return b$_z.\u00d6\u00f8o000;
    }

    static /* synthetic */ List \u00d300000(b$_z b$_z, List list) {
        b$_z.\u00d50\u00d2000 = list;
        return b$_z.\u00d50\u00d2000;
    }

    static /* synthetic */ int \u00d400000(b$_z b$_z, int n2) {
        b$_z.\u00d3\u00f8o000 = n2;
        return b$_z.\u00d3\u00f8o000;
    }

    static /* synthetic */ List \u00f600000(b$_z b$_z) {
        return b$_z.\u00f5\u00f8o000;
    }

    static /* synthetic */ List OO0000(b$_z b$_z) {
        return b$_z.o0\u00d2000;
    }

    static /* synthetic */ List class(b$_z b$_z) {
        return b$_z.\u00d60\u00d2000;
    }

    static /* synthetic */ List \u00f400000(b$_z b$_z) {
        return b$_z.ifvoidsuper;
    }

    static /* synthetic */ List \u00d200000(b$_z b$_z) {
        return b$_z.\u00d80\u00d2000;
    }

    static /* synthetic */ List int(b$_z b$_z) {
        return b$_z.\u00f8\u00f8o000;
    }

    static /* synthetic */ List \u00f800000(b$_z b$_z) {
        return b$_z.whilevoidsuper;
    }

    static /* synthetic */ List \u00d300000(b$_z b$_z) {
        return b$_z.\u00d6\u00f8o000;
    }

    static /* synthetic */ List \u00d800000(b$_z b$_z) {
        return b$_z.\u00d50\u00d2000;
    }

    static /* synthetic */ b \u00d600000(b$_z b$_z) {
        return b$_z.\u00f50\u00d2000;
    }

    static {
        \u00d20\u00d2000 = new b$_z$1();
        \u00f5\u00f6o000 = new b$_z(true);
        \u00f5\u00f6o000.\u00d8\u00f8\u00d3000();
    }
}

