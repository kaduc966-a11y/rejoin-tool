/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_b$_b;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_hb;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_g;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_b$_c
extends d$_g
implements b$_hb {
    private int \u00d8\u00d5\u00d2000;
    private int o\u00d5\u00d2000;
    private int Stringforsuper;
    private boolean \u00d2\u00d5\u00d2000;
    private b$_b$_b \u00d6\u00d5\u00d2000 = b$_b$_b.return;
    private List \u00d5\u00d5\u00d2000 = Collections.emptyList();
    private List thisforsuper = Collections.emptyList();
    private List \u00d3\u00d5\u00d2000 = Collections.emptyList();

    private b$_b$_c() {
        this.classfornew();
    }

    private void classfornew() {
    }

    private static b$_b$_c \u00d3\u00d8\u00d4000() {
        return new b$_b$_c();
    }

    public final b$_b$_c O\u00d8\u00d4000() {
        return b$_b$_c.\u00d3\u00d8\u00d4000().\u00d600000(this.\u00d8\u00d6\u00d4000());
    }

    public final b$_b \u00f6\u00d6\u00d4000() {
        return b$_b.\u00f8\u00d5\u00d4000();
    }

    public final b$_b \u00d4\u00d6\u00d4000() {
        b$_b b$_b = this.\u00d8\u00d6\u00d4000();
        if (!b$_b.\u00d200000()) {
            throw b$_b$_c.super(b$_b);
        }
        return b$_b;
    }

    public final b$_b \u00d8\u00d6\u00d4000() {
        b$_b b$_b = new b$_b(this, null);
        int n2 = this.\u00d8\u00d5\u00d2000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_b.\u00d300000(b$_b, this.o\u00d5\u00d2000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_b.super(b$_b, this.Stringforsuper);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_b.super(b$_b, this.\u00d2\u00d5\u00d2000);
        if ((n2 & 8) == 8) {
            n3 |= 8;
        }
        b$_b.super(b$_b, this.\u00d6\u00d5\u00d2000);
        if ((this.\u00d8\u00d5\u00d2000 & 0x10) == 16) {
            this.\u00d5\u00d5\u00d2000 = Collections.unmodifiableList(this.\u00d5\u00d5\u00d2000);
            this.\u00d8\u00d5\u00d2000 &= 0xFFFFFFEF;
        }
        b$_b.\u00d300000(b$_b, this.\u00d5\u00d5\u00d2000);
        if ((this.\u00d8\u00d5\u00d2000 & 0x20) == 32) {
            this.thisforsuper = Collections.unmodifiableList(this.thisforsuper);
            this.\u00d8\u00d5\u00d2000 &= 0xFFFFFFDF;
        }
        b$_b.\u00d200000(b$_b, this.thisforsuper);
        if ((this.\u00d8\u00d5\u00d2000 & 0x40) == 64) {
            this.\u00d3\u00d5\u00d2000 = Collections.unmodifiableList(this.\u00d3\u00d5\u00d2000);
            this.\u00d8\u00d5\u00d2000 &= 0xFFFFFFBF;
        }
        b$_b.super(b$_b, this.\u00d3\u00d5\u00d2000);
        b$_b.\u00d200000(b$_b, n3);
        return b$_b;
    }

    public final b$_b$_c \u00d600000(b$_b b$_b) {
        if (b$_b == b$_b.\u00f8\u00d5\u00d4000()) {
            return this;
        }
        if (b$_b.superfornew()) {
            this.O\u00f80000(b$_b.voidfloatnew());
        }
        if (b$_b.O\u00d6\u00d4000()) {
            this.\u00d3\u00f80000(b$_b.\u00d6\u00d5\u00d4000());
        }
        if (b$_b.\u00d4\u00d5\u00d4000()) {
            this.\u00d200000(b$_b.O\u00d5\u00d4000());
        }
        if (b$_b.publicfloatnew()) {
            this.super(b$_b.\u00f6\u00d4\u00d4000());
        }
        if (!b$_b.\u00d400000(b$_b).isEmpty()) {
            if (this.\u00d5\u00d5\u00d2000.isEmpty()) {
                this.\u00d5\u00d5\u00d2000 = b$_b.\u00d400000(b$_b);
                this.\u00d8\u00d5\u00d2000 &= 0xFFFFFFEF;
            } else {
                this.\u00d4\u00d8\u00d4000();
                this.\u00d5\u00d5\u00d2000.addAll(b$_b.\u00d400000(b$_b));
            }
        }
        if (!b$_b.super(b$_b).isEmpty()) {
            if (this.thisforsuper.isEmpty()) {
                this.thisforsuper = b$_b.super(b$_b);
                this.\u00d8\u00d5\u00d2000 &= 0xFFFFFFDF;
            } else {
                this.intfornew();
                this.thisforsuper.addAll(b$_b.super(b$_b));
            }
        }
        if (!b$_b.\u00d200000(b$_b).isEmpty()) {
            if (this.\u00d3\u00d5\u00d2000.isEmpty()) {
                this.\u00d3\u00d5\u00d2000 = b$_b.\u00d200000(b$_b);
                this.\u00d8\u00d5\u00d2000 &= 0xFFFFFFBF;
            } else {
                this.\u00d2\u00d8\u00d4000();
                this.\u00d3\u00d5\u00d2000.addAll(b$_b.\u00d200000(b$_b));
            }
        }
        this.super(b$_b);
        b$_b$_c b$_b$_c = this;
        b$_b$_c.super(b$_b$_c.class().o00000(b$_b.class(b$_b)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        int n2;
        if (!this.\u00f4\u00d6\u00d4000()) {
            return false;
        }
        if (!this.interfacefornew()) {
            return false;
        }
        for (n2 = 0; n2 < this.dofornew(); ++n2) {
            if (this.supernull(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f8\u00d6\u00d4000(); ++n2) {
            if (this.\u00d2\u00f80000(n2).\u00d200000()) continue;
            return false;
        }
        return this.classStringsuper();
    }

    public final b$_b$_c floatsuper(ab object, s s2) throws IOException {
        b$_b b$_b = null;
        try {
            b$_b = (b$_b)b$_b.\u00f6\u00d3\u00d2000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_b = (b$_b)g2.o00000();
            throw object;
        }
        finally {
            if (b$_b != null) {
                this.\u00d600000(b$_b);
            }
        }
        return this;
    }

    public final boolean \u00f4\u00d6\u00d4000() {
        return (this.\u00d8\u00d5\u00d2000 & 1) == 1;
    }

    public final b$_b$_c O\u00f80000(int n2) {
        this.\u00d8\u00d5\u00d2000 |= 1;
        this.o\u00d5\u00d2000 = n2;
        return this;
    }

    public final boolean interfacefornew() {
        return (this.\u00d8\u00d5\u00d2000 & 2) == 2;
    }

    public final b$_b$_c \u00d3\u00f80000(int n2) {
        this.\u00d8\u00d5\u00d2000 |= 2;
        this.Stringforsuper = n2;
        return this;
    }

    public final b$_b$_c \u00d200000(boolean bl) {
        this.\u00d8\u00d5\u00d2000 |= 4;
        this.\u00d2\u00d5\u00d2000 = bl;
        return this;
    }

    public final b$_b$_c super(b$_b$_b b$_b$_b) {
        if (b$_b$_b == null) {
            throw new NullPointerException();
        }
        this.\u00d8\u00d5\u00d2000 |= 8;
        this.\u00d6\u00d5\u00d2000 = b$_b$_b;
        return this;
    }

    private void \u00d4\u00d8\u00d4000() {
        if ((this.\u00d8\u00d5\u00d2000 & 0x10) != 16) {
            this.\u00d5\u00d5\u00d2000 = new ArrayList(this.\u00d5\u00d5\u00d2000);
            this.\u00d8\u00d5\u00d2000 |= 0x10;
        }
    }

    public final int dofornew() {
        return this.\u00d5\u00d5\u00d2000.size();
    }

    public final b$_nb supernull(int n2) {
        return (b$_nb)this.\u00d5\u00d5\u00d2000.get(n2);
    }

    public final b$_b$_c Oo0000(b$_nb b$_nb) {
        if (b$_nb == null) {
            throw new NullPointerException();
        }
        this.\u00d4\u00d8\u00d4000();
        this.\u00d5\u00d5\u00d2000.add(b$_nb);
        return this;
    }

    private void intfornew() {
        if ((this.\u00d8\u00d5\u00d2000 & 0x20) != 32) {
            this.thisforsuper = new ArrayList(this.thisforsuper);
            this.\u00d8\u00d5\u00d2000 |= 0x20;
        }
    }

    private void \u00d2\u00d8\u00d4000() {
        if ((this.\u00d8\u00d5\u00d2000 & 0x40) != 64) {
            this.\u00d3\u00d5\u00d2000 = new ArrayList(this.\u00d3\u00d5\u00d2000);
            this.\u00d8\u00d5\u00d2000 |= 0x40;
        }
    }

    public final int \u00f8\u00d6\u00d4000() {
        return this.\u00d3\u00d5\u00d2000.size();
    }

    public final b$_db \u00d2\u00f80000(int n2) {
        return (b$_db)this.\u00d3\u00d5\u00d2000.get(n2);
    }

    public final b$_b$_c int(b$_db b$_db) {
        if (b$_db == null) {
            throw new NullPointerException();
        }
        this.\u00d2\u00d8\u00d4000();
        this.\u00d3\u00d5\u00d2000.add(b$_db);
        return this;
    }

    static /* synthetic */ b$_b$_c \u00d6\u00d6\u00d4000() {
        return b$_b$_c.\u00d3\u00d8\u00d4000();
    }
}

