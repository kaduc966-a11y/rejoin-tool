/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.d.w;
import b.t.c.b.b.q.d.b.ab;
import b.t.c.b.b.q.d.b.bb;
import b.t.c.b.b.q.d.b.c;
import b.t.c.b.b.q.d.b.db;
import b.t.c.b.b.q.d.b.o;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class ab$_b {
    private ab$_b() {
    }

    public final ab o00000(Type type) {
        if (type instanceof Class && ((Class)type).isPrimitive()) {
            return new c((Class)type);
        }
        if (type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray()) {
            return new db(type);
        }
        if (type instanceof WildcardType) {
            return new bb((WildcardType)type);
        }
        return new o(type);
    }

    public /* synthetic */ ab$_b(w w2) {
        this();
    }
}

