/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.f.b.ab;
import b.t.c.b.b.f.b.b.d;
import b.t.c.b.b.f.b.b.i;
import b.t.c.b.b.f.b.c;
import b.t.c.b.b.f.b.fb;
import b.t.c.b.b.f.b.t;
import b.t.c.b.b.f.b.x$_b$0;
import b.t.c.b.b.f.b.x$_b$1;
import b.t.c.b.b.i.l;
import b.t.c.b.b.l.b$_e;
import b.t.c.b.b.l.d.j;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class x
extends ab {
    private final j \u00f8\u00d2\u00d8000;
    private final i O\u00d3\u00d8000;
    private final b.t.c.b.b.l.d.i o\u00d3\u00d8000;
    private final c newthisString;
    private b$_e privateinterfaceObject;
    private f \u00d3\u00d3\u00d8000;

    public x(k object, l l2, bc bc2, b$_e b$_e, j j2, i i2) {
        super((k)object, l2, bc2);
        this.\u00f8\u00d2\u00d8000 = j2;
        this.O\u00d3\u00d8000 = i2;
        this.o\u00d3\u00d8000 = new b.t.c.b.b.l.d.i(b$_e.\u00d8\u00d5\u00d2000(), b$_e.intforsuper());
        object = this;
        this.newthisString = new c(b$_e, this.o\u00d3\u00d8000, this.\u00f8\u00d2\u00d8000, new x$_b$0((x)object));
        this.privateinterfaceObject = b$_e;
    }

    public c \u00d4\u00d5\u00d2000() {
        return this.newthisString;
    }

    @Override
    public void o00000(t object) {
        b$_e b$_e = this.privateinterfaceObject;
        if (b$_e == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        b$_e b$_e2 = b$_e;
        this.privateinterfaceObject = null;
        t t2 = object;
        object = this;
        this.\u00d3\u00d3\u00d8000 = new d(this, b$_e2.\u00f8\u00d4\u00d2000(), this.o\u00d3\u00d8000, this.\u00f8\u00d2\u00d8000, this.O\u00d3\u00d8000, t2, "scope of ".concat(String.valueOf(this)), new x$_b$1((x)object));
    }

    @Override
    public f \u00f80O000() {
        f f2 = this.\u00d3\u00d3\u00d8000;
        if (f2 == null) {
            fc.return("");
            f2 = null;
        }
        return f2;
    }

    private static final g new(x x2, b.t.c.b.b.d.d d2) {
        i i2 = x2.O\u00d3\u00d8000;
        if (i2 != null) {
            return i2;
        }
        return g.o00000;
    }

    private static final Collection new(x object) {
        b.t.c.b.b.d.d d2;
        Object object2;
        Iterator iterator = ((x)object).\u00d4\u00d5\u00d2000().o00000();
        object = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            d2 = (b.t.c.b.b.d.d)object2;
            if (!(!d2.new() && !fb.\u00d400000.o00000().contains(d2))) continue;
            object.add(object2);
        }
        object = (List)object;
        iterator = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            d2 = (b.t.c.b.b.d.d)object2;
            object2 = object;
            object2.add((b.t.c.b.b.d.f)d2.o00000());
        }
        return (List)object;
    }

    static /* synthetic */ g o00000(x x2, b.t.c.b.b.d.d d2) {
        return x.new(x2, d2);
    }

    static /* synthetic */ Collection o00000(x x2) {
        return x.new(x2);
    }
}

