/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.e.h;
import b.r;
import b.s.mc;
import b.t.c.b.b.c.fb;
import b.t.c.b.b.c.n;
import b.t.c.b.cc;
import b.t.c.b.cd;
import b.t.c.b.d.b;
import b.t.c.b.fc;
import b.t.c.b.g$_c;
import b.t.c.b.g$_e$_b$0;
import b.t.c.b.g$_e$_b$1;
import b.t.c.b.g$_e$_c;
import b.t.c.b.kb;
import b.t.c.b.u;
import b.t.g$_b;
import b.t.p$_b;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class g$_e
extends g$_c
implements g$_b {
    private final dc \u00d8\u00f6\u00d2000;
    private final dc forpublicsuper;

    public g$_e() {
        g$_e g$_e = this;
        this.\u00d8\u00f6\u00d2000 = r.o00000(lb.\u00d400000, (h)new g$_e$_b$0(g$_e));
        g$_e = this;
        this.forpublicsuper = r.o00000(lb.\u00d400000, (h)new g$_e$_b$1(g$_e));
    }

    @Override
    public String \u00f5\u00d5O000() {
        return "<set-" + this.Stringpublic().\u00f5\u00d5O000() + '>';
    }

    @Override
    public n \u00f8\u00f4O000() {
        return this.Stringpublic().O\u00f8O000().\u00d300000();
    }

    @Override
    public List \u00f8\u00d6O000() {
        return mc.\u00d500000((Collection)this.Stringpublic().\u00f8\u00d6O000(), this.\u00d8\u00f6\u00d2000.\u00d200000());
    }

    @Override
    public List \u00d8\u00d5O000() {
        return mc.\u00d500000((Collection)this.Stringpublic().\u00d8\u00d5O000(), this.\u00d8\u00f6\u00d2000.\u00d200000());
    }

    @Override
    public b.t.u \u00d5\u00d5O000() {
        return u.\u00d500000.o00000();
    }

    @Override
    public b privatedo() {
        return (b)this.forpublicsuper.\u00d200000();
    }

    public boolean equals(Object object) {
        return object instanceof g$_e && b.o.d.fc.o00000((Object)this.Stringpublic(), (Object)((g$_e)object).Stringpublic());
    }

    public int hashCode() {
        return this.Stringpublic().hashCode();
    }

    public String toString() {
        return "setter of " + this.Stringpublic();
    }

    private static final kb o00000(g$_e g$_e) {
        fb fb2 = g$_e.Stringpublic().O\u00f8O000().\u00d400000();
        if (fb2 != null) {
            fb fb3 = fb2;
            return new cc(g$_e, fb3, g$_e.Stringpublic().\u00f8\u00d6O000().size(), p$_b.\u00d300000, (cd)g$_e.Stringpublic().\u00f8\u00f6O000().\u00d200000());
        }
        return new g$_e$_c(g$_e.Stringpublic());
    }

    private static final b \u00d300000(g$_e g$_e) {
        return fc.super(g$_e, false);
    }

    static /* synthetic */ kb \u00d400000(g$_e g$_e) {
        return g$_e.o00000(g$_e);
    }

    static /* synthetic */ b new(g$_e g$_e) {
        return g$_e.\u00d300000(g$_e);
    }
}

