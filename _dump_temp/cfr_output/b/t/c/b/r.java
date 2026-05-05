/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.i;
import b.lb;
import b.o.d.fc;
import b.o.d.rb;
import b.qd;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.c.l;
import b.t.c.b.b.c.p;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.t.c.b.b.f.b.b.h;
import b.t.c.b.b.f.b.cb;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.d.g;
import b.t.c.b.b.n.b.b.c;
import b.t.c.b.b.n.b.b.c$_b;
import b.t.c.b.b.o.e.b;
import b.t.c.b.b.o.e.b$_b;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.db;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.c.n;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.wb;
import b.t.c.b.cd;
import b.t.c.b.gb;
import b.t.c.b.hd;
import b.t.c.b.r$_b$0;
import b.t.c.b.r$_b$1;
import b.t.c.b.r$_c$1$1;
import b.t.c.b.r$_d$_b$1;
import b.t.c.b.r$_e;
import b.t.c.b.r$_f;
import b.t.c.b.r$_g;
import b.t.c.b.r$_h;
import b.t.c.b.y;
import b.t.j;
import b.t.u;
import b.t.z;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r
extends b.t.c.b.h
implements b.o.d.d,
z,
b.t.c.b.z,
b.t.c.b.b.h.c.g {
    public static final r$_h \u00d3\u00f8o000 = new r$_h(null);
    private final Class \u00f5\u00d6\u00d5000;
    private final dc \u00f4\u00d6\u00d5000;
    private static final Set \u00d8\u00d6\u00d5000;

    public r(Class object) {
        this.\u00f5\u00d6\u00d5000 = object;
        object = this;
        this.\u00f4\u00d6\u00d5000 = b.r.o00000(lb.\u00d400000, (b.o.e.h)new r$_b$0((r)object));
    }

    @Override
    public final Class iffor() {
        return this.\u00f5\u00d6\u00d5000;
    }

    public final dc O\u00d2o000() {
        return this.\u00f4\u00d6\u00d5000;
    }

    public final ib \u00d5\u00d2o000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).oO0000();
    }

    private final p o\u00d2o000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00d2O0000();
    }

    @Override
    public final List \u00d8\u00f50000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00d4O0000();
    }

    private final d \u00d3\u00d2o000() {
        return b.t.c.b.ib.super.super(this.iffor());
    }

    public final b.t.c.b.b.c.gb \u00f4\u00d2o000() {
        Object object = this.o\u00d2o000();
        if (object == null || (object = b.t.c.b.b.c.b.Object(object)) == null) {
            if (this.iffor().isAnnotation()) {
                return b.t.c.b.b.c.gb.o00000;
            }
            if (this.iffor().isInterface()) {
                return b.t.c.b.b.c.gb.void;
            }
            if (this.iffor().isEnum()) {
                return b.t.c.b.b.c.gb.\u00f500000;
            }
            if (this.iffor().getSuperclass().isEnum()) {
                return b.t.c.b.b.c.gb.\u00d400000;
            }
            object = b.t.c.b.b.c.gb.\u00f600000;
        }
        return object;
    }

    public final f \u00f8oo000() {
        return this.\u00d5\u00d2o000().nullint().\u00f4\u00d6\u00d2000();
    }

    public final f Stringsupersuper() {
        return this.\u00d5\u00d2o000().\u00d3\u00d2\u00d2000();
    }

    @Override
    public final Collection thisvoid() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00d200000();
    }

    private final Collection o00000(f iterator, r$_g r$_g) {
        r$_d$_b$1 r$_d$_b$1 = new r$_d$_b$1(this);
        iterator = b$_b.o00000((b)((Object)iterator), null, null, 3, null);
        Collection collection = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            wb wb2 = (wb)iterator.next();
            gb gb2 = wb2 instanceof hc && !fc.o00000((Object)((hc)wb2).\u00d50O000(), (Object)eb.\u00d5O0000) && r$_g.super((hc)wb2) ? (gb)wb2.o00000(r$_d$_b$1, i.o00000) : null;
            if (gb2 == null) continue;
            wb2 = gb2;
            collection.add(wb2);
        }
        return mc.\u00f5O0000((Iterable)((List)collection));
    }

    @Override
    public final Collection whilefor() {
        p p2 = this.o\u00d2o000();
        List list = p2 != null ? p2.oO0000() : null;
        if (list == null) {
            list = mc.\u00d500000();
        }
        return list;
    }

    @Override
    public final Collection o\u00d5O000() {
        return this.\u00d5\u00d2o000().newifsuper();
    }

    @Override
    public final Collection new(b.t.c.b.b.d.f f2) {
        return mc.return(this.\u00f8oo000().\u00d400000(f2, b.t.c.b.b.j.b.f.o00000), (Iterable)this.Stringsupersuper().\u00d400000(f2, b.t.c.b.b.j.b.f.o00000));
    }

    @Override
    public final Collection o00000(b.t.c.b.b.d.f f2) {
        return mc.return(this.\u00f8oo000().\u00d300000(f2, b.t.c.b.b.j.b.f.o00000), (Iterable)this.Stringsupersuper().\u00d300000(f2, b.t.c.b.b.j.b.f.o00000));
    }

    @Override
    public final pb o\u00d30000(int n2) {
        ib ib2 = this.\u00d5\u00d2o000();
        h h2 = ib2 instanceof h ? (h)ib2 : null;
        if (h2 != null) {
            ib2 = h2;
            b$_n b$_n = (b$_n)g.super(h2.thisfloatsuper(), b.t.c.b.b.l.c.b.\u00d500000, n2);
            if (b$_n != null) {
                b$_n b$_n2 = b$_n;
                return (pb)hd.super(this.iffor(), new y(this), b$_n2, ((h)ib2).\u00d8\u00d3\u00d2000().\u00f500000(), ((h)ib2).\u00d8\u00d3\u00d2000().String(), ((h)ib2).Stringfloatsuper(), r$_b$1.o\u00f4\u00d3000);
            }
            return null;
        }
        return null;
    }

    @Override
    public final b.t.c.b.b.c.e whilenew(int n2) {
        Object object = this.o\u00d2o000();
        if (object != null && (object = b.t.c.b.b.c.c.c.\u00d200000((p)object)) != null) {
            return (b.t.c.b.b.c.e)mc.\u00f400000((List)object, n2);
        }
        return null;
    }

    @Override
    public final String \u00f4\u00d3O000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).classsuper();
    }

    @Override
    public final String \u00d8\u00d3O000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00f5O0000();
    }

    @Override
    public final Collection returnfor() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00f4O0000();
    }

    @Override
    public final Collection \u00f5\u00d3O000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00d400000();
    }

    @Override
    public final Object \u00d8\u00d4O000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00f400000();
    }

    @Override
    public final boolean if(Object object) {
        Integer n2 = e.\u00d500000(this.iffor());
        if (n2 != null) {
            int n3 = ((Number)n2).intValue();
            return rb.\u00d200000(object, n3);
        }
        Class clazz = e.o00000(this.iffor());
        if (clazz == null) {
            clazz = this.iffor();
        }
        return clazz.isInstance(object);
    }

    @Override
    public final List O\u00d4O000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00f6O0000();
    }

    public final cd \u00d4\u00d2o000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).oo0000();
    }

    @Override
    public final List forfloat() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00d600000();
    }

    @Override
    public final List \u00f4\u00d4O000() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).Oo0000();
    }

    @Override
    public final j \u00f5\u00d4O000() {
        return hd.super(this.\u00d5\u00d2o000().\u00d50O000());
    }

    private final l \u00d8\u00d2o000() {
        Object object = this.o\u00d2o000();
        if (object == null || (object = b.t.c.b.b.c.b.o00000(object)) == null) {
            if (this.iffor().isAnnotation() || this.iffor().isEnum()) {
                return l.void;
            }
            if (fc.o00000((Object)b.t.c.b.b.q.d.b.b.o00000.new(this.iffor()), (Object)Boolean.TRUE)) {
                return l.\u00d200000;
            }
            if (Modifier.isAbstract(this.iffor().getModifiers())) {
                return l.\u00d500000;
            }
            if (!Modifier.isFinal(this.iffor().getModifiers())) {
                return l.\u00d600000;
            }
            object = l.void;
        }
        return object;
    }

    @Override
    public final boolean o\u00d4O000() {
        return this.\u00d8\u00d2o000() == l.void;
    }

    @Override
    public final boolean privatefloat() {
        return this.\u00d8\u00d2o000() == l.\u00d600000;
    }

    @Override
    public final boolean \u00d4\u00d3O000() {
        return this.\u00d8\u00d2o000() == l.\u00d500000;
    }

    @Override
    public final boolean \u00f8\u00d3O000() {
        return this.\u00d8\u00d2o000() == l.\u00d200000;
    }

    @Override
    public final boolean \u00d5\u00d3O000() {
        p p2 = this.o\u00d2o000();
        if (p2 != null) {
            return b.t.c.b.b.c.b.\u00d500000(p2);
        }
        return false;
    }

    @Override
    public final boolean newfor() {
        p p2 = this.o\u00d2o000();
        if (p2 == null) {
            return this.iffor().getDeclaringClass() != null && !Modifier.isStatic(this.iffor().getModifiers());
        }
        return b.t.c.b.b.c.b.\u00d600000(p2);
    }

    @Override
    public final boolean \u00d5\u00d4O000() {
        p p2 = this.o\u00d2o000();
        return (p2 != null ? b.t.c.b.b.c.b.Object(p2) : null) == b.t.c.b.b.c.gb.\u00f400000;
    }

    @Override
    public final boolean \u00d4\u00d4O000() {
        p p2 = this.o\u00d2o000();
        if (p2 != null) {
            return b.t.c.b.b.c.b.\u00d400000(p2);
        }
        return false;
    }

    @Override
    public final boolean \u00d3\u00d4O000() {
        p p2 = this.o\u00d2o000();
        if (p2 != null) {
            return b.t.c.b.b.c.b.\u00d200000(p2);
        }
        return false;
    }

    public final String privatesupersuper() {
        p p2 = this.o\u00d2o000();
        if (p2 != null) {
            return p2.\u00d500000();
        }
        return null;
    }

    public final u nullsupersuper() {
        return ((r$_e)this.\u00f4\u00d6\u00d5000.\u00d200000()).\u00d5O0000();
    }

    @Override
    public final GenericDeclaration \u00d5\u00f50000() {
        return this.iffor();
    }

    public final String forsupersuper() {
        p p2 = this.o\u00d2o000();
        if (p2 != null) {
            return b.t.c.b.b.c.c.c.super(p2);
        }
        return null;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof r && fc.o00000((Object)b.o.r.new(this), (Object)b.o.r.new((z)object));
    }

    @Override
    public final int hashCode() {
        return b.o.r.new(this).hashCode();
    }

    public final String toString() {
        Object object = this.\u00d3\u00d2o000();
        StringBuilder stringBuilder = new StringBuilder("class ");
        Object object2 = ((d)object).\u00d800000();
        object2 = ((k)object2).\u00d600000() ? "" : ((k)object2).super() + '.';
        object = b.q.f.super(((d)object).\u00d400000().super(), '.', '$', false, 4, null);
        return stringBuilder.append((String)object2 + (String)object).toString();
    }

    private final ib o00000(d d2, b.t.c.b.b.q.d.c.h h2) {
        if (this.iffor().isSynthetic()) {
            return this.new(d2, h2);
        }
        Object object = n.\u00d200000.super(this.iffor());
        c$_b c$_b = object != null && (object = ((n)object).\u00d200000()) != null ? ((c)object).\u00d600000() : null;
        switch (c$_b == null ? -1 : r$_f.super[c$_b.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return this.new(d2, h2);
            }
            case 5: {
                throw new b.t.c.b.lb("Unknown class: " + this.iffor() + " (kind = " + (Object)((Object)c$_b) + ')');
            }
            case -1: 
            case 6: {
                throw new b.t.c.b.lb("Unresolved class: " + this.iffor() + " (kind = " + (Object)((Object)c$_b) + ')');
            }
        }
        throw new qd();
    }

    private final ib new(d object, b.t.c.b.b.q.d.c.h object2) {
        object = new b.t.c.b.b.q.b.c(new db(((b.t.c.b.b.q.d.c.h)object2).super(), ((d)object).\u00d800000()), ((d)object).o00000(), ab.\u00d600000, ec.int, mc.o00000(((b.t.c.b.b.q.d.c.h)object2).super().returnforsuper().\u00f6O0000().nullint()), b.t.c.b.b.q.g.o00000, false, ((b.t.c.b.b.q.d.c.h)object2).\u00d200000().\u00d500000());
        b.t.c.b.b.q.b.c c2 = object;
        object2 = ((b.t.c.b.b.q.d.c.h)object2).\u00d200000().\u00d500000();
        ((b.t.c.b.b.q.b.c)object).o00000(new r$_c$1$1(c2, (b.t.c.b.b.i.l)object2), ub.\u00d300000(), null);
        return (ib)object;
    }

    private static final r$_e \u00d300000(r r2) {
        return new r$_e(r2);
    }

    private static final pb new(cb cb2, b$_n b$_n) {
        return cb2.super(b$_n, true);
    }

    public static final /* synthetic */ d o00000(r r2) {
        return r2.\u00d3\u00d2o000();
    }

    public static final /* synthetic */ ib o00000(r r2, d d2, b.t.c.b.b.q.d.c.h h2) {
        return r2.o00000(d2, h2);
    }

    public static final /* synthetic */ Set \u00f5\u00d2o000() {
        return \u00d8\u00d6\u00d5000;
    }

    public static final /* synthetic */ Collection o00000(r r2, f f2, r$_g r$_g) {
        return r2.o00000(f2, r$_g);
    }

    static {
        Object object = b.t.c.b.b.b.Object.o00000();
        Collection collection = new HashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (d)object2;
            Collection collection2 = collection;
            collection2.add(((d)object2).\u00f400000().toString());
        }
        \u00d8\u00d6\u00d5000 = (Set)collection;
    }

    static /* synthetic */ r$_e new(r r2) {
        return r.\u00d300000(r2);
    }

    static /* synthetic */ pb o00000(cb cb2, b$_n b$_n) {
        return r.new(cb2, b$_n);
    }
}

