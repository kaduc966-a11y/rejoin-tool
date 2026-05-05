/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.s.mc;
import b.t.c.b.b.c.b.b.f;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    private int o00000;
    private final List \u00d500000;
    private final List \u00d300000;
    private final List \u00d400000;
    private final List new;

    public i(int n2) {
        this.o00000 = n2;
        this.\u00d500000 = new ArrayList();
        this.\u00d300000 = new ArrayList(0);
        this.\u00d400000 = new ArrayList(0);
        Iterable iterable = f.o00000.Object();
        i i2 = this;
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (f)object2;
            Iterable iterable2 = iterable;
            iterable2.add(object2.String());
        }
        i2.new = (List)iterable;
    }

    public final int Object() {
        return this.o00000;
    }

    public final void o00000(int n2) {
        this.o00000 = n2;
    }

    public i() {
        this(0);
    }

    public final List \u00d400000() {
        return this.\u00d500000;
    }

    public final List \u00d500000() {
        return this.\u00d300000;
    }

    public final List \u00d200000() {
        return this.\u00d400000;
    }

    public final List o00000() {
        return this.new;
    }
}

