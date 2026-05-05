/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.d.fc;
import b.o.d.x;
import b.o.d.zc;
import b.qd;
import b.r;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.l.c.b$_f;
import b.t.c.b.b.l.c.b.d$_b;
import b.t.c.b.b.l.c.b.e;
import b.t.c.b.b.n.c.m;
import b.t.c.b.b.q.pb;
import b.t.c.b.c.c;
import b.t.c.b.d.b;
import b.t.c.b.dd;
import b.t.c.b.gb;
import b.t.c.b.h;
import b.t.c.b.hd;
import b.t.c.b.ib;
import b.t.c.b.lc;
import b.t.c.b.mb$_b;
import b.t.c.b.mb$_c;
import b.t.c.b.mb$_d;
import b.t.c.b.mb$_e;
import b.t.c.b.oc;
import b.t.c.b.s;
import b.t.c.b.v;
import b.t.c.b.v$_b;
import b.t.c.b.w$_b$0;
import b.t.c.b.w$_b$1;
import b.t.c.b.w$_b$2;
import b.t.c.b.w$_d;
import b.t.c.b.w$_f;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class w
extends gb
implements s {
    public static final w$_f \u00f8O\u00d3000;
    static final /* synthetic */ b.t.m[] \u00d4O\u00d3000;
    private final h forinterfacesuper;
    private final String \u00d5O\u00d3000;
    private final String \u00f5O\u00d3000;
    private final Object privateinterfacesuper;
    private final dc \u00d8O\u00d3000;
    private final v$_b \u00f4O\u00d3000;
    private static final Object Oo\u00d3000;

    private w(h object, String string, String string2, pb pb2, Object object2, oc oc2) {
        super(oc2);
        this.forinterfacesuper = object;
        this.\u00d5O\u00d3000 = string;
        this.\u00f5O\u00d3000 = string2;
        this.privateinterfacesuper = object2;
        object = this;
        this.\u00d8O\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new w$_b$0((w)object));
        object = this;
        this.\u00f4O\u00d3000 = v.super(pb2, new w$_b$1((w)object));
    }

    @Override
    public h o\u00d8O000() {
        return this.forinterfacesuper;
    }

    @Override
    public String \u00f5\u00d5O000() {
        return this.\u00d5O\u00d3000;
    }

    @Override
    public String \u00f5\u00f6O000() {
        return this.\u00f5O\u00d3000;
    }

    @Override
    public Object O\u00d8O000() {
        return this.privateinterfacesuper;
    }

    public w(h h2, String string, String string2, Object object) {
        this(h2, string, string2, null, object, oc.\u00f600000.o00000());
    }

    public w(h h2, pb pb2, oc oc2) {
        this(h2, pb2.\u00d5\u00f80000().\u00d400000(), ib.super.super(pb2).super(), pb2, x.\u00d40\u00d2000, oc2);
    }

    @Override
    public Field \u00f4\u00f6O000() {
        return (Field)this.\u00d8O\u00d3000.\u00d200000();
    }

    protected final Member \u00d8\u00f8O000() {
        if (!this.\u00f4\u00f8O000().\u00d8\u00f8o000()) {
            return null;
        }
        Object object = ib.super.super(this.\u00f4\u00f8O000());
        if (object instanceof mb$_d && ((mb$_d)object).\u00d600000().O\u00d60000()) {
            b$_f b$_f = ((mb$_d)object).\u00d600000().interfaceString();
            if (!b$_f.\u00d2\u00d30000() || !b$_f.\u00d6\u00d20000()) {
                return null;
            }
            String string = ((mb$_d)object).int().new(b$_f.\u00f8\u00d20000());
            object = ((mb$_d)object).int().new(b$_f.classnew());
            return this.o\u00d8O000().\u00d400000(string, (String)object);
        }
        return this.\u00f4\u00f6O000();
    }

    public abstract w$_d \u00f8\u00f8O000();

    public pb \u00f4\u00f8O000() {
        return (pb)this.\u00f4O\u00d3000.\u00f800000(this, \u00d4O\u00d3000[0]);
    }

    @Override
    public b privatedo() {
        return this.\u00f8\u00f8O000().privatedo();
    }

    @Override
    public b \u00d3\u00d8O000() {
        return this.\u00f8\u00f8O000().\u00d3\u00d8O000();
    }

    @Override
    protected c thispublic() {
        w$_b$2 w$_b$2;
        rc rc2 = this.\u00f4\u00f8O000().\u00d3\u00f4o000();
        if (lc.o00000(this)) {
            w$_b$2 = null;
        } else {
            w w2 = this;
            w$_b$2 = new w$_b$2(w2);
        }
        return new c(rc2, w$_b$2);
    }

    @Override
    public boolean \u00d8\u00d6O000() {
        return this.\u00f4\u00f8O000().\u00d8\u00f4o000();
    }

    @Override
    public boolean \u00f5\u00d6O000() {
        return this.\u00f4\u00f8O000().\u00f5\u00f4o000();
    }

    @Override
    public boolean \u00f4\u00d5O000() {
        return false;
    }

    public boolean equals(Object object) {
        s s2 = hd.\u00d300000(object);
        if (s2 == null) {
            return false;
        }
        object = s2;
        return fc.o00000((Object)this.o\u00d8O000(), (Object)object.o\u00d8O000()) && fc.o00000((Object)this.\u00f5\u00d5O000(), (Object)object.\u00f5\u00d5O000()) && fc.o00000((Object)this.\u00f5\u00f6O000(), (Object)object.\u00f5\u00f6O000()) && fc.o00000(this.O\u00d8O000(), object.O\u00d8O000());
    }

    public int hashCode() {
        return (this.o\u00d8O000().hashCode() * 31 + this.\u00f5\u00d5O000().hashCode()) * 31 + this.\u00f5\u00f6O000().hashCode();
    }

    public String toString() {
        return dd.o00000.super(this);
    }

    @Override
    public GenericDeclaration \u00d5\u00f50000() {
        return this.Stringinterface();
    }

    private static final Field o00000(w object) {
        Object object2 = ib.super.super(((w)object).\u00f4\u00f8O000());
        if (object2 instanceof mb$_d) {
            pb pb2 = ((mb$_d)object2).\u00d800000();
            d$_b d$_b = e.super(e.\u00d200000, ((mb$_d)object2).\u00d400000(), ((mb$_d)object2).int(), ((mb$_d)object2).\u00f400000(), false, 8, null);
            if (d$_b != null) {
                d$_b d$_b2 = d$_b;
                object = m.o00000(pb2) || e.super(((mb$_d)object2).\u00d400000()) ? ((w)object).o\u00d8O000().iffor().getEnclosingClass() : ((object2 = pb2.\u00d8\u00f80000()) instanceof b.t.c.b.b.q.ib ? hd.super((b.t.c.b.b.q.ib)object2) : ((w)object).o\u00d8O000().iffor());
                try {
                    Object object3 = object;
                    object = object3 != null ? ((Class)object3).getDeclaredField(d$_b2.\u00d600000()) : null;
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    object = null;
                }
                return object;
            }
            return null;
        }
        if (object2 instanceof mb$_b) {
            return ((mb$_b)object2).OO0000();
        }
        if (object2 instanceof mb$_c) {
            return null;
        }
        if (object2 instanceof mb$_e) {
            return null;
        }
        throw new qd();
    }

    private static final pb return(w w2) {
        return w2.o\u00d8O000().o00000(w2.\u00f5\u00d5O000(), w2.\u00f5\u00f6O000());
    }

    private static final Type \u00d500000(w w2) {
        return w2.privatedo().\u00d400000();
    }

    public static final /* synthetic */ Object \u00f5\u00f8O000() {
        return Oo\u00d3000;
    }

    static {
        b.t.m[] mArray = new b.t.m[1];
        b.t.m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(w.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);
        \u00d4O\u00d3000 = mArray2;
        \u00f8O\u00d3000 = new w$_f(null);
        Oo\u00d3000 = new Object();
    }

    static /* synthetic */ Field \u00d300000(w w2) {
        return w.o00000(w2);
    }

    static /* synthetic */ pb \u00d400000(w w2) {
        return w.return(w2);
    }

    static /* synthetic */ Type new(w w2) {
        return w.\u00d500000(w2);
    }

    public GenericDeclaration Stringinterface() {
        return zc.o00000(this.o\u00d8O000(), this.\u00f5\u00f6O000());
    }
}

