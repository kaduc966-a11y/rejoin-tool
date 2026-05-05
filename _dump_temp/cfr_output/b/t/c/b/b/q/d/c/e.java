/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.c;

import b.o.d.fc;
import b.o.r;
import b.s.z;
import b.t.c.b.b.b.c.f;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.d;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_c;
import b.t.c.b.b.n.b.j$_d;
import b.t.c.b.b.n.b.j$_e;
import b.t.c.b.b.n.b.j$_f;
import b.t.c.b.b.o.c.o;
import b.t.c.b.b.q.d.c.g;
import b.t.c.b.b.q.d.c.i;
import b.t.c.b.b.q.d.c.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class e {
    public static final e super = new e();

    private e() {
    }

    public final void o00000(Class annotationArray, j$_d j$_d) {
        for (Annotation annotation : annotationArray.getDeclaredAnnotations()) {
            this.o00000(j$_d, annotation);
        }
        j$_d.super();
    }

    public final void Object(Class clazz, j$_e j$_e) {
        this.o00000(clazz, j$_e);
        this.\u00d400000(clazz, j$_e);
        this.\u00d200000(clazz, j$_e);
    }

    private final void o00000(Class methodArray, j$_e j$_e) {
        for (Method method : methodArray.getDeclaredMethods()) {
            j$_c j$_c;
            if (j$_e.super(b.t.c.b.b.d.f.\u00d300000(method.getName()), i.o00000.o00000(method)) == null) continue;
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                this.o00000(j$_c, annotation);
            }
            Annotation[] annotationArray = method.getParameterAnnotations();
            int n2 = ((Object[])annotationArray).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = i2;
                for (Annotation annotation : annotationArray[i2]) {
                    j$_b j$_b;
                    Class clazz = r.\u00d300000(r.o00000(annotation));
                    if (j$_c.super(n3, b.t.c.b.b.q.d.b.e.\u00d200000(clazz), new g(annotation)) == null) continue;
                    super.o00000(j$_b, annotation, clazz);
                }
            }
            j$_c.super();
        }
    }

    private final void \u00d400000(Class constructorArray, j$_e j$_e) {
        for (Constructor<?> constructor : constructorArray.getDeclaredConstructors()) {
            j$_c j$_c;
            if (j$_e.super(b.t.c.b.b.d.j.\u00d300000, i.o00000.o00000(constructor)) == null) continue;
            for (Annotation annotation : constructor.getDeclaredAnnotations()) {
                this.o00000(j$_c, annotation);
            }
            Annotation[] annotationArray = constructor.getParameterAnnotations();
            if (!(((Object[])annotationArray).length == 0)) {
                int n2 = constructor.getParameterTypes().length - ((Object[])annotationArray).length;
                Annotation[] annotationArray2 = annotationArray;
                int n3 = ((Object[])annotationArray2).length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    int n4 = i2;
                    for (Annotation annotation : annotationArray2[i2]) {
                        Class clazz = r.\u00d300000(r.o00000(annotation));
                        j$_b j$_b = j$_c.super(n4 + n2, b.t.c.b.b.q.d.b.e.\u00d200000(clazz), new g(annotation));
                        if (j$_b == null) continue;
                        super.o00000(j$_b, annotation, clazz);
                    }
                }
            }
            j$_c.super();
        }
    }

    private final void \u00d200000(Class fieldArray, j$_e j$_e) {
        for (Field field : fieldArray.getDeclaredFields()) {
            j$_d j$_d;
            if (j$_e.super(b.t.c.b.b.d.f.\u00d300000(field.getName()), i.o00000.o00000(field), null) == null) continue;
            for (Annotation annotation : field.getDeclaredAnnotations()) {
                this.o00000(j$_d, annotation);
            }
            j$_d.super();
        }
    }

    private final void o00000(j$_d object, Annotation annotation) {
        Class clazz = r.\u00d300000(r.o00000(annotation));
        j$_b j$_b = object.super(b.t.c.b.b.q.d.b.e.\u00d200000(clazz), new g(annotation));
        if (j$_b != null) {
            object = j$_b;
            super.o00000((j$_b)object, annotation, clazz);
            return;
        }
    }

    private final void o00000(j$_b j$_b, Annotation annotation, Class methodArray) {
        for (Method method : methodArray.getDeclaredMethods()) {
            Object object;
            try {
                object = method.invoke((Object)annotation, new Object[0]);
            }
            catch (IllegalAccessException illegalAccessException) {
                continue;
            }
            this.o00000(j$_b, b.t.c.b.b.d.f.\u00d300000(method.getName()), object);
        }
        j$_b.super();
    }

    private final o o00000(Class object) {
        int n2 = 0;
        while (((Class)object).isArray()) {
            ++n2;
            object = ((Class)object).getComponentType();
        }
        if (((Class)object).isPrimitive()) {
            if (fc.o00000(object, Void.TYPE)) {
                return new o(d.String.o00000(d$_b.\u00d3\u00d80000.super()), n2);
            }
            object = b.t.c.b.b.o.h.e.o00000(((Class)object).getName()).new();
            if (n2 > 0) {
                return new o(d.String.o00000(((b.t.c.b.b.b.j)((Object)object)).new()), n2 - 1);
            }
            return new o(d.String.o00000(((b.t.c.b.b.b.j)((Object)object)).\u00d300000()), n2);
        }
        Object object2 = f.\u00f500000.o00000(((d)(object = b.t.c.b.b.q.d.b.e.\u00d200000(object))).\u00f400000());
        if (object2 == null) {
            object2 = object;
        }
        object = object2;
        return new o((d)object, n2);
    }

    private final void o00000(j$_b objectArray, b.t.c.b.b.d.f objectArray2, Object object) {
        Class<?> clazz = object.getClass();
        if (fc.o00000(clazz, Class.class)) {
            objectArray.super((b.t.c.b.b.d.f)objectArray2, this.o00000((Class)object));
            return;
        }
        if (j.o00000().contains(clazz)) {
            objectArray.super((b.t.c.b.b.d.f)objectArray2, object);
            return;
        }
        if (b.t.c.b.b.q.d.b.e.\u00d600000(clazz)) {
            d d2 = b.t.c.b.b.q.d.b.e.\u00d200000(clazz.isEnum() ? clazz : clazz.getEnclosingClass());
            objectArray.super((b.t.c.b.b.d.f)objectArray2, d2, b.t.c.b.b.d.f.\u00d300000(((Enum)object).name()));
            return;
        }
        if (Annotation.class.isAssignableFrom(clazz)) {
            Class clazz2 = (Class)z.\u00f6O0000(clazz.getInterfaces());
            j$_b j$_b = objectArray.super((b.t.c.b.b.d.f)objectArray2, b.t.c.b.b.q.d.b.e.\u00d200000(clazz2));
            if (j$_b == null) {
                return;
            }
            clazz = j$_b;
            this.o00000((j$_b)((Object)clazz), (Annotation)object, clazz2);
            return;
        }
        if (clazz.isArray()) {
            j$_f j$_f = objectArray.super((b.t.c.b.b.d.f)objectArray2);
            if (j$_f == null) {
                return;
            }
            j$_f j$_f2 = j$_f;
            if ((clazz = clazz.getComponentType()).isEnum()) {
                objectArray = b.t.c.b.b.q.d.b.e.\u00d200000(clazz);
                for (Object object2 : (Object[])object) {
                    j$_f2.o00000((d)objectArray, b.t.c.b.b.d.f.\u00d300000(((Enum)object2).name()));
                }
            } else if (fc.o00000((Object)clazz, Class.class)) {
                for (Object object3 : (Object[])object) {
                    j$_f2.o00000(this.o00000((Class)object3));
                }
            } else if (Annotation.class.isAssignableFrom(clazz)) {
                for (Object object4 : (Object[])object) {
                    j$_b j$_b;
                    if (j$_f2.o00000(b.t.c.b.b.q.d.b.e.\u00d200000(clazz)) == null) continue;
                    this.o00000(j$_b, (Annotation)object4, clazz);
                }
            } else {
                for (Object object5 : (Object[])object) {
                    j$_f2.o00000(object5);
                }
            }
            j$_f2.o00000();
            return;
        }
        throw new UnsupportedOperationException("Unsupported annotation argument value (" + clazz + "): " + object);
    }
}

