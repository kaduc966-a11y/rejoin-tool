/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.dc;
import b.lb;
import b.m;
import b.o.d.fc;
import b.o.d.w;
import b.o.e.h;
import b.r;
import b.s.mc;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.e.d$_b$0;
import b.t.c.b.b.h.e.d$_b$1;
import b.t.c.b.b.h.e.d$_b$2;
import b.t.c.b.b.h.e.d$_b$3;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.o.d.b.c;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.kb;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
implements c {
    private final hc whilereturnsuper;
    private h \u00d3\u00f6o000;
    private final d \u00d4\u00f6o000;
    private final i thisvoidsuper;
    private final dc \u00d5\u00f6o000;

    public d(hc object, h h2, d d2, i i2) {
        this.whilereturnsuper = object;
        this.\u00d3\u00f6o000 = h2;
        this.\u00d4\u00f6o000 = d2;
        this.thisvoidsuper = i2;
        object = this;
        this.\u00d5\u00f6o000 = r.o00000(lb.\u00d400000, (h)new d$_b$0((d)object));
    }

    public /* synthetic */ d(hc hc2, h h2, d d2, i i2, int n2, w w2) {
        if ((n2 & 2) != 0) {
            h2 = null;
        }
        if ((n2 & 4) != 0) {
            d2 = null;
        }
        if ((n2 & 8) != 0) {
            i2 = null;
        }
        this(hc2, h2, d2, i2);
    }

    @Override
    public final hc \u00f5\u00d2O000() {
        return this.whilereturnsuper;
    }

    public d(hc object, List list, d d2) {
        hc hc2 = object;
        object = list;
        this(hc2, new d$_b$1((List)object), d2, null, 8, null);
    }

    public /* synthetic */ d(hc hc2, List list, d d2, int n2, w w2) {
        if ((n2 & 4) != 0) {
            d2 = null;
        }
        this(hc2, list, d2);
    }

    private final List \u00f8\u00d2O000() {
        return (List)this.\u00d5\u00f6o000.\u00d200000();
    }

    public final void return(List object) {
        boolean bl;
        boolean bl2 = bl = this.\u00d3\u00f6o000 == null;
        if (m.new && !bl) {
            object = "Already initialized! oldValue = " + this.\u00d3\u00f6o000 + ", newValue = " + object;
            throw new AssertionError(object);
        }
        this.\u00d3\u00f6o000 = new d$_b$2((List)object);
    }

    public final List Stringfloat() {
        List list = this.\u00f8\u00d2O000();
        if (list == null) {
            list = mc.\u00d500000();
        }
        return list;
    }

    @Override
    public final List \u00f5OO000() {
        return mc.\u00d500000();
    }

    @Override
    public final boolean \u00d8OO000() {
        return false;
    }

    @Override
    public final kb \u00f4OO000() {
        return null;
    }

    @Override
    public final b.t.c.b.b.b.c forint() {
        return b.t.c.b.b.h.b.b.\u00d400000(this.\u00f5\u00d2O000().\u00d300000());
    }

    public final d \u00d300000(b object) {
        d d2;
        d$_b$3 d$_b$3;
        Object object2;
        Object object3;
        hc hc2 = this.\u00f5\u00d2O000().super((b)object);
        if (this.\u00d3\u00f6o000 != null) {
            object3 = hc2;
            object2 = this;
            d$_b$3 = new d$_b$3((d)object2, (b)object);
            hc2 = object3;
        } else {
            d$_b$3 = null;
        }
        if ((d2 = this.\u00d4\u00f6o000) == null) {
            d2 = this;
        }
        object = this.thisvoidsuper;
        object3 = d2;
        object2 = d$_b$3;
        hc hc3 = hc2;
        return new d(hc3, (h)object2, (d)object3, (i)object);
    }

    public final boolean equals(Object object) {
        Object object2;
        if (this == object) {
            return true;
        }
        Object object3 = object;
        if (!fc.o00000(this.getClass(), object3 != null ? object3.getClass() : null)) {
            return false;
        }
        d cfr_ignored_0 = (d)object;
        d d2 = this.\u00d4\u00f6o000;
        if (d2 == null) {
            d2 = this;
        }
        if ((object2 = ((d)object).\u00d4\u00f6o000) == null) {
            object2 = object;
        }
        return d2 == object2;
    }

    public final int hashCode() {
        while (this.\u00d4\u00f6o000 != null) {
        }
        return super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.\u00f5\u00d2O000() + ')';
    }

    private static final List \u00d300000(List list) {
        return list;
    }

    private static final List new(d d2) {
        h h2 = d2.\u00d3\u00f6o000;
        if (h2 != null) {
            return (List)h2.newreturn();
        }
        return null;
    }

    private static final List new(List list) {
        return list;
    }

    private static final List o00000(d object, b b2) {
        Object object2 = object = (Iterable)((d)object).Stringfloat();
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (l)object3;
            Object object4 = object;
            object4.add(((l)object3).while(b2));
        }
        return (List)object;
    }

    static /* synthetic */ List o00000(d d2) {
        return d.new(d2);
    }

    static /* synthetic */ List \u00d500000(List list) {
        return d.\u00d300000(list);
    }

    static /* synthetic */ List \u00d400000(List list) {
        return d.new(list);
    }

    static /* synthetic */ List new(d d2, b b2) {
        return d.o00000(d2, b2);
    }
}

