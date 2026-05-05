/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.o.d.fc;
import b.s.mc;
import b.t.bb;
import b.t.c;
import b.t.d;
import b.t.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class ab
implements TypeVariable,
c {
    private final bb \u00f500000;

    public ab(bb bb2) {
        this.\u00f500000 = bb2;
    }

    @Override
    public final String getName() {
        return this.\u00f500000.\u00f5\u00d4o000();
    }

    public final GenericDeclaration getGenericDeclaration() {
        throw new UnsupportedOperationException("getGenericDeclaration() is not supported for type variables created from KType: " + this.\u00f500000 + ".\nUpdate kotlin-reflect dependency to 2.3.20+.");
    }

    @Override
    public final Type[] getBounds() {
        Iterable iterable = this.\u00f500000.\u00f4\u00d4o000();
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (u)object2;
            Iterable iterable2 = iterable;
            iterable2.add(d.o00000(object2, true));
        }
        return ((Collection)((List)iterable)).toArray(new Type[0]);
    }

    @Override
    public final String getTypeName() {
        return this.getName();
    }

    public final boolean equals(Object object) {
        return object instanceof TypeVariable && fc.o00000((Object)this.getName(), (Object)((TypeVariable)object).getName()) && fc.o00000((Object)this.getGenericDeclaration(), ((TypeVariable)object).getGenericDeclaration());
    }

    public final int hashCode() {
        return this.getName().hashCode() ^ this.getGenericDeclaration().hashCode();
    }

    public final String toString() {
        return this.getTypeName();
    }

    public final Annotation getAnnotation(Class clazz) {
        return null;
    }

    @Override
    public final Annotation[] getAnnotations() {
        return new Annotation[0];
    }

    @Override
    public final Annotation[] getDeclaredAnnotations() {
        return new Annotation[0];
    }
}

