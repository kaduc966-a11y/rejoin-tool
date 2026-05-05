/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.s.mc;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.hb;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k {
    private int o00000;
    private String \u00d300000;
    private int \u00d600000;
    private hb \u00d200000;
    private final List \u00d500000;
    private final List String;

    public k(int n2, String iterator, int n3, hb object) {
        this.o00000 = n2;
        this.\u00d300000 = iterator;
        this.\u00d600000 = n3;
        this.\u00d200000 = object;
        this.\u00d500000 = new ArrayList(1);
        Iterable iterable = f.o00000.Object();
        object = this;
        iterator = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object2 = iterator.next();
            object2 = (f)object2;
            Iterable iterable2 = iterable;
            iterable2.add(object2.\u00d200000());
        }
        ((k)object).String = (List)iterable;
    }

    public final int class() {
        return this.o00000;
    }

    public final void super(int n2) {
        this.o00000 = n2;
    }

    public final String \u00d300000() {
        return this.\u00d300000;
    }

    public final int \u00d600000() {
        return this.\u00d600000;
    }

    public final hb \u00d400000() {
        return this.\u00d200000;
    }

    public k(String string, int n2, hb hb2) {
        this(0, string, n2, hb2);
    }

    public final List \u00d200000() {
        return this.\u00d500000;
    }

    public final List super() {
        return this.String;
    }
}

