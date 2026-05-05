/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$1;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_nb$1;
import b.t.c.b.b.l.b$_nb$_c;
import b.t.c.b.b.l.b$_nb$_d;
import b.t.c.b.b.l.b$_sb;
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
public final class b$_nb
extends d$_c
implements b$_sb {
    private static final b$_nb \u00d2o\u00d2000;
    private final b \u00f6\u00d2\u00d2000;
    public static c \u00d6\u00d2\u00d2000;
    private int \u00f6o\u00d2000;
    private List \u00f8o\u00d2000;
    private boolean ifintsuper;
    private int \u00d5o\u00d2000;
    private b$_nb o\u00d2\u00d2000;
    private int Stringifsuper;
    private int \u00d8o\u00d2000;
    private int \u00d3\u00d2\u00d2000;
    private int nullifsuper;
    private int thisifsuper;
    private b$_nb \u00d6o\u00d2000;
    private int \u00f5o\u00d2000;
    private b$_nb \u00d3o\u00d2000;
    private int whileintsuper;
    private int \u00d8\u00d2\u00d2000;
    private List \u00d2\u00d2\u00d2000;
    private byte \u00f5\u00d2\u00d2000;
    private int \u00d5\u00d2\u00d2000;

    private b$_nb(d$_g d$_g) {
        super(d$_g);
        this.\u00f5\u00d2\u00d2000 = (byte)-1;
        this.\u00d5\u00d2\u00d2000 = -1;
        this.\u00f6\u00d2\u00d2000 = d$_g.class();
    }

    private b$_nb(boolean bl) {
        this.\u00f5\u00d2\u00d2000 = (byte)-1;
        this.\u00d5\u00d2\u00d2000 = -1;
        this.\u00f6\u00d2\u00d2000 = b.o00000;
    }

    public static b$_nb \u00d2o\u00d4000() {
        return \u00d2o\u00d2000;
    }

    public final b$_nb classnullnew() {
        return \u00d2o\u00d2000;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b$_nb(ab ab2, s s2) throws g {
        h h2;
        b$_b b$_b;
        int n2;
        block43: {
            this.\u00f5\u00d2\u00d2000 = (byte)-1;
            this.\u00d5\u00d2\u00d2000 = -1;
            this.\u00f4\u00d2\u00d4000();
            n2 = 0;
            b$_b = b.\u00d600000();
            h2 = h.o00000(b$_b, 1);
            try {
                boolean bl = false;
                block31: while (!bl) {
                    int n3 = ab2.oo0000();
                    switch (n3) {
                        case 0: {
                            bl = true;
                            continue block31;
                        }
                        default: {
                            if (this.super(ab2, h2, s2, n3)) continue block31;
                            bl = true;
                            continue block31;
                        }
                        case 8: {
                            this.\u00f6o\u00d2000 |= 0x1000;
                            this.\u00d8\u00d2\u00d2000 = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 18: {
                            if ((n2 & 1) != 1) {
                                this.\u00f8o\u00d2000 = new ArrayList();
                                n2 |= 1;
                            }
                            this.\u00f8o\u00d2000.add(ab2.o00000(b$_nb$_c.\u00f6\u00d3O000, s2));
                            continue block31;
                        }
                        case 24: {
                            this.\u00f6o\u00d2000 |= 1;
                            this.ifintsuper = ab2.for();
                            continue block31;
                        }
                        case 32: {
                            this.\u00f6o\u00d2000 |= 2;
                            this.\u00d5o\u00d2000 = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 42: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.\u00f6o\u00d2000 & 4) == 4) {
                                b$_nb$_d = this.o\u00d2\u00d2000.\u00f4O\u00d4000();
                            }
                            this.o\u00d2\u00d2000 = (b$_nb)ab2.o00000(\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.o\u00d2\u00d2000);
                                this.o\u00d2\u00d2000 = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.\u00f6o\u00d2000 |= 4;
                            continue block31;
                        }
                        case 48: {
                            this.\u00f6o\u00d2000 |= 0x10;
                            this.\u00d8o\u00d2000 = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 56: {
                            this.\u00f6o\u00d2000 |= 0x20;
                            this.\u00d3\u00d2\u00d2000 = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 64: {
                            this.\u00f6o\u00d2000 |= 8;
                            this.Stringifsuper = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 72: {
                            this.\u00f6o\u00d2000 |= 0x40;
                            this.nullifsuper = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 82: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.\u00f6o\u00d2000 & 0x100) == 256) {
                                b$_nb$_d = this.\u00d6o\u00d2000.\u00f4O\u00d4000();
                            }
                            this.\u00d6o\u00d2000 = (b$_nb)ab2.o00000(\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.\u00d6o\u00d2000);
                                this.\u00d6o\u00d2000 = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.\u00f6o\u00d2000 |= 0x100;
                            continue block31;
                        }
                        case 88: {
                            this.\u00f6o\u00d2000 |= 0x200;
                            this.\u00f5o\u00d2000 = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 96: {
                            this.\u00f6o\u00d2000 |= 0x80;
                            this.thisifsuper = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 106: {
                            b$_nb$_d b$_nb$_d = null;
                            if ((this.\u00f6o\u00d2000 & 0x400) == 1024) {
                                b$_nb$_d = this.\u00d3o\u00d2000.\u00f4O\u00d4000();
                            }
                            this.\u00d3o\u00d2000 = (b$_nb)ab2.o00000(\u00d6\u00d2\u00d2000, s2);
                            if (b$_nb$_d != null) {
                                b$_nb$_d.\u00d3O0000(this.\u00d3o\u00d2000);
                                this.\u00d3o\u00d2000 = b$_nb$_d.\u00f60\u00d4000();
                            }
                            this.\u00f6o\u00d2000 |= 0x400;
                            continue block31;
                        }
                        case 112: {
                            this.\u00f6o\u00d2000 |= 0x800;
                            this.whileintsuper = ab2.\u00d3o0000();
                            continue block31;
                        }
                        case 802: 
                    }
                    if ((n2 & 0x4000) != 16384) {
                        this.\u00d2\u00d2\u00d2000 = new ArrayList();
                        n2 |= 0x4000;
                    }
                    this.\u00d2\u00d2\u00d2000.add(ab2.o00000(b$_db.oOO000, s2));
                }
                if (!(n2 & true)) break block43;
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
                        this.\u00f8o\u00d2000 = Collections.unmodifiableList(this.\u00f8o\u00d2000);
                    }
                    if ((n2 & 0x4000) == 16384) {
                        this.\u00d2\u00d2\u00d2000 = Collections.unmodifiableList(this.\u00d2\u00d2\u00d2000);
                    }
                    try {
                        h2.new();
                    }
                    catch (IOException iOException) {
                    }
                    finally {
                        this.\u00f6\u00d2\u00d2000 = b$_b.\u00d300000();
                    }
                    this.\u00d2O0000();
                    throw throwable;
                }
            }
            this.\u00f8o\u00d2000 = Collections.unmodifiableList(this.\u00f8o\u00d2000);
        }
        if ((n2 & 0x4000) == 16384) {
            this.\u00d2\u00d2\u00d2000 = Collections.unmodifiableList(this.\u00d2\u00d2\u00d2000);
        }
        try {
            h2.new();
        }
        catch (IOException iOException) {
        }
        finally {
            this.\u00f6\u00d2\u00d2000 = b$_b.\u00d300000();
        }
        this.\u00d2O0000();
    }

    @Override
    public final c \u00f600000() {
        return \u00d6\u00d2\u00d2000;
    }

    public final List superifnew() {
        return this.\u00f8o\u00d2000;
    }

    public final int \u00d8O\u00d4000() {
        return this.\u00f8o\u00d2000.size();
    }

    public final b$_nb$_c \u00d6\u00f60000(int n2) {
        return (b$_nb$_c)this.\u00f8o\u00d2000.get(n2);
    }

    public final boolean \u00d3o\u00d4000() {
        return (this.\u00f6o\u00d2000 & 1) == 1;
    }

    public final boolean \u00d3O\u00d4000() {
        return this.ifintsuper;
    }

    public final boolean \u00d2O\u00d4000() {
        return (this.\u00f6o\u00d2000 & 2) == 2;
    }

    public final int voidintnew() {
        return this.\u00d5o\u00d2000;
    }

    public final boolean \u00f6o\u00d4000() {
        return (this.\u00f6o\u00d2000 & 4) == 4;
    }

    public final b$_nb \u00d6\u00d2\u00d4000() {
        return this.o\u00d2\u00d2000;
    }

    public final boolean Oo\u00d4000() {
        return (this.\u00f6o\u00d2000 & 8) == 8;
    }

    public final int O\u00d3\u00d4000() {
        return this.Stringifsuper;
    }

    public final boolean donullnew() {
        return (this.\u00f6o\u00d2000 & 0x10) == 16;
    }

    public final int Objectintnew() {
        return this.\u00d8o\u00d2000;
    }

    public final boolean \u00d3\u00d2\u00d4000() {
        return (this.\u00f6o\u00d2000 & 0x20) == 32;
    }

    public final int publicintnew() {
        return this.\u00d3\u00d2\u00d2000;
    }

    public final boolean floatintnew() {
        return (this.\u00f6o\u00d2000 & 0x40) == 64;
    }

    public final int \u00d2\u00d2\u00d4000() {
        return this.nullifsuper;
    }

    public final boolean O\u00d2\u00d4000() {
        return (this.\u00f6o\u00d2000 & 0x80) == 128;
    }

    public final int \u00d8\u00d2\u00d4000() {
        return this.thisifsuper;
    }

    public final boolean \u00d6O\u00d4000() {
        return (this.\u00f6o\u00d2000 & 0x100) == 256;
    }

    public final b$_nb \u00f8o\u00d4000() {
        return this.\u00d6o\u00d2000;
    }

    public final boolean intnullnew() {
        return (this.\u00f6o\u00d2000 & 0x200) == 512;
    }

    public final int \u00d4O\u00d4000() {
        return this.\u00f5o\u00d2000;
    }

    public final boolean \u00f6O\u00d4000() {
        return (this.\u00f6o\u00d2000 & 0x400) == 1024;
    }

    public final b$_nb \u00f8O\u00d4000() {
        return this.\u00d3o\u00d2000;
    }

    public final boolean \u00d8o\u00d4000() {
        return (this.\u00f6o\u00d2000 & 0x800) == 2048;
    }

    public final int \u00d6o\u00d4000() {
        return this.whileintsuper;
    }

    public final boolean interfacenullnew() {
        return (this.\u00f6o\u00d2000 & 0x1000) == 4096;
    }

    public final int \u00d4o\u00d4000() {
        return this.\u00d8\u00d2\u00d2000;
    }

    public final List \u00f4o\u00d4000() {
        return this.\u00d2\u00d2\u00d2000;
    }

    public final int \u00d4\u00d2\u00d4000() {
        return this.\u00d2\u00d2\u00d2000.size();
    }

    public final b$_db floatvoid(int n2) {
        return (b$_db)this.\u00d2\u00d2\u00d2000.get(n2);
    }

    private void \u00f4\u00d2\u00d4000() {
        this.\u00f8o\u00d2000 = Collections.emptyList();
        this.ifintsuper = false;
        this.\u00d5o\u00d2000 = 0;
        this.o\u00d2\u00d2000 = b$_nb.\u00d2o\u00d4000();
        this.Stringifsuper = 0;
        this.\u00d8o\u00d2000 = 0;
        this.\u00d3\u00d2\u00d2000 = 0;
        this.nullifsuper = 0;
        this.thisifsuper = 0;
        this.\u00d6o\u00d2000 = b$_nb.\u00d2o\u00d4000();
        this.\u00f5o\u00d2000 = 0;
        this.\u00d3o\u00d2000 = b$_nb.\u00d2o\u00d4000();
        this.whileintsuper = 0;
        this.\u00d8\u00d2\u00d2000 = 0;
        this.\u00d2\u00d2\u00d2000 = Collections.emptyList();
    }

    @Override
    public final boolean \u00d200000() {
        int n2 = this.\u00f5\u00d2\u00d2000;
        if (n2 == 1) {
            return true;
        }
        if (n2 == 0) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00d8O\u00d4000(); ++n2) {
            if (this.\u00d6\u00f60000(n2).\u00d200000()) continue;
            this.\u00f5\u00d2\u00d2000 = 0;
            return false;
        }
        if (this.\u00f6o\u00d4000() && !this.\u00d6\u00d2\u00d4000().\u00d200000()) {
            this.\u00f5\u00d2\u00d2000 = 0;
            return false;
        }
        if (this.\u00d6O\u00d4000() && !this.\u00f8o\u00d4000().\u00d200000()) {
            this.\u00f5\u00d2\u00d2000 = 0;
            return false;
        }
        if (this.\u00f6O\u00d4000() && !this.\u00f8O\u00d4000().\u00d200000()) {
            this.\u00f5\u00d2\u00d2000 = 0;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d4\u00d2\u00d4000(); ++n2) {
            if (this.floatvoid(n2).\u00d200000()) continue;
            this.\u00f5\u00d2\u00d2000 = 0;
            return false;
        }
        if (!this.\u00f4\u00d6o000()) {
            this.\u00f5\u00d2\u00d2000 = 0;
            return false;
        }
        this.\u00f5\u00d2\u00d2000 = 1;
        return true;
    }

    @Override
    public final void super(h h2) throws IOException {
        int n2;
        this.\u00f800000();
        d$_c$_b d$_c$_b = this.\u00d8\u00d6o000();
        if ((this.\u00f6o\u00d2000 & 0x1000) == 4096) {
            h2.return(1, this.\u00d8\u00d2\u00d2000);
        }
        for (n2 = 0; n2 < this.\u00f8o\u00d2000.size(); ++n2) {
            h2.\u00d300000(2, (v)this.\u00f8o\u00d2000.get(n2));
        }
        if ((this.\u00f6o\u00d2000 & 1) == 1) {
            h2.o00000(3, this.ifintsuper);
        }
        if ((this.\u00f6o\u00d2000 & 2) == 2) {
            h2.return(4, this.\u00d5o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 4) == 4) {
            h2.\u00d300000(5, this.o\u00d2\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x10) == 16) {
            h2.return(6, this.\u00d8o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x20) == 32) {
            h2.return(7, this.\u00d3\u00d2\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 8) == 8) {
            h2.return(8, this.Stringifsuper);
        }
        if ((this.\u00f6o\u00d2000 & 0x40) == 64) {
            h2.return(9, this.nullifsuper);
        }
        if ((this.\u00f6o\u00d2000 & 0x100) == 256) {
            h2.\u00d300000(10, this.\u00d6o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x200) == 512) {
            h2.return(11, this.\u00f5o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x80) == 128) {
            h2.return(12, this.thisifsuper);
        }
        if ((this.\u00f6o\u00d2000 & 0x400) == 1024) {
            h2.\u00d300000(13, this.\u00d3o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x800) == 2048) {
            h2.return(14, this.whileintsuper);
        }
        for (n2 = 0; n2 < this.\u00d2\u00d2\u00d2000.size(); ++n2) {
            h2.\u00d300000(100, (v)this.\u00d2\u00d2\u00d2000.get(n2));
        }
        d$_c$_b.o00000(200, h2);
        h2.\u00d300000(this.\u00f6\u00d2\u00d2000);
    }

    @Override
    public final int \u00f800000() {
        int n2;
        int n3 = this.\u00d5\u00d2\u00d2000;
        if (n3 != -1) {
            return n3;
        }
        n3 = 0;
        if ((this.\u00f6o\u00d2000 & 0x1000) == 4096) {
            n3 = 0 + h.\u00d500000(1, this.\u00d8\u00d2\u00d2000);
        }
        for (n2 = 0; n2 < this.\u00f8o\u00d2000.size(); ++n2) {
            n3 += h.o00000(2, (v)this.\u00f8o\u00d2000.get(n2));
        }
        if ((this.\u00f6o\u00d2000 & 1) == 1) {
            n3 += h.new(3, this.ifintsuper);
        }
        if ((this.\u00f6o\u00d2000 & 2) == 2) {
            n3 += h.\u00d500000(4, this.\u00d5o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 4) == 4) {
            n3 += h.o00000(5, this.o\u00d2\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x10) == 16) {
            n3 += h.\u00d500000(6, this.\u00d8o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x20) == 32) {
            n3 += h.\u00d500000(7, this.\u00d3\u00d2\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 8) == 8) {
            n3 += h.\u00d500000(8, this.Stringifsuper);
        }
        if ((this.\u00f6o\u00d2000 & 0x40) == 64) {
            n3 += h.\u00d500000(9, this.nullifsuper);
        }
        if ((this.\u00f6o\u00d2000 & 0x100) == 256) {
            n3 += h.o00000(10, this.\u00d6o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x200) == 512) {
            n3 += h.\u00d500000(11, this.\u00f5o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x80) == 128) {
            n3 += h.\u00d500000(12, this.thisifsuper);
        }
        if ((this.\u00f6o\u00d2000 & 0x400) == 1024) {
            n3 += h.o00000(13, this.\u00d3o\u00d2000);
        }
        if ((this.\u00f6o\u00d2000 & 0x800) == 2048) {
            n3 += h.\u00d500000(14, this.whileintsuper);
        }
        for (n2 = 0; n2 < this.\u00d2\u00d2\u00d2000.size(); ++n2) {
            n3 += h.o00000(100, (v)this.\u00d2\u00d2\u00d2000.get(n2));
        }
        this.\u00d5\u00d2\u00d2000 = n3 = n3 + this.\u00d6\u00d6o000() + this.\u00f6\u00d2\u00d2000.\u00f400000();
        return n3;
    }

    public static b$_nb$_d \u00f8\u00d2\u00d4000() {
        return b$_nb$_d.\u00d80\u00d4000();
    }

    public final b$_nb$_d \u00f6\u00d2\u00d4000() {
        return b$_nb.\u00f8\u00d2\u00d4000();
    }

    public static b$_nb$_d Objectsuper(b$_nb b$_nb) {
        return b$_nb.\u00f8\u00d2\u00d4000().\u00d3O0000(b$_nb);
    }

    public final b$_nb$_d \u00f4O\u00d4000() {
        return b$_nb.Objectsuper(this);
    }

    /* synthetic */ b$_nb(ab ab2, s s2, b$1 b$1) throws g {
        this(ab2, s2);
    }

    /* synthetic */ b$_nb(d$_g d$_g, b$1 b$1) {
        this(d$_g);
    }

    static /* synthetic */ List \u00d200000(b$_nb b$_nb, List list) {
        b$_nb.\u00f8o\u00d2000 = list;
        return b$_nb.\u00f8o\u00d2000;
    }

    static /* synthetic */ boolean super(b$_nb b$_nb, boolean bl) {
        b$_nb.ifintsuper = bl;
        return b$_nb.ifintsuper;
    }

    static /* synthetic */ int super(b$_nb b$_nb, int n2) {
        b$_nb.\u00d5o\u00d2000 = n2;
        return b$_nb.\u00d5o\u00d2000;
    }

    static /* synthetic */ b$_nb super(b$_nb b$_nb, b$_nb b$_nb2) {
        b$_nb.o\u00d2\u00d2000 = b$_nb2;
        return b$_nb.o\u00d2\u00d2000;
    }

    static /* synthetic */ int int(b$_nb b$_nb, int n2) {
        b$_nb.Stringifsuper = n2;
        return b$_nb.Stringifsuper;
    }

    static /* synthetic */ int \u00d400000(b$_nb b$_nb, int n2) {
        b$_nb.\u00d8o\u00d2000 = n2;
        return b$_nb.\u00d8o\u00d2000;
    }

    static /* synthetic */ int \u00d800000(b$_nb b$_nb, int n2) {
        b$_nb.\u00d3\u00d2\u00d2000 = n2;
        return b$_nb.\u00d3\u00d2\u00d2000;
    }

    static /* synthetic */ int \u00d200000(b$_nb b$_nb, int n2) {
        b$_nb.nullifsuper = n2;
        return b$_nb.nullifsuper;
    }

    static /* synthetic */ int \u00d600000(b$_nb b$_nb, int n2) {
        b$_nb.thisifsuper = n2;
        return b$_nb.thisifsuper;
    }

    static /* synthetic */ b$_nb \u00d200000(b$_nb b$_nb, b$_nb b$_nb2) {
        b$_nb.\u00d6o\u00d2000 = b$_nb2;
        return b$_nb.\u00d6o\u00d2000;
    }

    static /* synthetic */ int class(b$_nb b$_nb, int n2) {
        b$_nb.\u00f5o\u00d2000 = n2;
        return b$_nb.\u00f5o\u00d2000;
    }

    static /* synthetic */ b$_nb \u00d300000(b$_nb b$_nb, b$_nb b$_nb2) {
        b$_nb.\u00d3o\u00d2000 = b$_nb2;
        return b$_nb.\u00d3o\u00d2000;
    }

    static /* synthetic */ int \u00f400000(b$_nb b$_nb, int n2) {
        b$_nb.whileintsuper = n2;
        return b$_nb.whileintsuper;
    }

    static /* synthetic */ int \u00d300000(b$_nb b$_nb, int n2) {
        b$_nb.\u00d8\u00d2\u00d2000 = n2;
        return b$_nb.\u00d8\u00d2\u00d2000;
    }

    static /* synthetic */ List super(b$_nb b$_nb, List list) {
        b$_nb.\u00d2\u00d2\u00d2000 = list;
        return b$_nb.\u00d2\u00d2\u00d2000;
    }

    static /* synthetic */ int \u00f600000(b$_nb b$_nb, int n2) {
        b$_nb.\u00f6o\u00d2000 = n2;
        return b$_nb.\u00f6o\u00d2000;
    }

    static /* synthetic */ List \u00f4O0000(b$_nb b$_nb) {
        return b$_nb.\u00f8o\u00d2000;
    }

    static /* synthetic */ List \u00f8O0000(b$_nb b$_nb) {
        return b$_nb.\u00d2\u00d2\u00d2000;
    }

    static /* synthetic */ b \u00f6O0000(b$_nb b$_nb) {
        return b$_nb.\u00f6\u00d2\u00d2000;
    }

    static {
        \u00d6\u00d2\u00d2000 = new b$_nb$1();
        \u00d2o\u00d2000 = new b$_nb(true);
        \u00d2o\u00d2000.\u00f4\u00d2\u00d4000();
    }
}

