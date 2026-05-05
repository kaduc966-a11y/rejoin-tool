/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_pb;
import b.t.c.b.b.l.b$_pb$_c;
import b.t.c.b.b.l.b$_t;
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
public final class b$_pb$_d
extends d$_f
implements b$_t {
    private int \u00f5\u00d5O000;
    private List newdo = Collections.emptyList();

    private b$_pb$_d() {
        this.\u00f6\u00d4o000();
    }

    private void \u00f6\u00d4o000() {
    }

    private static b$_pb$_d O\u00d5o000() {
        return new b$_pb$_d();
    }

    public final b$_pb$_d \u00d3\u00d5o000() {
        return b$_pb$_d.O\u00d5o000().super(this.\u00d6\u00d5o000());
    }

    public final b$_pb floatObjectsuper() {
        return b$_pb.\u00d8\u00d5o000();
    }

    public final b$_pb \u00d2\u00d5o000() {
        b$_pb b$_pb = this.\u00d6\u00d5o000();
        if (!b$_pb.\u00d200000()) {
            throw b$_pb$_d.super(b$_pb);
        }
        return b$_pb;
    }

    public final b$_pb \u00d6\u00d5o000() {
        b$_pb b$_pb = new b$_pb(this, null);
        if ((this.\u00f5\u00d5O000 & 1) == 1) {
            this.newdo = Collections.unmodifiableList(this.newdo);
            this.\u00f5\u00d5O000 &= 0xFFFFFFFE;
        }
        b$_pb.super(b$_pb, this.newdo);
        return b$_pb;
    }

    public final b$_pb$_d super(b$_pb b$_pb) {
        if (b$_pb == b$_pb.\u00d8\u00d5o000()) {
            return this;
        }
        if (!b$_pb.\u00d300000(b$_pb).isEmpty()) {
            if (this.newdo.isEmpty()) {
                this.newdo = b$_pb.\u00d300000(b$_pb);
                this.\u00f5\u00d5O000 &= 0xFFFFFFFE;
            } else {
                this.\u00d4\u00d5o000();
                this.newdo.addAll(b$_pb.\u00d300000(b$_pb));
            }
        }
        b$_pb$_d b$_pb$_d = this;
        b$_pb$_d.super(b$_pb$_d.class().o00000(b$_pb.\u00d400000(b$_pb)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        for (int i2 = 0; i2 < this.\u00f8\u00d4o000(); ++i2) {
            if (this.\u00d3\u00d20000(i2).\u00d200000()) continue;
            return false;
        }
        return true;
    }

    public final b$_pb$_d \u00d8O0000(ab object, s s2) throws IOException {
        b$_pb b$_pb = null;
        try {
            b$_pb = (b$_pb)b$_pb.\u00d3\u00d6O000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_pb = (b$_pb)g2.o00000();
            throw object;
        }
        finally {
            if (b$_pb != null) {
                this.super(b$_pb);
            }
        }
        return this;
    }

    private void \u00d4\u00d5o000() {
        if ((this.\u00f5\u00d5O000 & 1) != 1) {
            this.newdo = new ArrayList(this.newdo);
            this.\u00f5\u00d5O000 |= 1;
        }
    }

    public final int \u00f8\u00d4o000() {
        return this.newdo.size();
    }

    public final b$_pb$_c \u00d3\u00d20000(int n2) {
        return (b$_pb$_c)this.newdo.get(n2);
    }

    static /* synthetic */ b$_pb$_d voidObjectsuper() {
        return b$_pb$_d.O\u00d5o000();
    }
}

