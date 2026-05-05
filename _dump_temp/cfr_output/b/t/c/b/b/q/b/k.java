/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.o.d.ib;
import b.s.mc;
import b.t.c.b.b.i.l;
import b.t.c.b.b.o.e.c;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.f$_b;
import b.t.c.b.b.q.b.k$_b$0;
import b.t.c.b.b.q.b.k$_b$1;
import b.t.c.b.b.q.b.k$_b$2;
import b.t.c.b.b.q.b.nb;
import b.t.c.b.b.q.b.p;
import b.t.c.b.b.q.b.s;
import b.t.c.b.b.q.cc;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.fc;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.qc;
import b.t.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class k
extends p
implements cc {
    static final /* synthetic */ m[] \u00d3\u00d8o000;
    private final nb O\u00d8o000;
    private final b.t.c.b.b.d.k o\u00d8o000;
    private final b.t.c.b.b.i.f \u00f8\u00d6o000;
    private final b.t.c.b.b.i.f whileStringsuper;
    private final f ifStringsuper;

    public k(nb p2, b.t.c.b.b.d.k k2, l l2) {
        super(o.\u00d8o\u00f6000.o00000(), k2.\u00d200000());
        this.O\u00d8o000 = p2;
        this.o\u00d8o000 = k2;
        p2 = this;
        this.\u00f8\u00d6o000 = l2.o00000(new k$_b$0((k)p2));
        p2 = this;
        this.whileStringsuper = l2.o00000(new k$_b$1((k)p2));
        p2 = this;
        this.ifStringsuper = new c(l2, new k$_b$2((k)p2));
    }

    public nb \u00d30O000() {
        return this.O\u00d8o000;
    }

    @Override
    public b.t.c.b.b.d.k O0O000() {
        return this.o\u00d8o000;
    }

    @Override
    public List o0O000() {
        return (List)b.t.c.b.b.i.k.o00000(this.\u00f8\u00d6o000, (Object)this, \u00d3\u00d8o000[0]);
    }

    protected final boolean \u00d40O000() {
        return (Boolean)b.t.c.b.b.i.k.o00000(this.whileStringsuper, (Object)this, \u00d3\u00d8o000[1]);
    }

    @Override
    public boolean \u00f5\u00f80000() {
        return this.\u00d40O000();
    }

    @Override
    public f \u00f8\u00f80000() {
        return this.ifStringsuper;
    }

    public cc whilenull() {
        if (this.O0O000().\u00d600000()) {
            return null;
        }
        return this.\u00d30O000().new(this.O0O000().\u00d300000());
    }

    public boolean equals(Object object) {
        cc cc2 = object instanceof cc ? (cc)object : null;
        if (cc2 == null) {
            return false;
        }
        object = cc2;
        return b.o.d.fc.o00000((Object)this.O0O000(), (Object)object.O0O000()) && b.o.d.fc.o00000((Object)this.\u00d30O000(), (Object)object.ifnull());
    }

    public int hashCode() {
        int n2 = this.\u00d30O000().hashCode();
        return 31 * n2 + this.O0O000().hashCode();
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    private static final List \u00d300000(k k2) {
        return fc.o00000(k2.\u00d30O000().O\u00d6\u00d2000(), k2.O0O000());
    }

    private static final boolean return(k k2) {
        return fc.\u00d200000(k2.\u00d30O000().O\u00d6\u00d2000(), k2.O0O000());
    }

    private static final f new(k k2) {
        if (k2.\u00f5\u00f80000()) {
            return f$_b.\u00f6\u00d30000;
        }
        Iterable iterable = k2.o0O000();
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (lc)object2;
            Iterable iterable2 = iterable;
            iterable2.add(object2.\u00f80O000());
        }
        iterable = mc.\u00d500000((Collection)((List)iterable), (Object)new s(k2.\u00d30O000(), k2.O0O000()));
        return b.t.c.b.b.o.e.m.o00000.super("package view scope for " + k2.O0O000() + " in " + k2.\u00d30O000().\u00d5\u00f80000(), iterable);
    }

    static {
        m[] mArray = new m[2];
        m[] mArray2 = mArray;
        mArray[0] = new ib(k.class, "fragments", "getFragments()Ljava/util/List;", 0);
        mArray2[1] = new ib(k.class, "empty", "getEmpty()Z", 0);
        \u00d3\u00d8o000 = mArray2;
    }

    static /* synthetic */ List o00000(k k2) {
        return k.\u00d300000(k2);
    }

    static /* synthetic */ boolean \u00d500000(k k2) {
        return k.return(k2);
    }

    static /* synthetic */ f \u00d400000(k k2) {
        return k.new(k2);
    }
}

