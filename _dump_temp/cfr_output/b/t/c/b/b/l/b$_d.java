/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_d$1;
import b.t.c.b.b.l.b$_d$_c;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_f;
import b.t.c.b.b.l.b$_g;
import b.t.c.b.b.l.b$_g$_b;
import b.t.c.b.b.l.b$_j;
import b.t.c.b.b.l.b$_mb;
import b.t.c.b.b.l.b$_mb$_b;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_d;
import b.t.c.b.b.l.b$_qb;
import b.t.c.b.b.l.b$_rb;
import b.t.c.b.b.l.b$_y;
import b.t.c.b.b.l.b$_z;
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
public final class b$_d
extends d$_c
implements b$_qb {
    private static final b$_d \u00f6\u00f6O000;
    private final b \u00d2Oo000;
    public static c \u00d80o000;
    private int newinterface;
    private int whileinterface;
    private int o0o000;
    private int \u00f5\u00f6O000;
    private List returninterface;
    private List \u00f8\u00f6O000;
    private List \u00f80o000;
    private int forprivate;
    private List \u00d2\u00f8O000;
    private int oOo000;
    private List \u00d60o000;
    private List thisthissuper;
    private int \u00d6\u00f8O000;
    private List \u00d50o000;
    private List \u00d8\u00f6O000;
    private List \u00d6\u00f6O000;
    private List \u00d8\u00f8O000;
    private List \u00f50o000;
    private List ifinterface;
    private int \u00f5\u00f8O000;
    private int nullprivate;
    private b$_nb \u00d3\u00f8O000;
    private int privateprivate;
    private List \u00f6\u00f8O000;
    private b$_mb \u00d5\u00f8O000;
    private List \u00d30o000;
    private b$_g o\u00f8O000;
    private List \u00f8\u00f8O000;
    private byte \u00f60o000;
    private int \u00d20o000;

    private b$_d(d$_g d$_g) {
        super(d$_g);
        this.forprivate = -1;
        this.oOo000 = -1;
        this.\u00d6\u00f8O000 = -1;
        this.\u00f5\u00f8O000 = -1;
        this.\u00f60o000 = (byte)-1;
        this.\u00d20o000 = -1;
        this.\u00d2Oo000 = d$_g.class();
    }

    private b$_d(boolean bl) {
        this.forprivate = -1;
        this.oOo000 = -1;
        this.\u00d6\u00f8O000 = -1;
        this.\u00f5\u00f8O000 = -1;
        this.\u00f60o000 = (byte)-1;
        this.\u00d20o000 = -1;
        this.\u00d2Oo000 = b.o00000;
    }

    public static b$_d OO\u00d2000() {
        return \u00f6\u00f6O000;
    }

    public final b$_d \u00f6o\u00d2000() {
        return \u00f6\u00f6O000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_d(ab ab2, s s2) throws g {
        h h2;
        b.t.c.b.b.p.b$_b b$_b;
        int n2;
        block105: {
            this.forprivate = -1;
            this.oOo000 = -1;
            this.\u00d6\u00f8O000 = -1;
            this.\u00f5\u00f8O000 = -1;
            this.\u00f60o000 = (byte)-1;
            this.\u00d20o000 = -1;
            this.\u00f4\u00d3\u00d2000();
            n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block44: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block44;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block44;
                            bl = true;
                            continue block44;
                        }
                        case 8: {
                            this.newinterface |= 1;
                            this.whileinterface = ab2.\u00d3o0000();
                            continue block44;
                        }
                        case 16: {
                            if ((n2 & 0x20) != 32) {
                                this.\u00f80o000 = new ArrayList();
                                n2 |= 0x20;
                            }
                            this.\u00f80o000.add(ab2.\u00d3o0000());
                            continue block44;
                        }
                        case 18: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 0x20) != 32 && ab2.newsuper() > 0) {
                                this.\u00f80o000 = new ArrayList();
                                n2 |= 0x20;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00f80o000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block44;
                        }
                        case 24: {
                            this.newinterface |= 2;
                            this.o0o000 = ab2.\u00d3o0000();
                            continue block44;
                        }
                        case 32: {
                            this.newinterface |= 4;
                            this.\u00f5\u00f6O000 = ab2.\u00d3o0000();
                            continue block44;
                        }
                        case 42: {
                            if ((n2 & 8) != 8) {
                                this.returninterface = new ArrayList();
                                n2 |= 8;
                            }
                            this.returninterface.add(ab2.o00000(b$_b.\u00f6\u00d3\u00d2000, s2));
                            continue block44;
                        }
                        case 50: {
                            if ((n2 & 0x10) != 16) {
                                this.\u00f8\u00f6O000 = new ArrayList();
                                n2 |= 0x10;
                            }
                            this.\u00f8\u00f6O000.add(ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2));
                            continue block44;
                        }
                        case 56: {
                            if ((n2 & 0x40) != 64) {
                                this.\u00d2\u00f8O000 = new ArrayList();
                                n2 |= 0x40;
                            }
                            this.\u00d2\u00f8O000.add(ab2.\u00d3o0000());
                            continue block44;
                        }
                        case 58: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 0x40) != 64 && ab2.newsuper() > 0) {
                                this.\u00d2\u00f8O000 = new ArrayList();
                                n2 |= 0x40;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00d2\u00f8O000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block44;
                        }
                        case 66: {
                            if ((n2 & 0x200) != 512) {
                                this.\u00d50o000 = new ArrayList();
                                n2 |= 0x200;
                            }
                            this.\u00d50o000.add(ab2.o00000(b$_f.returnsupersuper, s2));
                            continue block44;
                        }
                        case 74: {
                            if ((n2 & 0x400) != 1024) {
                                this.\u00d8\u00f6O000 = new ArrayList();
                                n2 |= 0x400;
                            }
                            this.\u00d8\u00f6O000.add(ab2.o00000(b$_z.\u00d20\u00d2000, s2));
                            continue block44;
                        }
                        case 82: {
                            if ((n2 & 0x800) != 2048) {
                                this.\u00d6\u00f6O000 = new ArrayList();
                                n2 |= 0x800;
                            }
                            this.\u00d6\u00f6O000.add(ab2.o00000(b$_n.ifclasssuper, s2));
                            continue block44;
                        }
                        case 90: {
                            if ((n2 & 0x1000) != 4096) {
                                this.\u00d8\u00f8O000 = new ArrayList();
                                n2 |= 0x1000;
                            }
                            this.\u00d8\u00f8O000.add(ab2.o00000(b$_j.\u00d3\u00d5o000, s2));
                            continue block44;
                        }
                        case 106: {
                            if ((n2 & 0x2000) != 8192) {
                                this.\u00f50o000 = new ArrayList();
                                n2 |= 0x2000;
                            }
                            this.\u00f50o000.add(ab2.o00000(b$_rb.\u00f5\u00d3\u00d2000, s2));
                            continue block44;
                        }
                        case 128: {
                            if ((n2 & 0x4000) != 16384) {
                                this.ifinterface = new ArrayList();
                                n2 |= 0x4000;
                            }
                            this.ifinterface.add(ab2.\u00d3o0000());
                            continue block44;
                        }
                        case 130: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 0x4000) != 16384 && ab2.newsuper() > 0) {
                                this.ifinterface = new ArrayList();
                                n2 |= 0x4000;
                            }
                            while (ab2.newsuper() > 0) {
                                this.ifinterface.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block44;
                        }
                        case 136: {
                            this.newinterface |= 8;
                            this.nullprivate = ab2.\u00d3o0000();
                            continue block44;
                        }
                        case 146: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.newinterface & 0x10) == 16) {
                                b$_nb$_d = this.\u00d3\u00f8O000.\u00f4O\u00d4000();
                            }
                            this.\u00d3\u00f8O000 = (b$_nb)ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.\u00d3\u00f8O000);
                                this.\u00d3\u00f8O000 = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.newinterface |= 0x10;
                            continue block44;
                        }
                        case 152: {
                            this.newinterface |= 0x20;
                            this.privateprivate = ab2.\u00d3o0000();
                            continue block44;
                        }
                        case 162: {
                            if ((n2 & 0x80) != 128) {
                                this.\u00d60o000 = new ArrayList();
                                n2 |= 0x80;
                            }
                            this.\u00d60o000.add(ab2.o00000(b$_nb.\u00d6\u00d2\u00d2000, s2));
                            continue block44;
                        }
                        case 168: {
                            if ((n2 & 0x100) != 256) {
                                this.thisthissuper = new ArrayList();
                                n2 |= 0x100;
                            }
                            this.thisthissuper.add(ab2.\u00d3o0000());
                            continue block44;
                        }
                        case 170: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 0x100) != 256 && ab2.newsuper() > 0) {
                                this.thisthissuper = new ArrayList();
                                n2 |= 0x100;
                            }
                            while (ab2.newsuper() > 0) {
                                this.thisthissuper.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block44;
                        }
                        case 202: {
                            if ((n2 & 0x40000) != 262144) {
                                this.\u00f6\u00f8O000 = new ArrayList();
                                n2 |= 0x40000;
                            }
                            this.\u00f6\u00f8O000.add(ab2.o00000(b$_db.oOO000, s2));
                            continue block44;
                        }
                        case 242: {
                            b$_mb$_b b$_mb$_b = null;
                            if ((this.newinterface & 0x40) == 64) {
                                b$_mb$_b = this.\u00d5\u00f8O000.\u00d2oo000();
                            }
                            this.\u00d5\u00f8O000 = (b$_mb)ab2.o00000(b$_mb.\u00d5\u00d3O000, s2);
                            if (b$_mb$_b != null) {
                                b$_mb$_b.super(this.\u00d5\u00f8O000);
                                this.\u00d5\u00f8O000 = b$_mb$_b.\u00d6Oo000();
                            }
                            this.newinterface |= 0x40;
                            continue block44;
                        }
                        case 248: {
                            if ((n2 & 0x100000) != 0x100000) {
                                this.\u00d30o000 = new ArrayList();
                                n2 |= 0x100000;
                            }
                            this.\u00d30o000.add(ab2.\u00d3o0000());
                            continue block44;
                        }
                        case 250: {
                            n3 = ab2.\u00f500000();
                            n3 = ab2.\u00d500000(n3);
                            if ((n2 & 0x100000) != 0x100000 && ab2.newsuper() > 0) {
                                this.\u00d30o000 = new ArrayList();
                                n2 |= 0x100000;
                            }
                            while (ab2.newsuper() > 0) {
                                this.\u00d30o000.add(ab2.\u00d3o0000());
                            }
                            ab2.\u00d200000(n3);
                            continue block44;
                        }
                        case 258: {
                            b$_g$_b b$_g$_b = null;
                            if ((this.newinterface & 0x80) == 128) {
                                b$_g$_b = this.o\u00f8O000.publicclass();
                            }
                            this.o\u00f8O000 = (b$_g)ab2.o00000(b$_g.\u00d3\u00d40000, s2);
                            if (b$_g$_b != null) {
                                b$_g$_b.super(this.o\u00f8O000);
                                this.o\u00f8O000 = b$_g$_b.\u00f6\u00d60000();
                            }
                            this.newinterface |= 0x80;
                            continue block44;
                        }
                        case 266: 
                    }
                    if ((n2 & 0x400000) != 0x400000) {
                        this.\u00f8\u00f8O000 = new ArrayList();
                        n2 |= 0x400000;
                    }
                    this.\u00f8\u00f8O000.add(ab2.o00000(b$_y.\u00d2\u00f40000, s2));
                }
                if ((n2 & 0x20) != 32) break block105;
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
                        this.\u00f80o000 = Collections.unmodifiableList(this.\u00f80o000);
                    }
                    if ((n2 & 8) == 8) {
                        this.returninterface = Collections.unmodifiableList(this.returninterface);
                    }
                    if ((n2 & 0x10) == 16) {
                        this.\u00f8\u00f6O000 = Collections.unmodifiableList(this.\u00f8\u00f6O000);
                    }
                    if ((n2 & 0x40) == 64) {
                        this.\u00d2\u00f8O000 = Collections.unmodifiableList(this.\u00d2\u00f8O000);
                    }
                    if ((n2 & 0x200) == 512) {
                        this.\u00d50o000 = Collections.unmodifiableList(this.\u00d50o000);
                    }
                    if ((n2 & 0x400) == 1024) {
                        this.\u00d8\u00f6O000 = Collections.unmodifiableList(this.\u00d8\u00f6O000);
                    }
                    if ((n2 & 0x800) == 2048) {
                        this.\u00d6\u00f6O000 = Collections.unmodifiableList(this.\u00d6\u00f6O000);
                    }
                    if ((n2 & 0x1000) == 4096) {
                        this.\u00d8\u00f8O000 = Collections.unmodifiableList(this.\u00d8\u00f8O000);
                    }
                    if ((n2 & 0x2000) == 8192) {
                        this.\u00f50o000 = Collections.unmodifiableList(this.\u00f50o000);
                    }
                    if ((n2 & 0x4000) == 16384) {
                        this.ifinterface = Collections.unmodifiableList(this.ifinterface);
                    }
                    if ((n2 & 0x80) == 128) {
                        this.\u00d60o000 = Collections.unmodifiableList(this.\u00d60o000);
                    }
                    if ((n2 & 0x100) == 256) {
                        this.thisthissuper = Collections.unmodifiableList(this.thisthissuper);
                    }
                    if ((n2 & 0x40000) == 262144) {
                        this.\u00f6\u00f8O000 = Collections.unmodifiableList(this.\u00f6\u00f8O000);
                    }
                    if ((n2 & 0x100000) == 0x100000) {
                        this.\u00d30o000 = Collections.unmodifiableList(this.\u00d30o000);
                    }
                    if ((n2 & 0x400000) == 0x400000) {
                        this.\u00f8\u00f8O000 = Collections.unmodifiableList(this.\u00f8\u00f8O000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00d2Oo000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f80o000 = Collections.unmodifiableList(this.\u00f80o000);
        }
        if ((n2 & 8) == 8) {
            this.returninterface = Collections.unmodifiableList(this.returninterface);
        }
        if ((n2 & 0x10) == 16) {
            this.\u00f8\u00f6O000 = Collections.unmodifiableList(this.\u00f8\u00f6O000);
        }
        if ((n2 & 0x40) == 64) {
            this.\u00d2\u00f8O000 = Collections.unmodifiableList(this.\u00d2\u00f8O000);
        }
        if ((n2 & 0x200) == 512) {
            this.\u00d50o000 = Collections.unmodifiableList(this.\u00d50o000);
        }
        if ((n2 & 0x400) == 1024) {
            this.\u00d8\u00f6O000 = Collections.unmodifiableList(this.\u00d8\u00f6O000);
        }
        if ((n2 & 0x800) == 2048) {
            this.\u00d6\u00f6O000 = Collections.unmodifiableList(this.\u00d6\u00f6O000);
        }
        if ((n2 & 0x1000) == 4096) {
            this.\u00d8\u00f8O000 = Collections.unmodifiableList(this.\u00d8\u00f8O000);
        }
        if ((n2 & 0x2000) == 8192) {
            this.\u00f50o000 = Collections.unmodifiableList(this.\u00f50o000);
        }
        if ((n2 & 0x4000) == 16384) {
            this.ifinterface = Collections.unmodifiableList(this.ifinterface);
        }
        if ((n2 & 0x80) == 128) {
            this.\u00d60o000 = Collections.unmodifiableList(this.\u00d60o000);
        }
        if ((n2 & 0x100) == 256) {
            this.thisthissuper = Collections.unmodifiableList(this.thisthissuper);
        }
        if ((n2 & 0x40000) == 262144) {
            this.\u00f6\u00f8O000 = Collections.unmodifiableList(this.\u00f6\u00f8O000);
        }
        if ((n2 & 0x100000) == 0x100000) {
            this.\u00d30o000 = Collections.unmodifiableList(this.\u00d30o000);
        }
        if ((n2 & 0x400000) == 0x400000) {
            this.\u00f8\u00f8O000 = Collections.unmodifiableList(this.\u00f8\u00f8O000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00d2Oo000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d80o000;
    }

    public final boolean Objectfloatsuper() {
        return (this.newinterface & 1) == 1;
    }

    public final int voidintsuper() {
        return this.whileinterface;
    }

    public final boolean \u00f8o\u00d2000() {
        return (this.newinterface & 2) == 2;
    }

    public final int \u00d6o\u00d2000() {
        return this.o0o000;
    }

    public final boolean \u00d8o\u00d2000() {
        return (this.newinterface & 4) == 4;
    }

    public final int \u00d4O\u00d2000() {
        return this.\u00f5\u00f6O000;
    }

    public final List doifsuper() {
        return this.returninterface;
    }

    public final int \u00f6\u00d2\u00d2000() {
        return this.returninterface.size();
    }

    public final b$_b \u00f8\u00d40000(int n2) {
        return (b$_b)this.returninterface.get(n2);
    }

    public final List O\u00d2\u00d2000() {
        return this.\u00f8\u00f6O000;
    }

    public final int superifsuper() {
        return this.\u00f8\u00f6O000.size();
    }

    public final b$_nb publicObject(int n2) {
        return (b$_nb)this.\u00f8\u00f6O000.get(n2);
    }

    public final List intifsuper() {
        return this.\u00f80o000;
    }

    public final List \u00f8\u00d2\u00d2000() {
        return this.\u00d2\u00f8O000;
    }

    public final List \u00d3\u00d2\u00d2000() {
        return this.\u00d60o000;
    }

    public final int \u00f4\u00d2\u00d2000() {
        return this.\u00d60o000.size();
    }

    public final b$_nb \u00d2\u00d40000(int n2) {
        return (b$_nb)this.\u00d60o000.get(n2);
    }

    public final List \u00d2\u00d3\u00d2000() {
        return this.thisthissuper;
    }

    public final List \u00d4\u00d3\u00d2000() {
        return this.\u00d50o000;
    }

    public final int \u00d4o\u00d2000() {
        return this.\u00d50o000.size();
    }

    public final b$_f \u00f6\u00d40000(int n2) {
        return (b$_f)this.\u00d50o000.get(n2);
    }

    public final List \u00d4\u00d2\u00d2000() {
        return this.\u00d8\u00f6O000;
    }

    public final int floatintsuper() {
        return this.\u00d8\u00f6O000.size();
    }

    public final b$_z \u00d4\u00d40000(int n2) {
        return (b$_z)this.\u00d8\u00f6O000.get(n2);
    }

    public final List interfacenullsuper() {
        return this.\u00d6\u00f6O000;
    }

    public final int \u00d8O\u00d2000() {
        return this.\u00d6\u00f6O000.size();
    }

    public final b$_n \u00f4\u00d40000(int n2) {
        return (b$_n)this.\u00d6\u00f6O000.get(n2);
    }

    public final List \u00d8\u00d3\u00d2000() {
        return this.\u00d8\u00f8O000;
    }

    public final int \u00d3\u00d3\u00d2000() {
        return this.\u00d8\u00f8O000.size();
    }

    public final b$_j \u00d6\u00d40000(int n2) {
        return (b$_j)this.\u00d8\u00f8O000.get(n2);
    }

    public final List Oo\u00d2000() {
        return this.\u00f50o000;
    }

    public final int \u00d3o\u00d2000() {
        return this.\u00f50o000.size();
    }

    public final b$_rb \u00d8\u00d40000(int n2) {
        return (b$_rb)this.\u00f50o000.get(n2);
    }

    public final List \u00d6O\u00d2000() {
        return this.ifinterface;
    }

    public final boolean \u00d2O\u00d2000() {
        return (this.newinterface & 8) == 8;
    }

    public final int \u00f8O\u00d2000() {
        return this.nullprivate;
    }

    public final boolean \u00f4O\u00d2000() {
        return (this.newinterface & 0x10) == 16;
    }

    public final b$_nb \u00d2\u00d2\u00d2000() {
        return this.\u00d3\u00f8O000;
    }

    public final boolean O\u00d3\u00d2000() {
        return (this.newinterface & 0x20) == 32;
    }

    public final int \u00f6O\u00d2000() {
        return this.privateprivate;
    }

    public final List \u00f4o\u00d2000() {
        return this.\u00f6\u00f8O000;
    }

    public final int \u00d8\u00d2\u00d2000() {
        return this.\u00f6\u00f8O000.size();
    }

    public final b$_db floatObject(int n2) {
        return (b$_db)this.\u00f6\u00f8O000.get(n2);
    }

    public final boolean donullsuper() {
        return (this.newinterface & 0x40) == 64;
    }

    public final b$_mb Objectintsuper() {
        return this.\u00d5\u00f8O000;
    }

    public final List publicintsuper() {
        return this.\u00d30o000;
    }

    public final boolean \u00d6\u00d2\u00d2000() {
        return (this.newinterface & 0x80) == 128;
    }

    public final b$_g interfaceifsuper() {
        return this.o\u00f8O000;
    }

    public final int \u00d3O\u00d2000() {
        return this.\u00f8\u00f8O000.size();
    }

    public final b$_y \u00d3\u00d40000(int n2) {
        return (b$_y)this.\u00f8\u00f8O000.get(n2);
    }

    private void \u00f4\u00d3\u00d2000() {
        this.whileinterface = 6;
        this.o0o000 = 0;
        this.\u00f5\u00f6O000 = 0;
        this.returninterface = Collections.emptyList();
        this.\u00f8\u00f6O000 = Collections.emptyList();
        this.\u00f80o000 = Collections.emptyList();
        this.\u00d2\u00f8O000 = Collections.emptyList();
        this.\u00d60o000 = Collections.emptyList();
        this.thisthissuper = Collections.emptyList();
        this.\u00d50o000 = Collections.emptyList();
        this.\u00d8\u00f6O000 = Collections.emptyList();
        this.\u00d6\u00f6O000 = Collections.emptyList();
        this.\u00d8\u00f8O000 = Collections.emptyList();
        this.\u00f50o000 = Collections.emptyList();
        this.ifinterface = Collections.emptyList();
        this.nullprivate = 0;
        this.\u00d3\u00f8O000 = b$_nb.\u00d2o\u00d4000();
        this.privateprivate = 0;
        this.\u00f6\u00f8O000 = Collections.emptyList();
        this.\u00d5\u00f8O000 = b$_mb.\u00d4oo000();
        this.\u00d30o000 = Collections.emptyList();
        this.o\u00f8O000 = b$_g.\u00d4\u00d80000();
        this.\u00f8\u00f8O000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00f60o000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        if (!this.\u00f8o\u00d2000()) {
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f6\u00d2\u00d2000(); ++n2) {
            if (this.\u00f8\u00d40000(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.superifsuper(); ++n2) {
            if (this.publicObject(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f4\u00d2\u00d2000(); ++n2) {
            if (this.\u00d2\u00d40000(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d4o\u00d2000(); ++n2) {
            if (this.\u00f6\u00d40000(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.floatintsuper(); ++n2) {
            if (this.\u00d4\u00d40000(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d8O\u00d2000(); ++n2) {
            if (this.\u00f4\u00d40000(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00d3\u00d2000(); ++n2) {
            if (this.\u00d6\u00d40000(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3o\u00d2000(); ++n2) {
            if (this.\u00d8\u00d40000(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        if (this.\u00f4O\u00d2000() && !this.\u00d2\u00d2\u00d2000().\u00d200000()) {
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d8\u00d2\u00d2000(); ++n2) {
            if (this.floatObject(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        if (this.donullsuper() && !this.Objectintsuper().\u00d200000()) {
            this.\u00f60o000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3O\u00d2000(); ++n2) {
            if (this.\u00d3\u00d40000(n2).\u00d200000()) continue;
            this.\u00f60o000 = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.\u00f60o000 = 0;
            return false;
        }
        this.\u00f60o000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.newinterface & 1) == 1) {
            h2.return(1, this.whileinterface);
        }
        if (this.intifsuper().size() > 0) {
            h2.oO0000(18);
            h2.oO0000(this.forprivate);
        }
        for (n2 = 0; n2 < this.\u00f80o000.size(); ++n2) {
            h2.o00000((Integer)this.\u00f80o000.get(n2));
        }
        if ((this.newinterface & 2) == 2) {
            h2.return(3, this.o0o000);
        }
        if ((this.newinterface & 4) == 4) {
            h2.return(4, this.\u00f5\u00f6O000);
        }
        for (n2 = 0; n2 < this.returninterface.size(); ++n2) {
            h2.\u00d300000(5, (v)this.returninterface.get(n2));
        }
        for (n2 = 0; n2 < this.\u00f8\u00f6O000.size(); ++n2) {
            h2.\u00d300000(6, (v)this.\u00f8\u00f6O000.get(n2));
        }
        if (this.\u00f8\u00d2\u00d2000().size() > 0) {
            h2.oO0000(58);
            h2.oO0000(this.oOo000);
        }
        for (n2 = 0; n2 < this.\u00d2\u00f8O000.size(); ++n2) {
            h2.o00000((Integer)this.\u00d2\u00f8O000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d50o000.size(); ++n2) {
            h2.\u00d300000(8, (v)this.\u00d50o000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d8\u00f6O000.size(); ++n2) {
            h2.\u00d300000(9, (v)this.\u00d8\u00f6O000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d6\u00f6O000.size(); ++n2) {
            h2.\u00d300000(10, (v)this.\u00d6\u00f6O000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00d8\u00f8O000.size(); ++n2) {
            h2.\u00d300000(11, (v)this.\u00d8\u00f8O000.get(n2));
        }
        for (n2 = 0; n2 < this.\u00f50o000.size(); ++n2) {
            h2.\u00d300000(13, (v)this.\u00f50o000.get(n2));
        }
        if (this.\u00d6O\u00d2000().size() > 0) {
            h2.oO0000(130);
            h2.oO0000(this.\u00f5\u00f8O000);
        }
        for (n2 = 0; n2 < this.ifinterface.size(); ++n2) {
            h2.o00000((Integer)this.ifinterface.get(n2));
        }
        if ((this.newinterface & 8) == 8) {
            h2.return(17, this.nullprivate);
        }
        if ((this.newinterface & 0x10) == 16) {
            h2.\u00d300000(18, this.\u00d3\u00f8O000);
        }
        if ((this.newinterface & 0x20) == 32) {
            h2.return(19, this.privateprivate);
        }
        for (n2 = 0; n2 < this.\u00d60o000.size(); ++n2) {
            h2.\u00d300000(20, (v)this.\u00d60o000.get(n2));
        }
        if (this.\u00d2\u00d3\u00d2000().size() > 0) {
            h2.oO0000(170);
            h2.oO0000(this.\u00d6\u00f8O000);
        }
        for (n2 = 0; n2 < this.thisthissuper.size(); ++n2) {
            h2.o00000((Integer)this.thisthissuper.get(n2));
        }
        for (n2 = 0; n2 < this.\u00f6\u00f8O000.size(); ++n2) {
            h2.\u00d300000(25, (v)this.\u00f6\u00f8O000.get(n2));
        }
        if ((this.newinterface & 0x40) == 64) {
            h2.\u00d300000(30, this.\u00d5\u00f8O000);
        }
        for (n2 = 0; n2 < this.\u00d30o000.size(); ++n2) {
            h2.return(31, (Integer)this.\u00d30o000.get(n2));
        }
        if ((this.newinterface & 0x80) == 128) {
            h2.\u00d300000(32, this.o\u00f8O000);
        }
        for (n2 = 0; n2 < this.\u00f8\u00f8O000.size(); ++n2) {
            h2.\u00d300000(33, (v)this.\u00f8\u00f8O000.get(n2));
        }
        d$_c$_b.o00000(19000, h2);
        h2.\u00d300000(this.\u00d2Oo000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.\u00d20o000;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        if ((this.newinterface & 1) == 1) {
            n3 = 0 + h.\u00d500000(1, this.whileinterface);
        }
        int n4 = 0;
        for (n2 = 0; n2 < this.\u00f80o000.size(); ++n2) {
            n4 += h.\u00f500000((Integer)this.\u00f80o000.get(n2));
        }
        n3 += n4;
        if (!this.intifsuper().isEmpty()) {
            ++n3;
            n3 += h.\u00f500000(n4);
        }
        this.forprivate = n4;
        if ((this.newinterface & 2) == 2) {
            n3 += h.\u00d500000(3, this.o0o000);
        }
        if ((this.newinterface & 4) == 4) {
            n3 += h.\u00d500000(4, this.\u00f5\u00f6O000);
        }
        for (n4 = 0; n4 < this.returninterface.size(); ++n4) {
            n3 += h.o00000(5, (v)this.returninterface.get(n4));
        }
        for (n4 = 0; n4 < this.\u00f8\u00f6O000.size(); ++n4) {
            n3 += h.o00000(6, (v)this.\u00f8\u00f6O000.get(n4));
        }
        n4 = 0;
        for (n2 = 0; n2 < this.\u00d2\u00f8O000.size(); ++n2) {
            n4 += h.\u00f500000((Integer)this.\u00d2\u00f8O000.get(n2));
        }
        n3 += n4;
        if (!this.\u00f8\u00d2\u00d2000().isEmpty()) {
            ++n3;
            n3 += h.\u00f500000(n4);
        }
        this.oOo000 = n4;
        for (n4 = 0; n4 < this.\u00d50o000.size(); ++n4) {
            n3 += h.o00000(8, (v)this.\u00d50o000.get(n4));
        }
        for (n4 = 0; n4 < this.\u00d8\u00f6O000.size(); ++n4) {
            n3 += h.o00000(9, (v)this.\u00d8\u00f6O000.get(n4));
        }
        for (n4 = 0; n4 < this.\u00d6\u00f6O000.size(); ++n4) {
            n3 += h.o00000(10, (v)this.\u00d6\u00f6O000.get(n4));
        }
        for (n4 = 0; n4 < this.\u00d8\u00f8O000.size(); ++n4) {
            n3 += h.o00000(11, (v)this.\u00d8\u00f8O000.get(n4));
        }
        for (n4 = 0; n4 < this.\u00f50o000.size(); ++n4) {
            n3 += h.o00000(13, (v)this.\u00f50o000.get(n4));
        }
        n4 = 0;
        for (n2 = 0; n2 < this.ifinterface.size(); ++n2) {
            n4 += h.\u00f500000((Integer)this.ifinterface.get(n2));
        }
        n3 += n4;
        if (!this.\u00d6O\u00d2000().isEmpty()) {
            n3 += 2;
            n3 += h.\u00f500000(n4);
        }
        this.\u00f5\u00f8O000 = n4;
        if ((this.newinterface & 8) == 8) {
            n3 += h.\u00d500000(17, this.nullprivate);
        }
        if ((this.newinterface & 0x10) == 16) {
            n3 += h.o00000(18, this.\u00d3\u00f8O000);
        }
        if ((this.newinterface & 0x20) == 32) {
            n3 += h.\u00d500000(19, this.privateprivate);
        }
        for (n4 = 0; n4 < this.\u00d60o000.size(); ++n4) {
            n3 += h.o00000(20, (v)this.\u00d60o000.get(n4));
        }
        n4 = 0;
        for (n2 = 0; n2 < this.thisthissuper.size(); ++n2) {
            n4 += h.\u00f500000((Integer)this.thisthissuper.get(n2));
        }
        n3 += n4;
        if (!this.\u00d2\u00d3\u00d2000().isEmpty()) {
            n3 += 2;
            n3 += h.\u00f500000(n4);
        }
        this.\u00d6\u00f8O000 = n4;
        for (n4 = 0; n4 < this.\u00f6\u00f8O000.size(); ++n4) {
            n3 += h.o00000(25, (v)this.\u00f6\u00f8O000.get(n4));
        }
        if ((this.newinterface & 0x40) == 64) {
            n3 += h.o00000(30, this.\u00d5\u00f8O000);
        }
        n4 = 0;
        for (n2 = 0; n2 < this.\u00d30o000.size(); ++n2) {
            n4 += h.\u00f500000((Integer)this.\u00d30o000.get(n2));
        }
        n3 = n3 + n4 + 2 * this.publicintsuper().size();
        if ((this.newinterface & 0x80) == 128) {
            n3 += h.o00000(32, this.o\u00f8O000);
        }
        for (n4 = 0; n4 < this.\u00f8\u00f8O000.size(); ++n4) {
            n3 += h.o00000(33, (v)this.\u00f8\u00f8O000.get(n4));
        }
        this.\u00d20o000 = n3 = n3 + this.\u00d6\u00d6o000() + this.\u00d2Oo000.\u00f400000();
        return n3;
    }

    public static b$_d super(InputStream inputStream, s s2) throws IOException {
        return (b$_d)\u00d80o000.o00000(inputStream, s2);
    }

    public static b$_d$_c \u00d6\u00d3\u00d2000() {
        return b$_d$_c.doreturnsuper();
    }

    public final b$_d$_c \u00d2o\u00d2000() {
        return b$_d.\u00d6\u00d3\u00d2000();
    }

    public static b$_d$_c interface(b$_d b$_d) {
        return b$_d.\u00d6\u00d3\u00d2000().super(b$_d);
    }

    public final b$_d$_c classifsuper() {
        return b$_d.interface(this);
    }

    /* synthetic */ b$_d(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_d(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ int \u00d300000(b$_d b$_d, int n2) {
        b$_d.whileinterface = n2;
        return b$_d.whileinterface;
    }

    static /* synthetic */ int class(b$_d b$_d, int n2) {
        b$_d.o0o000 = n2;
        return b$_d.o0o000;
    }

    static /* synthetic */ int \u00d200000(b$_d b$_d, int n2) {
        b$_d.\u00f5\u00f6O000 = n2;
        return b$_d.\u00f5\u00f6O000;
    }

    static /* synthetic */ List \u00d400000(b$_d b$_d, List list) {
        b$_d.returninterface = list;
        return b$_d.returninterface;
    }

    static /* synthetic */ List \u00f600000(b$_d b$_d, List list) {
        b$_d.\u00f8\u00f6O000 = list;
        return b$_d.\u00f8\u00f6O000;
    }

    static /* synthetic */ List \u00d2O0000(b$_d b$_d, List list) {
        b$_d.\u00f80o000 = list;
        return b$_d.\u00f80o000;
    }

    static /* synthetic */ List \u00d300000(b$_d b$_d, List list) {
        b$_d.\u00d2\u00f8O000 = list;
        return b$_d.\u00d2\u00f8O000;
    }

    static /* synthetic */ List int(b$_d b$_d, List list) {
        b$_d.\u00d60o000 = list;
        return b$_d.\u00d60o000;
    }

    static /* synthetic */ List OO0000(b$_d b$_d, List list) {
        b$_d.thisthissuper = list;
        return b$_d.thisthissuper;
    }

    static /* synthetic */ List \u00d800000(b$_d b$_d, List list) {
        b$_d.\u00d50o000 = list;
        return b$_d.\u00d50o000;
    }

    static /* synthetic */ List do(b$_d b$_d, List list) {
        b$_d.\u00d8\u00f6O000 = list;
        return b$_d.\u00d8\u00f6O000;
    }

    static /* synthetic */ List \u00d200000(b$_d b$_d, List list) {
        b$_d.\u00d6\u00f6O000 = list;
        return b$_d.\u00d6\u00f6O000;
    }

    static /* synthetic */ List \u00d600000(b$_d b$_d, List list) {
        b$_d.\u00d8\u00f8O000 = list;
        return b$_d.\u00d8\u00f8O000;
    }

    static /* synthetic */ List \u00f800000(b$_d b$_d, List list) {
        b$_d.\u00f50o000 = list;
        return b$_d.\u00f50o000;
    }

    static /* synthetic */ List super(b$_d b$_d, List list) {
        b$_d.ifinterface = list;
        return b$_d.ifinterface;
    }

    static /* synthetic */ int \u00d600000(b$_d b$_d, int n2) {
        b$_d.nullprivate = n2;
        return b$_d.nullprivate;
    }

    static /* synthetic */ b$_nb super(b$_d b$_d, b$_nb b$_nb) {
        b$_d.\u00d3\u00f8O000 = b$_nb;
        return b$_d.\u00d3\u00f8O000;
    }

    static /* synthetic */ int \u00d400000(b$_d b$_d, int n2) {
        b$_d.privateprivate = n2;
        return b$_d.privateprivate;
    }

    static /* synthetic */ List class(b$_d b$_d, List list) {
        b$_d.\u00f6\u00f8O000 = list;
        return b$_d.\u00f6\u00f8O000;
    }

    static /* synthetic */ b$_mb super(b$_d b$_d, b$_mb b$_mb) {
        b$_d.\u00d5\u00f8O000 = b$_mb;
        return b$_d.\u00d5\u00f8O000;
    }

    static /* synthetic */ List \u00d3O0000(b$_d b$_d, List list) {
        b$_d.\u00d30o000 = list;
        return b$_d.\u00d30o000;
    }

    static /* synthetic */ b$_g super(b$_d b$_d, b$_g b$_g) {
        b$_d.o\u00f8O000 = b$_g;
        return b$_d.o\u00f8O000;
    }

    static /* synthetic */ List \u00f400000(b$_d b$_d, List list) {
        b$_d.\u00f8\u00f8O000 = list;
        return b$_d.\u00f8\u00f8O000;
    }

    static /* synthetic */ int super(b$_d b$_d, int n2) {
        b$_d.newinterface = n2;
        return b$_d.newinterface;
    }

    static /* synthetic */ List \u00d600000(b$_d b$_d) {
        return b$_d.returninterface;
    }

    static /* synthetic */ List \u00d800000(b$_d b$_d) {
        return b$_d.\u00f8\u00f6O000;
    }

    static /* synthetic */ List \u00f400000(b$_d b$_d) {
        return b$_d.\u00f80o000;
    }

    static /* synthetic */ List \u00f600000(b$_d b$_d) {
        return b$_d.\u00d2\u00f8O000;
    }

    static /* synthetic */ List do(b$_d b$_d) {
        return b$_d.\u00d60o000;
    }

    static /* synthetic */ List \u00d4O0000(b$_d b$_d) {
        return b$_d.thisthissuper;
    }

    static /* synthetic */ List int(b$_d b$_d) {
        return b$_d.\u00d50o000;
    }

    static /* synthetic */ List \u00f800000(b$_d b$_d) {
        return b$_d.\u00d8\u00f6O000;
    }

    static /* synthetic */ List \u00d2O0000(b$_d b$_d) {
        return b$_d.\u00d6\u00f6O000;
    }

    static /* synthetic */ List \u00d6O0000(b$_d b$_d) {
        return b$_d.\u00d8\u00f8O000;
    }

    static /* synthetic */ List \u00d200000(b$_d b$_d) {
        return b$_d.\u00f50o000;
    }

    static /* synthetic */ List class(b$_d b$_d) {
        return b$_d.ifinterface;
    }

    static /* synthetic */ List OO0000(b$_d b$_d) {
        return b$_d.\u00f6\u00f8O000;
    }

    static /* synthetic */ List \u00d3O0000(b$_d b$_d) {
        return b$_d.\u00d30o000;
    }

    static /* synthetic */ List \u00d300000(b$_d b$_d) {
        return b$_d.\u00f8\u00f8O000;
    }

    static /* synthetic */ b \u00d400000(b$_d b$_d) {
        return b$_d.\u00d2Oo000;
    }

    static {
        \u00d80o000 = new b$_d$1();
        \u00f6\u00f6O000 = new b$_d(true);
        \u00f6\u00f6O000.\u00f4\u00d3\u00d2000();
    }
}

