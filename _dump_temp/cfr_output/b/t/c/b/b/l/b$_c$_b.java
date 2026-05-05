/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_bb;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_db$_c$_c;
import b.t.c.b.b.l.b$_nb;
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
public final class b$_c$_b
extends d$_g
implements b$_bb {
    private int \u00d8\u00d6O000;
    private int \u00d2\u00d8O000;
    private int thiswhile;
    private b$_nb \u00f8\u00d6O000 = b$_nb.\u00d2o\u00d4000();
    private int \u00d3\u00d8O000;
    private b$_nb whiledo = b$_nb.\u00d2o\u00d4000();
    private int o\u00d8O000;
    private List \u00f6\u00d6O000 = Collections.emptyList();
    private b$_db$_c$_c \u00f5\u00d6O000 = b$_db$_c$_c.\u00d4\u00d3O000();

    private b$_c$_b() {
        this.\u00d8\u00d8o000();
    }

    private void \u00d8\u00d8o000() {
    }

    private static b$_c$_b \u00d2\u00d8o000() {
        return new b$_c$_b();
    }

    public final b$_c$_b \u00f4\u00d8o000() {
        return b$_c$_b.\u00d2\u00d8o000().super(this.intStringsuper());
    }

    public final b$_c interfaceStringsuper() {
        return b$_c.floatclasssuper();
    }

    public final b$_c \u00f6\u00d6o000() {
        b$_c b$_c = this.intStringsuper();
        if (!b$_c.\u00d200000()) {
            throw b$_c$_b.super(b$_c);
        }
        return b$_c;
    }

    public final b$_c intStringsuper() {
        b$_c b$_c = new b$_c(this, null);
        int n2 = this.\u00d8\u00d6O000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_c.super(b$_c, this.\u00d2\u00d8O000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_c.\u00d200000(b$_c, this.thiswhile);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_c.super(b$_c, this.\u00f8\u00d6O000);
        if ((n2 & 8) == 8) {
            n3 |= 8;
        }
        b$_c.\u00d300000(b$_c, this.\u00d3\u00d8O000);
        if ((n2 & 0x10) == 16) {
            n3 |= 0x10;
        }
        b$_c.\u00d200000(b$_c, this.whiledo);
        if ((n2 & 0x20) == 32) {
            n3 |= 0x20;
        }
        b$_c.\u00d400000(b$_c, this.o\u00d8O000);
        if ((this.\u00d8\u00d6O000 & 0x40) == 64) {
            this.\u00f6\u00d6O000 = Collections.unmodifiableList(this.\u00f6\u00d6O000);
            this.\u00d8\u00d6O000 &= 0xFFFFFFBF;
        }
        b$_c.super(b$_c, this.\u00f6\u00d6O000);
        if ((n2 & 0x80) == 128) {
            n3 |= 0x40;
        }
        b$_c.super(b$_c, this.\u00f5\u00d6O000);
        b$_c.class(b$_c, n3);
        return b$_c;
    }

    public final b$_c$_b super(b$_c b$_c) {
        if (b$_c == b$_c.floatclasssuper()) {
            return this;
        }
        if (b$_c.publicclasssuper()) {
            this.\u00d6\u00d20000(b$_c.\u00d6\u00f4o000());
        }
        if (b$_c.intreturnsuper()) {
            this.classnew(b$_c.\u00d2\u00f5o000());
        }
        if (b$_c.\u00d8\u00f4o000()) {
            this.\u00d600000(b$_c.\u00f4\u00f4o000());
        }
        if (b$_c.voidclasssuper()) {
            this.intnew(b$_c.\u00d3\u00f5o000());
        }
        if (b$_c.\u00d3\u00f4o000()) {
            this.class(b$_c.\u00f4\u00f5o000());
        }
        if (b$_c.\u00d8\u00f5o000()) {
            this.\u00d8\u00d20000(b$_c.\u00f6\u00f4o000());
        }
        if (!b$_c.\u00d200000(b$_c).isEmpty()) {
            if (this.\u00f6\u00d6O000.isEmpty()) {
                this.\u00f6\u00d6O000 = b$_c.\u00d200000(b$_c);
                this.\u00d8\u00d6O000 &= 0xFFFFFFBF;
            } else {
                this.\u00f8\u00d8o000();
                this.\u00f6\u00d6O000.addAll(b$_c.\u00d200000(b$_c));
            }
        }
        if (b$_c.\u00f6\u00f5o000()) {
            this.\u00f400000(b$_c.\u00d2\u00f4o000());
        }
        this.super((d$_c)b$_c);
        b$_c$_b b$_c$_b = this;
        b$_c$_b.super(b$_c$_b.class().o00000(b$_c.\u00d300000(b$_c)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        if (!this.\u00f6\u00d8o000()) {
            return false;
        }
        if (this.\u00d3\u00d8o000() && !this.\u00d4\u00d8o000().\u00d200000()) {
            return false;
        }
        if (this.doStringsuper() && !this.Objectclasssuper().\u00d200000()) {
            return false;
        }
        for (int i2 = 0; i2 < this.\u00d6\u00d8o000(); ++i2) {
            if (this.\u00f4\u00d20000(i2).\u00d200000()) continue;
            return false;
        }
        if (this.O\u00f4o000() && !this.\u00f8\u00d6o000().\u00d200000()) {
            return false;
        }
        return this.classStringsuper();
    }

    public final b$_c$_b \u00f4O0000(ab object, s s2) throws IOException {
        b$_c b$_c = null;
        try {
            b$_c = (b$_c)b$_c.Stringwhile.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_c = (b$_c)g2.o00000();
            throw object;
        }
        finally {
            if (b$_c != null) {
                this.super(b$_c);
            }
        }
        return this;
    }

    public final b$_c$_b \u00d6\u00d20000(int n2) {
        this.\u00d8\u00d6O000 |= 1;
        this.\u00d2\u00d8O000 = n2;
        return this;
    }

    public final boolean \u00f6\u00d8o000() {
        return (this.\u00d8\u00d6O000 & 2) == 2;
    }

    public final b$_c$_b classnew(int n2) {
        this.\u00d8\u00d6O000 |= 2;
        this.thiswhile = n2;
        return this;
    }

    public final boolean \u00d3\u00d8o000() {
        return (this.\u00d8\u00d6O000 & 4) == 4;
    }

    public final b$_nb \u00d4\u00d8o000() {
        return this.\u00f8\u00d6O000;
    }

    public final b$_c$_b \u00d400000(b$_nb b$_nb) {
        if (b$_nb == null) {
            throw new NullPointerException();
        }
        this.\u00f8\u00d6O000 = b$_nb;
        this.\u00d8\u00d6O000 |= 4;
        return this;
    }

    public final b$_c$_b \u00d600000(b$_nb b$_nb) {
        this.\u00f8\u00d6O000 = (this.\u00d8\u00d6O000 & 4) == 4 && this.\u00f8\u00d6O000 != b$_nb.\u00d2o\u00d4000() ? b$_nb.Objectsuper(this.\u00f8\u00d6O000).\u00d3O0000(b$_nb).\u00f60\u00d4000() : b$_nb;
        this.\u00d8\u00d6O000 |= 4;
        return this;
    }

    public final b$_c$_b intnew(int n2) {
        this.\u00d8\u00d6O000 |= 8;
        this.\u00d3\u00d8O000 = n2;
        return this;
    }

    public final boolean doStringsuper() {
        return (this.\u00d8\u00d6O000 & 0x10) == 16;
    }

    public final b$_nb Objectclasssuper() {
        return this.whiledo;
    }

    public final b$_c$_b \u00d800000(b$_nb b$_nb) {
        if (b$_nb == null) {
            throw new NullPointerException();
        }
        this.whiledo = b$_nb;
        this.\u00d8\u00d6O000 |= 0x10;
        return this;
    }

    public final b$_c$_b class(b$_nb b$_nb) {
        this.whiledo = (this.\u00d8\u00d6O000 & 0x10) == 16 && this.whiledo != b$_nb.\u00d2o\u00d4000() ? b$_nb.Objectsuper(this.whiledo).\u00d3O0000(b$_nb).\u00f60\u00d4000() : b$_nb;
        this.\u00d8\u00d6O000 |= 0x10;
        return this;
    }

    public final b$_c$_b \u00d8\u00d20000(int n2) {
        this.\u00d8\u00d6O000 |= 0x20;
        this.o\u00d8O000 = n2;
        return this;
    }

    private void \u00f8\u00d8o000() {
        if ((this.\u00d8\u00d6O000 & 0x40) != 64) {
            this.\u00f6\u00d6O000 = new ArrayList(this.\u00f6\u00d6O000);
            this.\u00d8\u00d6O000 |= 0x40;
        }
    }

    public final int \u00d6\u00d8o000() {
        return this.\u00f6\u00d6O000.size();
    }

    public final b$_db \u00f4\u00d20000(int n2) {
        return (b$_db)this.\u00f6\u00d6O000.get(n2);
    }

    public final b$_c$_b \u00d200000(Iterable iterable) {
        this.\u00f8\u00d8o000();
        k$_b.super(iterable, this.\u00f6\u00d6O000);
        return this;
    }

    public final boolean O\u00f4o000() {
        return (this.\u00d8\u00d6O000 & 0x80) == 128;
    }

    public final b$_db$_c$_c \u00f8\u00d6o000() {
        return this.\u00f5\u00d6O000;
    }

    public final b$_c$_b \u00d800000(b$_db$_c$_c b$_db$_c$_c) {
        if (b$_db$_c$_c == null) {
            throw new NullPointerException();
        }
        this.\u00f5\u00d6O000 = b$_db$_c$_c;
        this.\u00d8\u00d6O000 |= 0x80;
        return this;
    }

    public final b$_c$_b \u00f400000(b$_db$_c$_c b$_db$_c$_c) {
        this.\u00f5\u00d6O000 = (this.\u00d8\u00d6O000 & 0x80) == 128 && this.\u00f5\u00d6O000 != b$_db$_c$_c.\u00d4\u00d3O000() ? b$_db$_c$_c.\u00d300000(this.\u00f5\u00d6O000).super(b$_db$_c$_c).\u00d8\u00d2O000() : b$_db$_c$_c;
        this.\u00d8\u00d6O000 |= 0x80;
        return this;
    }

    static /* synthetic */ b$_c$_b O\u00d8o000() {
        return b$_c$_b.\u00d2\u00d8o000();
    }
}

