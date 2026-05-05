/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.g.c;
import b.g.n;
import b.o.e.b;
import b.o.e.g;
import b.o.e.h;
import b.o.e.i;
import b.o.e.j;
import b.o.e.l;
import b.o.e.m;
import b.o.e.o;
import b.o.e.q;
import b.o.e.s;
import b.o.e.t;
import b.o.e.u;
import b.o.e.v;
import b.o.e.w;
import b.o.e.x;
import b.o.e.y;
import b.o.r;
import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import b.t.c.b.b.q.d.b.e$_b$0;
import b.t.c.b.b.q.d.b.e$_b$1;
import b.t.z;
import b.yc;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e {
    private static final List \u00d300000;
    private static final Map \u00d200000;
    private static final Map o00000;
    private static final Map String;

    public static final ClassLoader \u00d800000(Class clazz) {
        ClassLoader classLoader = clazz.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader;
    }

    public static final boolean \u00d600000(Class clazz) {
        return Enum.class.isAssignableFrom(clazz);
    }

    public static final Class String(Class clazz) {
        return (Class)\u00d200000.get(clazz);
    }

    public static final Class o00000(Class clazz) {
        return (Class)o00000.get(clazz);
    }

    public static final Integer \u00d500000(Class clazz) {
        return (Integer)String.get(clazz);
    }

    public static final d \u00d200000(Class object) {
        if (((Class)object).isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: ".concat(java.lang.String.valueOf(object)));
        }
        if (((Class)object).isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: ".concat(java.lang.String.valueOf(object)));
        }
        if (((Class)object).getEnclosingMethod() != null || ((Class)object).getEnclosingConstructor() != null || ((CharSequence)((Class)object).getSimpleName()).length() == 0) {
            object = new k(((Class)object).getName());
            return new d(((k)object).\u00d300000(), k.\u00d400000.super(((k)object).\u00d400000()), true);
        }
        Class<?> clazz = ((Class)object).getDeclaringClass();
        if (clazz == null || (clazz = e.\u00d200000(clazz)) == null || (clazz = ((d)((Object)clazz)).o00000(f.\u00d300000(((Class)object).getSimpleName()))) == null) {
            clazz = d.String.o00000(new k(((Class)object).getName()));
        }
        return clazz;
    }

    public static final String \u00d300000(Class clazz) {
        block32: {
            block33: {
                if (!clazz.isPrimitive()) break block32;
                String string = clazz.getName();
                if (string == null) break block33;
                int n2 = -1;
                switch (string.hashCode()) {
                    case 64711720: {
                        if (string.equals("boolean")) {
                            n2 = 1;
                        }
                        break;
                    }
                    case 3625364: {
                        if (string.equals("void")) {
                            n2 = 2;
                        }
                        break;
                    }
                    case 3039496: {
                        if (string.equals("byte")) {
                            n2 = 3;
                        }
                        break;
                    }
                    case -1325958191: {
                        if (string.equals("double")) {
                            n2 = 4;
                        }
                        break;
                    }
                    case 3052374: {
                        if (string.equals("char")) {
                            n2 = 5;
                        }
                        break;
                    }
                    case 109413500: {
                        if (string.equals("short")) {
                            n2 = 6;
                        }
                        break;
                    }
                    case 97526364: {
                        if (string.equals("float")) {
                            n2 = 7;
                        }
                        break;
                    }
                    case 104431: {
                        if (string.equals("int")) {
                            n2 = 8;
                        }
                        break;
                    }
                    case 3327612: {
                        if (string.equals("long")) {
                            n2 = 9;
                        }
                        break;
                    }
                }
                switch (n2) {
                    case 1: {
                        return "Z";
                    }
                    case 5: {
                        return "C";
                    }
                    case 3: {
                        return "B";
                    }
                    case 6: {
                        return "S";
                    }
                    case 8: {
                        return "I";
                    }
                    case 7: {
                        return "F";
                    }
                    case 9: {
                        return "J";
                    }
                    case 4: {
                        return "D";
                    }
                    case 2: {
                        return "V";
                    }
                }
            }
            throw new IllegalArgumentException("Unsupported primitive type: ".concat(java.lang.String.valueOf(clazz)));
        }
        if (clazz.isArray()) {
            return b.q.f.super(clazz.getName(), '.', '/', false, 4, null);
        }
        return "L" + b.q.f.super(clazz.getName(), '.', '/', false, 4, null) + ';';
    }

    public static final List o00000(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return mc.\u00d500000();
        }
        if (((ParameterizedType)type).getOwnerType() == null) {
            return b.s.z.thisnew(((ParameterizedType)type).getActualTypeArguments());
        }
        return c.\u00d6o0000(c.\u00d5\u00d30000(c.o00000((Object)type, (g)e$_b$0.newthisObject), e$_b$1.o\u00d2\u00d5000));
    }

    private static final ParameterizedType \u00d200000(ParameterizedType type) {
        if ((type = type.getOwnerType()) instanceof ParameterizedType) {
            return type;
        }
        return null;
    }

    private static final n String(ParameterizedType parameterizedType) {
        return b.s.z.\u00f5\u00d20000(parameterizedType.getActualTypeArguments());
    }

    static {
        Object object;
        Object object2;
        Object[] objectArray = new z[8];
        Object object3 = objectArray;
        objectArray[0] = b.o.d.z.\u00d200000(Boolean.TYPE);
        object3[1] = b.o.d.z.\u00d200000(Byte.TYPE);
        object3[2] = b.o.d.z.\u00d200000(Character.TYPE);
        object3[3] = b.o.d.z.\u00d200000(Double.TYPE);
        object3[4] = b.o.d.z.\u00d200000(Float.TYPE);
        object3[5] = b.o.d.z.\u00d200000(Integer.TYPE);
        object3[6] = b.o.d.z.\u00d200000(Long.TYPE);
        object3[7] = b.o.d.z.\u00d200000(Short.TYPE);
        \u00d300000 = mc.new(object3);
        object3 = \u00d300000;
        Object object4 = object3;
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        Iterator iterator = object4.iterator();
        while (iterator.hasNext()) {
            object4 = iterator.next();
            object2 = (z)object4;
            object = object3;
            object.add(yc.o00000(r.new((z)object2), r.\u00d400000((z)object2)));
        }
        \u00d200000 = b.s.y.o00000((List)object3);
        object3 = \u00d300000;
        object4 = object3;
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        iterator = object4.iterator();
        while (iterator.hasNext()) {
            object4 = iterator.next();
            object2 = (z)object4;
            object = object3;
            object.add(yc.o00000(r.\u00d400000((z)object2), r.new((z)object2)));
        }
        o00000 = b.s.y.o00000((List)object3);
        Class[] classArray = new Class[23];
        object3 = classArray;
        classArray[0] = h.class;
        object3[1] = g.class;
        object3[2] = b.o.e.f.class;
        object3[3] = b.o.e.e.class;
        object3[4] = b.o.e.d.class;
        object3[5] = b.o.e.c.class;
        object3[6] = b.class;
        object3[7] = y.class;
        object3[8] = x.class;
        object3[9] = w.class;
        object3[10] = s.class;
        object3[11] = b.o.e.r.class;
        object3[12] = q.class;
        object3[13] = o.class;
        object3[14] = b.o.e.n.class;
        object3[15] = m.class;
        object3[16] = l.class;
        object3[17] = b.o.e.k.class;
        object3[18] = j.class;
        object3[19] = i.class;
        object3[20] = v.class;
        object3[21] = u.class;
        object3[22] = t.class;
        object3 = mc.new(object3);
        object4 = object3;
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        int n2 = 0;
        object4 = object4.iterator();
        while (object4.hasNext()) {
            int n3;
            object2 = object4.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object2 = (Class)object2;
            object = object3;
            object.add(yc.o00000(object2, n3));
        }
        String = b.s.y.o00000((List)object3);
    }

    static /* synthetic */ ParameterizedType o00000(ParameterizedType parameterizedType) {
        return e.\u00d200000(parameterizedType);
    }

    static /* synthetic */ n \u00d300000(ParameterizedType parameterizedType) {
        return e.String(parameterizedType);
    }
}

