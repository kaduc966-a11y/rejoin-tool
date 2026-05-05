/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

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
import b.t.c.b.b.q.d.b.ab;
import b.t.c.b.b.q.d.b.j;
import b.t.c.b.b.q.d.b.k;
import b.t.c.b.b.q.d.b.p;
import b.t.c.b.b.q.d.b.q;
import b.t.c.b.b.q.d.b.s;
import b.t.c.b.b.q.d.b.v;
import b.t.c.b.b.q.d.b.w;
import b.t.c.b.b.q.d.b.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class r
extends j
implements x,
k,
b.t.c.b.b.n.c.b.w {
    public abstract Member \u00d5\u00d20000();

    @Override
    public AnnotatedElement \u00f400000() {
        return (AnnotatedElement)((Object)this.\u00d5\u00d20000());
    }

    @Override
    public int \u00d5O0000() {
        return this.\u00d5\u00d20000().getModifiers();
    }

    @Override
    public f oO0000() {
        Object object = this.\u00d5\u00d20000().getName();
        if (object == null || (object = f.\u00d300000((String)object)) == null) {
            object = b.t.c.b.b.d.j.\u00d4O0000;
        }
        return object;
    }

    public v returnnew() {
        return new v(this.\u00d5\u00d20000().getDeclaringClass());
    }

    protected final List o00000(Type[] typeArray, Annotation[][] annotationArray, boolean bl) {
        ArrayList<q> arrayList = new ArrayList<q>(typeArray.length);
        List list = w.\u00d200000.\u00d200000(this.\u00d5\u00d20000());
        int n2 = list != null ? list.size() - typeArray.length : 0;
        int n3 = typeArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            String string;
            ab ab2 = ab.oO0000.o00000(typeArray[i2]);
            List list2 = list;
            if (list2 != null) {
                string = (String)mc.\u00f400000(list2, i2 + n2);
                if (string == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + n2 + " (name=" + this.oO0000() + " type=" + ab2 + ") in " + this).toString());
                }
            } else {
                string = null;
            }
            String string2 = string;
            boolean bl2 = bl && i2 == z.\u00f6\u00d20000(typeArray);
            arrayList.add(new q(ab2, annotationArray[i2], string2, bl2));
        }
        return arrayList;
    }

    public boolean equals(Object object) {
        return object instanceof r && fc.o00000((Object)this.\u00d5\u00d20000(), (Object)((r)object).\u00d5\u00d20000());
    }

    public int hashCode() {
        return this.\u00d5\u00d20000().hashCode();
    }

    public String toString() {
        return this.getClass().getName() + ": " + this.\u00d5\u00d20000();
    }

    @Override
    public List \u00d800000() {
        Object object = this.\u00f400000();
        if (object == null || (object = object.getDeclaredAnnotations()) == null || (object = s.o00000(object)) == null) {
            object = mc.\u00d500000();
        }
        return object;
    }

    @Override
    public p new(b.t.c.b.b.d.k k2) {
        Annotation[] annotationArray = this.\u00f400000();
        if (annotationArray != null && (annotationArray = annotationArray.getDeclaredAnnotations()) != null) {
            return s.o00000(annotationArray, k2);
        }
        return null;
    }

    @Override
    public boolean new() {
        return false;
    }

    @Override
    public boolean OO0000() {
        return Modifier.isAbstract(this.\u00d5O0000());
    }

    @Override
    public boolean \u00f800000() {
        return Modifier.isStatic(this.\u00d5O0000());
    }

    @Override
    public boolean if() {
        return Modifier.isFinal(this.\u00d5O0000());
    }

    @Override
    public ac \u00f500000() {
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

