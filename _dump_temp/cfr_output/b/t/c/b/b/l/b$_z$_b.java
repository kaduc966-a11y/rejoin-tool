/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_ab;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_k;
import b.t.c.b.b.l.b$_mb;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_y;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_c;
import b.t.c.b.b.p.d$_g;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.k$_b;
import b.t.c.b.b.p.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_z$_b
extends d$_g
implements b$_k {
    private int \u00d6\u00f5o000;
    private int privatereturnsuper = 6;
    private int \u00f6\u00f5o000 = 6;
    private int newvoidsuper;
    private b$_nb \u00d2\u00f5o000 = b$_nb.\u00d2o\u00d4000();
    private int nullreturnsuper;
    private List forreturnsuper = Collections.emptyList();
    private b$_nb o\u00f6o000 = b$_nb.\u00d2o\u00d4000();
    private int Stringreturnsuper;
    private List \u00d3\u00f6o000 = Collections.emptyList();
    private List \u00d6\u00f6o000 = Collections.emptyList();
    private List \u00d8\u00f5o000 = Collections.emptyList();
    private List \u00d8\u00f6o000 = Collections.emptyList();
    private b$_mb \u00d5\u00f5o000 = b$_mb.\u00d4oo000();
    private List \u00d2\u00f6o000 = Collections.emptyList();
    private b$_ab \u00d3\u00f5o000 = b$_ab.intif();
    private List \u00f8\u00f5o000 = Collections.emptyList();
    private List \u00f5\u00f5o000 = Collections.emptyList();
    private List \u00d5\u00f6o000 = Collections.emptyList();

    private b$_z$_b() {
        this.\u00d6\u00d8\u00d3000();
    }

    private void \u00d6\u00d8\u00d3000() {
    }

    private static b$_z$_b intStringnew() {
        return new b$_z$_b();
    }

    public final b$_z$_b \u00d4\u00f4\u00d3000() {
        return b$_z$_b.intStringnew().super(this.\u00d2\u00f4\u00d3000());
    }

    public final b$_z \u00d8\u00d6\u00d3000() {
        return b$_z.\u00d3\u00f5\u00d3000();
    }

    public final b$_z \u00d8\u00d8\u00d3000() {
        b$_z b$_z = this.\u00d2\u00f4\u00d3000();
        if (!b$_z.\u00d200000()) {
            throw b$_z$_b.super(b$_z);
        }
        return b$_z;
    }

    public final b$_z \u00d2\u00f4\u00d3000() {
        b$_z b$_z = new b$_z(this, null);
        int n2 = this.\u00d6\u00f5o000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_z.class(b$_z, this.privatereturnsuper);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_z.super(b$_z, this.\u00f6\u00f5o000);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_z.\u00d300000(b$_z, this.newvoidsuper);
        if ((n2 & 8) == 8) {
            n3 |= 8;
        }
        b$_z.\u00d200000(b$_z, this.\u00d2\u00f5o000);
        if ((n2 & 0x10) == 16) {
            n3 |= 0x10;
        }
        b$_z.\u00d200000(b$_z, this.nullreturnsuper);
        if ((this.\u00d6\u00f5o000 & 0x20) == 32) {
            this.forreturnsuper = Collections.unmodifiableList(this.forreturnsuper);
            this.\u00d6\u00f5o000 &= 0xFFFFFFDF;
        }
        b$_z.\u00d400000(b$_z, this.forreturnsuper);
        if ((n2 & 0x40) == 64) {
            n3 |= 0x20;
        }
        b$_z.super(b$_z, this.o\u00f6o000);
        if ((n2 & 0x80) == 128) {
            n3 |= 0x40;
        }
        b$_z.\u00d600000(b$_z, this.Stringreturnsuper);
        if ((this.\u00d6\u00f5o000 & 0x100) == 256) {
            this.\u00d3\u00f6o000 = Collections.unmodifiableList(this.\u00d3\u00f6o000);
            this.\u00d6\u00f5o000 &= 0xFFFFFEFF;
        }
        b$_z.\u00d800000(b$_z, this.\u00d3\u00f6o000);
        if ((this.\u00d6\u00f5o000 & 0x200) == 512) {
            this.\u00d6\u00f6o000 = Collections.unmodifiableList(this.\u00d6\u00f6o000);
            this.\u00d6\u00f5o000 &= 0xFFFFFDFF;
        }
        b$_z.\u00d200000(b$_z, this.\u00d6\u00f6o000);
        if ((this.\u00d6\u00f5o000 & 0x400) == 1024) {
            this.\u00d8\u00f5o000 = Collections.unmodifiableList(this.\u00d8\u00f5o000);
            this.\u00d6\u00f5o000 &= 0xFFFFFBFF;
        }
        b$_z.int(b$_z, this.\u00d8\u00f5o000);
        if ((this.\u00d6\u00f5o000 & 0x800) == 2048) {
            this.\u00d8\u00f6o000 = Collections.unmodifiableList(this.\u00d8\u00f6o000);
            this.\u00d6\u00f5o000 &= 0xFFFFF7FF;
        }
        b$_z.class(b$_z, this.\u00d8\u00f6o000);
        if ((n2 & 0x1000) == 4096) {
            n3 |= 0x80;
        }
        b$_z.super(b$_z, this.\u00d5\u00f5o000);
        if ((this.\u00d6\u00f5o000 & 0x2000) == 8192) {
            this.\u00d2\u00f6o000 = Collections.unmodifiableList(this.\u00d2\u00f6o000);
            this.\u00d6\u00f5o000 &= 0xFFFFDFFF;
        }
        b$_z.\u00d600000(b$_z, this.\u00d2\u00f6o000);
        if ((n2 & 0x4000) == 16384) {
            n3 |= 0x100;
        }
        b$_z.super(b$_z, this.\u00d3\u00f5o000);
        if ((this.\u00d6\u00f5o000 & 0x8000) == 32768) {
            this.\u00f8\u00f5o000 = Collections.unmodifiableList(this.\u00f8\u00f5o000);
            this.\u00d6\u00f5o000 &= 0xFFFF7FFF;
        }
        b$_z.super(b$_z, this.\u00f8\u00f5o000);
        if ((this.\u00d6\u00f5o000 & 0x10000) == 65536) {
            this.\u00f5\u00f5o000 = Collections.unmodifiableList(this.\u00f5\u00f5o000);
            this.\u00d6\u00f5o000 &= 0xFFFEFFFF;
        }
        b$_z.\u00f400000(b$_z, this.\u00f5\u00f5o000);
        if ((this.\u00d6\u00f5o000 & 0x20000) == 131072) {
            this.\u00d5\u00f6o000 = Collections.unmodifiableList(this.\u00d5\u00f6o000);
            this.\u00d6\u00f5o000 &= 0xFFFDFFFF;
        }
        b$_z.\u00d300000(b$_z, this.\u00d5\u00f6o000);
        b$_z.\u00d400000(b$_z, n3);
        return b$_z;
    }

    public final b$_z$_b super(b$_z b$_z) {
        if (b$_z == b$_z.\u00d3\u00f5\u00d3000()) {
            return this;
        }
        if (b$_z.\u00f4\u00f8\u00d3000()) {
            this.\u00d3\u00f40000(b$_z.\u00d6\u00f5\u00d3000());
        }
        if (b$_z.\u00f8\u00f4\u00d3000()) {
            this.classreturn(b$_z.floatclassnew());
        }
        if (b$_z.\u00f6\u00f4\u00d3000()) {
            this.intreturn(b$_z.\u00d6\u00f8\u00d3000());
        }
        if (b$_z.publicclassnew()) {
            this.OO0000(b$_z.\u00d4\u00f8\u00d3000());
        }
        if (b$_z.\u00d2\u00f8\u00d3000()) {
            this.superreturn(b$_z.\u00d6\u00f4\u00d3000());
        }
        if (!b$_z.\u00f600000(b$_z).isEmpty()) {
            if (this.forreturnsuper.isEmpty()) {
                this.forreturnsuper = b$_z.\u00f600000(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFFFFDF;
            } else {
                this.\u00d6\u00d6\u00d3000();
                this.forreturnsuper.addAll(b$_z.\u00f600000(b$_z));
            }
        }
        if (b$_z.Objectclassnew()) {
            this.\u00f800000(b$_z.\u00d2\u00f5\u00d3000());
        }
        if (b$_z.O\u00f6\u00d3000()) {
            this.\u00d4\u00f40000(b$_z.\u00d6\u00f6\u00d3000());
        }
        if (!b$_z.OO0000(b$_z).isEmpty()) {
            if (this.\u00d3\u00f6o000.isEmpty()) {
                this.\u00d3\u00f6o000 = b$_z.OO0000(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFFFEFF;
            } else {
                this.\u00d2\u00d8\u00d3000();
                this.\u00d3\u00f6o000.addAll(b$_z.OO0000(b$_z));
            }
        }
        if (!b$_z.class(b$_z).isEmpty()) {
            if (this.\u00d6\u00f6o000.isEmpty()) {
                this.\u00d6\u00f6o000 = b$_z.class(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFFFDFF;
            } else {
                this.floatObjectnew();
                this.\u00d6\u00f6o000.addAll(b$_z.class(b$_z));
            }
        }
        if (!b$_z.\u00f400000(b$_z).isEmpty()) {
            if (this.\u00d8\u00f5o000.isEmpty()) {
                this.\u00d8\u00f5o000 = b$_z.\u00f400000(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFFFBFF;
            } else {
                this.O\u00d6\u00d3000();
                this.\u00d8\u00f5o000.addAll(b$_z.\u00f400000(b$_z));
            }
        }
        if (!b$_z.\u00d200000(b$_z).isEmpty()) {
            if (this.\u00d8\u00f6o000.isEmpty()) {
                this.\u00d8\u00f6o000 = b$_z.\u00d200000(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFFF7FF;
            } else {
                this.\u00f8\u00d6\u00d3000();
                this.\u00d8\u00f6o000.addAll(b$_z.\u00d200000(b$_z));
            }
        }
        if (b$_z.\u00d8\u00f4\u00d3000()) {
            this.\u00d800000(b$_z.voidclassnew());
        }
        if (!b$_z.int(b$_z).isEmpty()) {
            if (this.\u00d2\u00f6o000.isEmpty()) {
                this.\u00d2\u00f6o000 = b$_z.int(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFFDFFF;
            } else {
                this.\u00d4\u00d6\u00d3000();
                this.\u00d2\u00f6o000.addAll(b$_z.int(b$_z));
            }
        }
        if (b$_z.interfacereturnnew()) {
            this.class(b$_z.\u00f8\u00f5\u00d3000());
        }
        if (!b$_z.\u00f800000(b$_z).isEmpty()) {
            if (this.\u00f8\u00f5o000.isEmpty()) {
                this.\u00f8\u00f5o000 = b$_z.\u00f800000(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFF7FFF;
            } else {
                this.\u00f6\u00d5\u00d3000();
                this.\u00f8\u00f5o000.addAll(b$_z.\u00f800000(b$_z));
            }
        }
        if (!b$_z.\u00d300000(b$_z).isEmpty()) {
            if (this.\u00f5\u00f5o000.isEmpty()) {
                this.\u00f5\u00f5o000 = b$_z.\u00d300000(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFEFFFF;
            } else {
                this.O\u00f4\u00d3000();
                this.\u00f5\u00f5o000.addAll(b$_z.\u00d300000(b$_z));
            }
        }
        if (!b$_z.\u00d800000(b$_z).isEmpty()) {
            if (this.\u00d5\u00f6o000.isEmpty()) {
                this.\u00d5\u00f6o000 = b$_z.\u00d800000(b$_z);
                this.\u00d6\u00f5o000 &= 0xFFFDFFFF;
            } else {
                this.doStringnew();
                this.\u00d5\u00f6o000.addAll(b$_z.\u00d800000(b$_z));
            }
        }
        this.super((d$_c)b$_z);
        b$_z$_b b$_z$_b = this;
        b$_z$_b.super(b$_z$_b.class().o00000(b$_z.\u00d600000(b$_z)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        int n2;
        if (!this.\u00f6\u00d8\u00d3000()) {
            return false;
        }
        if (this.classStringnew() && !this.\u00f4\u00d6\u00d3000().\u00d200000()) {
            return false;
        }
        for (n2 = 0; n2 < this.voidObjectnew(); ++n2) {
            if (this.\u00f4\u00f40000(n2).\u00d200000()) continue;
            return false;
        }
        if (this.interfaceStringnew() && !this.\u00d2\u00d6\u00d3000().\u00d200000()) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00f4\u00d8\u00d3000(); ++n2) {
            if (this.\u00d2\u00f40000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.O\u00d8\u00d3000(); ++n2) {
            if (this.\u00f6\u00f40000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00d6\u00d3000(); ++n2) {
            if (this.\u00f8\u00d80000(n2).\u00d200000()) continue;
            return false;
        }
        if (this.\u00d4\u00d8\u00d3000() && !this.\u00f6\u00d6\u00d3000().\u00d200000()) {
            return false;
        }
        if (this.\u00f8\u00d8\u00d3000() && !this.\u00f8\u00d5\u00d3000().\u00d200000()) {
            return false;
        }
        for (n2 = 0; n2 < this.publicObjectnew(); ++n2) {
            if (this.O\u00f40000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00d8\u00d3000(); ++n2) {
            if (this.\u00d6\u00f40000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.superStringnew(); ++n2) {
            if (this.\u00d8\u00f40000(n2).\u00d200000()) continue;
            return false;
        }
        return this.classStringsuper();
    }

    public final b$_z$_b \u00d2o0000(ab object, s s2) throws IOException {
        b$_z b$_z = null;
        try {
            b$_z = (b$_z)b$_z.\u00d20\u00d2000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_z = (b$_z)g2.o00000();
            throw object;
        }
        finally {
            if (b$_z != null) {
                this.super(b$_z);
            }
        }
        return this;
    }

    public final b$_z$_b \u00d3\u00f40000(int n2) {
        this.\u00d6\u00f5o000 |= 1;
        this.privatereturnsuper = n2;
        return this;
    }

    public final b$_z$_b classreturn(int n2) {
        this.\u00d6\u00f5o000 |= 2;
        this.\u00f6\u00f5o000 = n2;
        return this;
    }

    public final boolean \u00f6\u00d8\u00d3000() {
        return (this.\u00d6\u00f5o000 & 4) == 4;
    }

    public final b$_z$_b intreturn(int n2) {
        this.\u00d6\u00f5o000 |= 4;
        this.newvoidsuper = n2;
        return this;
    }

    public final boolean classStringnew() {
        return (this.\u00d6\u00f5o000 & 8) == 8;
    }

    public final b$_nb \u00f4\u00d6\u00d3000() {
        return this.\u00d2\u00f5o000;
    }

    public final b$_z$_b OO0000(b$_nb b$_nb) {
        this.\u00d2\u00f5o000 = (this.\u00d6\u00f5o000 & 8) == 8 && this.\u00d2\u00f5o000 != b$_nb.\u00d2o\u00d4000() ? b$_nb.Objectsuper(this.\u00d2\u00f5o000).\u00d3O0000(b$_nb).\u00f60\u00d4000() : b$_nb;
        this.\u00d6\u00f5o000 |= 8;
        return this;
    }

    public final b$_z$_b superreturn(int n2) {
        this.\u00d6\u00f5o000 |= 0x10;
        this.nullreturnsuper = n2;
        return this;
    }

    private void \u00d6\u00d6\u00d3000() {
        if ((this.\u00d6\u00f5o000 & 0x20) != 32) {
            this.forreturnsuper = new ArrayList(this.forreturnsuper);
            this.\u00d6\u00f5o000 |= 0x20;
        }
    }

    public final int voidObjectnew() {
        return this.forreturnsuper.size();
    }

    public final b$_b \u00f4\u00f40000(int n2) {
        return (b$_b)this.forreturnsuper.get(n2);
    }

    public final boolean interfaceStringnew() {
        return (this.\u00d6\u00f5o000 & 0x40) == 64;
    }

    public final b$_nb \u00d2\u00d6\u00d3000() {
        return this.o\u00f6o000;
    }

    public final b$_z$_b \u00f800000(b$_nb b$_nb) {
        this.o\u00f6o000 = (this.\u00d6\u00f5o000 & 0x40) == 64 && this.o\u00f6o000 != b$_nb.\u00d2o\u00d4000() ? b$_nb.Objectsuper(this.o\u00f6o000).\u00d3O0000(b$_nb).\u00f60\u00d4000() : b$_nb;
        this.\u00d6\u00f5o000 |= 0x40;
        return this;
    }

    public final b$_z$_b \u00d4\u00f40000(int n2) {
        this.\u00d6\u00f5o000 |= 0x80;
        this.Stringreturnsuper = n2;
        return this;
    }

    private void \u00d2\u00d8\u00d3000() {
        if ((this.\u00d6\u00f5o000 & 0x100) != 256) {
            this.\u00d3\u00f6o000 = new ArrayList(this.\u00d3\u00f6o000);
            this.\u00d6\u00f5o000 |= 0x100;
        }
    }

    public final int \u00f4\u00d8\u00d3000() {
        return this.\u00d3\u00f6o000.size();
    }

    public final b$_nb \u00d2\u00f40000(int n2) {
        return (b$_nb)this.\u00d3\u00f6o000.get(n2);
    }

    private void floatObjectnew() {
        if ((this.\u00d6\u00f5o000 & 0x200) != 512) {
            this.\u00d6\u00f6o000 = new ArrayList(this.\u00d6\u00f6o000);
            this.\u00d6\u00f5o000 |= 0x200;
        }
    }

    private void O\u00d6\u00d3000() {
        if ((this.\u00d6\u00f5o000 & 0x400) != 1024) {
            this.\u00d8\u00f5o000 = new ArrayList(this.\u00d8\u00f5o000);
            this.\u00d6\u00f5o000 |= 0x400;
        }
    }

    public final int O\u00d8\u00d3000() {
        return this.\u00d8\u00f5o000.size();
    }

    public final b$_c \u00f6\u00f40000(int n2) {
        return (b$_c)this.\u00d8\u00f5o000.get(n2);
    }

    private void \u00f8\u00d6\u00d3000() {
        if ((this.\u00d6\u00f5o000 & 0x800) != 2048) {
            this.\u00d8\u00f6o000 = new ArrayList(this.\u00d8\u00f6o000);
            this.\u00d6\u00f5o000 |= 0x800;
        }
    }

    public final int \u00d3\u00d6\u00d3000() {
        return this.\u00d8\u00f6o000.size();
    }

    public final b$_c \u00f8\u00d80000(int n2) {
        return (b$_c)this.\u00d8\u00f6o000.get(n2);
    }

    public final boolean \u00d4\u00d8\u00d3000() {
        return (this.\u00d6\u00f5o000 & 0x1000) == 4096;
    }

    public final b$_mb \u00f6\u00d6\u00d3000() {
        return this.\u00d5\u00f5o000;
    }

    public final b$_z$_b \u00d800000(b$_mb b$_mb) {
        this.\u00d5\u00f5o000 = (this.\u00d6\u00f5o000 & 0x1000) == 4096 && this.\u00d5\u00f5o000 != b$_mb.\u00d4oo000() ? b$_mb.\u00d400000(this.\u00d5\u00f5o000).super(b$_mb).\u00d6Oo000() : b$_mb;
        this.\u00d6\u00f5o000 |= 0x1000;
        return this;
    }

    private void \u00d4\u00d6\u00d3000() {
        if ((this.\u00d6\u00f5o000 & 0x2000) != 8192) {
            this.\u00d2\u00f6o000 = new ArrayList(this.\u00d2\u00f6o000);
            this.\u00d6\u00f5o000 |= 0x2000;
        }
    }

    public final boolean \u00f8\u00d8\u00d3000() {
        return (this.\u00d6\u00f5o000 & 0x4000) == 16384;
    }

    public final b$_ab \u00f8\u00d5\u00d3000() {
        return this.\u00d3\u00f5o000;
    }

    public final b$_z$_b class(b$_ab b$_ab) {
        this.\u00d3\u00f5o000 = (this.\u00d6\u00f5o000 & 0x4000) == 16384 && this.\u00d3\u00f5o000 != b$_ab.intif() ? b$_ab.\u00d300000(this.\u00d3\u00f5o000).super(b$_ab).\u00d2oO000() : b$_ab;
        this.\u00d6\u00f5o000 |= 0x4000;
        return this;
    }

    private void \u00f6\u00d5\u00d3000() {
        if ((this.\u00d6\u00f5o000 & 0x8000) != 32768) {
            this.\u00f8\u00f5o000 = new ArrayList(this.\u00f8\u00f5o000);
            this.\u00d6\u00f5o000 |= 0x8000;
        }
    }

    public final int publicObjectnew() {
        return this.\u00f8\u00f5o000.size();
    }

    public final b$_y O\u00f40000(int n2) {
        return (b$_y)this.\u00f8\u00f5o000.get(n2);
    }

    private void O\u00f4\u00d3000() {
        if ((this.\u00d6\u00f5o000 & 0x10000) != 65536) {
            this.\u00f5\u00f5o000 = new ArrayList(this.\u00f5\u00f5o000);
            this.\u00d6\u00f5o000 |= 0x10000;
        }
    }

    public final int \u00d3\u00d8\u00d3000() {
        return this.\u00f5\u00f5o000.size();
    }

    public final b$_db \u00d6\u00f40000(int n2) {
        return (b$_db)this.\u00f5\u00f5o000.get(n2);
    }

    public final b$_z$_b \u00d600000(Iterable iterable) {
        this.O\u00f4\u00d3000();
        k$_b.super(iterable, this.\u00f5\u00f5o000);
        return this;
    }

    private void doStringnew() {
        if ((this.\u00d6\u00f5o000 & 0x20000) != 131072) {
            this.\u00d5\u00f6o000 = new ArrayList(this.\u00d5\u00f6o000);
            this.\u00d6\u00f5o000 |= 0x20000;
        }
    }

    public final int superStringnew() {
        return this.\u00d5\u00f6o000.size();
    }

    public final b$_db \u00d8\u00f40000(int n2) {
        return (b$_db)this.\u00d5\u00f6o000.get(n2);
    }

    public final b$_z$_b class(Iterable iterable) {
        this.doStringnew();
        k$_b.super(iterable, this.\u00d5\u00f6o000);
        return this;
    }

    static /* synthetic */ b$_z$_b \u00d3\u00f4\u00d3000() {
        return b$_z$_b.intStringnew();
    }
}

