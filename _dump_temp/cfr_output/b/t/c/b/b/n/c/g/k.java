/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.o.d.fc;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.n.c.ab;
import b.t.c.b.b.n.c.g.d;
import b.t.c.b.b.n.c.g.m;
import b.t.c.b.b.n.c.g.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class k {
    private static final Object o00000(Set object, Object object2, Object object3, Object object4, boolean bl) {
        if (bl) {
            if (fc.o00000(object.contains(object2) ? object2 : (object = object.contains(object3) ? object3 : null), object2) && fc.o00000(object4, object3)) {
                return null;
            }
            Object object5 = object4;
            if (object5 == null) {
                object5 = object;
            }
            return object5;
        }
        Object object6 = object4;
        if (object6 == null || (object6 = mc.\u00d4O0000((Iterable)ub.\u00d200000((Set)object, object4))) == null) {
            object6 = object;
        }
        return mc.\u00d3o0000((Iterable)object6);
    }

    private static final d o00000(Set set, d d2, boolean bl) {
        if (d2 == d.\u00d300000) {
            return d.\u00d300000;
        }
        return (d)((Object)k.o00000(set, (Object)d.class, (Object)d.\u00d400000, (Object)d2, bl));
    }

    private static final d \u00d200000(m m2) {
        if (m2.\u00d600000()) {
            return null;
        }
        return m2.String();
    }

    private static final p o00000(m m2) {
        if (m2.\u00d200000()) {
            return null;
        }
        return m2.\u00d300000();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final m o00000(m var0, Collection var1_1, boolean var2_2, boolean var3_3, boolean var4_5) {
        var6_7 /* !! */  = var1_1 /* !! */ ;
        var7_9 = new ArrayList<E>();
        var5_11 /* !! */  = var6_7 /* !! */ .iterator();
        while (var5_11 /* !! */ .hasNext()) {
            if (k.\u00d200000((m)var5_11 /* !! */ .next()) == null) continue;
            var7_9.add(var10_12);
        }
        var5_11 /* !! */  = k.o00000(mc.\u00d4O0000((Iterable)((List)var7_9)), k.\u00d200000(var0), var2_2);
        v0 = var5_11 /* !! */ ;
        if (var5_11 /* !! */  == null) {
            var7_9 = var1_1 /* !! */ ;
            var8_13 /* !! */  = new ArrayList<E>();
            var10_12 = var7_9.iterator();
            while (var10_12.hasNext()) {
                if (((m)var10_12.next()).String() == null) continue;
                var8_13 /* !! */ .add(var6_7 /* !! */ );
            }
            v0 = k.o00000(mc.\u00d4O0000((Iterable)((List)var8_13 /* !! */ )), var0.String(), var2_2);
        }
        if (v0 != null) {
            var6_7 /* !! */  = v0;
            var7_9 = v0;
            v1 /* !! */  = !(var4_5 != false || var3_3 != false && var7_9 == d.\u00d400000) ? var6_7 /* !! */  : null;
        } else {
            v1 /* !! */  = null;
        }
        var4_6 = v1 /* !! */ ;
        v2 = var6_8 = v1 /* !! */  != null && var5_11 /* !! */  == null;
        if (var4_6 != d.class) ** GOTO lbl-1000
        if (k.o00000(var0, var6_8)) ** GOTO lbl-1000
        var8_13 /* !! */  = var1_1 /* !! */ ;
        if (!((Collection)var8_13 /* !! */ ).isEmpty()) {
            var9_14 = var8_13 /* !! */ .iterator();
            while (var9_14.hasNext()) {
                if (!k.o00000((m)var9_14.next(), var6_8)) continue;
                v3 = true;
                break;
            }
        } else {
            v3 = false;
        }
        if (v3) lbl-1000:
        // 2 sources

        {
            v4 = true;
        } else lbl-1000:
        // 2 sources

        {
            v4 = false;
        }
        var7_10 = v4;
        var5_11 /* !! */  = var1_1 /* !! */ ;
        var10_12 = new ArrayList<E>();
        var9_14 = var5_11 /* !! */ .iterator();
        while (var9_14.hasNext()) {
            if (k.o00000((m)var9_14.next()) == null) continue;
            var10_12.add(var3_4);
        }
        var8_13 /* !! */  = (p)k.o00000(mc.\u00d4O0000((Iterable)((List)var10_12)), (Object)p.Object, (Object)p.\u00d400000, (Object)k.o00000(var0), var2_2);
        v5 = var8_13 /* !! */ ;
        if (var8_13 /* !! */  == null) {
            var10_12 = var1_1 /* !! */ ;
            var9_14 = new ArrayList<E>();
            var10_12 = var10_12.iterator();
            while (var10_12.hasNext()) {
                if (((m)var10_12.next()).\u00d300000() == null) continue;
                var9_14.add(var1_1 /* !! */ );
            }
            v5 = (p)k.o00000(mc.\u00d4O0000((Iterable)((List)var9_14)), (Object)p.Object, (Object)p.\u00d400000, (Object)var0.\u00d300000(), var2_2);
        }
        var5_11 /* !! */  = v5;
        var9_15 = v5 != null && var8_13 /* !! */  == null;
        return new m((d)var4_6, (p)var5_11 /* !! */ , var7_10, var6_8, var9_15);
    }

    private static final boolean o00000(m m2, boolean bl) {
        return m2.\u00d600000() == bl && m2.\u00d500000();
    }

    public static final boolean o00000(b.t.c.b.b.h.fc fc2, q q2) {
        return fc2.o00000(q2, ab.\u00d8O0000);
    }
}

