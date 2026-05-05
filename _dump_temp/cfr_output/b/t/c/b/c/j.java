/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.s.mc;
import b.s.y;
import b.t.c.b.c.b;
import b.t.c.b.c.f;
import b.t.c.b.c.j$_b;
import b.t.c.b.c.l;
import b.t.c.b.c.n;
import b.t.q;
import b.t.u;
import b.t.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j {
    public static final j$_b \u00d300000 = new j$_b(null);
    private final Map o00000;
    private static final j new = new j(y.Object());

    public j(Map map) {
        this.o00000 = map;
    }

    public final q o00000(u u2, b.t.l object) {
        u u3;
        Object object2;
        if (this.o00000.isEmpty()) {
            return new q((b.t.l)((Object)object), u2);
        }
        n n2 = u2 instanceof n ? (n)u2 : null;
        Object object3 = n2 != null ? n2.\u00d8\u00d8\u00d2000() : null;
        n n3 = u2 instanceof n ? (n)u2 : null;
        Object object4 = object2 = n3 != null ? n3.\u00d4\u00d8\u00d2000() : null;
        if (object3 != null && object2 != null) {
            j j2 = this;
            object3 = j2.o00000(j2.o00000((u)object3, (b.t.l)((Object)object)));
            j j3 = this;
            object = j3.\u00d200000(j3.o00000((u)object2, (b.t.l)((Object)object))).o00000();
            object2 = ((q)object3).o00000();
            if (object != null && object2 != null) {
                return new q(((q)object3).new(), f.o00000((u)object2, (u)object));
            }
            return q.\u00d400000.o00000();
        }
        v v2 = u2.privatevoid();
        if (v2 == null) {
            return new q((b.t.l)((Object)object), u2);
        }
        object3 = v2;
        object2 = (q)this.o00000.get(object3);
        if (object2 != null) {
            u u4 = ((q)object2).o00000();
            object3 = ((q)object2).new();
            if (u4 != null && object3 != null) {
                return new q(b.o00000((b.t.l)((Object)object3), (b.t.l)((Object)object)), this.o00000(u4, u2));
            }
            return object2;
        }
        b.t.l l2 = object;
        if (u2.\u00f5\u00f60000().isEmpty()) {
            u3 = u2;
        } else {
            Collection<q> collection;
            object = u2.\u00f5\u00f60000();
            Object object5 = object3;
            b.t.l l3 = l2;
            object3 = object;
            Collection collection2 = new ArrayList(mc.o00000((Iterable)object, 10));
            object = object3.iterator();
            while (object.hasNext()) {
                object3 = object.next();
                object3 = (q)object3;
                collection = collection2;
                object2 = ((q)object3).new();
                collection.add((object3 = ((q)object3).o00000()) != null && object2 != null ? this.o00000((u)object3, (b.t.l)((Object)object2)) : q.\u00d400000.o00000());
            }
            collection = (List)collection2;
            l2 = l3;
            n n4 = u2 instanceof n ? (n)u2 : null;
            u3 = b.t.b.b.super((v)object5, (List)collection, u2.\u00f4\u00f60000(), u2.\u00d8\u00f50000(), n4 != null ? n4.\u00f4\u00d8\u00d2000() : null);
        }
        u2 = u3;
        object = l2;
        return new q((b.t.l)((Object)object), u2);
    }

    public static /* synthetic */ q o00000(j j2, u u2, b.t.l l2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            l2 = b.t.l.\u00d500000;
        }
        return j2.o00000(u2, l2);
    }

    public final j o00000(j object) {
        if (this.o00000.isEmpty()) {
            return object;
        }
        if (((j)object).o00000.isEmpty()) {
            return this;
        }
        Map map = this.o00000;
        Map map2 = map;
        map = new LinkedHashMap(y.\u00d200000(map.size()));
        for (Object object2 : (Iterable)map2.entrySet()) {
            Object object3 = (Map.Entry)object2;
            Object object4 = map;
            object2 = (Map.Entry)object2;
            Object k2 = object3.getKey();
            Map map3 = object4;
            object2 = (q)object2.getValue();
            object3 = ((q)object2).o00000();
            object4 = ((q)object2).new();
            object2 = object3 != null && object4 != null ? ((j)object).o00000((u)object3, (b.t.l)((Object)object4)) : object2;
            map3.put(k2, object2);
        }
        object = map;
        return new j((Map)object);
    }

    /*
     * Unable to fully structure code
     */
    private final u o00000(u var1_1, u var2_2) {
        block3: {
            block2: {
                var3_3 = (b.t.c.b.b.h.c.j)var1_1;
                if (!((var1_1 = l.\u00d800000.o00000((b.t.c.b.b.h.c.j)var1_1, var2_2.\u00f4\u00f60000() != false || var1_1.\u00f4\u00f60000() != false)) instanceof n)) break block2;
                v0 = (n)var1_1;
                v1 = var2_2 instanceof n != false ? (n)var2_2 : null;
                if (v1 != null ? v1.privatedosuper() : false) ** GOTO lbl-1000
                v2 = var3_3 instanceof n != false ? (n)var3_3 : null;
                v3 = v2 != null ? v2.privatedosuper() : false;
                if (v3 && !var2_2.\u00f4\u00f60000()) lbl-1000:
                // 2 sources

                {
                    v4 = true;
                } else {
                    v4 = false;
                }
                v5 = v0.nullsuper(v4);
                break block3;
            }
            v5 = var1_1;
        }
        return (u)v5;
    }

    private final q o00000(q q2) {
        u u2 = q2.o00000();
        n n2 = u2 instanceof n ? (n)u2 : null;
        if (n2 != null && (n2 = n2.\u00d8\u00d8\u00d2000()) != null) {
            u2 = n2;
            return new q(q2.new(), u2);
        }
        return q2;
    }

    private final q \u00d200000(q q2) {
        u u2 = q2.o00000();
        n n2 = u2 instanceof n ? (n)u2 : null;
        if (n2 != null && (n2 = n2.\u00d4\u00d8\u00d2000()) != null) {
            u2 = n2;
            return new q(q2.new(), u2);
        }
        return q2;
    }

    public static final /* synthetic */ j o00000() {
        return new;
    }
}

