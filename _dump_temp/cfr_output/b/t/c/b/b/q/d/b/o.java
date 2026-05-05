/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.s.mc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.c;
import b.t.c.b.b.n.c.b.cb;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.q.d.b.ab;
import b.t.c.b.b.q.d.b.ab$_b;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.b.l;
import b.t.c.b.b.q.d.b.v;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class o
extends ab
implements c {
    private final Type returnsuper;
    private final cb oo0000;

    public o(Type object) {
        cb cb2;
        this.returnsuper = object;
        object = this;
        o o2 = object;
        object = ((o)object).newString();
        Type type = object;
        if (object instanceof Class) {
            cb2 = new v((Class)object);
        } else if (type instanceof TypeVariable) {
            cb2 = new l((TypeVariable)object);
        } else if (type instanceof ParameterizedType) {
            cb2 = new v((Class)((ParameterizedType)object).getRawType());
        } else {
            throw new IllegalStateException("Not a classifier type (" + object.getClass() + "): " + object);
        }
        o2.oo0000 = cb2;
    }

    @Override
    public final Type newString() {
        return this.returnsuper;
    }

    @Override
    public final cb O\u00d50000() {
        return this.oo0000;
    }

    @Override
    public final String privateObject() {
        throw new UnsupportedOperationException("Type not found: " + this.newString());
    }

    @Override
    public final String \u00f5\u00d40000() {
        return this.newString().toString();
    }

    @Override
    public final boolean \u00f8\u00d40000() {
        Type type = this.newString();
        return type instanceof Class && !(((Object[])((Class)type).getTypeParameters()).length == 0);
    }

    @Override
    public final List o\u00d50000() {
        Iterable iterable = e.o00000(this.newString());
        ab$_b ab$_b = ab.oO0000;
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (Type)object2;
            Iterable iterable2 = iterable;
            iterable2.add(ab$_b.o00000((Type)object2));
        }
        return (List)iterable;
    }

    @Override
    public final Collection \u00d300000() {
        return mc.\u00d500000();
    }

    @Override
    public final q o00000(k k2) {
        return null;
    }

    @Override
    public final boolean new() {
        return false;
    }
}

