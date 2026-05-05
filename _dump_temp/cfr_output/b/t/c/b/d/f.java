/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.e.bb;
import b.e.m;
import b.t.c.b.d.b;
import b.t.c.b.d.d;
import b.t.c.b.d.f$_b;
import b.t.c.b.d.h$_h$_b;
import b.t.c.b.d.h$_h$_e;
import b.t.c.b.d.i;
import b.t.c.b.hd;
import b.t.c.b.md;
import b.t.c.b.o;
import b.t.c.b.r;
import b.t.c.b.vc;
import b.t.p;
import b.t.p$_b;
import b.t.u;
import b.t.z;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

public final class f
implements b {
    private final b \u00d200000;
    private final boolean String;
    private final f$_b \u00d300000;

    /*
     * Unable to fully structure code
     */
    public f(o var1_1, b var2_2, boolean var3_3, List var4_5) {
        block17: {
            block19: {
                block20: {
                    block18: {
                        block16: {
                            super();
                            this.\u00d200000 = var2_2;
                            this.String = var3_3;
                            var2_2 = this;
                            var13_7 = var2_2;
                            var3_4 = var1_1.\u00d5\u00d5O000();
                            if (!(var1_1 instanceof vc) || !((vc)var1_1).\u00f4\u00d5O000()) ** GOTO lbl-1000
                            v0 = hd.\u00d200000((u)var3_4);
                            v1 = v0 != null ? d.o00000(v0) : false;
                            if (v1) {
                                v2 = null;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v3 = d.new((u)var3_4);
                                v2 = var3_4 = v3 != null ? d.o00000(v3, var1_1) : null;
                            }
                            if (!d.new(var1_1)) break block16;
                            v4 = new f$_b(m.thisObject.o00000(), new Method[0], (Method)var3_4);
                            break block17;
                        }
                        if (!(var2_2.\u00d200000 instanceof h$_h$_b) || ((h$_h$_b)var2_2.\u00d200000).OO0000()) break block18;
                        v5 = -1;
                        break block19;
                    }
                    if (!md.o00000(var1_1)) break block20;
                    v5 = var2_2.\u00d200000 instanceof i ? -1 : 0;
                    break block19;
                }
                var5_8 = var1_1.\u00d8\u00d5O000();
                if (!(var5_8 instanceof Collection) || !((Collection)var5_8).isEmpty()) {
                    var6_9 = var5_8.iterator();
                    while (var6_9.hasNext()) {
                        if (!(((p)var6_9.next()).\u00f5\u00f50000() == p$_b.\u00d400000)) continue;
                        v6 = true;
                        break;
                    }
                } else {
                    v6 = false;
                }
                if (!v6) ** GOTO lbl-1000
                var6_9 = var1_1.o\u00d8O000();
                v7 = var6_9 instanceof r != false ? (r)var6_9 : null;
                if (!(v7 != null ? v7.\u00d3\u00d4O000() : false)) {
                    v5 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    v5 = 0;
                }
            }
            var9_12 = v5;
            var5_8 = d.o00000(var1_1, var2_2.\u00d200000.Object());
            var6_9 = var1_1.\u00f8\u00d6O000();
            if (!(var6_9 instanceof Collection) || !((Collection)var6_9).isEmpty()) {
                var8_13 = var6_9.iterator();
                while (var8_13.hasNext()) {
                    if (!(((p)var8_13.next()).\u00f5\u00f50000() == p$_b.class)) continue;
                    v8 = true;
                    break;
                }
            } else {
                v8 = false;
            }
            var6_10 = v8 != false ? var5_8.size() - 1 : var5_8.size();
            var6_10 = (var2_2.String != false ? (var6_10 + 32 - 1) / 32 + 1 : 0) + (var1_1 instanceof vc != false && ((vc)var1_1).\u00f4\u00d5O000() != false ? 1 : 0);
            var7_14 = var5_8.size() + var9_12 + var6_10;
            d.new(var2_2, var7_14, var1_1, var2_2.String);
            var8_13 = bb.\u00d400000(Math.max(var9_12, 0), var5_8.size() + var9_12);
            var6_11 = new Method[var7_14];
            for (var10_15 = 0; var10_15 < var7_14; ++var10_15) {
                var11_17 = var10_15;
                var12_19 = var8_13.\u00f8O0000();
                v9 = var11_17 <= var8_13.oo0000() ? var12_19 <= var11_17 : false;
                if (!v9) ** GOTO lbl-1000
                v10 = d.new((u)var5_8.get(var11_17 - var9_12));
                if (v10 != null) {
                    v11 = d.new(v10, var1_1);
                } else lbl-1000:
                // 2 sources

                {
                    v11 = null;
                }
                var6_11[var11_17] = v11;
            }
            var11_18 = ((Iterable)var4_5).iterator();
            while (var11_18.hasNext()) {
                var4_6 = ((Number)var11_18.next()).intValue();
                var6_11[var4_6] = null;
            }
            var10_16 = var1_1.o\u00d8O000();
            if (!md.o00000(var1_1) && var10_16 instanceof z && ((z)var10_16).\u00d3\u00d4O000()) {
                v12 = var2_2.Object();
                v13 = v12 != null ? d.o00000(v12) : false;
                if (v13) {
                    var6_11[0] = null;
                }
            }
            v4 = new f$_b((m)var8_13, var6_11, (Method)var3_4);
        }
        var13_7.\u00d300000 = v4;
    }

    @Override
    public final Member Object() {
        return this.\u00d200000.Object();
    }

    @Override
    public final Type \u00d400000() {
        return this.\u00d200000.\u00d400000();
    }

    @Override
    public final List \u00d200000() {
        return this.\u00d200000.\u00d200000();
    }

    @Override
    public final boolean o00000() {
        return this.\u00d200000 instanceof h$_h$_e;
    }

    @Override
    public final Object o00000(Object[] objectArray) {
        Object object;
        block8: {
            Object object2;
            block7: {
                m m2 = this.\u00d300000.\u00d200000();
                Method[] methodArray = this.\u00d300000.Object();
                Method method = this.\u00d300000.o00000();
                int n2 = objectArray.length;
                Object[] objectArray2 = new Object[n2];
                for (int i2 = 0; i2 < n2; ++i2) {
                    Object object3;
                    Method method2;
                    int n3 = i2;
                    Object object4 = objectArray[n3];
                    int n4 = m2.\u00f8O0000();
                    boolean bl = n3 <= m2.oo0000() ? n4 <= n3 : false;
                    if (bl && (method2 = methodArray[n3]) != null) {
                        Object object5 = object4;
                        object3 = object5 != null ? method2.invoke(object5, new Object[0]) : hd.super((Type)method2.getReturnType());
                    } else {
                        object3 = object4;
                    }
                    objectArray2[n3] = object3;
                }
                objectArray = objectArray2;
                object2 = this.\u00d200000.o00000(objectArray);
                if (object2 == b.r.c.b.\u00d200000()) {
                    return object2;
                }
                object = method;
                if (object == null) break block7;
                Object[] objectArray3 = new Object[1];
                objectArray2 = objectArray3;
                objectArray3[0] = object2;
                if ((object = ((Method)object).invoke(null, objectArray2)) != null) break block8;
            }
            object = object2;
        }
        return object;
    }
}

