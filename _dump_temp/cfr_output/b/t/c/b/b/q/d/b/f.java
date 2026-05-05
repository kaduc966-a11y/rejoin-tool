/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.s.mc;
import b.s.z;
import b.t.c.b.b.n.c.b.x;
import b.t.c.b.b.q.d.b.l;
import b.t.c.b.b.q.d.b.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public final class f
extends r
implements x {
    private final Constructor \u00d300000;

    public f(Constructor constructor) {
        this.\u00d300000 = constructor;
    }

    public final Constructor \u00f4\u00d20000() {
        return this.\u00d300000;
    }

    @Override
    public final List \u00d8\u00d20000() {
        Object[] objectArray = this.\u00f4\u00d20000().getGenericParameterTypes();
        if (objectArray.length == 0) {
            return mc.\u00d500000();
        }
        Annotation[][] annotationArray = this.\u00f4\u00d20000().getDeclaringClass();
        objectArray = annotationArray.getDeclaringClass() != null && !Modifier.isStatic(annotationArray.getModifiers()) ? (Type[])z.\u00d300000(objectArray, 1, objectArray.length) : objectArray;
        annotationArray = this.\u00f4\u00d20000().getParameterAnnotations();
        if (((Object[])annotationArray).length < objectArray.length) {
            throw new IllegalStateException("Illegal generic signature: " + this.\u00f4\u00d20000());
        }
        annotationArray = ((Object[])annotationArray).length > objectArray.length ? (Annotation[][])z.\u00d300000((Object[])annotationArray, ((Object[])annotationArray).length - objectArray.length, ((Object[])annotationArray).length) : annotationArray;
        return this.o00000((Type[])objectArray, annotationArray, this.\u00f4\u00d20000().isVarArgs());
    }

    @Override
    public final List o00000() {
        Object object = this.\u00f4\u00d20000().getTypeParameters();
        Object[] objectArray = object;
        object = new ArrayList(((Object[])object).length);
        for (Object object2 : objectArray) {
            object2 = (TypeVariable)object2;
            Object object3 = object;
            object3.add(new l((TypeVariable)object2));
        }
        return (List)object;
    }
}

