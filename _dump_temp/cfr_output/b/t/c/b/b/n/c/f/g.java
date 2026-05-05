/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.s.mc;
import b.s.y;
import b.t.c.b.b.d.k;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.i.f;
import b.t.c.b.b.n.c.b.db;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.n.c.b.u;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.n.c.f.g$_b$0;
import b.t.m;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class g
implements b.t.c.b.b.n.c.e.g {
    static final /* synthetic */ m[] \u00d2O0000;
    private final k OO0000;
    private final b.t.c.b.b.q.g do;
    private final f \u00d3O0000;
    private final db \u00f600000;
    private final boolean \u00f800000;

    /*
     * Unable to fully structure code
     */
    public g(i var1_1, q var2_2, k var3_3) {
        super();
        this.OO0000 = var3_3;
        v0 = this;
        v1 = var2_2;
        if (v1 == null) ** GOTO lbl-1000
        var3_3 = v1;
        var4_4 = v0;
        v2 = var1_1.\u00d500000().\u00f400000().o00000((u)var3_3);
        v0 = var4_4;
        v1 = v2;
        if (v2 != null) {
            v3 = (b.t.c.b.b.q.g)v1;
        } else lbl-1000:
        // 2 sources

        {
            v3 = b.t.c.b.b.q.g.o00000;
        }
        v0.do = v3;
        v4 = var1_1.return();
        v5 = var1_1;
        var1_1 = this;
        var3_3 = v5;
        this.\u00d3O0000 = v4.o00000(new g$_b$0((i)var3_3, (g)var1_1));
        v6 = var2_2;
        this.\u00f600000 = v6 != null && (v6 = v6.o\u00d40000()) != null ? (db)mc.nullObject((Iterable)v6) : null;
        v7 = var2_2;
        this.\u00f800000 = v7 != null ? v7.O\u00d40000() : false;
    }

    @Override
    public k \u00d300000() {
        return this.OO0000;
    }

    @Override
    public b.t.c.b.b.q.g \u00d200000() {
        return this.do;
    }

    public ib \u00d800000() {
        return (ib)b.t.c.b.b.i.k.o00000(this.\u00d3O0000, (Object)this, \u00d2O0000[0]);
    }

    protected final db \u00f400000() {
        return this.\u00f600000;
    }

    @Override
    public Map super() {
        return y.Object();
    }

    @Override
    public boolean \u00d600000() {
        return this.\u00f800000;
    }

    private static final ib \u00d200000(i i2, g g2) {
        return i2.\u00d300000().returnforsuper().o00000(g2.\u00d300000()).nullint();
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(g.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        \u00d2O0000 = mArray2;
    }

    static /* synthetic */ ib super(i i2, g g2) {
        return g.\u00d200000(i2, g2);
    }
}

