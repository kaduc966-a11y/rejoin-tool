/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.s.mc;
import b.t.c.b.b.c.b;
import b.t.c.b.b.c.c.c;
import b.t.c.b.b.c.c.g;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.i;
import b.t.c.b.b.c.l;
import b.t.c.b.bc$_b$0;
import b.t.c.b.cd;
import b.t.c.b.h;
import b.t.c.b.p;
import b.t.c.b.qc;
import b.t.j;
import b.t.u;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bc
extends qc {
    private final i \u00f8\u00d6\u00d3000;
    private final dc privateObjectnew;

    public bc(h h2, String string, Object object, i i2) {
        super(h2, string, object);
        this.\u00f8\u00d6\u00d3000 = i2;
        this.privateObjectnew = r.o00000(lb.\u00d400000, (b.o.e.h)new bc$_b$0(h2));
    }

    @Override
    protected final List \u00d5oo000() {
        return mc.\u00d500000();
    }

    @Override
    protected final db whilethissuper() {
        return null;
    }

    @Override
    protected final List \u00d4oo000() {
        return this.\u00f8\u00d6\u00d3000.\u00d400000();
    }

    @Override
    protected final cd Ooo000() {
        return ((b.t.c.b.r)this.o\u00d8O000()).\u00d4\u00d2o000();
    }

    @Override
    protected final g \u00d3oo000() {
        g g2 = c.super(this.\u00f8\u00d6\u00d3000);
        if (g2 == null) {
            throw new b.t.c.b.lb("No signature for constructor: ".concat(String.valueOf(this)));
        }
        return g2;
    }

    @Override
    public final String \u00f5\u00d5O000() {
        return "<init>";
    }

    @Override
    public final u \u00d5\u00d5O000() {
        return (u)this.privateObjectnew.\u00d200000();
    }

    @Override
    public final j \u00f8\u00d5O000() {
        return p.super(b.o00000(this.\u00f8\u00d6\u00d3000));
    }

    @Override
    public final l \u00d4\u00d8O000() {
        return l.void;
    }

    @Override
    public final boolean \u00f4\u00d5O000() {
        return false;
    }

    @Override
    public final boolean \u00d8\u00d8O000() {
        return false;
    }

    @Override
    public final boolean \u00f4\u00d8O000() {
        return false;
    }

    @Override
    public final boolean \u00d5\u00d8O000() {
        return false;
    }

    @Override
    public final boolean returnwhile() {
        return false;
    }

    @Override
    public final boolean whilewhile() {
        return !b.\u00d200000(this.\u00f8\u00d6\u00d3000);
    }

    private static final u new(h h2) {
        return b.t.b.h.\u00d3O0000((b.t.c.b.r)h2);
    }

    static /* synthetic */ u \u00d300000(h h2) {
        return bc.new(h2);
    }
}

