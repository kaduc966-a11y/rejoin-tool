/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.d.fc;
import b.o.r;
import b.t.c.b.b.d.k;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.b.p;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public final class s {
    public static final List o00000(Annotation[] object) {
        Annotation[] annotationArray = object;
        object = new ArrayList(((Annotation[])object).length);
        for (Annotation annotation : annotationArray) {
            Object object2 = object;
            object2.add(new p(annotation));
        }
        return (List)object;
    }

    public static final p o00000(Annotation[] annotationArray, k k2) {
        Annotation annotation;
        block2: {
            for (Annotation annotation2 : annotationArray) {
                if (!fc.o00000((Object)e.\u00d200000(r.\u00d300000(r.o00000(annotation2))).\u00f400000(), (Object)k2)) continue;
                annotation = annotation2;
                break block2;
            }
            annotation = null;
        }
        if (annotation != null) {
            annotationArray = annotation;
            return new p((Annotation)annotationArray);
        }
        return null;
    }
}

