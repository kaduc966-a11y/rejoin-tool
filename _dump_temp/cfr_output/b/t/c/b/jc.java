/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.d.fc;
import b.r;
import b.s.mc;
import b.t.c.b.b.c.c.c;
import b.t.c.b.b.c.e;
import b.t.c.b.b.c.y;
import b.t.c.b.b.f.b.b.d;
import b.t.c.b.b.f.b.b.m;
import b.t.c.b.b.f.b.cb;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.c.b;
import b.t.c.b.b.l.d.g;
import b.t.c.b.b.n.b.b.c$_b;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.d.c.n;
import b.t.c.b.b.q.pb;
import b.t.c.b.h;
import b.t.c.b.hd;
import b.t.c.b.jc$_b$0;
import b.t.c.b.jc$_b$1;
import b.t.c.b.jc$_c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class jc
extends h {
    private final Class O\u00d8\u00d5000;
    private final dc \u00f8\u00d6\u00d5000;

    public jc(Class object) {
        this.O\u00d8\u00d5000 = object;
        object = this;
        this.\u00f8\u00d6\u00d5000 = r.o00000(lb.\u00d400000, (b.o.e.h)new jc$_b$0((jc)object));
    }

    @Override
    public final Class iffor() {
        return this.O\u00d8\u00d5000;
    }

    @Override
    protected final Class \u00f8\u00d4O000() {
        Class clazz = ((jc$_c)this.\u00f8\u00d6\u00d5000.\u00d200000()).\u00d2o0000();
        if (clazz == null) {
            clazz = this.iffor();
        }
        return clazz;
    }

    private final f newnewsuper() {
        return ((jc$_c)this.\u00f8\u00d6\u00d5000.\u00d200000()).\u00d5o0000();
    }

    @Override
    public final Collection thisvoid() {
        return ((jc$_c)this.\u00f8\u00d6\u00d5000.\u00d200000()).intsuper();
    }

    public final boolean O\u00d3o000() {
        Object object = ((jc$_c)this.\u00f8\u00d6\u00d5000.\u00d200000()).\u00d6o0000();
        return (object != null && (object = ((n)object).\u00d200000()) != null ? ((b.t.c.b.b.n.b.b.c)object).\u00d600000() : null) == c$_b.\u00d200000;
    }

    public final Collection \u00d3\u00d3o000() {
        Object object = ((jc$_c)this.\u00f8\u00d6\u00d5000.\u00d200000()).\u00d4o0000();
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Iterable iterable = ((y)object.next()).\u00d200000();
            mc.new(collection, iterable);
        }
        return (List)collection;
    }

    public final Collection o\u00d3o000() {
        Object object = ((jc$_c)this.\u00f8\u00d6\u00d5000.\u00d200000()).\u00d4o0000();
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Iterable iterable = ((y)object.next()).Object();
            mc.new(collection, iterable);
        }
        return (List)collection;
    }

    @Override
    public final Collection whilefor() {
        return mc.\u00d500000();
    }

    @Override
    public final Collection o\u00d5O000() {
        return mc.\u00d500000();
    }

    @Override
    public final Collection new(b.t.c.b.b.d.f f2) {
        return this.newnewsuper().\u00d400000(f2, b.t.c.b.b.j.b.f.o00000);
    }

    @Override
    public final Collection o00000(b.t.c.b.b.d.f f2) {
        return this.newnewsuper().\u00d300000(f2, b.t.c.b.b.j.b.f.o00000);
    }

    @Override
    public final pb o\u00d30000(int n2) {
        f f2 = this.newnewsuper();
        d d2 = f2 instanceof d ? (d)f2 : null;
        if (d2 == null) {
            return null;
        }
        f2 = d2;
        b$_i b$_i = d2.interface();
        b$_n b$_n = (b$_n)g.super(b$_i, b.for, n2);
        if (b$_n != null) {
            b$_n b$_n2 = b$_n;
            return (pb)hd.super(this.iffor(), new b.t.c.b.y(this), b$_n2, ((m)f2).OO0000().\u00f500000(), new b.t.c.b.b.l.d.d(b$_i.O\u00f6\u00d2000()), ((m)f2).OO0000().\u00d300000(), jc$_b$1.whileStringnew);
        }
        return null;
    }

    @Override
    public final e whilenew(int n2) {
        Object object = (y)mc.\u00d8O0000(((jc$_c)this.\u00f8\u00d6\u00d5000.\u00d200000()).\u00d4o0000());
        if (object != null && (object = c.super((y)object)) != null) {
            return (e)mc.\u00f400000((List)object, n2);
        }
        return null;
    }

    public final boolean equals(Object object) {
        return object instanceof jc && fc.o00000((Object)this.iffor(), (Object)((jc)object).iffor());
    }

    public final int hashCode() {
        return this.iffor().hashCode();
    }

    public final String toString() {
        return "file class " + b.t.c.b.b.q.d.b.e.\u00d200000(this.iffor()).\u00f400000();
    }

    private static final jc$_c o00000(jc jc2) {
        return new jc$_c(jc2);
    }

    private static final pb \u00d300000(cb cb2, b$_n b$_n) {
        return cb2.super(b$_n, true);
    }

    public static final /* synthetic */ dc \u00d300000(jc jc2) {
        return jc2.\u00f8\u00d6\u00d5000;
    }

    static /* synthetic */ jc$_c new(jc jc2) {
        return jc.o00000(jc2);
    }

    static /* synthetic */ pb \u00d400000(cb cb2, b$_n b$_n) {
        return jc.\u00d300000(cb2, b$_n);
    }
}

