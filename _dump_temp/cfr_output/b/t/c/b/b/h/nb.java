/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.m;
import b.o.d.fc;
import b.t.c.b.b.h.c.ab;
import b.t.c.b.b.h.c.g;
import b.t.c.b.b.h.c.j;
import b.t.c.b.b.h.c.o;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.cb;
import b.t.c.b.b.h.cb$_c;
import b.t.c.b.b.h.cb$_c$_c;
import b.t.c.b.b.h.cb$_c$_d;
import b.t.c.b.b.h.cb$_c$_e;
import b.t.c.b.b.h.uc;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Set;

public final class nb {
    public static final nb o00000 = new nb();

    private nb() {
    }

    public final boolean o00000(cb cb2, j j2, j j3) {
        return this.\u00d200000(cb2, j2, j3);
    }

    /*
     * Unable to fully structure code
     */
    private final boolean \u00d200000(cb var1_1, j var2_2, j var3_3) {
        block12: {
            var4_4 = var1_1.new();
            if (!uc.o00000) break block12;
            if (var4_4.\u00f800000(var2_2)) ** GOTO lbl-1000
            v0 = var4_4;
            if (v0.\u00d800000(v0.\u00d500000(var2_2)) || var1_1.o00000(var2_2)) lbl-1000:
            // 2 sources

            {
                v1 = true;
            } else {
                v1 = var5_5 = false;
            }
            if (m.new && !var5_5) {
                var1_1 = "Not singleClassifierType and not intersection subType: ".concat(String.valueOf(var2_2));
                throw new AssertionError(var1_1);
            }
            v2 = var5_5 = var4_4.\u00f800000(var3_3) != false || var1_1.o00000(var3_3) != false;
            if (m.new && !var5_5) {
                var1_1 = "Not singleClassifierType superType: ".concat(String.valueOf(var3_3));
                throw new AssertionError(var1_1);
            }
        }
        if (var4_4.\u00d8O0000(var3_3)) {
            return true;
        }
        if (var4_4.\u00d5O0000(var2_2)) {
            return true;
        }
        if (var4_4.\u00d400000(var2_2)) {
            return true;
        }
        if (var2_2 instanceof ab && var4_4.\u00d300000((ab)var2_2)) {
            return true;
        }
        if (nb.o00000.o00000((cb)var1_1, var2_2, cb$_c$_e.\u00d300000)) {
            return true;
        }
        if (var4_4.\u00d400000(var3_3)) {
            return false;
        }
        if (nb.o00000.o00000((cb)var1_1, var3_3, cb$_c$_d.\u00d200000)) {
            return false;
        }
        if (var4_4.oO0000(var2_2)) {
            return false;
        }
        return nb.o00000.\u00d200000((cb)var1_1, var2_2, var4_4.\u00d500000(var3_3));
    }

    public final boolean o00000(cb cb2, j j2, cb$_c cb$_c) {
        q q2;
        o o2 = cb2.new();
        if (o2.oO0000((j)(q2 = j2)) && !o2.\u00d8O0000(q2) || o2.\u00d400000((j)q2)) {
            return true;
        }
        cb2.o00000();
        ArrayDeque arrayDeque = cb2.\u00d400000();
        Set set = cb2.return();
        arrayDeque.push(j2);
        while (!((Collection)arrayDeque).isEmpty()) {
            cb$_c cb$_c2;
            Object object;
            j2 = (j)arrayDeque.pop();
            if (!set.add(j2) || (!fc.o00000(object = o2.\u00d8O0000(q2 = j2) ? (cb$_c)cb$_c$_c.o00000 : cb$_c, (Object)cb$_c$_c.o00000) ? object : null) == null) continue;
            cb$_c2 = cb$_c2;
            o o3 = cb2.new();
            object = o3.if(o3.\u00d500000(j2)).iterator();
            while (object.hasNext()) {
                q2 = (q)object.next();
                j2 = cb$_c2.o00000(cb2, q2);
                if (o2.oO0000((j)(q2 = j2)) && !o2.\u00d8O0000(q2) || o2.\u00d400000((j)q2)) {
                    cb2.\u00f400000();
                    return true;
                }
                arrayDeque.add(j2);
            }
        }
        cb2.\u00f400000();
        return false;
    }

    public final boolean \u00d200000(cb cb2, j j2, g g2) {
        o o2 = cb2.new();
        cb cb3 = cb2;
        q q2 = j2;
        if (o00000.o00000(cb2, (j)q2, g2)) {
            return true;
        }
        cb3.o00000();
        ArrayDeque arrayDeque = cb3.\u00d400000();
        Set set = cb3.return();
        arrayDeque.push(j2);
        while (!((Collection)arrayDeque).isEmpty()) {
            cb$_c cb$_c;
            Object object;
            j2 = (j)arrayDeque.pop();
            if (!set.add(j2) || (!fc.o00000(object = o2.\u00d8O0000(q2 = j2) ? (cb$_c)cb$_c$_c.o00000 : (cb$_c)cb$_c$_e.\u00d300000, (Object)cb$_c$_c.o00000) ? object : null) == null) continue;
            cb$_c = cb$_c;
            o o3 = cb3.new();
            object = o3.if(o3.\u00d500000(j2)).iterator();
            while (object.hasNext()) {
                q2 = (q)object.next();
                j2 = cb$_c.o00000(cb3, q2);
                if (o00000.o00000(cb2, (j)(q2 = j2), g2)) {
                    cb3.\u00f400000();
                    return true;
                }
                arrayDeque.add(j2);
            }
        }
        cb3.\u00f400000();
        return false;
    }

    private final boolean o00000(cb cb2, j j2, g g2) {
        o o2 = cb2.new();
        if (o2.\u00d500000((q)j2)) {
            return true;
        }
        if (o2.\u00d8O0000(j2)) {
            return false;
        }
        if (cb2.\u00f500000() && o2.o00000(j2)) {
            return true;
        }
        o o3 = o2;
        return o3.o00000(o3.\u00d500000(j2), g2);
    }
}

