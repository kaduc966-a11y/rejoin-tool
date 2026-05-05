/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.i;
import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.cc;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.xb$_b$0;
import b.t.c.b.b.h.xb$_b$1;
import b.t.c.b.b.h.xb$_b$2;
import b.t.c.b.b.h.xb$_b$3;
import b.t.c.b.b.h.xb$_b$4;
import b.t.c.b.b.h.xb$_b$5;
import b.t.c.b.b.h.xb$_b$6;
import b.t.c.b.b.h.xb$_c;
import b.t.c.b.b.h.xb$_d;
import b.t.c.b.b.i.f;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.r;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class xb
extends cc {
    private final f o\u00f4o000;
    private final boolean nullclasssuper;

    public xb(l object) {
        l l2 = object;
        object = this;
        xb$_b$0 xb$_b$0 = new xb$_b$0((xb)object);
        object = this;
        this.o\u00f4o000 = l2.o00000(xb$_b$0, xb$_b$1.returnnullnew, new xb$_b$2((xb)object));
    }

    public List \u00d3oO000() {
        return ((xb$_c)this.o\u00f4o000.newreturn()).\u00d200000();
    }

    @Override
    public bc o00000(b b2) {
        return new xb$_d(this, b2);
    }

    private final Collection o00000(bc bc2, boolean bl) {
        Object object = bc2 instanceof xb ? (xb)bc2 : null;
        if (object != null) {
            xb xb2 = object;
            object = mc.return(((xb$_c)((xb)object).o\u00f4o000.newreturn()).o00000(), (Iterable)xb2.\u00d800000(bl));
            if (object != null) {
                return (Collection)object;
            }
        }
        return bc2.\u00d5OO000();
    }

    protected abstract Collection newif();

    protected abstract r returnif();

    protected void o00000(rc rc2) {
    }

    protected List o00000(List list) {
        return list;
    }

    protected void new(rc rc2) {
    }

    protected boolean \u00d5oO000() {
        return this.nullclasssuper;
    }

    protected Collection \u00d800000(boolean bl) {
        return mc.\u00d500000();
    }

    protected rc \u00d4oO000() {
        return null;
    }

    private static final Iterable \u00d400000(xb xb2, bc bc2) {
        return xb2.o00000(bc2, false);
    }

    private static final i \u00d300000(xb xb2, rc rc2) {
        xb2.o00000(rc2);
        return i.o00000;
    }

    private static final Iterable o00000(xb xb2, bc bc2) {
        return xb2.o00000(bc2, true);
    }

    private static final i o00000(xb xb2, rc rc2) {
        xb2.new(rc2);
        return i.o00000;
    }

    private static final xb$_c o00000(xb xb2) {
        return new xb$_c(xb2.newif());
    }

    private static final xb$_c return(boolean bl) {
        return new xb$_c(mc.o00000(k.\u00d400000.o00000()));
    }

    private static final i new(xb object, xb$_c xb$_c) {
        Object object2 = object;
        xb$_b$3 xb$_b$3 = new xb$_b$3((xb)object2);
        object2 = object;
        Collection collection = ((xb)object).returnif().o00000((bc)object, xb$_c.o00000(), xb$_b$3, new xb$_b$4((xb)object2));
        if (collection.isEmpty()) {
            rc rc2 = ((xb)object).\u00d4oO000();
            List list = rc2 != null ? mc.o00000(rc2) : null;
            if (list == null) {
                list = mc.\u00d500000();
            }
            collection = list;
        }
        if (((xb)object).\u00d5oO000()) {
            object2 = object;
            xb$_b$5 xb$_b$5 = new xb$_b$5((xb)object2);
            object2 = object;
            ((xb)object).returnif().o00000((bc)object, collection, xb$_b$5, new xb$_b$6((xb)object2));
        }
        xb xb2 = object;
        object = collection;
        List list = object instanceof List ? (List)object : null;
        if (list == null) {
            list = mc.\u00f5O0000(collection);
        }
        xb$_c.o00000(xb2.o00000(list));
        return i.o00000;
    }

    static /* synthetic */ xb$_c new(xb xb2) {
        return xb.o00000(xb2);
    }

    static /* synthetic */ xb$_c \u00f400000(boolean bl) {
        return xb.return(bl);
    }

    static /* synthetic */ i o00000(xb xb2, xb$_c xb$_c) {
        return xb.new(xb2, xb$_c);
    }

    static /* synthetic */ Iterable \u00d300000(xb xb2, bc bc2) {
        return xb.\u00d400000(xb2, bc2);
    }

    static /* synthetic */ i \u00d400000(xb xb2, rc rc2) {
        return xb.\u00d300000(xb2, rc2);
    }

    static /* synthetic */ Iterable new(xb xb2, bc bc2) {
        return xb.o00000(xb2, bc2);
    }

    static /* synthetic */ i new(xb xb2, rc rc2) {
        return xb.o00000(xb2, rc2);
    }
}

