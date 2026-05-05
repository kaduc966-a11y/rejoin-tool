/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.o.e.h;
import b.t.c.b.b.d.f;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.n;
import b.t.c.b.c.c;
import b.t.c.b.c.j;
import b.t.c.b.gb;
import b.t.c.b.gc;
import b.t.c.b.hd;
import b.t.c.b.kb;
import b.t.c.b.lb;
import b.t.c.b.ub$_b$0;
import b.t.c.b.ub$_b$1;
import b.t.c.b.v;
import b.t.c.b.v$_b;
import b.t.m;
import b.t.p$_b;
import b.t.u;
import b.t.w;
import b.xc;
import java.lang.reflect.Type;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ub
extends kb {
    static final /* synthetic */ m[] \u00d4\u00d5o000;
    private final gb O\u00d5o000;
    private final int nullObjectsuper;
    private final p$_b \u00d3\u00d5o000;
    private final v$_b \u00d5\u00d5o000;
    private final v$_b o\u00d5o000;

    public ub(gb w2, int n2, p$_b p$_b, h h2) {
        this.O\u00d5o000 = w2;
        this.nullObjectsuper = n2;
        this.\u00d3\u00d5o000 = p$_b;
        this.\u00d5\u00d5o000 = v.super(h2);
        w2 = this;
        this.o\u00d5o000 = v.super(new ub$_b$0((ub)w2));
    }

    public final gb forvoid() {
        return this.O\u00d5o000;
    }

    @Override
    public final int o\u00f60000() {
        return this.nullObjectsuper;
    }

    @Override
    public final p$_b \u00f5\u00f50000() {
        return this.\u00d3\u00d5o000;
    }

    private final n \u00d5\u00f60000() {
        return (n)this.\u00d5\u00d5o000.\u00f800000(this, \u00d4\u00d5o000[0]);
    }

    @Override
    public final List \u00d8\u00f50000() {
        return (List)this.o\u00d5o000.\u00f800000(this, \u00d4\u00d5o000[1]);
    }

    @Override
    public final String O\u00f60000() {
        Object object = this.\u00d5\u00f60000();
        jc jc2 = object instanceof jc ? (jc)object : null;
        if (jc2 == null) {
            return null;
        }
        object = jc2;
        if (jc2.OO\u00d2000().o\u00f4o000()) {
            return null;
        }
        if (((f)(object = object.\u00d5\u00f80000())).super()) {
            return null;
        }
        return ((f)object).\u00d400000();
    }

    @Override
    public final u \u00f8\u00f50000() {
        w w2 = this;
        w2 = new c(this.\u00d5\u00f60000().forclasssuper(), new ub$_b$1((ub)w2));
        u u2 = j.o00000(this.forvoid().\u00d8\u00f4O000().super(), (u)w2, null, 2, null).o00000();
        if (u2 == null) {
            gc.o00000((Object)this.forvoid());
            throw new xc();
        }
        return u2;
    }

    @Override
    public final boolean Stringvoid() {
        n n2 = this.\u00d5\u00f60000();
        jc jc2 = n2 instanceof jc ? (jc)n2 : null;
        if (jc2 != null) {
            return b.o00000(jc2);
        }
        return false;
    }

    @Override
    public final boolean \u00f4\u00f50000() {
        n n2 = this.\u00d5\u00f60000();
        return n2 instanceof jc && ((jc)n2).\u00d5O\u00d2000() != null;
    }

    @Override
    public final boolean nullvoid() {
        n n2 = this.\u00d5\u00f60000();
        jc jc2 = n2 instanceof jc ? (jc)n2 : null;
        if (jc2 != null) {
            return jc2.\u00f80\u00d2000();
        }
        return false;
    }

    private static final List new(ub ub2) {
        return hd.super(ub2.\u00d5\u00f60000());
    }

    private static final Type o00000(ub ub2) {
        n n2 = ub2.\u00d5\u00f60000();
        if (n2 instanceof mc && fc.o00000((Object)hd.super(ub2.forvoid()), (Object)n2) && (ub2.forvoid().\u00d8\u00f4O000().\u00d800000() || ub2.forvoid().\u00f4\u00f4O000().O\u00f5o000() == hc$_b.o00000)) {
            mc mc2 = ub2.forvoid().\u00d8\u00f4O000().\u00d400000();
            Class clazz = hd.super((ib)(mc2 != null ? (b.t.c.b.b.q.b)mc2 : (b.t.c.b.b.q.b)ub2.forvoid().\u00f4\u00f4O000()).\u00d8\u00f80000());
            if (clazz == null) {
                throw new lb("Cannot determine receiver Java type of inherited declaration: ".concat(String.valueOf(n2)));
            }
            return clazz;
        }
        return (Type)ub2.forvoid().privatedo().\u00d200000().get(ub2.o\u00f60000());
    }

    static {
        m[] mArray = new m[2];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(ub.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        mArray2[1] = new b.o.d.ib(ub.class, "annotations", "getAnnotations()Ljava/util/List;", 0);
        \u00d4\u00d5o000 = mArray2;
    }

    static /* synthetic */ List \u00d400000(ub ub2) {
        return ub.new(ub2);
    }

    static /* synthetic */ Type \u00d300000(ub ub2) {
        return ub.o00000(ub2);
    }
}

