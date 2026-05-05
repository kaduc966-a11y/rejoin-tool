/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.i;
import b.o.d.ib;
import b.o.e.g;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.d.f;
import b.t.c.b.b.f.b.b.m;
import b.t.c.b.b.f.b.b.m$_c;
import b.t.c.b.b.f.b.b.m$_d$_b$0;
import b.t.c.b.b.f.b.b.m$_d$_b$1;
import b.t.c.b.b.f.b.b.m$_d$_b$2;
import b.t.c.b.b.f.b.b.m$_d$_b$3;
import b.t.c.b.b.f.b.b.m$_d$_b$4;
import b.t.c.b.b.f.b.b.m$_d$_c$1$1;
import b.t.c.b.b.f.b.cb;
import b.t.c.b.b.f.b.y;
import b.t.c.b.b.l.b$_j;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.p$_b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.k;
import b.t.c.b.b.p.v;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.qb;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class m$_d
implements m$_c {
    static final /* synthetic */ b.t.m[] new;
    private final Map \u00d400000;
    private final Map o00000;
    private final Map \u00d300000;
    private final b.t.c.b.b.i.j \u00d500000;
    private final b.t.c.b.b.i.j if;
    private final b.t.c.b.b.i.i \u00f500000;
    private final b.t.c.b.b.i.f \u00d800000;
    private final b.t.c.b.b.i.f return;
    final /* synthetic */ m \u00f400000;

    public m$_d(m object, List object2, List list, List list2) {
        Map map;
        m$_d m$_d;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        m$_d m$_d2;
        this.\u00f400000 = object;
        object = this;
        object2 = (Collection)object2;
        m$_d m$_d3 = m$_d2 = this;
        object2 = (Iterable)object2;
        object = ((m$_d)object).\u00f400000;
        Map map2 = new LinkedHashMap();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object6 = object2.next();
            object5 = (v)object6;
            object5 = (b$_z)object5;
            object4 = ((m)object).OO0000().\u00f500000();
            object4 = map2;
            int n2 = ((b$_z)object5).\u00d6\u00f8\u00d3000();
            object3 = object4.get(object5 = y.\u00d200000((e)object4, n2));
            if (object3 == null) {
                object3 = new ArrayList();
                object4.put(object5, object3);
            }
            ((List)object3).add(object6);
        }
        object4 = map2;
        m$_d3.\u00d400000 = m$_d2.o00000((Map)object4);
        object = this;
        object2 = list;
        m$_d3 = m$_d2 = this;
        object2 = (Iterable)object2;
        object = ((m$_d)object).\u00f400000;
        map2 = new LinkedHashMap();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            object6 = object2.next();
            object5 = (v)object6;
            object5 = (b$_n)object5;
            object4 = ((m)object).OO0000().\u00f500000();
            object4 = map2;
            int n3 = ((b$_n)object5).\u00d8\u00d5\u00d3000();
            object3 = object4.get(object5 = y.\u00d200000((e)object4, n3));
            if (object3 == null) {
                object3 = new ArrayList();
                object4.put(object5, object3);
            }
            ((List)object3).add(object6);
        }
        object4 = map2;
        m$_d3.o00000 = m$_d2.o00000((Map)object4);
        if ((m$_d = this).\u00f400000.OO0000().null().\u00d300000().\u00d300000()) {
            object = this;
            object2 = list2;
            m$_d2 = object;
            m$_d3 = m$_d;
            object2 = (Iterable)object2;
            object = ((m$_d)object).\u00f400000;
            map2 = new LinkedHashMap();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object6 = object2.next();
                object5 = (v)object6;
                object5 = (b$_j)object5;
                object4 = ((m)object).OO0000().\u00f500000();
                object4 = map2;
                int n4 = ((b$_j)object5).\u00f8O\u00d3000();
                object3 = object4.get(object5 = y.\u00d200000((e)object4, n4));
                if (object3 == null) {
                    object3 = new ArrayList();
                    object4.put(object5, object3);
                }
                ((List)object3).add(object6);
            }
            object4 = map2;
            m$_d = m$_d3;
            map = m$_d2.o00000((Map)object4);
        } else {
            map = b.s.y.Object();
        }
        m$_d.\u00d300000 = map;
        object = this;
        this.\u00d500000 = this.\u00f400000.OO0000().\u00d500000().o00000(new m$_d$_b$0((m$_d)object));
        object = this;
        this.if = this.\u00f400000.OO0000().\u00d500000().o00000(new m$_d$_b$1((m$_d)object));
        object = this;
        this.\u00f500000 = this.\u00f400000.OO0000().\u00d500000().\u00d200000(new m$_d$_b$2((m$_d)object));
        m$_d m$_d4 = this;
        object = m$_d4.\u00f400000;
        object2 = m$_d4;
        this.\u00d800000 = this.\u00f400000.OO0000().\u00d500000().o00000(new m$_d$_b$3((m$_d)object2, (m)object));
        m$_d m$_d5 = this;
        object = m$_d5.\u00f400000;
        object2 = m$_d5;
        this.return = this.\u00f400000.OO0000().\u00d500000().o00000(new m$_d$_b$4((m$_d)object2, (m)object));
    }

    private final Map o00000(Map map) {
        Map map2 = map;
        map = new LinkedHashMap(b.s.y.\u00d200000(map.size()));
        for (Object object : (Iterable)map2.entrySet()) {
            Object object2 = (Map.Entry)object;
            Iterator iterator = map;
            object = (Map.Entry)object;
            Object k2 = object2.getKey();
            Map map3 = iterator;
            object2 = new ByteArrayOutputStream();
            object = (Iterable)object.getValue();
            iterator = object;
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object3 = iterator.next();
                object3 = (k)object3;
                Object e2 = object;
                ((k)object3).super((OutputStream)object2);
                e2.add(i.o00000);
            }
            List cfr_ignored_0 = (List)object;
            object = ((ByteArrayOutputStream)object2).toByteArray();
            map3.put(k2, object);
        }
        return map;
    }

    @Override
    public final Set o00000() {
        return (Set)b.t.c.b.b.i.k.o00000(this.\u00d800000, (Object)this, new[0]);
    }

    @Override
    public final Set \u00d300000() {
        return (Set)b.t.c.b.b.i.k.o00000(this.return, (Object)this, new[1]);
    }

    @Override
    public final Set new() {
        return this.\u00d300000.keySet();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final Collection \u00d400000(f var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = this.\u00d400000;
        var5_5 = b$_z.\u00d20\u00d2000;
        var6_6 = this.\u00f400000;
        var7_7 = this.\u00f400000;
        v0 /* !! */  = (byte[])var4_4.get(var3_3);
        if (v0 /* !! */  == null) ** GOTO lbl-1000
        var3_3 = (Iterator<T>)v0 /* !! */ ;
        var2_2 = var2_2.\u00f400000;
        var3_3 = new ByteArrayInputStream((byte[])var3_3);
        v1 = b.g.c.\u00d6o0000(b.g.c.o00000(new m$_d$_c$1$1((c)var5_5, (ByteArrayInputStream)var3_3, (m)var2_2)));
        v0 /* !! */  = (byte[])v1;
        if (v1 != null) {
            v2 = (Collection)v0 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            v2 = mc.\u00d500000();
        }
        var2_2 = v2;
        var3_3 = v2;
        var2_2 = new ArrayList<E>(var2_2.size());
        var3_3 = var3_3.iterator();
        while (var3_3.hasNext()) {
            var4_4 = (b$_z)var3_3.next();
            var4_4 = var6_6.OO0000().\u00d800000().super((b$_z)var4_4);
            var5_5 = var4_4;
            v3 = var6_6.\u00d300000((qb)var5_5) != false ? var4_4 : null;
            if (v3 == null) continue;
            var4_4 = v3;
            var2_2.add(var4_4);
        }
        var2_2 = (ArrayList)var2_2;
        var4_4 = (List)var2_2;
        var7_7.super(var1_1, (List)var4_4);
        return b.t.c.b.b.m.e.o00000((ArrayList)var2_2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final Collection new(f var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = this.o00000;
        var5_5 = b$_n.ifclasssuper;
        var6_6 = this.\u00f400000;
        var7_7 = this.\u00f400000;
        v0 /* !! */  = (byte[])var4_4.get(var3_3);
        if (v0 /* !! */  == null) ** GOTO lbl-1000
        var3_3 = (Iterator<T>)v0 /* !! */ ;
        var2_2 = var2_2.\u00f400000;
        var3_3 = new ByteArrayInputStream((byte[])var3_3);
        v1 = b.g.c.\u00d6o0000(b.g.c.o00000(new m$_d$_c$1$1(var5_5, (ByteArrayInputStream)var3_3, (m)var2_2)));
        v0 /* !! */  = (byte[])v1;
        if (v1 != null) {
            v2 = (Collection)v0 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            v2 = mc.\u00d500000();
        }
        var2_2 = v2;
        var3_3 = v2;
        var2_2 = new ArrayList<E>(var2_2.size());
        var3_3 = var3_3.iterator();
        while (var3_3.hasNext()) {
            var4_4 = (b$_n)var3_3.next();
            v3 = cb.super(var6_6.OO0000().\u00d800000(), (b$_n)var4_4, false, 2, null);
            if (v3 == null) continue;
            var4_4 = v3;
            var2_2.add(var4_4);
        }
        var2_2 = (ArrayList)var2_2;
        var4_4 = (List)var2_2;
        var7_7.\u00d200000(var1_1, (List)var4_4);
        return b.t.c.b.b.m.e.o00000((ArrayList)var2_2);
    }

    private final h \u00d300000(f object) {
        byte[] byArray = (byte[])this.\u00d300000.get(object);
        if (byArray == null) {
            return null;
        }
        object = byArray;
        b$_j b$_j = b$_j.\u00d400000(new ByteArrayInputStream((byte[])object), this.\u00f400000.OO0000().null().\u00d8O0000());
        if (b$_j == null) {
            return null;
        }
        object = b$_j;
        return this.\u00f400000.OO0000().\u00d800000().super((b$_j)object);
    }

    @Override
    public final Collection new(f f2, b.t.c.b.b.j.b.e e2) {
        if (!this.o00000().contains(f2)) {
            return mc.\u00d500000();
        }
        return (Collection)this.\u00d500000.\u00f800000(f2);
    }

    @Override
    public final h o00000(f f2) {
        return (h)this.\u00f500000.\u00f800000(f2);
    }

    @Override
    public final Collection o00000(f f2, b.t.c.b.b.j.b.e e2) {
        if (!this.\u00d300000().contains(f2)) {
            return mc.\u00d500000();
        }
        return (Collection)this.if.\u00f800000(f2);
    }

    @Override
    public final void o00000(Collection collection, j j2, g g2, b.t.c.b.b.j.b.e e2) {
        ArrayList arrayList;
        f f2;
        ArrayList arrayList2;
        Collection collection2;
        Iterator iterator;
        if (j2.new(j.\u00d6O0000.\u00f500000())) {
            iterator = this.\u00d300000();
            collection2 = collection;
            arrayList2 = new ArrayList();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                f2 = (f)iterator.next();
                if (!((Boolean)g2.\u00f800000(f2)).booleanValue()) continue;
                arrayList = arrayList2;
                arrayList.addAll(this.o00000(f2, e2));
            }
            mc.o00000((List)arrayList2, p$_b.super);
            collection2.addAll(arrayList2);
        }
        if (j2.new(j.\u00d6O0000.o00000())) {
            iterator = this.o00000();
            collection2 = collection;
            arrayList2 = new ArrayList();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                f2 = (f)iterator.next();
                if (!((Boolean)g2.\u00f800000(f2)).booleanValue()) continue;
                arrayList = arrayList2;
                arrayList.addAll(this.new(f2, e2));
            }
            mc.o00000((List)arrayList2, p$_b.super);
            collection2.addAll(arrayList2);
        }
    }

    private static final Collection return(m$_d m$_d, f f2) {
        return m$_d.\u00d400000(f2);
    }

    private static final Collection \u00d500000(m$_d m$_d, f f2) {
        return m$_d.new(f2);
    }

    private static final h new(m$_d m$_d, f f2) {
        return m$_d.\u00d300000(f2);
    }

    private static final Set o00000(m$_d m$_d, m m2) {
        return ub.super(m$_d.\u00d400000.keySet(), m2.\u00d2O0000());
    }

    private static final Set \u00d400000(m$_d m$_d, m m2) {
        return ub.super(m$_d.o00000.keySet(), m2.\u00d3O0000());
    }

    static {
        b.t.m[] mArray = new b.t.m[2];
        b.t.m[] mArray2 = mArray;
        mArray[0] = new ib(m$_d.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        mArray2[1] = new ib(m$_d.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0);
        new = mArray2;
    }

    static /* synthetic */ Collection \u00d300000(m$_d m$_d, f f2) {
        return m$_d.return(m$_d, f2);
    }

    static /* synthetic */ Collection o00000(m$_d m$_d, f f2) {
        return m$_d.\u00d500000(m$_d, f2);
    }

    static /* synthetic */ h \u00d400000(m$_d m$_d, f f2) {
        return m$_d.new(m$_d, f2);
    }

    static /* synthetic */ Set new(m$_d m$_d, m m2) {
        return m$_d.o00000(m$_d, m2);
    }

    static /* synthetic */ Set \u00d300000(m$_d m$_d, m m2) {
        return m$_d.\u00d400000(m$_d, m2);
    }
}

