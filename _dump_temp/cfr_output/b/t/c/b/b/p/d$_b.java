/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.d;
import b.t.c.b.b.p.d$_e;
import b.t.c.b.b.p.i$_b;
import b.t.c.b.b.p.i$_c;
import b.t.c.b.b.p.t$_c;
import b.t.c.b.b.p.v;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d$_b {
    final v return;
    final Object new;
    final v \u00d300000;
    final d$_e \u00d500000;
    final Class o00000;
    final Method \u00d400000;

    d$_b(v v2, Object object, v v3, d$_e d$_e, Class clazz) {
        if (v2 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (d$_e.\u00d500000() == i$_b.o00000 && v3 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.return = v2;
        this.new = object;
        this.\u00d300000 = v3;
        this.\u00d500000 = d$_e;
        this.o00000 = clazz;
        if (t$_c.class.isAssignableFrom(clazz)) {
            this.\u00d400000 = d.super(clazz, "valueOf", Integer.TYPE);
            return;
        }
        this.\u00d400000 = null;
    }

    public v o00000() {
        return this.return;
    }

    public int new() {
        return this.\u00d500000.Object();
    }

    public v \u00d300000() {
        return this.\u00d300000;
    }

    Object new(Object iterator) {
        if (this.\u00d500000.\u00d200000()) {
            if (this.\u00d500000.o00000() == i$_c.o00000) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (Object e2 : (List)((Object)iterator)) {
                    arrayList.add(this.\u00d300000(e2));
                }
                return arrayList;
            }
            return iterator;
        }
        return this.\u00d300000(iterator);
    }

    Object \u00d300000(Object object) {
        if (this.\u00d500000.o00000() == i$_c.o00000) {
            return d.super(this.\u00d400000, null, (Integer)object);
        }
        return object;
    }

    Object o00000(Object iterator) {
        if (this.\u00d500000.\u00d200000()) {
            if (this.\u00d500000.o00000() == i$_c.o00000) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (Object e2 : (List)((Object)iterator)) {
                    arrayList.add(this.\u00d400000(e2));
                }
                return arrayList;
            }
            return iterator;
        }
        return this.\u00d400000(iterator);
    }

    Object \u00d400000(Object object) {
        if (this.\u00d500000.o00000() == i$_c.o00000) {
            return ((t$_c)object).super();
        }
        return object;
    }
}

