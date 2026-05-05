/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.ac;
import b.o.d.f;
import b.o.d.g;
import b.o.d.h;
import b.o.d.i;
import b.o.d.p;
import b.o.d.r;
import b.o.d.s;
import b.o.d.vc;
import b.o.d.yb;
import b.t.b;
import b.t.bb;
import b.t.e;
import b.t.k;
import b.t.l;
import b.t.q;
import b.t.t;
import b.t.u;
import b.t.v;
import java.util.Arrays;
import java.util.Collections;

public class z {
    private static final vc \u00d200000;
    static final String Object = " (Kotlin reflection is not available)";
    private static final b.t.z[] o00000;

    public static b.t.z \u00d500000(Class clazz) {
        return \u00d200000.\u00d200000(clazz);
    }

    public static b.t.z \u00d200000(Class clazz, String string) {
        return \u00d200000.\u00d200000(clazz, string);
    }

    public static b o00000(Class clazz) {
        return \u00d200000.super(clazz, "");
    }

    public static b o00000(Class clazz, String string) {
        return \u00d200000.super(clazz, string);
    }

    public static b.t.z \u00d200000(Class clazz) {
        return \u00d200000.super(clazz);
    }

    public static b.t.z Object(Class clazz, String string) {
        return \u00d200000.\u00d300000(clazz, string);
    }

    public static b.t.z[] o00000(Class[] classArray) {
        int n2 = classArray.length;
        if (n2 == 0) {
            return o00000;
        }
        b.t.z[] zArray = new b.t.z[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            zArray[i2] = z.\u00d200000(classArray[i2]);
        }
        return zArray;
    }

    public static String o00000(ac ac2) {
        return \u00d200000.super(ac2);
    }

    public static String o00000(g g2) {
        return \u00d200000.super(g2);
    }

    public static k o00000(yb yb2) {
        return \u00d200000.super(yb2);
    }

    public static b.t.i o00000(s s2) {
        return \u00d200000.super(s2);
    }

    public static t o00000(i i2) {
        return \u00d200000.super(i2);
    }

    public static b.t.f o00000(r r2) {
        return \u00d200000.super(r2);
    }

    public static b.t.s o00000(h h2) {
        return \u00d200000.super(h2);
    }

    public static e o00000(p p2) {
        return \u00d200000.super(p2);
    }

    public static b.t.r o00000(f f2) {
        return \u00d200000.super(f2);
    }

    public static u o00000(v v2) {
        return \u00d200000.super(v2, Collections.emptyList(), false);
    }

    public static u \u00d400000(Class clazz) {
        return \u00d200000.super(z.\u00d200000(clazz), Collections.emptyList(), false);
    }

    public static u \u00d200000(Class clazz, q q2) {
        return \u00d200000.super(z.\u00d200000(clazz), Collections.singletonList(q2), false);
    }

    public static u o00000(Class clazz, q q2, q q3) {
        return \u00d200000.super(z.\u00d200000(clazz), Arrays.asList(q2, q3), false);
    }

    public static u o00000(Class clazz, q ... qArray) {
        return \u00d200000.super(z.\u00d200000(clazz), b.s.z.thisnew(qArray), false);
    }

    public static u \u00d200000(v v2) {
        return \u00d200000.super(v2, Collections.emptyList(), true);
    }

    public static u Object(Class clazz) {
        return \u00d200000.super(z.\u00d200000(clazz), Collections.emptyList(), true);
    }

    public static u o00000(Class clazz, q q2) {
        return \u00d200000.super(z.\u00d200000(clazz), Collections.singletonList(q2), true);
    }

    public static u \u00d200000(Class clazz, q q2, q q3) {
        return \u00d200000.super(z.\u00d200000(clazz), Arrays.asList(q2, q3), true);
    }

    public static u \u00d200000(Class clazz, q ... qArray) {
        return \u00d200000.super(z.\u00d200000(clazz), b.s.z.thisnew(qArray), true);
    }

    public static bb o00000(Object object, String string, l l2, boolean bl) {
        return \u00d200000.super(object, string, l2, bl);
    }

    public static void o00000(bb bb2, u u2) {
        \u00d200000.super(bb2, Collections.singletonList(u2));
    }

    public static void o00000(bb bb2, u ... uArray) {
        \u00d200000.super(bb2, b.s.z.thisnew(uArray));
    }

    public static u o00000(u u2, u u3) {
        return \u00d200000.super(u2, u3);
    }

    public static u o00000(u u2) {
        return \u00d200000.super(u2);
    }

    public static u \u00d200000(u u2) {
        return \u00d200000.\u00d200000(u2);
    }

    static {
        vc vc2;
        try {
            vc2 = (vc)Class.forName("b.t.c.b.q").newInstance();
        }
        catch (ClassCastException classCastException) {
            vc2 = null;
        }
        catch (ClassNotFoundException classNotFoundException) {
            vc2 = null;
        }
        catch (InstantiationException instantiationException) {
            vc2 = null;
        }
        catch (IllegalAccessException illegalAccessException) {
            vc2 = null;
        }
        \u00d200000 = vc2 != null ? vc2 : new vc();
        o00000 = new b.t.z[0];
    }
}

