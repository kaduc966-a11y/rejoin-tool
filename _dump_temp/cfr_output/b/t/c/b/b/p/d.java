/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.d$1;
import b.t.c.b.b.p.d$_b;
import b.t.c.b.b.p.d$_e;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.i;
import b.t.c.b.b.p.i$_b;
import b.t.c.b.b.p.k;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.v;
import b.t.c.b.b.p.z;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class d
extends k
implements Serializable {
    public d() {
    }

    public d(d$_f d$_f) {
    }

    @Override
    public c \u00f600000() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean super(ab ab2, h h2, s s2, int n2) throws IOException {
        return ab2.o00000(n2, h2);
    }

    protected void \u00d2O0000() {
    }

    /*
     * Unable to fully structure code
     */
    private static boolean super(z var0, v var1_1, ab var2_2, h var3_3, s var4_5, int var5_7) throws IOException {
        var6_8 = i.new(var5_7);
        var7_10 = i.o00000(var5_7);
        var1_1 = var4_5.super((v)var1_1, var7_10);
        var7_10 = 0;
        var8_11 = false;
        if (var1_1 == null) ** GOTO lbl-1000
        if (var6_8 == z.o00000(var1_1.\u00d500000.\u00d500000(), false)) {
            var8_11 = false;
        } else if (var1_1.\u00d500000.\u00d200000 && var1_1.\u00d500000.\u00d300000.super() && var6_8 == z.o00000(var1_1.\u00d500000.\u00d500000(), true)) {
            var8_11 = true;
        } else lbl-1000:
        // 2 sources

        {
            var7_10 = 1;
        }
        if (var7_10 != 0) {
            return var2_2.o00000(var5_7, (h)var3_3);
        }
        if (var8_11) {
            var4_6 = var2_2.\u00f500000();
            var6_8 = var2_2.\u00d500000(var4_6);
            if (var1_1.\u00d500000.\u00d500000() == i$_b.\u00d2O0000) {
                while (var2_2.newsuper() > 0) {
                    var3_4 = var2_2.\u00f6O0000();
                    var3_3 = var1_1.\u00d500000.\u00d600000().o00000(var3_4);
                    if (var3_3 == null) {
                        return true;
                    }
                    var0.\u00d300000(var1_1.\u00d500000, var1_1.\u00d400000(var3_3));
                }
            } else {
                while (var2_2.newsuper() > 0) {
                    var3_3 = z.o00000(var2_2, var1_1.\u00d500000.\u00d500000(), false);
                    var0.\u00d300000(var1_1.\u00d500000, var3_3);
                }
            }
            var2_2.\u00d200000(var6_8);
        } else {
            switch (d$1.o00000[var1_1.\u00d500000.o00000().ordinal()]) {
                case 1: {
                    var6_9 = null;
                    if (!var1_1.\u00d500000.\u00d200000() && (var3_3 = (v)var0.\u00d300000(var1_1.\u00d500000)) != null) {
                        var6_9 = var3_3.int();
                    }
                    if (var6_9 == null) {
                        var6_9 = var1_1.\u00d300000().\u00f400000();
                    }
                    if (var1_1.\u00d500000.\u00d500000() == i$_b.\u00f4O0000) {
                        var2_2.o00000(var1_1.new(), var6_9, (s)var4_5);
                    } else {
                        var2_2.o00000(var6_9, (s)var4_5);
                    }
                    var4_5 = var6_9.\u00d300000();
                    break;
                }
                case 2: {
                    var6_8 = var2_2.\u00f6O0000();
                    var4_5 = var1_1.\u00d500000.\u00d600000().o00000(var6_8);
                    if (var4_5 != null) break;
                    var3_3.oO0000(var5_7);
                    var3_3.if(var6_8);
                    return true;
                }
                default: {
                    var4_5 = z.o00000(var2_2, var1_1.\u00d500000.\u00d500000(), false);
                }
            }
            if (var1_1.\u00d500000.\u00d200000()) {
                var0.\u00d300000(var1_1.\u00d500000, var1_1.\u00d400000(var4_5));
            } else {
                var0.new(var1_1.\u00d500000, var1_1.\u00d400000(var4_5));
            }
        }
        return true;
    }

    public static d$_b super(v v2, Object object, v v3, t$_b t$_b, int n2, i$_b i$_b, Class clazz) {
        return new d$_b(v2, object, v3, new d$_e(t$_b, n2, i$_b, false, false), clazz);
    }

    public static d$_b super(v v2, v v3, t$_b t$_b, int n2, i$_b i$_b, boolean bl, Class clazz) {
        List list = Collections.emptyList();
        return new d$_b(v2, list, v3, new d$_e(t$_b, n2, i$_b, true, bl), clazz);
    }

    static Method super(Class object, String string, Class ... classArray) {
        try {
            return ((Class)object).getMethod(string, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = String.valueOf(String.valueOf(((Class)object).getName()));
            string = String.valueOf(String.valueOf(string));
            throw new RuntimeException(new StringBuilder(45 + ((String)object).length() + string.length()).append("Generated message class \"").append((String)object).append("\" missing method \"").append(string).append("\".").toString(), noSuchMethodException);
        }
    }

    static Object super(Method object, Object object2, Object ... objectArray) {
        try {
            return ((Method)object).invoke(object2, objectArray);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException.getCause();
            if (object instanceof RuntimeException) {
                throw (RuntimeException)object;
            }
            if (object instanceof Error) {
                throw (Error)object;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", (Throwable)object);
        }
    }

    static /* synthetic */ boolean \u00d200000(z z2, v v2, ab ab2, h h2, s s2, int n2) throws IOException {
        return d.super(z2, v2, ab2, h2, s2, n2);
    }
}

