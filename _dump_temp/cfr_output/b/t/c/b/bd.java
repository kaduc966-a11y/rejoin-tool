/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.d.fc;
import b.o.d.g;
import b.o.d.w;
import b.o.d.x;
import b.o.d.zc;
import b.qd;
import b.r;
import b.s.mc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.h.c;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.vb;
import b.t.c.b.bd$_b$0;
import b.t.c.b.bd$_b$1;
import b.t.c.b.bd$_b$2;
import b.t.c.b.bd$_b$3;
import b.t.c.b.d.b;
import b.t.c.b.d.d;
import b.t.c.b.d.e;
import b.t.c.b.d.h;
import b.t.c.b.d.h$_b;
import b.t.c.b.d.h$_c;
import b.t.c.b.d.h$_f;
import b.t.c.b.d.h$_g;
import b.t.c.b.d.h$_h;
import b.t.c.b.d.h$_h$_b;
import b.t.c.b.d.h$_h$_c;
import b.t.c.b.d.h$_h$_d;
import b.t.c.b.d.h$_h$_e;
import b.t.c.b.d.h$_h$_f;
import b.t.c.b.d.h$_h$_g;
import b.t.c.b.d.k;
import b.t.c.b.d.k$_b;
import b.t.c.b.d.k$_c;
import b.t.c.b.dd;
import b.t.c.b.f;
import b.t.c.b.gb;
import b.t.c.b.gd;
import b.t.c.b.hc;
import b.t.c.b.hd;
import b.t.c.b.kb;
import b.t.c.b.md;
import b.t.c.b.o;
import b.t.c.b.oc;
import b.t.c.b.v;
import b.t.c.b.v$_b;
import b.t.c.b.vc;
import b.t.c.b.yb$_b;
import b.t.c.b.yb$_c;
import b.t.c.b.yb$_d;
import b.t.c.b.yb$_e;
import b.t.c.b.yb$_f;
import b.t.db;
import b.t.m;
import b.t.p;
import b.t.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bd
extends gb
implements g,
hc,
vc {
    static final /* synthetic */ m[] \u00f5\u00d5\u00d3000;
    private final b.t.c.b.h \u00d8\u00d5\u00d3000;
    private final String thisObjectnew;
    private final Object \u00d5\u00d5\u00d3000;
    private final v$_b StringObjectnew;
    private final dc \u00f4\u00d5\u00d3000;
    private final dc \u00f8\u00d5\u00d3000;

    private bd(b.t.c.b.h object, String object2, String string, ic ic2, Object object3, oc oc2) {
        super(oc2);
        this.\u00d8\u00d5\u00d3000 = object;
        this.thisObjectnew = string;
        this.\u00d5\u00d5\u00d3000 = object3;
        object = object2;
        object2 = this;
        this.StringObjectnew = v.super(ic2, new bd$_b$0((bd)object2, (String)object));
        object = this;
        this.\u00f4\u00d5\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new bd$_b$1((bd)object));
        object = this;
        this.\u00f8\u00d5\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new bd$_b$2((bd)object));
    }

    @Override
    public final b.t.c.b.h o\u00d8O000() {
        return this.\u00d8\u00d5\u00d3000;
    }

    @Override
    public final String \u00d3\u00f4O000() {
        return this.thisObjectnew;
    }

    @Override
    public final Object O\u00d8O000() {
        return this.\u00d5\u00d5\u00d3000;
    }

    public bd(b.t.c.b.h h2, String string, String string2, Object object) {
        this(h2, string, string2, null, object, oc.\u00f600000.o00000());
    }

    public bd(b.t.c.b.h h2, ic ic2, oc oc2) {
        this(h2, ic2.\u00d5\u00f80000().\u00d400000(), b.t.c.b.ib.super.super(ic2).super(), ic2, x.\u00d40\u00d2000, oc2);
    }

    public /* synthetic */ bd(b.t.c.b.h h2, ic ic2, oc oc2, int n2, w w2) {
        if ((n2 & 4) != 0) {
            oc2 = oc.\u00f600000.o00000();
        }
        this(h2, ic2, oc2);
    }

    public final ic \u00f8Oo000() {
        return (ic)this.StringObjectnew.\u00f800000(this, \u00f5\u00d5\u00d3000[0]);
    }

    @Override
    public final String \u00f5\u00d5O000() {
        return this.\u00f8Oo000().\u00d5\u00f80000().\u00d400000();
    }

    @Override
    public final b privatedo() {
        return (b)this.\u00f4\u00d5\u00d3000.\u00d200000();
    }

    @Override
    public final b \u00d3\u00d8O000() {
        return (b)this.\u00f8\u00d5\u00d3000.\u00d200000();
    }

    @Override
    public final Collection o\u00f4O000() {
        Iterable iterable = this.\u00f8Oo000().\u00d5\u00f4o000();
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Class clazz;
            Object object2 = object.next();
            object2 = (ic)object2;
            Iterable iterable2 = iterable;
            if (hd.super((ib)object2.\u00d8\u00f80000()) == null) {
                throw new b.t.c.b.lb("Unknown container class for overridden function: ".concat(String.valueOf(this)));
            }
            iterable2.add(new bd((b.t.c.b.r)b.o.r.o00000(clazz), (ic)object2, null, 4, null));
        }
        return (List)iterable;
    }

    public final bd if(oc oc2) {
        return new bd(this.o\u00d8O000(), this.\u00f8Oo000(), oc2);
    }

    private final vc o00000(vc object) {
        boolean bl;
        p p2;
        Object object2 = b.t.b.f.\u00d600000((db)object);
        if (!(object2 instanceof Collection) || !((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                p2 = (p)object2.next();
                kb kb2 = p2 instanceof kb ? (kb)p2 : null;
                boolean bl2 = kb2 != null ? kb2.nullvoid() : false;
                if (!bl2) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        if (bl) {
            object2 = object.o\u00d8O000();
            z z2 = object2 instanceof z ? (z)object2 : null;
            boolean bl3 = z2 != null ? z2.\u00d3\u00d4O000() : false;
            if (bl3 && Modifier.isStatic(this.privatedo().Object().getModifiers())) {
                Object v8;
                block9: {
                    for (Object t2 : (Iterable)object.o\u00f4O000()) {
                        boolean bl4;
                        object = b.t.b.f.\u00d600000((vc)t2);
                        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                            object = object.iterator();
                            while (object.hasNext()) {
                                p2 = (p)object.next();
                                kb kb3 = p2 instanceof kb ? (kb)p2 : null;
                                boolean bl5 = kb3 != null ? kb3.nullvoid() : false;
                                if (!bl5) continue;
                                bl4 = true;
                                break;
                            }
                        } else {
                            bl4 = false;
                        }
                        if (!bl4) continue;
                        v8 = t2;
                        break block9;
                    }
                    v8 = null;
                }
                return v8;
            }
        }
        return null;
    }

    private final boolean o00000(Method method) {
        i i2 = this.\u00f8Oo000().Stringclasssuper();
        boolean bl = i2 != null && (i2 = i2.forclasssuper()) != null ? b.t.c.b.b.o.b.o00000((rc)i2) : false;
        if (bl) {
            Class clazz = (Class)b.s.z.\u00d6o0000(method.getParameterTypes());
            boolean bl2 = clazz != null ? clazz.isInterface() : false;
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    private final b o00000(Method method, boolean bl) {
        if (md.\u00d300000(this)) {
            return new h$_h$_b(method, bl, this.o00000(method) ? this.O\u00d8O000() : md.\u00d400000(this));
        }
        return new h$_h$_f(method);
    }

    private final h$_h \u00d300000(Method method) {
        if (md.\u00d300000(this)) {
            return new h$_h$_g(method);
        }
        return new h$_h$_d(method);
    }

    private final h$_h new(Method method) {
        if (md.\u00d300000(this)) {
            return new h$_h$_e(method, md.\u00d400000(this));
        }
        return new h$_h$_c(method);
    }

    private final h o00000(Constructor constructor, ic ic2, boolean bl) {
        if (!bl && c.o00000(ic2)) {
            if (md.\u00d300000(this)) {
                return new h$_b(constructor, md.\u00d400000(this));
            }
            return new h$_f(constructor);
        }
        if (md.\u00d300000(this)) {
            return new h$_c(constructor, md.\u00d400000(this));
        }
        return new h$_g(constructor);
    }

    @Override
    protected final b.t.c.b.c.c thispublic() {
        bd bd2 = this;
        return new b.t.c.b.c.c(this.\u00f8Oo000().\u00d3\u00f4o000(), new bd$_b$3(bd2));
    }

    @Override
    public final int \u00f5\u00d8O000() {
        return e.o00000(this.privatedo());
    }

    @Override
    public final boolean \u00d8\u00d8O000() {
        return this.\u00d8\u00f4O000().class() || this.\u00f8Oo000().\u00f8\u00f5o000();
    }

    @Override
    public final boolean \u00f4\u00d8O000() {
        return this.\u00d8\u00f4O000().\u00d200000() || this.\u00f8Oo000().\u00f50O000();
    }

    @Override
    public final boolean \u00d5\u00d8O000() {
        return this.\u00d8\u00f4O000().\u00d300000() || this.\u00f8Oo000().\u00d3\u00f5o000();
    }

    @Override
    public final boolean returnwhile() {
        return this.\u00d8\u00f4O000().\u00d600000() || this.\u00f8Oo000().\u00f4\u00f5o000();
    }

    @Override
    public final boolean \u00f4\u00d5O000() {
        return this.\u00f8Oo000().\u00d5\u00f5o000();
    }

    @Override
    public final boolean whilewhile() {
        ic ic2 = this.\u00f8Oo000();
        vb vb2 = ic2 instanceof vb ? (vb)ic2 : null;
        if (vb2 != null) {
            return vb2.\u00f4\u00f6o000();
        }
        return false;
    }

    public final boolean equals(Object object) {
        vc vc2 = hd.\u00d200000(object);
        if (vc2 == null) {
            return false;
        }
        object = vc2;
        return fc.o00000((Object)this.o\u00d8O000(), (Object)object.o\u00d8O000()) && fc.o00000((Object)this.\u00f5\u00d5O000(), (Object)object.\u00f5\u00d5O000()) && fc.o00000((Object)this.\u00d3\u00f4O000(), (Object)object.\u00d3\u00f4O000()) && fc.o00000(this.O\u00d8O000(), object.O\u00d8O000());
    }

    public final int hashCode() {
        return (this.o\u00d8O000().hashCode() * 31 + this.\u00f5\u00d5O000().hashCode()) * 31 + this.\u00d3\u00f4O000().hashCode();
    }

    public final String toString() {
        return dd.o00000.super(this);
    }

    @Override
    public final GenericDeclaration \u00d5\u00f50000() {
        return this.\u00f5Oo000();
    }

    @Override
    public final Object newreturn() {
        return this.ifthissuper();
    }

    @Override
    public final Object \u00f800000(Object object) {
        return this.\u00d5O0000(object);
    }

    @Override
    public final Object o00000(Object object, Object object2) {
        return this.\u00d800000(object, object2);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3) {
        return this.\u00d400000(object, object2, object3);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4) {
        return this.new(object, object2, object3, object4);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5) {
        return this.new(object, object2, object3, object4, object5);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return this.new(object, object2, object3, object4, object5, object6);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.new(object, object2, object3, object4, object5, object6, object7);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21);
    }

    @Override
    public final Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21, Object object22) {
        return this.new(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21, object22);
    }

    private static final ic o00000(bd bd2, String string) {
        return bd2.o\u00d8O000().new(string, bd2.\u00d3\u00f4O000());
    }

    private static final b \u00d500000(bd object) {
        b b2;
        Member member;
        Object object2 = b.t.c.b.ib.super.super(((bd)object).\u00f8Oo000());
        if (object2 instanceof yb$_e) {
            if (md.new((o)object)) {
                Object object3;
                Object object4 = ((gb)object).\u00d8\u00d5O000();
                Class clazz = ((bd)object).o\u00d8O000().iffor();
                object = object4;
                object2 = new ArrayList(mc.o00000(object4, 10));
                object = object.iterator();
                while (object.hasNext()) {
                    object3 = object.next();
                    p p2 = (p)object3;
                    Iterator iterator = object2;
                    iterator.add((String)p2.O\u00f60000());
                }
                object = k$_b.super;
                object4 = k$_c.\u00d400000;
                object2 = (List)object2;
                object3 = clazz;
                return new k((Class)object3, (List)object2, (k$_c)((Object)object4), (k$_b)((Object)object), null, 16, null);
            }
            member = ((bd)object).o\u00d8O000().\u00d500000(((yb$_e)object2).\u00d400000());
        } else if (object2 instanceof yb$_f) {
            member = ((bd)object).o\u00d8O000().\u00d400000(((yb$_f)object2).class(), ((yb$_f)object2).\u00d600000());
        } else if (object2 instanceof yb$_b) {
            member = ((yb$_b)object2).\u00d800000();
        } else if (object2 instanceof yb$_d) {
            member = ((yb$_d)object2).\u00d300000();
        } else {
            if (object2 instanceof yb$_c) {
                Object object5;
                Object object6 = ((yb$_c)object2).\u00d200000();
                Class clazz = ((bd)object).o\u00d8O000().iffor();
                object = object6;
                Class clazz2 = clazz;
                object2 = object;
                object = new ArrayList(mc.o00000(object, 10));
                Object object7 = object2.iterator();
                while (object7.hasNext()) {
                    object5 = object7.next();
                    object2 = (Method)object5;
                    Object object8 = object;
                    object8.add(((Method)object2).getName());
                }
                object = object6;
                object6 = k$_b.\u00d400000;
                object2 = k$_c.\u00d400000;
                object7 = (List)object;
                object5 = clazz2;
                return new k((Class)object5, (List)object7, (k$_c)((Object)object2), (k$_b)((Object)object6), (List)object);
            }
            throw new qd();
        }
        Member member2 = member;
        object2 = member;
        if (member instanceof Constructor) {
            b2 = super.o00000((Constructor)member2, ((bd)object).\u00f8Oo000(), false);
        } else if (object2 instanceof Method) {
            b2 = !Modifier.isStatic(((Method)member2).getModifiers()) ? (b)super.new((Method)member2) : (((bd)object).\u00f8Oo000().\u00d4\u00f80000().\u00d400000(hd.super()) != null ? (b)super.\u00d300000((Method)member2) : super.o00000((Method)member2, false));
        } else {
            throw new b.t.c.b.lb("Could not compute caller for function: " + ((bd)object).\u00f8Oo000() + " (member = " + member2 + ')');
        }
        return d.o00000(b2, (o)object, false, mc.\u00d500000());
    }

    private static final b o00000(bd object) {
        Object object2;
        Object object3;
        Object object4 = new ArrayList();
        Object object5 = b.t.c.b.ib.super.super(((bd)object).\u00f8Oo000());
        if (object5 instanceof yb$_f) {
            bd bd2 = object;
            vc vc2 = bd2.o00000(bd2);
            if (vc2 != null) {
                object5 = vc2;
                object3 = b.q.f.\u00d200000(vc2.\u00d3\u00f4O000(), '(', null, 2, null);
                String string = object5.\u00d3\u00f4O000().substring(((String)object3).length());
                f f2 = gd.o00000((vc)object5, string);
                object4.addAll(f2.o00000());
                object2 = bd2.o\u00d8O000().o00000((String)object3, f2.\u00d200000(), true, bd2.\u00f8Oo000().nullclasssuper() != null);
            } else {
                f f3 = gd.o00000(bd2, ((yb$_f)object5).\u00d600000());
                object4.addAll(f3.o00000());
                object2 = bd2.o\u00d8O000().o00000(((yb$_f)object5).class(), f3.\u00d200000(), !Modifier.isStatic(bd2.privatedo().Object().getModifiers()), bd2.\u00f8Oo000().nullclasssuper() != null);
            }
        } else if (object5 instanceof yb$_e) {
            if (md.new((o)object)) {
                Object object6 = ((gb)object).\u00d8\u00d5O000();
                object4 = ((bd)object).o\u00d8O000().iffor();
                object = object6;
                object5 = new ArrayList(mc.o00000((Iterable)object6, 10));
                object6 = object.iterator();
                while (object6.hasNext()) {
                    Object e2 = object6.next();
                    p p2 = (p)e2;
                    Object object7 = object5;
                    object7.add(p2.O\u00f60000());
                }
                object = k$_b.super;
                object4 = k$_c.super;
                object5 = (List)object5;
                object6 = object4;
                return new k((Class)object6, (List)object5, (k$_c)((Object)object4), (k$_b)((Object)object), null, 16, null);
            }
            object3 = gd.o00000((vc)object, ((yb$_e)object5).\u00d400000());
            object4.addAll(((f)object3).o00000());
            object2 = ((bd)object).o\u00d8O000().\u00d800000(((f)object3).\u00d200000());
        } else {
            if (object5 instanceof yb$_c) {
                List list = ((yb$_c)object5).\u00d200000();
                Object object8 = list;
                object4 = ((bd)object).o\u00d8O000().iffor();
                object5 = object8;
                object = new ArrayList(mc.o00000((Iterable)object8, 10));
                Iterator iterator = object5.iterator();
                while (iterator.hasNext()) {
                    Object object9 = iterator.next();
                    object9 = (Method)object9;
                    object8 = object;
                    object8.add(((Method)object9).getName());
                }
                object = list;
                object4 = k$_b.\u00d400000;
                object5 = k$_c.super;
                list = (List)object;
                object8 = object4;
                return new k((Class)object8, list, (k$_c)((Object)object5), (k$_b)((Object)object4), (List)object);
            }
            object2 = null;
        }
        object5 = object2;
        object3 = object2;
        Object object10 = object2 instanceof Constructor ? (b)((bd)object).o00000((Constructor)object5, ((bd)object).\u00f8Oo000(), true) : (object3 instanceof Method ? (((bd)object).\u00f8Oo000().\u00d4\u00f80000().\u00d400000(hd.super()) != null && !((ib)((bd)object).\u00f8Oo000().\u00d8\u00f80000()).\u00d5o\u00d2000() ? (b)super.\u00d300000((Method)object5) : super.o00000((Method)object5, ((bd)object).privatedo().o00000())) : (object5 = null));
        if (object10 != null) {
            return d.o00000((b)object5, (o)object, true, (List)object4);
        }
        return null;
    }

    private static final Type return(bd bd2) {
        Type type = gd.o00000(bd2);
        if (type == null) {
            type = bd2.privatedo().\u00d400000();
        }
        return type;
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(bd.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0);
        \u00f5\u00d5\u00d3000 = mArray2;
    }

    static /* synthetic */ ic new(bd bd2, String string) {
        return bd.o00000(bd2, string);
    }

    static /* synthetic */ b \u00d300000(bd bd2) {
        return bd.\u00d500000(bd2);
    }

    static /* synthetic */ b new(bd bd2) {
        return bd.o00000(bd2);
    }

    static /* synthetic */ Type \u00d400000(bd bd2) {
        return bd.return(bd2);
    }

    public final Object ifthissuper() {
        return this.o00000(new Object[0]);
    }

    public final Object \u00d5O0000(Object object) {
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        return this.o00000(objectArray2);
    }

    public final Object \u00d800000(Object object, Object object2) {
        Object[] objectArray = new Object[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        return this.o00000(objectArray2);
    }

    public final Object \u00d400000(Object object, Object object2, Object object3) {
        Object[] objectArray = new Object[3];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4) {
        Object[] objectArray = new Object[4];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5) {
        Object[] objectArray = new Object[5];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        Object[] objectArray = new Object[6];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        Object[] objectArray = new Object[7];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        Object[] objectArray = new Object[8];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        Object[] objectArray = new Object[9];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        Object[] objectArray = new Object[10];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        Object[] objectArray = new Object[11];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        Object[] objectArray = new Object[12];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        Object[] objectArray = new Object[13];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        Object[] objectArray = new Object[14];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        Object[] objectArray = new Object[15];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        Object[] objectArray = new Object[16];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        Object[] objectArray = new Object[17];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        Object[] objectArray = new Object[18];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        Object[] objectArray = new Object[19];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        objectArray2[18] = object19;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        Object[] objectArray = new Object[20];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        objectArray2[18] = object19;
        objectArray2[19] = object20;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21) {
        Object[] objectArray = new Object[21];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        objectArray2[18] = object19;
        objectArray2[19] = object20;
        objectArray2[20] = object21;
        return this.o00000(objectArray2);
    }

    public final Object new(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21, Object object22) {
        Object[] objectArray = new Object[22];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        objectArray2[18] = object19;
        objectArray2[19] = object20;
        objectArray2[20] = object21;
        objectArray2[21] = object22;
        return this.o00000(objectArray2);
    }

    public final GenericDeclaration \u00f5Oo000() {
        return zc.o00000(this.o\u00d8O000(), this.\u00d3\u00f4O000());
    }
}

