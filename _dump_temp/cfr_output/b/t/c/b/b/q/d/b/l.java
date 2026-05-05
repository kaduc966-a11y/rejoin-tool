/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.ab;
import b.t.c.b.b.q.d.b.j;
import b.t.c.b.b.q.d.b.o;
import b.t.c.b.b.q.d.b.p;
import b.t.c.b.b.q.d.b.s;
import b.t.c.b.b.q.d.b.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class l
extends j
implements x,
ab {
    private final TypeVariable o00000;

    public l(TypeVariable typeVariable) {
        this.o00000 = typeVariable;
    }

    public final List \u00d8O0000() {
        Object object = this.o00000.getBounds();
        Object[] objectArray = object;
        object = new ArrayList(((Object[])object).length);
        for (Object object2 : objectArray) {
            object2 = (Type)object2;
            Object object3 = object;
            object3.add(new o((Type)object2));
        }
        object = (List)object;
        o o2 = (o)mc.\u00d8O0000((List)object);
        if (fc.o00000((Object)(o2 != null ? o2.newString() : null), Object.class)) {
            return mc.\u00d500000();
        }
        return object;
    }

    @Override
    public final AnnotatedElement \u00f400000() {
        TypeVariable typeVariable = this.o00000;
        if (typeVariable instanceof AnnotatedElement) {
            return typeVariable;
        }
        return null;
    }

    @Override
    public final f oO0000() {
        return f.\u00d300000(this.o00000.getName());
    }

    public final boolean equals(Object object) {
        return object instanceof l && fc.o00000((Object)this.o00000, (Object)((l)object).o00000);
    }

    public final int hashCode() {
        return this.o00000.hashCode();
    }

    public final String toString() {
        return this.getClass().getName() + ": " + this.o00000;
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
    public final p new(k k2) {
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
}

