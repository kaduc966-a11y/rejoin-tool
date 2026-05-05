/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.d;

import b.s.mc;
import b.s.ub;
import b.t.c.b.b.h.d.d;
import b.t.c.b.b.h.d.f;
import b.t.c.b.b.h.d.g;
import b.t.c.b.b.h.d.h;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.j.b.e;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.q.kb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b
implements b.t.c.b.b.o.e.f {
    private final d \u00d200000;
    private final String Object;

    public b(d d2, String ... stringArray) {
        this.\u00d200000 = d2;
        String[] stringArray2 = Arrays.copyOf(stringArray, stringArray.length);
        this.Object = String.format(this.\u00d200000.super(), Arrays.copyOf(stringArray2, stringArray2.length));
    }

    protected final String \u00d400000() {
        return this.Object;
    }

    @Override
    public kb \u00d200000(b.t.c.b.b.d.f f2, e object) {
        object = h.null.\u00d200000();
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = f2;
        return new f(b.t.c.b.b.d.f.\u00d400000(String.format((String)object, Arrays.copyOf(objectArray2, objectArray2.length))));
    }

    public Set class(b.t.c.b.b.d.f f2, e e2) {
        return k.\u00d400000.\u00d500000();
    }

    public Set \u00d600000(b.t.c.b.b.d.f f2, e e2) {
        return ub.super((Object)new g(k.\u00d400000.new()));
    }

    @Override
    public Collection super(j j2, b.o.e.g g2) {
        return mc.\u00d500000();
    }

    @Override
    public Set super() {
        return ub.\u00d300000();
    }

    @Override
    public Set \u00d300000() {
        return ub.\u00d300000();
    }

    @Override
    public Set \u00d200000() {
        return ub.\u00d300000();
    }

    @Override
    public void super(b.t.c.b.b.d.f f2, e e2) {
    }

    public String toString() {
        return "ErrorScope{" + this.Object + '}';
    }
}

