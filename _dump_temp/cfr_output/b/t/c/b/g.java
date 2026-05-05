/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.d.fc;
import b.o.d.zc;
import b.r;
import b.s.mc;
import b.t.c.b.ad;
import b.t.c.b.b.c.c.c;
import b.t.c.b.b.c.c.d;
import b.t.c.b.b.c.c.i;
import b.t.c.b.b.c.e;
import b.t.c.b.b.c.l;
import b.t.c.b.b.c.z;
import b.t.c.b.cd;
import b.t.c.b.d.b;
import b.t.c.b.dd;
import b.t.c.b.g$_b$0;
import b.t.c.b.g$_b$1;
import b.t.c.b.g$_b$2;
import b.t.c.b.g$_b$3;
import b.t.c.b.g$_b$4;
import b.t.c.b.g$_b$5;
import b.t.c.b.g$_d;
import b.t.c.b.h;
import b.t.c.b.hd;
import b.t.c.b.jc;
import b.t.c.b.lc;
import b.t.c.b.md;
import b.t.c.b.p;
import b.t.c.b.s;
import b.t.j;
import b.t.u;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class g
extends b.t.c.b.d
implements s {
    private final h \u00d50\u00d3000;
    private final String \u00d80\u00d3000;
    private final Object Stringinterfacesuper;
    private final e oO\u00d3000;
    private final dc \u00f80\u00d3000;
    private final dc OO\u00d3000;
    private final dc \u00f40\u00d3000;
    private final dc \u00f50\u00d3000;
    private final dc thisinterfacesuper;

    public g(h object, String string, Object object2, e e2) {
        this.\u00d50\u00d3000 = object;
        this.\u00d80\u00d3000 = string;
        this.Stringinterfacesuper = object2;
        this.oO\u00d3000 = e2;
        object = this;
        this.\u00f80\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new g$_b$0((g)object));
        object = this;
        this.OO\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new g$_b$1((g)object));
        object = this;
        this.\u00f40\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new g$_b$2((g)object));
        object = this;
        this.\u00f50\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new g$_b$3((g)object));
        object = this;
        this.thisinterfacesuper = r.o00000(lb.\u00d400000, (b.o.e.h)new g$_b$4((g)object));
    }

    @Override
    public h o\u00d8O000() {
        return this.\u00d50\u00d3000;
    }

    @Override
    public String \u00f5\u00f6O000() {
        return this.\u00d80\u00d3000;
    }

    @Override
    public Object O\u00d8O000() {
        return this.Stringinterfacesuper;
    }

    public final e O\u00f8O000() {
        return this.oO\u00d3000;
    }

    @Override
    public String \u00f5\u00d5O000() {
        return this.oO\u00d3000.\u00f800000();
    }

    @Override
    public List \u00f8\u00d6O000() {
        return (List)this.\u00f80\u00d3000.\u00d200000();
    }

    @Override
    public List \u00d8\u00d5O000() {
        return (List)this.OO\u00d3000.\u00d200000();
    }

    @Override
    public u \u00d5\u00d5O000() {
        return (u)this.\u00f40\u00d3000.\u00d200000();
    }

    public final dc \u00f8\u00f6O000() {
        return this.\u00f50\u00d3000;
    }

    @Override
    public List O\u00d4O000() {
        return ((cd)this.\u00f50\u00d3000.\u00d200000()).o00000();
    }

    @Override
    public j \u00f8\u00d5O000() {
        return p.super(b.t.c.b.b.c.b.\u00d400000(this.oO\u00d3000));
    }

    @Override
    public l \u00d4\u00d8O000() {
        return b.t.c.b.b.c.b.\u00d500000(this.oO\u00d3000);
    }

    @Override
    public boolean \u00f4\u00d5O000() {
        return false;
    }

    @Override
    public boolean \u00d8\u00d6O000() {
        return b.t.c.b.b.c.b.o00000(this.oO\u00d3000);
    }

    @Override
    public boolean \u00f5\u00d6O000() {
        return b.t.c.b.b.c.b.\u00d200000(this.oO\u00d3000);
    }

    public abstract g$_d ifprivate();

    @Override
    public Field \u00f4\u00f6O000() {
        return (Field)this.thisinterfacesuper.\u00d200000();
    }

    protected final Member whileprivate() {
        if (!b.t.c.b.b.c.b.Object(this.oO\u00d3000)) {
            return null;
        }
        b.t.c.b.b.c.c.g g2 = c.\u00d200000(this.oO\u00d3000);
        if (g2 != null) {
            return this.o\u00d8O000().\u00d400000(((i)g2).\u00d200000(), ((i)g2).o00000());
        }
        return this.\u00f4\u00f6O000();
    }

    @Override
    public b privatedo() {
        return this.ifprivate().privatedo();
    }

    @Override
    public b \u00d3\u00d8O000() {
        return this.ifprivate().\u00d3\u00d8O000();
    }

    @Override
    public List \u00d8\u00f50000() {
        if (lc.o00000(this)) {
            Iterable iterable = this.oO\u00d3000.\u00d800000();
            Object object = iterable;
            iterable = new ArrayList(mc.o00000(iterable, 10));
            object = object.iterator();
            while (object.hasNext()) {
                Object object2 = object.next();
                object2 = (z)object2;
                Iterable iterable2 = iterable;
                iterable2.add(p.super(object2, this.o\u00d8O000().iffor().getClassLoader()));
            }
            return (List)iterable;
        }
        if (!(this.o\u00d8O000() instanceof jc)) {
            String string = "Annotations are only supported for top-level properties for now: ".concat(String.valueOf(this));
            throw new IllegalArgumentException(string.toString());
        }
        b.t.c.b.b.c.c.g g2 = c.class(this.oO\u00d3000);
        if (g2 == null) {
            return mc.\u00d500000();
        }
        b.t.c.b.b.c.c.g g3 = g2;
        Object object = this.o\u00d8O000().\u00d400000(((i)g3).\u00d200000(), ((i)g3).o00000());
        if (object == null || (object = object.getAnnotations()) == null || (object = b.s.z.thisnew(object)) == null) {
            throw new b.t.c.b.lb("No synthetic method found: ".concat(String.valueOf(this)));
        }
        return hd.super((List)object);
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
        return this.o\u00f8O000();
    }

    private static final List \u00f400000(g g2) {
        return ad.o00000(g2, g2.oO\u00d3000.class(), g2.oO\u00d3000.\u00f400000(), mc.\u00d500000(), (cd)g2.\u00f50\u00d3000.\u00d200000(), true);
    }

    private static final List return(g g2) {
        if (md.\u00d300000(g2)) {
            return ad.o00000(g2, g2.oO\u00d3000.class(), g2.oO\u00d3000.\u00f400000(), mc.\u00d500000(), (cd)g2.\u00f50\u00d3000.\u00d200000(), false);
        }
        return g2.\u00f8\u00d6O000();
    }

    private static final Type OO0000(g g2) {
        return g2.privatedo().\u00d400000();
    }

    private static final u \u00d500000(g g2) {
        return p.super(g2.oO\u00d3000.int(), g2.o\u00d8O000().iffor().getClassLoader(), (cd)g2.\u00f50\u00d3000.\u00d200000(), (b.o.e.h)(lc.o00000(g2) ? null : new g$_b$5(g2)));
    }

    private static final cd \u00f500000(g g2) {
        Object object = g2.o\u00d8O000();
        b.t.c.b.r r2 = object instanceof b.t.c.b.r ? (b.t.c.b.r)object : null;
        object = r2 != null ? r2.\u00d4\u00d2o000() : null;
        return cd.\u00d500000.o00000(g2.oO\u00d3000.\u00d600000(), (cd)object, g2, g2.o\u00d8O000().iffor().getClassLoader());
    }

    private static final Field if(g object) {
        if (lc.o00000((s)object)) {
            return null;
        }
        d d2 = c.super(((g)object).oO\u00d3000);
        if (d2 == null) {
            return null;
        }
        d d3 = d2;
        if (!(((g)object).o\u00d8O000() instanceof jc)) {
            object = "javaField is only supported for top-level properties for now: ".concat(String.valueOf(object));
            throw new IllegalArgumentException(object.toString());
        }
        object = ((g)object).o\u00d8O000().iffor();
        try {
            object = ((Class)object).getDeclaredField(((i)d3).\u00d200000());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            object = null;
        }
        return object;
    }

    static /* synthetic */ List \u00d300000(g g2) {
        return g.\u00f400000(g2);
    }

    static /* synthetic */ List \u00f800000(g g2) {
        return g.return(g2);
    }

    static /* synthetic */ u \u00d400000(g g2) {
        return g.\u00d500000(g2);
    }

    static /* synthetic */ cd o00000(g g2) {
        return g.\u00f500000(g2);
    }

    static /* synthetic */ Field new(g g2) {
        return g.if(g2);
    }

    static /* synthetic */ Type \u00d800000(g g2) {
        return g.OO0000(g2);
    }

    public GenericDeclaration o\u00f8O000() {
        return zc.o00000(this.o\u00d8O000(), this.\u00f5\u00f6O000());
    }
}

