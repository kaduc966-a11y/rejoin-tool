/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.o.d.fc;
import b.o.e.f;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.c.ab;
import b.t.c.b.b.h.c.bb;
import b.t.c.b.b.h.c.h;
import b.t.c.b.b.h.c.j;
import b.t.c.b.b.h.c.k;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.c.t;
import b.t.c.b.b.h.c.u;
import b.t.c.b.b.h.c.v;
import b.t.c.b.b.h.cb;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.e.e;
import b.t.c.b.b.h.e.f$_b;
import b.t.c.b.b.h.e.z;
import b.t.c.b.b.h.e.z$_b;
import b.t.c.b.b.o.g$_b$1;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g
implements z {
    private final Map \u00d400000;
    private final f$_b \u00d300000;
    private final b return;
    private final b.t.c.b.b.h.e.g new;
    private final f \u00d500000;

    public g(Map map, f$_b f$_b, b b2, b.t.c.b.b.h.e.g g2, f f2) {
        this.\u00d400000 = map;
        this.\u00d300000 = f$_b;
        this.return = b2;
        this.new = g2;
        this.\u00d500000 = f2;
    }

    @Override
    public final boolean o00000(b.t.c.b.b.h.c.g object, b.t.c.b.b.h.c.g g2) {
        if (!(object instanceof bc)) {
            object = "Failed requirement.";
            throw new IllegalArgumentException(object.toString());
        }
        if (!(g2 instanceof bc)) {
            object = "Failed requirement.";
            throw new IllegalArgumentException(object.toString());
        }
        return z$_b.o00000((z)this, (b.t.c.b.b.h.c.g)object, g2) || this.o00000((bc)object, (bc)g2);
    }

    @Override
    public final cb o00000(boolean bl, boolean bl2, boolean bl3) {
        if (this.\u00d500000 == null) {
            b b2 = this.return;
            b.t.c.b.b.h.e.g g2 = this.new;
            return e.o00000(bl, bl2, this, g2, b2);
        }
        b.t.c.b.b.h.e.g g3 = this.new;
        b b3 = this.return;
        return new g$_b$1(bl, bl2, bl3, this, g3, b3);
    }

    private final boolean o00000(bc bc2, bc bc3) {
        if (this.\u00d300000.o00000(bc2, bc3)) {
            return true;
        }
        if (this.\u00d400000 == null) {
            return false;
        }
        bc bc4 = (bc)this.\u00d400000.get(bc2);
        bc bc5 = (bc)this.\u00d400000.get(bc3);
        return bc4 != null && fc.o00000((Object)bc4, (Object)bc3) || bc5 != null && fc.o00000((Object)bc5, (Object)bc2);
    }

    @Override
    public final b.t.c.b.b.h.c.g \u00f400000(q q2) {
        return this.O\u00d30000(q2);
    }

    @Override
    public final q \u00d3O0000(q q2) {
        return this.whilenew(q2);
    }

    @Override
    public final ab OO0000(j j2) {
        return this.\u00f4O0000(j2);
    }

    @Override
    public final boolean new(q q2) {
        return this.\u00d5\u00d20000(q2);
    }

    @Override
    public final u \u00d300000(j j2) {
        return this.\u00f8O0000(j2);
    }

    @Override
    public final bb o00000(j j2, int n2) {
        return this.\u00d300000(j2, n2);
    }

    @Override
    public final j \u00d800000(q q2) {
        return this.\u00f8\u00d20000(q2);
    }

    @Override
    public final j while(q q2) {
        return this.\u00d3\u00d30000(q2);
    }

    @Override
    public final boolean OO0000(q q2) {
        return this.ifnew(q2);
    }

    @Override
    public final boolean oO0000(q q2) {
        return this.o\u00d30000(q2);
    }

    @Override
    public final boolean \u00d300000(q q2) {
        return this.\u00f4\u00d20000(q2);
    }

    @Override
    public final boolean \u00f800000(q q2) {
        return this.\u00f5\u00d20000(q2);
    }

    @Override
    public final boolean \u00d400000(j j2) {
        return this.Stringsuper(j2);
    }

    @Override
    public final boolean Stringsuper(q q2) {
        return this.\u00d4\u00d20000(q2);
    }

    @Override
    public final boolean \u00d500000(q q2) {
        return this.returnnew(q2);
    }

    @Override
    public final boolean oO0000(j j2) {
        return this.\u00d8O0000(j2);
    }

    @Override
    public final List o00000(j j2, b.t.c.b.b.h.c.g g2) {
        return this.\u00d300000(j2, g2);
    }

    @Override
    public final boolean if(j j2) {
        return this.\u00f5O0000(j2);
    }

    @Override
    public final bb o00000(h h2, int n2) {
        return this.\u00d300000(h2, n2);
    }

    @Override
    public final int o00000(h h2) {
        return this.\u00d300000(h2);
    }

    @Override
    public final q \u00f8O0000(q q2) {
        return this.\u00d8\u00d20000(q2);
    }

    public static final /* synthetic */ f o00000(g g2) {
        return g2.\u00d500000;
    }

    public final q \u00d8\u00d20000(q q2) {
        j j2 = this.\u00f4O0000(q2);
        if (j2 != null && (j2 = this.o00000(j2, true)) != null) {
            return j2;
        }
        return q2;
    }

    public final ab \u00f4O0000(j j2) {
        g g2 = this;
        return g2.o00000(g2.\u00d300000(j2));
    }

    public final boolean \u00d5\u00d20000(q q2) {
        j j2 = this.\u00f4O0000(q2);
        return (j2 != null ? this.OO0000(j2) : null) != null;
    }

    public final u \u00f8O0000(j j2) {
        j j3 = this.return(j2);
        if (j3 == null || (j3 = this.o00000((v)j3)) == null) {
            j3 = (u)j2;
        }
        return j3;
    }

    public final q whilenew(q q2) {
        return this.o00000(q2, false);
    }

    public final bb \u00d300000(j j2, int n2) {
        boolean bl = n2 >= 0 ? n2 < this.return((q)j2) : false;
        if (bl) {
            return this.o00000((q)j2, n2);
        }
        return null;
    }

    public final j \u00f8\u00d20000(q q2) {
        q q3 = this.\u00d4O0000(q2);
        if (q3 == null || (q3 = this.o00000((k)q3)) == null) {
            q3 = this.\u00f4O0000(q2);
        }
        return q3;
    }

    public final j \u00d3\u00d30000(q q2) {
        q q3 = this.\u00d4O0000(q2);
        if (q3 == null || (q3 = this.new((k)q3)) == null) {
            q3 = this.\u00f4O0000(q2);
        }
        return q3;
    }

    public final boolean ifnew(q q2) {
        g g2 = this;
        g g3 = this;
        return !fc.o00000((Object)g2.\u00d500000(g2.\u00d800000(q2)), (Object)g3.\u00d500000(g3.while(q2)));
    }

    public final boolean o\u00d30000(q q2) {
        return this.\u00d4O0000(q2) != null;
    }

    public final boolean \u00f4\u00d20000(q q2) {
        k k2 = this.\u00d4O0000(q2);
        return (k2 != null ? this.\u00d300000(k2) : null) != null;
    }

    public final boolean \u00f5\u00d20000(q q2) {
        j j2 = this.\u00f4O0000(q2);
        return (j2 != null ? this.return(j2) : null) != null;
    }

    public final boolean Stringsuper(j j2) {
        return this.return(j2) != null;
    }

    public final boolean \u00d4\u00d20000(q q2) {
        g g2 = this;
        g g3 = this;
        return g2.\u00d8O0000((q)g2.\u00d800000(q2)) != g3.\u00d8O0000((q)g3.while(q2));
    }

    public final b.t.c.b.b.h.c.g O\u00d30000(q q2) {
        g g2 = this;
        j j2 = g2.\u00f4O0000(q2);
        if (j2 == null) {
            j2 = this.\u00d800000(q2);
        }
        return g2.\u00d500000(j2);
    }

    public final boolean returnnew(q q2) {
        g g2 = this;
        return g2.\u00d500000(g2.\u00f400000(q2)) && !this.\u00d400000(q2);
    }

    public final boolean \u00d8O0000(j j2) {
        g g2 = this;
        return g2.new(g2.\u00d500000(j2));
    }

    public final List \u00d300000(j j2, b.t.c.b.b.h.c.g g2) {
        return null;
    }

    public final boolean \u00f5O0000(j j2) {
        g g2 = this;
        return g2.o00000(g2.\u00d500000(j2));
    }

    public final bb \u00d300000(h h2, int n2) {
        h h3 = h2;
        if (h3 instanceof u) {
            return this.o00000((q)((Object)h2), n2);
        }
        if (h3 instanceof t) {
            return (bb)((t)h2).get(n2);
        }
        throw new IllegalStateException(("unknown type argument list type: " + h2 + ", " + b.o.d.z.\u00d200000(h2.getClass())).toString());
    }

    public final int \u00d300000(h h2) {
        h h3 = h2;
        if (h3 instanceof j) {
            return this.return((q)((Object)h2));
        }
        if (h3 instanceof t) {
            return ((t)h2).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + h2 + ", " + b.o.d.z.\u00d200000(h2.getClass())).toString());
    }
}

