/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.o.d.ib;
import b.o.e.h;
import b.t.c.b.b.i.f;
import b.t.c.b.b.i.k;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.e.o;
import b.t.m;
import java.util.Iterator;
import java.util.List;

public class e
implements o {
    static final /* synthetic */ m[] \u00f5o\u00f6000;
    private final f \u00f4o\u00f6000;

    public e(l l2, h h2) {
        this.\u00f4o\u00f6000 = l2.o00000(h2);
    }

    private final List thisclassnew() {
        return (List)k.o00000(this.\u00f4o\u00f6000, (Object)this, \u00f5o\u00f6000[0]);
    }

    @Override
    public boolean \u00d5\u00f4\u00d3000() {
        return this.thisclassnew().isEmpty();
    }

    public Iterator iterator() {
        return this.thisclassnew().iterator();
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new ib(e.class, "annotations", "getAnnotations()Ljava/util/List;", 0);
        \u00f5o\u00f6000 = mArray2;
    }
}

