/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.ce;
import b.o.d.fc;
import b.o.e.g;
import b.qb;
import b.s.y;
import b.t.b.d;
import b.t.bb;
import b.t.c.b.ac;
import b.t.c.b.b;
import b.t.c.b.b.m.e;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.mc;
import b.t.c.b.c.j;
import b.t.c.b.c.l;
import b.t.c.b.c.m;
import b.t.c.b.c.n;
import b.t.c.b.db;
import b.t.c.b.db$_b;
import b.t.c.b.db$_c;
import b.t.c.b.gb;
import b.t.c.b.gc$_b$0;
import b.t.c.b.gc$_b$1;
import b.t.c.b.gc$_c$_b$_b$1;
import b.t.c.b.hd;
import b.t.c.b.nd;
import b.t.c.b.oc;
import b.t.c.b.r;
import b.t.c.b.r$_e;
import b.t.c.h;
import b.t.k;
import b.t.p;
import b.t.p$_b;
import b.t.q;
import b.t.u;
import b.t.v;
import b.t.z;
import b.y.f;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class gc {
    private static final Comparator super;

    public static final Collection \u00d200000(r r2) {
        HashMap hashMap;
        Object object2 = ((r$_e)r2.O\u00d2o000().\u00d200000()).\u00d6O0000();
        boolean bl = gc.o00000(b.o.r.\u00d300000(r2));
        boolean bl2 = ((b)object2).\u00d300000() && r2.\u00f4\u00d2o000() != b.t.c.b.b.c.gb.\u00f500000 && bl;
        if (((b)object2).\u00d200000() || bl2) {
            Object object3 = ((b)object2).super();
            Object object4 = e.new(((b)object2).super().size());
            for (Map.Entry object5 : object3.entrySet()) {
                object3 = (gb)object5.getValue();
                if (bl2 && gc.\u00d600000((gb)object3) || ((gb)object3).\u00d5\u00f4O000() && !fc.o00000((Object)object3.o\u00d8O000().iffor().getPackage(), (Object)b.o.r.\u00d300000(r2).getPackage())) continue;
                object4.put(object5.getKey(), object5.getValue());
            }
            hashMap = (HashMap)object4;
        } else {
            hashMap = new HashMap(((b)object2).super());
        }
        object2 = hashMap;
        Map map = new HashMap();
        for (Object object4 : gc.\u00d200000((z)r2)) {
            if (gc.o00000((gb)object4, r2)) {
                if (!(!bl)) {
                    object2 = "Kotlin doesn't have statics. '" + object4.\u00f5\u00d5O000() + "' appears to be declared static member in '" + r2.\u00f4\u00d3O000() + '\'';
                    throw new IllegalStateException(object2.toString());
                }
                ac ac2 = gc.o00000((gb)object4, db$_c.o00000);
                ((Map)object2).put(ac2, object4);
                continue;
            }
            if (((gb)object4).\u00f8\u00d5O000() != b.t.j.return) continue;
            if (bl) {
                ac ac3 = gc.o00000((gb)object4, db$_b.\u00d200000);
                map.put(ac3, object4);
                continue;
            }
            ac ac4 = gc.o00000((gb)object4, db$_c.o00000);
            ((Map)object2).put(ac4, object4);
        }
        return b.s.mc.return(((HashMap)object2).values(), (Iterable)map.values());
    }

    public static final Void o00000(Object object) {
        throw new IllegalStateException(("Star projection in top level type is not possible. Star projection appeared in the following container: '" + object + '\'').toString());
    }

    private static final boolean o00000(gb gb2, r r2) {
        return gc.\u00d600000(gb2) && r2.\u00f4\u00d2o000() == b.t.c.b.b.c.gb.void && !gc.\u00d400000(gb2);
    }

    private static final boolean o00000(r r2, gb gb2) {
        return gb2.\u00f8\u00d5O000() == b.t.j.return || gc.o00000(gb2, r2);
    }

    public static final b o00000(r r2) {
        Object object;
        Map map = new HashMap();
        mc mc2 = r2.\u00d5\u00d2o000().\u00f5o\u00d2000();
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = gc.o00000(b.o.r.\u00d300000(r2));
        Map map2 = new HashMap();
        if (bl3) {
            for (gb object2 : gc.\u00d200000((z)r2)) {
                if (gc.o00000(r2, object2)) continue;
                map2.put(gc.o00000(object2, db$_b.\u00d200000), object2);
            }
        }
        for (u u2 : r2.forfloat()) {
            object = u2.privatevoid();
            z z2 = object instanceof z ? (z)object : null;
            if (z2 == null) {
                throw new IllegalStateException(("Non-denotable supertypes are not possible. Supertype '" + u2 + "' appears non-denotable in class '" + r2 + '\'').toString());
            }
            object = z2;
            j j2 = j.\u00d300000.o00000(u2);
            object = gc.o00000((z)object);
            bl = bl || ((b)object).\u00d300000();
            bl2 = bl2 || ((b)object).\u00d200000();
            object = ((b)object).super().entrySet().iterator();
            while (object.hasNext()) {
                Object object2;
                Map map3;
                Object object3;
                gb gb2;
                block14: {
                    block13: {
                        gb gb3;
                        gb2 = (gb)object.next().getValue();
                        object3 = oc.super(gb2.\u00d8\u00f4O000(), gc.\u00d600000(gb2) ? null : mc2, gb2.\u00d8\u00f4O000().super().o00000(j2), null, true, false, false, false, false, 244, null);
                        if (map2.containsKey(object3 = gc.o00000(gb2 = gb2.o00000((oc)object3), db$_b.\u00d200000))) continue;
                        map3 = map;
                        object2 = map3.get(object3 = ((ac)object3).o00000(db$_c.o00000));
                        if (object2 == null) break block13;
                        Object object4 = gb2;
                        gb gb4 = (gb)object2;
                        Object object5 = (gb)f.\u00d200000((Object)gb4, object4, (Comparator)b.t.c.b.l.super);
                        if (gb4 instanceof k && object4 instanceof k) {
                            gb gb5 = object5;
                            object5 = gb5.\u00d8\u00f4O000();
                            boolean bl4 = ((k)((Object)gb4)).\u00d5\u00d8O000() || ((k)object4).\u00d5\u00d8O000();
                            boolean bl5 = ((k)((Object)gb4)).returnwhile() || ((k)object4).returnwhile();
                            boolean bl6 = ((k)((Object)gb4)).\u00d8\u00d8O000() || ((k)object4).\u00d8\u00d8O000();
                            boolean bl7 = ((k)((Object)gb4)).\u00f4\u00d8O000() || ((k)object4).\u00f4\u00d8O000();
                            object4 = ((gb)f.\u00d200000((Object)gb4, object4, super)).\u00d4\u00f4O000();
                            gb3 = gb5.o00000(oc.super((oc)object5, null, null, (ab)((Object)object4), false, bl7, bl4, bl5, bl6, 11, null));
                        } else {
                            gb3 = object2 = object5;
                        }
                        if (gb3 != null) break block14;
                    }
                    object2 = gb2;
                }
                gb2 = object2;
                map3.put(object3, gb2);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            object = (ac)entry.getKey();
            gb gb6 = (gb)entry.getValue();
            bl = bl || gc.\u00d600000(gb6);
            bl2 = bl2 || gb6.\u00d5\u00f4O000();
            map.put(((ac)object).o00000(db$_c.o00000), gb6);
        }
        if (!bl3) {
            for (gb gb7 : gc.\u00d200000((z)r2)) {
                if (gc.o00000(r2, gb7)) continue;
                bl = bl || gc.\u00d600000(gb7);
                bl2 = bl2 || gb7.\u00d5\u00f4O000();
                map.put(gc.o00000(gb7, db$_c.o00000), gb7);
            }
        }
        return new b(map, bl, bl2);
    }

    public static final boolean \u00d600000(gb gb2) {
        return hd.super(gb2) == null;
    }

    private static final boolean \u00d400000(gb gb2) {
        if (gb2 instanceof b.t.m) {
            AnnotatedElement annotatedElement = h.o00000((b.t.m)((Object)gb2));
            boolean bl = annotatedElement != null && (annotatedElement = annotatedElement.getDeclaringClass()) != null ? !gc.o00000((Class)annotatedElement) : false;
            if (bl) {
                return true;
            }
        }
        return false;
    }

    private static final b o00000(z z2) {
        while (true) {
            z z3;
            if ((z3 = z2) instanceof r) {
                return ((r$_e)((r)z2).O\u00d2o000().\u00d200000()).\u00d6O0000();
            }
            if (!(z3 instanceof m)) break;
            z2 = ((m)z2).\u00d4\u00d5O000();
        }
        throw new IllegalStateException(("Unknown type " + b.o.d.z.\u00d200000(z2.getClass())).toString());
    }

    private static final ac o00000(gb gb2, db db2) {
        nd nd2;
        Object object;
        Object object22;
        Iterable iterable = gb2.\u00d8\u00d5O000();
        Collection collection = new ArrayList();
        for (Object object22 : iterable) {
            if (!(((p)object22).\u00f5\u00f50000() != p$_b.\u00d400000)) continue;
            collection.add(object22);
        }
        object22 = (List)collection;
        iterable = object22;
        collection = new ArrayList(b.s.mc.o00000(object22, 10));
        for (Object object22 : iterable) {
            object = (p)object22;
            object22 = collection;
            object22.add((u)object.\u00f8\u00f50000());
        }
        List list = (List)collection;
        if (gc.\u00d400000(gb2)) {
            nd2 = nd.o00000;
        } else if (gb2 instanceof b.t.m) {
            nd2 = nd.Object;
        } else if (gb2 instanceof k) {
            nd2 = nd.\u00d500000;
        } else {
            throw new IllegalStateException(("Unknown kind for " + b.o.d.z.\u00d200000(gb2.getClass())).toString());
        }
        object22 = nd2;
        k k2 = gb2 instanceof k ? (k)((Object)gb2) : null;
        object = k2 != null ? h.\u00d200000(k2) : null;
        Object object3 = object != null ? ((Method)object).getGenericParameterTypes() : null;
        if (object3 == null) {
            object3 = new Type[]{};
        }
        iterable = b.s.z.thisnew(object3);
        Object object4 = object;
        Object object5 = object4 != null ? ((Method)object4).getParameterTypes() : null;
        if (object5 == null) {
            object5 = new Class[]{};
        }
        collection = b.s.z.thisnew(object5);
        Object object6 = object;
        object = object6 != null ? ((Method)object6).getName() : null;
        return new ac((nd)((Object)object22), gb2.\u00f5\u00d5O000(), (String)object, gb2.O\u00d4O000(), list, (List)collection, (List)iterable, gc.\u00d600000(gb2), db2);
    }

    public static final boolean o00000(Class clazz) {
        return clazz.getAnnotation(ce.class) != null;
    }

    private static final Collection \u00d200000(z z2) {
        return b.t.b.h.OO0000(z2);
    }

    private static final j \u00d200000(List object, List list) {
        if (object.size() != list.size()) {
            return null;
        }
        if (list.isEmpty() || object.isEmpty()) {
            return j.\u00d300000.o00000();
        }
        object = b.s.mc.\u00d300000((Iterable)object, (Iterable)list);
        int n2 = b.e.bb.\u00d200000(y.\u00d200000(b.s.mc.o00000((Iterable)object, 10)), 16);
        Map map = new LinkedHashMap(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            Map map2 = map;
            object2 = (qb)object2;
            bb bb2 = (bb)((qb)object2).\u00d400000();
            object2 = (bb)((qb)object2).\u00d300000();
            object2 = new qb(bb2, q.\u00d400000.\u00d200000(b.t.b.b.super((v)object2, null, false, null, 7, null)));
            map2.put(((qb)object2).new(), ((qb)object2).o00000());
        }
        object = map;
        return new j((Map)object);
    }

    private static final u \u00d200000(u u2, String string) {
        Iterator iterator = u2;
        Object object = l.\u00d800000;
        n n2 = iterator instanceof n ? (n)((Object)iterator) : null;
        boolean bl = n2 != null ? ((l)object).\u00f5O0000(n2) : false;
        if (bl) {
            return iterator;
        }
        v v2 = u2.privatevoid();
        if (v2 == null) {
            throw new IllegalStateException(("Non-denotable parameter types are not possible. Some parameter types appear non-denotable for type '" + u2 + "' (" + b.o.d.z.\u00d200000(u2.getClass()) + ") which belongs to member '" + string + '\'').toString());
        }
        object = u2.\u00f5\u00f60000();
        v v3 = v2;
        iterator = object;
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object2 = iterator.next();
            object2 = (q)object2;
            Object object3 = object;
            u u3 = ((q)object2).o00000();
            object3.add(q.o00000((q)object2, null, u3 != null ? gc.\u00d200000(u3, string) : null, 1, null));
        }
        return b.t.b.b.super(v3, (List)object, false, u2.\u00d8\u00f50000());
    }

    private static final List \u00d200000(List list, String string) {
        return b.s.mc.return((Iterable)list, new gc$_c$_b$_b$1(string));
    }

    private static final boolean o00000(u u2, u u3) {
        return d.super(u2, u3) && d.super(u3, u2);
    }

    private static final Comparable Object(gb object) {
        Object object2 = (object = object.o\u00d8O000()) instanceof z ? (z)object : null;
        return Boolean.valueOf(object2 != null && (object2 = b.o.r.\u00d300000((z)object2)) != null ? ((Class)object2).isInterface() : false);
    }

    private static final Comparable \u00d500000(gb gb2) {
        return Boolean.valueOf(fc.o00000((Object)gb2.o\u00d8O000(), (Object)b.o.d.z.\u00d200000(Object.class)));
    }

    public static final /* synthetic */ j o00000(List list, List list2) {
        return gc.\u00d200000(list, list2);
    }

    public static final /* synthetic */ u o00000(u u2, String string) {
        return gc.\u00d200000(u2, string);
    }

    public static final /* synthetic */ boolean \u00d200000(u u2, u u3) {
        return gc.o00000(u2, u3);
    }

    public static final /* synthetic */ List o00000(List list, String string) {
        return gc.\u00d200000(list, string);
    }

    static {
        g[] gArray = new g[2];
        g[] gArray2 = gArray;
        gArray[0] = gc$_b$0.\u00f5\u00d5\u00d5000;
        gArray2[1] = gc$_b$1.\u00f4\u00d5\u00d5000;
        super = f.super(gArray2);
    }

    static /* synthetic */ Comparable o00000(gb gb2) {
        return gc.Object(gb2);
    }

    static /* synthetic */ Comparable \u00d200000(gb gb2) {
        return gc.\u00d500000(gb2);
    }
}

