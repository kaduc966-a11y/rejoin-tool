/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.m;
import b.o.e.f;
import b.s.mc;
import b.t.c.b.b.h.e.h$_b$0;
import b.t.c.b.b.h.e.h$_c;
import b.t.c.b.b.h.e.h$_d$_b$1;
import b.t.c.b.b.h.e.h$_d$_c$1;
import b.t.c.b.b.h.e.j;
import b.t.c.b.b.h.e.k;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.pc;
import b.t.c.b.b.h.q;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.c.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h {
    public static final h o00000 = new h();

    private h() {
    }

    public final ib super(List object) {
        Object object2;
        rc rc2;
        Object object3;
        Object object4;
        Object object5;
        Iterator iterator;
        Object object6;
        boolean bl;
        boolean bl2 = bl = object.size() > 1;
        if (m.new && !bl) {
            String string = "Size should be at least 2, but it is " + object.size();
            throw new AssertionError((Object)string);
        }
        Iterable<Object> iterable = new ArrayList<Object>();
        Object object7 = object.iterator();
        while (object7.hasNext()) {
            object6 = (ib)object7.next();
            if (((rc)object6).thisdosuper() instanceof pc) {
                iterator = ((rc)object6).thisdosuper().\u00d5OO000();
                object5 = iterable;
                object4 = iterator;
                iterator = new ArrayList(mc.o00000((Iterable)((Object)iterator), 10));
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    object3 = object4.next();
                    rc2 = (rc)object3;
                    object3 = iterator;
                    object2 = q.o00000(rc2);
                    object3.add(((rc)object6).\u00f5\u00d6\u00d2000() ? ((ib)object2).\u00d4o0000(true) : object2);
                }
                ((ArrayList)object5).addAll((List)((Object)iterator));
                continue;
            }
            iterable.add(object6);
        }
        object6 = iterable;
        object4 = h$_c.return;
        iterator = object6.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object4 = ((h$_c)((Object)object4)).o00000((l)object2);
        }
        object7 = object4;
        iterator = iterable;
        iterable = new LinkedHashSet();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object4 = (ib)object2;
            object5 = iterable;
            object5.add(object7 == h$_c.\u00d400000 ? s.o00000((ib)(object4 instanceof j ? (ib)s.o00000((j)object4) : object4), false, 1, null) : object4);
        }
        object6 = (LinkedHashSet)iterable;
        iterable = (Iterable)object;
        iterator = iterable;
        object2 = new ArrayList(mc.o00000(iterable, 10));
        object3 = iterator.iterator();
        while (object3.hasNext()) {
            rc2 = object3.next();
            object = (ib)rc2;
            object5 = object2;
            object5.add(((rc)object).\u00d5\u00d6\u00d2000());
        }
        iterator = ((Iterable)((List)object2)).iterator();
        if (!iterator.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        object2 = iterator.next();
        while (iterator.hasNext()) {
            object4 = (zb)iterator.next();
            object2 = ((zb)object2).\u00d800000((zb)object4);
        }
        iterator = (zb)object2;
        return this.super((Set)object6).new((zb)((Object)iterator));
    }

    private final ib super(Set object) {
        boolean bl;
        boolean bl2;
        if (object.size() == 1) {
            return (ib)mc.thisObject((Iterable)object);
        }
        Object object2 = object;
        object2 = new h$_b$0((Set)object2);
        Object object3 = this.super((Collection)object, new h$_d$_b$1(this));
        boolean bl3 = bl2 = !object3.isEmpty();
        if (m.new && !bl2) {
            object3 = object2.newreturn();
            throw new AssertionError(object3);
        }
        Object object4 = r.O\u00f6o000.o00000((Collection)object3);
        if (object4 != null) {
            return object4;
        }
        object4 = this.super((Collection)object3, new h$_d$_c$1(b.t.c.b.b.h.e.q.\u00d200000.o00000()));
        boolean bl4 = bl = !object4.isEmpty();
        if (m.new && !bl) {
            object = object2.newreturn();
            throw new AssertionError(object);
        }
        if (object4.size() < 2) {
            return (ib)mc.thisObject((Iterable)object4);
        }
        return new pc((Collection)object).whileif();
    }

    private final Collection super(Collection arrayList, f f2) {
        arrayList = new ArrayList(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            boolean bl;
            ib ib2 = (ib)iterator.next();
            Object object = arrayList;
            if (!((Collection)object).isEmpty()) {
                object = object.iterator();
                while (object.hasNext()) {
                    ib ib3 = (ib)object.next();
                    if (!(ib3 != ib2 && (Boolean)f2.o00000(ib3, ib2) != false)) continue;
                    bl = true;
                    break;
                }
            } else {
                bl = false;
            }
            if (!bl) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private final boolean super(rc rc2, rc rc3) {
        k k2 = b.t.c.b.b.h.e.q.\u00d200000.o00000();
        return k2.o00000(rc2, rc3) && !k2.o00000(rc3, rc2);
    }

    private static final String \u00d200000(Set set) {
        return "This collections cannot be empty! input types: " + mc.o00000(set, null, null, null, 0, null, null, 63, null);
    }

    public static final /* synthetic */ boolean super(h h2, rc rc2, rc rc3) {
        return h2.super(rc2, rc3);
    }

    static /* synthetic */ String \u00d300000(Set set) {
        return h.\u00d200000(set);
    }
}

