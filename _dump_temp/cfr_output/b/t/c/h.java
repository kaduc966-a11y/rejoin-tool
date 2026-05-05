/*
 * Decompiled with CFR 0.152.
 */
package b.t.c;

import b.o.d.fc;
import b.o.r;
import b.t.b;
import b.t.c.b.b.n.b.b.c;
import b.t.c.b.b.n.b.b.c$_b;
import b.t.c.b.b.q.d.c.n;
import b.t.c.b.hd;
import b.t.c.b.jc;
import b.t.c.b.s;
import b.t.c.h$_b;
import b.t.d;
import b.t.db;
import b.t.g;
import b.t.k;
import b.t.m;
import b.t.u;
import b.t.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class h {
    public static final Field o00000(m m2) {
        s s2 = hd.\u00d300000(m2);
        if (s2 != null) {
            return s2.\u00f4\u00f6O000();
        }
        return null;
    }

    public static final Method \u00d200000(m m2) {
        return h.\u00d200000(m2.\u00f4\u00d6O000());
    }

    public static final Method o00000(g g2) {
        return h.\u00d200000(g2.\u00d4\u00f8O000());
    }

    public static final Method \u00d200000(k object) {
        Object object2 = hd.super(object);
        if ((object2 != null && (object2 = object2.privatedo()) != null ? object2.Object() : (object = null)) instanceof Method) {
            return (Method)object;
        }
        return null;
    }

    public static final Constructor o00000(k object) {
        Object object2 = hd.super(object);
        if ((object2 != null && (object2 = object2.privatedo()) != null ? object2.Object() : (object = null)) instanceof Constructor) {
            return (Constructor)object;
        }
        return null;
    }

    public static /* synthetic */ void \u00d300000(k k2) {
    }

    public static final Type o00000(u u2) {
        return d.\u00d200000(u2);
    }

    public static final m o00000(Field field) {
        if (field.isSynthetic()) {
            return null;
        }
        if (Modifier.isStatic(field.getModifiers())) {
            Field field2;
            Object object = h.o00000((Member)field);
            if (object != null) {
                return h.o00000(object.thisvoid(), field);
            }
            object = b.t.b.h.\u00f8O0000(r.o00000(field.getDeclaringClass()));
            if (object != null && (field2 = hd.super(field.getDeclaringClass(), field.getName())) != null && (object = h.o00000(b.t.b.h.\u00d600000((z)object), field2)) != null) {
                return object;
            }
        }
        return h.o00000(b.t.b.h.\u00d600000(r.o00000(field.getDeclaringClass())), field);
    }

    private static final b o00000(Member member) {
        Object object = n.\u00d200000.super(member.getDeclaringClass());
        c$_b c$_b = object != null && (object = ((n)object).\u00d200000()) != null ? ((c)object).\u00d600000() : null;
        switch (c$_b == null ? -1 : h$_b.o00000[c$_b.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                return new jc(member.getDeclaringClass());
            }
        }
        return null;
    }

    public static final k o00000(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            b b2 = h.o00000((Member)method);
            if (b2 != null) {
                return h.o00000(b2.thisvoid(), method);
            }
            b2 = b.t.b.h.\u00f8O0000(r.o00000(method.getDeclaringClass()));
            if (b2 != null) {
                Class<?>[] classArray = method.getParameterTypes();
                Object object = hd.super(r.\u00d300000((z)b2), method.getName(), Arrays.copyOf(classArray, classArray.length));
                if (object != null && (object = h.o00000(b.t.b.h.int((z)b2), (Method)object)) != null) {
                    return object;
                }
            }
        }
        return h.o00000(b.t.b.h.int(r.o00000(method.getDeclaringClass())), method);
    }

    private static final k o00000(Collection collection, Method method) {
        for (db db2 : collection) {
            if (!(db2 instanceof k) || !fc.o00000((Object)((k)db2).\u00f5\u00d5O000(), (Object)method.getName()) || !fc.o00000((Object)h.\u00d200000((k)db2), (Object)method)) continue;
            return (k)db2;
        }
        for (db db2 : collection) {
            if (!(db2 instanceof k) || fc.o00000((Object)((k)db2).\u00f5\u00d5O000(), (Object)method.getName()) || !fc.o00000((Object)h.\u00d200000((k)db2), (Object)method)) continue;
            return (k)db2;
        }
        return null;
    }

    private static final m o00000(Collection collection, Field field) {
        for (db db2 : collection) {
            if (!(db2 instanceof m) || !fc.o00000((Object)((m)db2).\u00f5\u00d5O000(), (Object)field.getName()) || !fc.o00000((Object)h.o00000((m)db2), (Object)field)) continue;
            return (m)db2;
        }
        for (db db2 : collection) {
            if (!(db2 instanceof m) || fc.o00000((Object)((m)db2).\u00f5\u00d5O000(), (Object)field.getName()) || !fc.o00000((Object)h.o00000((m)db2), (Object)field)) continue;
            return (m)db2;
        }
        return null;
    }

    public static final k o00000(Constructor constructor) {
        Object v0;
        block1: {
            for (Object t2 : (Iterable)r.o00000(constructor.getDeclaringClass()).returnfor()) {
                if (!fc.o00000((Object)h.o00000((k)t2), (Object)constructor)) continue;
                v0 = t2;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }
}

