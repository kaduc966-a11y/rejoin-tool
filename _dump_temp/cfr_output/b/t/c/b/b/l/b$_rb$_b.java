/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_ob;
import b.t.c.b.b.l.b$_rb;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_c;
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
public final class b$_rb$_b
extends d$_g
implements b$_ob {
    private int o\u00d3\u00d2000;
    private int forifsuper;
    private List \u00f8\u00d2\u00d2000 = Collections.emptyList();

    private b$_rb$_b() {
        this.\u00d2\u00d3\u00d4000();
    }

    private void \u00d2\u00d3\u00d4000() {
    }

    private static b$_rb$_b \u00d4\u00d3\u00d4000() {
        return new b$_rb$_b();
    }

    public final b$_rb$_b intifnew() {
        return b$_rb$_b.\u00d4\u00d3\u00d4000().super(this.classifnew());
    }

    public final b$_rb \u00d6\u00d3\u00d4000() {
        return b$_rb.O\u00d4\u00d4000();
    }

    public final b$_rb \u00f6\u00d3\u00d4000() {
        b$_rb b$_rb = this.classifnew();
        if (!b$_rb.\u00d200000()) {
            throw b$_rb$_b.super(b$_rb);
        }
        return b$_rb;
    }

    public final b$_rb classifnew() {
        b$_rb b$_rb = new b$_rb(this, null);
        int n2 = this.o\u00d3\u00d2000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_rb.super(b$_rb, this.forifsuper);
        if ((this.o\u00d3\u00d2000 & 2) == 2) {
            this.\u00f8\u00d2\u00d2000 = Collections.unmodifiableList(this.\u00f8\u00d2\u00d2000);
            this.o\u00d3\u00d2000 &= 0xFFFFFFFD;
        }
        b$_rb.super(b$_rb, this.\u00f8\u00d2\u00d2000);
        b$_rb.\u00d200000(b$_rb, n3);
        return b$_rb;
    }

    public final b$_rb$_b super(b$_rb b$_rb) {
        if (b$_rb == b$_rb.O\u00d4\u00d4000()) {
            return this;
        }
        if (b$_rb.\u00d8\u00d4\u00d4000()) {
            this.\u00f4\u00f60000(b$_rb.\u00d6\u00d4\u00d4000());
        }
        if (!b$_rb.\u00d200000(b$_rb).isEmpty()) {
            if (this.\u00f8\u00d2\u00d2000.isEmpty()) {
                this.\u00f8\u00d2\u00d2000 = b$_rb.\u00d200000(b$_rb);
                this.o\u00d3\u00d2000 &= 0xFFFFFFFD;
            } else {
                this.\u00f4\u00d3\u00d4000();
                this.\u00f8\u00d2\u00d2000.addAll(b$_rb.\u00d200000(b$_rb));
            }
        }
        this.super((d$_c)b$_rb);
        b$_rb$_b b$_rb$_b = this;
        b$_rb$_b.super(b$_rb$_b.class().o00000(b$_rb.\u00d400000(b$_rb)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        for (int i2 = 0; i2 < this.\u00d8\u00d3\u00d4000(); ++i2) {
            if (this.\u00d8\u00f60000(i2).\u00d200000()) continue;
            return false;
        }
        return this.classStringsuper();
    }

    public final b$_rb$_b \u00d4o0000(ab object, s s2) throws IOException {
        b$_rb b$_rb = null;
        try {
            b$_rb = (b$_rb)b$_rb.\u00f5\u00d3\u00d2000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_rb = (b$_rb)g2.o00000();
            throw object;
        }
        finally {
            if (b$_rb != null) {
                this.super(b$_rb);
            }
        }
        return this;
    }

    public final b$_rb$_b \u00f4\u00f60000(int n2) {
        this.o\u00d3\u00d2000 |= 1;
        this.forifsuper = n2;
        return this;
    }

    private void \u00f4\u00d3\u00d4000() {
        if ((this.o\u00d3\u00d2000 & 2) != 2) {
            this.\u00f8\u00d2\u00d2000 = new ArrayList(this.\u00f8\u00d2\u00d2000);
            this.o\u00d3\u00d2000 |= 2;
        }
    }

    public final int \u00d8\u00d3\u00d4000() {
        return this.\u00f8\u00d2\u00d2000.size();
    }

    public final b$_db \u00d8\u00f60000(int n2) {
        return (b$_db)this.\u00f8\u00d2\u00d2000.get(n2);
    }

    public final b$_rb$_b \u00f400000(b$_db b$_db) {
        if (b$_db == null) {
            throw new NullPointerException();
        }
        this.\u00f4\u00d3\u00d4000();
        this.\u00f8\u00d2\u00d2000.add(b$_db);
        return this;
    }

    static /* synthetic */ b$_rb$_b \u00d3\u00d3\u00d4000() {
        return b$_rb$_b.\u00d4\u00d3\u00d4000();
    }
}

