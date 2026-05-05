/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.r;
import b.t.c.b.b.c.b;
import b.t.c.b.b.c.c.c;
import b.t.c.b.b.c.c.g;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.l;
import b.t.c.b.b.c.u;
import b.t.c.b.cd;
import b.t.c.b.gd;
import b.t.c.b.h;
import b.t.c.b.m$_b$0;
import b.t.c.b.m$_b$1;
import b.t.c.b.m$_b$2;
import b.t.c.b.p;
import b.t.c.b.qc;
import b.t.j;
import java.lang.reflect.Type;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
extends qc {
    private final u \u00f4\u00d6\u00d3000;
    private final dc \u00f5\u00d6\u00d3000;
    private final dc \u00d8\u00d6\u00d3000;

    public m(h h2, String object, Object object2, u u2) {
        super(h2, (String)object, object2);
        this.\u00f4\u00d6\u00d3000 = u2;
        object = this;
        object2 = h2;
        this.\u00f5\u00d6\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new m$_b$0((h)object2, (m)object));
        object = h2;
        object2 = this;
        this.\u00d8\u00d6\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new m$_b$1((m)object2, (h)object));
    }

    @Override
    protected final List \u00d5oo000() {
        return this.\u00f4\u00d6\u00d3000.\u00f600000();
    }

    @Override
    protected final db whilethissuper() {
        return this.\u00f4\u00d6\u00d3000.void();
    }

    @Override
    protected final List \u00d4oo000() {
        return this.\u00f4\u00d6\u00d3000.Object();
    }

    @Override
    protected final cd Ooo000() {
        return (cd)this.\u00f5\u00d6\u00d3000.\u00d200000();
    }

    @Override
    protected final g \u00d3oo000() {
        g g2 = c.super(this.\u00f4\u00d6\u00d3000);
        if (g2 == null) {
            throw new b.t.c.b.lb("No signature for function: ".concat(String.valueOf(this)));
        }
        return g2;
    }

    @Override
    public final String \u00f5\u00d5O000() {
        return this.\u00f4\u00d6\u00d3000.\u00f500000();
    }

    @Override
    public final b.t.u \u00d5\u00d5O000() {
        return (b.t.u)this.\u00d8\u00d6\u00d3000.\u00d200000();
    }

    @Override
    public final j \u00f8\u00d5O000() {
        return p.super(b.\u00d400000(this.\u00f4\u00d6\u00d3000));
    }

    @Override
    public final l \u00d4\u00d8O000() {
        return b.Object(this.\u00f4\u00d6\u00d3000);
    }

    @Override
    public final boolean \u00f4\u00d5O000() {
        return b.\u00d500000(this.\u00f4\u00d6\u00d3000);
    }

    @Override
    public final boolean \u00d8\u00d8O000() {
        return b.\u00d200000(this.\u00f4\u00d6\u00d3000);
    }

    @Override
    public final boolean \u00f4\u00d8O000() {
        return b.o00000(this.\u00f4\u00d6\u00d3000);
    }

    @Override
    public final boolean \u00d5\u00d8O000() {
        return b.\u00d600000(this.\u00f4\u00d6\u00d3000);
    }

    @Override
    public final boolean returnwhile() {
        return b.void(this.\u00f4\u00d6\u00d3000);
    }

    @Override
    public final boolean whilewhile() {
        return false;
    }

    private static final cd o00000(h h2, m m2) {
        b.t.c.b.r r2 = h2 instanceof b.t.c.b.r ? (b.t.c.b.r)h2 : null;
        cd cd2 = r2 != null ? r2.\u00d4\u00d2o000() : null;
        return cd.\u00d500000.o00000(m2.\u00f4\u00d6\u00d3000.\u00d600000(), cd2, m2, h2.iffor().getClassLoader());
    }

    private static final Type new(m m2) {
        Type type = gd.o00000(m2);
        if (type == null) {
            type = m2.privatedo().\u00d400000();
        }
        return type;
    }

    private static final b.t.u new(m m2, h h2) {
        return p.super(m2.\u00f4\u00d6\u00d3000.o00000(), h2.iffor().getClassLoader(), m2.Ooo000(), (b.o.e.h)new m$_b$2(m2));
    }

    static /* synthetic */ cd new(h h2, m m2) {
        return m.o00000(h2, m2);
    }

    static /* synthetic */ b.t.u o00000(m m2, h h2) {
        return m.new(m2, h2);
    }

    static /* synthetic */ Type o00000(m m2) {
        return m.new(m2);
    }
}

