/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.g.c;
import b.o.d.fc;
import b.o.e.g;
import b.s.y;
import b.t.bb;
import b.t.c.b.b.d.e;
import b.t.c.b.b.d.k;
import b.t.c.b.c.e$_b;
import b.t.c.b.c.h;
import b.t.c.b.c.n;
import b.t.c.b.fd;
import b.t.c.b.hd;
import b.t.c.b.lb;
import b.t.c.b.mc;
import b.t.c.b.r;
import b.t.c.b.tb$_b$0;
import b.t.c.b.tb$_b$1;
import b.t.c.b.tb$_b$2;
import b.t.c.b.tb$_b$3;
import b.t.c.b.tb$_b$4;
import b.t.c.b.tb$_b$5;
import b.t.c.b.tb$_b$6;
import b.t.c.b.tb$_b$7;
import b.t.c.b.tb$_b$8;
import b.t.c.b.tb$_b$9;
import b.t.c.b.tb$_c;
import b.t.c.f;
import b.t.l;
import b.t.q;
import b.t.u;
import b.t.v;
import b.t.z;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class tb {
    public static final u o00000(Type type, Map object, fd fd2, boolean bl) {
        Object object2;
        n n2;
        e e2;
        h h2;
        Object object3;
        Object object4;
        Object object5;
        v v2;
        Object object6 = type;
        if (object6 instanceof Class) {
            if (!((Collection)tb.\u00d300000((Class)type)).isEmpty() && !bl) {
                return tb.o00000((Class)type, (Map)object);
            }
            if (((Class)type).isArray()) {
                Type type2 = type;
                return tb.o00000(tb.o00000(type2, b.o.r.o00000((Class)type2), b.s.mc.o00000(tb.o00000((Type)((Class)type).getComponentType(), (Map)object)), false, null, 16, null), type);
            }
            Type type3 = type;
            Iterable iterable = tb.\u00d300000((Class)type);
            v2 = b.o.r.o00000((Class)type3);
            object5 = type3;
            object6 = iterable;
            iterable = new ArrayList(b.s.mc.o00000(iterable, 10));
            object4 = object6.iterator();
            while (object4.hasNext()) {
                object3 = object4.next();
                TypeVariable cfr_ignored_0 = (TypeVariable)object3;
                object3 = iterable;
                object3.add(q.\u00d400000.o00000());
            }
            object3 = (List)iterable;
            h2 = tb.o00000((Type)object5, v2, object3, false, null, 16, null);
        } else {
            if (object6 instanceof GenericArrayType) {
                q q2 = tb.o00000(((GenericArrayType)type).getGenericComponentType(), (Map)object);
                object6 = b.o.r.o00000(hd.super(b.o.r.\u00d300000(f.super(q2.o00000()))));
                return tb.o00000(tb.o00000(type, (v)object6, b.s.mc.o00000(q2), false, null, 16, null), type);
            }
            if (object6 instanceof ParameterizedType) {
                Object object7;
                v v3;
                Object object8;
                Iterable iterable;
                Type type4 = type;
                v v4 = b.o.r.o00000((Class)((ParameterizedType)type4).getRawType());
                if (bl) {
                    iterable = tb.\u00d300000((ParameterizedType)type);
                    v2 = v4;
                    object5 = type4;
                    object6 = iterable;
                    iterable = new ArrayList(b.s.mc.o00000(iterable, 10));
                    object4 = object6.iterator();
                    while (object4.hasNext()) {
                        object3 = object4.next();
                        Type cfr_ignored_1 = (Type)object3;
                        object3 = iterable;
                        object3.add((q)q.\u00d400000.o00000());
                    }
                    object3 = (List)iterable;
                    object8 = object5;
                    v3 = v2;
                    object7 = object3;
                } else {
                    iterable = tb.\u00d300000((ParameterizedType)type);
                    v2 = v4;
                    object5 = type4;
                    object6 = iterable;
                    iterable = new ArrayList(b.s.mc.o00000(iterable, 10));
                    object4 = object6.iterator();
                    while (object4.hasNext()) {
                        object3 = object4.next();
                        object6 = (Type)object3;
                        object3 = iterable;
                        object3.add(tb.o00000((Type)object6, (Map)object));
                    }
                    object3 = (List)iterable;
                    object8 = object5;
                    v3 = v2;
                    object7 = object3;
                }
                h2 = tb.o00000((Type)object8, v3, object7, false, null, 16, null);
            } else if (object6 instanceof TypeVariable) {
                Type type5 = type;
                h2 = tb.o00000(type5, tb.o00000((TypeVariable)type5, (Map)object), b.s.mc.\u00d500000(), false, null, 16, null);
            } else {
                if (object6 instanceof WildcardType) {
                    throw new lb("Wildcard type is not possible here: ".concat(String.valueOf(type)));
                }
                throw new lb("Type is not supported: " + type + " (" + type.getClass() + ')');
            }
        }
        object = h2;
        object6 = type;
        Object object9 = ((h)object).privatevoid();
        object5 = object9 instanceof z ? (z)object9 : null;
        Object object10 = b.t.c.b.b.b.c.f.\u00f500000;
        Object object11 = object5;
        if (object11 != null && (object11 = object11.\u00d8\u00d3O000()) != null) {
            object4 = object11;
            object3 = object10;
            e2 = new e((String)object4);
            object10 = object3;
        } else {
            e2 = null;
        }
        object9 = ((b.t.c.b.b.b.c.f)object10).\u00d500000(e2);
        if (object9 != null && object5 != null) {
            object9 = tb.o00000((Type)object6, ((h)object).privatevoid(), ((h)object).\u00f5\u00f60000(), ((h)object).\u00f4\u00f60000(), b.t.c.b.c.k.o00000((k)object9, (z)object5));
            n n3 = (n)object;
            object = object6;
            n2 = b.t.c.b.c.e.o\u00d6\u00d8000.o00000((n)object9, n3, false, new tb$_b$0((Type)object));
        } else {
            n2 = (n)object;
        }
        object6 = n2;
        switch (tb$_c.o00000[fd2.ordinal()]) {
            case 1: {
                return (u)object6;
            }
            case 2: {
                return ((n)object6).\u00d3o0000(true);
            }
        }
        Object object12 = ((n)object6).\u00d8\u00d8\u00d2000();
        if (object12 == null) {
            object12 = object6;
        }
        if ((object2 = ((n)object6).\u00d4\u00d8\u00d2000()) == null) {
            object2 = object6;
        }
        object = type;
        return b.t.c.b.c.e.o\u00d6\u00d8000.o00000((n)object12, ((n)object2).\u00d3o0000(true), false, new tb$_b$1((Type)object));
    }

    public static /* synthetic */ u o00000(Type type, Map map, fd fd2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            fd2 = fd.\u00d300000;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return tb.o00000(type, map, fd2, bl);
    }

    private static final h o00000(Type type, v v2, List list, boolean bl, z z2) {
        return new h(v2, list, bl, b.s.mc.\u00d500000(), null, false, false, false, z2, new tb$_b$2(type));
    }

    static /* synthetic */ h o00000(Type type, v v2, List list, boolean bl, z z2, int n2, Object object) {
        if ((n2 & 0x10) != 0) {
            z2 = null;
        }
        return tb.o00000(type, v2, list, bl, z2);
    }

    private static final u o00000(Class clazz, Map object) {
        Object object2;
        Object object3;
        Iterable iterable = tb.\u00d300000(clazz);
        Object object4 = b.o.r.o00000(clazz);
        Object object5 = clazz;
        e$_b e$_b = b.t.c.b.c.e.o\u00d6\u00d8000;
        Iterator iterator = iterable;
        iterable = new ArrayList(b.s.mc.o00000(iterable, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            object3 = (TypeVariable)object3;
            object2 = iterable;
            object3 = (Type)b.s.z.\u00f8O0000(((TypeVariable)c.returnObject(c.o00000(object3, (g)tb$_b$3.\u00d5\u00d5\u00d5000))).getBounds());
            object2.add(q.\u00d400000.\u00d200000(tb.o00000(object3, (Map)object, null, true, 2, null)));
        }
        object2 = (List)iterable;
        n n2 = tb.o00000((Type)object5, (v)object4, (List)object2, false, null, 16, null);
        iterable = tb.\u00d300000(clazz);
        object2 = b.o.r.o00000(clazz);
        object4 = clazz;
        object5 = n2;
        iterator = iterable;
        iterable = new ArrayList(b.s.mc.o00000(iterable, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            TypeVariable cfr_ignored_0 = (TypeVariable)object3;
            object = iterable;
            object.add(q.\u00d400000.o00000());
        }
        object = (List)iterable;
        return e$_b.o00000((n)object5, tb.o00000((Type)object4, (v)object2, (List)object, true, null, 16, null), true, new tb$_b$4(clazz));
    }

    public static final List \u00d300000(Class clazz) {
        return c.\u00d6o0000(c.\u00d5\u00d30000(c.o00000((Object)clazz, (g)tb$_b$5.\u00d4\u00d5\u00d5000), tb$_b$6.\u00d3\u00d5\u00d5000));
    }

    private static final List \u00d300000(ParameterizedType parameterizedType) {
        return c.\u00d6o0000(c.\u00d6\u00d20000(c.o00000((Object)parameterizedType, (g)tb$_b$7.newnewObject), tb$_b$8.o\u00d5\u00d5000));
    }

    private static final q o00000(Type type, Map map) {
        if (!(type instanceof WildcardType)) {
            return q.\u00d400000.\u00d200000(tb.o00000(type, map, null, false, 6, null));
        }
        Object[] objectArray = ((WildcardType)type).getUpperBounds();
        Object[] objectArray2 = ((WildcardType)type).getLowerBounds();
        if (objectArray.length > 1 || objectArray2.length > 1) {
            throw new lb("Wildcard types with many bounds are not supported: ".concat(String.valueOf(type)));
        }
        if (objectArray2.length == 1) {
            return q.\u00d400000.o00000(tb.o00000((Type)b.s.z.\u00f6O0000(objectArray2), map, null, false, 6, null));
        }
        if (objectArray.length == 1) {
            return q.\u00d400000.\u00d300000(tb.o00000((Type)b.s.z.\u00f6O0000(objectArray), map, null, false, 6, null));
        }
        return q.\u00d400000.o00000();
    }

    private static final b.t.c.b.z \u00d300000(TypeVariable typeVariable) {
        Object d2 = typeVariable.getGenericDeclaration();
        if (!(d2 instanceof Class)) {
            throw new lb("Non-class container of a type parameter is not supported: " + d2 + " (" + typeVariable + ')');
        }
        return (r)b.o.r.o00000((Class)d2);
    }

    private static final bb o00000(TypeVariable typeVariable, Map iterator) {
        bb bb2 = (bb)iterator.get(typeVariable);
        if (bb2 == null) {
            Object v1;
            block4: {
                iterator = tb.\u00d300000(typeVariable).O\u00d4O000();
                Object var2_2 = null;
                boolean bl = false;
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    Object t2 = iterator.next();
                    if (!fc.o00000((Object)((bb)t2).\u00f5\u00d4o000(), (Object)typeVariable.getName())) continue;
                    if (bl) {
                        v1 = null;
                        break block4;
                    }
                    var2_2 = t2;
                    bl = true;
                }
                v1 = !bl ? null : var2_2;
            }
            if ((bb2 = (bb)v1) == null) {
                throw new lb("Type parameter " + typeVariable.getName() + " is not found in " + tb.\u00d300000(typeVariable));
            }
        }
        return bb2;
    }

    public static final List o00000(TypeVariable[] object) {
        Object object2;
        Object object3;
        Iterator object4 = object;
        LinkedHashMap object52 = new LinkedHashMap(b.e.bb.\u00d200000(y.\u00d200000(((Object)object4).length), 16));
        Iterator iterator = object4;
        Map map = object52;
        int n2 = ((Object)iterator).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object5;
            object3 = object5 = (object = iterator[i2]);
            object2 = map;
            object = new mc(tb.\u00d300000((TypeVariable)object5), object5.getName(), l.\u00d500000, false);
            object2.put(object3, object);
        }
        object = map;
        for (Map.Entry entry : object.entrySet()) {
            TypeVariable typeVariable = (TypeVariable)entry.getKey();
            Object[] objectArray = typeVariable.getBounds();
            object2 = (mc)entry.getValue();
            Object[] objectArray2 = objectArray;
            Collection collection = new ArrayList(objectArray.length);
            for (Object object6 : objectArray2) {
                Type type = (Type)object6;
                object3 = collection;
                object3.add(tb.o00000(type, (Map)object, null, false, 6, null));
            }
            ((mc)object2).\u00f500000((List)collection);
        }
        return b.s.mc.\u00f5O0000(object.values());
    }

    private static final b.t.c.b.c.e o00000(h object, Type type) {
        Object object2;
        n n2 = (n)object;
        v v2 = ((h)object).privatevoid();
        object = ((h)object).\u00f5\u00f60000();
        v v3 = v2;
        Type type2 = type;
        n n3 = n2;
        e$_b e$_b = b.t.c.b.c.e.o\u00d6\u00d8000;
        Iterator iterator = object;
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            u u2;
            Object object3 = iterator.next();
            object3 = (q)object3;
            object2 = object;
            Object object4 = ((q)object3).o00000();
            if (object4 == null || (object4 = q.\u00d400000.\u00d300000(u2 = object4)) == null) {
                object4 = object3;
            }
            object2.add(object4);
        }
        object2 = (List)object;
        object = type;
        return (b.t.c.b.c.e)e$_b.o00000(n3, tb.o00000(type2, v3, (List)object2, true, null, 16, null), false, new tb$_b$9((Type)object));
    }

    private static final Type \u00d500000(Type type) {
        return type;
    }

    private static final Type \u00d200000(Type type) {
        return type;
    }

    private static final Type \u00d300000(Type type) {
        return type;
    }

    private static final TypeVariable \u00d200000(TypeVariable object) {
        if ((object = b.s.z.\u00f8O0000(object.getBounds())) instanceof TypeVariable) {
            return (TypeVariable)object;
        }
        return null;
    }

    private static final Type String(Class clazz) {
        return clazz;
    }

    private static final Class \u00d200000(Class clazz) {
        if (!Modifier.isStatic(clazz.getModifiers())) {
            return clazz.getDeclaringClass();
        }
        return null;
    }

    private static final b.g.n \u00d800000(Class clazz) {
        return b.s.z.\u00f5\u00d20000(clazz.getTypeParameters());
    }

    private static final ParameterizedType String(ParameterizedType type) {
        if ((type = type.getOwnerType()) instanceof ParameterizedType) {
            return type;
        }
        return null;
    }

    private static final Iterable \u00d200000(ParameterizedType parameterizedType) {
        return b.s.z.thisnew(parameterizedType.getActualTypeArguments());
    }

    private static final Type \u00d800000(Type type) {
        return type;
    }

    static /* synthetic */ Type String(Type type) {
        return tb.\u00d500000(type);
    }

    static /* synthetic */ Type o00000(Type type) {
        return tb.\u00d200000(type);
    }

    static /* synthetic */ Type \u00d600000(Type type) {
        return tb.\u00d300000(type);
    }

    static /* synthetic */ TypeVariable o00000(TypeVariable typeVariable) {
        return tb.\u00d200000(typeVariable);
    }

    static /* synthetic */ Type \u00d600000(Class clazz) {
        return tb.String(clazz);
    }

    static /* synthetic */ Class \u00d500000(Class clazz) {
        return tb.\u00d200000(clazz);
    }

    static /* synthetic */ b.g.n o00000(Class clazz) {
        return tb.\u00d800000(clazz);
    }

    static /* synthetic */ ParameterizedType \u00d500000(ParameterizedType parameterizedType) {
        return tb.String(parameterizedType);
    }

    static /* synthetic */ Iterable o00000(ParameterizedType parameterizedType) {
        return tb.\u00d200000(parameterizedType);
    }

    static /* synthetic */ Type null(Type type) {
        return tb.\u00d800000(type);
    }
}

