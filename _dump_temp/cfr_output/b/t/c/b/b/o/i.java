/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.o.e.h;
import b.qb;
import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.cb;
import b.t.c.b.b.h.e.b$_b;
import b.t.c.b.b.h.e.g$_b;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.uc;
import b.t.c.b.b.m.c;
import b.t.c.b.b.o.f;
import b.t.c.b.b.o.f$_b;
import b.t.c.b.b.o.f$_c;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.o.g;
import b.t.c.b.b.o.i$1;
import b.t.c.b.b.o.i$2;
import b.t.c.b.b.o.i$3;
import b.t.c.b.b.o.i$4;
import b.t.c.b.b.o.i$5;
import b.t.c.b.b.o.i$6;
import b.t.c.b.b.o.i$7;
import b.t.c.b.b.o.i$_b;
import b.t.c.b.b.o.i$_b$_b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.o.q;
import b.t.c.b.b.o.r;
import b.t.c.b.b.o.s;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.x;
import b.t.c.b.b.q.dc;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class i {
    private static final List \u00d200000 = mc.\u00f5O0000(ServiceLoader.load(f.class, f.class.getClassLoader()));
    public static final i o00000;
    private static final b.t.c.b.b.h.e.f$_b \u00d500000;
    private final b.t.c.b.b.h.e.b \u00f400000;
    private final b.t.c.b.b.h.e.g Object;
    private final b.t.c.b.b.h.e.f$_b \u00d400000;
    private final b.o.e.f void;

    public static i o00000(b.t.c.b.b.h.e.b b2) {
        if (b2 == null) {
            i.o00000(0);
        }
        return new i(\u00d500000, b2, g$_b.new, null);
    }

    public static i o00000(b.t.c.b.b.h.e.b b2, b.t.c.b.b.h.e.f$_b f$_b) {
        if (b2 == null) {
            i.o00000(3);
        }
        if (f$_b == null) {
            i.o00000(4);
        }
        return new i(f$_b, b2, g$_b.new, null);
    }

    private i(b.t.c.b.b.h.e.f$_b f$_b, b.t.c.b.b.h.e.b b2, b.t.c.b.b.h.e.g g2, b.o.e.f f2) {
        if (f$_b == null) {
            i.o00000(5);
        }
        if (b2 == null) {
            i.o00000(6);
        }
        if (g2 == null) {
            i.o00000(7);
        }
        this.\u00d400000 = f$_b;
        this.\u00f400000 = b2;
        this.Object = g2;
        this.void = f2;
    }

    public static Set o00000(Set set) {
        if (set == null) {
            i.o00000(8);
        }
        boolean bl = !set.isEmpty() && b.o00000(b.\u00d500000((wb)set.iterator().next()));
        return i.o00000(set, bl, null, new i$2());
    }

    public static Set o00000(Set set, boolean bl, h h2, b.o.e.f f2) {
        if (set == null) {
            i.o00000(9);
        }
        if (f2 == null) {
            i.o00000(10);
        }
        if (set.size() <= 1) {
            Set set2 = set;
            if (set2 == null) {
                i.o00000(11);
            }
            return set2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        block0: for (Object e2 : set) {
            if (h2 != null) {
                h2.newreturn();
            }
            Iterator iterator = linkedHashSet.iterator();
            while (iterator.hasNext()) {
                Object object = iterator.next();
                object = (qb)f2.o00000(e2, object);
                b.t.c.b.b.q.b b2 = (b.t.c.b.b.q.b)((qb)object).\u00d400000();
                if (i.o00000(b2, (b.t.c.b.b.q.b)(object = (b.t.c.b.b.q.b)((qb)object).\u00d300000()), bl, true)) {
                    iterator.remove();
                    continue;
                }
                if (i.o00000((b.t.c.b.b.q.b)object, b2, bl, true)) continue block0;
            }
            linkedHashSet.add(e2);
        }
        assert (!linkedHashSet.isEmpty()) : "All candidates filtered out from ".concat(String.valueOf(set));
        return linkedHashSet;
    }

    public static boolean o00000(b.t.c.b.b.q.b object, b.t.c.b.b.q.b b2, boolean bl, boolean bl2) {
        if (object == null) {
            i.o00000(13);
        }
        if (b2 == null) {
            i.o00000(14);
        }
        if (!object.equals(b2) && q.o00000.o00000((wb)object.O\u00f4o000(), (wb)b2.O\u00f4o000(), bl, bl2)) {
            return true;
        }
        b2 = b2.O\u00f4o000();
        for (b.t.c.b.b.q.b b3 : n.super((b.t.c.b.b.q.b)object)) {
            if (!q.o00000.o00000((wb)b2, (wb)b3, bl, bl2)) continue;
            return true;
        }
        return false;
    }

    public static Set o00000(hc hc2) {
        if (hc2 == null) {
            i.o00000(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i.o00000(hc2, linkedHashSet);
        return linkedHashSet;
    }

    private static void o00000(hc object, Set set) {
        if (object == null) {
            i.o00000(17);
        }
        if (set == null) {
            i.o00000(18);
        }
        if (object.O\u00f5o000().o00000()) {
            set.add(object);
            return;
        }
        if (object.\u00d5\u00f4o000().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) ".concat(String.valueOf(object)));
        }
        object = object.\u00d5\u00f4o000().iterator();
        while (object.hasNext()) {
            i.o00000((hc)object.next(), set);
        }
    }

    public i$_b o00000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, ib ib2) {
        if (b2 == null) {
            i.o00000(19);
        }
        if (b3 == null) {
            i.o00000(20);
        }
        i$_b i$_b = this.o00000(b2, b3, ib2, false);
        if (i$_b == null) {
            i.o00000(21);
        }
        return i$_b;
    }

    public i$_b o00000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, ib ib2, boolean bl) {
        f$_c f$_c;
        i$_b i$_b;
        if (b2 == null) {
            i.o00000(22);
        }
        if (b3 == null) {
            i.o00000(23);
        }
        boolean bl2 = (i$_b = this.o00000(b2, b3, bl)).\u00d200000() == i$_b$_b.\u00d400000;
        block8: for (f f2 : \u00d200000) {
            if (f2.o00000() == f$_b.\u00d200000 || bl2 && f2.o00000() == f$_b.\u00d300000) continue;
            f$_c = f2.o00000(b2, b3, ib2);
            switch (f$_c) {
                case \u00d400000: {
                    bl2 = true;
                    continue block8;
                }
                case \u00d200000: {
                    i$_b i$_b2 = i$_b.\u00d200000("External condition");
                    if (i$_b2 == null) {
                        i.o00000(24);
                    }
                    return i$_b2;
                }
            }
        }
        if (!bl2) {
            i$_b i$_b3 = i$_b;
            if (i$_b3 == null) {
                i.o00000(25);
            }
            return i$_b3;
        }
        for (f f2 : \u00d200000) {
            if (f2.o00000() != f$_b.\u00d200000) continue;
            f$_c = f2.o00000(b2, b3, ib2);
            switch (f$_c) {
                case \u00d200000: {
                    i$_b i$_b4 = i$_b.\u00d200000("External condition");
                    if (i$_b4 == null) {
                        i.o00000(26);
                    }
                    return i$_b4;
                }
                case \u00d400000: {
                    throw new IllegalStateException("Contract violation in " + f2.getClass().getName() + " condition. It's not supposed to end with success");
                }
            }
        }
        i$_b i$_b5 = i$_b.o00000();
        if (i$_b5 == null) {
            i.o00000(27);
        }
        return i$_b5;
    }

    public i$_b o00000(b.t.c.b.b.q.b i2, b.t.c.b.b.q.b b2, boolean bl) {
        int n2;
        Object object;
        if (i2 == null) {
            i.o00000(28);
        }
        if (b2 == null) {
            i.o00000(29);
        }
        if ((object = i.\u00d400000((b.t.c.b.b.q.b)i2, b2)) != null) {
            i$_b i$_b = object;
            if (i$_b == null) {
                i.o00000(30);
            }
            return i$_b;
        }
        object = i.o00000((b.t.c.b.b.q.b)i2);
        List list = i.o00000(b2);
        List list2 = i2.\u00f8\u00d8o000();
        List list3 = b2.\u00f8\u00d8o000();
        if (list2.size() != list3.size()) {
            for (int i3 = 0; i3 < object.size(); ++i3) {
                if (b.t.c.b.b.h.e.f.o00000.\u00d200000((rc)object.get(i3), (rc)list.get(i3))) continue;
                i$_b i$_b = i$_b.\u00d200000("Type parameter number mismatch");
                if (i$_b == null) {
                    i.o00000(31);
                }
                return i$_b;
            }
            i$_b i$_b = i$_b.o00000("Type parameter number mismatch");
            if (i$_b == null) {
                i.o00000(32);
            }
            return i$_b;
        }
        cb cb2 = this.o00000(list2, list3);
        for (n2 = 0; n2 < list2.size(); ++n2) {
            if (i.o00000((b.t.c.b.b.q.i)list2.get(n2), (b.t.c.b.b.q.i)list3.get(n2), cb2)) continue;
            i$_b i$_b = i$_b.\u00d200000("Type parameter bounds mismatch");
            if (i$_b == null) {
                i.o00000(33);
            }
            return i$_b;
        }
        for (n2 = 0; n2 < object.size(); ++n2) {
            if (i.o00000((rc)object.get(n2), (rc)list.get(n2), cb2)) continue;
            i$_b i$_b = i$_b.\u00d200000("Value parameter type mismatch");
            if (i$_b == null) {
                i.o00000(34);
            }
            return i$_b;
        }
        if (i2 instanceof ic && b2 instanceof ic && ((ic)i2).\u00d5\u00f5o000() != ((ic)b2).\u00d5\u00f5o000()) {
            i$_b i$_b = i$_b.o00000("Incompatible suspendability");
            if (i$_b == null) {
                i.o00000(35);
            }
            return i$_b;
        }
        if (bl) {
            rc rc2 = i2.\u00d3\u00f4o000();
            i2 = b2.\u00d3\u00f4o000();
            if (rc2 != null && i2 != null && !(hb.super((rc)i2) && hb.super(rc2)) && !uc.\u00d200000.super(cb2, (b.t.c.b.b.h.c.q)((rc)i2).\u00d8\u00d6\u00d2000(), (b.t.c.b.b.h.c.q)rc2.\u00d8\u00d6\u00d2000())) {
                i$_b i$_b = i$_b.o00000("Return type mismatch");
                if (i$_b == null) {
                    i.o00000(36);
                }
                return i$_b;
            }
        }
        i$_b i$_b = i$_b.o00000();
        if (i$_b == null) {
            i.o00000(37);
        }
        return i$_b;
    }

    public static i$_b \u00d400000(b.t.c.b.b.q.b object, b.t.c.b.b.q.b b2) {
        if (object == null) {
            i.o00000(38);
        }
        if (b2 == null) {
            i.o00000(39);
        }
        if (object instanceof ic && !(b2 instanceof ic) || object instanceof pb && !(b2 instanceof pb)) {
            return i$_b.\u00d200000("Member kind mismatch");
        }
        if (!(object instanceof ic) && !(object instanceof pb)) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: ".concat(String.valueOf(object)));
        }
        if (!object.\u00d5\u00f80000().equals(b2.\u00d5\u00f80000())) {
            return i$_b.\u00d200000("Name mismatch");
        }
        if ((object = i.\u00d300000((b.t.c.b.b.q.b)object, b2)) != null) {
            return object;
        }
        return null;
    }

    private cb o00000(List list, List list2) {
        if (list == null) {
            i.o00000(40);
        }
        if (list2 == null) {
            i.o00000(41);
        }
        assert (list.size() == list2.size()) : "Should be the same number of type parameters: " + list + " vs " + list2;
        if (list.isEmpty()) {
            cb cb2 = new g(null, this.\u00d400000, this.\u00f400000, this.Object, this.void).o00000(true, true, false);
            if (cb2 == null) {
                i.o00000(42);
            }
            return cb2;
        }
        HashMap<bc, bc> hashMap = new HashMap<bc, bc>();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            hashMap.put(((b.t.c.b.b.q.i)list.get(i2)).\u00d3OO000(), ((b.t.c.b.b.q.i)list2.get(i2)).\u00d3OO000());
        }
        cb cb3 = new g(hashMap, this.\u00d400000, this.\u00f400000, this.Object, this.void).o00000(true, true, false);
        if (cb3 == null) {
            i.o00000(43);
        }
        return cb3;
    }

    private static i$_b \u00d300000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3) {
        if (b2.nullclasssuper() == null != (b3.nullclasssuper() == null)) {
            return i$_b.\u00d200000("Receiver presence mismatch");
        }
        if (b2.\u00f5\u00d8o000().size() != b3.\u00f5\u00d8o000().size()) {
            return i$_b.\u00d200000("Value parameter number mismatch");
        }
        return null;
    }

    private static boolean o00000(rc rc2, rc rc3, cb cb2) {
        if (rc2 == null) {
            i.o00000(44);
        }
        if (rc3 == null) {
            i.o00000(45);
        }
        if (cb2 == null) {
            i.o00000(46);
        }
        if (hb.super(rc2) && hb.super(rc3)) {
            return true;
        }
        return uc.\u00d200000.\u00d200000(cb2, rc2.\u00d8\u00d6\u00d2000(), rc3.\u00d8\u00d6\u00d2000());
    }

    private static boolean o00000(b.t.c.b.b.q.i iterator, b.t.c.b.b.q.i object, cb cb2) {
        if (iterator == null) {
            i.o00000(47);
        }
        if (object == null) {
            i.o00000(48);
        }
        if (cb2 == null) {
            i.o00000(49);
        }
        iterator = iterator.\u00d8\u00d5o000();
        object = new ArrayList(object.\u00d8\u00d5o000());
        if (iterator.size() != object.size()) {
            return false;
        }
        iterator = iterator.iterator();
        block0: while (iterator.hasNext()) {
            rc rc2 = (rc)iterator.next();
            ListIterator listIterator = object.listIterator();
            while (listIterator.hasNext()) {
                rc rc3 = (rc)listIterator.next();
                if (!i.o00000(rc2, rc3, cb2)) continue;
                listIterator.remove();
                continue block0;
            }
            return false;
        }
        return true;
    }

    private static List o00000(b.t.c.b.b.q.b object) {
        b.t.c.b.b.q.n n22 = object.nullclasssuper();
        ArrayList<rc> arrayList = new ArrayList<rc>();
        if (n22 != null) {
            arrayList.add(n22.forclasssuper());
        }
        for (b.t.c.b.b.q.n n22 : object.\u00f5\u00d8o000()) {
            arrayList.add(n22.forclasssuper());
        }
        return arrayList;
    }

    public void o00000(b.t.c.b.b.d.f object, Collection collection, Collection object2, ib ib2, r r2) {
        if (object == null) {
            i.o00000(50);
        }
        if (collection == null) {
            i.o00000(51);
        }
        if (object2 == null) {
            i.o00000(52);
        }
        if (ib2 == null) {
            i.o00000(53);
        }
        if (r2 == null) {
            i.o00000(54);
        }
        object = new LinkedHashSet(collection);
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = (hc)object2.next();
            object3 = this.o00000((hc)object3, collection, ib2, r2);
            object.removeAll((Collection<?>)object3);
        }
        i.o00000(ib2, (Collection)object, r2);
    }

    public static boolean o00000(dc dc2, dc dc3, boolean bl) {
        if (dc2 == null) {
            i.o00000(55);
        }
        if (dc3 == null) {
            i.o00000(56);
        }
        return !eb.super(dc3.\u00d50O000()) && eb.super(dc3, dc2, bl);
    }

    private Collection o00000(hc hc2, Collection object, ib ib2, r r2) {
        if (hc2 == null) {
            i.o00000(57);
        }
        if (object == null) {
            i.o00000(58);
        }
        if (ib2 == null) {
            i.o00000(59);
        }
        if (r2 == null) {
            i.o00000(60);
        }
        ArrayList<hc> arrayList = new ArrayList<hc>(object.size());
        c c2 = c.Oo\u00d3000();
        object = object.iterator();
        while (object.hasNext()) {
            hc hc3 = (hc)object.next();
            i$_b$_b i$_b$_b = this.o00000((b.t.c.b.b.q.b)hc3, (b.t.c.b.b.q.b)hc2, ib2).\u00d200000();
            boolean bl = i.o00000((dc)hc2, hc3, false);
            switch (i$_b$_b) {
                case \u00d400000: {
                    if (bl) {
                        c2.add(hc3);
                    }
                    arrayList.add(hc3);
                    break;
                }
                case \u00d300000: {
                    if (bl) {
                        r2.super(hc3, hc2);
                    }
                    arrayList.add(hc3);
                }
            }
        }
        r2.super(hc2, c2);
        return arrayList;
    }

    private static boolean new(Collection collection) {
        if (collection == null) {
            i.o00000(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        wb wb2 = ((hc)collection.iterator().next()).\u00d8\u00f80000();
        return mc.\u00f8o0000(collection, new i$3(wb2));
    }

    private static void o00000(ib ib2, Collection linkedList, r r2) {
        if (ib2 == null) {
            i.o00000(62);
        }
        if (linkedList == null) {
            i.o00000(63);
        }
        if (r2 == null) {
            i.o00000(64);
        }
        if (i.new(linkedList)) {
            linkedList = linkedList.iterator();
            while (linkedList.hasNext()) {
                i.o00000(Collections.singleton((hc)linkedList.next()), ib2, r2);
            }
            return;
        }
        linkedList = new LinkedList(linkedList);
        while (!linkedList.isEmpty()) {
            i.o00000(i.o00000(s.o00000(linkedList), linkedList, r2), ib2, r2);
        }
    }

    public static boolean o00000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3) {
        if (b2 == null) {
            i.o00000(65);
        }
        if (b3 == null) {
            i.o00000(66);
        }
        rc rc2 = b2.\u00d3\u00f4o000();
        rc rc3 = b3.\u00d3\u00f4o000();
        assert (rc2 != null) : "Return type of " + b2 + " is null";
        assert (rc3 != null) : "Return type of " + b3 + " is null";
        if (!i.o00000((ub)b2, (ub)b3)) {
            return false;
        }
        cb cb2 = o00000.o00000(b2.\u00f8\u00d8o000(), b3.\u00f8\u00d8o000());
        if (b2 instanceof ic) {
            assert (b3 instanceof ic) : "b is " + b3.getClass();
            return i.o00000(b2, rc2, b3, rc3, cb2);
        }
        if (b2 instanceof pb) {
            assert (b3 instanceof pb) : "b is " + b3.getClass();
            pb pb2 = (pb)b2;
            pb pb3 = (pb)b3;
            if (!i.o00000(pb2.\u00f5\u00f8o000(), pb3.\u00f5\u00f8o000())) {
                return false;
            }
            if (pb2.\u00f4\u00f4o000() && pb3.\u00f4\u00f4o000()) {
                return uc.\u00d200000.\u00d200000(cb2, rc2.\u00d8\u00d6\u00d2000(), rc3.\u00d8\u00d6\u00d2000());
            }
            return (pb2.\u00f4\u00f4o000() || !pb3.\u00f4\u00f4o000()) && i.o00000(b2, rc2, b3, rc3, cb2);
        }
        throw new IllegalArgumentException("Unexpected callable: " + b2.getClass());
    }

    private static boolean o00000(ub object, ub ub2) {
        if (object == null) {
            i.o00000(67);
        }
        if (ub2 == null) {
            i.o00000(68);
        }
        return (object = eb.super(object.\u00d50O000(), ub2.\u00d50O000())) == null || (Integer)object >= 0;
    }

    private static boolean o00000(y y2, y y3) {
        if (y2 == null || y3 == null) {
            return true;
        }
        return i.o00000((ub)y2, (ub)y3);
    }

    private static boolean o00000(b.t.c.b.b.q.b b2, Collection object) {
        if (b2 == null) {
            i.o00000(69);
        }
        if (object == null) {
            i.o00000(70);
        }
        object = object.iterator();
        while (object.hasNext()) {
            b.t.c.b.b.q.b b3 = (b.t.c.b.b.q.b)object.next();
            if (i.o00000(b2, b3)) continue;
            return false;
        }
        return true;
    }

    private static boolean o00000(b.t.c.b.b.q.b b2, rc rc2, b.t.c.b.b.q.b b3, rc rc3, cb cb2) {
        if (b2 == null) {
            i.o00000(71);
        }
        if (rc2 == null) {
            i.o00000(72);
        }
        if (b3 == null) {
            i.o00000(73);
        }
        if (rc3 == null) {
            i.o00000(74);
        }
        if (cb2 == null) {
            i.o00000(75);
        }
        return uc.\u00d200000.super(cb2, (b.t.c.b.b.h.c.q)rc2.\u00d8\u00d6\u00d2000(), (b.t.c.b.b.h.c.q)rc3.\u00d8\u00d6\u00d2000());
    }

    public static Object o00000(Collection object, b.o.e.g g2) {
        if (object == null) {
            i.o00000(76);
        }
        if (g2 == null) {
            i.o00000(77);
        }
        assert (!object.isEmpty()) : "Should have at least one overridable descriptor";
        if (object.size() == 1) {
            Object object2 = mc.oO0000((Iterable)((Object)object));
            if (object2 == null) {
                i.o00000(78);
            }
            return object2;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(2);
        List list = mc.OO0000((Iterable)((Object)object), g2);
        Object object3 = mc.oO0000((Iterable)((Object)object));
        b.t.c.b.b.q.b b2 = (b.t.c.b.b.q.b)g2.\u00f800000(object3);
        object = object.iterator();
        while (object.hasNext()) {
            Object object4 = object.next();
            b.t.c.b.b.q.b b3 = (b.t.c.b.b.q.b)g2.\u00f800000(object4);
            if (i.o00000(b3, (Collection)list)) {
                arrayList.add(object4);
            }
            if (!i.o00000(b3, b2) || i.o00000(b2, b3)) continue;
            object3 = object4;
        }
        if (arrayList.isEmpty()) {
            Object object4 = object3;
            if (object4 == null) {
                i.o00000(79);
            }
            return object4;
        }
        if (arrayList.size() == 1) {
            Object object5 = mc.oO0000(arrayList);
            if (object5 == null) {
                i.o00000(80);
            }
            return object5;
        }
        object = null;
        for (Object e2 : arrayList) {
            if (b.t.c.b.b.h.q.\u00d400000(((b.t.c.b.b.q.b)g2.\u00f800000(e2)).\u00d3\u00f4o000())) continue;
            object = e2;
            break;
        }
        if (object != null) {
            Iterator iterator = object;
            if (iterator == null) {
                i.o00000(81);
            }
            return iterator;
        }
        Object object6 = mc.oO0000(arrayList);
        if (object6 == null) {
            i.o00000(82);
        }
        return object6;
    }

    private static void o00000(Collection collection, ib dc2, r r2) {
        Object object;
        boolean bl;
        if (collection == null) {
            i.o00000(83);
        }
        if (dc2 == null) {
            i.o00000(84);
        }
        if (r2 == null) {
            i.o00000(85);
        }
        collection = (bl = (object = i.o00000((ib)dc2, collection)).isEmpty()) ? collection : object;
        object = i.o00000(collection, (ib)dc2);
        b.t.c.b.b.q.s s2 = bl ? eb.\u00d5O0000 : eb.\u00d2O0000;
        dc2 = ((hc)i.o00000(collection, (b.o.e.g)new i$4())).o00000(dc2, (ab)((Object)object), s2, hc$_b.o00000, false);
        r2.super((hc)dc2, collection);
        assert (!dc2.\u00d5\u00f4o000().isEmpty()) : "Overridden descriptors should be set for " + (Object)((Object)hc$_b.o00000);
        r2.super((hc)dc2);
    }

    private static ab o00000(Collection object, ib ib2) {
        boolean bl;
        Object object2;
        if (object == null) {
            i.o00000(86);
        }
        if (ib2 == null) {
            i.o00000(87);
        }
        boolean bl2 = false;
        boolean bl3 = false;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object2 = (hc)iterator.next();
            switch (object2.\u00f40O000()) {
                case \u00d600000: {
                    ab ab2 = ab.\u00d600000;
                    if (ab2 == null) {
                        i.o00000(88);
                    }
                    return ab2;
                }
                case super: {
                    throw new IllegalStateException("Member cannot have SEALED modality: ".concat(String.valueOf(object2)));
                }
                case class: {
                    bl2 = true;
                    break;
                }
                case \u00d400000: {
                    bl3 = true;
                }
            }
        }
        boolean bl4 = bl = ib2.\u00d80O000() && ib2.\u00f40O000() != ab.\u00d400000 && ib2.\u00f40O000() != ab.super;
        if (bl2 && !bl3) {
            ab ab3 = ab.class;
            if (ab3 == null) {
                i.o00000(89);
            }
            return ab3;
        }
        if (!bl2 && bl3) {
            ab ab4 = bl ? ib2.\u00f40O000() : ab.\u00d400000;
            if (ab4 == null) {
                i.o00000(90);
            }
            return ab4;
        }
        object2 = new HashSet();
        object = object.iterator();
        while (object.hasNext()) {
            hc hc2 = (hc)object.next();
            object2.addAll(i.o00000(hc2));
        }
        return i.o00000((Collection)i.o00000((Set)object2), bl, ib2.\u00f40O000());
    }

    private static ab o00000(Collection object, boolean bl, ab ab2) {
        if (object == null) {
            i.o00000(91);
        }
        if (ab2 == null) {
            i.o00000(92);
        }
        Object object2 = ab.\u00d400000;
        object = object.iterator();
        while (object.hasNext()) {
            Object object3 = (hc)object.next();
            object3 = bl && object3.\u00f40O000() == ab.\u00d400000 ? ab2 : object3.\u00f40O000();
            if (((Enum)object3).compareTo(object2) >= 0) continue;
            object2 = object3;
        }
        ab ab3 = object2;
        if (ab3 == null) {
            i.o00000(93);
        }
        return ab3;
    }

    public static Collection o00000(ib ib2, Collection collection) {
        if (ib2 == null) {
            i.o00000(94);
        }
        if (collection == null) {
            i.o00000(95);
        }
        List list = mc.\u00d8\u00d20000(collection, new i$5(ib2));
        if (list == null) {
            i.o00000(96);
        }
        return list;
    }

    public static Collection o00000(Object object, Collection object2, b.o.e.g g2, b.o.e.g g3) {
        if (object == null) {
            i.o00000(97);
        }
        if (object2 == null) {
            i.o00000(98);
        }
        if (g2 == null) {
            i.o00000(99);
        }
        if (g3 == null) {
            i.o00000(100);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(object);
        b.t.c.b.b.q.b b2 = (b.t.c.b.b.q.b)g2.\u00f800000(object);
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object e2 = object2.next();
            Object object3 = (b.t.c.b.b.q.b)g2.\u00f800000(e2);
            if (object == e2) {
                object2.remove();
                continue;
            }
            if ((object3 = i.new(b2, object3)) == i$_b$_b.\u00d400000) {
                arrayList.add(e2);
                object2.remove();
                continue;
            }
            if (object3 != i$_b$_b.\u00d300000) continue;
            g3.\u00f800000(e2);
            object2.remove();
        }
        return arrayList;
    }

    public static i$_b$_b new(b.t.c.b.b.q.b object, b.t.c.b.b.q.b b2) {
        i$_b$_b i$_b$_b = o00000.o00000(b2, (b.t.c.b.b.q.b)object, null).\u00d200000();
        object = o00000.o00000((b.t.c.b.b.q.b)object, b2, null).\u00d200000();
        if (i$_b$_b == i$_b$_b.\u00d400000 && object == i$_b$_b.\u00d400000) {
            return i$_b$_b.\u00d400000;
        }
        if (i$_b$_b == i$_b$_b.\u00d300000 || object == i$_b$_b.\u00d300000) {
            return i$_b$_b.\u00d300000;
        }
        return i$_b$_b.\u00d200000;
    }

    private static Collection o00000(hc hc2, Queue queue, r r2) {
        if (hc2 == null) {
            i.o00000(102);
        }
        if (queue == null) {
            i.o00000(103);
        }
        if (r2 == null) {
            i.o00000(104);
        }
        return i.o00000((Object)hc2, queue, new i$6(), new i$7(r2, hc2));
    }

    public static void o00000(hc object, b.o.e.g g2) {
        Object object22;
        if (object == null) {
            i.o00000(105);
        }
        for (Object object22 : object.\u00d5\u00f4o000()) {
            if (object22.\u00d50O000() != eb.\u00d2O0000) continue;
            i.o00000((hc)object22, g2);
        }
        if (object.\u00d50O000() != eb.\u00d2O0000) {
            return;
        }
        b.t.c.b.b.q.s s2 = i.new((hc)object);
        if (s2 == null) {
            if (g2 != null) {
                g2.\u00f800000(object);
            }
            object22 = eb.\u00d200000;
        } else {
            object22 = s2;
        }
        if (object instanceof x) {
            ((x)object).\u00d300000((b.t.c.b.b.q.s)object22);
            object = ((pb)object).O0\u00d2000().iterator();
            while (object.hasNext()) {
                i.o00000((hc)((y)object.next()), s2 == null ? null : g2);
            }
            return;
        }
        if (object instanceof b.t.c.b.b.q.b.i) {
            ((b.t.c.b.b.q.b.i)object).new((b.t.c.b.b.q.s)object22);
            return;
        }
        assert (object instanceof b.t.c.b.b.q.b.y);
        object = (b.t.c.b.b.q.b.y)object;
        ((b.t.c.b.b.q.b.y)object).o00000((b.t.c.b.b.q.s)object22);
        if (object22 != ((b.t.c.b.b.q.b.y)object).O\u00f6o000().\u00d50O000()) {
            ((b.t.c.b.b.q.b.y)object).\u00f800000(false);
        }
    }

    private static b.t.c.b.b.q.s new(hc object) {
        Object object2;
        b.t.c.b.b.q.s s2;
        if (object == null) {
            i.o00000(106);
        }
        if ((s2 = i.o00000((Collection)(object2 = object.\u00d5\u00f4o000()))) == null) {
            return null;
        }
        if (object.O\u00f5o000() == hc$_b.o00000) {
            object = object2.iterator();
            while (object.hasNext()) {
                object2 = (hc)object.next();
                if (object2.\u00f40O000() == ab.\u00d400000 || object2.\u00d50O000().equals(s2)) continue;
                return null;
            }
            return s2;
        }
        return s2.o00000();
    }

    public static b.t.c.b.b.q.s o00000(Collection collection) {
        Object object;
        if (collection == null) {
            i.o00000(107);
        }
        if (collection.isEmpty()) {
            return eb.o00000;
        }
        Object object2 = null;
        for (Object object3 : collection) {
            object = object3.\u00d50O000();
            assert (object != eb.\u00d2O0000) : "Visibility should have been computed for ".concat(String.valueOf(object3));
            if (object2 == null) {
                object2 = object;
                continue;
            }
            object3 = eb.super((b.t.c.b.b.q.s)object, (b.t.c.b.b.q.s)object2);
            if (object3 == null) {
                object2 = null;
                continue;
            }
            if ((Integer)object3 <= 0) continue;
            object2 = object;
        }
        if (object2 == null) {
            return null;
        }
        for (Object object3 : collection) {
            object = eb.super((b.t.c.b.b.q.s)object2, object3.\u00d50O000());
            if (object != null && (Integer)object >= 0) continue;
            return null;
        }
        return object2;
    }

    static {
        \u00d500000 = new i$1();
        o00000 = new i(\u00d500000, b$_b.\u00d200000, g$_b.new, null);
    }

    private static /* synthetic */ void o00000(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 42: 
            case 43: 
            case 78: 
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 88: 
            case 89: 
            case 90: 
            case 93: 
            case 96: 
            case 101: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 42: 
            case 43: 
            case 78: 
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 88: 
            case 89: 
            case 90: 
            case 93: 
            case 96: 
            case 101: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlinTypeRefiner";
                break;
            }
            case 1: 
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlinTypePreparator";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "customSubtype";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "equalityAxioms";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "axioms";
                break;
            }
            case 8: 
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "candidateSet";
                break;
            }
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "transformFirst";
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 42: 
            case 43: 
            case 78: 
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 88: 
            case 89: 
            case 90: 
            case 93: 
            case 96: 
            case 101: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            }
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "f";
                break;
            }
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "g";
                break;
            }
            case 15: 
            case 17: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptor";
                break;
            }
            case 18: {
                objectArray2 = objectArray3;
                objectArray3[0] = "result";
                break;
            }
            case 19: 
            case 22: 
            case 28: 
            case 38: {
                objectArray2 = objectArray3;
                objectArray3[0] = "superDescriptor";
                break;
            }
            case 20: 
            case 23: 
            case 29: 
            case 39: {
                objectArray2 = objectArray3;
                objectArray3[0] = "subDescriptor";
                break;
            }
            case 40: {
                objectArray2 = objectArray3;
                objectArray3[0] = "firstParameters";
                break;
            }
            case 41: {
                objectArray2 = objectArray3;
                objectArray3[0] = "secondParameters";
                break;
            }
            case 44: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeInSuper";
                break;
            }
            case 45: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeInSub";
                break;
            }
            case 46: 
            case 49: 
            case 75: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeCheckerState";
                break;
            }
            case 47: {
                objectArray2 = objectArray3;
                objectArray3[0] = "superTypeParameter";
                break;
            }
            case 48: {
                objectArray2 = objectArray3;
                objectArray3[0] = "subTypeParameter";
                break;
            }
            case 50: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 51: {
                objectArray2 = objectArray3;
                objectArray3[0] = "membersFromSupertypes";
                break;
            }
            case 52: {
                objectArray2 = objectArray3;
                objectArray3[0] = "membersFromCurrent";
                break;
            }
            case 53: 
            case 59: 
            case 62: 
            case 84: 
            case 87: 
            case 94: {
                objectArray2 = objectArray3;
                objectArray3[0] = "current";
                break;
            }
            case 54: 
            case 60: 
            case 64: 
            case 85: 
            case 104: {
                objectArray2 = objectArray3;
                objectArray3[0] = "strategy";
                break;
            }
            case 55: {
                objectArray2 = objectArray3;
                objectArray3[0] = "overriding";
                break;
            }
            case 56: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fromSuper";
                break;
            }
            case 57: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fromCurrent";
                break;
            }
            case 58: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptorsFromSuper";
                break;
            }
            case 61: 
            case 63: {
                objectArray2 = objectArray3;
                objectArray3[0] = "notOverridden";
                break;
            }
            case 65: 
            case 67: 
            case 71: {
                objectArray2 = objectArray3;
                objectArray3[0] = "a";
                break;
            }
            case 66: 
            case 68: 
            case 73: {
                objectArray2 = objectArray3;
                objectArray3[0] = "b";
                break;
            }
            case 69: {
                objectArray2 = objectArray3;
                objectArray3[0] = "candidate";
                break;
            }
            case 70: 
            case 86: 
            case 91: 
            case 107: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptors";
                break;
            }
            case 72: {
                objectArray2 = objectArray3;
                objectArray3[0] = "aReturnType";
                break;
            }
            case 74: {
                objectArray2 = objectArray3;
                objectArray3[0] = "bReturnType";
                break;
            }
            case 76: 
            case 83: {
                objectArray2 = objectArray3;
                objectArray3[0] = "overridables";
                break;
            }
            case 77: 
            case 99: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptorByHandle";
                break;
            }
            case 92: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classModality";
                break;
            }
            case 95: {
                objectArray2 = objectArray3;
                objectArray3[0] = "toFilter";
                break;
            }
            case 97: 
            case 102: {
                objectArray2 = objectArray3;
                objectArray3[0] = "overrider";
                break;
            }
            case 98: 
            case 103: {
                objectArray2 = objectArray3;
                objectArray3[0] = "extractFrom";
                break;
            }
            case 100: {
                objectArray2 = objectArray3;
                objectArray3[0] = "onConflict";
                break;
            }
            case 105: 
            case 106: {
                objectArray2 = objectArray3;
                objectArray3[0] = "memberDescriptor";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            }
            case 11: 
            case 12: {
                objectArray = objectArray2;
                objectArray2[1] = "filterOverrides";
                break;
            }
            case 16: {
                objectArray = objectArray2;
                objectArray2[1] = "getOverriddenDeclarations";
                break;
            }
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: {
                objectArray = objectArray2;
                objectArray2[1] = "isOverridableBy";
                break;
            }
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: {
                objectArray = objectArray2;
                objectArray2[1] = "isOverridableByWithoutExternalConditions";
                break;
            }
            case 42: 
            case 43: {
                objectArray = objectArray2;
                objectArray2[1] = "createTypeCheckerState";
                break;
            }
            case 78: 
            case 79: 
            case 80: 
            case 81: 
            case 82: {
                objectArray = objectArray2;
                objectArray2[1] = "selectMostSpecificMember";
                break;
            }
            case 88: 
            case 89: 
            case 90: {
                objectArray = objectArray2;
                objectArray2[1] = "determineModalityForFakeOverride";
                break;
            }
            case 93: {
                objectArray = objectArray2;
                objectArray2[1] = "getMinimalModality";
                break;
            }
            case 96: {
                objectArray = objectArray2;
                objectArray2[1] = "filterVisibleFakeOverrides";
                break;
            }
            case 101: {
                objectArray = objectArray2;
                objectArray2[1] = "extractMembersOverridableInBothWays";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "createWithTypeRefiner";
                break;
            }
            case 1: 
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            }
            case 3: 
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "create";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "filterOutOverridden";
                break;
            }
            case 9: 
            case 10: {
                objectArray = objectArray;
                objectArray[2] = "filterOverrides";
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 42: 
            case 43: 
            case 78: 
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 88: 
            case 89: 
            case 90: 
            case 93: 
            case 96: 
            case 101: {
                break;
            }
            case 13: 
            case 14: {
                objectArray = objectArray;
                objectArray[2] = "overrides";
                break;
            }
            case 15: {
                objectArray = objectArray;
                objectArray[2] = "getOverriddenDeclarations";
                break;
            }
            case 17: 
            case 18: {
                objectArray = objectArray;
                objectArray[2] = "collectOverriddenDeclarations";
                break;
            }
            case 19: 
            case 20: 
            case 22: 
            case 23: {
                objectArray = objectArray;
                objectArray[2] = "isOverridableBy";
                break;
            }
            case 28: 
            case 29: {
                objectArray = objectArray;
                objectArray[2] = "isOverridableByWithoutExternalConditions";
                break;
            }
            case 38: 
            case 39: {
                objectArray = objectArray;
                objectArray[2] = "getBasicOverridabilityProblem";
                break;
            }
            case 40: 
            case 41: {
                objectArray = objectArray;
                objectArray[2] = "createTypeCheckerState";
                break;
            }
            case 44: 
            case 45: 
            case 46: {
                objectArray = objectArray;
                objectArray[2] = "areTypesEquivalent";
                break;
            }
            case 47: 
            case 48: 
            case 49: {
                objectArray = objectArray;
                objectArray[2] = "areTypeParametersEquivalent";
                break;
            }
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: {
                objectArray = objectArray;
                objectArray[2] = "generateOverridesInFunctionGroup";
                break;
            }
            case 55: 
            case 56: {
                objectArray = objectArray;
                objectArray[2] = "isVisibleForOverride";
                break;
            }
            case 57: 
            case 58: 
            case 59: 
            case 60: {
                objectArray = objectArray;
                objectArray[2] = "extractAndBindOverridesForMember";
                break;
            }
            case 61: {
                objectArray = objectArray;
                objectArray[2] = "allHasSameContainingDeclaration";
                break;
            }
            case 62: 
            case 63: 
            case 64: {
                objectArray = objectArray;
                objectArray[2] = "createAndBindFakeOverrides";
                break;
            }
            case 65: 
            case 66: {
                objectArray = objectArray;
                objectArray[2] = "isMoreSpecific";
                break;
            }
            case 67: 
            case 68: {
                objectArray = objectArray;
                objectArray[2] = "isVisibilityMoreSpecific";
                break;
            }
            case 69: 
            case 70: {
                objectArray = objectArray;
                objectArray[2] = "isMoreSpecificThenAllOf";
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                objectArray = objectArray;
                objectArray[2] = "isReturnTypeMoreSpecific";
                break;
            }
            case 76: 
            case 77: {
                objectArray = objectArray;
                objectArray[2] = "selectMostSpecificMember";
                break;
            }
            case 83: 
            case 84: 
            case 85: {
                objectArray = objectArray;
                objectArray[2] = "createAndBindFakeOverride";
                break;
            }
            case 86: 
            case 87: {
                objectArray = objectArray;
                objectArray[2] = "determineModalityForFakeOverride";
                break;
            }
            case 91: 
            case 92: {
                objectArray = objectArray;
                objectArray[2] = "getMinimalModality";
                break;
            }
            case 94: 
            case 95: {
                objectArray = objectArray;
                objectArray[2] = "filterVisibleFakeOverrides";
                break;
            }
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 102: 
            case 103: 
            case 104: {
                objectArray = objectArray;
                objectArray[2] = "extractMembersOverridableInBothWays";
                break;
            }
            case 105: {
                objectArray = objectArray;
                objectArray[2] = "resolveUnknownVisibilityForMember";
                break;
            }
            case 106: {
                objectArray = objectArray;
                objectArray[2] = "computeVisibilityToInherit";
                break;
            }
            case 107: {
                objectArray = objectArray;
                objectArray[2] = "findMaxVisibility";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 30: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 42: 
            case 43: 
            case 78: 
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 88: 
            case 89: 
            case 90: 
            case 93: 
            case 96: 
            case 101: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

