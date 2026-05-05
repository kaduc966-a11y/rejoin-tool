/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.i.l;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.f$_b;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.eb$_b$0;
import b.t.c.b.b.q.b.eb$_b$1;
import b.t.c.b.b.q.b.eb$_b$2;
import b.t.c.b.b.q.b.eb$_c$1;
import b.t.c.b.b.q.b.j;
import b.t.c.b.b.q.b.q;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.qc;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.sb;
import b.t.c.b.b.q.vb;
import b.t.c.b.b.q.wb;
import b.t.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class eb
extends b.t.c.b.b.q.b.kb
implements h {
    static final /* synthetic */ m[] \u00d3\u00f6\u00d5000;
    private final l o\u00f6\u00d5000;
    private final s nullclassObject;
    private final b.t.c.b.b.i.f O\u00f6\u00d5000;
    private List \u00f8\u00f5\u00d5000;
    private final eb$_c$1 \u00d4\u00f6\u00d5000;

    public eb(l object, wb wb2, o o2, b.t.c.b.b.d.f f2, g g2, s s2) {
        super(wb2, o2, f2, g2);
        this.o\u00f6\u00d5000 = object;
        this.nullclassObject = s2;
        object = this;
        this.O\u00f6\u00d5000 = this.o\u00f6\u00d5000.o00000(new eb$_b$0((eb)object));
        this.\u00d4\u00f6\u00d5000 = new eb$_c$1(this);
    }

    protected final l whileStringsuper() {
        return this.o\u00f6\u00d5000;
    }

    public final void \u00f800000(List list) {
        this.\u00f8\u00f5\u00d5000 = list;
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    @Override
    public boolean \u00f4\u00d6o000() {
        eb eb2 = this;
        return b.t.c.b.b.h.o.o00000((rc)this.\u00f5\u00d6o000(), new eb$_b$1(eb2));
    }

    public final Collection \u00d4\u00d8o000() {
        ib ib2 = this.\u00f8\u00d6o000();
        if (ib2 == null) {
            return mc.\u00d500000();
        }
        Object object = ib2.newifsuper();
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            vb vb2 = (sb)object.next();
            q q2 = j.StringfloatObject.super(this.o\u00f6\u00d5000, this, (sb)vb2);
            if (q2 == null) continue;
            vb2 = q2;
            collection.add(vb2);
        }
        return (List)collection;
    }

    @Override
    public List \u00d8\u00d6o000() {
        List list = this.\u00f8\u00f5\u00d5000;
        if (list == null) {
            fc.return("");
            list = null;
        }
        return list;
    }

    @Override
    public ab \u00f40O000() {
        return ab.\u00d600000;
    }

    @Override
    public s \u00d50O000() {
        return this.nullclassObject;
    }

    @Override
    public boolean \u00d80O000() {
        return false;
    }

    @Override
    public boolean thisint() {
        return false;
    }

    @Override
    public boolean \u00f50O000() {
        return false;
    }

    @Override
    public bc \u00d3OO000() {
        return this.\u00d4\u00f6\u00d5000;
    }

    @Override
    public String toString() {
        return "typealias " + this.\u00d5\u00f80000().\u00d400000();
    }

    public h o\u00d8o000() {
        return (h)super.oOO000();
    }

    protected abstract List \u00d3\u00d8o000();

    protected final b.t.c.b.b.h.ib O\u00d8o000() {
        kb kb2 = this;
        Object object = this.\u00f8\u00d6o000();
        if (object == null || (object = object.o\u00d2\u00d2000()) == null) {
            object = f$_b.\u00f6\u00d30000;
        }
        eb eb2 = this;
        return b.t.c.b.b.h.o.o00000(kb2, (f)object, (b.o.e.g)new eb$_b$2(eb2));
    }

    private static final Collection new(eb eb2) {
        return eb2.\u00d4\u00d8o000();
    }

    private static final Boolean o00000(eb eb2, b.t.c.b.b.h.l i2) {
        return !hb.super(i2) && (i2 = i2.thisdosuper().\u00f4OO000()) instanceof i && !fc.o00000((Object)((i)i2).\u00d8\u00f80000(), (Object)eb2);
    }

    private static final b.t.c.b.b.h.ib o00000(eb eb2, b b2) {
        kb kb2 = b2.o00000(eb2);
        if (kb2 != null) {
            return kb2.nullint();
        }
        return null;
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(eb.class, "constructors", "getConstructors()Ljava/util/Collection;", 0);
        \u00d3\u00f6\u00d5000 = mArray2;
    }

    static /* synthetic */ Collection o00000(eb eb2) {
        return eb.new(eb2);
    }

    static /* synthetic */ Boolean new(eb eb2, b.t.c.b.b.h.l l2) {
        return eb.o00000(eb2, l2);
    }

    static /* synthetic */ b.t.c.b.b.h.ib new(eb eb2, b b2) {
        return eb.o00000(eb2, b2);
    }
}

