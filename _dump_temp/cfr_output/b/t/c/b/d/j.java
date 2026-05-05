/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.dc;
import b.o.d.fc;
import b.r;
import b.s.mc;
import b.t.c.b.d.j$_b$0;
import b.t.c.b.d.j$_b$1;
import b.t.c.b.d.j$_b$2;
import b.t.c.b.d.j$_b$3;
import b.t.c.b.lb;
import b.t.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class j {
    private static final Object \u00d200000(Object object, Class clazz) {
        Object object2;
        z[] zArray = object;
        if (object instanceof Class) {
            return null;
        }
        if (zArray instanceof z) {
            object2 = b.o.r.\u00d300000((z)object);
        } else if (zArray instanceof Object[]) {
            if ((Object[])object instanceof Class[]) {
                return null;
            }
            if ((Object[])object instanceof z[]) {
                object = (z[])object;
                zArray = object;
                object = new ArrayList(((z[])object).length);
                for (z z2 : zArray) {
                    Object object3 = object;
                    object3.add(b.o.r.\u00d300000(z2));
                }
                object2 = ((Collection)((List)object)).toArray(new Class[0]);
            } else {
                object2 = (Object[])object;
            }
        } else {
            object2 = object = object;
        }
        if (clazz.isInstance(object)) {
            return object;
        }
        return null;
    }

    private static final Void \u00d200000(int n2, String string, Class object) {
        object = fc.o00000(object, Class.class) ? b.o.d.z.\u00d200000(z.class) : (((Class)object).isArray() && fc.o00000(((Class)object).getComponentType(), Class.class) ? b.o.d.z.\u00d200000(z[].class) : b.o.r.o00000((Class)object));
        object = fc.o00000((Object)object.\u00d8\u00d3O000(), (Object)b.o.d.z.\u00d200000(Object[].class).\u00d8\u00d3O000()) ? object.\u00d8\u00d3O000() + '<' + b.o.r.o00000(b.o.r.\u00d300000((z)object).getComponentType()).\u00d8\u00d3O000() + '>' : object.\u00d8\u00d3O000();
        throw new IllegalArgumentException("Argument #" + n2 + ' ' + string + " is not of the required type " + (String)object);
    }

    public static final Object o00000(Class object, Map map, List classArray) {
        Object object2 = map;
        dc dc2 = r.o00000(new j$_b$0((Map)object2));
        object2 = map;
        Object object3 = object;
        object2 = r.o00000(new j$_b$1((Class)object3, (Map)object2));
        ClassLoader classLoader = object.getClassLoader();
        Class[] classArray2 = new Class[1];
        object3 = classArray2;
        classArray2[0] = object;
        Class[] classArray3 = object3;
        Class[] classArray4 = object;
        Object object4 = object2;
        object2 = classArray;
        object3 = dc2;
        object = object4;
        classArray = classArray4;
        return Proxy.newProxyInstance(classLoader, classArray3, (InvocationHandler)new j$_b$2((Class)classArray, map, (dc)object, (dc)object3, (List)object2));
    }

    public static /* synthetic */ Object o00000(Class clazz, Map map, List iterable, int n2, Object object) {
        if ((n2 & 4) != 0) {
            iterable = map.keySet();
            Object object2 = iterable;
            iterable = new ArrayList(mc.o00000((Iterable)iterable, 10));
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                object = (String)object;
                Iterable<Method> iterable2 = iterable;
                iterable2.add(clazz.getDeclaredMethod((String)object, new Class[0]));
            }
        }
        return j.o00000(clazz, map, (List)iterable);
    }

    private static final CharSequence o00000(Map.Entry object) {
        String string = (String)object.getKey();
        object = object.getValue();
        Object v2 = object;
        object = object instanceof boolean[] ? Arrays.toString((boolean[])object) : (v2 instanceof char[] ? Arrays.toString((char[])object) : (v2 instanceof byte[] ? Arrays.toString((byte[])object) : (v2 instanceof short[] ? Arrays.toString((short[])object) : (v2 instanceof int[] ? Arrays.toString((int[])object) : (v2 instanceof float[] ? Arrays.toString((float[])object) : (v2 instanceof long[] ? Arrays.toString((long[])object) : (v2 instanceof double[] ? Arrays.toString((double[])object) : (v2 instanceof Object[] ? Arrays.toString((Object[])object) : object.toString()))))))));
        return string + '=' + (String)object;
    }

    private static final boolean o00000(Class object, List object2, Map map, Object object3) {
        Object object4 = object3 instanceof Annotation ? (Annotation)object3 : null;
        if (fc.o00000((Object)(object4 != null && (object4 = b.o.r.o00000((Annotation)object4)) != null ? b.o.r.\u00d300000((z)object4) : null), object)) {
            boolean bl;
            object = (Iterable)object2;
            if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                object = object.iterator();
                while (object.hasNext()) {
                    object2 = (Method)object.next();
                    Object v2 = map.get(((Method)object2).getName());
                    object2 = ((Method)object2).invoke(object3, new Object[0]);
                    Object v3 = v2;
                    if (v3 instanceof boolean[] ? Arrays.equals((boolean[])v2, (boolean[])object2) : (v3 instanceof char[] ? Arrays.equals((char[])v2, (char[])object2) : (v3 instanceof byte[] ? Arrays.equals((byte[])v2, (byte[])object2) : (v3 instanceof short[] ? Arrays.equals((short[])v2, (short[])object2) : (v3 instanceof int[] ? Arrays.equals((int[])v2, (int[])object2) : (v3 instanceof float[] ? Arrays.equals((float[])v2, (float[])object2) : (v3 instanceof long[] ? Arrays.equals((long[])v2, (long[])object2) : (v3 instanceof double[] ? Arrays.equals((double[])v2, (double[])object2) : (v3 instanceof Object[] ? Arrays.equals((Object[])v2, (Object[])object2) : fc.o00000(v2, object2)))))))))) continue;
                    bl = false;
                    break;
                }
            } else {
                bl = true;
            }
            if (bl) {
                return true;
            }
        }
        return false;
    }

    private static final int \u00d200000(dc dc2) {
        return ((Number)dc2.\u00d200000()).intValue();
    }

    private static final int o00000(Map iterator) {
        iterator = iterator.entrySet();
        int n2 = 0;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Map.Entry entry = (Map.Entry)object;
            int n3 = n2;
            object = (String)entry.getKey();
            entry = entry.getValue();
            Object v2 = entry;
            n2 = entry instanceof boolean[] ? Arrays.hashCode((boolean[])entry) : (v2 instanceof char[] ? Arrays.hashCode((char[])entry) : (v2 instanceof byte[] ? Arrays.hashCode((byte[])entry) : (v2 instanceof short[] ? Arrays.hashCode((short[])entry) : (v2 instanceof int[] ? Arrays.hashCode((int[])entry) : (v2 instanceof float[] ? Arrays.hashCode((float[])entry) : (v2 instanceof long[] ? Arrays.hashCode((long[])entry) : (v2 instanceof double[] ? Arrays.hashCode((double[])entry) : (v2 instanceof Object[] ? Arrays.hashCode((Object[])entry) : ((Object)entry).hashCode()))))))));
            n2 = 127 * ((String)object).hashCode() ^ n2;
            n2 = n3 + n2;
        }
        return n2;
    }

    private static final String o00000(dc dc2) {
        return (String)dc2.\u00d200000();
    }

    private static final String o00000(Class clazz, Map map) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append('@');
        stringBuilder2.append(clazz.getCanonicalName());
        mc.o00000(map.entrySet(), stringBuilder2, ", ", "(", ")", 0, null, j$_b$3.o\u00d4\u00d5000, 48, null);
        return stringBuilder.toString();
    }

    private static final Object \u00d200000(Class clazz, Map map, dc dc2, dc dc3, List list, Object object, Method method, Object[] objectArray) {
        block17: {
            object = method.getName();
            if (object == null) break block17;
            int n2 = -1;
            switch (((String)object).hashCode()) {
                case 147696667: {
                    if (((String)object).equals("hashCode")) {
                        n2 = 1;
                    }
                    break;
                }
                case 1444986633: {
                    if (((String)object).equals("annotationType")) {
                        n2 = 2;
                    }
                    break;
                }
                case -1776922004: {
                    if (((String)object).equals("toString")) {
                        n2 = 3;
                    }
                    break;
                }
            }
            switch (n2) {
                case 2: {
                    return clazz;
                }
                case 3: {
                    return j.o00000(dc2);
                }
                case 1: {
                    return j.\u00d200000(dc3);
                }
            }
        }
        if (fc.o00000(object, (Object)"equals")) {
            boolean bl = objectArray != null ? objectArray.length == 1 : false;
            if (bl) {
                return j.o00000(clazz, list, map, b.s.z.\u00f6O0000(objectArray));
            }
        }
        if (map.containsKey(object)) {
            return map.get(object);
        }
        StringBuilder stringBuilder = new StringBuilder("Method is not supported: ").append(method).append(" (args: ");
        Object[] objectArray2 = objectArray;
        if (objectArray == null) {
            objectArray2 = new Object[]{};
        }
        throw new lb(stringBuilder.append(b.s.z.thisnew(objectArray2)).append(')').toString());
    }

    public static final /* synthetic */ Object o00000(Object object, Class clazz) {
        return j.\u00d200000(object, clazz);
    }

    public static final /* synthetic */ Void o00000(int n2, String string, Class clazz) {
        return j.\u00d200000(n2, string, clazz);
    }

    static /* synthetic */ int \u00d200000(Map map) {
        return j.o00000(map);
    }

    static /* synthetic */ String \u00d200000(Class clazz, Map map) {
        return j.o00000(clazz, map);
    }

    static /* synthetic */ Object o00000(Class clazz, Map map, dc dc2, dc dc3, List list, Object object, Method method, Object[] objectArray) {
        return j.\u00d200000(clazz, map, dc2, dc3, list, object, method, objectArray);
    }

    static /* synthetic */ CharSequence \u00d200000(Map.Entry entry) {
        return j.o00000(entry);
    }
}

