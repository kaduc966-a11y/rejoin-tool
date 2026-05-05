/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.ac;
import b.g.ab;
import b.g.c;
import b.g.d;
import b.g.f;
import b.g.h;
import b.g.i;
import b.g.j;
import b.g.k;
import b.g.m;
import b.g.n;
import b.g.p$_b$1;
import b.g.p$_c$1;
import b.g.p$_c$2;
import b.g.p$_d$1;
import b.g.p$_e$1;
import b.g.p$_e$2;
import b.g.p$_e$3;
import b.g.p$_e$4;
import b.g.p$_f$2;
import b.g.p$_g$_b$_b$1;
import b.g.p$_h$1;
import b.g.p$_i$1;
import b.g.p$_j$1;
import b.g.p$_k$1;
import b.g.p$_l$1;
import b.g.p$_m$1;
import b.g.p$_m$2;
import b.g.p$_n$1;
import b.g.r;
import b.g.w;
import b.g.x;
import b.g.y;
import b.g.z;
import b.o.d.fc;
import b.o.e.g;
import b.qb;
import b.s.e;
import b.s.l;
import b.s.mc;
import b.s.ub;
import b.y.b$_c$2;
import b.y.b$_d$1;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class p
extends i {
    public static final boolean String(n n2, Object object) {
        return c.\u00d600000(n2, object) >= 0;
    }

    public static final Object o00000(n n2, int n3) {
        int n4 = n3;
        return c.\u00d200000(n2, n4, arg_0 -> p.o00000(n4, arg_0));
    }

    public static final Object \u00d200000(n object, int n2, g g2) {
        if (n2 < 0) {
            return g2.\u00f800000(n2);
        }
        object = object.o00000();
        int n3 = 0;
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n2 != n3++) continue;
            return e2;
        }
        return g2.\u00f800000(n2);
    }

    public static final Object \u00d300000(n object, int n2) {
        if (n2 < 0) {
            return null;
        }
        object = object.o00000();
        int n3 = 0;
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n2 != n3++) continue;
            return e2;
        }
        return null;
    }

    private static final Object thisnew(n object, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        return null;
    }

    private static final Object \u00f800000(n object, g g2) {
        Object var2_2 = null;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            var2_2 = e2;
        }
        return var2_2;
    }

    public static final Object newObject(n object) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        return object.next();
    }

    public static final Object \u00d600000(n object, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private static final Object \u00d3O0000(n object, g g2) {
        Object object2;
        block3: {
            object = object.o00000();
            while (object.hasNext()) {
                object2 = g2.\u00f800000(object.next());
                if (object2 == null) {
                    continue;
                }
                break block3;
            }
            object2 = null;
        }
        if (object2 == null) {
            throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
        }
        return object2;
    }

    private static final Object Stringnew(n object, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = object.next();
            if ((object2 = g2.\u00f800000(object2)) == null) continue;
            return object2;
        }
        return null;
    }

    public static final Object \u00d6\u00d30000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        return object.next();
    }

    public static final Object \u00d3\u00d40000(n object, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return e2;
        }
        return null;
    }

    public static final int \u00d600000(n object, Object object2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n2 < 0) {
                mc.\u00d800000();
            }
            if (fc.o00000(object2, e2)) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static final int null(n object, g g2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n2 < 0) {
                mc.\u00d800000();
            }
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static final int \u00d2o0000(n object, g g2) {
        int n2 = -1;
        int n3 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 < 0) {
                mc.\u00d800000();
            }
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) {
                n2 = n3;
            }
            ++n3;
        }
        return n2;
    }

    public static final Object returnObject(n object) {
        Object e2;
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        do {
            e2 = object.next();
        } while (object.hasNext());
        return e2;
    }

    public static final Object \u00d3o0000(n object, g g2) {
        Object var2_2 = null;
        boolean bl = false;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            var2_2 = e2;
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        return var2_2;
    }

    public static final int o00000(n object, Object object2) {
        int n2 = -1;
        int n3 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 < 0) {
                mc.\u00d800000();
            }
            if (fc.o00000(object2, e2)) {
                n2 = n3;
            }
            ++n3;
        }
        return n2;
    }

    public static final Object \u00d3\u00d30000(n object) {
        Object e2;
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        do {
            e2 = object.next();
        } while (object.hasNext());
        return e2;
    }

    public static final Object for(n object, g g2) {
        Object var2_2 = null;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            var2_2 = e2;
        }
        return var2_2;
    }

    public static final Object o\u00d40000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object e2 = object.next();
        if (object.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return e2;
    }

    public static final Object \u00d8O0000(n object, g g2) {
        Object var2_2 = null;
        boolean bl = false;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            if (bl) {
                throw new IllegalArgumentException("Sequence contains more than one matching element.");
            }
            var2_2 = e2;
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        return var2_2;
    }

    public static final Object \u00d8\u00d20000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        if (object.hasNext()) {
            return null;
        }
        return e2;
    }

    public static final Object newObject(n object, g g2) {
        Object var2_2 = null;
        boolean bl = false;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            if (bl) {
                return null;
            }
            var2_2 = e2;
            bl = true;
        }
        if (!bl) {
            return null;
        }
        return var2_2;
    }

    public static final n String(n object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        if (n2 == 0) {
            return object;
        }
        if (object instanceof y) {
            return ((y)object).o00000(n2);
        }
        return new ab((n)object, n2);
    }

    public static final n \u00f600000(n n2, g g2) {
        return new x(n2, g2);
    }

    public static final n nullnew(n n2, g g2) {
        return new f(n2, true, g2);
    }

    public static final n \u00d600000(n n2, b.o.e.f f2) {
        return new j(new f(new z(n2), true, arg_0 -> p.o00000(f2, arg_0)), p::o00000);
    }

    public static final Collection \u00d300000(n object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            if (!((Boolean)f2.o00000(n3, e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final /* synthetic */ n \u00d6\u00d20000(n n2) {
        fc.\u00d300000();
        return c.nullnew(n2, p$_h$1.\u00d8\u00f5\u00d3000);
    }

    public static final /* synthetic */ Collection \u00d300000(n object, Collection collection) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            fc.o00000(3, "R");
            if (!(e2 instanceof Object)) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final n \u00d5o0000(n n2, g g2) {
        return new f(n2, false, g2);
    }

    public static final n \u00f5\u00d30000(n n2) {
        return c.\u00d5o0000(n2, p::String);
    }

    public static final Collection \u00d200000(n object, Collection collection) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (e2 == null) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final Collection \u00d500000(n object, Collection collection, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final Collection String(n object, Collection collection, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            collection.add(e2);
        }
        return collection;
    }

    public static final n \u00d200000(n object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        if (n2 == 0) {
            return c.\u00d200000();
        }
        if (object instanceof y) {
            return ((y)object).\u00d200000(n2);
        }
        return new d((n)object, n2);
    }

    public static final n newsuper(n n2, g g2) {
        return new w(n2, g2);
    }

    public static final n o\u00d30000(n n2) {
        return new p$_i$1(n2);
    }

    public static final n \u00d8\u00d20000(n n2, g g2) {
        return c.null(n2, new b$_c$2(g2));
    }

    public static final n \u00d2\u00d30000(n n2, g g2) {
        return c.null(n2, new b$_d$1(g2));
    }

    public static final n \u00f6\u00d30000(n n2) {
        return c.null(n2, b.y.f.super());
    }

    public static final n null(n n2, Comparator comparator) {
        return new p$_b$1(n2, comparator);
    }

    public static final Map \u00d3\u00d30000(n object, g g2) {
        Map map = new LinkedHashMap();
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = object.next();
            Map map2 = map;
            object2 = (qb)g2.\u00f800000(object2);
            map2.put(((qb)object2).new(), ((qb)object2).o00000());
        }
        return map;
    }

    public static final Map \u00d6\u00d30000(n object, g g2) {
        Map map = new LinkedHashMap();
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(g2.\u00f800000(e2), e2);
        }
        return map;
    }

    public static final Map o00000(n object, g g2, g g3) {
        Map map = new LinkedHashMap();
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(g2.\u00f800000(e2), g3.\u00f800000(e2));
        }
        return map;
    }

    public static final Map o00000(n object, Map map, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(g2.\u00f800000(e2), e2);
        }
        return map;
    }

    public static final Map \u00d200000(n object, Map map, g g2, g g3) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(g2.\u00f800000(e2), g3.\u00f800000(e2));
        }
        return map;
    }

    public static final Map \u00d300000(n object, Map map, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = object.next();
            Map map2 = map;
            object2 = (qb)g2.\u00f800000(object2);
            map2.put(((qb)object2).new(), ((qb)object2).o00000());
        }
        return map;
    }

    public static final Map returnsuper(n object, g g2) {
        Map map = new LinkedHashMap();
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(e2, g2.\u00f800000(e2));
        }
        return map;
    }

    public static final Map \u00d200000(n object, Map map, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            map.put(e2, g2.\u00f800000(e2));
        }
        return map;
    }

    public static final Collection o00000(n object, Collection collection) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            collection.add(e2);
        }
        return collection;
    }

    public static final HashSet Stringnew(n n2) {
        return (HashSet)c.o00000(n2, new HashSet());
    }

    public static final List \u00d6o0000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return mc.\u00d500000();
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return mc.o00000(e2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(e2);
        while (object.hasNext()) {
            arrayList.add(object.next());
        }
        return arrayList;
    }

    public static final List whilesuper(n n2) {
        return (List)c.o00000(n2, new ArrayList());
    }

    public static final Set \u00f8O0000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return ub.\u00d300000();
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return ub.super(e2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(e2);
        while (object.hasNext()) {
            linkedHashSet.add(object.next());
        }
        return linkedHashSet;
    }

    public static final n \u00d6\u00d20000(n n2, g g2) {
        return new h(n2, g2, p$_m$1.\u00d5O\u00d2000);
    }

    public static final n \u00d5\u00d30000(n n2, g g2) {
        return new h(n2, g2, p$_m$2.\u00d4O\u00d2000);
    }

    public static final n String(n n2, b.o.e.f f2) {
        return c.o00000(n2, f2, p$_c$1.\u00d3O\u00d2000);
    }

    public static final n o00000(n n2, b.o.e.f f2) {
        return c.o00000(n2, f2, p$_c$2.forclassnew);
    }

    private static final Collection String(n object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3;
            Object object2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = (Iterable)f2.o00000(n3, object2);
            mc.new(collection, object2);
        }
        return collection;
    }

    private static final Collection o00000(n object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3;
            Object object2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = (n)f2.o00000(n3, object2);
            mc.o00000(collection, object2);
        }
        return collection;
    }

    public static final Collection \u00d600000(n object, Collection collection, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (Iterable)g2.\u00f800000(object2);
            mc.new(collection, object2);
        }
        return collection;
    }

    public static final Collection \u00d200000(n object, Collection collection, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (n)g2.\u00f800000(object2);
            mc.o00000(collection, object2);
        }
        return collection;
    }

    public static final Map \u00d5\u00d20000(n object, g g2) {
        Map map = new LinkedHashMap();
        object = object.o00000();
        while (object.hasNext()) {
            Map map2 = map;
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            Object object3 = map2.get(object2);
            if (object3 == null) {
                object3 = new ArrayList();
                map2.put(object2, object3);
            }
            ((List)object3).add(e2);
        }
        return map;
    }

    public static final Map \u00d200000(n object, g g2, g g3) {
        Map map = new LinkedHashMap();
        object = object.o00000();
        while (object.hasNext()) {
            Map map2 = map;
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            Object object3 = map2.get(object2);
            if (object3 == null) {
                object3 = new ArrayList();
                map2.put(object2, object3);
            }
            ((List)object3).add(g3.\u00f800000(e2));
        }
        return map;
    }

    public static final Map String(n object, Map map, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Map map2 = map;
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            Object object3 = map2.get(object2);
            if (object3 == null) {
                object3 = new ArrayList();
                map2.put(object2, object3);
            }
            ((List)object3).add(e2);
        }
        return map;
    }

    public static final Map o00000(n object, Map map, g g2, g g3) {
        object = object.o00000();
        while (object.hasNext()) {
            Map map2 = map;
            Object e2 = object.next();
            Object object2 = g2.\u00f800000(e2);
            Object object3 = map2.get(object2);
            if (object3 == null) {
                object3 = new ArrayList();
                map2.put(object2, object3);
            }
            ((List)object3).add(g3.\u00f800000(e2));
        }
        return map;
    }

    public static final b.s.ab \u00d8o0000(n n2, g g2) {
        return new p$_n$1(n2, g2);
    }

    public static final n \u00f5\u00d30000(n n2, g g2) {
        return new j(n2, g2);
    }

    public static final n \u00d800000(n n2, b.o.e.f f2) {
        return new r(n2, f2);
    }

    public static final n \u00f500000(n n2, b.o.e.f f2) {
        return c.\u00f5\u00d30000(new r(n2, f2));
    }

    public static final Collection \u00d200000(n object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3;
            Object object2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            Object object3 = f2.o00000(n3, object2);
            if (object3 == null) continue;
            object2 = object3;
            collection.add(object2);
        }
        return collection;
    }

    public static final Collection \u00d500000(n object, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            collection.add(f2.o00000(n3, e2));
        }
        return collection;
    }

    public static final n oo0000(n n2, g g2) {
        return c.\u00f5\u00d30000(new j(n2, g2));
    }

    public static final Collection o00000(n object, Collection collection, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = object.next();
            Object object3 = g2.\u00f800000(object2);
            if (object3 == null) continue;
            object2 = object3;
            collection.add(object2);
        }
        return collection;
    }

    public static final Collection \u00d300000(n object, Collection collection, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            collection.add(g2.\u00f800000(e2));
        }
        return collection;
    }

    public static final n \u00d2\u00d40000(n n2) {
        return new z(n2);
    }

    public static final n \u00d3\u00d20000(n n2) {
        return c.\u00d8\u00d30000(n2, p::\u00d500000);
    }

    public static final n \u00d8\u00d30000(n n2, g g2) {
        return new m(n2, g2);
    }

    public static final Set \u00d2\u00d30000(n object) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            linkedHashSet.add(e2);
        }
        return linkedHashSet;
    }

    public static final boolean o\u00d40000(n object, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static final boolean thisnew(n n2) {
        return n2.o00000().hasNext();
    }

    public static final boolean \u00f6o0000(n object, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return true;
        }
        return false;
    }

    public static final int \u00f8\u00d30000(n object) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            object.next();
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        return n2;
    }

    public static final int \u00d5O0000(n object, g g2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue() || ++n2 >= 0) continue;
            mc.\u00d400000();
        }
        return n2;
    }

    public static final Object \u00d200000(n object, Object object2, b.o.e.f f2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            object2 = f2.o00000(object2, e2);
        }
        return object2;
    }

    public static final Object \u00d200000(n object, Object object2, b.o.e.e e2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3;
            Object e3 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = e2.o00000(n3, object2, e3);
        }
        return object2;
    }

    public static final void \u00d800000(n object, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            g2.\u00f800000(e2);
        }
    }

    public static final void \u00f600000(n object, b.o.e.f f2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3;
            Object e2 = object.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            f2.o00000(n3, e2);
        }
    }

    public static final double \u00f8\u00d20000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)object.next()).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    public static final float \u00f5\u00d20000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 = Math.max(f2, f3);
        }
        return f2;
    }

    public static final Comparable o\u00d20000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)object.next();
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)object.next();
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    public static final Object \u00f8o0000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(e2);
        do {
            Object e3;
            Comparable comparable2;
            if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) >= 0) continue;
            e2 = e3;
            comparable = comparable2;
        } while (object.hasNext());
        return e2;
    }

    public static final Object \u00d6O0000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(e2);
        do {
            Object e3;
            Comparable comparable2;
            if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) >= 0) continue;
            e2 = e3;
            comparable = comparable2;
        } while (object.hasNext());
        return e2;
    }

    private static final double fornew(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    private static final float \u00f8\u00d20000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.max(f2, f3);
        }
        return f2;
    }

    private static final Comparable private(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)g2.\u00f800000(object.next());
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    private static final Double \u00f8\u00d30000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    private static final Float \u00f500000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.max(f2, f3);
        }
        return Float.valueOf(f2);
    }

    private static final Comparable privatenew(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)g2.\u00f800000(object.next());
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    private static final Object \u00d300000(n object, Comparator comparator, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object object2 = g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Object object3 = g2.\u00f800000(object.next());
            if (comparator.compare(object2, object3) >= 0) continue;
            object2 = object3;
        }
        return object2;
    }

    private static final Object o00000(n object, Comparator comparator, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Object object2 = g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Object object3 = g2.\u00f800000(object.next());
            if (comparator.compare(object2, object3) >= 0) continue;
            object2 = object3;
        }
        return object2;
    }

    public static final Double \u00f6\u00d20000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        double d2 = ((Number)object.next()).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    public static final Float \u00d5O0000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        float f2 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 = Math.max(f2, f3);
        }
        return Float.valueOf(f2);
    }

    public static final Comparable \u00d3O0000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)object.next();
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)object.next();
            if (comparable.compareTo(comparable2) >= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    public static final Object \u00d600000(n object, Comparator comparator) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            if (comparator.compare(e2, e3) >= 0) continue;
            e2 = e3;
        }
        return e2;
    }

    public static final Object \u00d500000(n object, Comparator comparator) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            if (comparator.compare(e2, e3) >= 0) continue;
            e2 = e3;
        }
        return e2;
    }

    public static final double \u00d8\u00d30000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)object.next()).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    public static final float \u00d5\u00d30000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    public static final Comparable newsuper(n object) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)object.next();
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)object.next();
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    public static final Object \u00d2\u00d20000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(e2);
        do {
            Object e3;
            Comparable comparable2;
            if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) <= 0) continue;
            e2 = e3;
            comparable = comparable2;
        } while (object.hasNext());
        return e2;
    }

    public static final Object \u00d6o0000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        if (!object.hasNext()) {
            return e2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(e2);
        do {
            Object e3;
            Comparable comparable2;
            if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(e3 = object.next())) <= 0) continue;
            e2 = e3;
            comparable = comparable2;
        } while (object.hasNext());
        return e2;
    }

    private static final double \u00f8O0000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    private static final float \u00f6O0000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    private static final Comparable \u00d3\u00d20000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)g2.\u00f800000(object.next());
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    private static final Double \u00d2O0000(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(object.next())).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)g2.\u00f800000(object.next())).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    private static final Float ifsuper(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(object.next())).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)g2.\u00f800000(object.next())).floatValue();
            f2 = Math.min(f2, f3);
        }
        return Float.valueOf(f2);
    }

    private static final Comparable whilesuper(n object, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)g2.\u00f800000(object.next());
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    private static final Object \u00d200000(n object, Comparator comparator, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object object2 = g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Object object3 = g2.\u00f800000(object.next());
            if (comparator.compare(object2, object3) <= 0) continue;
            object2 = object3;
        }
        return object2;
    }

    private static final Object String(n object, Comparator comparator, g g2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Object object2 = g2.\u00f800000(object.next());
        while (object.hasNext()) {
            Object object3 = g2.\u00f800000(object.next());
            if (comparator.compare(object2, object3) <= 0) continue;
            object2 = object3;
        }
        return object2;
    }

    public static final Double \u00d2\u00d20000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        double d2 = ((Number)object.next()).doubleValue();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    public static final Float \u00d5\u00d20000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        float f2 = ((Number)object.next()).floatValue();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 = Math.min(f2, f3);
        }
        return Float.valueOf(f2);
    }

    public static final Comparable \u00d5o0000(n object) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable)object.next();
        while (object.hasNext()) {
            Comparable comparable2 = (Comparable)object.next();
            if (comparable.compareTo(comparable2) <= 0) continue;
            comparable = comparable2;
        }
        return comparable;
    }

    public static final Object String(n object, Comparator comparator) {
        if (!(object = object.o00000()).hasNext()) {
            throw new NoSuchElementException();
        }
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            if (comparator.compare(e2, e3) <= 0) continue;
            e2 = e3;
        }
        return e2;
    }

    public static final Object \u00d800000(n object, Comparator comparator) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Object e2 = object.next();
        while (object.hasNext()) {
            Object e3 = object.next();
            if (comparator.compare(e2, e3) <= 0) continue;
            e2 = e3;
        }
        return e2;
    }

    public static final boolean nullnew(n n2) {
        return !n2.o00000().hasNext();
    }

    public static final boolean \u00f6\u00d20000(n object, g g2) {
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!((Boolean)g2.\u00f800000(e2)).booleanValue()) continue;
            return false;
        }
        return true;
    }

    public static final n oO0000(n n2, g g2) {
        return c.\u00f5\u00d30000(n2, arg_0 -> p.o00000(g2, arg_0));
    }

    public static final n \u00d500000(n n2, b.o.e.f f2) {
        return c.\u00d800000(n2, (arg_0, arg_1) -> p.o00000(f2, arg_0, arg_1));
    }

    public static final Object \u00f800000(n object, b.o.e.f f2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        Object object2 = object.next();
        while (object.hasNext()) {
            object2 = f2.o00000(object2, object.next());
        }
        return object2;
    }

    public static final Object o00000(n object, b.o.e.e e2) {
        if (!(object = object.o00000()).hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        int n2 = 1;
        Object object2 = object.next();
        while (object.hasNext()) {
            int n3;
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = e2.o00000(n3, object2, object.next());
        }
        return object2;
    }

    public static final Object \u00d200000(n object, b.o.e.e e2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        int n2 = 1;
        Object object2 = object.next();
        while (object.hasNext()) {
            int n3;
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = e2.o00000(n3, object2, object.next());
        }
        return object2;
    }

    public static final Object \u00d300000(n object, b.o.e.f f2) {
        if (!(object = object.o00000()).hasNext()) {
            return null;
        }
        Object object2 = object.next();
        while (object.hasNext()) {
            object2 = f2.o00000(object2, object.next());
        }
        return object2;
    }

    public static final n o00000(n n2, Object object, b.o.e.f f2) {
        return c.o00000(new p$_k$1(object, n2, f2, null));
    }

    public static final n o00000(n n2, Object object, b.o.e.e e2) {
        return c.o00000(new p$_l$1(object, n2, e2, null));
    }

    public static final n \u00d200000(n n2, b.o.e.f f2) {
        return c.o00000(new p$_j$1(n2, f2, null));
    }

    public static final n \u00d300000(n n2, b.o.e.e e2) {
        return c.o00000(new p$_d$1(n2, e2, null));
    }

    public static final n \u00d300000(n n2, Object object, b.o.e.f f2) {
        return c.o00000(n2, object, f2);
    }

    public static final n \u00d300000(n n2, Object object, b.o.e.e e2) {
        return c.o00000(n2, object, e2);
    }

    public static final int returnObject(n object, g g2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            n2 += ((Number)g2.\u00f800000(e2)).intValue();
        }
        return n2;
    }

    public static final double \u00f6\u00d30000(n object, g g2) {
        double d2 = 0.0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            d2 += ((Number)g2.\u00f800000(e2)).doubleValue();
        }
        return d2;
    }

    private static final double o\u00d30000(n object, g g2) {
        double d2 = 0.0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            d2 += ((Number)g2.\u00f800000(e2)).doubleValue();
        }
        return d2;
    }

    private static final int \u00f5\u00d20000(n object, g g2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            n2 += ((Number)g2.\u00f800000(e2)).intValue();
        }
        return n2;
    }

    private static final long o\u00d20000(n object, g g2) {
        long l2 = 0L;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            l2 += ((Number)g2.\u00f800000(e2)).longValue();
        }
        return l2;
    }

    private static final int \u00f5O0000(n object, g g2) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(e2)).o00000());
        }
        return n2;
    }

    private static final long \u00f5o0000(n object, g g2) {
        long l2 = 0L;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            l2 = b.f.super(l2 + ((b.f)g2.\u00f800000(e2)).super());
        }
        return l2;
    }

    public static final n \u00f5O0000(n n2) {
        n n3 = n2;
        return c.\u00f5\u00d30000(n3, arg_0 -> p.\u00d500000(n3, arg_0));
    }

    public static final n \u00d500000(n n2, int n3) {
        int n4 = n3;
        return c.o00000(n2, n4, n4, true);
    }

    public static final n o00000(n n2, int n3, g g2) {
        int n4 = n3;
        return c.o00000(n2, n4, n4, true, g2);
    }

    public static final n \u00d300000(n n2, Object object) {
        return new p$_e$1(n2, object);
    }

    public static final n \u00d200000(n n2, Object[] objectArray) {
        if (objectArray.length == 0) {
            return n2;
        }
        return new p$_e$2(n2, objectArray);
    }

    public static final n o00000(n n2, Iterable iterable) {
        return new p$_e$3(iterable, n2);
    }

    public static final n \u00d200000(n n2, n n3) {
        return new p$_e$4(n3, n2);
    }

    private static final n \u00d800000(n n2, Object object) {
        return c.\u00d300000(n2, object);
    }

    public static final qb \u00d2\u00d40000(n object, g g2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (((Boolean)g2.\u00f800000(e2)).booleanValue()) {
                arrayList.add(e2);
                continue;
            }
            arrayList2.add(e2);
        }
        return new qb(arrayList, arrayList2);
    }

    public static final n null(n n2, Object object) {
        Object[] objectArray = new n[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = n2;
        objectArray2[1] = c.\u00d200000(object);
        return c.\u00d500000(c.o00000(objectArray2));
    }

    public static final n o00000(n n2, Object[] objectArray) {
        return c.\u00d200000(n2, (Iterable)b.s.z.\u00d500000(objectArray));
    }

    public static final n \u00d200000(n n2, Iterable iterable) {
        Object[] objectArray = new n[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = n2;
        objectArray2[1] = mc.\u00d5o0000(iterable);
        return c.\u00d500000(c.o00000(objectArray2));
    }

    public static final n o00000(n n2, n n3) {
        Object[] objectArray = new n[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = n2;
        objectArray2[1] = n3;
        return c.\u00d500000(c.o00000(objectArray2));
    }

    private static final n \u00d200000(n n2, Object object) {
        return c.null(n2, object);
    }

    public static final n o00000(n n2, int n3, int n4, boolean bl) {
        return e.super(n2, n3, n4, bl, false);
    }

    public static /* synthetic */ n o00000(n n2, int n3, int n4, boolean bl, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n4 = 1;
        }
        if ((n5 & 4) != 0) {
            bl = false;
        }
        return c.o00000(n2, n3, n4, bl);
    }

    public static final n o00000(n n2, int n3, int n4, boolean bl, g g2) {
        return c.\u00f5\u00d30000(e.super(n2, n3, n4, bl, true), g2);
    }

    public static /* synthetic */ n o00000(n n2, int n3, int n4, boolean bl, g g2, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n4 = 1;
        }
        if ((n5 & 4) != 0) {
            bl = false;
        }
        return c.o00000(n2, n3, n4, bl, g2);
    }

    public static final n \u00d300000(n n2, n n3) {
        return new k(n2, n3, p::o00000);
    }

    public static final n o00000(n n2, n n3, b.o.e.f f2) {
        return new k(n2, n3, f2);
    }

    public static final n oo0000(n n2) {
        return c.null(n2, p::\u00d200000);
    }

    public static final n null(n n2, b.o.e.f f2) {
        return c.o00000(new p$_f$2(n2, f2, null));
    }

    public static final Appendable o00000(n object, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, g g2) {
        appendable.append(charSequence2);
        int n3 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (++n3 > 1) {
                appendable.append(charSequence);
            }
            if (n2 >= 0 && n3 > n2) break;
            b.q.f.super(appendable, e2, g2);
        }
        if (n2 >= 0 && n3 > n2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static /* synthetic */ Appendable o00000(n n2, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n3, CharSequence charSequence4, g g2, int n4, Object object) {
        if ((n4 & 2) != 0) {
            charSequence = ", ";
        }
        if ((n4 & 4) != 0) {
            charSequence2 = "";
        }
        if ((n4 & 8) != 0) {
            charSequence3 = "";
        }
        if ((n4 & 0x10) != 0) {
            n3 = -1;
        }
        if ((n4 & 0x20) != 0) {
            charSequence4 = "...";
        }
        if ((n4 & 0x40) != 0) {
            g2 = null;
        }
        return c.o00000(n2, appendable, charSequence, charSequence2, charSequence3, n3, charSequence4, g2);
    }

    public static final String o00000(n n2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n3, CharSequence charSequence4, g g2) {
        return ((StringBuilder)c.o00000(n2, new StringBuilder(), charSequence, charSequence2, charSequence3, n3, charSequence4, g2)).toString();
    }

    public static /* synthetic */ String o00000(n n2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n3, CharSequence charSequence4, g g2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            charSequence = ", ";
        }
        if ((n4 & 2) != 0) {
            charSequence2 = "";
        }
        if ((n4 & 4) != 0) {
            charSequence3 = "";
        }
        if ((n4 & 8) != 0) {
            n3 = -1;
        }
        if ((n4 & 0x10) != 0) {
            charSequence4 = "...";
        }
        if ((n4 & 0x20) != 0) {
            g2 = null;
        }
        return c.o00000(n2, charSequence, charSequence2, charSequence3, n3, charSequence4, g2);
    }

    public static final Iterable ifsuper(n n2) {
        return new p$_g$_b$_b$1(n2);
    }

    private static final n \u00d8o0000(n n2) {
        return n2;
    }

    public static final double \u00f8o0000(n object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            byte by = ((Number)object.next()).byteValue();
            d2 += (double)by;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double \u00d8O0000(n object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            short s2 = ((Number)object.next()).shortValue();
            d2 += (double)s2;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double \u00d3o0000(n object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            d2 += (double)n3;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double \u00f5o0000(n object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            long l2 = ((Number)object.next()).longValue();
            d2 += (double)l2;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double privatenew(n object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            float f2 = ((Number)object.next()).floatValue();
            d2 += (double)f2;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final double \u00f6O0000(n object) {
        double d2 = 0.0;
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 += d3;
            if (++n2 >= 0) continue;
            mc.\u00d400000();
        }
        if (n2 == 0) {
            return Double.NaN;
        }
        return d2 / (double)n2;
    }

    public static final int returnsuper(n object) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            byte by = ((Number)object.next()).byteValue();
            n2 += by;
        }
        return n2;
    }

    public static final int fornew(n object) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            short s2 = ((Number)object.next()).shortValue();
            n2 += s2;
        }
        return n2;
    }

    public static final int \u00d2o0000(n object) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            n2 += n3;
        }
        return n2;
    }

    public static final long private(n object) {
        long l2 = 0L;
        object = object.o00000();
        while (object.hasNext()) {
            long l3 = ((Number)object.next()).longValue();
            l2 += l3;
        }
        return l2;
    }

    public static final float \u00d6O0000(n object) {
        float f2 = 0.0f;
        object = object.o00000();
        while (object.hasNext()) {
            float f3 = ((Number)object.next()).floatValue();
            f2 += f3;
        }
        return f2;
    }

    public static final double \u00f6o0000(n object) {
        double d2 = 0.0;
        object = object.o00000();
        while (object.hasNext()) {
            double d3 = ((Number)object.next()).doubleValue();
            d2 += d3;
        }
        return d2;
    }

    private static final Object o00000(int n2, int n3) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + n2 + '.');
    }

    private static final boolean o00000(b.o.e.f f2, l l2) {
        return (Boolean)f2.o00000(l2.o00000(), l2.String());
    }

    private static final Object o00000(l l2) {
        return l2.String();
    }

    private static final boolean String(Object object) {
        return object == null;
    }

    private static final Object \u00d500000(Object object) {
        return object;
    }

    private static final Object o00000(g g2, Object object) {
        g2.\u00f800000(object);
        return object;
    }

    private static final Object o00000(b.o.e.f f2, int n2, Object object) {
        f2.o00000(n2, object);
        return object;
    }

    private static final Object \u00d500000(n n2, Object object) {
        Object object2 = object;
        if (object2 == null) {
            throw new IllegalArgumentException("null element found in " + n2 + '.');
        }
        return object2;
    }

    private static final qb o00000(Object object, Object object2) {
        return yc.o00000(object, object2);
    }

    private static final qb \u00d200000(Object object, Object object2) {
        return yc.o00000(object, object2);
    }
}

