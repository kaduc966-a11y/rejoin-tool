/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.d.fc;
import b.o.d.ib;
import b.o.e.h;
import b.r;
import b.t.c.b.b.o.d;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.e;
import b.t.c.b.b.q.e.o;
import b.t.c.b.c.c;
import b.t.c.b.gb;
import b.t.c.b.id;
import b.t.c.b.oc;
import b.t.c.b.v;
import b.t.c.b.v$_b;
import b.t.c.b.w$_c;
import b.t.c.b.w$_e$_b$0;
import b.t.c.b.w$_e$_b$1;
import b.t.c.b.w$_e$_b$2;
import b.t.g$_b;
import b.t.m;
import java.lang.reflect.Type;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class w$_e
extends w$_c
implements g$_b {
    static final /* synthetic */ m[] privatepublicsuper;
    private final v$_b \u00f8\u00f6\u00d2000;
    private final dc \u00f5\u00f6\u00d2000;

    public w$_e() {
        w$_e w$_e = this;
        this.\u00f8\u00f6\u00d2000 = v.super(new w$_e$_b$0(w$_e));
        w$_e = this;
        this.\u00f5\u00f6\u00d2000 = r.o00000(lb.\u00d400000, (h)new w$_e$_b$1(w$_e));
    }

    @Override
    public String \u00f5\u00d5O000() {
        return "<set-" + this.o\u00f5O000().\u00f5\u00d5O000() + '>';
    }

    @Override
    public final gb o00000(oc oc2) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property".toString());
    }

    public e \u00d3\u00f5O000() {
        return (e)this.\u00f8\u00f6\u00d2000.\u00f800000(this, privatepublicsuper[0]);
    }

    @Override
    public b.t.c.b.d.b privatedo() {
        return (b.t.c.b.d.b)this.\u00f5\u00f6\u00d2000.\u00d200000();
    }

    @Override
    protected c thispublic() {
        return new c(b.null(this.\u00d3\u00f5O000()).returnsuper(), w$_e$_b$2.\u00d3\u00d5\u00f4000);
    }

    public String toString() {
        return "setter of " + this.o\u00f5O000();
    }

    public boolean equals(Object object) {
        return object instanceof w$_e && fc.o00000((Object)this.o\u00f5O000(), (Object)((w$_e)object).o\u00f5O000());
    }

    public int hashCode() {
        return this.o\u00f5O000().hashCode();
    }

    private static final e \u00d300000(w$_e w$_e) {
        e e2 = w$_e.o\u00f5O000().\u00f4\u00f8O000().\u00f5\u00f8o000();
        if (e2 == null) {
            e2 = d.o00000(w$_e.o\u00f5O000().\u00f4\u00f8O000(), o.\u00d8o\u00f6000.o00000(), o.\u00d8o\u00f6000.o00000());
        }
        return e2;
    }

    private static final b.t.c.b.d.b \u00d400000(w$_e w$_e) {
        return id.\u00d200000(w$_e, false);
    }

    private static final Type \u00d4\u00f5O000() {
        return Void.TYPE;
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new ib(w$_e.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0);
        privatepublicsuper = mArray2;
    }

    static /* synthetic */ e new(w$_e w$_e) {
        return w$_e.\u00d300000(w$_e);
    }

    static /* synthetic */ b.t.c.b.d.b o00000(w$_e w$_e) {
        return w$_e.\u00d400000(w$_e);
    }

    static /* synthetic */ Type \u00d5\u00f5O000() {
        return w$_e.\u00d4\u00f5O000();
    }
}

