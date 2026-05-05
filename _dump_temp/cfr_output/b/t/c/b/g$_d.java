/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.e.h;
import b.r;
import b.t.c.b.b.c.n;
import b.t.c.b.d.b;
import b.t.c.b.fc;
import b.t.c.b.g$_c;
import b.t.c.b.g$_d$_b$0;
import b.t.m$_d;
import b.t.u;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class g$_d
extends g$_c
implements m$_d {
    private final dc \u00f8\u00f8\u00d2000;

    public g$_d() {
        g$_d g$_d = this;
        this.\u00f8\u00f8\u00d2000 = r.o00000(lb.\u00d400000, (h)new g$_d$_b$0(g$_d));
    }

    @Override
    public String \u00f5\u00d5O000() {
        return "<get-" + this.Stringpublic().\u00f5\u00d5O000() + '>';
    }

    @Override
    public n \u00f8\u00f4O000() {
        return this.Stringpublic().O\u00f8O000().\u00d3O0000();
    }

    @Override
    public List \u00f8\u00d6O000() {
        return this.Stringpublic().\u00f8\u00d6O000();
    }

    @Override
    public List \u00d8\u00d5O000() {
        return this.Stringpublic().\u00d8\u00d5O000();
    }

    @Override
    public u \u00d5\u00d5O000() {
        return this.Stringpublic().\u00d5\u00d5O000();
    }

    @Override
    public b privatedo() {
        return (b)this.\u00f8\u00f8\u00d2000.\u00d200000();
    }

    public boolean equals(Object object) {
        return object instanceof g$_d && b.o.d.fc.o00000((Object)this.Stringpublic(), (Object)((g$_d)object).Stringpublic());
    }

    public int hashCode() {
        return this.Stringpublic().hashCode();
    }

    public String toString() {
        return "getter of " + this.Stringpublic();
    }

    private static final b o00000(g$_d g$_d) {
        return fc.super(g$_d, true);
    }

    static /* synthetic */ b new(g$_d g$_d) {
        return g$_d.o00000(g$_d);
    }
}

