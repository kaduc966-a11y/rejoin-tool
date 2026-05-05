/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.b;

import b.m;
import b.o.d.fc;
import b.o.d.w;
import b.qb;
import b.s.mc;
import b.t.c.b.b.b.b.d$_b;
import b.t.c.b.b.b.g;
import b.t.c.b.b.d.f;
import b.t.c.b.b.g.h;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.q.b.i;
import b.t.c.b.b.q.b.i$_b;
import b.t.c.b.b.q.b.t;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class d
extends t {
    public static final d$_b \u00f4o\u00d6000 = new d$_b(null);

    private d(wb wb2, d d2, hc$_b hc$_b, boolean bl) {
        super(wb2, d2, o.\u00d8o\u00f6000.o00000(), h.supersuper, hc$_b, b.t.c.b.b.q.g.o00000);
        this.OO0000(true);
        this.Stringsuper(bl);
        this.thissuper(false);
    }

    @Override
    public final ic o00000(i$_b object) {
        boolean bl;
        d d2 = (d)super.o00000((i$_b)object);
        if (d2 == null) {
            return null;
        }
        object = d2;
        Object object2 = d2.\u00f5\u00d8o000();
        if (!(object2 instanceof Collection) || !((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if (!(g.OO0000(((jc)object2.next()).forclasssuper()) != null)) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        if (bl) {
            return (ic)object;
        }
        Object object3 = object2 = (Iterable)((i)object).\u00f5\u00d8o000();
        Collection collection = new ArrayList(mc.o00000((Iterable)object2, 10));
        object2 = object3.iterator();
        while (object2.hasNext()) {
            object3 = object2.next();
            object3 = (jc)object3;
            Collection collection2 = collection;
            collection2.add(g.OO0000(object3.forclasssuper()));
        }
        object2 = (List)collection;
        return super.OO0000((List)object2);
    }

    @Override
    public final i o00000(wb wb2, ic ic2, hc$_b hc$_b, f f2, o o2, b.t.c.b.b.q.g g2) {
        return new d(wb2, (d)ic2, hc$_b, this.\u00d5\u00f5o000());
    }

    @Override
    public final boolean \u00f50O000() {
        return false;
    }

    @Override
    public final boolean \u00f8\u00f5o000() {
        return false;
    }

    @Override
    public final boolean newreturnsuper() {
        return false;
    }

    private final ic OO0000(List object) {
        boolean bl;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        boolean bl2;
        int n2 = this.\u00f5\u00d8o000().size() - object.size();
        boolean bl3 = bl2 = n2 == 0 || n2 == 1;
        if (m.new && !bl2) {
            String string = "Assertion failed";
            throw new AssertionError((Object)string);
        }
        if (n2 == 0) {
            boolean bl4;
            Object object7 = mc.\u00d300000((Iterable)object, (Iterable)this.\u00f5\u00d8o000());
            if (!(object7 instanceof Collection) || !((Collection)object7).isEmpty()) {
                object7 = object7.iterator();
                while (object7.hasNext()) {
                    object6 = (qb)object7.next();
                    object5 = (f)((qb)object6).\u00d400000();
                    if (fc.o00000(object5, (Object)(object4 = (jc)((qb)object6).\u00d300000()).\u00d5\u00f80000())) continue;
                    bl4 = false;
                    break;
                }
            } else {
                bl4 = true;
            }
            if (bl4) {
                return this;
            }
        }
        object5 = object3 = (Iterable)this.\u00f5\u00d8o000();
        object6 = new ArrayList(mc.o00000((Iterable)object3, 10));
        object5 = object5.iterator();
        while (object5.hasNext()) {
            f f2;
            object4 = object5.next();
            object3 = (jc)object4;
            object2 = object6;
            object4 = object3.\u00d5\u00f80000();
            int n3 = object3.whilenullsuper();
            int n4 = n3 - n2;
            if (n4 >= 0 && (f2 = (f)object.get(n4)) != null) {
                object4 = f2;
            }
            object2.add(object3.o00000(this, (f)object4, n3));
        }
        object3 = (List)object6;
        object5 = (Iterable)object;
        object2 = this.\u00d400000(kc.\u00d200000);
        if (!(object5 instanceof Collection) || !((Collection)object5).isEmpty()) {
            object = object5.iterator();
            while (object.hasNext()) {
                if (!((f)object.next() == null)) continue;
                bl = true;
                break;
            }
        } else {
            bl = false;
        }
        boolean bl5 = bl;
        object3 = ((i$_b)object2).new(bl5).\u00d300000((List)object3).new(this.\u00d4\u00f8o000());
        return super.o00000((i$_b)object3);
    }

    public /* synthetic */ d(wb wb2, d d2, hc$_b hc$_b, boolean bl, w w2) {
        this(wb2, d2, hc$_b, bl);
    }
}

