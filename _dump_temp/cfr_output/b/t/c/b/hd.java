/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.o.d.ob;
import b.o.d.x;
import b.o.d.yb;
import b.qb;
import b.qd;
import b.t.c.b.b.b.b.b$_b;
import b.t.c.b.b.b.b.b$_e;
import b.t.c.b.b.b.c;
import b.t.c.b.b.f.b.cb;
import b.t.c.b.b.f.b.q;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.h;
import b.t.c.b.b.l.d.j;
import b.t.c.b.b.n.b.db;
import b.t.c.b.b.n.c.ab;
import b.t.c.b.b.o.c.bb;
import b.t.c.b.b.o.c.f;
import b.t.c.b.b.o.c.k;
import b.t.c.b.b.o.c.t;
import b.t.c.b.b.o.c.t$_b;
import b.t.c.b.b.o.c.t$_b$_b;
import b.t.c.b.b.o.c.t$_b$_c;
import b.t.c.b.b.o.c.y;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.d.b.p;
import b.t.c.b.b.q.d.b.v;
import b.t.c.b.b.q.d.c.c$_b;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.vb;
import b.t.c.b.c.n;
import b.t.c.b.gb;
import b.t.c.b.hd$_b$0;
import b.t.c.b.hd$_c;
import b.t.c.b.jd;
import b.t.c.b.lb;
import b.t.c.b.o;
import b.t.c.b.pc;
import b.t.c.b.r;
import b.t.c.b.s;
import b.t.c.b.sc;
import b.t.c.b.vc;
import b.t.c.b.xc;
import b.t.c.b.zb;
import b.t.u;
import b.t.z;
import b.yc;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class hd {
    private static final b.t.c.b.b.d.k o00000 = new b.t.c.b.b.d.k("b.o.m");
    private static final String \u00d200000 = b$_e.if.o00000().super() + '.' + b$_e.if.new();

    public static final b.t.c.b.b.d.k super() {
        return o00000;
    }

    public static final Class super(ib ib2) {
        Object object = ib2.\u00f4\u00f80000();
        if (object instanceof db) {
            return ((b.t.c.b.b.q.d.c.n)((db)object).\u00f800000()).\u00d400000();
        }
        if (object instanceof c$_b) {
            return ((v)((c$_b)object).\u00d300000()).\u00d3\u00d20000();
        }
        b.t.c.b.b.d.d d2 = b.o00000((kb)ib2);
        if (d2 == null) {
            return null;
        }
        object = d2;
        return hd.super(b.t.c.b.b.q.d.b.e.\u00d800000(ib2.getClass()), (b.t.c.b.b.d.d)object, 0, 2, null);
    }

    public static final Class super(ClassLoader classLoader, b.t.c.b.b.d.d d2, int n2) {
        b.t.c.b.b.d.e e2;
        Object object;
        while ((object = b.q.f.Objectsuper(b.q.f.class((e2 = d2.\u00f400000().\u00d800000()).\u00d300000(), \u00d200000, null, 2, null))) != null) {
            int n3 = ((Number)object).intValue();
            d2 = b$_b.\u00f800000.o00000(n3 + 1);
        }
        b.t.c.b.b.d.d d3 = b.t.c.b.b.b.c.f.\u00f500000.o00000(e2);
        if (d3 == null) {
            d3 = d2;
        }
        object = d3;
        return hd.super(!fc.o00000((Object)d3, (Object)d2) ? b.t.c.b.b.q.d.b.e.\u00d800000(b.i.class) : classLoader, ((b.t.c.b.b.d.d)object).\u00d800000().super(), ((b.t.c.b.b.d.d)object).\u00d400000().super(), n2);
    }

    public static /* synthetic */ Class super(ClassLoader classLoader, b.t.c.b.b.d.d d2, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return hd.super(classLoader, d2, n2);
    }

    private static final Class super(ClassLoader classLoader, String string, String string2, int n2) {
        block35: {
            if (!fc.o00000((Object)string, (Object)"kotlin")) break block35;
            switch (string2) {
                case "Array": {
                    return Object[].class;
                }
                case "BooleanArray": {
                    return boolean[].class;
                }
                case "ByteArray": {
                    return byte[].class;
                }
                case "CharArray": {
                    return char[].class;
                }
                case "DoubleArray": {
                    return double[].class;
                }
                case "FloatArray": {
                    return float[].class;
                }
                case "IntArray": {
                    return int[].class;
                }
                case "LongArray": {
                    return long[].class;
                }
                case "ShortArray": {
                    return short[].class;
                }
            }
        }
        CharSequence charSequence = new StringBuilder();
        StringBuilder stringBuilder = charSequence;
        if (n2 > 0) {
            for (int i2 = 0; i2 < n2; ++i2) {
                stringBuilder.append("[");
            }
            stringBuilder.append("L");
        }
        if (((CharSequence)string).length() > 0) {
            stringBuilder.append(string + '.');
        }
        stringBuilder.append(b.q.f.super(string2, '.', '$', false, 4, null));
        if (n2 > 0) {
            stringBuilder.append(";");
        }
        charSequence = ((StringBuilder)charSequence).toString();
        return b.t.c.b.b.q.d.c.f.super(classLoader, (String)charSequence);
    }

    public static final Class super(Class clazz) {
        return Array.newInstance(clazz, 0).getClass();
    }

    public static final b.t.j super(b.t.c.b.b.q.s s2) {
        if (fc.o00000((Object)s2, (Object)eb.\u00d200000)) {
            return b.t.j.\u00d500000;
        }
        if (fc.o00000((Object)s2, (Object)eb.\u00d600000)) {
            return b.t.j.o00000;
        }
        if (fc.o00000((Object)s2, (Object)eb.\u00f500000)) {
            return b.t.j.\u00d400000;
        }
        if (fc.o00000((Object)s2, (Object)eb.oO0000) || fc.o00000((Object)s2, (Object)eb.\u00f600000)) {
            return b.t.j.return;
        }
        return null;
    }

    public static final List super(i iterator) {
        iterator = iterator.\u00d4\u00f80000();
        Collection collection = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Annotation annotation;
            Object object = (l)iterator.next();
            g g2 = object.\u00d200000();
            if (g2 instanceof b.t.c.b.b.q.d.c.g) {
                annotation = ((b.t.c.b.b.q.d.c.g)g2).\u00d400000();
            } else if (g2 instanceof c$_b) {
                object = ((c$_b)g2).\u00d300000();
                p p2 = object instanceof p ? (p)object : null;
                annotation = p2 != null ? p2.forObject() : null;
            } else {
                annotation = hd.super((l)object);
            }
            if (annotation == null) continue;
            object = annotation;
            collection.add(object);
        }
        return hd.super((List)collection);
    }

    public static final boolean \u00d200000(Annotation annotation) {
        return hd.\u00d300000(b.o.r.o00000(annotation));
    }

    private static final boolean \u00d300000(z z2) {
        return b.o.r.\u00d300000(z2).getAnnotation(Inherited.class) != null;
    }

    private static final z super(z z2) {
        return b.o.r.o00000(b.o.r.\u00d300000(z2).getDeclaredMethod("value", new Class[0]).getReturnType().getComponentType());
    }

    public static final boolean super(Annotation annotation) {
        return hd.\u00d200000(b.o.r.o00000(annotation)) && !hd.\u00d300000(hd.super(b.o.r.o00000(annotation)));
    }

    public static final z \u00d300000(Annotation object) {
        if (hd.\u00d200000((z)(object = b.o.r.o00000((Annotation)object)))) {
            return hd.super((z)object);
        }
        return object;
    }

    private static final boolean \u00d400000(z object) {
        return fc.o00000((Object)((Class)(object = b.o.r.\u00d300000((z)object))).getSimpleName(), (Object)"Container") && ((Class)object).getAnnotation(b.o.d.cb.class) != null;
    }

    private static final boolean \u00d200000(z object) {
        Object object2;
        block6: {
            object = b.o.r.\u00d300000((z)object);
            Method method = hd.super((Class)object, "value", new Class[0]);
            if (method == null) {
                return false;
            }
            Class<?> clazz = method.getReturnType().getComponentType();
            if (clazz == null) {
                return false;
            }
            Class<?> object3 = clazz;
            if (!clazz.isAnnotation()) {
                return false;
            }
            for (Object object4 : (Object[])object3.getAnnotations()) {
                if (!fc.o00000((Object)b.o.r.\u00d300000(b.o.r.o00000((Annotation)object4)).getName(), (Object)ab.\u00d2O0000.super())) continue;
                object2 = object4;
                break block6;
            }
            object2 = null;
        }
        Annotation annotation = (Annotation)object2;
        if (annotation == null) {
            return false;
        }
        Annotation annotation2 = annotation;
        Object object5 = b.o.r.\u00d300000(b.o.r.o00000(annotation)).getMethod("value", new Class[0]).invoke((Object)annotation2, new Object[0]);
        if (object5 == null) {
            return false;
        }
        Object object6 = object5;
        return fc.o00000(object, object6);
    }

    public static final List super(List object) {
        boolean bl;
        Object object2 = (Iterable)object;
        if (!(object2 instanceof Collection) || !((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if (!fc.o00000((Object)b.o.r.\u00d300000(b.o.r.o00000((Annotation)object2.next())).getSimpleName(), (Object)"Container")) continue;
                bl = true;
                break;
            }
        } else {
            bl = false;
        }
        if (bl) {
            object2 = (Iterable)object;
            Collection collection = new ArrayList();
            object = object2.iterator();
            while (object.hasNext()) {
                object2 = (Annotation)object.next();
                z z2 = b.o.r.o00000((Annotation)object2);
                object2 = hd.\u00d400000(z2) ? b.s.z.\u00d500000((Annotation[])b.o.r.\u00d300000(z2).getDeclaredMethod("value", new Class[0]).invoke(object2, new Object[0])) : b.s.mc.o00000(object2);
                b.s.mc.new(collection, (Iterable)object2);
            }
            return (List)collection;
        }
        return object;
    }

    private static final Annotation super(l iterator) {
        ib ib2 = b.o00000((l)((Object)iterator));
        Class clazz = ib2 != null ? hd.super(ib2) : null;
        Class clazz2 = clazz instanceof Class ? clazz : null;
        if (clazz2 == null) {
            return null;
        }
        clazz = clazz2;
        iterator = iterator.super().entrySet();
        Class clazz3 = clazz2;
        Collection collection = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            qb qb2;
            Object object = (Map.Entry)iterator.next();
            b.t.c.b.b.d.f f2 = (b.t.c.b.b.d.f)object.getKey();
            Object object2 = hd.super((b.t.c.b.b.o.c.j)object.getValue(), clazz.getClassLoader());
            if (object2 != null) {
                object = object2;
                qb2 = yc.o00000(f2.\u00d400000(), object);
            } else {
                qb2 = null;
            }
            if (qb2 == null) continue;
            object = qb2;
            collection.add(object);
        }
        return (Annotation)b.t.c.b.d.j.o00000(clazz3, b.s.y.o00000((List)collection), null, 4, null);
    }

    private static final Object super(b.t.c.b.b.o.c.j object, ClassLoader classLoader) {
        Object object2 = object;
        if (object2 instanceof bb) {
            return hd.super((l)((bb)object).o00000());
        }
        if (object2 instanceof k) {
            return hd.super((k)object, classLoader);
        }
        if (object2 instanceof f) {
            object = (qb)((f)object).o00000();
            object2 = (b.t.c.b.b.d.d)((qb)object).\u00d400000();
            object = (b.t.c.b.b.d.f)((qb)object).\u00d300000();
            Class clazz = hd.super(classLoader, (b.t.c.b.b.d.d)object2, 0, 2, null);
            if (clazz != null) {
                return jd.o00000(clazz, ((b.t.c.b.b.d.f)object).\u00d400000());
            }
            return null;
        }
        if (object2 instanceof t) {
            if ((object = (t$_b)((t)object).o00000()) instanceof t$_b$_b) {
                return hd.super(classLoader, ((t$_b$_b)object).\u00d400000(), ((t$_b$_b)object).new());
            }
            if (object instanceof t$_b$_c) {
                ib ib2 = (object = ((t$_b$_c)object).o00000().thisdosuper().\u00f4OO000()) instanceof ib ? (ib)object : null;
                if (ib2 != null) {
                    return hd.super(ib2);
                }
                return null;
            }
            throw new qd();
        }
        if (object2 instanceof y || object2 instanceof b.t.c.b.b.o.c.u) {
            return null;
        }
        return ((b.t.c.b.b.o.c.j)object).o00000();
    }

    /*
     * WARNING - void declaration
     */
    private static final Object super(k k2, ClassLoader object) {
        Iterable iterable;
        Object object2 = k2 instanceof b.t.c.b.b.o.c.s ? (b.t.c.b.b.o.c.s)k2 : null;
        if (object2 == null || (object2 = ((b.t.c.b.b.o.c.s)object2).Object()) == null) {
            return null;
        }
        Object object3 = object2;
        Iterable object42 = iterable = (Iterable)k2.o00000();
        Object object4 = new ArrayList(b.s.mc.o00000(iterable, 10));
        for (Object n5 : object42) {
            b.t.c.b.b.o.c.j j2 = (b.t.c.b.b.o.c.j)n5;
            iterable = object4;
            iterable.add(hd.super(j2, (ClassLoader)object));
        }
        iterable = (List)object4;
        b.t.c.b.b.b.j j3 = c.o00000((rc)object3);
        switch (j3 == null ? -1 : hd$_c.o00000[j3.ordinal()]) {
            case 1: {
                void n11;
                boolean n8 = false;
                int n2 = ((List)k2.o00000()).size();
                object = new boolean[n2];
                while (n11 < n2) {
                    void var6_40 = n11++;
                    object[var6_40] = (Boolean)iterable.get((int)var6_40);
                }
                return object;
            }
            case 2: {
                void n17;
                boolean n14 = false;
                int n3 = ((List)k2.o00000()).size();
                object = new char[n3];
                while (n17 < n3) {
                    void var6_41 = n17++;
                    object[var6_41] = ((Character)iterable.get((int)var6_41)).charValue();
                }
                return object;
            }
            case 3: {
                void n23;
                boolean n20 = false;
                int n4 = ((List)k2.o00000()).size();
                object = new byte[n4];
                while (n23 < n4) {
                    void var6_42 = n23++;
                    object[var6_42] = (Byte)iterable.get((int)var6_42);
                }
                return object;
            }
            case 4: {
                void var4_17;
                boolean n32 = false;
                int n5 = ((List)k2.o00000()).size();
                object = new short[n5];
                while (var4_17 < n5) {
                    void var6_43 = var4_17++;
                    object[var6_43] = (Short)iterable.get((int)var6_43);
                }
                return object;
            }
            case 5: {
                void var4_19;
                boolean bl = false;
                int n6 = ((List)k2.o00000()).size();
                object = new int[n6];
                while (var4_19 < n6) {
                    void var6_44 = var4_19++;
                    object[var6_44] = (Integer)iterable.get((int)var6_44);
                }
                return object;
            }
            case 6: {
                void var4_21;
                boolean bl = false;
                int n7 = ((List)k2.o00000()).size();
                object = new float[n7];
                while (var4_21 < n7) {
                    void var6_45 = var4_21++;
                    object[var6_45] = ((Float)iterable.get((int)var6_45)).floatValue();
                }
                return object;
            }
            case 7: {
                void var4_23;
                boolean bl = false;
                int n8 = ((List)k2.o00000()).size();
                object = new long[n8];
                while (var4_23 < n8) {
                    void var6_46 = var4_23++;
                    object[var6_46] = (Long)iterable.get((int)var6_46);
                }
                return object;
            }
            case 8: {
                void var4_25;
                boolean bl = false;
                int n9 = ((List)k2.o00000()).size();
                object = new double[n9];
                while (var4_25 < n9) {
                    void var6_47 = var4_25++;
                    object[var6_47] = (Double)iterable.get((int)var6_47);
                }
                return object;
            }
            case -1: {
                if (!c.\u00d800000((rc)object3)) {
                    object4 = "Not an array type: ".concat(String.valueOf(object3));
                    throw new IllegalStateException(object4.toString());
                }
                rc rc2 = ((hc)b.s.mc.\u00d5O0000(((rc)object3).\u00d4\u00d6\u00d2000())).\u00d300000();
                Object object5 = rc2.thisdosuper().\u00f4OO000();
                ib ib2 = object5 instanceof ib ? (ib)object5 : null;
                if (ib2 == null) {
                    throw new IllegalStateException("Not a class type: ".concat(String.valueOf(rc2)).toString());
                }
                object4 = ib2;
                if (c.\u00d600000(rc2)) {
                    int n26 = 0;
                    int n10 = ((List)k2.o00000()).size();
                    String[] stringArray = new String[n10];
                    while (n26 < n10) {
                        int n11 = n26++;
                        stringArray[n11] = iterable.get(n11);
                    }
                    return stringArray;
                }
                if (c.\u00d500000((ib)object4)) {
                    int n29 = 0;
                    int n12 = ((List)k2.o00000()).size();
                    Class[] classArray = new Class[n12];
                    while (n29 < n12) {
                        int n13 = n29++;
                        classArray[n13] = iterable.get(n13);
                    }
                    return classArray;
                }
                Object object6 = b.o00000((kb)object4);
                if (object6 == null || (object6 = hd.super((ClassLoader)object, (b.t.c.b.b.d.d)(object3 = object6), 0, 2, null)) == null) {
                    return null;
                }
                object5 = (Object[])Array.newInstance(object6, ((List)k2.o00000()).size());
                int n14 = iterable.size();
                int n15 = 0;
                while (n15 < n14) {
                    int n34 = n15++;
                    object5[n34] = iterable.get(n34);
                }
                return object5;
            }
        }
        throw new qd();
    }

    public static final vc \u00d200000(Object object) {
        Object object2 = object;
        if (object2 instanceof vc) {
            return (vc)object;
        }
        if (object2 instanceof yb) {
            if ((object = ((yb)object).fordo()) instanceof vc) {
                return (vc)object;
            }
            return null;
        }
        return null;
    }

    public static final s \u00d300000(Object object) {
        while (true) {
            Object object2;
            if ((object2 = object) instanceof xc) {
                object = ((xc)object).\u00d30o000();
                continue;
            }
            if (object2 instanceof s) {
                return (s)object;
            }
            if (!(object2 instanceof ob) || (!((object2 = ((x)((ob)object)).fordo()) == object) ? object2 : null) == null) break;
            object = object;
        }
        return null;
    }

    public static final o super(Object object) {
        while (true) {
            Object object2;
            if ((object2 = object) instanceof xc) {
                object = ((xc)object).\u00d30o000();
                continue;
            }
            if (object2 instanceof o) {
                return (o)object;
            }
            if (!(object2 instanceof x) || (!((object2 = ((x)object).fordo()) == object) ? object2 : null) == null) break;
            object = object;
        }
        return null;
    }

    public static final mc super(gb gb2) {
        b.t.c.b.b.q.b b2 = gb2.\u00d8\u00f4O000().\u00d400000();
        if (b2 != null) {
            return b2;
        }
        b2 = gb2.\u00f4\u00f4O000();
        if (b2 instanceof vb) {
            return ((vb)b2).Stringclasssuper();
        }
        if (b2.Stringclasssuper() != null) {
            return ((ib)b2.\u00d8\u00f80000()).\u00f5o\u00d2000();
        }
        return null;
    }

    public static final b.t.c.b.b.q.b super(Class object, b.t.c.b.b.f.b.b.i i2, b.t.c.b.b.p.v v2, e e2, d d2, j j2, b.o.e.f f2) {
        List list;
        object = sc.o00000((Class)object);
        Object object2 = v2;
        if (object2 instanceof b$_z) {
            list = ((b$_z)v2).O\u00f8\u00d3000();
        } else if (object2 instanceof b$_n) {
            list = ((b$_n)v2).donewnew();
        } else {
            throw new IllegalStateException("Unsupported message: ".concat(String.valueOf(v2)).toString());
        }
        object2 = list;
        object2 = new q(((b.t.c.b.b.q.d.c.h)object).\u00d200000(), e2, ((b.t.c.b.b.q.d.c.h)object).super(), d2, h.\u00d300000.o00000(), j2, i2, null, (List)object2);
        return (b.t.c.b.b.q.b)f2.o00000(new cb((q)object2), v2);
    }

    public static final boolean \u00d400000(u object) {
        r r2 = (object = object.privatevoid()) instanceof r ? (r)object : null;
        if (r2 != null) {
            return r2.\u00d3\u00d4O000();
        }
        return false;
    }

    public static final Object super(Type type) {
        if (type instanceof Class && ((Class)type).isPrimitive()) {
            Class clazz = (Class)type;
            if (fc.o00000((Object)clazz, Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (fc.o00000((Object)clazz, Character.TYPE)) {
                return Character.valueOf('\u0000');
            }
            if (fc.o00000((Object)clazz, Byte.TYPE)) {
                return (byte)0;
            }
            if (fc.o00000((Object)clazz, Short.TYPE)) {
                return (short)0;
            }
            if (fc.o00000((Object)clazz, Integer.TYPE)) {
                return 0;
            }
            if (fc.o00000((Object)clazz, Float.TYPE)) {
                return Float.valueOf(0.0f);
            }
            if (fc.o00000((Object)clazz, Long.TYPE)) {
                return 0L;
            }
            if (fc.o00000((Object)clazz, Double.TYPE)) {
                return 0.0;
            }
            if (fc.o00000((Object)clazz, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: ".concat(String.valueOf(type)));
        }
        return null;
    }

    public static final Method super(Class genericDeclaration, String string, Class ... classArray) {
        try {
            genericDeclaration = genericDeclaration.getDeclaredMethod(string, Arrays.copyOf(classArray, classArray.length));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            genericDeclaration = null;
        }
        return genericDeclaration;
    }

    public static final Field super(Class annotatedElement, String string) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            annotatedElement = null;
        }
        return annotatedElement;
    }

    public static final boolean super(u iterator) {
        if (iterator.\u00f4\u00f60000()) {
            return true;
        }
        n n2 = ((n)((Object)iterator)).\u00d4\u00d8\u00d2000();
        if (n2 != null && hd.super(n2)) {
            return true;
        }
        if (((n)((Object)iterator)).privatedosuper()) {
            return false;
        }
        if ((iterator = iterator.privatevoid()) instanceof b.t.bb) {
            boolean bl;
            if (!((iterator = (Iterable)((b.t.bb)((Object)iterator)).\u00f4\u00d4o000()) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    if (!hd.super((u)iterator.next())) continue;
                    bl = true;
                    break;
                }
            } else {
                bl = false;
            }
            if (bl) {
                return true;
            }
        }
        return false;
    }

    public static final zb super(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = 1;
        while (string.charAt(n2) != ')') {
            int n3 = n2;
            while (string.charAt(n3) == '[') {
                ++n3;
            }
            char c2 = string.charAt(n3);
            if (b.q.f.\u00d300000((CharSequence)"VZCBSIFJD", c2, false, 2, null)) {
                ++n3;
            } else if (c2 == 'L') {
                n3 = b.q.f.super((CharSequence)string, ';', n2, false, 4, null) + 1;
            } else {
                throw new lb("Unknown type prefix in the method signature: ".concat(String.valueOf(string)));
            }
            arrayList.add(string.substring(n2, n3));
            n2 = n3;
        }
        String string2 = string.substring(n2 + 1);
        return new zb(arrayList, string2);
    }

    public static final String class(z z2) {
        return "L" + b.q.f.super(b.t.c.d.super(z2), '.', '/', false, 4, null) + ';';
    }

    public static final boolean super(b.t.p object) {
        if (object instanceof b.t.c.b.kb && ((b.t.c.b.kb)object).nullvoid() && hd.\u00d400000(object.\u00f8\u00f50000())) {
            boolean bl;
            block3: {
                object = b.g.c.String(b.g.c.o00000((Object)object.\u00f8\u00f50000(), (b.o.e.g)hd$_b$0.\u00d3\u00d6\u00d5000), 1).o00000();
                while (object.hasNext()) {
                    if (!hd.super((u)object.next())) continue;
                    bl = true;
                    break block3;
                }
                bl = false;
            }
            if (bl) {
                return true;
            }
        }
        return false;
    }

    public static final u \u00d200000(u object) {
        r r2 = (object = object.privatevoid()) instanceof r ? (r)object : null;
        if (r2 != null) {
            return r2.nullsupersuper();
        }
        return null;
    }

    public static final pc super(ClassLoader classLoader, String object, boolean bl) {
        object = hd.super((String)object);
        Iterable iterable = ((zb)object).new();
        Object object2 = iterable;
        iterable = new ArrayList(b.s.mc.o00000(iterable, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (String)object3;
            Iterable iterable2 = iterable;
            iterable2.add(hd.super(classLoader, object3, 0, 0, 6, null));
        }
        classLoader = bl ? hd.super(classLoader, ((zb)object).o00000(), 0, 0, 6, null) : null;
        object = (List)iterable;
        return new pc((List)object, (Class)((Object)classLoader));
    }

    private static final Class super(ClassLoader classLoader, String string, int n2, int n3) {
        switch (string.charAt(n2)) {
            case 'L': {
                return classLoader.loadClass(b.q.f.super(string.substring(n2 + 1, n3 - 1), '/', '.', false, 4, null));
            }
            case '[': {
                return hd.super(hd.super(classLoader, string, n2 + 1, n3));
            }
            case 'V': {
                return Void.TYPE;
            }
            case 'Z': {
                return Boolean.TYPE;
            }
            case 'C': {
                return Character.TYPE;
            }
            case 'B': {
                return Byte.TYPE;
            }
            case 'S': {
                return Short.TYPE;
            }
            case 'I': {
                return Integer.TYPE;
            }
            case 'F': {
                return Float.TYPE;
            }
            case 'J': {
                return Long.TYPE;
            }
            case 'D': {
                return Double.TYPE;
            }
        }
        throw new lb("Unknown type prefix in the method signature: ".concat(String.valueOf(string)));
    }

    static /* synthetic */ Class super(ClassLoader classLoader, String string, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = string.length();
        }
        return hd.super(classLoader, string, n2, n3);
    }

    private static final u class(u u2) {
        return hd.\u00d200000(u2);
    }

    static /* synthetic */ u \u00d300000(u u2) {
        return hd.class(u2);
    }
}

