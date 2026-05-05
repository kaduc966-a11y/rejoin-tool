/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.dc;
import b.lb;
import b.o.e.h;
import b.r;
import b.s.mc;
import b.t.c.b.b.b.c.f;
import b.t.c.b.b.d.e;
import b.t.c.b.b.h.c.bb;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.c.y;
import b.t.c.b.b.n.c.g;
import b.t.c.b.b.n.c.g.b;
import b.t.c.b.b.n.c.g.d;
import b.t.c.b.b.n.c.g.k;
import b.t.c.b.b.n.c.g.m;
import b.t.c.b.b.n.c.g.o$_b$0;
import b.t.c.b.b.n.c.g.o$_b$1;
import b.t.c.b.b.n.c.g.o$_b$2;
import b.t.c.b.b.n.c.g.o$_b$3;
import b.t.c.b.b.n.c.g.o$_b$4;
import b.t.c.b.b.n.c.g.o$_c;
import b.t.c.b.b.n.c.g.p;
import b.t.c.b.b.n.c.t;
import b.t.c.b.b.n.c.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class o {
    public abstract w float();

    public abstract boolean \u00f400000();

    public abstract Iterable Object();

    public abstract t o00000();

    public abstract g \u00f500000();

    public abstract boolean \u00d500000();

    public abstract boolean \u00d400000();

    public abstract boolean \u00d600000();

    public abstract b.t.c.b.b.h.c.o \u00d200000();

    public boolean \u00f600000() {
        return false;
    }

    public abstract boolean void();

    public abstract boolean o00000(Object var1, q var2);

    public abstract Iterable Object(q var1);

    public abstract q \u00d200000(q var1);

    public abstract e \u00f500000(q var1);

    public abstract boolean o00000(q var1, q var2);

    public abstract boolean o00000(q var1);

    public abstract boolean \u00d200000(b.t.c.b.b.h.c.r var1);

    public boolean \u00f400000(q q2) {
        return false;
    }

    public boolean void(q q2) {
        return true;
    }

    private final d \u00f600000(q q2) {
        b.t.c.b.b.h.c.o o2 = this.\u00d200000();
        if (o2.\u00d8O0000(o2.\u00d800000(q2))) {
            return d.\u00d400000;
        }
        b.t.c.b.b.h.c.o o3 = o2;
        if (!o3.\u00d8O0000(o3.while(q2))) {
            return d.class;
        }
        return null;
    }

    private final p \u00d500000(q q2) {
        b.t.c.b.b.h.c.o o2 = this.\u00d200000();
        if (f.\u00f500000.\u00d200000(this.\u00f500000(o2.\u00d800000(q2)))) {
            return p.\u00d400000;
        }
        if (f.\u00f500000.\u00d300000(this.\u00f500000(o2.while(q2)))) {
            return p.Object;
        }
        return null;
    }

    private final m \u00d400000(q q2) {
        d d2;
        d d3 = d2 = this.\u00f600000(q2);
        if (d2 == null) {
            q q3 = this.\u00d200000(q2);
            d3 = q3 != null ? this.\u00f600000(q3) : null;
        }
        d d4 = d3;
        p p2 = this.\u00d500000(q2);
        p p3 = this.\u00d500000(q2);
        if (p3 == null) {
            q q4 = this.\u00d200000(q2);
            p3 = q4 != null ? this.\u00d500000(q4) : null;
        }
        p p4 = p3;
        boolean bl = this.\u00d200000().\u00f800000(q2) || this.\u00f400000(q2);
        return new m(d4, p2, bl, d4 != d2, p4 != p2);
    }

    /*
     * Unable to fully structure code
     */
    private final m o00000(o$_c var1_1, b.t.c.b.b.n.c.r var2_2) {
        block11: {
            block10: {
                if (var1_1.o00000() == null) {
                    var4_4 = this.\u00d200000();
                    v0 = var1_1.Object();
                    if ((v0 != null ? var4_4.new(v0) : null) == y.new) {
                        return m.\u00d800000.super();
                    }
                }
                var3_5 = var1_1.Object() == null;
                v1 = var1_1.o00000();
                if (v1 == null || (v1 = this.Object((q)v1)) == null) {
                    v1 = mc.\u00d500000();
                }
                var4_4 = v1;
                var6_7 = this.\u00d200000();
                v2 = var1_1.o00000();
                var5_10 = v2 != null && (v2 = var6_7.\u00f400000((q)v2)) != null ? var6_7.\u00f400000((b.t.c.b.b.h.c.g)v2) : null;
                v3 = var6_8 = this.o00000() == t.\u00f400000;
                if (var3_5) break block10;
                v4 = var4_4;
                break block11;
            }
            if (var6_8 || !this.\u00f400000()) ** GOTO lbl-1000
            v5 = var1_1.o00000();
            v6 = v5 != null ? this.o00000(v5) : false;
            if (v6) {
                var6_9 = this.Object();
                var7_11 = new ArrayList<E>();
                var6_9 = var6_9.iterator();
                while (var6_9.hasNext()) {
                    var9_13 = var8_12 = var6_9.next();
                    if (!(this.float().String(var9_13) == false)) continue;
                    var7_11.add(var8_12);
                }
                v4 = mc.return((Collection)((List)var7_11), var4_4);
            } else lbl-1000:
            // 2 sources

            {
                v4 = mc.return(this.Object(), (Iterable)var4_4);
            }
        }
        var6_9 = v4;
        var3_6 = this.float().o00000((Iterable)var6_9);
        v7 = var6_9;
        var4_4 = var1_1;
        var6_9 = this;
        var4_4 = this.float().\u00d200000((Iterable)v7, new o$_b$0((o)var6_9, (o$_c)var4_4));
        if (var4_4 != null) {
            v8 = var3_6;
            v9 = var3_6;
            return new m((d)var4_4.\u00d200000(), v8 != null ? (p)v8.\u00d200000() : null, var4_4.\u00d200000() == d.class && var5_10 != null, var4_4.super(), v9 != null ? v9.super() : false);
        }
        v10 = var5_10;
        var6_9 = v10 != null ? this.o00000(v10) : null;
        var7_11 = this.o00000((b.t.c.b.b.n.c.g.r)var6_9, var2_2);
        v11 = var6_9;
        if ((v11 != null ? (d)v11.\u00d200000() : null) == d.class) ** GOTO lbl-1000
        if (var5_10 != null) {
            v12 = var2_2;
            v13 = v12 != null ? v12.\u00d300000() : false;
            ** if (!v13) goto lbl-1000
        }
        ** GOTO lbl-1000
lbl-1000:
        // 2 sources

        {
            v14 = true;
            ** GOTO lbl59
        }
lbl-1000:
        // 2 sources

        {
            v14 = false;
        }
lbl59:
        // 2 sources

        var2_3 = v14;
        var8_12 = var1_1.Object();
        var6_9 = var8_12 != null && (var9_13 = this.o00000((b.t.c.b.b.h.c.r)var8_12)) != null ? ((var1_1 = var9_13).\u00d200000() == d.\u00d400000 ? b.t.c.b.b.n.c.g.r.super((b.t.c.b.b.n.c.g.r)var1_1, (Object)d.\u00d300000, false, 2, null) : var1_1) : null;
        v15 = var8_12 = this.o00000((b.t.c.b.b.n.c.g.r)var6_9, (b.t.c.b.b.n.c.g.r)var7_11);
        v16 = var3_6;
        v17 = var8_12;
        v18 = var3_6;
        return new m(v15 != null ? (d)v15.\u00d200000() : null, v16 != null ? (p)v16.\u00d200000() : null, var2_3, v17 != null ? v17.super() : false, v18 != null ? v18.super() : false);
    }

    private final b.t.c.b.b.n.c.r o00000(o$_c o$_c) {
        boolean bl = o$_c.Object() == null;
        boolean bl2 = this.o00000() == t.\u00f400000;
        t t2 = bl || bl2 ? this.o00000() : t.return;
        g g2 = o$_c.\u00d200000();
        if (g2 != null) {
            return g2.o00000(t2);
        }
        return null;
    }

    protected abstract b.t.c.b.b.n.c.g.r o00000(b.t.c.b.b.n.c.g.r var1, b.t.c.b.b.n.c.r var2);

    private final b.t.c.b.b.n.c.g.r o00000(b.t.c.b.b.n.c.g.r r2, b.t.c.b.b.n.c.g.r r3) {
        if (r2 == null) {
            return r3;
        }
        if (r3 == null) {
            return r2;
        }
        if (r2.super() && !r3.super()) {
            return r3;
        }
        if (!r2.super() && r3.super()) {
            return r2;
        }
        if (((d)((Object)r2.\u00d200000())).compareTo((Enum)r3.\u00d200000()) < 0) {
            return r3;
        }
        if (((d)((Object)r2.\u00d200000())).compareTo((Enum)r3.\u00d200000()) > 0) {
            return r2;
        }
        return r3;
    }

    private final b.t.c.b.b.n.c.g.r o00000(b.t.c.b.b.h.c.r object) {
        boolean bl;
        Object object2;
        q q2;
        Object object3;
        boolean bl2;
        Object object4;
        b.t.c.b.b.h.c.o o2 = this.\u00d200000();
        if (!this.\u00d200000((b.t.c.b.b.h.c.r)object)) {
            return null;
        }
        Object object5 = (Iterable)(object = o2.\u00d300000((b.t.c.b.b.h.c.r)object));
        if (!(object5 instanceof Collection) || !((Collection)object5).isEmpty()) {
            object5 = object5.iterator();
            while (object5.hasNext()) {
                object4 = (q)object5.next();
                if (o2.\u00f5O0000((q)object4)) continue;
                bl2 = false;
                break;
            }
        } else {
            bl2 = true;
        }
        if (bl2) {
            return null;
        }
        Object object6 = (Iterable)object;
        object4 = new ArrayList();
        object6 = object6.iterator();
        while (object6.hasNext()) {
            object3 = object6.next();
            q2 = (q)object3;
            if (!(this.\u00f600000(q2) != null)) continue;
            object4.add(object3);
        }
        object5 = (List)object4;
        object4 = this;
        object6 = object;
        object4 = r.o00000(lb.\u00d500000, (h)new o$_b$1((List)object6, (o)object4));
        if (!((Collection)object5).isEmpty()) {
            boolean bl3;
            object6 = (Iterable)object5;
            if (!((Collection)object6).isEmpty()) {
                object5 = object6.iterator();
                while (object5.hasNext()) {
                    object3 = (q)object5.next();
                    if (!this.void((q)object3)) continue;
                    bl3 = false;
                    break;
                }
            } else {
                bl3 = true;
            }
            if (bl3) {
                return new b.t.c.b.b.n.c.g.r((Object)d.\u00d300000, false);
            }
            object2 = object;
        } else if (!((Collection)o.o00000((dc)object4)).isEmpty()) {
            boolean bl4;
            object6 = o.o00000((dc)object4);
            if (!(object6 instanceof Collection) || !((Collection)object6).isEmpty()) {
                object5 = object6.iterator();
                while (object5.hasNext()) {
                    object3 = (q)object5.next();
                    if (!this.void((q)object3)) continue;
                    bl4 = false;
                    break;
                }
            } else {
                bl4 = true;
            }
            if (bl4) {
                return new b.t.c.b.b.n.c.g.r((Object)d.\u00d300000, true);
            }
            object2 = o.o00000((dc)object4);
        } else {
            return null;
        }
        object5 = object2;
        object4 = (Iterable)object2;
        if (!(object4 instanceof Collection) || !((Collection)object4).isEmpty()) {
            object6 = object4.iterator();
            while (object6.hasNext()) {
                q2 = (q)object6.next();
                if (o2.\u00d400000(q2)) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        object6 = bl ? d.\u00d400000 : d.class;
        return new b.t.c.b.b.n.c.g.r(object6, object5 != object);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final b.o.e.g o00000(q var1_1, Iterable var2_4, b var3_5, boolean var4_6) {
        var5_7 = this.\u00d600000((q)var1_1);
        var7_8 = var2_4;
        var8_10 = var2_4;
        var9_12 = (m[])new ArrayList<E>(mc.o00000((Iterable)var7_8, 10));
        for (Object var11_16 : var8_10) {
            var11_16 = (q)var11_16;
            var14_17 = var9_12;
            var14_17.add(this.\u00d600000((q)var11_16));
        }
        var6_18 = (List)var9_12;
        if (!this.\u00d400000()) ** GOTO lbl-1000
        if (!(var2_4 instanceof Collection) || !((Collection)var2_4).isEmpty()) {
            for (m var10_14 : var2_4) {
                if (!(this.o00000((q)var1_1, (q)var10_14) == false)) continue;
                v0 = true;
                break;
            }
        } else {
            v0 = false;
        }
        if (v0) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = false;
        }
        var7_9 = v1;
        var9_13 = this.\u00f600000() != false ? 1 : var5_7.size();
        var2_4 = new m[var9_13];
        for (var8_11 = 0; var8_11 < var9_13; ++var8_11) {
            block11: {
                block10: {
                    var15_21 = var10_15 = var8_11;
                    var14_17 = var2_4;
                    var1_2 = var10_15;
                    var11_16 = var5_7;
                    var12_19 = this;
                    var11_16 = r.o00000(lb.\u00d500000, (h)new o$_b$2((o)var12_19, (List)var11_16, var1_2));
                    if (var10_15 <= 0 || !var7_9) break block10;
                    if (!this.void()) ** GOTO lbl-1000
                    v2 = o.\u00d200000(var11_16);
                    v3 = v2 != null ? v2.o00000() : false;
                    if (v3) {
                        v4 = this.o00000((o$_c)var5_7.get(var10_15), o.\u00d200000(var11_16));
                    } else lbl-1000:
                    // 2 sources

                    {
                        v4 = m.\u00d800000.super();
                    }
                    var11_16 = v4;
                    break block11;
                }
                var1_3 = this.o00000((o$_c)var5_7.get(var10_15), o.\u00d200000(var11_16));
                var11_16 = var6_18;
                var12_19 = new ArrayList<E>();
                var11_16 = var11_16.iterator();
                while (var11_16.hasNext()) {
                    v5 = (o$_c)mc.\u00f400000((List)var11_16.next(), var10_15);
                    if ((v5 != null && (v5 = v5.o00000()) != null ? this.\u00d400000((q)v5) : null) == null) continue;
                    var13_20 = var13_20;
                    var12_19.add(var13_20);
                }
                var11_16 = (List)var12_19;
                var11_16 = k.o00000(var1_3, (Collection)var11_16, var10_15 == 0 && this.\u00d400000() != false, var10_15 == 0 && this.\u00d500000() != false, var4_6);
            }
            var14_17[var15_21] = var11_16;
        }
        var1_1 = var2_4;
        var11_16 = var3_5;
        return new o$_b$3((b)var11_16, var1_1);
    }

    private final void o00000(Object iterator, List list, b.o.e.g g2) {
        list.add(iterator);
        Iterable iterable = (Iterable)g2.\u00f800000(iterator);
        if (iterable != null) {
            for (Object t2 : iterable) {
                this.o00000(t2, list, g2);
            }
            return;
        }
    }

    private final List o00000(Object object, b.o.e.g g2) {
        ArrayList arrayList;
        ArrayList arrayList2 = arrayList = new ArrayList(1);
        this.o00000(object, arrayList2, g2);
        return arrayList;
    }

    private final g o00000(q q2, g g2) {
        return w.o00000(this.float(), g2, this.Object(q2), false, 4, null);
    }

    private final List \u00d600000(q object) {
        Object object2 = this.\u00d200000();
        o$_c o$_c = new o$_c((q)object, this.o00000((q)object, this.\u00f500000()), null);
        object = object2;
        object2 = this;
        return this.o00000((Object)o$_c, new o$_b$4((o)object2, (b.t.c.b.b.h.c.o)object));
    }

    private static final boolean \u00d200000(o o2, o$_c o$_c, Object object) {
        return o2.o00000(object, o$_c.o00000());
    }

    private static final List o00000(dc dc2) {
        return (List)dc2.\u00d200000();
    }

    private static final List o00000(List object, o o2) {
        object = (Iterable)object;
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            q q2 = (q)object.next();
            q q3 = o2.\u00d200000(q2);
            if (q3 == null) continue;
            q2 = q3;
            collection.add(q2);
        }
        return (List)collection;
    }

    private static final b.t.c.b.b.n.c.r \u00d200000(dc dc2) {
        return (b.t.c.b.b.n.c.r)dc2.\u00d200000();
    }

    private static final b.t.c.b.b.n.c.r \u00d200000(o o2, List list, int n2) {
        return o2.o00000((o$_c)list.get(n2));
    }

    private static final m o00000(b mArray, m[] mArray2, int n2) {
        Object object = mArray;
        if (mArray == null || (object = ((b)object).\u00d200000()) == null || (object = (m)object.get(n2)) == null) {
            mArray = mArray2;
            boolean bl = n2 >= 0 ? n2 < mArray.length : false;
            if (bl) {
                return mArray[n2];
            }
            object = m.\u00d800000.super();
        }
        return object;
    }

    private static final Iterable \u00d200000(o o2, b.t.c.b.b.h.c.o o3, o$_c o$_c) {
        List list;
        Object object;
        if (o2.\u00d600000()) {
            q q2 = o$_c.o00000();
            boolean bl = q2 != null ? o3.thissuper(q2) : false;
            if (bl) {
                return null;
            }
        }
        if ((object = o$_c.o00000()) != null && (object = o3.\u00f400000((q)object)) != null && (object = o3.\u00d300000((b.t.c.b.b.h.c.g)object)) != null) {
            ArrayList<o$_c> arrayList = (ArrayList<o$_c>)object;
            Object object2 = o3.\u00f500000(o$_c.o00000());
            Iterator iterator = arrayList.iterator();
            Iterator iterator2 = object2.iterator();
            arrayList = new ArrayList<o$_c>(Math.min(mc.o00000((Iterable)arrayList, 10), mc.o00000((Iterable)object2, 10)));
            while (iterator.hasNext() && iterator2.hasNext()) {
                object2 = (bb)iterator2.next();
                b.t.c.b.b.h.c.r r2 = (b.t.c.b.b.h.c.r)iterator.next();
                ArrayList<o$_c> arrayList2 = arrayList;
                arrayList2.add((object2 = o3.\u00d300000((bb)object2)) == null ? new o$_c(null, o$_c.\u00d200000(), r2) : new o$_c((q)object2, o2.o00000((q)object2, o$_c.\u00d200000()), r2));
            }
            list = arrayList;
        } else {
            list = null;
        }
        return list;
    }

    static /* synthetic */ boolean o00000(o o2, o$_c o$_c, Object object) {
        return o.\u00d200000(o2, o$_c, object);
    }

    static /* synthetic */ List \u00d200000(List list, o o2) {
        return o.o00000(list, o2);
    }

    static /* synthetic */ b.t.c.b.b.n.c.r o00000(o o2, List list, int n2) {
        return o.\u00d200000(o2, list, n2);
    }

    static /* synthetic */ m \u00d200000(b b2, m[] mArray, int n2) {
        return o.o00000(b2, mArray, n2);
    }

    static /* synthetic */ Iterable o00000(o o2, b.t.c.b.b.h.c.o o3, o$_c o$_c) {
        return o.\u00d200000(o2, o3, o$_c);
    }
}

