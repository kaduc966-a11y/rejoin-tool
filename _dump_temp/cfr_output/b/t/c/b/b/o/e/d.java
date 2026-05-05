/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.o.d.w;
import b.o.e.g;
import b.qb;
import b.s.mc;
import b.t.c.b.b.j.b.e;
import b.t.c.b.b.o.e.d$_b$0;
import b.t.c.b.b.o.e.d$_b$1;
import b.t.c.b.b.o.e.d$_b$2;
import b.t.c.b.b.o.e.d$_c;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.h;
import b.t.c.b.b.o.j;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
extends h {
    public static final d$_c o00000 = new d$_c(null);
    private final String public;
    private final f \u00d4O0000;

    private d(String string, f f2) {
        this.public = string;
        this.\u00d4O0000 = f2;
    }

    @Override
    protected final f int() {
        return this.\u00d4O0000;
    }

    @Override
    public final Collection \u00d300000(b.t.c.b.b.d.f f2, e e2) {
        return j.o00000(super.\u00d300000(f2, e2), d$_b$0.\u00d8O\u00d5000);
    }

    @Override
    public final Collection \u00d400000(b.t.c.b.b.d.f f2, e e2) {
        return j.o00000(super.\u00d400000(f2, e2), d$_b$1.thisinterfacenew);
    }

    @Override
    public final Collection super(b.t.c.b.b.o.e.j object, g object2) {
        object2 = super.super((b.t.c.b.b.o.e.j)object, (g)object2);
        object = new ArrayList();
        ArrayList arrayList = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object t2 = object2.next();
            if ((wb)t2 instanceof b) {
                ((ArrayList)object).add(t2);
                continue;
            }
            arrayList.add(t2);
        }
        object = new qb(object, arrayList);
        object2 = (List)((qb)object).\u00d400000();
        object = (List)((qb)object).\u00d300000();
        return mc.return(j.o00000((Collection)object2, d$_b$2.\u00d5O\u00d5000), (Iterable)object);
    }

    private static final b \u00d200000(b.t.c.b.b.q.qb qb2) {
        return qb2;
    }

    private static final b \u00d200000(pb pb2) {
        return pb2;
    }

    private static final b super(b b2) {
        return b2;
    }

    public static final f super(String string, Collection collection) {
        return o00000.super(string, collection);
    }

    public /* synthetic */ d(String string, f f2, w w2) {
        this(string, f2);
    }

    static /* synthetic */ b super(b.t.c.b.b.q.qb qb2) {
        return d.\u00d200000(qb2);
    }

    static /* synthetic */ b super(pb pb2) {
        return d.\u00d200000(pb2);
    }

    static /* synthetic */ b \u00d200000(b b2) {
        return d.super(b2);
    }
}

