/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_gb;
import b.t.c.b.b.l.b$_mb;
import b.t.c.b.b.l.b$_nb;
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
public final class b$_mb$_b
extends d$_f
implements b$_gb {
    private int newfloat;
    private List \u00d8\u00d2O000 = Collections.emptyList();
    private int \u00f5\u00d2O000 = -1;

    private b$_mb$_b() {
        this.\u00f60o000();
    }

    private void \u00f60o000() {
    }

    private static b$_mb$_b classthissuper() {
        return new b$_mb$_b();
    }

    public final b$_mb$_b \u00d4Oo000() {
        return b$_mb$_b.classthissuper().super(this.\u00d6Oo000());
    }

    public final b$_mb \u00f80o000() {
        return b$_mb.\u00d4oo000();
    }

    public final b$_mb \u00d3Oo000() {
        b$_mb b$_mb = this.\u00d6Oo000();
        if (!b$_mb.\u00d200000()) {
            throw b$_mb$_b.super(b$_mb);
        }
        return b$_mb;
    }

    public final b$_mb \u00d6Oo000() {
        b$_mb b$_mb = new b$_mb(this, null);
        int n2 = this.newfloat;
        int n3 = 0;
        if ((this.newfloat & 1) == 1) {
            this.\u00d8\u00d2O000 = Collections.unmodifiableList(this.\u00d8\u00d2O000);
            this.newfloat &= 0xFFFFFFFE;
        }
        b$_mb.super(b$_mb, this.\u00d8\u00d2O000);
        if ((n2 & 2) == 2) {
            n3 = 1;
        }
        b$_mb.super(b$_mb, this.\u00f5\u00d2O000);
        b$_mb.\u00d200000(b$_mb, n3);
        return b$_mb;
    }

    public final b$_mb$_b super(b$_mb b$_mb) {
        if (b$_mb == b$_mb.\u00d4oo000()) {
            return this;
        }
        if (!b$_mb.\u00d300000(b$_mb).isEmpty()) {
            if (this.\u00d8\u00d2O000.isEmpty()) {
                this.\u00d8\u00d2O000 = b$_mb.\u00d300000(b$_mb);
                this.newfloat &= 0xFFFFFFFE;
            } else {
                this.\u00d2Oo000();
                this.\u00d8\u00d2O000.addAll(b$_mb.\u00d300000(b$_mb));
            }
        }
        if (b$_mb.\u00f6Oo000()) {
            this.\u00f6o0000(b$_mb.\u00d3oo000());
        }
        b$_mb$_b b$_mb$_b = this;
        b$_mb$_b.super(b$_mb$_b.class().o00000(b$_mb.\u00d200000(b$_mb)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        for (int i2 = 0; i2 < this.OOo000(); ++i2) {
            if (this.publicsuper(i2).\u00d200000()) continue;
            return false;
        }
        return true;
    }

    public final b$_mb$_b \u00d4O0000(ab object, s s2) throws IOException {
        b$_mb b$_mb = null;
        try {
            b$_mb = (b$_mb)b$_mb.\u00d5\u00d3O000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_mb = (b$_mb)g2.o00000();
            throw object;
        }
        finally {
            if (b$_mb != null) {
                this.super(b$_mb);
            }
        }
        return this;
    }

    private void \u00d2Oo000() {
        if ((this.newfloat & 1) != 1) {
            this.\u00d8\u00d2O000 = new ArrayList(this.\u00d8\u00d2O000);
            this.newfloat |= 1;
        }
    }

    public final int OOo000() {
        return this.\u00d8\u00d2O000.size();
    }

    public final b$_nb publicsuper(int n2) {
        return (b$_nb)this.\u00d8\u00d2O000.get(n2);
    }

    public final b$_mb$_b \u00f6o0000(int n2) {
        this.newfloat |= 2;
        this.\u00f5\u00d2O000 = n2;
        return this;
    }

    static /* synthetic */ b$_mb$_b superthissuper() {
        return b$_mb$_b.classthissuper();
    }
}

