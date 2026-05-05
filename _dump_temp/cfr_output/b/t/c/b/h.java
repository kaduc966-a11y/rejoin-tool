/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.q.kb;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.c.c.c;
import b.t.c.b.b.c.i;
import b.t.c.b.b.c.u;
import b.t.c.b.b.d.f;
import b.t.c.b.b.k.b;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.s;
import b.t.c.b.fb;
import b.t.c.b.h$_b$0;
import b.t.c.b.h$_b$1;
import b.t.c.b.h$_b$2;
import b.t.c.b.h$_b$3;
import b.t.c.b.h$_b$4;
import b.t.c.b.h$_b$5;
import b.t.c.b.h$_d;
import b.t.c.b.hd;
import b.t.c.b.ib;
import b.t.c.b.jc;
import b.t.c.b.lb;
import b.t.c.b.p;
import b.t.c.b.pc;
import b.t.c.b.sb;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class h
implements b.o.d.y {
    public static final h$_d \u00d3\u00f8o000 = new h$_d(null);
    private static final Class o\u00f8o000 = Class.forName("b.o.d.w");
    public static final kb nullvoidsuper = new kb("<v#(\\d+)>");

    protected Class \u00f8\u00d4O000() {
        Class clazz = e.o00000(this.iffor());
        if (clazz == null) {
            clazz = this.iffor();
        }
        return clazz;
    }

    public abstract Collection whilefor();

    public abstract Collection o\u00d5O000();

    public abstract Collection new(f var1);

    public abstract Collection o00000(f var1);

    public abstract pb o\u00d30000(int var1);

    public abstract b.t.c.b.b.c.e whilenew(int var1);

    private final ClassLoader O\u00d5O000() {
        return e.\u00d800000(this.iffor());
    }

    public final b.t.i o00000(int n2, String string) {
        b.t.c.b.b.c.e e2 = this.whilenew(n2);
        if (e2 == null) {
            return null;
        }
        b.t.c.b.b.c.e e3 = e2;
        if (e2.\u00f400000() != null) {
            throw new lb("Local property " + e3.\u00f800000() + " is an extension, which is not yet supported");
        }
        if (b.t.c.b.b.c.b.\u00d600000(e3)) {
            return new sb(this, string, null, e3);
        }
        return new fb(this, string, null, e3);
    }

    public final b.t.c.b.b.c.e \u00d500000(String string, String string2) {
        if (!(this instanceof jc)) {
            String string3 = "Only top-level properties are supported for now: " + this + '/' + string + " (" + string2 + ')';
            throw new IllegalArgumentException(string3.toString());
        }
        Object object = ((jc)this).o\u00d3o000();
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            b.t.c.b.b.c.e e3 = (b.t.c.b.b.c.e)e2;
            if (!(fc.o00000((Object)e3.\u00f800000(), (Object)string) && fc.o00000((Object)p.\u00d200000(e3, this), (Object)string2))) continue;
            collection.add(e2);
        }
        object = (List)collection;
        if (object.isEmpty()) {
            throw new lb("Property '" + string + "' (JVM signature: " + string2 + ") not resolved in " + this);
        }
        if (object.size() > 1) {
            throw new lb("Property '" + string + "' (JVM signature: " + string2 + ") resolved in several methods in " + this);
        }
        return (b.t.c.b.b.c.e)mc.\u00d5O0000((List)object);
    }

    public final pb o00000(String string, String string2) {
        Object object;
        Object object2 = nullvoidsuper.\u00d300000(string2);
        if (object2 != null) {
            object2 = (String)object2.\u00d200000().o00000().\u00d600000().get(1);
            pb pb2 = this.o\u00d30000(Integer.parseInt((String)object2));
            if (pb2 == null) {
                throw new lb("Local property #" + (String)object2 + " not found in " + this.iffor());
            }
            return pb2;
        }
        object2 = this.new(f.\u00d300000(string));
        Object object3 = new ArrayList();
        Object object4 = object2.iterator();
        while (object4.hasNext()) {
            object2 = object4.next();
            object = (pb)object2;
            if (!fc.o00000((Object)ib.super.super((pb)object).super(), (Object)string2)) continue;
            object3.add(object2);
        }
        object2 = (List)object3;
        if (object2.isEmpty()) {
            throw new lb("Property '" + string + "' (JVM signature: " + string2 + ") not resolved in " + this);
        }
        if (object2.size() != 1) {
            object2 = (Iterable)object2;
            object4 = new LinkedHashMap();
            object = object2.iterator();
            while (object.hasNext()) {
                Object object5 = object4;
                object2 = object.next();
                object3 = ((pb)object2).\u00d50O000();
                Object object6 = object5.get(object3);
                if (object6 == null) {
                    object6 = new ArrayList();
                    object5.put(object3, object6);
                }
                ((List)object6).add(object2);
            }
            object2 = h$_b$0.\u00f4\u00d8\u00d3000;
            if ((object2 = (List)mc.\u00f8o0000(y.o00000((Map)object4, new h$_b$1((b.o.e.f)object2)).values())).size() == 1) {
                return (pb)mc.Oo0000((List)object2);
            }
            object2 = mc.o00000(this.new(f.\u00d300000(string)), "\n", null, null, 0, null, h$_b$2.\u00d5\u00d4\u00d5000, 30, null);
            throw new lb("Property '" + string + "' (JVM signature: " + string2 + ") not resolved in " + this + ':' + (((CharSequence)object2).length() == 0 ? " no members found" : "\n".concat(String.valueOf(object2))));
        }
        return (pb)mc.\u00d5O0000((List)object2);
    }

    public final u \u00d300000(String string, String string2) {
        if (!(this instanceof jc)) {
            String string3 = "Only top-level functions are supported for now: " + this + '/' + string + " (" + string2 + ')';
            throw new IllegalArgumentException(string3.toString());
        }
        Object object = ((jc)this).\u00d3\u00d3o000();
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            u u2 = (u)e2;
            if (!(fc.o00000((Object)u2.\u00f500000(), (Object)string) && fc.o00000((Object)String.valueOf(c.super(u2)), (Object)string2))) continue;
            collection.add(e2);
        }
        object = (List)collection;
        if (object.size() != 1) {
            object = mc.o00000(((jc)this).\u00d3\u00d3o000(), "\n", null, null, 0, null, h$_b$3.\u00d4\u00d4\u00d5000, 30, null);
            throw new lb("Function '" + string + "' (JVM signature: " + string2 + ") not resolved in " + this + ':' + (((CharSequence)object).length() == 0 ? " no members found" : " several matching members found:\n".concat(String.valueOf(object))));
        }
        return (u)mc.\u00d5O0000((List)object);
    }

    public final ic new(String string, String string2) {
        Collection collection = fc.o00000((Object)string, (Object)"<init>") ? (Collection)mc.\u00f5O0000(this.o\u00d5O000()) : this.o00000(f.\u00d300000(string));
        Object object = collection;
        Collection collection2 = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            ic ic2 = (ic)e2;
            if (!fc.o00000((Object)ib.super.super(ic2).super(), (Object)string2)) continue;
            collection2.add(e2);
        }
        object = (List)collection2;
        if (object.size() != 1) {
            object = mc.o00000(collection, "\n", null, null, 0, null, h$_b$4.\u00d3\u00d4\u00d5000, 30, null);
            throw new lb("Function '" + string + "' (JVM signature: " + string2 + ") not resolved in " + this + ':' + (((CharSequence)object).length() == 0 ? " no members found" : "\n".concat(String.valueOf(object))));
        }
        return (ic)mc.\u00d5O0000((List)object);
    }

    public final i return(String string) {
        Object object = this.whilefor();
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (!fc.o00000((Object)String.valueOf(c.super((i)e2)), (Object)string)) continue;
            collection.add(e2);
        }
        object = (List)collection;
        if (object.size() != 1) {
            object = mc.o00000(this.whilefor(), "\n", null, null, 0, null, h$_b$5.nullsuperObject, 30, null);
            throw new lb("Constructor (JVM signature: " + string + ") not resolved in " + this + ':' + (((CharSequence)object).length() == 0 ? " no constructors found" : " several matching constructors found:\n".concat(String.valueOf(object))));
        }
        return (i)mc.\u00d5O0000((List)object);
    }

    private final Method o00000(Class clazz, String string, Class[] classArray, Class clazz2, boolean bl) {
        Method method;
        Method object;
        if (bl) {
            classArray[0] = clazz;
        }
        if ((object = this.o00000(clazz, string, classArray, clazz2)) != null) {
            return object;
        }
        Class clazz3 = clazz.getSuperclass();
        if (clazz3 != null && (method = this.o00000(clazz3, string, classArray, clazz2, bl)) != null) {
            return method;
        }
        for (GenericDeclaration genericDeclaration : clazz.getInterfaces()) {
            GenericDeclaration genericDeclaration2 = this.o00000((Class)genericDeclaration, string, classArray, clazz2, bl);
            if (genericDeclaration2 != null) {
                return genericDeclaration2;
            }
            if (!bl || (genericDeclaration2 = b.t.c.b.b.q.d.c.f.super(e.\u00d800000(genericDeclaration), genericDeclaration.getName() + "$DefaultImpls")) == null) continue;
            classArray[0] = genericDeclaration;
            genericDeclaration = this.o00000((Class)genericDeclaration2, string, classArray, clazz2);
            if (genericDeclaration == null) continue;
            return genericDeclaration;
        }
        return null;
    }

    private final Method o00000(Class objectArray, String string, Class[] classArray, Class clazz) {
        Method method;
        try {
            Method method2;
            method = objectArray.getDeclaredMethod(string, Arrays.copyOf(classArray, classArray.length));
            if (fc.o00000(method.getReturnType(), (Object)clazz)) {
                method2 = method;
            } else {
                Object object;
                block5: {
                    for (Object object2 : (Object[])objectArray.getDeclaredMethods()) {
                        Method method3 = (Method)object2;
                        if (!(fc.o00000((Object)method3.getName(), (Object)string) && fc.o00000(method3.getReturnType(), (Object)clazz) && Arrays.equals(method3.getParameterTypes(), classArray))) continue;
                        object = object2;
                        break block5;
                    }
                    object = null;
                }
                method2 = (Method)object;
            }
            method = method2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            method = null;
        }
        return method;
    }

    private final Constructor o00000(Class genericDeclaration, List list) {
        try {
            Class[] classArray = ((Collection)list).toArray(new Class[0]);
            genericDeclaration = genericDeclaration.getDeclaredConstructor(Arrays.copyOf(classArray, classArray.length));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            genericDeclaration = null;
        }
        return genericDeclaration;
    }

    public final Method \u00d400000(String string, String object) {
        if (fc.o00000((Object)string, (Object)"<init>")) {
            return null;
        }
        object = hd.super(this.O\u00d5O000(), (String)object, true);
        Class[] classArray = ((Collection)((pc)object).\u00d200000()).toArray(new Class[0]);
        Class clazz = ((pc)object).o00000();
        h h2 = this;
        object = h2.o00000(h2.\u00f8\u00d4O000(), string, classArray, clazz, false);
        if (object != null) {
            return object;
        }
        if (this.\u00f8\u00d4O000().isInterface() && (object = this.o00000(Object.class, string, classArray, clazz, false)) != null) {
            return object;
        }
        return null;
    }

    public final Method o00000(String string, String object, boolean bl, boolean bl2) {
        if (fc.o00000((Object)string, (Object)"<init>")) {
            return null;
        }
        ArrayList<Class> arrayList = new ArrayList<Class>();
        if (bl) {
            arrayList.add(this.iffor());
        }
        object = hd.super(this.O\u00d5O000(), (String)object, true);
        this.o00000(arrayList, ((pc)object).\u00d200000(), false, bl2);
        h h2 = this;
        return h2.o00000(h2.\u00f8\u00d4O000(), string + "$default", ((Collection)arrayList).toArray(new Class[0]), ((pc)object).o00000(), bl);
    }

    public final Constructor \u00d500000(String string) {
        h h2 = this;
        return h2.o00000(h2.iffor(), hd.super(this.O\u00d5O000(), string, false).\u00d200000());
    }

    public final Constructor \u00d800000(String object) {
        ArrayList arrayList;
        h h2 = this;
        ArrayList arrayList2 = arrayList = new ArrayList();
        Class clazz = h2.iffor();
        h h3 = h2;
        object = hd.super(this.O\u00d5O000(), (String)object, false).\u00d200000();
        this.o00000(arrayList2, (List)object, true, false);
        return h3.o00000(clazz, arrayList);
    }

    private final void o00000(List list, List list2, boolean bl, boolean n2) {
        list2 = fc.o00000(mc.\u00f4O0000(list2), (Object)o\u00f8o000) ? list2.subList(0, list2.size() - 1) : list2;
        n2 = n2 != 0 ? list2.size() - 1 : list2.size();
        list.addAll(list2);
        int n3 = (n2 + 32 - 1) / 32;
        for (n2 = 0; n2 < n3; ++n2) {
            list.add(Integer.TYPE);
        }
        list.add(bl ? o\u00f8o000 : Object.class);
    }

    private static final int new(s s2, s s3) {
        Integer n2 = eb.super(s2, s3);
        if (n2 != null) {
            return n2;
        }
        return 0;
    }

    private static final int o00000(b.o.e.f f2, Object object, Object object2) {
        return ((Number)f2.o00000(object, object2)).intValue();
    }

    private static final CharSequence new(pb pb2) {
        return b.class.super(pb2) + " | " + ib.super.super(pb2).super();
    }

    private static final CharSequence new(u u2) {
        return u2.\u00f500000() + " | " + c.super(u2);
    }

    private static final CharSequence new(ic ic2) {
        return b.class.super(ic2) + " | " + ib.super.super(ic2).super();
    }

    private static final CharSequence o00000(i i2) {
        return String.valueOf(c.super(i2));
    }

    static /* synthetic */ int o00000(s s2, s s3) {
        return h.new(s2, s3);
    }

    static /* synthetic */ int new(b.o.e.f f2, Object object, Object object2) {
        return h.o00000(f2, object, object2);
    }

    static /* synthetic */ CharSequence o00000(pb pb2) {
        return h.new(pb2);
    }

    static /* synthetic */ CharSequence o00000(u u2) {
        return h.new(u2);
    }

    static /* synthetic */ CharSequence o00000(ic ic2) {
        return h.new(ic2);
    }

    static /* synthetic */ CharSequence new(i i2) {
        return h.o00000(i2);
    }
}

