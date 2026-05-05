/*
 * Decompiled with CFR 0.152.
 */
package b.m;

import b.o.d.fc;
import b.s.z;
import java.lang.reflect.Method;

final class d$_b {
    public static final d$_b \u00d200000;
    public static final Method Object;
    public static final Method o00000;

    private d$_b() {
    }

    static {
        Method method;
        block3: {
            Method method2;
            Method[] methodArray;
            block2: {
                \u00d200000 = new d$_b();
                Class<Throwable> clazz = Throwable.class;
                Method[] methodArray2 = methodArray = Throwable.class.getMethods();
                int n2 = methodArray2.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    Method method3;
                    Method method4 = method3 = methodArray2[i2];
                    if (!(fc.o00000((Object)method3.getName(), (Object)"addSuppressed") && fc.o00000(z.\u00d5\u00d20000(method4.getParameterTypes()), clazz))) continue;
                    method2 = method3;
                    break block2;
                }
                method2 = null;
            }
            Object = method2;
            for (Method method3 : methodArray) {
                if (!fc.o00000((Object)method3.getName(), (Object)"getSuppressed")) continue;
                method = method3;
                break block3;
            }
            method = null;
        }
        o00000 = method;
    }
}

