/*
 * Decompiled with CFR 0.152.
 */
package b.t.b;

import b.i;
import b.o.d.fc;
import b.o.d.z;
import b.pc;
import b.r.b;
import b.r.d.b.q;
import b.t.b.f$_b$1;
import b.t.b.f$_c$1;
import b.t.c.b.hd;
import b.t.c.b.lb;
import b.t.c.b.md;
import b.t.c.b.o;
import b.t.db;
import b.t.k;
import b.t.p;
import b.t.p$_b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f {
    public static final p \u00d400000(db iterator) {
        Object v0;
        block2: {
            iterator = iterator.\u00d8\u00d5O000();
            Object var1_1 = null;
            boolean bl = false;
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                if (!(((p)t2).\u00f5\u00f50000() == p$_b.\u00d400000)) continue;
                if (bl) {
                    v0 = null;
                    break block2;
                }
                var1_1 = t2;
                bl = true;
            }
            v0 = !bl ? null : var1_1;
        }
        return v0;
    }

    public static /* synthetic */ void \u00d800000(db db2) {
    }

    public static final List \u00d200000(db iterator) {
        iterator = iterator.\u00d8\u00d5O000();
        Collection collection = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!(((p)t2).\u00f5\u00f50000() == p$_b.\u00d600000)) continue;
            collection.add(t2);
        }
        return (List)collection;
    }

    public static /* synthetic */ void class(db db2) {
    }

    public static final p \u00d300000(db iterator) {
        Object v0;
        block2: {
            iterator = iterator.\u00d8\u00d5O000();
            Object var1_1 = null;
            boolean bl = false;
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                if (!(((p)t2).\u00f5\u00f50000() == p$_b.class)) continue;
                if (bl) {
                    v0 = null;
                    break block2;
                }
                var1_1 = t2;
                bl = true;
            }
            v0 = !bl ? null : var1_1;
        }
        return v0;
    }

    public static /* synthetic */ void super(db db2) {
    }

    public static final List \u00d600000(db iterator) {
        iterator = iterator.\u00d8\u00d5O000();
        Collection collection = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!(((p)t2).\u00f5\u00f50000() == p$_b.\u00d300000)) continue;
            collection.add(t2);
        }
        return (List)collection;
    }

    public static /* synthetic */ void \u00f400000(db db2) {
    }

    public static final p super(db iterator, String string) {
        Object v0;
        block2: {
            iterator = iterator.\u00d8\u00d5O000();
            Object var2_2 = null;
            boolean bl = false;
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                if (!fc.o00000((Object)((p)t2).O\u00f60000(), (Object)string)) continue;
                if (bl) {
                    v0 = null;
                    break block2;
                }
                var2_2 = t2;
                bl = true;
            }
            v0 = !bl ? null : var2_2;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object super(db var0, Object[] var1_1, b var2_2) {
        if (!(var2_2 instanceof f$_c$1)) ** GOTO lbl-1000
        var4_3 = (f$_c$1)var2_2;
        if ((var4_3.O\u00f8\u00f4000 & -2147483648) != 0) {
            var4_3.O\u00f8\u00f4000 -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            var4_3 = new f$_c$1((b)var2_2);
        }
        var2_2 = var4_3.\u00f8\u00f6\u00f4000;
        var5_4 = b.r.c.b.\u00d200000();
        switch (var4_3.O\u00f8\u00f4000) {
            case 0: {
                pc.o00000(var2_2);
                if (!var0.\u00f4\u00d5O000()) {
                    return var0.o00000(Arrays.copyOf(var1_1 /* !! */ , var1_1 /* !! */ .length));
                }
                if (!(var0 instanceof k)) {
                    throw new IllegalArgumentException("Cannot callSuspend on a property " + var0 + ": suspend properties are not supported yet");
                }
                var4_3.newwhileString = var0;
                var4_3.o\u00f8\u00f4000 = var1_1 /* !! */ ;
                var4_3.O\u00f8\u00f4000 = 1;
                var2_2 = var4_3;
                var3_5 = new b.o.d.b(2);
                var3_5.\u00d200000(var1_1 /* !! */ );
                var3_5.super(var2_2);
                v0 = var3_5;
                v1 = var0.o00000(v0.super(new Object[v0.super()]));
                if (v1 == b.r.c.b.\u00d200000()) {
                    q.\u00d200000(var4_3);
                }
                v2 /* !! */  = v1;
                if (v1 == var5_4) {
                    return var5_4;
                }
                ** GOTO lbl37
            }
            case 1: {
                (Object[])var4_3.o\u00f8\u00f4000;
                var0 = (db)var4_3.newwhileString;
                pc.o00000(var2_2);
                v2 /* !! */  = var1_1 /* !! */  = var2_2;
lbl37:
                // 2 sources

                if (fc.o00000((Object)((k)var0).\u00d5\u00d5O000().privatevoid(), (Object)z.\u00d200000(i.class)) && !((k)var0).\u00d5\u00d5O000().\u00f4\u00f60000()) {
                    return i.o00000;
                }
                return var1_1 /* !! */ ;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /*
     * Unable to fully structure code
     */
    public static final Object super(db var0, Map var1_1, b var2_2) {
        if (!(var2_2 instanceof f$_b$1)) ** GOTO lbl-1000
        var4_3 = (f$_b$1)var2_2;
        if ((var4_3.\u00d8\u00f6\u00f4000 & -2147483648) != 0) {
            var4_3.\u00d8\u00f6\u00f4000 -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            var4_3 = new f$_b$1((b)var2_2);
        }
        var2_2 = var4_3.fordoString;
        var5_4 = b.r.c.b.\u00d200000();
        switch (var4_3.\u00d8\u00f6\u00f4000) {
            case 0: {
                pc.o00000(var2_2);
                if (!var0.\u00f4\u00d5O000()) {
                    return var0.o00000((Map)var1_1);
                }
                if (!(var0 instanceof k)) {
                    throw new IllegalArgumentException("Cannot callSuspendBy on a property " + var0 + ": suspend properties are not supported yet");
                }
                v0 = hd.super(var0);
                if (v0 == null) {
                    throw new lb("This callable does not support a default call: ".concat(String.valueOf(var0)));
                }
                var2_2 = v0;
                var4_3.privatedoString = var0;
                var4_3.\u00f5\u00f6\u00f4000 = var1_1;
                var4_3.\u00f4\u00f6\u00f4000 = var2_2;
                var4_3.\u00d8\u00f6\u00f4000 = 1;
                var3_5 = var4_3;
                v1 = md.o00000((o)var2_2, (Map)var1_1, var3_5);
                if (v1 == b.r.c.b.\u00d200000()) {
                    q.\u00d200000(var4_3);
                }
                v2 = v1;
                if (v1 == var5_4) {
                    return var5_4;
                }
                ** GOTO lbl40
            }
            case 1: {
                (o)var4_3.\u00f4\u00f6\u00f4000;
                (Map)var4_3.\u00f5\u00f6\u00f4000;
                var0 = (db)var4_3.privatedoString;
                pc.o00000(var2_2);
                v2 = var1_1 = var2_2;
lbl40:
                // 2 sources

                if (fc.o00000((Object)((k)var0).\u00d5\u00d5O000().privatevoid(), (Object)z.\u00d200000(i.class)) && !((k)var0).\u00d5\u00d5O000().\u00f4\u00f60000()) {
                    return i.o00000;
                }
                return var1_1;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

