/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_db$_c;
import b.t.c.b.b.l.b$_db$_c$_d;
import b.t.c.b.b.l.b$_tb;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_db$_d
extends d$_f
implements b$_tb {
    private int \u00d50O000;
    private int \u00d30O000;
    private List privatenull = Collections.emptyList();

    private b$_db$_d() {
        this.\u00d3\u00d8O000();
    }

    private void \u00d3\u00d8O000() {
    }

    private static b$_db$_d \u00d8\u00d8O000() {
        return new b$_db$_d();
    }

    public final b$_db$_d \u00d6\u00d8O000() {
        return b$_db$_d.\u00d8\u00d8O000().\u00d300000(this.\u00d2\u00d8O000());
    }

    public final b$_db \u00f8\u00d8O000() {
        return b$_db.\u00d4\u00f4O000();
    }

    public final b$_db classwhile() {
        b$_db b$_db = this.\u00d2\u00d8O000();
        if (!b$_db.\u00d200000()) {
            throw b$_db$_d.super(b$_db);
        }
        return b$_db;
    }

    public final b$_db \u00d2\u00d8O000() {
        b$_db b$_db = new b$_db(this, null);
        int n2 = this.\u00d50O000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_db.\u00d200000(b$_db, this.\u00d30O000);
        if ((this.\u00d50O000 & 2) == 2) {
            this.privatenull = Collections.unmodifiableList(this.privatenull);
            this.\u00d50O000 &= 0xFFFFFFFD;
        }
        b$_db.super(b$_db, this.privatenull);
        b$_db.super(b$_db, n3);
        return b$_db;
    }

    public final b$_db$_d \u00d300000(b$_db b$_db) {
        if (b$_db == b$_db.\u00d4\u00f4O000()) {
            return this;
        }
        if (b$_db.\u00d2\u00f4O000()) {
            this.\u00f8O0000(b$_db.\u00d8\u00f4O000());
        }
        if (!b$_db.\u00d600000(b$_db).isEmpty()) {
            if (this.privatenull.isEmpty()) {
                this.privatenull = b$_db.\u00d600000(b$_db);
                this.\u00d50O000 &= 0xFFFFFFFD;
            } else {
                this.\u00f6\u00d8O000();
                this.privatenull.addAll(b$_db.\u00d600000(b$_db));
            }
        }
        b$_db$_d b$_db$_d = this;
        b$_db$_d.super(b$_db$_d.class().o00000(b$_db.\u00d400000(b$_db)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        if (!this.\u00f4\u00d8O000()) {
            return false;
        }
        for (int i2 = 0; i2 < this.\u00d4\u00d8O000(); ++i2) {
            if (this.\u00f6O0000(i2).\u00d200000()) continue;
            return false;
        }
        return true;
    }

    public final b$_db$_d do(ab object, s s2) throws IOException {
        b$_db b$_db = null;
        try {
            b$_db = (b$_db)b$_db.oOO000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_db = (b$_db)g2.o00000();
            throw object;
        }
        finally {
            if (b$_db != null) {
                this.\u00d300000(b$_db);
            }
        }
        return this;
    }

    public final boolean \u00f4\u00d8O000() {
        return (this.\u00d50O000 & 1) == 1;
    }

    public final b$_db$_d \u00f8O0000(int n2) {
        this.\u00d50O000 |= 1;
        this.\u00d30O000 = n2;
        return this;
    }

    private void \u00f6\u00d8O000() {
        if ((this.\u00d50O000 & 2) != 2) {
            this.privatenull = new ArrayList(this.privatenull);
            this.\u00d50O000 |= 2;
        }
    }

    public final int \u00d4\u00d8O000() {
        return this.privatenull.size();
    }

    public final b$_db$_c \u00f6O0000(int n2) {
        return (b$_db$_c)this.privatenull.get(n2);
    }

    public final b$_db$_d super(b$_db$_c$_d b$_db$_c$_d) {
        this.\u00f6\u00d8O000();
        this.privatenull.add(b$_db$_c$_d.voiddo());
        return this;
    }

    static /* synthetic */ b$_db$_d intwhile() {
        return b$_db$_d.\u00d8\u00d8O000();
    }
}

