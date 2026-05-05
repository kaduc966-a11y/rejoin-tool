/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_f;
import b.t.c.b.b.l.b$_ub;
import b.t.c.b.b.l.b$_y;
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
public final class b$_f$_b
extends d$_g
implements b$_ub {
    private int \u00f8oo000;
    private int \u00d8oo000 = 6;
    private List \u00f6oo000 = Collections.emptyList();
    private List newsupersuper = Collections.emptyList();
    private List \u00d6oo000 = Collections.emptyList();
    private List \u00f5oo000 = Collections.emptyList();

    private b$_f$_b() {
        this.\u00d2\u00d6\u00d2000();
    }

    private void \u00d2\u00d6\u00d2000() {
    }

    private static b$_f$_b interfaceforsuper() {
        return new b$_f$_b();
    }

    public final b$_f$_b doforsuper() {
        return b$_f$_b.interfaceforsuper().super(this.\u00f4\u00d6\u00d2000());
    }

    public final b$_f \u00d6\u00d6\u00d2000() {
        return b$_f.\u00d8\u00d8\u00d2000();
    }

    public final b$_f Objectdosuper() {
        b$_f b$_f = this.\u00f4\u00d6\u00d2000();
        if (!b$_f.\u00d200000()) {
            throw b$_f$_b.super(b$_f);
        }
        return b$_f;
    }

    public final b$_f \u00f4\u00d6\u00d2000() {
        b$_f b$_f = new b$_f(this, null);
        int n2 = this.\u00f8oo000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_f.\u00d200000(b$_f, this.\u00d8oo000);
        if ((this.\u00f8oo000 & 2) == 2) {
            this.\u00f6oo000 = Collections.unmodifiableList(this.\u00f6oo000);
            this.\u00f8oo000 &= 0xFFFFFFFD;
        }
        b$_f.\u00d400000(b$_f, this.\u00f6oo000);
        if ((this.\u00f8oo000 & 4) == 4) {
            this.newsupersuper = Collections.unmodifiableList(this.newsupersuper);
            this.\u00f8oo000 &= 0xFFFFFFFB;
        }
        b$_f.\u00d300000(b$_f, this.newsupersuper);
        if ((this.\u00f8oo000 & 8) == 8) {
            this.\u00d6oo000 = Collections.unmodifiableList(this.\u00d6oo000);
            this.\u00f8oo000 &= 0xFFFFFFF7;
        }
        b$_f.super(b$_f, this.\u00d6oo000);
        if ((this.\u00f8oo000 & 0x10) == 16) {
            this.\u00f5oo000 = Collections.unmodifiableList(this.\u00f5oo000);
            this.\u00f8oo000 &= 0xFFFFFFEF;
        }
        b$_f.\u00d200000(b$_f, this.\u00f5oo000);
        b$_f.super(b$_f, n3);
        return b$_f;
    }

    public final b$_f$_b super(b$_f b$_f) {
        if (b$_f == b$_f.\u00d8\u00d8\u00d2000()) {
            return this;
        }
        if (b$_f.\u00f4\u00d8\u00d2000()) {
            this.\u00d3\u00d50000(b$_f.\u00d6\u00d8\u00d2000());
        }
        if (!b$_f.\u00d800000(b$_f).isEmpty()) {
            if (this.\u00f6oo000.isEmpty()) {
                this.\u00f6oo000 = b$_f.\u00d800000(b$_f);
                this.\u00f8oo000 &= 0xFFFFFFFD;
            } else {
                this.\u00d3\u00d6\u00d2000();
                this.\u00f6oo000.addAll(b$_f.\u00d800000(b$_f));
            }
        }
        if (!b$_f.\u00d400000(b$_f).isEmpty()) {
            if (this.newsupersuper.isEmpty()) {
                this.newsupersuper = b$_f.\u00d400000(b$_f);
                this.\u00f8oo000 &= 0xFFFFFFFB;
            } else {
                this.\u00f6\u00d6\u00d2000();
                this.newsupersuper.addAll(b$_f.\u00d400000(b$_f));
            }
        }
        if (!b$_f.\u00d300000(b$_f).isEmpty()) {
            if (this.\u00d6oo000.isEmpty()) {
                this.\u00d6oo000 = b$_f.\u00d300000(b$_f);
                this.\u00f8oo000 &= 0xFFFFFFF7;
            } else {
                this.\u00d8\u00d6\u00d2000();
                this.\u00d6oo000.addAll(b$_f.\u00d300000(b$_f));
            }
        }
        if (!b$_f.\u00d600000(b$_f).isEmpty()) {
            if (this.\u00f5oo000.isEmpty()) {
                this.\u00f5oo000 = b$_f.\u00d600000(b$_f);
                this.\u00f8oo000 &= 0xFFFFFFEF;
            } else {
                this.voiddosuper();
                this.\u00f5oo000.addAll(b$_f.\u00d600000(b$_f));
            }
        }
        this.super((d$_c)b$_f);
        b$_f$_b b$_f$_b = this;
        b$_f$_b.super(b$_f$_b.class().o00000(b$_f.\u00d200000(b$_f)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        int n2;
        for (n2 = 0; n2 < this.\u00d2\u00d8\u00d2000(); ++n2) {
            if (this.\u00d4\u00d50000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f8\u00d6\u00d2000(); ++n2) {
            if (this.classString(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.O\u00d8\u00d2000(); ++n2) {
            if (this.\u00d2\u00d50000(n2).\u00d200000()) continue;
            return false;
        }
        return this.classStringsuper();
    }

    public final b$_f$_b \u00f8O0000(ab object, s s2) throws IOException {
        b$_f b$_f = null;
        try {
            b$_f = (b$_f)b$_f.returnsupersuper.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_f = (b$_f)g2.o00000();
            throw object;
        }
        finally {
            if (b$_f != null) {
                this.super(b$_f);
            }
        }
        return this;
    }

    public final b$_f$_b \u00d3\u00d50000(int n2) {
        this.\u00f8oo000 |= 1;
        this.\u00d8oo000 = n2;
        return this;
    }

    private void \u00d3\u00d6\u00d2000() {
        if ((this.\u00f8oo000 & 2) != 2) {
            this.\u00f6oo000 = new ArrayList(this.\u00f6oo000);
            this.\u00f8oo000 |= 2;
        }
    }

    public final int \u00d2\u00d8\u00d2000() {
        return this.\u00f6oo000.size();
    }

    public final b$_c \u00d4\u00d50000(int n2) {
        return (b$_c)this.\u00f6oo000.get(n2);
    }

    private void \u00f6\u00d6\u00d2000() {
        if ((this.\u00f8oo000 & 4) != 4) {
            this.newsupersuper = new ArrayList(this.newsupersuper);
            this.\u00f8oo000 |= 4;
        }
    }

    private void \u00d8\u00d6\u00d2000() {
        if ((this.\u00f8oo000 & 8) != 8) {
            this.\u00d6oo000 = new ArrayList(this.\u00d6oo000);
            this.\u00f8oo000 |= 8;
        }
    }

    public final int \u00f8\u00d6\u00d2000() {
        return this.\u00d6oo000.size();
    }

    public final b$_y classString(int n2) {
        return (b$_y)this.\u00d6oo000.get(n2);
    }

    private void voiddosuper() {
        if ((this.\u00f8oo000 & 0x10) != 16) {
            this.\u00f5oo000 = new ArrayList(this.\u00f5oo000);
            this.\u00f8oo000 |= 0x10;
        }
    }

    public final int O\u00d8\u00d2000() {
        return this.\u00f5oo000.size();
    }

    public final b$_db \u00d2\u00d50000(int n2) {
        return (b$_db)this.\u00f5oo000.get(n2);
    }

    public final b$_f$_b \u00d400000(Iterable iterable) {
        this.voiddosuper();
        k$_b.super(iterable, this.\u00f5oo000);
        return this;
    }

    static /* synthetic */ b$_f$_b \u00d4\u00d6\u00d2000() {
        return b$_f$_b.interfaceforsuper();
    }
}

