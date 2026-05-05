/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.m;
import b.o.d.fc;
import b.q.f;
import b.qb;
import b.s.mc;
import b.t.c.b.b.h.ec;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.b.h;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.n.c.d.c.k;
import b.t.c.b.b.n.c.db;
import b.t.c.b.b.n.c.e;
import b.t.c.b.b.n.c.e.d;
import b.t.c.b.b.n.c.g.b;
import b.t.c.b.b.n.c.g.c;
import b.t.c.b.b.n.c.g.g;
import b.t.c.b.b.n.c.g.i$_b$0;
import b.t.c.b.b.n.c.g.i$_b$1;
import b.t.c.b.b.n.c.g.i$_b$2;
import b.t.c.b.b.n.c.g.i$_b$3;
import b.t.c.b.b.n.c.g.i$_b$4;
import b.t.c.b.b.n.c.g.l;
import b.t.c.b.b.n.c.g.o;
import b.t.c.b.b.n.c.g.s;
import b.t.c.b.b.n.c.t;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.x;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    private final c o00000;

    public i(c c2) {
        this.o00000 = c2;
    }

    public final Collection o00000(b.t.c.b.b.n.c.d.i i2, Collection iterable) {
        iterable = iterable;
        Object object = iterable;
        iterable = new ArrayList(mc.o00000((Iterable)iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (hc)object2;
            Iterable<hc> iterable2 = iterable;
            iterable2.add(this.new((hc)object2, i2));
        }
        return (List)iterable;
    }

    private final b.t.c.b.b.q.e.o o00000(hc hc2, b.t.c.b.b.n.c.d.i i2) {
        kb kb2 = x.o00000(hc2);
        if (kb2 == null) {
            return ((b.t.c.b.b.q.e.i)hc2).\u00d4\u00f80000();
        }
        List list = kb2;
        k k2 = kb2 instanceof k ? (k)((Object)list) : null;
        list = k2 != null ? k2.\u00d8\u00d4\u00d2000() : null;
        Object object = list;
        if (object == null || object.isEmpty()) {
            return ((b.t.c.b.b.q.e.i)hc2).\u00d4\u00f80000();
        }
        object = list = (Iterable)list;
        list = new ArrayList(mc.o00000((Iterable)list, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (q)object2;
            List list2 = list;
            list2.add(new b.t.c.b.b.n.c.d.c.b(i2, (q)object2, true));
        }
        object = list;
        return b.t.c.b.b.q.e.o.\u00d8o\u00f6000.o00000(mc.return((Iterable)((b.t.c.b.b.q.e.i)hc2).\u00d4\u00f80000(), (Iterable)object));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final hc new(hc var1_1, b.t.c.b.b.n.c.d.i var2_2) {
        block31: {
            block30: {
                block29: {
                    block28: {
                        if (!(var1_1 instanceof d)) {
                            return var1_1;
                        }
                        if (var1_1.O\u00f5o000() == hc$_b.o00000 && var1_1.o\u00f5o000().\u00d5\u00f4o000().size() == 1) {
                            return var1_1;
                        }
                        var3_3 = b.t.c.b.b.n.c.d.e.\u00d200000((b.t.c.b.b.n.c.d.i)var2_2, this.o00000(var1_1, (b.t.c.b.b.n.c.d.i)var2_2));
                        if (!(var1_1 instanceof b.t.c.b.b.n.c.e.f)) ** GOTO lbl-1000
                        v0 = ((b.t.c.b.b.q.b.x)var1_1).\u00d40\u00d2000();
                        v1 = v0 != null ? !v0.o\u00f6o000() : false;
                        if (v1) {
                            v2 = ((b.t.c.b.b.q.b.x)var1_1).\u00d40\u00d2000();
                        } else lbl-1000:
                        // 2 sources

                        {
                            v2 = var4_5 /* !! */  = var1_1;
                        }
                        if (((b.t.c.b.b.q.b)var1_1).nullclasssuper() != null) {
                            var6_6 /* !! */  = var4_5 /* !! */  instanceof ic != false ? (ic)var4_5 /* !! */  : null;
                            v3 = this.o00000(var1_1, var6_6 /* !! */  != null ? (jc)var6_6 /* !! */ .o00000(b.t.c.b.b.n.c.e.b.\u00d3\u00d2\u00d6000) : null, (b.t.c.b.b.n.c.d.i)var3_3, null, false, i$_b$0.\u00d4\u00d8\u00d4000);
                        } else {
                            v3 = var5_7 = null;
                        }
                        if ((var7_9 = var1_1 instanceof b.t.c.b.b.n.c.e.b != false ? (b.t.c.b.b.n.c.e.b)var1_1 : null) == null || (var7_9 = h.o00000(b.t.c.b.b.n.b.o.o00000, (ib)(var8_12 = var7_9).\u00d8\u00f80000(), b.t.c.b.b.n.b.e.super((ic)var8_12, false, false, 3, null))) == null) break block28;
                        var8_12 = var7_9;
                        v4 = (g)l.super().get(var8_12);
                        if (v4 == null) break block28;
                        var9_16 = v4;
                        if (v4.\u00d400000() == null) ** GOTO lbl-1000
                        v5 = var9_16.\u00d400000();
                        v6 = v5 != null ? f.\u00d300000(v5, "2.", false, 2, null) : false;
                        if (v6) lbl-1000:
                        // 2 sources

                        {
                            v7 = true;
                        } else {
                            v7 = false;
                        }
                        if (!v7) {
                            throw new IllegalStateException("Check failed.");
                        }
                        v8 = var9_16.\u00d400000() == null ? var9_16 : var9_16.o00000();
                        break block29;
                    }
                    v8 = var6_6 /* !! */  = null;
                }
                if (v8 != null) {
                    var7_9 = v8;
                    v9 = var8_13 = v8.\u00d200000().size() == ((b.t.c.b.b.n.c.e.b)var1_1).\u00f5\u00d8o000().size();
                    if (m.new && !var8_13) {
                        var8_14 = "Predefined enhancement info for " + var1_1 + " has " + var7_9.\u00d200000().size() + ", but " + ((b.t.c.b.b.n.c.e.b)var1_1).\u00f5\u00d8o000().size() + " expected";
                        throw new AssertionError((Object)var8_14);
                    }
                }
                var7_10 = (db.super(var2_2.\u00d500000().OO0000()) != false || var3_3.\u00d500000().\u00f500000().\u00d400000() != false) && db.super(var1_1) != false;
                var2_2 = var4_5 /* !! */ .\u00f5\u00d8o000();
                var8_15 = var2_2;
                var9_16 = new ArrayList<E>(mc.o00000((Iterable)var2_2, 10));
                for (Object var11_18 : var8_15) {
                    var12_19 = (jc)var11_18;
                    var13_20 = var9_16;
                    v10 = var6_6 /* !! */ ;
                    var11_18 = v10 != null && (v10 = v10.\u00d200000()) != null ? (b)mc.\u00f400000((List)v10, var12_19.whilenullsuper()) : null;
                    var2_2 = var12_19;
                    var13_20.add(this.o00000(var1_1, (jc)var12_19, (b.t.c.b.b.n.c.d.i)var3_3, (b)var11_18, var7_10, new i$_b$1((jc)var2_2)));
                }
                var7_11 = (List)var9_16;
                v11 = var1_1 instanceof pb != false ? (pb)var1_1 : null;
                v12 = var6_6 /* !! */ ;
                var2_2 = i.o00000(this, var1_1, var4_5 /* !! */ , true, (b.t.c.b.b.n.c.d.i)var3_3, (v11 != null ? b.t.c.b.b.n.c.d.c.h.super(v11) : false) != false ? t.\u00d500000 : t.new, v12 != null ? v12.Object() : null, false, i$_b$2.whilefornew, 32, null);
                if (this.o00000(((b.t.c.b.b.q.b)var1_1).\u00d3\u00f4o000()) || ((v13 /* !! */  = ((b.t.c.b.b.q.b)var1_1).nullclasssuper()) != null && (v13 /* !! */  = v13 /* !! */ .forclasssuper()) != null ? this.o00000((rc)v13 /* !! */ ) : false)) ** GOTO lbl-1000
                var8_15 = ((b.t.c.b.b.q.b)var1_1).\u00f5\u00d8o000();
                if (!(var8_15 instanceof Collection) || !((Collection)var8_15).isEmpty()) {
                    for (Object var11_18 : var8_15) {
                        if (!this.o00000(var11_18.forclasssuper())) continue;
                        v14 = true;
                        break;
                    }
                } else {
                    v14 = false;
                }
                if (v14) lbl-1000:
                // 2 sources

                {
                    v15 = true;
                } else {
                    v15 = false;
                }
                v16 = var8_15 = v15 != false ? yc.o00000(b.t.c.b.b.o.b.e.o00000(), new e(var1_1)) : null;
                if (var5_7 != null || var2_2 != null) break block30;
                var9_16 = (Iterable)var7_11;
                if (!((Collection)var9_16).isEmpty()) {
                    var10_17 = var9_16.iterator();
                    while (var10_17.hasNext()) {
                        if (!((rc)var10_17.next() != null)) continue;
                        v17 = true;
                        break;
                    }
                } else {
                    v17 = false;
                }
                if (!v17 && var8_15 == null) break block31;
            }
            v18 = (d)var1_1;
            v19 = var5_7;
            if (v19 == null) {
                v20 = ((b.t.c.b.b.q.b)var1_1).nullclasssuper();
                v19 = v20 != null ? v20.forclasssuper() : null;
            }
            var3_3 = (Iterable)var7_11;
            var6_6 /* !! */  = v19;
            var13_20 = v18;
            var11_18 = var3_3;
            var12_19 = new ArrayList<E>(mc.o00000(var3_3, 10));
            var3_4 = 0;
            var11_18 = var11_18.iterator();
            while (var11_18.hasNext()) {
                var4_5 /* !! */  = var11_18.next();
                if ((var5_8 = var3_4++) < 0) {
                    mc.\u00d800000();
                }
                var4_5 /* !! */  = (rc)var4_5 /* !! */ ;
                var7_11 = var12_19;
                v21 /* !! */  = var4_5 /* !! */ ;
                if (v21 /* !! */  == null) {
                    v21 /* !! */  = ((jc)((b.t.c.b.b.q.b)var1_1).\u00f5\u00d8o000().get(var5_8)).forclasssuper();
                }
                var7_11.add(v21 /* !! */ );
            }
            var7_11 = (List)var12_19;
            v22 = var2_2;
            if (v22 == null) {
                v22 = ((b.t.c.b.b.q.b)var1_1).\u00d3\u00f4o000();
            }
            return var13_20.o00000((rc)var6_6 /* !! */ , (List)var7_11, (rc)v22, (qb)var8_15);
        }
        return var1_1;
    }

    public final List o00000(b.t.c.b.b.q.i i2, List iterable, b.t.c.b.b.n.c.d.i i3) {
        iterable = iterable;
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2;
            Object object3 = object.next();
            object3 = (rc)object3;
            Iterable iterable2 = iterable;
            if (b.t.c.b.b.h.b.b.super(object3, i$_b$3.o\u00d8\u00d4000)) {
                object2 = object3;
            } else {
                object2 = i.o00000(this, new s(i2, false, i3, t.\u00f400000, false, 16, null), object3, mc.\u00d500000(), null, false, 12, null);
                if (object2 == null) {
                    object2 = object3;
                }
            }
            iterable2.add(object2);
        }
        return iterable;
    }

    public final rc o00000(rc rc2, b.t.c.b.b.n.c.d.i i2) {
        rc rc3 = i.o00000(this, new s(null, false, i2, t.return, true), rc2, mc.\u00d500000(), null, false, 12, null);
        if (rc3 == null) {
            rc3 = rc2;
        }
        return rc3;
    }

    private final boolean o00000(rc rc2) {
        return b.t.c.b.b.h.o.o00000(rc2, i$_b$4.O\u00d8\u00d4000);
    }

    private final rc o00000(hc object, jc object2, b.t.c.b.b.n.c.d.i i2, b b2, boolean bl, b.o.e.g g2) {
        Object object3;
        boolean bl2;
        b.t.c.b.b.q.e.i i3;
        hc hc2;
        Object object4;
        block3: {
            block2: {
                object4 = this;
                hc2 = object;
                i3 = (b.t.c.b.b.q.e.i)object2;
                bl2 = false;
                object3 = object2;
                if (object3 == null) break block2;
                object = object3;
                b.t.c.b.b.q.e.i i4 = i3;
                hc hc3 = hc2;
                object2 = object4;
                object = b.t.c.b.b.n.c.d.e.\u00d200000(i2, object.\u00d4\u00f80000());
                object4 = object2;
                hc2 = hc3;
                i3 = i4;
                bl2 = false;
                object3 = object;
                if (object3 != null) break block3;
            }
            object3 = i2;
        }
        return ((i)object4).o00000(hc2, i3, bl2, (b.t.c.b.b.n.c.d.i)object3, t.\u00f500000, b2, bl, g2);
    }

    private final rc o00000(hc object, b.t.c.b.b.q.e.i iterator, boolean bl, b.t.c.b.b.n.c.d.i object2, t object3, b b2, boolean bl2, b.o.e.g g2) {
        Object object4;
        rc rc2 = (rc)g2.\u00f800000(object);
        object = object.\u00d5\u00f4o000();
        rc rc3 = rc2;
        object3 = new s((b.t.c.b.b.q.e.i)((Object)iterator), bl, (b.t.c.b.b.n.c.d.i)object2, (t)((Object)object3), false, 16, null);
        object2 = this;
        iterator = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object5 = iterator.next();
            object5 = (hc)object5;
            object4 = object;
            object4.add((rc)g2.\u00f800000(object5));
        }
        object4 = (List)object;
        return super.o00000((s)object3, rc3, (List)object4, b2, bl2);
    }

    static /* synthetic */ rc o00000(i i2, hc hc2, b.t.c.b.b.q.e.i i3, boolean bl, b.t.c.b.b.n.c.d.i i4, t t2, b b2, boolean bl2, b.o.e.g g2, int n2, Object object) {
        if ((n2 & 0x20) != 0) {
            bl2 = false;
        }
        return i2.o00000(hc2, i3, bl, i4, t2, b2, bl2, g2);
    }

    private final rc o00000(s s2, rc rc2, List list, b b2, boolean bl) {
        return this.o00000.o00000(rc2, s2.o00000(rc2, list, b2, bl), ((o)s2).\u00d600000());
    }

    static /* synthetic */ rc o00000(i i2, s s2, rc rc2, List list, b b2, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            b2 = null;
        }
        if ((n2 & 8) != 0) {
            bl = false;
        }
        return i2.o00000(s2, rc2, list, b2, bl);
    }

    private static final rc o00000(jc jc2, hc hc2) {
        return ((jc)hc2.\u00f5\u00d8o000().get(jc2.whilenullsuper())).forclasssuper();
    }

    private static final rc new(hc hc2) {
        return hc2.nullclasssuper().forclasssuper();
    }

    private static final rc \u00d400000(hc hc2) {
        return hc2.\u00d3\u00f4o000();
    }

    private static final boolean \u00d400000(b.t.c.b.b.h.l l2) {
        return l2 instanceof ec;
    }

    private static final Boolean new(b.t.c.b.b.h.l i2) {
        kb kb2 = i2.thisdosuper().\u00f4OO000();
        if (kb2 == null) {
            return Boolean.FALSE;
        }
        i2 = kb2;
        return fc.o00000((Object)kb2.\u00d5\u00f80000(), (Object)b.t.c.b.b.b.c.f.\u00f500000.\u00d200000().\u00d400000()) && fc.o00000((Object)b.t.c.b.b.o.f.b.\u00d300000((wb)i2), (Object)b.t.c.b.b.b.c.f.\u00f500000.\u00d200000());
    }

    static /* synthetic */ rc \u00d300000(hc hc2) {
        return i.new(hc2);
    }

    static /* synthetic */ rc new(jc jc2, hc hc2) {
        return i.o00000(jc2, hc2);
    }

    static /* synthetic */ rc o00000(hc hc2) {
        return i.\u00d400000(hc2);
    }

    static /* synthetic */ boolean o00000(b.t.c.b.b.h.l l2) {
        return i.\u00d400000(l2);
    }

    static /* synthetic */ Boolean \u00d300000(b.t.c.b.b.h.l l2) {
        return i.new(l2);
    }
}

