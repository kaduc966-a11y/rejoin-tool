/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.qb;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.cb;
import b.t.c.b.b.n.c.d;
import b.t.c.b.b.n.c.g;
import b.t.c.b.b.n.c.g.p;
import b.t.c.b.b.n.c.g.r;
import b.t.c.b.b.n.c.t;
import b.t.c.b.b.n.c.w$_b$0;
import b.t.c.b.b.n.c.w$_b$2;
import b.t.c.b.b.n.c.w$_c;
import b.t.c.b.b.n.c.w$_d$1;
import b.t.c.b.b.n.c.x;
import b.t.c.b.b.n.c.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class w {
    private static final w$_c \u00d400000;
    private final d o00000;
    private final ConcurrentHashMap new;
    private static final Map \u00d300000;

    public w(d d2) {
        this.o00000 = d2;
        this.new = new ConcurrentHashMap();
    }

    protected abstract Iterable \u00f600000(Object var1);

    protected abstract Object \u00f800000(Object var1);

    protected abstract k \u00d800000(Object var1);

    protected abstract Iterable o00000(Object var1, boolean var2);

    private final Object \u00d200000(Object iterator, k k2) {
        for (Object t2 : this.\u00f600000(iterator)) {
            Object t3 = t2;
            if (!fc.o00000((Object)this.\u00d800000(t3), (Object)k2)) continue;
            return t2;
        }
        return null;
    }

    private final boolean o00000(Object iterator, k k2) {
        if (!((iterator = this.\u00f600000(iterator)) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                if (!fc.o00000((Object)this.\u00d800000(t2), (Object)k2)) continue;
                return true;
            }
        }
        return false;
    }

    public abstract boolean o00000();

    public final Object for(Object iterator) {
        if (this.o00000.o00000().\u00d300000()) {
            return null;
        }
        if (mc.\u00d800000((Iterable)x.o00000(), this.\u00d800000(iterator)) || this.o00000((Object)iterator, x.oO0000())) {
            return iterator;
        }
        if (!this.o00000((Object)iterator, x.\u00d500000())) {
            return null;
        }
        ConcurrentMap concurrentMap = this.new;
        Object object = this.\u00f800000(iterator);
        Object object2 = concurrentMap.get(object);
        if (object2 == null) {
            Object v1;
            block7: {
                for (Object object3 : this.\u00f600000(iterator)) {
                    if ((object3 = this.for(object3)) == null) continue;
                    v1 = object3;
                    break block7;
                }
                v1 = null;
            }
            if (v1 == null) {
                return null;
            }
            iterator = v1;
            object2 = concurrentMap.putIfAbsent(object, iterator);
            if (object2 == null) {
                object2 = iterator;
            }
        }
        return object2;
    }

    private final b.t.c.b.b.n.c.r \u00d200000(Object object, boolean bl) {
        if (this.o00000.\u00d200000()) {
            return null;
        }
        b.t.c.b.b.n.c.r r2 = (b.t.c.b.b.n.c.r)z.\u00d200000().get(this.\u00d800000(object));
        if (r2 != null) {
            b.t.c.b.b.n.c.r r3 = r2;
            Object object2 = (object = this.null(object)) != cb.\u00d600000 ? object : null;
            if (object2 == null) {
                return null;
            }
            object = object2;
            b.t.c.b.b.n.c.r r4 = r3;
            return b.t.c.b.b.n.c.r.o00000(r4, r.super(r4.new(), null, bl || ((cb)((Object)object)).super(), 1, null), null, false, false, false, 30, null);
        }
        return null;
    }

    private final cb null(Object object) {
        k k2 = this.\u00d800000(object);
        if (k2 != null && z.o00000().containsKey(k2)) {
            return (cb)((Object)this.o00000.\u00d300000().\u00f800000(k2));
        }
        return this.\u00f500000(object);
    }

    private final Set o00000(Set set) {
        if (set.contains((Object)t.return)) {
            return ub.super(ub.\u00d400000(b.s.z.\u00d3o0000((Object[])t.values()), (Object)t.\u00f400000), set);
        }
        return set;
    }

    private final qb \u00d300000(Object iterator) {
        Object v1;
        Object object4;
        Object object2;
        block5: {
            if (this.o00000.o00000().\u00d300000()) {
                return null;
            }
            Object object3 = this.\u00d200000((Object)iterator, x.\u00d200000());
            if (object3 == null) {
                return null;
            }
            object2 = object3;
            for (Object object4 : this.\u00f600000(iterator)) {
                Object object5 = object4;
                if (!(this.for(object5) != null)) continue;
                v1 = object4;
                break block5;
            }
            v1 = null;
        }
        if (v1 == null) {
            return null;
        }
        iterator = v1;
        object4 = this.o00000(object2, true);
        object2 = new LinkedHashSet();
        for (Object object5 : object4) {
            t t2 = (t)((Object)\u00d300000.get(object5));
            if (t2 == null) continue;
            object5 = t2;
            object2.add(object5);
        }
        object2 = (Set)object2;
        return new qb(iterator, this.o00000((Set)object2));
    }

    public final boolean String(Object iterator) {
        Object object = this.\u00d200000((Object)iterator, d$_b.\u00d5\u00d40000);
        if (object == null) {
            return false;
        }
        iterator = object;
        if (!((iterator = this.o00000((Object)iterator, false)) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                if (!fc.o00000((Object)((String)iterator.next()), (Object)"TYPE")) continue;
                return true;
            }
        }
        return false;
    }

    private final cb \u00f500000(Object object) {
        cb cb2 = this.\u00d200000(object);
        if (cb2 != null) {
            return cb2;
        }
        return this.o00000.o00000().super();
    }

    private final cb \u00d200000(Object object) {
        cb cb2;
        block15: {
            Object object2 = (cb)((Object)this.o00000.o00000().\u00d400000().get(this.\u00d800000(object)));
            if (object2 != null) {
                return object2;
            }
            Object object3 = this.\u00d200000(object, x.\u00f800000());
            if (object3 == null || (object3 = this.o00000(object3, false)) == null || (object3 = (String)mc.nullObject((Iterable)object3)) == null) {
                return null;
            }
            object2 = object3;
            cb2 = this.o00000.o00000().\u00d200000();
            if (cb2 != null) break block15;
            switch (object2) {
                case "STRICT": {
                    return cb.super;
                }
                case "WARN": {
                    return cb.\u00d400000;
                }
                case "IGNORE": {
                    return cb.\u00d600000;
                }
            }
            cb2 = null;
        }
        return cb2;
    }

    private final r o00000(Object object, b.o.e.g object2) {
        Object object3 = this.\u00d300000(object, (Boolean)object2.\u00f800000(object));
        if (object3 != null) {
            return object3;
        }
        Object object4 = this.for(object);
        if (object4 == null) {
            return null;
        }
        object3 = object4;
        if (((cb)((Object)(object = this.\u00f500000(object)))).\u00d400000()) {
            return null;
        }
        if ((object2 = this.\u00d300000(object3, (Boolean)object2.\u00f800000(object3))) != null) {
            return r.super((r)object2, null, ((cb)((Object)object)).super(), 1, null);
        }
        return null;
    }

    public final r \u00d200000(Iterable object, b.o.e.g object2) {
        Iterable iterable = object;
        object = object2;
        object2 = this;
        return this.o00000(iterable, (b.o.e.g)new w$_b$0((w)object2, (b.o.e.g)object));
    }

    private final r \u00d600000(Object object) {
        p p2;
        k k2 = this.\u00d800000(object);
        if (k2 == null) {
            return null;
        }
        object = k2;
        Object object2 = k2;
        if (x.\u00d2O0000().contains(object2)) {
            p2 = p.\u00d400000;
        } else if (x.private().contains(object2)) {
            p2 = p.Object;
        } else {
            return null;
        }
        p p3 = p2;
        object2 = (cb)((Object)this.o00000.\u00d300000().\u00f800000(object));
        if (((cb)((Object)object2)).\u00d400000()) {
            return null;
        }
        if (((cb)((Object)object2)).super() && !this.o00000()) {
            return null;
        }
        return new r((Object)p3, ((cb)((Object)object2)).super());
    }

    public final r o00000(Iterable iterable) {
        return this.o00000(iterable, (b.o.e.g)new w$_d$1(this));
    }

    private final r o00000(Iterable object, b.o.e.g g2) {
        r r2 = null;
        object = object.iterator();
        while (object.hasNext()) {
            r r3;
            Object e2 = object.next();
            r r4 = r2;
            r2 = (r)e2;
            e2 = r4;
            r2 = (r)g2.\u00f800000(r2);
            if (e2 == null) {
                r3 = r2;
            } else if (r2 == null || fc.o00000((Object)r2, e2)) {
                r3 = e2;
            } else if (r2.super() && !((r)e2).super()) {
                r3 = e2;
            } else if (!r2.super() && ((r)e2).super()) {
                r3 = r2;
            } else {
                return null;
            }
            r2 = r3;
        }
        return r2;
    }

    private final b.t.c.b.b.n.c.r String(Object object, boolean bl) {
        Object object2 = this.\u00d200000(object, bl);
        if (object2 != null) {
            return object2;
        }
        qb qb2 = this.\u00d300000(object);
        if (qb2 == null) {
            return null;
        }
        object2 = qb2;
        Object object3 = qb2.\u00d400000();
        object2 = (Set)((qb)object2).\u00d300000();
        Object object4 = this.\u00d200000(object);
        if (object4 == null) {
            object4 = object = this.\u00f500000(object3);
        }
        if (object4.\u00d400000()) {
            return null;
        }
        r r2 = this.o00000(object3, (b.o.e.g)w$_b$2.\u00f40\u00d5000);
        if (r2 == null) {
            return null;
        }
        object3 = r2;
        return new b.t.c.b.b.n.c.r(r.super((r)object3, null, bl || ((cb)((Object)object)).super(), 1, null), (Collection)object2, false, false, false, 28, null);
    }

    public final g o00000(g g2, Iterable object, boolean bl) {
        EnumMap enumMap;
        Object object2;
        Object object3;
        if (this.o00000.\u00d200000()) {
            return g2;
        }
        Object object4 = object;
        Iterator iterator = new ArrayList();
        Object object5 = object4.iterator();
        while (object5.hasNext()) {
            object = object5.next();
            b.t.c.b.b.n.c.r r2 = this.String(object, bl);
            if (r2 == null) continue;
            object = r2;
            iterator.add(object);
        }
        object = (List)((Object)iterator);
        if (object.isEmpty()) {
            return g2;
        }
        EnumMap enumMap2 = new EnumMap(t.class);
        object = object.iterator();
        while (object.hasNext()) {
            object4 = (b.t.c.b.b.n.c.r)object.next();
            for (t t2 : ((b.t.c.b.b.n.c.r)object4).\u00d400000()) {
                if (!((Map)enumMap2).containsKey((Object)t2) || !this.o00000()) {
                    ((Map)enumMap2).put(t2, object4);
                    continue;
                }
                if ((b.t.c.b.b.n.c.r)enumMap2.get((Object)t2) == null) continue;
                object2 = ((b.t.c.b.b.n.c.r)object3).new();
                object5 = ((b.t.c.b.b.n.c.r)object4).new();
                ((Map)enumMap2).put(t2, fc.o00000(object5, object2) ? object3 : (((r)object5).super() && !((r)object2).super() ? object3 : (!((r)object5).super() && ((r)object2).super() ? object4 : null)));
            }
        }
        Object object6 = g2;
        if (object6 != null && (object6 = ((g)object6).o00000()) != null) {
            object3 = object6;
            enumMap = new EnumMap(object3);
        } else {
            enumMap = new EnumMap(t.class);
        }
        object = enumMap;
        boolean bl2 = false;
        for (Map.Entry entry : ((Map)enumMap2).entrySet()) {
            object3 = (t)((Object)entry.getKey());
            object2 = (b.t.c.b.b.n.c.r)entry.getValue();
            if (object2 == null) continue;
            ((Map)object).put(object3, object2);
            bl2 = true;
        }
        if (!bl2) {
            return g2;
        }
        return new g((EnumMap)object);
    }

    public static /* synthetic */ g o00000(w w2, g g2, Iterable iterable, boolean bl, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extractAndMergeDefaultQualifiers");
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return w2.o00000(g2, iterable, bl);
    }

    /*
     * Unable to fully structure code
     */
    private final r \u00d300000(Object var1_1, boolean var2_2) {
        block10: {
            block13: {
                block14: {
                    block12: {
                        block11: {
                            block9: {
                                v0 = this.\u00d800000(var1_1);
                                if (v0 == null) {
                                    return null;
                                }
                                var3_3 = v0;
                                var4_4 = (cb)this.o00000.\u00d300000().\u00f800000(var3_3);
                                if (var4_4.\u00d400000()) {
                                    return null;
                                }
                                if (!x.null().contains(var3_3)) break block9;
                                v1 = b.t.c.b.b.n.c.g.d.class;
                                break block10;
                            }
                            if (!x.\u00d300000().contains(var3_3)) break block11;
                            v1 = b.t.c.b.b.n.c.g.d.\u00d400000;
                            break block10;
                        }
                        if (!x.\u00d800000().contains(var3_3)) break block12;
                        v1 = b.t.c.b.b.n.c.g.d.\u00d300000;
                        break block10;
                    }
                    if (!fc.o00000((Object)var3_3, (Object)x.String())) break block13;
                    if ((var1_1 = (String)mc.nullObject(this.o00000(var1_1, false))) == null) ** GOTO lbl35
                    switch (var1_1.hashCode()) {
                        case 73135176: {
                            if (var1_1.equals("MAYBE")) break;
                            ** break;
                        }
                        case 74175084: {
                            if (var1_1.equals("NEVER")) break;
                            ** break;
                        }
                        case 433141802: {
                            if (!var1_1.equals("UNKNOWN")) {
                                ** break;
                            }
                            break block14;
                        }
                        case 1933739535: {
                            if (!var1_1.equals("ALWAYS")) ** break;
lbl35:
                            // 2 sources

                            v1 = b.t.c.b.b.n.c.g.d.class;
                            break block10;
                        }
                    }
                    v1 = b.t.c.b.b.n.c.g.d.\u00d400000;
                    break block10;
                }
                v1 = b.t.c.b.b.n.c.g.d.\u00d300000;
                break block10;
lbl42:
                // 5 sources

                return null;
            }
            return null;
        }
        var1_1 = v1;
        return new r(var1_1, var4_4.super() != false || var2_2 != false);
    }

    private static final r \u00d200000(w w2, b.o.e.g g2, Object object) {
        return w2.o00000(object, g2);
    }

    private static final boolean \u00d500000(Object object) {
        return false;
    }

    public static final /* synthetic */ r o00000(w w2, Object object) {
        return w2.\u00d600000(object);
    }

    static {
        Map map;
        \u00d400000 = new w$_c(null);
        Map map2 = map = (Map)new LinkedHashMap();
        t[] tArray = t.values();
        int n2 = tArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map3 = map2;
            t t2 = tArray[i2];
            String string = t2.o00000();
            if (map3.get(string) != null) continue;
            map3.put(string, t2);
        }
        \u00d300000 = map;
    }

    static /* synthetic */ r o00000(w w2, b.o.e.g g2, Object object) {
        return w.\u00d200000(w2, g2, object);
    }

    static /* synthetic */ boolean o00000(Object object) {
        return w.\u00d500000(object);
    }
}

