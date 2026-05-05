/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.o.d.x;
import b.o.r;
import b.s.mc;
import b.t.b.l;
import b.t.c.b.d.b;
import b.t.c.b.d.d;
import b.t.c.b.hd;
import b.t.c.b.lb;
import b.t.c.b.o;
import b.t.c.b.s;
import b.t.c.f;
import b.t.c.h;
import b.t.p;
import b.t.p$_b;
import b.t.u;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class md {
    public static final boolean \u00d300000(o o2) {
        return o2.O\u00d8O000() != x.\u00d40\u00d2000;
    }

    public static final Object \u00d400000(o o2) {
        return md.o00000(o2.O\u00d8O000(), o2);
    }

    private static final Object o00000(Object object, o o2) {
        Object v0;
        block4: {
            if (o2 instanceof s && d.o00000((s)o2)) {
                return object;
            }
            Object object2 = o2.\u00f8\u00d6O000();
            Object var3_3 = null;
            boolean bl = false;
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object e2 = object2.next();
                if (!(((p)e2).\u00f5\u00f50000() != p$_b.\u00d300000)) continue;
                if (bl) {
                    v0 = null;
                    break block4;
                }
                var3_3 = e2;
                bl = true;
            }
            v0 = !bl ? null : var3_3;
        }
        p p2 = v0;
        Object object3 = p2 != null ? p2.\u00f8\u00f50000() : null;
        if (object3 == null || (object3 = d.new((u)object3)) == null || (object3 = d.new((Class)object3, o2)) == null) {
            return object;
        }
        return ((Method)object3).invoke(object, new Object[0]);
    }

    public static final Object[] \u00d500000(o o2) {
        Object[] objectArray;
        int n2;
        Object object3 = o2.\u00d8\u00d5O000();
        int n3 = object3.size() + (o2.\u00f4\u00d5O000() ? 1 : 0);
        Object object2 = (Iterable)object3;
        if (object2 instanceof Collection && ((Collection)object2).isEmpty()) {
            n2 = 0;
        } else {
            int n4 = 0;
            object2 = object2.iterator();
            while (object2.hasNext()) {
                objectArray = (Object[])object2.next();
                if (!(objectArray.\u00f5\u00f50000() == p$_b.\u00d300000 || objectArray.\u00f5\u00f50000() == p$_b.\u00d600000) || ++n4 >= 0) continue;
                mc.\u00d400000();
            }
            n2 = n4;
        }
        int n5 = (n2 + 32 - 1) / 32;
        objectArray = new Object[n3 + n5 + 1];
        for (Object object3 : (Iterable)object3) {
            if (object3.Stringvoid() && !hd.\u00d400000(object3.\u00f8\u00f50000())) {
                objectArray[object3.o\u00f60000()] = hd.super(h.o00000(object3.\u00f8\u00f50000()));
                continue;
            }
            if (!object3.\u00f4\u00f50000()) continue;
            objectArray[object3.o\u00f60000()] = md.o00000(object3.\u00f8\u00f50000());
        }
        for (int i2 = 0; i2 < n5; ++i2) {
            objectArray[n3 + i2] = 0;
        }
        return objectArray;
    }

    public static final Object o00000(o object, Map map, b.r.b objectArray) {
        Object[] objectArray2;
        Object object2 = object.\u00d8\u00d5O000();
        if (object2.isEmpty()) {
            Object object3;
            try {
                Object[] objectArray3;
                b b2 = object.privatedo();
                if (object.\u00f4\u00d5O000()) {
                    b.r.b[] bArray = new b.r.b[1];
                    b.r.b[] bArray2 = bArray;
                    bArray[0] = objectArray;
                    objectArray3 = bArray2;
                } else {
                    objectArray3 = new b.r.b[]{};
                }
                object3 = b2.o00000(objectArray3);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new l(illegalAccessException);
            }
            return object3;
        }
        int n2 = object2.size() + (object.\u00f4\u00d5O000() ? 1 : 0);
        Object[] objectArray4 = objectArray2 = object.newwhile();
        if (object.\u00f4\u00d5O000()) {
            objectArray4[object2.size()] = objectArray;
        }
        objectArray = objectArray2;
        int n3 = 0;
        int n4 = 0;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            p p2 = (p)object2.next();
            if (map.containsKey(p2)) {
                objectArray[p2.o\u00f60000()] = map.get(p2);
            } else if (p2.Stringvoid()) {
                n4 = n2 + n3 / 32;
                objectArray[n4] = (Integer)objectArray[n4] | 1 << n3 % 32;
                n4 = 1;
            } else if (!p2.\u00f4\u00f50000()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: ".concat(String.valueOf(p2)));
            }
            if (p2.\u00f5\u00f50000() != p$_b.\u00d300000 && p2.\u00f5\u00f50000() != p$_b.\u00d600000) continue;
            ++n3;
        }
        if (n4 == 0) {
            Object object4;
            try {
                object4 = object.privatedo().o00000(Arrays.copyOf(objectArray, n2));
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new l(illegalAccessException);
            }
            return object4;
        }
        b b3 = object.\u00d3\u00d8O000();
        if (b3 == null) {
            throw new lb("This callable does not support a default call: ".concat(String.valueOf(object)));
        }
        object2 = b3;
        try {
            object = object2.o00000(objectArray);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new l(illegalAccessException);
        }
        return object;
    }

    public static final Object o00000(o o2, Map object) {
        Object object2;
        Object object3;
        Object object4 = object3 = (Iterable)o2.\u00d8\u00d5O000();
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        object4 = object4.iterator();
        while (object4.hasNext()) {
            Object object5;
            object2 = object4.next();
            object2 = (p)object2;
            Iterable iterable = object3;
            if (object.containsKey(object2)) {
                object5 = object.get(object2);
                if (object5 == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + object2 + ')');
                }
            } else if (object2.Stringvoid()) {
                object5 = null;
            } else if (object2.\u00f4\u00f50000()) {
                object5 = md.o00000(object2.\u00f8\u00f50000());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: ".concat(String.valueOf(object2)));
            }
            iterable.add(object5);
        }
        object = (List)object3;
        b b2 = o2.\u00d3\u00d8O000();
        if (b2 == null) {
            throw new lb("This callable does not support a default call: ".concat(String.valueOf(o2)));
        }
        object3 = b2;
        try {
            object2 = object3.o00000(((Collection)object).toArray(new Object[0]));
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new l(illegalAccessException);
        }
        return object2;
    }

    private static final Object o00000(u object) {
        if (((Class)(object = r.\u00d300000(f.super((u)object)))).isArray()) {
            return Array.newInstance(((Class)object).getComponentType(), 0);
        }
        throw new lb("Cannot instantiate the default empty array of type " + ((Class)object).getSimpleName() + ", because it is not an array type");
    }

    public static final boolean o00000(o o2) {
        return fc.o00000((Object)o2.\u00f5\u00d5O000(), (Object)"<init>");
    }

    public static final boolean new(o o2) {
        return md.o00000(o2) && o2.o\u00d8O000().iffor().isAnnotation();
    }
}

