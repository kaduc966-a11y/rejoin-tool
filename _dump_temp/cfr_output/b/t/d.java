/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.g.c;
import b.g.n;
import b.o.d.fc;
import b.o.d.jb;
import b.o.d.mc;
import b.o.e.g;
import b.o.r;
import b.q.f;
import b.qd;
import b.t.ab;
import b.t.bb;
import b.t.d$_b;
import b.t.d$_c$_b$1;
import b.t.h;
import b.t.l;
import b.t.o;
import b.t.q;
import b.t.u;
import b.t.y;
import b.t.z;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class d {
    public static final Type \u00d200000(u u2) {
        Type type;
        if (u2 instanceof mc && (type = ((mc)u2).\u00d3\u00f80000()) != null) {
            return type;
        }
        return d.o00000(u2, false, 1, null);
    }

    public static /* synthetic */ void o00000(u u2) {
    }

    private static final Type \u00d200000(u object, boolean bl) {
        Object object2 = object.privatevoid();
        if (object2 instanceof bb) {
            if (!(object2 instanceof jb)) {
                return new ab((bb)object2);
            }
            GenericDeclaration genericDeclaration = ((jb)object2).\u00f8\u00d4o000();
            if (genericDeclaration == null) {
                throw new UnsupportedOperationException("javaType is not supported for this type: ".concat(String.valueOf(object)));
            }
            object = genericDeclaration.getTypeParameters();
            Object object3 = null;
            bl = false;
            for (Object object4 : object) {
                if (!fc.o00000((Object)((TypeVariable)object4).getName(), (Object)((jb)object2).\u00f5\u00d4o000())) continue;
                if (bl) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                object3 = object4;
                bl = true;
            }
            if (!bl) {
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return (Type)object3;
        }
        if (object2 instanceof z) {
            Class clazz = bl ? r.new((z)object2) : r.\u00d300000((z)object2);
            object2 = object.\u00f5\u00f60000();
            if (object2.isEmpty()) {
                return clazz;
            }
            if (clazz.isArray()) {
                if (clazz.getComponentType().isPrimitive()) {
                    return clazz;
                }
                q q2 = (q)b.s.mc.\u00d8O0000((List)object2);
                if (q2 == null) {
                    throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: ".concat(String.valueOf(object)));
                }
                object = q2;
                object2 = q2.\u00d400000();
                u u2 = ((q)object).\u00d300000();
                Object object5 = object2;
                switch (object5 == null ? -1 : d$_b.o00000[((Enum)object5).ordinal()]) {
                    case -1: 
                    case 1: {
                        return clazz;
                    }
                    case 2: 
                    case 3: {
                        Type type = d.o00000(u2, false, 1, null);
                        if (type instanceof Class) {
                            return clazz;
                        }
                        return new y(type);
                    }
                }
                throw new qd();
            }
            return d.o00000(clazz, (List)object2);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: ".concat(String.valueOf(object)));
    }

    static /* synthetic */ Type o00000(u u2, boolean bl, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        return d.\u00d200000(u2, bl);
    }

    private static final Type o00000(Class object, List object2) {
        Object object3;
        Class<?> clazz = ((Class)object).getDeclaringClass();
        if (clazz == null) {
            Object object4;
            Class clazz2 = object;
            object = (Iterable)object2;
            Class clazz3 = clazz2;
            object2 = object;
            object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                object2 = (q)t2;
                object4 = object;
                object4.add(d.\u00d200000((q)object2));
            }
            object = object4 = (List)object;
            object2 = clazz3;
            return new o((Class)object2, null, (List)object);
        }
        Iterator iterator = clazz;
        if (Modifier.isStatic(((Class)object).getModifiers())) {
            Object object5;
            Object object6 = (Iterable)object2;
            Type type = (Type)((Object)iterator);
            Iterator iterator2 = object;
            object = object6;
            object2 = new ArrayList(b.s.mc.o00000((Iterable)object6, 10));
            object = object.iterator();
            while (object.hasNext()) {
                iterator = object.next();
                object6 = (q)((Object)iterator);
                object5 = object2;
                object5.add(d.\u00d200000((q)object6));
            }
            object = object5 = (List)object2;
            object2 = type;
            iterator = iterator2;
            return new o((Class)((Object)iterator), (Type)object2, (List)object);
        }
        int n2 = ((Class)object).getTypeParameters().length;
        Iterator iterator3 = object;
        object = object2.subList(0, n2);
        Type type = d.o00000(iterator, object2.subList(n2, object2.size()));
        Iterator iterator4 = iterator3;
        object2 = object;
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            Object t3 = iterator.next();
            object2 = (q)t3;
            object3 = object;
            object3.add(d.\u00d200000((q)object2));
        }
        object = object3 = (List)object;
        object2 = type;
        iterator = iterator4;
        return new o((Class)((Object)iterator), (Type)object2, (List)object);
    }

    private static final Type \u00d200000(q object) {
        l l2 = ((q)object).new();
        if (l2 == null) {
            return h.\u00d400000.o00000();
        }
        l l3 = l2;
        object = ((q)object).o00000();
        switch (d$_b.o00000[l3.ordinal()]) {
            case 2: {
                return d.\u00d200000((u)object, true);
            }
            case 1: {
                return new h(null, d.\u00d200000((u)object, true));
            }
            case 3: {
                return new h(d.\u00d200000((u)object, true), null);
            }
        }
        throw new qd();
    }

    private static /* synthetic */ void o00000(q q2) {
    }

    private static final String \u00d200000(Type object) {
        if (object instanceof Class) {
            if (((Class)object).isArray()) {
                object = c.o00000(object, (g)d$_c$_b$1.\u00d4\u00f5\u00d3000);
                return ((Class)c.returnObject((n)object)).getName() + f.super((CharSequence)"[]", c.\u00f8\u00d30000((n)object));
            }
            return ((Class)object).getName();
        }
        return object.toString();
    }

    public static final /* synthetic */ Type o00000(u u2, boolean bl) {
        return d.\u00d200000(u2, bl);
    }

    public static final /* synthetic */ String o00000(Type type) {
        return d.\u00d200000(type);
    }
}

