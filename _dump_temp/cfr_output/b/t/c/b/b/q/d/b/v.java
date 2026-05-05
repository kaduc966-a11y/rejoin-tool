/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.g.c;
import b.o.d.fc;
import b.s.mc;
import b.s.z;
import b.t.c.b.b.d.f;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.c.b$_b;
import b.t.c.b.b.q.c.b$_c;
import b.t.c.b.b.q.c.b$_d;
import b.t.c.b.b.q.d$_f;
import b.t.c.b.b.q.d$_i;
import b.t.c.b.b.q.d.b.b;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.b.j;
import b.t.c.b.b.q.d.b.k;
import b.t.c.b.b.q.d.b.l;
import b.t.c.b.b.q.d.b.m;
import b.t.c.b.b.q.d.b.o;
import b.t.c.b.b.q.d.b.p;
import b.t.c.b.b.q.d.b.s;
import b.t.c.b.b.q.d.b.v$_b$1;
import b.t.c.b.b.q.d.b.v$_b$2;
import b.t.c.b.b.q.d.b.v$_c$0;
import b.t.c.b.b.q.d.b.v$_c$1;
import b.t.c.b.b.q.d.b.v$_c$2;
import b.t.c.b.b.q.d.b.v$_d$2;
import b.t.c.b.b.q.d.b.v$_e$1;
import b.t.c.b.b.q.d.b.v$_e$2;
import b.t.c.b.b.q.d.b.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class v
extends j
implements x,
k,
b.t.c.b.b.n.c.b.b {
    private final Class \u00d200000;

    public v(Class clazz) {
        this.\u00d200000 = clazz;
    }

    public final Class \u00d3\u00d20000() {
        return this.\u00d200000;
    }

    @Override
    public final int \u00d5O0000() {
        return this.\u00d200000.getModifiers();
    }

    public final List \u00f8o0000() {
        return c.\u00d6o0000(c.oo0000(c.\u00d5o0000(z.\u00f5\u00d20000(this.\u00d200000.getDeclaredClasses()), v$_c$0.\u00d5\u00d2\u00d5000), v$_c$1.\u00d4\u00d2\u00d5000));
    }

    @Override
    public final b.t.c.b.b.d.k Oo0000() {
        return e.\u00d200000(this.\u00d200000).\u00f400000();
    }

    public final v \u00d4\u00d20000() {
        Class<?> clazz = this.\u00d200000.getDeclaringClass();
        if (clazz != null) {
            Class<?> clazz2 = clazz;
            return new v(clazz2);
        }
        return null;
    }

    @Override
    public final Collection \u00d4o0000() {
        if (fc.o00000((Object)this.\u00d200000, Object.class)) {
            return mc.\u00d500000();
        }
        Object object = new b.o.d.b(2);
        Type type = this.\u00d200000.getGenericSuperclass();
        if (type == null) {
            type = (Type)((Object)Object.class);
        }
        ((b.o.d.b)object).super(type);
        ((b.o.d.b)object).\u00d200000(this.\u00d200000.getGenericInterfaces());
        b.o.d.b b2 = object;
        Object object2 = object = (Iterable)mc.new(b2.super(new Type[b2.super()]));
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (Type)object3;
            Object object4 = object;
            object4.add(new o((Type)object3));
        }
        return (List)object;
    }

    public final List o\u00d20000() {
        v v2 = this;
        return c.\u00d6o0000(c.\u00f5\u00d30000(c.nullnew(z.\u00f5\u00d20000(this.\u00d200000.getDeclaredMethods()), new v$_c$2(v2)), v$_d$2.O\u00f5\u00d3000));
    }

    private final boolean o00000(Method objectArray) {
        String string = objectArray.getName();
        if (fc.o00000((Object)string, (Object)"values")) {
            return ((Object[])objectArray.getParameterTypes()).length == 0;
        }
        if (fc.o00000((Object)string, (Object)"valueOf")) {
            Object[] objectArray2 = objectArray.getParameterTypes();
            Object[] objectArray3 = new Class[1];
            objectArray = objectArray3;
            objectArray3[0] = String.class;
            return Arrays.equals(objectArray2, objectArray);
        }
        return false;
    }

    public final List O\u00d20000() {
        return c.\u00d6o0000(c.\u00f5\u00d30000(c.\u00d5o0000(z.\u00f5\u00d20000(this.\u00d200000.getDeclaredFields()), v$_b$1.\u00f8\u00f4\u00d3000), v$_b$2.Stringclassnew));
    }

    public final List newnew() {
        return c.\u00d6o0000(c.\u00f5\u00d30000(c.\u00d5o0000(z.\u00f5\u00d20000(this.\u00d200000.getDeclaredConstructors()), v$_e$1.nullclassnew), v$_e$2.o\u00f5\u00d3000));
    }

    @Override
    public final boolean \u00f5o0000() {
        return false;
    }

    @Override
    public final b.t.c.b.b.n.c.b.k \u00f4o0000() {
        return null;
    }

    @Override
    public final f oO0000() {
        if (this.\u00d200000.isAnonymousClass()) {
            return f.\u00d300000(b.q.f.\u00d200000(this.\u00d200000.getName(), ".", null, 2, null));
        }
        return f.\u00d300000(this.\u00d200000.getSimpleName());
    }

    @Override
    public final List o00000() {
        Object object = this.\u00d200000.getTypeParameters();
        Object[] objectArray = object;
        object = new ArrayList(((Object[])object).length);
        for (Object object2 : objectArray) {
            object2 = (TypeVariable)object2;
            Object object3 = object;
            object3.add(new l((TypeVariable)object2));
        }
        return (List)object;
    }

    @Override
    public final boolean \u00f4O0000() {
        return this.\u00d200000.isInterface();
    }

    @Override
    public final boolean Stringsuper() {
        return this.\u00d200000.isAnnotation();
    }

    @Override
    public final boolean \u00d3o0000() {
        return this.\u00d200000.isEnum();
    }

    @Override
    public final boolean nullsuper() {
        Boolean bl = b.o00000.\u00d300000(this.\u00d200000);
        if (bl != null) {
            return bl;
        }
        return false;
    }

    @Override
    public final Collection oo0000() {
        Object[] objectArray = b.o00000.\u00d400000(this.\u00d200000);
        if (objectArray == null) {
            objectArray = new Object[]{};
        }
        Object object = objectArray;
        Object[] objectArray2 = objectArray;
        object = new ArrayList(((Object[])object).length);
        for (Object object2 : objectArray2) {
            Object object3 = object;
            object3.add(new m(object2));
        }
        return (List)object;
    }

    @Override
    public final boolean privatesuper() {
        Boolean bl = b.o00000.new(this.\u00d200000);
        if (bl != null) {
            return bl;
        }
        return false;
    }

    public final boolean equals(Object object) {
        return object instanceof v && fc.o00000((Object)this.\u00d200000, (Object)((v)object).\u00d200000);
    }

    public final int hashCode() {
        return this.\u00d200000.hashCode();
    }

    public final String toString() {
        return this.getClass().getName() + ": " + this.\u00d200000;
    }

    private static final boolean \u00d400000(Class clazz) {
        return ((CharSequence)clazz.getSimpleName()).length() == 0;
    }

    private static final f new(Class object) {
        Object object2 = f.super((String)(object = ((Class)object).getSimpleName())) ? object : null;
        if (object2 != null) {
            return f.\u00d300000((String)object2);
        }
        return null;
    }

    private static final boolean new(v v2, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        return !v2.\u00d3o0000() || !v2.o00000(method);
    }

    static /* synthetic */ boolean o00000(Class clazz) {
        return v.\u00d400000(clazz);
    }

    static /* synthetic */ f \u00d300000(Class clazz) {
        return v.new(clazz);
    }

    static /* synthetic */ boolean o00000(v v2, Method method) {
        return v.new(v2, method);
    }

    @Override
    public final List \u00d800000() {
        Object object = this.\u00f400000();
        if (object == null || (object = object.getDeclaredAnnotations()) == null || (object = s.o00000(object)) == null) {
            object = mc.\u00d500000();
        }
        return object;
    }

    @Override
    public final p new(b.t.c.b.b.d.k k2) {
        Annotation[] annotationArray = this.\u00f400000();
        if (annotationArray != null && (annotationArray = annotationArray.getDeclaredAnnotations()) != null) {
            return s.o00000(annotationArray, k2);
        }
        return null;
    }

    @Override
    public final boolean new() {
        return false;
    }

    @Override
    public final boolean OO0000() {
        return Modifier.isAbstract(this.\u00d5O0000());
    }

    @Override
    public final boolean \u00f800000() {
        return Modifier.isStatic(this.\u00d5O0000());
    }

    @Override
    public final boolean if() {
        return Modifier.isFinal(this.\u00d5O0000());
    }

    @Override
    public final ac \u00f500000() {
        int n2 = this.\u00d5O0000();
        if (Modifier.isPublic(n2)) {
            return d$_f.\u00f500000;
        }
        if (Modifier.isPrivate(n2)) {
            return d$_i.OO0000;
        }
        if (Modifier.isProtected(n2)) {
            if (Modifier.isStatic(n2)) {
                return b$_b.while;
            }
            return b$_d.\u00d400000;
        }
        return b$_c.\u00d300000;
    }
}

