/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.d.fc;
import b.o.d.ib;
import b.o.e.h;
import b.t.c.b.b.o.d;
import b.t.c.b.b.q.b.r;
import b.t.c.b.b.q.cb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.c.c;
import b.t.c.b.d.b;
import b.t.c.b.gb;
import b.t.c.b.id;
import b.t.c.b.oc;
import b.t.c.b.v;
import b.t.c.b.v$_b;
import b.t.c.b.w$_c;
import b.t.c.b.w$_d$_b$0;
import b.t.c.b.w$_d$_b$1;
import b.t.m;
import b.t.m$_d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class w$_d
extends w$_c
implements m$_d {
    static final /* synthetic */ m[] \u00d8\u00f8\u00d2000;
    private final v$_b \u00f4\u00f8\u00d2000;
    private final dc returnprivatesuper;

    public w$_d() {
        w$_d w$_d = this;
        this.\u00f4\u00f8\u00d2000 = v.super(new w$_d$_b$0(w$_d));
        w$_d = this;
        this.returnprivatesuper = b.r.o00000(lb.\u00d400000, (h)new w$_d$_b$1(w$_d));
    }

    @Override
    public String \u00f5\u00d5O000() {
        return "<get-" + this.o\u00f5O000().\u00f5\u00d5O000() + '>';
    }

    @Override
    public final gb o00000(oc oc2) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property".toString());
    }

    public cb O\u00f6O000() {
        return (cb)this.\u00f4\u00f8\u00d2000.\u00f800000(this, \u00d8\u00f8\u00d2000[0]);
    }

    @Override
    public b privatedo() {
        return (b)this.returnprivatesuper.\u00d200000();
    }

    @Override
    protected c thispublic() {
        return (c)this.o\u00f5O000().\u00d5\u00d5O000();
    }

    public String toString() {
        return "getter of " + this.o\u00f5O000();
    }

    public boolean equals(Object object) {
        return object instanceof w$_d && fc.o00000((Object)this.o\u00f5O000(), (Object)((w$_d)object).o\u00f5O000());
    }

    public int hashCode() {
        return this.o\u00f5O000().hashCode();
    }

    private static final cb \u00d400000(w$_d w$_d) {
        cb cb2 = w$_d.o\u00f5O000().\u00f4\u00f8O000().o0\u00d2000();
        if (cb2 == null) {
            r r2 = d.o00000(w$_d.o\u00f5O000().\u00f4\u00f8O000(), o.\u00d8o\u00f6000.o00000());
            r2.oO0000(w$_d.o\u00f5O000().\u00f4\u00f8O000().forclasssuper());
            cb2 = r2;
        }
        return cb2;
    }

    private static final b new(w$_d w$_d) {
        return id.\u00d200000(w$_d, true);
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new ib(w$_d.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0);
        \u00d8\u00f8\u00d2000 = mArray2;
    }

    static /* synthetic */ cb \u00d300000(w$_d w$_d) {
        return w$_d.\u00d400000(w$_d);
    }

    static /* synthetic */ b o00000(w$_d w$_d) {
        return w$_d.new(w$_d);
    }
}

