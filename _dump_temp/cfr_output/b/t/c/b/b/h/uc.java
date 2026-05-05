/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.i;
import b.m;
import b.o.d.fc;
import b.qd;
import b.s.mc;
import b.t.c.b.b.h.ab;
import b.t.c.b.b.h.c.bb;
import b.t.c.b.b.h.c.c;
import b.t.c.b.b.h.c.g;
import b.t.c.b.b.h.c.h;
import b.t.c.b.b.h.c.j;
import b.t.c.b.b.h.c.l;
import b.t.c.b.b.h.c.o;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.c.r;
import b.t.c.b.b.h.c.s;
import b.t.c.b.b.h.c.t;
import b.t.c.b.b.h.c.w;
import b.t.c.b.b.h.c.x;
import b.t.c.b.b.h.c.y;
import b.t.c.b.b.h.cb;
import b.t.c.b.b.h.cb$_c;
import b.t.c.b.b.h.cb$_c$_c;
import b.t.c.b.b.h.cb$_c$_e;
import b.t.c.b.b.h.cb$_d;
import b.t.c.b.b.h.nb;
import b.t.c.b.b.h.uc$_b$0;
import b.t.c.b.b.h.uc$_b$1;
import b.t.c.b.b.h.uc$_c;
import b.t.c.b.b.m.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class uc {
    public static final uc \u00d200000 = new uc();
    public static boolean o00000;

    private uc() {
    }

    public final boolean super(cb object, q q2, q q3, boolean bl) {
        if (q2 == q3) {
            return true;
        }
        if (!((cb)object).o00000(q2, q3)) {
            return false;
        }
        cb cb2 = object;
        object = ((cb)object).new();
        return \u00d200000.super(cb2, (o)object, q2, q3, bl);
    }

    public static /* synthetic */ boolean super(uc uc2, cb cb2, q q2, q q3, boolean bl, int n2, Object object) {
        if ((n2 & 8) != 0) {
            bl = false;
        }
        return uc2.super(cb2, q2, q3, bl);
    }

    public final boolean \u00d200000(cb cb2, q q2, q q3) {
        o o2 = cb2.new();
        if (q2 == q3) {
            return true;
        }
        if (\u00d200000.super(o2, q2) && \u00d200000.super(o2, q3)) {
            cb cb3 = cb2;
            q q4 = cb3.\u00d300000(cb3.new(q2));
            cb cb4 = cb2;
            q q5 = cb4.\u00d300000(cb4.new(q3));
            j j2 = o2.\u00d800000(q4);
            o o3 = o2;
            if (!o3.o00000(o3.\u00f400000(q4), o2.\u00f400000(q5))) {
                return false;
            }
            if (o2.return((q)j2) == 0) {
                if (o2.Stringsuper(q4) || o2.Stringsuper(q5)) {
                    return true;
                }
                o o4 = o2;
                return o2.\u00d8O0000(j2) == o4.\u00d8O0000(o4.\u00d800000(q5));
            }
        }
        return uc.super(\u00d200000, cb2, q2, q3, false, 8, null) && uc.super(\u00d200000, cb2, q3, q2, false, 8, null);
    }

    private final boolean super(cb cb2, o o2, q q2, q q3, boolean bl) {
        while (true) {
            cb cb3 = cb2;
            q2 = cb3.\u00d300000(cb3.new(q2));
            cb cb4 = cb2;
            q3 = cb4.\u00d300000(cb4.new(q3));
            if (!cb2.\u00d300000() || !c.\u00d400000(o2, q2) || !c.\u00d2O0000(o2, q3)) break;
            o o3 = o2;
            q3 = c.\u00d200000(o3, c.public(o3, q3));
            q2 = c.o00000(o2, c.o00000(o2, q2));
        }
        o o4 = o2;
        Boolean bl2 = this.\u00d200000(cb2, o4, c.void(o4, q2), c.\u00f400000(o2, q3));
        if (bl2 != null) {
            boolean bl3 = bl2;
            cb2.o00000(q2, q3, bl);
            return bl3;
        }
        bl2 = cb2.o00000(q2, q3, bl);
        if (bl2 != null) {
            return bl2;
        }
        o o5 = o2;
        return this.class(cb2, o5, c.void(o5, q2), c.\u00f400000(o2, q3));
    }

    private final Boolean \u00d300000(cb cb2, o o2, j j2, j j3) {
        if (!c.\u00f400000(o2, j2) && !c.\u00f400000(o2, j3)) {
            return null;
        }
        if (uc.\u00d200000(o2, j2) && uc.\u00d200000(o2, j3)) {
            return Boolean.TRUE;
        }
        if (c.\u00f400000(o2, j2) ? uc.super(o2, cb2, j2, j3, false) : c.\u00f400000(o2, j3) && (uc.\u00d300000(o2, j2) || uc.super(o2, cb2, j3, j2, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private final boolean super(cb cb2, o o2, j j2) {
        Object object = c.Object(o2, j2);
        if (c.\u00f500000(o2, (g)object)) {
            return c.\u00d200000(o2, (g)object);
        }
        object = j2;
        o o3 = o2;
        if (c.\u00d200000(o3, c.Object(o3, (j)object))) {
            return true;
        }
        cb2.o00000();
        ArrayDeque arrayDeque = cb2.\u00d400000();
        Set set = cb2.return();
        arrayDeque.push(j2);
        while (!((Collection)arrayDeque).isEmpty()) {
            cb$_c cb$_c;
            Object object2;
            j2 = (j)arrayDeque.pop();
            if (!set.add(j2) || (!fc.o00000(object2 = c.o00000(o2, (j)(object = j2)) ? (cb$_c)cb$_c$_c.o00000 : (cb$_c)cb$_c$_e.\u00d300000, (Object)cb$_c$_c.o00000) ? object2 : null) == null) continue;
            cb$_c = cb$_c;
            o o4 = cb2.new();
            object2 = o4.if(o4.\u00d500000(j2)).iterator();
            while (object2.hasNext()) {
                object = (q)object2.next();
                j2 = cb$_c.o00000(cb2, (q)object);
                object = j2;
                o o5 = o2;
                if (c.\u00d200000(o5, c.Object(o5, (j)object))) {
                    cb2.\u00f400000();
                    return true;
                }
                arrayDeque.add(j2);
            }
        }
        cb2.\u00f400000();
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private final boolean class(cb var1_1, o var2_2, j var3_4, j var4_5) {
        block13: {
            if (!uc.o00000) break block13;
            if (c.void(var2_2, (j)var3_4)) ** GOTO lbl-1000
            v0 = var2_2;
            if (c.\u00d500000(v0, c.Object(v0, (j)var3_4)) || var1_1.o00000((q)var3_4)) lbl-1000:
            // 2 sources

            {
                v1 = true;
            } else {
                v1 = var5_6 = false;
            }
            if (m.new && !var5_6) {
                var6_8 = "Not singleClassifierType and not intersection subType: ".concat(String.valueOf(var3_4));
                throw new AssertionError((Object)var6_8);
            }
            v2 = var5_6 = c.void(var2_2, (j)var4_5) != false || var1_1.o00000((q)var4_5) != false;
            if (m.new && !var5_6) {
                var6_9 = "Not singleClassifierType superType: ".concat(String.valueOf(var4_5));
                throw new AssertionError((Object)var6_9);
            }
        }
        if (!nb.o00000.o00000((cb)var1_1, (j)var3_4, (j)var4_5)) {
            return false;
        }
        var5_7 = this.\u00d300000((cb)var1_1, var2_2, (j)var3_4, (j)var4_5);
        if (var5_7 != null) {
            var2_3 = var5_7.booleanValue();
            cb.o00000((cb)var1_1, (q)var3_4, (q)var4_5, false, 4, null);
            return var2_3;
        }
        var5_7 = c.Object(var2_2, (j)var4_5);
        v3 = var2_2;
        if (v3.o00000(c.Object(v3, (j)var3_4), (g)var5_7) && c.\u00f400000(var2_2, (g)var5_7) == 0) {
            return true;
        }
        v4 = var2_2;
        if (c.\u00d400000(v4, c.Object(v4, (j)var4_5))) {
            return true;
        }
        var6_10 = this.super((cb)var1_1, var2_2, this.super((cb)var1_1, (j)var3_4, (g)var5_7));
        switch (var6_10.size()) {
            case 0: {
                return this.super((cb)var1_1, var2_2, (j)var3_4);
            }
            case 1: {
                v5 = var2_2;
                return this.super((cb)var1_1, v5, c.\u00f600000(v5, (j)mc.oO0000((Iterable)var6_10)), (j)var4_5);
            }
        }
        if (this.super(var2_2, (cb)var1_1, (j)var3_4, (j)var4_5, (g)var5_7, var6_10)) {
            return true;
        }
        v6 = var1_1;
        v7 = var1_1;
        var1_1 = var4_5;
        var3_4 = v7;
        var4_5 = var6_10;
        return v6.o00000(new uc$_b$0((Collection)var4_5, (cb)var3_4, var2_2, (j)var1_1));
    }

    private final Collection super(cb cb2, o o2, List object) {
        if (object.size() > 1) {
            Object object2 = cb2.new();
            w w2 = object2 instanceof w ? (w)object2 : null;
            boolean bl = w2 != null ? w2.new() : false;
            if (bl) {
                Object object3;
                object2 = (Iterable)object;
                Collection collection = new LinkedHashSet();
                Object object4 = object2.iterator();
                while (object4.hasNext()) {
                    object3 = object4.next();
                    object2 = (j)object3;
                    Collection collection2 = collection;
                    Object object5 = c.public(o2, cb2.\u00d300000((q)object2));
                    if (object5 == null) {
                        object5 = object2;
                    }
                    collection2.add(object5);
                }
                object = (Set)collection;
                if (object.size() == 1) {
                    return (Collection)object;
                }
                object2 = new LinkedHashSet();
                collection = new LinkedHashSet();
                object = object.iterator();
                while (object.hasNext()) {
                    object4 = (j)object.next();
                    object3 = cb2.\u00d500000().o00000((j)object4);
                    if (!collection.add(object3)) continue;
                    object2.add(object4);
                }
                return (Collection)object2;
            }
        }
        object = (Iterable)object;
        Iterable iterable = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        for (Object object2 : iterable) {
            object2 = (j)object2;
            Iterable<Object> iterable2 = object;
            Object object6 = c.public(o2, cb2.\u00d300000((q)object2));
            if (object6 == null) {
                object6 = object2;
            }
            iterable2.add(object6);
        }
        return (Collection)object;
    }

    private final boolean super(o o2, cb cb2, j j2, j j3, g g2, Collection collection) {
        t t2 = new t(c.\u00f400000(o2, g2));
        int n2 = c.\u00f400000(o2, g2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object;
            o o3 = o2;
            if (c.o00000(o3, c.o00000(o3, g2, i2)) != y.o00000) {
                return false;
            }
            Object object2 = object = (Iterable)collection;
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            object2 = object2.iterator();
            while (object2.hasNext()) {
                bb bb2;
                Object object3 = object2.next();
                object3 = (j)object3;
                Iterable iterable = object;
                Object object4 = c.o00000(o2, object3, i2);
                if (object4 == null || (object4 = c.Object(o2, bb2 = object4) == y.return ? object4 : null) == null || (object4 = c.\u00d200000(o2, (bb)object4)) == null) {
                    throw new IllegalStateException(("Incorrect type: " + object3 + ", subType: " + j2 + ", superType: " + j3).toString());
                }
                iterable.add(object4);
            }
            object = (List)object;
            o o4 = o2;
            object = c.OO0000(o4, o4.o00000((Collection)object));
            t2.add(object);
        }
        return this.super(cb2, o2, t2, j3);
    }

    private final boolean super(o o2, q object, q q2, g g2) {
        block7: {
            block6: {
                if (!((object = c.public(o2, (q)object)) instanceof b.t.c.b.b.h.c.ab) || c.o00000(o2, (b.t.c.b.b.h.c.ab)object)) break block6;
                o o3 = o2;
                if (c.o00000(o3, c.o00000(o3, c.Object(o2, (b.t.c.b.b.h.c.ab)object)))) break block7;
            }
            return false;
        }
        if (c.\u00d400000(o2, (b.t.c.b.b.h.c.ab)object) != x.\u00d300000) {
            return false;
        }
        object = c.\u00d500000(o2, q2);
        s s2 = object instanceof s ? (s)object : null;
        if (s2 == null) {
            return false;
        }
        object = s2;
        if ((object = c.o00000(o2, (s)object)) != null) {
            return c.o00000(o2, (r)object, g2);
        }
        return false;
    }

    public final boolean super(cb cb2, o o2, h h2, j j2) {
        int n2;
        g g2 = c.Object(o2, j2);
        int n3 = c.o00000(o2, h2);
        if (n3 != (n2 = c.\u00f400000(o2, g2)) || n3 != c.\u00d600000(o2, (q)j2)) {
            return false;
        }
        for (n3 = 0; n3 < n2; ++n3) {
            boolean bl;
            q q2;
            boolean bl2;
            Object object = c.o00000(o2, (q)j2, n3);
            if (c.\u00d200000(o2, (bb)object) == null) continue;
            Object object2 = c.o00000(o2, h2, n3);
            boolean bl3 = bl2 = c.Object(o2, (bb)object2) == y.return;
            if (m.new && !bl2) {
                object2 = "Incorrect sub argument: ".concat(String.valueOf(object2));
                throw new AssertionError(object2);
            }
            q q3 = c.\u00d200000(o2, (bb)object2);
            o o3 = o2;
            y y2 = this.super(c.o00000(o3, c.o00000(o3, g2, n3)), c.Object(o2, (bb)object));
            if (y2 == null) {
                return cb2.\u00d800000();
            }
            object = y2;
            if (y2 == y.return ? this.super(o2, q3, q2, g2) || this.super(o2, q2, q3, g2) : false) continue;
            cb cb3 = cb2;
            object2 = q3;
            if (cb.o00000(cb3) > 100) {
                throw new IllegalStateException("Arguments depth is too high. Some related argument: ".concat(String.valueOf(object2)).toString());
            }
            int n4 = cb.o00000(cb3);
            cb.o00000(cb3, n4 + 1);
            switch (uc$_c.new[((Enum)object).ordinal()]) {
                case 1: {
                    bl = \u00d200000.\u00d200000(cb2, q3, q2);
                    break;
                }
                case 2: {
                    bl = uc.super(\u00d200000, cb2, q3, q2, false, 8, null);
                    break;
                }
                case 3: {
                    bl = uc.super(\u00d200000, cb2, q2, q3, false, 8, null);
                    break;
                }
                default: {
                    throw new qd();
                }
            }
            n4 = bl ? 1 : 0;
            int n5 = cb.o00000(cb3);
            cb.o00000(cb3, n5 + -1);
            if (n4 != 0) continue;
            return false;
        }
        return true;
    }

    private final boolean super(o o2, q q2) {
        o o3 = o2;
        return c.void(o3, c.\u00d500000(o3, q2)) && !c.oO0000(o2, q2) && !c.\u00d2O0000(o2, q2) && !c.\u00d4O0000(o2, q2) && !c.float(o2, q2);
    }

    public final y super(y y2, y y3) {
        if (y2 == y.return) {
            return y3;
        }
        if (y3 == y.return) {
            return y2;
        }
        if (y2 == y3) {
            return y2;
        }
        return null;
    }

    private final boolean super(o o2, j j2, j j3) {
        if (c.Object(o2, j2) != c.Object(o2, j3)) {
            return false;
        }
        if (!c.float(o2, j2) && c.float(o2, j3)) {
            return false;
        }
        return !c.\u00f600000(o2, (q)j2) || c.\u00f600000(o2, (q)j3);
    }

    private final Boolean \u00d200000(cb object, o object2, j j2, j j3) {
        block24: {
            block23: {
                boolean bl;
                Object object32;
                if (c.\u00f500000((o)object2, (q)j2) || c.\u00f500000((o)object2, (q)j3)) {
                    if (((cb)object).\u00d800000()) {
                        return Boolean.TRUE;
                    }
                    if (c.\u00f600000((o)object2, (q)j2) && !c.\u00f600000((o)object2, (q)j3)) {
                        return Boolean.FALSE;
                    }
                    o o2 = object2;
                    return ab.o00000.o00000(o2, (q)(c.\u00f500000(o2, (q)j2) ? j2 : c.o00000((o)object2, j2, false)), (q)(c.\u00f500000((o)object2, (q)j3) ? j3 : c.o00000((o)object2, j3, false)));
                }
                if (c.\u00d500000((o)object2, j2) && c.\u00d500000((o)object2, j3)) {
                    return this.super((o)object2, j2, j3) || ((cb)object).\u00f500000();
                }
                if (c.\u00d600000((o)object2, j2) || c.\u00d600000((o)object2, j3)) {
                    return ((cb)object).\u00f500000();
                }
                Object object4 = c.\u00d400000((o)object2, j3);
                Object object5 = object32 = object4 != null ? c.\u00d200000((o)object2, (b.t.c.b.b.h.c.ab)object4) : null;
                if (object4 != null && object32 != null) {
                    object32 = c.\u00f600000((o)object2, (q)j3) ? c.o00000((o)object2, (q)object32, true) : (c.float((o)object2, j3) ? c.Object((o)object2, (q)object32) : object32);
                    switch (uc$_c.o00000[((cb)object).o00000(j2, (b.t.c.b.b.h.c.ab)object4).ordinal()]) {
                        case 1: {
                            return uc.super(this, (cb)object, j2, (q)object32, false, 8, null);
                        }
                        case 2: {
                            if (!uc.super(this, (cb)object, j2, (q)object32, false, 8, null)) break;
                            return Boolean.TRUE;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            throw new qd();
                        }
                    }
                }
                if (c.\u00d500000((o)object2, (g)(object32 = c.Object((o)object2, j3)))) {
                    boolean bl2;
                    boolean bl3;
                    boolean bl4 = bl3 = !c.\u00f600000((o)object2, (q)j3);
                    if (m.new && !bl3) {
                        object = "Intersection type should not be marked nullable!: ".concat(String.valueOf(j3));
                        throw new AssertionError(object);
                    }
                    Iterable iterable = c.o00000((o)object2, (g)object32);
                    if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                        for (Object object32 : iterable) {
                            if (uc.super(\u00d200000, (cb)object, j2, (q)object32, false, 8, null)) continue;
                            bl2 = false;
                            break;
                        }
                    } else {
                        bl2 = true;
                    }
                    return bl2;
                }
                object4 = c.Object((o)object2, j2);
                if (j2 instanceof b.t.c.b.b.h.c.ab) break block23;
                if (!c.\u00d500000((o)object2, (g)object4)) break block24;
                object = c.o00000((o)object2, (g)object4);
                if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                    object4 = object.iterator();
                    while (object4.hasNext()) {
                        if ((q)object4.next() instanceof b.t.c.b.b.h.c.ab) continue;
                        bl = false;
                        break;
                    }
                } else {
                    bl = true;
                }
                if (!bl) break block24;
            }
            if ((object = this.super((o)object2, (q)j3, (q)j2)) != null && c.o00000((o)object2, (r)object, c.Object((o)object2, j3))) {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private final r super(o var1_1, q var2_2, q var3_3) {
        var5_5 = c.\u00d600000(var1_1, var2_2);
        for (var4_4 = 0; var4_4 < var5_5; ++var4_4) {
            var6_6 = c.o00000(var1_1, var2_2, var4_4);
            var7_7 = var6_6;
            var7_7 = c.o00000(var1_1, (bb)var7_7) == false != false ? var6_6 : null;
            if (var7_7 == null || (var6_6 = c.\u00d200000(var1_1, (bb)var7_7)) == null) continue;
            v0 = var1_1;
            if (!c.\u00d200000(v0, (q)c.void(v0, (q)var6_6))) ** GOTO lbl-1000
            v1 = var1_1;
            if (c.\u00d200000(v1, (q)c.void(v1, var3_3))) {
                v2 = true;
            } else lbl-1000:
            // 2 sources

            {
                v2 = var7_8 = false;
            }
            if (fc.o00000(var6_6, (Object)var3_3) || var7_8 && fc.o00000((Object)c.\u00d500000(var1_1, (q)var6_6), (Object)c.\u00d500000(var1_1, var3_3))) {
                v3 = var1_1;
                return c.o00000(v3, c.\u00d500000(v3, var2_2), var4_4);
            }
            if ((var6_6 = this.super(var1_1, (q)var6_6, var3_3)) == null) continue;
            return var6_6;
        }
        return null;
    }

    private final List super(cb cb2, o o2, j object, g g2) {
        List list = c.o00000(o2, (j)object, g2);
        if (list != null) {
            return list;
        }
        if (!c.\u00f500000(o2, g2) && c.o00000(o2, (j)object)) {
            return mc.\u00d500000();
        }
        if (c.Object(o2, g2)) {
            o o3 = o2;
            if (o3.o00000(c.Object(o3, (j)object), g2)) {
                j j2 = o2.o00000((j)object, x.\u00d300000);
                if (j2 == null) {
                    j2 = object;
                }
                return mc.o00000(j2);
            }
            return mc.\u00d500000();
        }
        list = new d();
        cb cb3 = cb2;
        cb3.o00000();
        ArrayDeque arrayDeque = cb3.\u00d400000();
        Set set = cb3.return();
        arrayDeque.push(object);
        while (!((Collection)arrayDeque).isEmpty()) {
            Iterator iterator;
            Object object2;
            q q22 = (j)arrayDeque.pop();
            if (!set.add(q22)) continue;
            object = q22;
            j j3 = o2.o00000((j)object, x.\u00d300000);
            if (j3 == null) {
                j3 = object;
            }
            object = j3;
            o o4 = o2;
            if (o4.o00000(c.Object(o4, (j)object), g2)) {
                list.add(object);
                object2 = cb$_c$_c.o00000;
            } else {
                object2 = object = c.\u00d600000(o2, (q)object) == 0 ? (cb$_c)cb$_c$_e.\u00d300000 : cb2.new().\u00d800000((j)object);
            }
            if ((!fc.o00000(object2, (Object)cb$_c$_c.o00000) ? object : null) == null) continue;
            iterator = iterator;
            o o5 = cb3.new();
            for (q q22 : o5.if(o5.\u00d500000((j)q22))) {
                q22 = ((cb$_c)((Object)iterator)).o00000(cb3, q22);
                arrayDeque.add(q22);
            }
        }
        cb3.\u00f400000();
        return list;
    }

    private final List \u00d300000(cb cb2, o o2, j j2, g g2) {
        return this.super(o2, this.super(cb2, o2, j2, g2));
    }

    private final List super(o object, List list) {
        if (list.size() < 2) {
            return list;
        }
        Object object2 = list;
        Collection collection = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            boolean bl;
            Object e2;
            block4: {
                e2 = object2.next();
                Object object3 = (j)e2;
                object3 = c.\u00f600000((o)object, (j)object3);
                Object object4 = object;
                int n2 = object4.o00000((h)object3);
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n3 = i2;
                    Object object5 = object4.o00000((h)object3, n3);
                    if (((object5 = c.\u00d200000((o)object, (bb)object5)) != null ? c.o00000((o)object, (q)object5) : null) == null) continue;
                    bl = false;
                    break block4;
                }
                bl = true;
            }
            if (!bl) continue;
            collection.add(e2);
        }
        object = (List)collection;
        if (!((Collection)object).isEmpty()) {
            return object;
        }
        return list;
    }

    public final List super(cb object, j j2, g g2) {
        cb cb2 = object;
        object = ((cb)object).new();
        return \u00d200000.\u00d200000(cb2, (o)object, j2, g2);
    }

    public final List \u00d200000(cb cb2, o o2, j object5, g g2) {
        Object object2;
        if (c.o00000(o2, (j)object5)) {
            return this.\u00d300000(cb2, o2, (j)object5, g2);
        }
        if (!c.\u00f500000(o2, g2) && !c.\u00d600000(o2, g2)) {
            return this.super(cb2, o2, (j)object5, g2);
        }
        d d2 = new d();
        cb cb3 = cb2;
        cb3.o00000();
        Object object3 = cb3.\u00d400000();
        Set set = cb3.return();
        ((ArrayDeque)object3).push(object5);
        while (!((Collection)object3).isEmpty()) {
            Iterator iterator;
            Object object4;
            object5 = (j)((ArrayDeque)object3).pop();
            if (!set.add(object5)) continue;
            object2 = object5;
            if (c.o00000(o2, (j)object2)) {
                d2.add(object2);
                object4 = cb$_c$_c.o00000;
            } else {
                object4 = object2 = (cb$_c)cb$_c$_e.\u00d300000;
            }
            if ((!fc.o00000(object4, (Object)cb$_c$_c.o00000) ? object2 : null) == null) continue;
            iterator = iterator;
            o o3 = cb3.new();
            for (Object object5 : o3.if(o3.\u00d500000((j)object5))) {
                object5 = ((cb$_c)((Object)iterator)).o00000(cb3, (q)object5);
                ((ArrayDeque)object3).add(object5);
            }
        }
        cb3.\u00f400000();
        object5 = d2;
        object2 = new ArrayList();
        object3 = object5.iterator();
        while (object3.hasNext()) {
            object5 = (j)object3.next();
            object5 = \u00d200000.\u00d300000(cb2, o2, (j)object5, g2);
            mc.new((Collection)object2, (Iterable)object5);
        }
        return (List)object2;
    }

    public final boolean super(cb cb2, q q2, q q3) {
        return uc.super(this, cb2, q2, q3, false, 8, null);
    }

    private static final boolean super(o o2, cb cb2, j iterator, j j2, boolean bl) {
        if (!((iterator = (Iterable)c.\u00f500000(o2, (j)((Object)iterator))) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                q q2 = (q)iterator.next();
                if (!(fc.o00000((Object)c.\u00d500000(o2, q2), (Object)c.Object(o2, j2)) || bl && uc.super(\u00d200000, cb2, j2, q2, false, 8, null))) continue;
                return true;
            }
        }
        return false;
    }

    private static final boolean \u00d300000(o o2, j iterator) {
        if ((iterator = c.Object(o2, (j)((Object)iterator))) instanceof l) {
            boolean bl;
            if (!((iterator = (Iterable)c.o00000(o2, (g)((Object)iterator))) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    q q2 = (q)iterator.next();
                    boolean bl2 = (q2 = c.public(o2, q2)) != null ? c.\u00f400000(o2, (j)q2) : false;
                    if (!bl2) continue;
                    bl = true;
                    break;
                }
            } else {
                bl = false;
            }
            if (bl) {
                return true;
            }
        }
        return false;
    }

    private static final boolean super(o o2, j object) {
        if (!(object instanceof b.t.c.b.b.h.c.ab)) {
            return false;
        }
        o o3 = o2;
        object = c.o00000(o3, c.Object(o3, (b.t.c.b.b.h.c.ab)object));
        if ((object = c.\u00d200000(o2, (bb)object)) != null && (object = c.\u00f400000(o2, (q)object)) != null) {
            return c.\u00f400000(o2, (j)object);
        }
        return false;
    }

    private static final boolean \u00d200000(o o2, j j2) {
        return c.\u00f400000(o2, j2) || uc.super(o2, j2);
    }

    private static final boolean super(cb cb2, o o2, j j2, j j3) {
        o o3 = o2;
        return \u00d200000.super(cb2, o3, c.\u00f600000(o3, j2), j3);
    }

    private static final i super(Collection object, cb cb2, o o2, j j2, cb$_d cb$_d) {
        object = object.iterator();
        while (object.hasNext()) {
            j j3;
            j j4 = j3 = (j)object.next();
            j3 = j2;
            j j5 = j4;
            o o3 = o2;
            cb cb3 = cb2;
            cb$_d.o00000(new uc$_b$1(cb3, o3, j5, j3));
        }
        return i.o00000;
    }

    static /* synthetic */ i \u00d200000(Collection collection, cb cb2, o o2, j j2, cb$_d cb$_d) {
        return uc.super(collection, cb2, o2, j2, cb$_d);
    }

    static /* synthetic */ boolean \u00d400000(cb cb2, o o2, j j2, j j3) {
        return uc.super(cb2, o2, j2, j3);
    }
}

